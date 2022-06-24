#Author: your.email@your.domain.com

Feature: List Main Page


    
   Scenario Outline: Membuat banyak List
    Given User berada di Main Page
    When User menekan tombol add List
    And User memasukkan nama List baru "ListBaroeh"
    And User memasukkan item List yang ingin diinput1"barang1"
    And User memasukkan item List yang ingin diinput2"barang2"
    And User memasukkan item List yang ingin diinput3"barang3"
    And User memasukkan item List yang ingin diinput4"barang4"
    And User memasukkan item List yang ingin diinput5"barang5"
    Then User berpindah ke Main Page List lain dan Item List yang diinput muncul pada List"barang1""barang2""barang3""barang4""barang5"