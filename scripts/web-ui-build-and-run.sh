gnome-terminal --title=$(basename "$0") -e 'bash -c "

cd ../src/WebUI
npm install && npm start

exec bash"'
