# jna-load-test

Reproduces https://github.com/java-native-access/jna/issues/1175 

Steps to reproduce:

1. Clone https://github.com/dmitry-timofeev/jna-load-test
2. Install libsodium via homebrew: `brew install libsodium`
3. Run `mvn test` with OpenJDK 14
