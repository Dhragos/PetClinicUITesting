Feature:
  Scenario: Check if the picture is displayed on main Page
    Given User has acces to MainPage
    When User clicks on HomePage button
    Then Validate if animal picture is displayed

    Scenario: Add a new veteranian
      Given User has acces to MainPage
      When User clicks on add new Veterinarian
      And User adds a new Veterinarian
      Then Validate the new veteranian was added

        Scenario: Add a new veteranian using invalid FirstName      //Bug Found - button is active
          Given User has acces to MainPage
          When User clicks on add new Veterinarian
          And User adds invalid FirstName as Veterinarian
          Then Validate if error message appears
          And Save Button should be inactive

          Scenario: Add a new Owner using valid phone
            Given User has acces to MainPage
            When User clicks on add new Owner
            Then User adds a new owner

            Scenario: Check if the new Owner has been added
              Given User has acces to MainPage
              When User displays all Owners
              Then Validate the new Owner has been added

              Scenario: Add a new Owner using invalid Phone
                Given User has acces to MainPage
                When User clicks on add new Owner
                And User adds Invalid data as Phone
                Then Validate if error message id displayed
                And Submit buton should be inactive
                And User should return to main page

                Scenario: Delete a new added veteranian and validate the deletion
                  Given User has acces to MainPage
                  When User displays all Veterinarians
                  And User deletes a new Veterinarian
                  Then Validate new veterinarian has been deleted

                  Scenario: Validate owner information has been added
                    Given User has acces to MainPage
                    And User displays all Owners
                    When User clicks on new owner
                    Then Owner information is displayed



