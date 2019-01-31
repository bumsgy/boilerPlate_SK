# boilerPlate_SK
Spring5.1.3 + Kotlin-target1.8 + mybatis + mysql



# lib Dependency
// https://mvnrepository.com/artifact/org.springframework/spring-core
//    implementation group: 'org.springframework', name: 'spring-core', version: '5.1.3.RELEASE'
// annotation 13.0, core 5.1.3 , jcl 5.1.3

// https://mvnrepository.com/artifact/org.springframework/spring-context
//    implementation group: 'org.springframework', name: 'spring-context', version: '5.1.3.RELEASE'
// aop5.1.3, beans5.1.3, context5.1.3 expression5.1.3

//beans는 이미 있어서, 다시 선언 안 함.

// https://mvnrepository.com/artifact/org.springframework/spring-webmvc
//    implementation group: 'org.springframework', name: 'spring-webmvc', version: '5.1.3.RELEASE'
// web5.1.3, webmvc5.1.3

//    implementation group: 'org.springframework', name: 'spring-aop', version: '5.1.3.RELEASE'
// aop, beans, core, jcl

//    implementation group: 'org.springframework', name:'spring-beans', version: '5.1.3.RELEASE'
// beans, core, jcl

//    implementation group: 'org.springframework', name: 'spring-context', version: '5.1.3.RELEASE'
// aop, beans, context, core, expression, jcl

//    implementation group: 'org.springframework', name: 'spring-context-support', version: '5.1.3.RELEASE'
// aop, beans, context, context-support, expression, jcl

//    implementation group: 'org.springframework', name:'spring-expression', version: '5.1.3.RELEASE'
// core, expression, jcl
// https://mvnrepository.com/artifact/org.springframework/spring-jdbc
//    compile group: 'org.springframework', name: 'spring-jdbc', version: '5.1.3.RELEASE'

//    implementation group: 'org.springframework', name: 'spring-jdbc', version: '5.1.3.RELEASE'
// beans, core, jcl, jdbc, tx

//      implementation group: 'org.springframework', name: 'spring-orm', version: '5.1.3.RELEASE'
// beans, core, jcl, jdbc, orm, tx

//    implementation group: 'org.springframework', name:'spring-tx', version: '5.1.3.RELEASE'
// beans, core, jcl, tx

//    implementation group: 'org.springframework', name:'spring-web', version: '5.1.3.RELEASE'
// beans, core, jcl, tx

//    implementation group: 'org.springframework', name:'spring-webmvc', version: '5.1.3.RELEASE'
// aop, beans, context, core, expression, jcl, web, webmvc

//    implementation group: 'commons-logging', name: 'commons-logging', version: '1.2'      // slf4j가 의존성이 있는지 모르겠음. 일단 주석해 놓고 해 봄 -> 의존성 없는듯.
// commons-logging


implementation group: 'org.slf4j', name: 'slf4j-api', version: '1.7.25'
// slf4j-api

testCompile group: 'ch.qos.logback', name: 'logback-classic', version: '1.2.3'
// logback-core, logback-classic, slf4j-api

implementation group:'com.fasterxml.jackson.core',name:'jackson-annotations',version:'2.9.7'
implementation group:'com.fasterxml.jackson.core',name:'jackson-core',version:'2.9.7'

// @Responsebody 시 각 값을 json 형식으로 변환해 주는데, 필요함.
implementation group:'com.fasterxml.jackson.core',name:'jackson-databind',version:'2.9.7'

// jackson-module-kotlin : 서버 기동 시 추가하라고 있어서 추가.
implementation group: 'com.fasterxml.jackson.module', name: 'jackson-module-kotlin', version: '2.9.7'

implementation group: 'org.mariadb.jdbc', name: 'mariadb-java-client', version: '2.3.0'
// mariadb-java-client

implementation group: 'org.mybatis', name: 'mybatis', version: '3.4.6'
    // mybatis

implementation group: 'org.mybatis', name: 'mybatis-spring', version: '1.3.2'
// mybatis-spring
