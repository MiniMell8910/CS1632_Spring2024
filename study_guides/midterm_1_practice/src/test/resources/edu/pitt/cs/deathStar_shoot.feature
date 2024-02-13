Feature: shoot interface

Background: 
  Given a Deathstar
  Given a Planet with 10 health

Rule: Deathstar shoots lol

  Scenario: if I shoot the planet it loses health
    When I shoot the planet
    Then it says: "Wimpy planet was hit by the superlaser!" and has -90 health