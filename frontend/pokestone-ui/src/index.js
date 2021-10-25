import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

import CardCollection from './CardCollection.js';

class Game extends React.Component {
  render() {
    return (
      <div className="game">
      <div id="TitleDiv"> 
        <h1>PokeStone API</h1> 
      </div>
        <div className="game-board">
          <CardCollection />
        </div>
        <div className="game-info">
          <div>{/* status */}</div>
          <ol>{/* TODO */}</ol>
        </div>
      </div>
    );
  }
}

// ========================================

ReactDOM.render(
  <Game />,
  document.getElementById('root')
);

