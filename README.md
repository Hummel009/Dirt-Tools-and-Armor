Dirt Tools and Armor - простенький мод, о котором мечтал каждый. Он добавляет меч, сет брони и инструменты
из земли. Все предметы могут быть скрафчены в выживании и имеют характеристики алмазных.

## Общая информация

Этот репозиторий обладает сложной иерархией. Он содержит:

* Актуальный проект, состоящий из 3 модулей (appForge, appFabric и appNeoForge). В этом случае папкой проекта является
  весь репозиторий целиком.
* Архивный проект Forge, состоящий из 14 модулей (1.3.2 - 1.7.10; 1.12.2 - 1.20.6). Важно: папки 1.8.9 - 1.11.2 модулями
  не являются, их придётся открывать отдельно. Об этом будет подробно написано ниже.
* Архивный проект Fabric, состоящий из 7 модулей (1.14.4 - 1.20.6).
* Архивный проект NeoForge, состоящий из 1 модулея (1.20.6).

| Версия Minecraft | Gradle | Плагин сборки                          | Gradle JDK | Project JDK | Syntax |
|------------------|--------|----------------------------------------|------------|-------------|--------|
| 1.3.2 - 1.6.4    | 8.10   | Voldeloom                              | 21         | 11          | 6      |
| 1.7.10, 1.12.2   | 8.10   | RetroFuturaGradle                      | 21         | 8           | 8      |
| 1.8.9 - 1.11.2   | 8.10   | Essential Loom                         | 21         | 8           | 8      |
| 1.13.2 - 1.16.5  | 8.10   | ForgeGradle 6.X; FabricLoom            | 21         | 8           | 8      |
| 1.17.1           | 8.10   | ForgeGradle 6.X; FabricLoom            | 21         | 16          | 16     |
| 1.18.2 - 1.19.4  | 8.10   | ForgeGradle 6.X; FabricLoom            | 21         | 17          | 17     |
| 1.20.6 и новее   | 8.10   | ForgeGradle 6.X; FabricLoom; NeoGradle | 21         | 21          | 21     |

### Примечания к таблице

* Gradle - сборочная машина. Чем она новее, тем лучше. На данный момент удалось подобрать и настроить плагины так, что
  все хорошо работают на новейшей версии.
* Плагин сборки - инструментарий, который совместим и используется для работы с определённой версией игры. Принципы
  работы везде похожи, но отличия имеются. Об этом подробнее будет сказано ниже.
* Gradle JDK - это Java, при помощи которой запускается скрипт сборки среды. Обычно это та Java, которая установлена
  глобально на компьютере, которая запускает программы и которая отражена в переменных средах. На данный момент удалось
  подобрать и настроить плагины так, что все хорошо работают на новейшей версии.
* Project JDK - это Java, при помощи которой запускается мод в среде разработки. Она зависит от Mojang и менять её
  нельзя (исключение - Voldeloom, который позволяет вместо ультра-старой версии использовать новую, но со старым
  синтаксисом).
* Syntax - синтаксис Java, используемый в файлах с кодом. Программист не должен использовать синтаксис более новой
  версии, чем указан в таблице. Более старый - можно, но зачем?

## Установка

> [!IMPORTANT]
> Раздел написан для новичков - пошагово и с расчётом на то, что на компьютере ничего не настроено и не установлено.

Первым делом нужно скачать репозиторий и разархивировать его в любое место на диске. Если всё сделано правильно, вы
должны увидеть несколько папок: `appForge`, `appFabric` и так далее.

### Установка нужных версий JDK

У вас на компьютере уже могут находиться установленные JRE или JDK, но мы будем исходить из худшего и скачаем новые.

* Запустите IntelliJ IDEA.
* Нажмите сочетание клавиш `Ctrl + Alt + Shift + S`.
* В открывшемся окне в списке параметров слева нажмите `SDKs`. Сверху нажмите `+`, `Download JDK`.
* В открывшемся окне выберите вендора `Eclipse Temurin`, а версию посмотрите в таблице из первого раздела.
  Нажмите `Download`.
* Повторите это столько раз, сколько версий JDK вам нужно установить, согласно таблице. В общей сложности, для всех
  проектов в этом репозитории вам потребуется JDK 8, 11, 16, 17 и 21.

Если всё сделано правильно, то вы должны увидеть несколько скачанных JDK в папке пользователя. В моём случае,
это `C:\Users\Hummel009\.jdks`.

### Конфигурация переменных сред Windows

У вас на компьютере уже могут быть сконфигурированы другие JRE и JDK. Чтобы не было конфликтов, мы удалим все старые
настройки и поставим новые.

* Нажмите `Win + R` и введите `systempropertiesadvanced`. Нажмите `OK`.
* В открывшемся окне нажмите `Переменные среды`.
* В открывшемся окне вы увидите два раздела - переменные среды для пользователя и для системы.
    * Проверьте оба раздела на наличие там переменной с названием `JAVA_HOME`.
        * Если она есть, дважды кликните по ней ЛКМ и введите в значение путь к скачанной ранее JDK. В моём случае,
          это `C:\Users\Hummel009\.jdks\temurin-21.0.1`.
        * Если её нет, создайте там переменную с таким именем и введите значение, как в пункте выше.
        * Если их несколько, удалите все, кроме одной, а оставшуюся настройте, как в пункте выше.
    * Проверьте оба раздела на наличие там переменной с названием `Path`. Она есть у каждого пользователя и представляет
      собой таблицу из путей.
        * Проверьте все пути в обеих переменных `Path` и удалите все строчки с
          упоминанием `Java`, `Oracle`, `jre`, `jdk`.
        * Только в одной из двух переменных `Path` создайте новую строку и введите в неё `%JAVA_HOME%\bin`.

> [!NOTE]
> После настройки сред иногда требуется перезагрузка компьютера, а иногда нет.

Попробуйте в любом месте компьютера открыть консоль Windows и введите команду `java -version`. Если всё сделано
правильно, то консоль выдаст следующее:

```
openjdk version "21.0.1" 2023-10-17
OpenJDK Runtime Environment Temurin-21.0.1+9 (build 21.0.1+9)
OpenJDK 64-Bit Server VM Temurin-21.0.1+9 (build 21.0.1+9, mixed mode, sharing)
```

Теперь можно приступать к, собственно, работе с **проектом**. Но для начала определимся, какой из проектов нас
интересует.

### Что считать папкой проекта?

Как уже было сказано ранее, `весь репозиторий` - это один проект; `appFabricArchive` - второй проект;
`appForgeArchive` - третий проект. Также было сказано, что внутри папки `appForgeArchive` есть четыре папки (1.8.9,
1.9.4, 1.10.2 и 1.11.2), которые являются не модулями, а проектами. Так вышло из-за устаревания инструментария этих
версий, но сейчас это не очень важно.

Итак, в сумме мы насчитали семь проектов. Любой из них можно отдельно открыть в IntelliJ IDEA. Собственно, в
зависимости от того, какой проект вы откроете, вы сможете редактировать ту или иную версию мода.

* Если вас интересует разработка под новейшую версию, не важно, Fabric или Forge, ваша цель - весь репозиторий.
* Если вас интересует разработка под более старые версии на Forge, ваша цель - `appForgeArchive`.
    * 1.8.9, 1.9.4, 1.10.2 и 1.11.2 придётся открывать по отдельности; каждая из них и есть цель.
* Если вас интересует разработка под более старые версии на Fabric, ваша цель - `appFabricArchive`.

Ещё раз, в виде образца рассуждений:

* Я хочу отредактировать мод для новейшей версии. Значит, папка проекта - весь репозиторий.
* Я хочу отредактировать мод для Forge 1.3.2. Эта версия лежит в `appForgeArchive`. Значит, папка
  проекта - `appForgeArchive`.
* Я хочу отредактировать мод для Fabric 1.19.4. Эта версия лежит в `appFabricArchive`. Значит, папка
  проекта - `appFabricArchive`.
* Я хочу отредактировать мод для Forge 1.8.9. 1.8.9 лежит в `appForgeArchive` и является одной из тех "отдельных"
  версий. Значит, папка проекта - `1.8.9`.

Теперь, когда вы знаете, какая папка проекта вас интересует, осталось определить, какой плагин сборки используется для
выбранной версии игры. Дальше в инструкции будет фигурировать понятие папки проекта или просто папки - это и будет
та самая папка, которую вы определили в абзаце выше.

### Разворачиваем среду

Остался финальный штрих - открыть выбранную папку в среде разработки так, чтобы она сама установила всё необходимое и
была готова к работе.

* Запустите IntelliJ IDEA.
* Откройте папку проекта: `File -> Open -> [выбираете папку] -> OK`.

Сразу после открытия начнётся установка среды. Если от вас потребуется разрешение на скачивание файлов, дайте его.
Спустя некоторое время все необходимые файлы скачаются, и среда будет готова к работе.

В конечном итоге, если всё сделано правильно, то вы увидите проект без сообщений об ошибке и с подсветкой синтаксиса в
файлах с кодом. Если что-то пошло не так, запустите установку ещё раз. Это можно сделать в меню Gradle внутри IntelliJ
IDEA: `View -> Tool Windows -> Gradle`. Там сверху слева вы увидите значок обновления (стрелка по кругу).

> [!IMPORTANT]
> Скачивание может занять вплоть до нескольких часов! Моему Gradle на всё-про-всё понадобилось 25 гигабайт пространства.

## Основы работы

После установки среды весь необходимый инструментарий готов к работе. Инструментарий может немного отличаться в
зависимости от того, какой плагин сборки использует данная версия. Согласно таблице из первого раздела, это может быть
Voldeloom, RetroFuturaGradle, Essential Loom, ForgeGradle 6.X.

Большая часть функционала располагается в меню Gradle. Меню, как уже было сказано ранее, можно открыть следующим
образом: `View -> Tool Windows -> Gradle`.

### Voldeloom

Современный плагин для моддинга под Forge на очень старых версиях Minecraft. Самые важные функции:

* Запуск клиента из среды: `Меню Gradle -> Tasks -> volde.run -> runClient`.
* Запуск локального сервера из среды: `Меню Gradle -> Tasks -> modded minecraft -> runServer`. К нему можно подключиться
  из клиента, введя в качестве адреса `localhost`.
    * Если подключиться не получилось, проверьте, чтобы сервер работал не в защищённом режиме. Для этого в папке
      `папка_проекта/run/server/server.properties` найдите строчку `online-mode` и укажите ему значение `false`.
    * Сервер для версий 1.5.2 и 1.6.4 не работает. Это проблема Voldeloom.
* Компиляция мода в файл с расширением `.jar`: `Меню Gradle -> Tasks -> build -> build`. После компиляции ваш мод
  появится в папке `папка_проекта/build/libs`. Вас интересует тот файл, который без приписки `-dev.jar`.

### RetroFuturaGradle

Современный плагин для моддинга под Forge на популярнейших из относительно старых версий Minecraft. Самые важные
функции:

* Генерация исходного кода Minecraft: `Меню Gradle -> Tasks -> modded minecraft -> setupDecompWorkspace`. Эта функция
  исправляет проблему, из-за которой весь ваш код горит красным цветом после установки среды.
* Запуск клиента из среды: `Меню Gradle -> Tasks -> modded minecraft -> runClient`.
* Запуск локального сервера из среды: `Меню Gradle -> Tasks -> modded minecraft -> runServer`. К нему можно подключиться
  из клиента, введя в качестве адреса `localhost`.
    * При запуске сервера в консоли будет дважды требоваться ввод согласия или несогласия с параметрами.
        * `Do you want to start the server in online-mode? Type 'y' to do so` - введите `n`.
        * `Do you accept the minecraft EULA? Type 'y' to do so` - введите `y`.
* Компиляция мода в файл с расширением .jar: `Меню Gradle -> Tasks -> build -> build`. После компиляции ваш мод появится
  в папке `папка_проекта/build/libs`. Вас интересует тот файл, который без приписки `-dev.jar`.

### Essential Loom

Современный плагин для моддинга под Forge на относительно старых версиях Minecraft. Самые важные функции:

* Запуск клиента из среды здесь осуществляется кнопкой с зелёным треугольником в верхней части окна.
* Запуск локального сервера из среды тоже осуществляется кнопкой с зелёным треугольником в верхней части окна. К нему
  можно подключиться из клиента, введя в качестве адреса `localhost`.
    * Если подключиться не получилось, проверьте, чтобы сервер работал не в защищённом режиме. Для этого в папке
      `папка_проекта/run/server.properties` найдите строчку `online-mode` и укажите ему значение `false`.
* Компиляция мода в файл с расширением `.jar` осуществляется в папке проекта посредством двойного нажатия ЛКМ на
  файл `build.bat`. После компиляции ваш мод появится в папке `папка_проекта/build/libs`.

### ForgeGradle 6.X

Новейший плагин для моддинга под Forge на новых версиях Minecraft. Самые важные функции:

* Запуск клиента из среды: `Меню Gradle -> Tasks -> forgegradle runs -> runClient`.
* Запуск локального сервера из среды: `Меню Gradle -> Tasks -> forgegradle runs -> runServer`. К нему можно подключиться
  из клиента, введя в качестве адреса `localhost`.
    * Первый запуск сервера будет неудачным, потому что не подписано соглашение EULA. После неудачного запуска откройте
      папку `папка_проекта/runs/server/eula.txt` и замените `false` на `true`.
    * Если подключиться не получилось, проверьте, чтобы сервер работал не в защищённом режиме. Для этого в папке
      `папка_проекта/runs/server/server.properties` найдите строчку `online-mode` и укажите ему значение `false`.
* Компиляция мода в файл с расширением .jar: `Меню Gradle -> Tasks -> build -> build`. После компиляции ваш мод появится
  в папке `папка_проекта/build/libs`.

### NeoGradle

Новейший плагин для моддинга под NeoForge на новых версиях Minecraft. Самые важные функции:

* Запуск клиента из среды: `Меню Gradle -> Tasks -> neogradle/runs -> runClient`.
* Запуск локального сервера из среды: `Меню Gradle -> Tasks -> neogradle/runs -> runServer`. К нему можно подключиться
  из клиента, введя в качестве адреса `localhost`.
    * Первый запуск сервера будет неудачным, потому что не подписано соглашение EULA. После неудачного запуска откройте
      папку `папка_проекта/runs/server/eula.txt` и замените `false` на `true`.
    * Если подключиться не получилось, проверьте, чтобы сервер работал не в защищённом режиме. Для этого в папке
      `папка_проекта/runs/server/server.properties` найдите строчку `online-mode` и укажите ему значение `false`.
* Компиляция мода в файл с расширением .jar: `Меню Gradle -> Tasks -> build -> build`. После компиляции ваш мод появится
  в папке `папка_проекта/build/libs`.

### FabricLoom

Новейший плагин для моддинга под Fabric на новых версиях Minecraft. Самые важные функции:

* Запуск клиента из среды: `Меню Gradle -> Tasks -> fabric -> runClient`.
* Запуск локального сервера из среды: `Меню Gradle -> Tasks -> fabric -> runServer`. К нему можно подключиться
  из клиента, введя в качестве адреса `localhost`.
    * Первый запуск сервера будет неудачным, потому что не подписано соглашение EULA. После неудачного запуска откройте
      папку `папка_проекта/run/eula.txt` и замените `false` на `true`.
    * Если подключиться не получилось, проверьте, чтобы сервер работал не в защищённом режиме. Для этого в папке
      `папка_проекта/run/server.properties` найдите строчку `online-mode` и укажите ему значение `false`.
* Компиляция мода в файл с расширением .jar: `Меню Gradle -> Tasks -> build -> build`. После компиляции ваш мод появится
  в папке `папка_проекта/build/libs`.
  
