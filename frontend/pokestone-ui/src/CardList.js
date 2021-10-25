import React from 'react';

// import Button from 'react-bootstrap/Button';

import './index.css';

import Card from './Card.js';


class CardList extends React.Component {
	constructor(props) {
		super(props);

		// const cards = props.cards;
		this.state = {
			cards: []
		}
	}

	componentDidMount() { 
		fetch("http://localhost:8080/api/cards/v1.0")
			.then(response => response.json())
			.then((result) => {
				console.log(result);
				this.setState({
					cards: result
				})
			})
		}

  renderCards = () => {
  	const cards = Object.values(this.state.cards);
  	return cards.map(card => <Card id={card.name} name={card.name} cost={card.cost}  text={card.text} health={card.health} attack={card.attack} />);
  }

  render() {
    	return (
        	<div id="CardHolder"> {this.renderCards()} </div>
    	);
	}
}


export default CardList;