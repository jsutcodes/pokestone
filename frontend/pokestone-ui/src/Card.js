import React from 'react';

// import Button from 'react-bootstrap/Button';

import './index.css';


class Card extends React.Component {

	renderStarterPokemon() {
		return (
		<div className="cardItem"> 		
            <header className="name"> {this.props.name} - {this.props.cost} </header>
			<img class="cardImage" src={this.props.image}></img>
			<p> Cost: {this.props.text}</p>
		    <footer> <h5> {this.props.attack}</h5><h5>{this.props.health}</h5></footer>
        </div>
		);
	}

	renderCreatureCard() {

    return (
        <div className="cardItem"> 

            <header class="name"> {this.props.name} - {this.props.cost} </header>
			<p> Cost: {this.props.text}</p>
		<footer> <h5> {this.props.attack}</h5><h5>{this.props.health}</h5></footer>
        </div>
    );

	}

  render() {
  	var cardRender;
  	if(this.props.cardClass==="STARTER") {
  		cardRender = this.renderStarterPokemon();
  	} else if(this.props.cardClass==="CREATURE") {

  		cardRender = this.renderCreatureCard();
	} else {
		return null;
	}

	return cardRender;

  }
}


export default Card;