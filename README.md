# Kotlin Memer
[![Latest GitHub tag](https://img.shields.io/github/tag-date/BricoloDuDimanche/KotlinMemer.svg?style=flat-square)](https://github.com/BricoloDuDimanche/Basalt/releases)
[![License](https://img.shields.io/github/license/BricoloDuDimanche/KotlinMemer.svg?style=flat-square)](https://github.com/BricoloDuDimanche/Basalt/blob/master/LICENSE)
[![Discord](https://img.shields.io/badge/chat-on%20Discord%20(%23kotlin--memer)-7289DA.svg?style=flat-square)](https://discord.gg/V82UXC5)
[![Donate](https://img.shields.io/badge/donate-Patreon-F96854.svg?style=flat-square)](https://www.patreon.com/Bowser65)

Kotlin wrapper for [Dank Memer imgen API](http://dankmemer.services)

## Installation

### Gradle

Add the JitPack repository
```gradle
repositories {
    ...
    maven { url 'https://jitpack.io' }
}
```

And add the dependency
```gradle
dependencies {
    implementation 'com.github.BricoloDuDimanche:KotlinMemer:...'
}
```

### Maven

Add the JitPack repository
```xml
<repositories>
 	<repository>
 	  <id>jitpack.io</id>
 	  <url>https://jitpack.io</url>
 	</repository>
 </repositories>
```

And add the dependency
```xml
<dependency>
  <groupId>com.github.BricoloDuDimanche</groupId>
	<artifactId>KotlinMemer</artifactId>
	<version>...</version>
</dependency>
```

## Example usage

```kotlin
val kotlinmemer = KotlinMemer("your dankmemer API key")

kotlinmemer.crab("raw api calls", "are gone") // Returns an InputStream, or null if something failed
```
