FROM babashka/babashka:latest

WORKDIR app
COPY . .

ENTRYPOINT bb --main core
