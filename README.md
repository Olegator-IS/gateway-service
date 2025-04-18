```
  ▄▄ •  ▄▄▄· ▄▄▄▄▄▄▄▄ .▄▄▌ ▐ ▄▌ ▄▄▄· ▄· ▄▌      ▄▄▄  ▄▄▄ .·▄▄▄▄  ▄▄▄ .
▐█ ▀ ▪▐█ ▀█ •██  ▀▄.▀·██· █▌▐█▐█ ▀█ ▐█▪█▌▪     ▀▄ █·▀▄.▀·██▪ ██ ▀▄.▀·
▄█ ▀█▄▄█▀▀█  ▐█.▪▐▀▀▪▄██▪▐█▐▐▌▄█▀▀█ ▐█▌█▌ ▄█▀▄ ▐▀▀▄ ▐▀▀▪▄▐█· ▐█▌▐▀▀▪▄
▐█▄▪▐█▐█ ▪▐▌ ▐█▌·▐█▄▄▌▐█▌██▐█▌▐█ ▪▐▌ ▐█▀·.▐█▌.▐▌▐█•█▌▐█▄▄▌██. ██ ▐█▄▄▌
·▀▀▀▀  ▀  ▀  ▀▀▀  ▀▀▀  ▀▀▀▀ ▀▪ ▀  ▀   ▀ •  ▀█▄▀▪.▀  ▀ ▀▀▀ ▀▀▀▀▀•  ▀▀▀

Gateway-Service является центральным API-шлюзом для экосистемы PlaceAndPlay. Он служит точкой входа для всех входящих запросов и перенаправляет их в соответствующие микросервисы. Основан на Spring Cloud Gateway, он предоставляет следующие основные функциональные возможности:
🔀 Маршрутизация
Направляет запросы к различным микросервисам на основе URI пути или заголовков.
🔒 Безопасность
Обеспечивает аутентификацию и авторизацию запросов с использованием JWT токенов.
⚡ Ограничение по количеству запросов
Контролирует количество запросов, чтобы защитить бэкэнд-сервисы от перегрузки.
⚖️ Балансировка нагрузки
Распределяет трафик между несколькими экземплярами одного и того же микросервиса.
📊 Логирование и мониторинг
Сохраняет логи и метрики для мониторинга состояния и производительности сервиса.
