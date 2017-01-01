"# SeleniumTestNGParallelPOP" 
# SeleniumTestNGParallelPOP

A maven template for Selenium 3 that has the latest dependencies so that you can just check out and start writing tests in four easy steps. 

What should I know?


mvn clean test -P-smokeTest


Anything else?

Yes you can specify which browser to use by using one of the following switches:

-Dbrowser=firefox
-Dbrowser=chrome
-Dbrowser=ie
-Dbrowser=edge
-Dbrowser=opera
-Dbrowser=htmlunit
-Dbrowser=phantomjs

You don't need to worry about downloading the IEDriverServer, MicrosoftWebDriver, chromedriver , operachromium, or wires binaries, this project will do that for you automatically.

Not got PhantomJS? Don't worry that will be automatically downloaded for you as well!

You can specify a grid to connect to where you can choose your browser, browser version and platform:

-Dremote=true
-DseleniumGridURL=http://{username}:{accessKey}@ondemand.saucelabs.com:80/wd/hub
-Dplatform=xp
-Dbrowser=firefox
-DbrowserVersion=44
You can even specify multiple threads (you can do it on a grid as well!):

-Dthreads=2
You can also specify a proxy to use

-DproxyEnabled=true
-DproxyHost=localhost
-DproxyPort=8080
If the tests fail screenshots will be saved in ${project.basedir}/target/screenshots

If you need to force a binary overwrite you can do:

-Doverwrite.binaries=true
It's not working!!!

You have probably got outdated driver binaries, by default they are not overwritten if they already exist to speed things up. You have two options:

mvn clean verify -Doverwrite.binaries=true
Delete the selenium_standalone_binaries folder in your resources directory
