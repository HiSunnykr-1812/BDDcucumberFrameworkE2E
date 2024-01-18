Feature: Search and place the order for product

Scenario Outline: Search Experience for product in both homepage and offers page

Given User is on GreenCart Landing page
When User searched for the product with shortname <Name> Extract actual name of product
And User added "3" selected producted to cart
Then User Proceeded to checkout and validate the <Name> is checkout page
And verify the user have promocode to enter



Examples:
| Name|
| Tom |

 