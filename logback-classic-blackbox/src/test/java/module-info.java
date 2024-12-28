module logback.classic.blackbox {
    requires java.xml;
    requires ch.qos.logback.core;
    requires ch.qos.logback.classic;

    requires janino;

    requires dom4j;
    requires greenmail;

    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;
    requires org.slf4j;

    requires java.logging;

    exports ch.qos.logback.classic.blackbox.joran;
    exports ch.qos.logback.classic.blackbox.joran.conditional;
    exports ch.qos.logback.classic.blackbox.html;
    exports ch.qos.logback.classic.blackbox.net;
}