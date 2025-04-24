INSERT INTO apps(name, url, image, type)
VALUES ('Proxmox VE', 'http://10.0.0.5:8006', 'https://10.0.0.243/index.php/s/MGLbdrwHFKcFbPa', 'HOST'),
       ('Proxmox Netdata', 'http://10.0.0.5:19999', 'https://10.0.0.243/index.php/s/wyeYHkA9Q3wL6S9', 'HOST'),

       -- LXCs
       ('docker', '10.0.0.200', 'https://10.0.0.243/index.php/s/RGwewSHs8QdNDLS', 'LXC'),
       ('NPM Plus', 'http://10.0.0.201:81', 'https://10.0.0.243/index.php/s/Kf5L3cCH6yjtSef', 'LXC'),
       ('Dashy', 'http://10.0.0.202:4000', 'https://10.0.0.243/index.php/s/LNLgWZoDBQrcb5x', 'LXC'),
       ('Uptimekuma', 'http://10.0.0.203:3001', 'https://10.0.0.243/index.php/s/onJbAEXXmdgjZ6T', 'LXC'),
       ('Cockpit', 'http://10.0.0.204:9090', 'https://10.0.0.243/index.php/s/MBkZ5dDWi39Qy3q', 'LXC'),
       ('dockge', 'http://10.0.0.205:5001', 'https://10.0.0.243/index.php/s/2T4zoTktEyd9Lc6', 'LXC'),
       ('Tailscale', '10.0.0.206', 'https://10.0.0.243/index.php/s/2eTexFnxDtCwPTs', 'LXC'),
       ('homebridge', 'http://10.0.0.207:8581', 'https://10.0.0.243/index.php/s/LkCZrAWwQBjjxZn', 'LXC'),
       ('duc', '10.0.0.208', 'https://10.0.0.243/index.php/s/ssBmNyzaHcpi5CE', 'LXC'),
       ('Crafty-Controller', 'https://10.0.0.209:8443', 'https://10.0.0.243/index.php/s/t4J93x8c6EZ8CZE', 'LXC'),
       ('Cosmos', 'http://10.0.0.210:80', 'https://10.0.0.243/index.php/s/Ea4gr982KMH3TC8', 'LXC'),
       ('Homer', 'http://10.0.0.211:8010', 'https://10.0.0.243/index.php/s/oBtLoTWJdRXdxd7', 'LXC'),
       ('Nginx', '10.0.0.212', 'https://10.0.0.243/index.php/s/QnammiCwPZQZLcM', 'LXC'),
       ('Netbox', 'https://10.0.0.213', 'https://10.0.0.243/index.php/s/TcHHn7Gek88GkWe', 'LXC'),

       -- VMs
       ('Home Assistant', 'http://10.0.0.240:8123', 'https://10.0.0.243/index.php/s/WFRr8W6eQoinjWB', 'VM'),
       ('Ubuntu Desktop', '10.0.0.241', 'https://10.0.0.243/index.php/s/5By9wTcw3pdqZ9n', 'VM'),
       ('Ubuntu (Minecraft)', '10.0.0.242', 'https://10.0.0.243/index.php/s/d3bm7dXqRjcnWf6', 'VM'),
       ('Nextcloud', 'http://10.0.0.243', 'https://10.0.0.243/index.php/s/YQiJ2cYMixCazoa', 'VM');