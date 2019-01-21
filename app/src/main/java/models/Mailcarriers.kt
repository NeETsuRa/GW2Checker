package models
/*
Fields:
    id (integer) (default/null value: 0) - The id of the mail carrier.
    unlock_items (array of numbers) (optional) - An array of item ids used to unlock the mailcarrier. Can be resolved against v2/items
    order (integer) (default/null value: 0) - The order in which the mailcarrier appears in a list.
    icon (string) (default/null value: "") - The icon uri for the mail carrier.
    name (string) (default/null value: "") - The name of the mailcarrier as it appears in-game.
    flags (array of strings)(default to an empty array) - Additional flags on the item, such as "Default"
*/
/*
Connected Endpoints:
    none
*/
/*
Optional Parameters:
    lang – (Optional) Request localized information.
    page - (Optional; integer)
    page_size - (Optional; integer)
    ids - (Optional; Comma Delimited List|all) Request an array of mail carriers for the specified ids or all mail carriers. Cannot be used when accessing the id endpoint.

Call Options:
    https://api.guildwars2.com/v2/mailcarriers/1
    https://api.guildwars2.com/v2/mailcarriers --> list of all mailcarriers
*/
object Mailcarriers {
}