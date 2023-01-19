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
      <a href="https://github.com">
        <img src="https://github.com/Ucsus/leprosorium.ru/blob/main/src/test/resources/images/logos/GitHub.svg" width="48" height="48" alt="GitHub" />
      </a>
      <br>GitHub
    </td>
  </tr>
  <tr>
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
        <img src="https://www.atlassian.com/software/jira" width="48" height="48" alt="Jira" />
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
    <td align="center" width="96">
      <a href="#macropower-tech" >
        <img src="https://raw.githubusercontent.com/cncf/artwork/master/projects/thanos/icon/color/thanos-icon-color.svg" width="48" height="48" alt="Thanos" />
      </a>
      <br>Thanos
    </td>
  </tr>
</table>


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


