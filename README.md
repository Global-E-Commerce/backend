# Installation

## Words of Caution
We have the following services running inside docker containers:
- redis: port 6379
- zookeeper: port 2181
- kafka: port 9092
- redisInsight: port 8001

Make sure there's no local service running on these ports. (i.e, use `brew services stop [SERVICE-NAME]` to stop a local service on Mac)

The spring application is running on port 8080.

## Installation

### Step 1:
clone this git repository.

### Step 2:
i). Make sure docker is running.

ii). 
```bash
docker-compose up -d
```

### Step 3:
start the spring application

### Step 4:
`GET /hello` should return `Hello World` as response.
`GET /send-message?message=<MESSAGE>` should:
- print `Received message in group mygroup: <MESSAGE>` in the console.
- return `Message sent to Kafka topic` as response.

`GET /set?key=<KEY>&value=<VALUE>` should:
- return `Value set in Redis` as response.
- A key-value pair `<KEY>: <VALUE>` should display at http://localhost:8001

`GET /get?key=<KEY>` should:
- return `Value from Redis: <VALUE>` as response where `VALUE` is the value to the key `KEY`