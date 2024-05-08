Bug reproduction.

Steps to reproduce:

1. run `./gradlew jsTest`
2. Notice how it goes into an infinite loop
3. Open up `BaseClass.kt`.
4. Remove the default parameter from the sayHello function.
5. Run `./gradlew jsTest` again.
6. See that it works as expected.