import React from 'react';
import Post from './Post';

function Posts() {
  const data = [
    { id: 1, title: 'First Post', body: 'This is the content of the first post.' },
    { id: 2, title: 'Second Post', body: 'This is the content of the second post.' }
  ];

  return (
    <div>
      <h2>Blog Posts</h2>
      {data.map(item => (
        <Post key={item.id} title={item.title} body={item.body} />
      ))}
    </div>
  );
}

export default Posts;
