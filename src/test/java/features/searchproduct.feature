Feature: Search and place the order for product
@offerorder
Scenario Outline: Search Experience for product in both homepage and offers page

Given User is on GreenCart Landing page
When User searched for the product with shortname <Name> Extract actual name of product
Then User go and search with same shortname <Name> is offers page
And validate the product is retrive in offer page

Examples:
| Name |
| Tom  |
| Beet |
