cd ..
cd batch-order
docker build -t laigasus/batch-order:latest .
docker push laigasus/batch-order:latest

cd ..
cd core-gateway
docker build -t laigasus/core-gateway:latest .
docker push laigasus/core-gateway:latest

cd ..
cd service-account
docker build -t laigasus/service-account:latest .
docker push laigasus/service-account:latest

cd ..
cd service-order
docker build -t laigasus/service-order:latest .
docker push laigasus/service-order:latest

cd ..
cd service-product
docker build -t laigasus/service-product:latest .
docker push laigasus/service-product:latest