Feature: My cart | Buy multiple items
  AS A customer
  I WANT TO have a possibility to add few products in cart
  SO THAT customer can make multiple product purchase


  #AC1
  Scenario Outline: Guest user can buy few products in one Order
    When I add product '<firstProduct>' to the cart
    Then Product '<firstProduct>' is added to the cart
    And I add product '<secondProduct>' to the cart
    Then Product '<secondProduct>' is added to the cart
    And Cart contains two products
     #AC2
    Given I navigate to cart page
    And I click proceed to checkout
    When I have successfully entered their personal information
    And I have successfully entered their address information
    And I select default shipping method
    And I select payment with bank wire
    Then Order confirmation page is opened
    And Products displayed on order confirmation page

    Examples:
    | firstProduct                | secondProduct            |
    | Hummingbird printed sweater | Mug The adventure begins |

    @CreateAccount
  Scenario Outline: Registered user can buy few products in one Order
    When I add product '<firstProduct>' to the cart
    Then Product '<firstProduct>' is added to the cart
    And I add product '<secondProduct>' to the cart
    Then Product '<secondProduct>' is added to the cart
    And Cart contains two products
     #AC2
    Given I navigate to cart page
    And I click proceed to checkout
    And I have successfully entered their address information
    And I select default shipping method
    And I select payment with bank wire
    Then Order confirmation page is opened
    And Products displayed on order confirmation page

    Examples:
      | firstProduct                | secondProduct            |
      | Hummingbird printed sweater | Mug The adventure begins |