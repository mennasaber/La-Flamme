package models

class Exams {

    fun getExam11(): ArrayList<ChooseQuestion> {
        val questionsList = ArrayList<ChooseQuestion>()
        questionsList.add(
            ChooseQuestion(
                question = "Christophe : Bonjour ! Vous parlez français ?\n" +
                        "Maria :  Bonjour ! Oui , je parle français . Je suis Maria , " +
                        "je suis italienne .\n" +
                        "Christophe : Moi , je suis Christophe , je suis français , je " +
                        "suis professeur et toi , comment tu t’appelles ?\n" +
                        "Peter : Je m’appelle Peter, je suis anglais , j’ai 22 ans .\n" +
                        "Christophe : Vous habitez en France ?\n" +
                        "Maria : Oui , nous habitons dans un petit appartement à Nice .\n" +
                        "1. Ce dialogue est ………   .\n"
                ,
                r1 = "a. au journal",
                r2 = "b. en classe",
                r3 = "c. au Louvre",
                r4 = "d. à la maison",
                correct = 2
            )
        )

        questionsList.add(
            ChooseQuestion(
                question = "Christophe : Bonjour ! Vous parlez français ?\n" +
                        "Maria :  Bonjour ! Oui , je parle français . Je suis Maria , " +
                        "je suis italienne .\n" +
                        "Christophe : Moi , je suis Christophe , je suis français , je " +
                        "suis professeur et toi , comment tu t’appelles ?\n" +
                        "Peter : Je m’appelle Peter, je suis anglais , j’ai 22 ans .\n" +
                        "Christophe : Vous habitez en France ?\n" +
                        "Maria : Oui , nous habitons dans un petit appartement à Nice .\n" +
                        "2. Maria habite ……………….\n"
                ,
                r1 = "a. français",
                r2 = "b. anglais",
                r3 = "c. à Lyon",
                r4 = "d. à Nice",
                correct = 3
            )
        )

        questionsList.add(
            ChooseQuestion(
                question = "Christophe : Bonjour ! Vous parlez français ?\n" +
                        "Maria :  Bonjour ! Oui , je parle français . Je suis Maria , " +
                        "je suis italienne .\n" +
                        "Christophe : Moi , je suis Christophe , je suis français , je " +
                        "suis professeur et toi , comment tu t’appelles ?\n" +
                        "Peter : Je m’appelle Peter, je suis anglais , j’ai 22 ans .\n" +
                        "Christophe : Vous habitez en France ?\n" +
                        "Maria : Oui , nous habitons dans un petit appartement à Nice .\n" +
                        "3. Christophe est ……….\n"
                ,
                r1 = "a. professeur",
                r2 = "b. étudiant",
                r3 = "c. directeur",
                r4 = "d. docteur",
                correct = 0
            )
        )

        questionsList.add(
            ChooseQuestion(
                question = "Christophe : Bonjour ! Vous parlez français ?\n" +
                        "Maria :  Bonjour ! Oui , je parle français . Je suis Maria , " +
                        "je suis italienne .\n" +
                        "Christophe : Moi , je suis Christophe , je suis français , je " +
                        "suis professeur et toi , comment tu t’appelles ?\n" +
                        "Peter : Je m’appelle Peter, je suis anglais , j’ai 22 ans .\n" +
                        "Christophe : Vous habitez en France ?\n" +
                        "Maria : Oui , nous habitons dans un petit appartement à Nice .\n" +
                        "4. Peter est ……………….\n"
                ,
                r1 = "a. français",
                r2 = "b. anglais",
                r3 = "c. italien",
                r4 = "d. égyptien",
                correct = 1
            )
        )
///////////////////
        questionsList.add(
            ChooseQuestion(
                question = "En classe\n" +
                        "Le professeur : Bonjour !\n" +
                        "Les élèves : Bonjour monsieur !\n" +
                        "Le professeur : Comment tu t’appelles ?\n" +
                        "Laurent : Je m’appelle Laurent .\n" +
                        "Le professeur : Et toi ?\n" +
                        "Michel : Moi , Michel .\n" +
                        "Le professeur : Regardez au tableau !\n" +
                        "Les élèves : D’accord monsieur !\n" +
                        "1. Le professeur dit ………………\n"
                ,
                r1 = "a. bonjour",
                r2 = "b. au revoir",
                r3 = "c. merci",
                r4 = "d. bonsoir",
                correct = 0
            )
        )

        questionsList.add(
            ChooseQuestion(
                question = "En classe\n" +
                        "Le professeur : Bonjour !\n" +
                        "Les élèves : Bonjour monsieur !\n" +
                        "Le professeur : Comment tu t’appelles ?\n" +
                        "Laurent : Je m’appelle Laurent .\n" +
                        "Le professeur : Et toi ?\n" +
                        "Michel : Moi , Michel .\n" +
                        "Le professeur : Regardez au tableau !\n" +
                        "Les élèves : D’accord monsieur !\n" +
                        "2.Le 1er élève s’appelle \n"
                ,
                r1 = "a. Michel",
                r2 = "b. Laurent",
                r3 = "c. monsieur",
                r4 = "d. Jean",
                correct = 1
            )
        )

        questionsList.add(
            ChooseQuestion(
                question = "En classe\n" +
                        "Le professeur : Bonjour !\n" +
                        "Les élèves : Bonjour monsieur !\n" +
                        "Le professeur : Comment tu t’appelles ?\n" +
                        "Laurent : Je m’appelle Laurent .\n" +
                        "Le professeur : Et toi ?\n" +
                        "Michel : Moi , Michel .\n" +
                        "Le professeur : Regardez au tableau !\n" +
                        "Les élèves : D’accord monsieur !\n" +
                        "3.Le professeur dit aux élèves : …………. au tableau .\n"
                ,
                r1 = "a. écoutez",
                r2 = "b. répondez",
                r3 = "c. regardez",
                r4 = "d. mangez",
                correct = 2
            )
        )

        questionsList.add(
            ChooseQuestion(
                question = "En classe\n" +
                        "Le professeur : Bonjour !\n" +
                        "Les élèves : Bonjour monsieur !\n" +
                        "Le professeur : Comment tu t’appelles ?\n" +
                        "Laurent : Je m’appelle Laurent .\n" +
                        "Le professeur : Et toi ?\n" +
                        "Michel : Moi , Michel .\n" +
                        "Le professeur : Regardez au tableau !\n" +
                        "Les élèves : D’accord monsieur !\n" +
                        "4.Le professeur demande aux élèves ………… .\n"
                ,
                r1 = "a. leur âge",
                r2 = "b. leur nom",
                r3 = "c. leur adresse",
                r4 = "d. leur classe",
                correct = 1
            )
        )
        /////////////////
        questionsList.add(
            ChooseQuestion(
                question = "1. On salue le professeur ; on dit :……………………."
                ,
                r1 = "a. Salut",
                r2 = "b. Au revoir",
                r3 = "c. Merci",
                r4 = "d. Bonjour",
                correct = 3
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "2. Quand le professeur entre dans la classse ; les élèves ……….."
                ,
                r1 = "a. s’asseyent",
                r2 = "b. se lèvent",
                r3 = "c. applaudissent",
                r4 = "d. dorment",
                correct = 1
            )
        )

        //kjokj
        questionsList.add(
            ChooseQuestion(
                question = "3. Le professeur explique la leçon en classe ; les élèves ……….."
                ,
                r1 = "a. parlent",
                r2 = "b. écoutent",
                r3 = "c. marchent",
                r4 = "d. mangent",
                correct = 1
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "4. Tu salues un ami le matin ; tu dis :…………"
                ,
                r1 = "a. Bonsoir !",
                r2 = "b. Bonjour !",
                r3 = "c. Bonne nuit",
                r4 = "d. Au revoir",
                correct = 1
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "5. Pour saluer un ami ; tu dis : ………."
                ,
                r1 = "a. Ça va !",
                r2 = "b. Salut !",
                r3 = "c. Merci !",
                r4 = "d. Excuse-moi",
                correct = 1
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "6.Tu remercies un ami ; tu dis :………."
                ,
                r1 = "a. À plus",
                r2 = "b. Ça va !",
                r3 = "c. Merci",
                r4 = "d. Pardon",
                correct = 2
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "7. Tu prends  congé  de tes camarades ; tu dis :…………"
                ,
                r1 = "a. À plus !",
                r2 = "b. Bonjour !",
                r3 = "c. Merci !",
                r4 = "d. Pardon",
                correct = 0
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "8. Pour saluer ton père le soir ; tu dis :………."
                ,
                r1 = "a. Bonsoir",
                r2 = "b. au revoir",
                r3 = "c. Oui",
                r4 = "d. Non",
                correct = 0
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "9. Tu salues ton professeur ; tu dis : ………."
                ,
                r1 = "a. Merci !",
                r2 = "b. Bonjour monsieur ! ",
                r3 = "c. À plus !",
                r4 = "d. Bien merci !",
                correct = 1
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "10. Ton professeur te demande ton nom ; tu dis :…………"
                ,
                r1 = "a. Comment vous vous appelez ?",
                r2 = "b. Moi , c’est Mido",
                r3 = "c. Comment il s’appelle ?",
                r4 = "d. Il s’appelle Mido",
                correct = 1
            )
        )

        //////
        questionsList.add(
            ChooseQuestion(
                question = "1. Je …………………... garçon ."
                ,
                r1 = "a. es",
                r2 = "b. est",
                r3 = "c. suis",
                r4 = "d. as",
                correct = 2
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "2. Elle ……… Mervat ."
                ,
                r1 = "a. s’appelle",
                r2 = "b.  m’appelle",
                r3 = "c. t’appelles",
                r4 = "d. s’appellent",
                correct = 0
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "3. Tu ………. un ami ?"
                ,
                r1 = "a. suis",
                r2 = "b. ai",
                r3 = "c. as",
                r4 = "d. est",
                correct = 2
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "4. Il …… 15 ans  . "
                ,
                r1 = "a. ai",
                r2 = "b. a",
                r3 = "c. as",
                r4 = "d. est",
                correct = 1
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "5. Tu ……… français ?"
                ,
                r1 = "a. ai",
                r2 = "b. as",
                r3 = "c. a",
                r4 = "d. es",
                correct = 3
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "6. Elle ………. nouvelle ."
                ,
                r1 = "a. est",
                r2 = "b. es",
                r3 = "c. a",
                r4 = "d. es",
                correct = 0
            )
        )
        questionsList.add(
            ChooseQuestion(
                question = "7.  …………………… t’appelles - tu ?"
                ,
                r1 = "a. Qui",
                r2 = "b. Que",
                r3 = "c. Comment",
                r4 = "d. Quoi",
                correct = 2
            )
        )
        return questionsList
    }
}