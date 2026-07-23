import React from 'react';

function ListofPlayers({ players }) {
  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} - Score: {p.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
