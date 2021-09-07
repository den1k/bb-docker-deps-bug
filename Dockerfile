FROM babashka/babashka:latest

WORKDIR app
COPY . .

ENTRYPOINT bb -cp $(cat .classpath) --main core
