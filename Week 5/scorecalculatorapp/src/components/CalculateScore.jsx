import React from 'react';

function CalculateScore({ Name, School, Total, goal }) {
  const tot = parseFloat(Total);
  const g = parseFloat(goal);
  const avg = (!isNaN(tot) && !isNaN(g) && g > 0) ? (tot / g).toFixed(2) : 'N/A';

  return (
    <div>
      <h2>Student Score Summary</h2>
      <p>Name: {Name}</p>
      <p>School: {School}</p>
      <p>Total: {Total}</p>
      <p>Goal: {goal}</p>
      <p>Average: {avg}</p>
    </div>
  );
}

export default CalculateScore;
