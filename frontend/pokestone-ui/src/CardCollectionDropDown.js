import React from 'react';

import './index.css';

class CardCollectionDropDown extends React.Component {
  render() {
    return (
    	<div id="CardCollectionToolbar">
			<ul>
			  <li>Trainer</li>
			  <li>BugCatcher</li>
			  <li>Swimmer</li>
			</ul>
			        <button> Filters </button>
        <button> Crafting </button>
			</div>
    );
  }
}


export default CardCollectionDropDown;