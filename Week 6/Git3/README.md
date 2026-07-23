Git Branching and Merging Guide

git branch feature-branch
git checkout feature-branch

echo "New feature content" >> feature.txt
git add feature.txt
git commit -m "Add new feature"

git checkout main
git merge feature-branch

git branch -d feature-branch
