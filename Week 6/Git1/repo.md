Git Initial Setup Commands

git config --global user.name "Student User"
git config --global user.email "student@example.com"

mkdir MyProject
cd MyProject
git init

echo "# My Project" > README.md
git add README.md
git commit -m "Initial commit"

git status
git log
