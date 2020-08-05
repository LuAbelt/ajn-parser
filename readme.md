# AJN Parser

### Szenario
ich habe eine Java Anwendung (JAR) aus dem Jahr 2004 (!) welche damals noch mit Java 1.4 kompiliert und mit `JShrink` verschleiert wurde.

Diese läuft weiterhin völlig Problemlos unter Java 8.

Der Author dieser Anwendung ist leider vor einigen Jahren verstorben, der original Quellcode wurde damals natürlich nicht in einem VCS gepflegt und ist auch sonst nicht auffindbar :cry: 

### Problem

Beim starten der Anwendung wird eine extra Datei eingelesen, in dieser Datei stehen nach einem Algorithmus bzw. mittels Byte Shifting Informationen (148 Byte, 6 Datensätze).

Ich habe es geschafft, die JAR halbwegs vernünftig zu dekompilieren, den Kauderwelsch zu verstehen und nur die nötigsten Klassen raus zu filtern, und den korrekten Inhalt der Datei sauber auf der Konsole auszugeben.

### Inhalt
Die Datei [ajn.txt](./src/ajn.txt) enthält nach dem entschlüsseln folgende Informationen:

```text
parse ajn.txt 
hash: 2a97e05f65d698cd031cf55cdde0280d | size: 198326
hash: fb8f1bacb71faa067e73c35d078ba4bc | size: 205734
hash: 3b2ab41e66006d07eba9fedeefd17f67 | size: 266928
hash: b2590bf06a08197501f64e6c587ff9ba | size: 308572
hash: 653f4d793595e65bbbe58c0c55620589 | size: 313164
hash: 7633dfc47997b6f0cbd83960350028d7 | size: 313274
read finished
```

Ein Eintrag besteht immer aus `hash` und `size` :heavy_exclamation_mark: 

# Run
- der Code muss mit einer 1.8 JDK gebaut werden
- das Module language Level muss auf `5` stehen
- es liegt eine fertige RUN Configuration für InteliJ IDEA bei.

# Ziel

Ich möchte:
- Einträge hinzufügen können
- Einträge entfernen können

## Obolus
Als Bezahlung winken **100€** :heavy_exclamation_mark:  
