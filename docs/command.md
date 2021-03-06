### Команда


Команда - инкапсулирует запрос в виде объекта, дела возможной параметразацию клиенских объектов с другим запросами,
организацию очереди или регистрацию запросов, а также поддержку отмены операций.
<hr>


#### Цель:
* При необходимости отделить объект, выдающий запросы, от объектов, которые умеют эти запросы выполнять.

#### Ключевые особенности паттерна:
* Объект инкапсулирует получателя с операцией (или набором операций).
* Возможна параметризация инициаторов командами (даже динамическая во время выполнения).
* Команды могут поддерживать механизм отмены, востанавливающий объект в состоянии до последнего вызова метода execute().
* Макрокоманды - простое расширение паттерна Команда, позволяющее выполнять цеочки из нескольких команд.
* Команды также могут использоваться для реализации систем регистрации команд и поддержки транзаций.

#### Примеры использования паттерна:
1. [Простой пример использования](../src/command/RemoteControlTest.java)