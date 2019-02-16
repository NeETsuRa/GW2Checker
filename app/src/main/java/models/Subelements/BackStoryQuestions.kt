package models.Subelements
/*
    id (integer) (default/null value: 0) - The id of the question.
    title (string) (default/null value: "") - The title (or name) of the question.
    description (string) (default/null value: "") - The description of the question; as displayed in-game when presented as a Biography choice during character creation.
    answers (array of integer) (default/null value: {}) - The list of answers for this question; resolvable against v2/backstory/answers.
    order (integer) (default/null value: 0) - The order in which this question is displayed in-game while answering your characters' Biography questions during character creation.
    races (array of string) (default/null value: {}) (Optional) - When present, an array of races that this question is presented to.
    professions (array of string) (default/null value: {}) (Optional) - When present, an array of professions that this question is presented to.
 */
class BackStoryQuestions {
}