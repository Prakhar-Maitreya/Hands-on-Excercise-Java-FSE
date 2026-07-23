import React from 'react';

function IndianPlayers({ players }) {
  const filtered = players.filter(p => p.score >= 70);
  return (
    <div>
      <h2>High Performing Players</h2>
      <ul>
        {filtered.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
