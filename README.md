# Aufgabe: Fehlerbehebung im Restaurant-Projekt

## Ziel
Euer Ziel ist es, das Restaurant-Projekt fertigzustellen, indem ihr Fehler behebt und sicherstellt, dass alle Tests grün sind. Ihr arbeitet ausschließlich mit zwei Branches: `dev` und `main`.

## Vorgehensweise

1. **Erstelle den `dev`-Branch:**
   - Klone das Repository und wechsle zum `dev`-Branch:
     ```bash
     git checkout -b dev
     ```

2. **Fehler im Programm beheben:**
   - Analysiere den Code und behebe alle Fehler, die im Projekt vorhanden sind. Verwendet dazu die vorhandenen Tests, um sicherzustellen, dass die Fehler behoben sind.

3. **Regelmäßig committen und pushen:**
   - Macht regelmäßig Commits, um eure Fortschritte zu speichern:
     ```bash
     git add .
     git commit -m "Beschreibung des Fortschritts"
     git push origin dev
     ```

4. **Tests ausführen:**
   - Führt alle Tests regelmäßig aus, um sicherzustellen, dass keine Fehler mehr vorhanden sind und alle Tests grün sind.
5. **Tets hinzufügen**
   - Stellen Sie sicher, dass der name von Personen aus mindestens 5 Zeichen besteht.
   - Wenn nicht, soll eine Exception geworfen werden.
   - Implementieren Sie einen Test entsprechnden Test.
   
7. **Mergen in den `main`-Branch:**
   - Wenn alle Fehler behoben sind und alle Tests grün sind, führt den `dev`-Branch in den `main`-Branch zusammen:
     ```bash
     git checkout main
     git merge dev
     git push origin main
     ```

## Hinweise:
- Arbeitet regelmäßig in `dev` und pusht eure Änderungen, um die Arbeit nachvollziehbar zu machen.
- Wenn ihr auf Probleme stoßt, schaut euch die Fehlermeldungen und Testausgaben genau an und behebt die Probleme Schritt für Schritt.
