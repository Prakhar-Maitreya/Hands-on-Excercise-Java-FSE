import React from 'react';

function App() {
  const spaces = [
    { id: 1, name: 'Downtown Office', rent: 1200, address: '123 Main St' },
    { id: 2, name: 'Suburban Hub', rent: 800, address: '456 Oak Rd' }
  ];

  return (
    <div>
      <h1>Office Space Rental App</h1>
      <div>
        {spaces.map(s => (
          <div key={s.id} style={{ color: s.rent <= 1000 ? 'red' : 'green' }}>
            <h3>{s.name}</h3>
            <p>Address: {s.address}</p>
            <p>Rent: ${s.rent}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
