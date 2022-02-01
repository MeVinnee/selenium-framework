package snippet;

public class Snippet {
	name=PropertiesConfig
	property.filename = logs
	appenders = console, file
	
	appender.console.type = Console
	appender.console.name = STDOUT
	appender.console.layout.type = PatternLayout
	appender.console.layout.pattern = [%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n
	
	appender.file.type = File
	appender.file.name = LOGFILE
	appender.file.fileName=${filename}/propertieslogs.log
	appender.file.layout.type=PatternLayout
	appender.file.layout.pattern=[%-5level] %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %c{1} - %msg%n
	
	loggers=file
	logger.file.name=guru.springframework.blog.log4j2properties
	logger.file.level = debug
	logger.file.appenderRefs = file
	logger.file.appenderRef.file.ref = LOGFILE
	
	rootLogger.level = debug
	rootLogger.appenderRefs = stdout
	rootLogger.appenderRef.stdout.ref = STDOUT
}

