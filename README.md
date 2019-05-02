# Kotlin Memer
[![Latest GitHub tag](https://img.shields.io/github/tag-date/BricoloDuDimanche/KotlinMemer.svg?style=flat-square)](https://github.com/BricoloDuDimanche/Basalt/releases)
[![License](https://img.shields.io/github/license/BricoloDuDimanche/KotlinMemer.svg?style=flat-square)](https://github.com/BricoloDuDimanche/Basalt/blob/master/LICENSE)
[![Discord](https://img.shields.io/badge/chat-on%20Discord%20(%23kotlin--memer)-7289DA.svg?style=flat-square)](https://discord.gg/V82UXC5)
[![Donate](https://img.shields.io/badge/donate-Patreon-F96854.svg?style=flat-square)](https://www.patreon.com/Bowser65)

Kotlin wrapper for [Dank Memer imgen API](http://dankmemer.services)

## Example usage

```kotlin
val kotlinmemer = KotlinMemer("you dankmemer API key")

kotlinmemer.crab("raw api calls", "are gone") // Returns an InputStream, or null if something failed
```
