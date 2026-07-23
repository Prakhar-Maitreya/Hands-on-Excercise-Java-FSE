import React from 'react';

function Cart(props) {
  return (
    <div>
      <h2>Shopping Cart</h2>
      <p>Item: {props.item}</p>
      <p>Price: ${props.price}</p>
    </div>
  );
}

export default Cart;
