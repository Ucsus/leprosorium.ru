# Проект автоматизации тестирования сайта [Лепрозорий](https://leprosorium.ru)
<a href="https://leprosorium.ru" target="_blank"><img src="https://i.postimg.cc/JnKd1x7h/header-1.jpg?raw=true"></a>
>Суверенный Лепрозорий — закрытый коллективный блог, со своей мифологией,\
>своеобразными правилами и своеобразным цинично-глумливым юмором, отсоединившийся от dirty.ru.\
>Состоит из сайта, а также приложений для iOS (официальное) и Android (неофициальное).

## Содержание :bookmark_tabs:
🔴 <a href="#stack">Cтек технологий</a></br>
🔴 <a href="#testcases">Реализованные проверки</a></br>
🔴 <a href="#jenkins">Сборка в Jenkins</a></br>
🔴 <a href="#console">Запуск из терминала</a></br>
🔴 <a href="#allure">Allure отчет</a></br>
🔴 <a href="#alluretestops">Allure TestOps</a></br>
🔴 <a href="#jira">Интеграция с Jira</a></br>
🔴 <a href="#telegram">Отчет в Telegram</a></br>
🔴 <a href="#slack">Отчет в Slack</a></br>
🔴 <a href="#video">Видео прохождения тестов</a>

<a id="stack"></a>
## Cтек технологий :hammer_and_wrench:

| InteliJ IDEA  | Java | JUnit 5  | Selenide | Selenoid  | Gradle | Jenkins  | REST</br>Assured | GitHub |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
|<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Intelij_IDEA.svg" width="50"/></a>  |<a href="https://www.java.com/"><img alt="Java" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Java.svg" width="50"/></a>  | <a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/JUnit5.svg" width="50"/></a>  |<a href="https://selenide.org/"><img alt="Selenide" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Selenide.svg" width="50"/></a>  | <a href="https://aerokube.com/selenoid/"><img alt="Selenoid" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Selenoid.svg" width="50"/></a>  | <a href="https://gradle.org/"><img alt="Gradle" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Gradle.svg" width="50"/></a>  | <a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Jenkins.svg" width="50"/></a>  | <a href="https://rest-assured.i/"><img alt="REST Assured" height="45" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/RestAssured.svg" width="45"/></a>  | <a href="https://github.com"><img alt="GitHub" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/GitHub.svg" width="50"/></a>  |

| Android</br>Studio  | Browserstack | Appium  | Allure | Allure</br>TestOps  | Jira | Telegram  | Slack |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| <a href="https://developer.android.com/studio"><img alt="AndroidStudio" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/AndroidStudio.svg" width="50"/></a>  | <a href="https://www.browserstack.com"><img alt="Browserstack" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Browserstack.svg" width="50" align="center"/></a>  | <a href="https://appium.io/"><img alt="Appium" height="45" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Appium.svg" width="45"/></a>  | <a href="https://github.com/allure-framework/"><img alt="Allure" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Allure.svg" width="50"/></a>  | <a href="https://qameta.io"><img alt="Allure TestOps" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/AllureTestOps.svg" width="50"/></a>  | <a href="https://www.atlassian.com/software/jira"><img alt="Jira" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Jira.svg" width="50"/></a>  | <a href="https://telegram.org/"><img alt="Telegram" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Telegram.svg" width="50"/></a>  | <a href="https://slack.com"><img alt="Slack" height="50" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Slack.svg" width="50"/></a>  |

<a id="testcases"></a>
## Реализованные проверки :mag:
✓ Проверка отображения заголовка сайта</br>
✓ Проверка и заполнение формы "Задать вопрос"</br>
✓ Проверка меню второго уровня</br>
✓ Проверка ссылок соцсетей в подвале</br>
✓ Проверка шэринга материалов

<a id="jenkins"></a>
## <a href="https://jenkins.autotests.cloud/job/iiii-tech.com/">Сборка в Jenkins</a> <img alt="Jenkins" height="32" src="/images/logos/Jenkins.svg"/></img></br>
<img src="/images/screens/jenkins.jpg"></br>
### Параметры сборки в Jenkins:
- Browser (браузер, по умолчанию chrome)
- Browser_version (версия браузера, по умолчанию 100)
- Browser_size (размер окна браузера, по умолчанию 1920x1080)
- REMOTE_URL (логин, пароль и адрес удаленного сервера selenoid)

<a id="console"></a>
## Запуск из терминала :desktop_computer:
### Локальный запуск:
```
gradle clean test -Dcontrol=local
```

### Удаленный запуск:
```
gradle clean test -Dcontrol=remote
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}
```

### Отчет:
```bash
allure serve build/allure-results
```

### Параметры сборки
> <code>BROWSER</code> – браузер (_по умолчанию - chrome_)</br>
> <code>BROWSER_SIZE</code> – разрешение браузера (_по умолчанию - 1920x1080_)</br>
> <code>BROWSER_VERSION</code> – версия браузера (_по умолчанию - 100_)</br>
> <code>remote</code> – логин, пароль и адрес Selenoid (_указаны в Jenkins_)

<a id="allure"></a>
## Allure отчёт <img alt="Allure" height="32" src="/images/logos/Allure.svg"/></img></br>
### <a href="https://jenkins.autotests.cloud/job/iiii-tech.com/6/allure/">Обзор</a>
<img src="/images/screens/alluremain.jpg"></br>
### <a href="https://jenkins.autotests.cloud/job/iiii-tech.com/6/allure/#packages">Тесты</a>
<img src="/images/screens/allurepackages.jpg"></br>
### <a href="https://jenkins.autotests.cloud/job/iiii-tech.com/6/allure/#graph">Графики</a>
<img src="/images/screens/alluregraphs.jpg"></br>

<a id="alluretestops"></a>
## Allure TestOps <img alt="Allure TestOps" height="32" src="/images/logos/testops.svg"/></img></br>
### Обзор
<img src="/images/screens/alluretestopslaunches.jpg"></br>
### Тесты
<img src="/images/screens/alluretestopstests.jpg"></br>

<a id="jira"></a>
## Интеграция с Jira <img alt="jira" height="32" src="/images/logos/jira.svg"/></img></br>
<img src="/images/screens/jira.jpg"></br>

<a id="telegram"></a>
## Отчет в Telegram <img alt="jira" height="32" src="/images/logos/Telegram.svg"/></img></br>
<img src="/images/screens/telegram.jpg"></br>

<a id="video"></a>
## Видео прохождения тестов :clapper:
https://user-images.githubusercontent.com/7962244/202163328-65371d67-3944-4978-b1e8-e82b5102c220.mp4


