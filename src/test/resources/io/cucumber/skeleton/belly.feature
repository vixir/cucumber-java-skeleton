Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 2 hour
    Then my belly should not growl


  Scenario: too many cukes
    Given I have 142 cukes in my belly
    When I wait 2 hour
    Then my belly should growl