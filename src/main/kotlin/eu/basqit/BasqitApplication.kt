package eu.basqit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BasqitApplication

fun main(args: Array<String>) {
	runApplication<BasqitApplication>(*args)
}
