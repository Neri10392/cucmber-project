Feature: Verifying adactinhotel login details

  Scenario Outline: Verifying adactinhotel login with valid credentials
    Given User is on adactin login page
    When User should enter valid "<username>" and "<password>"
    And Should click the login button
    And User should enter valid "<location>","<hotels>","<roomtype>","<roomnos>","<datein>","<dateout>","<adultPerRoom>" and "<childPerRoom>"
    And Should click search button
    And Should click radio button
    And Should click continue
    And Should enter valid details to book a hotel "<firstName>","<lastName>","<address>","<cardNo>","<cardType>","<expMonth>","<expYear>" and "<cvv>"
    And Should click book now button
    Then User should verify login successful

    Examples: 
      | username  | password      | location    | hotels         | roomtype | roomnos   | datein     | dateout    | adultPerRoom | childPerRoom | firstName   | lastName | address   | cardNo           | cardType         | expMonth  | expYear | cvv |
      | Neri10392 | Neri@1234 | Brisbane    | Hotel Creek    | Standard | 3 - Three | 05/10/2022 | 06/10/2022 | 1 - One      | 0 - None     | Neriyarasan | lenin    | Thanjavur | 1234567890098765 | American Express | December  |    2022 | 786 |
      | Neri10392 | Neri@1234 | Sydney      | Hotel Cornice  | Deluxe   | 2 - Two   | 06/10/2022 | 10/10/2022 | 4 - Four     | 4 - Four     | Vignesh     | Stalin   | Madurai   | 1234567890098765 | Master Card      | November  |    2022 | 123 |
      | Neri10392 | Neri@1234 | Melbourne   | Hotel Hervey   | Double   | 10 - Ten  | 07/10/2022 | 11/10/2022 | 2 - Two      | 3 - Three    | Bakkiyaraj  | Kumar    | Chennai   | 1234567890098765 | VISA             | October   |    2022 | 345 |
      | Neri10392 | Neri@1234 | Adelaide    | Hotel Sunshine | Deluxe   | 8 - Eight | 08/10/2022 | 12/10/2022 | 3 - Three    | 0 - None     | Arun        | Ravi     | Goa       | 1234567890098765 | American Express | December  |    2022 | 323 |
      | Neri10392 | Neri@1234 | London      | Hotel Cornice  | Standard | 9 - Nine  | 09/10/2022 | 13/10/2022 | 1 - One      | 1 - One      | Ravi        | Muthu    | Mumbai    | 1234567890098765 | VISA             | September |    2022 | 543 |
      | Neri10392 | Neri@1234 | New York    | Hotel Creek    | Double   | 7 - Seven | 05/10/2022 | 13/10/2022 | 4 - Four     | 2 - Two      | Muthu       | Arun     | Trichy    | 1234567890098765 | American Express | December  |    2022 | 654 |
      | Neri10392 | Neri@1234 | Los Angeles | Hotel Hervey   | Standard | 6 - Six   | 06/10/2022 | 14/10/2022 | 2 - Two      | 0 - None     | Guru        | Hari     | Chennai   | 1234567890098765 | Master Card      | November  |    2022 | 444 |
      | Neri10392 | Neri@1234 | Paris       | Hotel Sunshine | Deluxe   | 3 - Three | 07/10/2022 | 10/10/2022 | 3 - Three    | 3 - Three    | Saran       | Guru     | Bangalore | 1234567890098765 | Master Card      | October   |    2022 | 654 |
      | Neri10392 | Neri@1234 | Sydney      | Hotel Cornice  | Double   | 5 - Five  | 08/10/2022 | 11/10/2022 | 4 - Four     | 1 - One      | Hari        | Raja     | Kolkatta  | 1234567890098765 | American Express | November  |    2022 | 323 |
      | Neri10392 | Neri@1234 | Adelaide    | Hotel Creek    | Standard | 8 - Eight | 09/10/2022 | 12/10/2022 | 1 - One      | 0 - None     | Kumar       | lenin    | Delhi     | 1234567890098765 | VISA             | December  |    2022 | 786 |
