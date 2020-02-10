/*
package basics

System.getProperties().put("proxySet", "true");
System.getProperties().put("httpProxy.host", "tfsproxy.tfs.toyota.com");
System.getProperties().put("httpProxy.port", "80");

System.getProperties().put("proxyHost", "tfsproxy.tfs.toyota.com");
System.getProperties().put("proxyPort", "80");

@Grab('org.springframework:spring-orm:3.2.5.RELEASE')
import org.springframework.jdbc.core.JdbcTemplate

@Grapes([

        @Grab('org.apache.commons:commons-lang3:3.9'),
        @GrabConfig(systemProperties='httpProxy.host=tfsproxy.tfs.toyota.com,httpProxy.port=80')
])

import org.apache.commons.lang3.text.WordUtils

String name = "Daniel Anthony Vega"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)
*/
