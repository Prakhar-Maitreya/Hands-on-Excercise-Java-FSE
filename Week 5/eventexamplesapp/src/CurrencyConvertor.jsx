import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amt, setAmt] = useState('');
  const [res, setRes] = useState('');

  const handleConvert = (e) => {
    e.preventDefault();
    const val = parseFloat(amt);
    if (!isNaN(val)) {
      setRes(val * 83.0);
    }
  };

  return (
    <div>
      <h2>Currency Convertor (USD to INR)</h2>
      <form onSubmit={handleConvert}>
        <input
          type="number"
          value={amt}
          onChange={(e) => setAmt(e.target.value)}
          placeholder="Amount in USD"
        />
        <button type="submit">Convert</button>
      </form>
      {res && <p>Converted Amount: ₹{res}</p>}
    </div>
  );
}

export default CurrencyConvertor;
