# Проект автоматизации тестирования сайта [Лепрозорий](https://leprosorium.ru)
<a href="https://leprosorium.ru" target="_blank"><img src="https://i.postimg.cc/JnKd1x7h/header-1.jpg?raw=true"></a>
>Суверенный Лепрозорий — закрытый коллективный блог, со своей мифологией,\
>своеобразными правилами и своеобразным цинично-глумливым юмором, отсоединившийся от <a href="https://d3.ru/">dirty.ru.</a>\
>Состоит из сайта, а также приложений для iOS (официальное) и Android (неофициальное).

## Содержание :bookmark_tabs:
➠ <a href="#stack">Cтек технологий</a></br>
➠ <a href="#testcases">Реализованные проверки</a></br>
➠ <a href="#jenkins">Сборка в Jenkins</a></br>
➠ <a href="#console">Запуск из терминала</a></br>
➠ <a href="#allure">Allure отчет</a></br>
➠ <a href="#alluretestops">Allure TestOps</a></br>
➠ <a href="#jira">Интеграция с Jira</a></br>
➠ <a href="#telegram">Отчет в Telegram</a></br>
➠ <a href="#slack">Отчет в Slack</a></br>
➠ <a href="#video">Видео прохождения теста</a>
➠ <a href="#video">Appium</a>
➠ <a href="#video">BrowserStack</a>

<a id="stack"></a>
## Cтек технологий :hammer_and_wrench:

<table>
  <tr>
    <td align="center" width="96">
      <a href="https://www.jetbrains.com/idea/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Intelij_IDEA.svg" width="48" height="48" alt="InteliJ IDEA" />
      </a>
      <br>InteliJ IDEA
    </td>
    <td align="center" width="96">
      <a href="[#macropower-tech](https://www.java.com/)">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Java.svg" width="48" height="48" alt="Java" />
      </a>
      <br>Java
    </td>
    <td align="center" width="96">
      <a href="https://junit.org/junit5/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/JUnit5.svg" width="48" height="48" alt="JUnit 5" />
      </a>
      <br>JUnit 5
    </td>
    <td align="center" width="96">
      <a href="https://selenide.org/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Selenide.svg" width="48" height="48" alt="Selenide" />
      </a>
      <br>JSelenide
    </td>
    <td align="center" width="96">
      <a href="https://aerokube.com/selenoid/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Selenoid.svg" width="48" height="48" alt="Selenoid" />
      </a>
      <br>Selenoid
    </td>
    <td align="center" width="96">
      <a href="https://gradle.org/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Gradle.svg" width="48" height="48" alt="Gradle" />
      </a>
      <br>Gradle
    </td>
    <td align="center" width="96">
      <a href="https://www.jenkins.io/" >
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Jenkins.svg" width="48" height="48" alt="Jenkins" />
      </a>
      <br>Jenkins
    </td>
    <td align="center" width="96">
      <a href="https://rest-assured.io/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/RestAssured.svg" width="48" height="48" alt="REST Assured" />
      </a>
      <br>REST Assured
    </td>
    <td align="center" width="96">
      <a href="https://www.selenium.dev/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Selenium.svg" width="48" height="48" alt="Selenium" />
      </a>
      <br>Selenium
    </td>
  </tr>
  <tr>
      <td align="center" width="96">
      <a href="https://github.com">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/GitHub.svg" width="48" height="48" alt="GitHub" />
      </a>
      <br>GitHub
    </td>
    <td align="center" width="96"> 
      <a href="https://developer.android.com/studio" >
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/AndroidStudio.svg" width="48" height="48" alt="AndroidStudio" />
      </a>
      <br>AndroidStudio
    </td>
    <td align="center" width="96">
      <a href="https://www.browserstack.com" >
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Browserstack.svg" width="48" height="48" alt="Browserstack" />
      </a>
      <br>Browserstack
    </td>
    <td align="center"  width="96">
      <a href="https://appium.io/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Appium.svg" width="48" height="48" alt="Appium" />
      </a>
      <br>Appium
    </td>
    <td align="center"  width="96">
      <a href="https://github.com/allure-framework/">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Allure.svg" width="48" height="48" alt="Allure" />
      </a>
      <br>Allure
    </td>
    <td align="center" width="96">
      <a href="https://qameta.io">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/AllureTestOps.svg" width="48" height="48" alt="Allure TestOps" />
      </a>
      <br>Allure TestOps
    </td>
    <td align="center"  width="96">
      <a href="https://www.atlassian.com/software/jira">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Jira.svg" width="48" height="48" alt="Jira" />
      </a>
      <br>Jira
    </td>
    <td align="center" width="96">
      <a href="https://telegram.org/" >
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Telegram.svg" width="48" height="48" alt="Telegram" />
      </a>
      <br>Telegram
    </td>
    <td align="center" width="96">
      <a href="https://slack.com" >
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Slack.svg" width="48" height="48" alt="Slack" />
      </a>
      <br>Slack
    </td>
  </tr>
</table>


<a id="testcases"></a>
## Реализованные проверки :mag:
### Web:
<p align="center">
<img title="Web" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/webtestcase.jpg">
</p>

### Api:
<p align="center">
<img title="Web" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/apitestcase.jpg">
</p>

### Mobile:
<p align="center">
<img title="Web" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/mobiletestcase.jpg">
</p>

<a id="console"></a>
## Запуск из терминала :desktop_computer:
### Локальный запуск:
> В каталоге resources/configuration находятся конфиги с параметрами для запуска тестов.<br>
> Необходимо заполнить следующие файлы: <br>
> src/test/resources/config/web/local.properties <br>
> src/test/resources/config/mobile/emulation.properties <br>
> src/test/resources/config/mobile/emulation.properties <br>
> (примеры включены в этот проект github). <br>
> Как только это будет сделано, вы можете запустить следующие команды:
```
gradle clean webTests
gradle clean mobileTests -DmobileDeviceHost=emulation
```

### Удалённый запуск:
> В каталоге resources/configuration находятся конфиги с параметрами для запуска тестов.<br>
> Необходимо заполнить следующие файлы: <br>
> src/test/resources/config/web/remote.properties <br>
> src/test/resources/config/mobile/browserstack.properties <br>
> src/test/resources/config/api/api.properties <br>
> (примеры включены в этот проект github).<br>
> Как только это будет сделано, вы можете запустить следующие команды:
```
gradle clean 
${TYPE}Tests
```

```mermaid
graph LR
A[TYPE] --> B[web]
A --> D[api]
A --> E[mobile]
A --> F[all]
```

### Отчет:
```bash
allure serve build/allure-results

```

<a id="jenkins"></a>
## <a href="https://jenkins.autotests.cloud/job/Lepra//">Сборка в Jenkins</a> <img alt="Jenkins" height="32" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Jenkins.svg"/></img></br>
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/jenkinsmain.jpg"></br>

<a id="allure"></a>
## Allure отчёт <img alt="Allure" height="32" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Allure.svg"/></img></br>
### Обзор:
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/jenkins1.jpg"></br>
### Тесты:
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/jenkins2.jpg"></br>
### Графики:
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/jenkins3.jpg"></br>

<a id="alluretestops"></a>
## Allure TestOps <img alt="Allure TestOps" height="32" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/AllureTestOps.svg"/></img></br>
### Обзор
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/ato1.jpg"></br>
### Тесты
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/ato2.jpg"></br>
### Запуск
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/ato3.jpg"></br>

<a id="jira"></a>
## Интеграция с Jira <img alt="jira" height="32" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Jira.svg"/></img></br>
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/jira.jpg"></br>

<a id="telegram"></a>
## Отчет в Telegram <img alt="Telegram" height="32" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Telegram.svg"/></img></br>
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/telegram.jpg"></br>

<a id="slack"></a>
## Отчет в Slack <img alt="slack" height="32" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Slack.svg"/></img></br>
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/slack.jpg"></br>

<a id="video"></a>
## Видео прохождения теста :clapper:
https://user-images.githubusercontent.com/7962244/213429054-df407870-c8c7-4451-9cb7-e88d79d3cb15.mp4

<a id="appium"></a>
### Appium Server + Appium Inspector + Android Studio Virtual Device<img alt="Appium" height="32" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Appium.svg"/></img></br>
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/appium.jpg"></br>

<a id="browserstack"></a>
### BrowserStack<img alt="Browserstack" height="32" src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/Browserstack.svg"/></img></br>
### Обзор
<img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/screens/browserstack1.jpg"></br>
## Видео прохождения мобильного теста в BrowserStack:clapper:
https://user-images.githubusercontent.com/7962244/213428972-84b7d80e-0323-419f-8b5e-fe072c61ad68.mp4



