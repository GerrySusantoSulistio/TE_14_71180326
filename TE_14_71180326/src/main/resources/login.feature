Feature: feature to test login functionality

  Scenario: periksa login dengan akun yang benar
    Given Browser dibuka
    And user berada di halaman login
    When Semua data telah terisi
    And tombol login ditekan
    Then user redirect ke halaman utama
