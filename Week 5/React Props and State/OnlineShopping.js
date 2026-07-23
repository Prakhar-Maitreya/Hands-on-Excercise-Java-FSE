import React from 'react';
import Cart from './Cart';

function OnlineShopping() {
  return (
    <div>
      <h1>Online Shopping Portal</h1>
      <Cart item="Laptop" price={999} />
    </div>
  );
}

export default OnlineShopping;
