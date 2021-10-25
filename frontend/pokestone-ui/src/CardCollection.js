import React from 'react';

// import Button from 'react-bootstrap/Button';

import './index.css';

import CardCollectionDropDown from './CardCollectionDropDown.js'
import CardList from './CardList.js'


class CardCollection extends React.Component {
  render() {
    return (
      <div className="CardCollection">
        <CardCollectionDropDown />
        <CardList />

      </div>
    );
  }
}


export default CardCollection;