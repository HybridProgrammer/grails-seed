![Build Status](https://api.travis-ci.org/HybridProgrammer/grails-seed.svg?branch=master)

# grails-seed
Works with grails version 2.4.3

Idea comes from similar projects like http://github.com/angular/angular-seed

## Features
These features aren't normally configured for you in grails and have been added to 
grails-seed for your convenience. 

Most configurations are found in grails-app/conf/Config.groovy & grails-app/conf/BuildConfig.groovy

* Grails Security Core
  * Default User: user=admin; password=admin
    * Initially set in grails-app/conf/BootStrap.groovy and later can be configured in http://localhost:8080/grails-seed/user/edit/1
  * Basic Authentication support for explicitly stated URls
    * Default: 
      * /api/** will use basic authentication 
      * All other urls use /login controller
  * Common Roles Preconfigured
    * ROLE_ADMIN
    * ROLE_API
    * ROLE_ACCOUNT_GRANTER
* Grails Security UI
* Email Support
* jquery-ui
* famfamfam icons

# How to run
## Requirements
The only requirement you need is Java. You need to install JDK, Java Development Kit,  1.7 or above. I personally amd running version 1.8. You can download 1.8 JDK from [Oracle's Download](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) page.  

## Mac Or Linux Users
```bash
> git clone git@github.com:HybridProgrammer/grails-seed.git
> cd grails-seed
> ./grailsw run-app
```

## Windows Users
```bash
> git clone https://github.com/HybridProgrammer/grails-seed.git
> cd grails-seed
> ./grailsw.bat run-app
```
