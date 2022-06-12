Feature: feature to test register functionality
  
  Scenario: membuat akun baru
    Given Browser dibuka
    And user berada di halaman register
    When user memasukan email dan password
    And tombol create ditekan
    Then user redirect ke halaman login

