# Тестирование ПО — Лабораторная работа 6
## Docker и CI/CD для API-автотестов

Проект содержит автоматизированный API-тест на стеке Java (JUnit 5 + REST Assured), упакованный в Docker-контейнер и интегрированный в GitHub Actions CI.

### Описание теста

Тест проверяет доступность и корректность ответа публичного эндпоинта `https://httpbin.org/get`:
- отправляет GET-запрос с заголовком `Accept: application/json`;
- валидирует HTTP-статус `200 OK`;
- проверяет поле `url` в JSON-ответе.

### Локальный запуск

#### 1. Сборка Docker-образа

```bash
docker build -t api-test .
```

#### 2. Запуск контейнера с тестом
```bash
docker run --rm api-test
```

Конфигурационный файл pipeline: .github/workflows/ci.yml.

Ссылка на pipeline:
```
https://github.com/Zhitnikov/itmo-testing-lab3/actions/runs/40560779424/job/122388872008
```