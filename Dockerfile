FROM babashka/babashka:latest

WORKDIR app
COPY . .

ENTRYPOINT bb -cp deps.jar --main core
