
@web
Feature: To verify ISEB pre-tests website is accessible

    Scenario: Verify English Test performed by candidate
        Given A candidate access ISEB pre-tests website
        When candidate clicks on english test link
        Then candidate should navigate to next Page to start test page
        And candidate clicks on Start test button
        Then user should navigate to Twins page and clicks on Next button
        Then candidate should navigate to next page to select twins correct answer
        And candidate selects "three quarters" of twins not identical and clicks on next button
        And candidate selects "They are about triplets" answers and clicks on next button
        Then candidate should navigate to Instructions page for short messages or sentences
        And candidate clicks on Next button
        And candidate selects "him" and clicks on Next button
        And candidate navigates to next question and selects "are" answers and clicks on Next button
        Then candidate should navigate to Instructions page for spelling and punctuations questions
        And candidate selects "climing mountains" answers and clicks on Next button
        And candidate selects "chop the ingredients" option and clicks on Next button
        And candidate selects "mum for permision" correct option and clicks on Next button
        Then candidate should reach to End of Test Page
        And candidate clicks on End of Test button
        Then candidate should navigate to Familiarisation Test page














