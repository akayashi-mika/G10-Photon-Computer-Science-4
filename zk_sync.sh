#!/usr/bin/env sh

# cd "/home/mitsuki/programming/Kodland-Notes"

git pull

if ["$(git status --porcelain | wc -l )"-eq 0]; then
    exit 0
fi

git pull
git add .
git commit -q -S -m "Last Sync: $(date +"%Y-%m-%d %H:%M:%S")"
git push -q origin main
