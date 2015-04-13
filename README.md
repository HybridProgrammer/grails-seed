# grails-seed
Works with grails version 2.4.3

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
> grails run-app
