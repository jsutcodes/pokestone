import React from 'react';

// import Button from 'react-bootstrap/Button';

import './index.css';


class Card extends React.Component {
	constructor(props) {
		super(props);
	}

  render() {
    return (
        <div className="cardItem"> 

            <header class="name"> {this.props.name} - {this.props.cost} </header>
			<p> Cost: {this.props.text}</p>
		<footer> <h5> {this.props.attack}</h5><h5>{this.props.health}</h5></footer>
        </div>
    );
  }
}


export default Card;