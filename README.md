# Microservices-combined
Проект по курсу "Технологии разработки программного обеспечения"

[Техническое задание](https://docs.google.com/document/d/1FKO65Ga0rRVPVArQERqO__3fkOeCWFGgSKRb6_tCX9U/edit)
## How to use

1. Спулить текущий репозиторий
2. Перейти в скачанный репозиторий 
2. Спулить связанные репозитории в текущую директорию
2. Скомпилировать исходный код warehouse и order микросервисов
2. Вызвать docker-compose up

Для корректной работы необходимы предустановленные docker, mongodb, rabbitmq и postgresql

Для запуска нескольких экземпляров микросервиса с автоматической балансировкой нагрузки между ними нужно выполнить docker-compose up --scale [название микросервиса] 

## Ссылки на связанные репозитории
[Warehouse](https://github.com/JoCoKo/Warehouse)

[Order](https://github.com/dshtefan/order-service)

[Payment](https://github.com/fahredof/PaymentService)
