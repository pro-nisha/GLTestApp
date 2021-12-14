
@web
Feature: To verify ISEB pre-tests website is accessible

    Scenario: Verify English Test performed by candidate
        Given A candidate access ISEB pre-tests website
        When candidate clicks on english test link
        Then candidate should navigate to next Page to start test page
        And candidate clicks on Start test button
        Then user should navigate to Twins page and clicks on Next button
        Then candidate should navigate to next page to select twins correct answer





