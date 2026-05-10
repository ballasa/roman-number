# Convertitore Roman Number

```text
////////////////////////////////////////////////////////////////////
// SARA BALLARDIN 2101048
// DAVIDE LOPARCO 2101088
////////////////////////////////////////////////////////////////////
```

[![Java CI](https://github.com/ballasa/roman-number/actions/workflows/ci.yml/badge.svg)](https://github.com/ballasa/roman-number/actions/workflows/ci.yml)

[![Coverage Status](https://coveralls.io/repos/github/ballasa/roman-number/badge.svg?branch=feature%2Fcode-revision)](https://coveralls.io/github/ballasa/roman-number?branch=feature/code-revision)

## Descrizione
Prova pratica per il corso di Metodi e Tecnologie per lo Sviluppo Software. Convertitore per i primi 1000 numeri interi da arabi a romani con stampa in ASCII art. Lo sviluppo è stato guidato dai principi di Test-Driven Development (TDD) e Continuous Integration.

## Organizzazione
Le attività sono state organizzate tramite una Project Board su GitHub e distribuite tra i membri del gruppo utilizzando il sistema di Issue Tracking.
Lo sviluppo ha seguito il modello di branching Git Flow. Tutte le integrazioni sui branch principali sono avvenute tramite Pull Request e ogni singola PR aperta da un membro del team è stata revisionata e approvata dall'altro membro prima di effettuare il Merge.

## Requisiti soddisfatti
* Inizializzazione e gestione del progetto tramite Maven, utilizzando l'archetipo maven-archetype-quickstart.
* Continuous Integration: automazione della build attraverso una pipeline implementata con GitHub Actions, attivata ad ogni Push e Pull Request.
* Testing unitario: realizzazione di test con JUnit adottando il pattern AAA (Arrange, Act, Assert) e applicando i principi A-TRIP e Right-BICEP.
* Code coverage: la copertura del codice è superiore all'85%. Il calcolo è effettuato tramite plugin JaCoCo e i risultati sono integrati e pubblicati automaticamente su Coveralls.
* Analisi statica: verifica della qualità del codice configurata con Checkstyle. Il sistema garantisce il rispetto dei vincoli e la presenza di violazioni fa fallire automaticamente la build.