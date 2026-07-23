Git Ignore Configuration Guide

mkdir logs
touch app.log error.log logs/server.log

echo "*.log" >> .gitignore
echo "logs/" >> .gitignore

git status --ignored

git add .gitignore
git commit -m "Add gitignore rules"
git push origin main
