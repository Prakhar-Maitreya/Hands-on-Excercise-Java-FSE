import React, { useState } from 'react';
import CalculateScore from './components/CalculateScore';

function App() {
  const [name, setName] = useState('');
  const [school, setSchool] = useState('');
  const [total, setTotal] = useState('');
  const [goal, setGoal] = useState('');

  return (
    <div>
      <h1>Student Management Portal</h1>
      <input type="text" placeholder="Name" value={name} onChange={e => setName(e.target.value)} />
      <input type="text" placeholder="School" value={school} onChange={e => setSchool(e.target.value)} />
      <input type="number" placeholder="Total" value={total} onChange={e => setTotal(e.target.value)} />
      <input type="number" placeholder="Goal" value={goal} onChange={e => setGoal(e.target.value)} />
      <CalculateScore Name={name} School={school} Total={total} goal={goal} />
    </div>
  );
}

export default App;
