import React from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const list = [
    { name: 'Sachin', score: 95 },
    { name: 'Dhoni', score: 85 },
    { name: 'Rahul', score: 60 }
  ];

  return (
    <div>
      <h1>Cricket Application</h1>
      <ListofPlayers players={list} />
      <IndianPlayers players={list} />
    </div>
  );
}

export default App;
