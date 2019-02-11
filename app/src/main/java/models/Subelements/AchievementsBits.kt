package models.Subelements
/*
        // type (string) - The type of bit. Can be Text, Item, Minipet, or Skin.
        // id (number, optional) - The ID of the item, mini, or skin, if applicable.
        // text (string, optional) - The text for the bit, if type is Text.
 */
class AchievementsBits {
    var type  : String? = null //(string) - The type of bit. Can be Text, Item, Minipet, or Skin.
    var id : Int? = null //(number, optional) - The ID of the item, mini, or skin, if applicable.
    var text  : String? = null //(string, optional) - The text for the bit, if type is Text.

    constructor()
    constructor(type: String?, id: Int?, text: String?) {
        this.type = type
        this.id = id
        this.text = text
    }
    constructor(bits: AchievementsBits) {
        this.type = bits.type
        this.id = bits.id
        this.text = bits.text
    }

    override fun toString(): String {
        return "AchievementsBits(type=$type, id=$id, text=$text)"
    }


}