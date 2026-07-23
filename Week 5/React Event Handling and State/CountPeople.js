import React, { useState } from 'react';

function CountPeople() {
  const [entry, setEntry] = useState(0);
  const [exit, setExit] = useState(0);

  const updateEntry = () => {
    setEntry(entry + 1);
  };

  const updateExit = () => {
    setExit(exit + 1);
  };

  return (
    <div>
      <h2>Mall People Count</h2>
      <button onClick={updateEntry}>Login / Enter</button>
      <button onClick={updateExit}>Exit</button>
      <p>People Entered: {entry}</p>
      <p>People Exited: {exit}</p>
    </div>
  );
}

export default CountPeople;
