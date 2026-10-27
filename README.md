# Автоматизация API-тестирования в Docker и CI/CD

Проект содержит автотест на базе JUnit 5 и RestAssured, выполняющий валидацию эндпоинта публичного сервиса `https://httpbin.org/get`.

## Локальный запуск через Docker

Сборка образа:
```bash
docker build -t api-test .