package models
/*
Fields:

     For each requested color id, an object with the following properties is returned:
        id - The color id.
        name (string) – The color name.
        base_rgb (array of numbers) – The base RGB values.
        cloth (object) – Detailed information on its appearance when applied on cloth armor.
        leather (object) – Detailed information on its appearance when applied on leather armor.
        metal (object) – Detailed information on its appearance when applied on metal armor.
        fur (object, optional) – Detailed information on its appearance when applied on fur armor.
        item (number) - ID of the dye item.
        categories (list of strings) - Color categories. Possible values:
        Hue: Gray, Brown, Red, Orange, Yellow, Green, Blue, Purple
        Material: Vibrant, Leather, Metal
        Rarity: Starter, Common, Uncommon, Rare, Exclusive

    The detailed information object contains the following properties:
        brightness (number) – The brightness.
        contrast (number) – The contrast.
        hue (number) – The hue in the HSL colorspace.
        saturation (number) – The saturation in the HSL colorspace.
        lightness (number) – The lightness in the HSL colorspace.
        rgb (list) – A list containing precalculated RGB values.

*/
/*
Connected Endpoints:
    None
*/
/*
Optional Parameters:
    lang=en
Call Options:
    https://api.guildwars2.com/v2/colors/10
    https://api.guildwars2.com/v2/colors --> List of all collors
    https://api.guildwars2.com/v2/colors/10?lang=en
*/
object Colors {
}