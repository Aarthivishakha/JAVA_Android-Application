# Java tool triggers

Exactly 12 integrations are represented. Each trigger targets Android Java
sources under `app/src` or build outputs under `app/build`.

On this branch, analysis and Gradle run on JDK 21 while Android sources compile
to the platform-supported Java 17 level.

1. PMD + Lizard (`pmd-lizard`)
2. JaCoCo (`jacoco`)
3. PMD (`pmd`)
4. CPD (`cpd`)
5. PMD + Checkstyle (`pmd-checkstyle`)
6. SpotBugs + FindSecBugs (`spotbugs-findsecbugs`)
7. OWASP Dependency-Check / Grype (`dependency-security`)
8. JaCoCo branch proxy (`jacoco-branch-proxy`)
9. PIT (`pit`)
10. diff-cover + JaCoCo (`diff-cover-jacoco`)
11. custom def-use with JaCoCo + AST (`def-use-jacoco-ast`)
12. git / PyDriller (`git-pydriller`)
