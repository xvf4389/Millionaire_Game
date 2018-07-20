/**
 *
 * @author GandharParanjape and Oliver Soons
 */

package millionairegame;

import java.util.Random;

/**
 *
 * @author Oliver Soons and Gandhar Paranjape
 */

public class QuestionPool {
    
        public static String a, b, c, d;
        public static String answer;
        public static String question, input;
        public static int qNum;
        public int count;

        void QFormat() {
            System.out.println(question);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("(quit)" + " to quit.");
            System.out.println("(ata)" + " for ask the audience.");
            System.out.println("(paf)" + "phone a friend.");
            System.out.println("(5050)" + " to delete two incorrect answers.");
            }

    public String question() {
        return question;
    }
    
    public Integer count () {
        return count;
    }
    
    public String answer () {
        return answer;
    }
        
    public String a() {
        return a;
    }
    public String b() {
        return b;
    }
    public String c() {
        return c;
    }
    public String d() {
        return d;
    }
    
    void getQuestion(){
        Random rand = new Random();
        count++;
        qNum = rand.nextInt(100)+1;
        switch (qNum) {
            case 1:
                question = "What is the IMF in business terms?";
                a = "International Monetary Fund";
                b = "International Management Federation";
                c = "International Military Fund ";
                d = "International Microscope Facility";
                answer = "a";
                break;
            case 2:
                question = "How did Alfred Nobel make his money?";
                a = "He invented duct tape";
                b = "He invented dynamite";
                c = "He invented diapers";
                d = "He sold butterflies";
                answer = "b";
                break;
            case 3:
                question = "Which car company makes the Celica?";
                a = "Holden";
                b = "Nissan";
                c = "Toyota";
                d = "Subaru";
                answer = "c";
                break;
            case 4:
                question = "What does an alopecia sufferer lack?";
                a = "Red blood cells";
                b = "Skin pigment";
                c = "Finger nails";
                d = "Hair";
                answer = "d";
                break;
            case 5:
                question = "A group of sheep is called a flock, what is a group of owls called?";
                a = "Parliament";
                b = "Gather";
                c = "Crowd";
                d = "Herd";
                answer = "a";
                break;
            case 6:
                question = "Which part of the human body contains the most gold?";
                a = "Brain";
                b = "Toenails";
                c = "Lungs";
                d = "Femur";
                answer = "b";
                break;
            case 7:
                question = "Which country do Sinologists study?";
                a = "Japan";
                b = "Singapore";
                c = "China";
                d = "Korea";
                answer = "c";
                break;
            case 8:
                question = "Clyde Tonbaugh discovered what planet in 1930?";
                a = "Saturn";
                b = "Uranus";
                c = "Neptune";
                d = "Pluto";
                answer = "d";
                break;
            case 9:
                question = "Robin Williams dressed in drag for which 1993 film?";
                a = "Mrs. Doubtfire";
                b = "Aladdin";
                c = "Dead Poets Society";
                d = "Jumanji";
                answer = "a";
                break;
            case 10:
                question = "Broccoli belongs to the same family as which vegetable?";
                a = "Onion";
                b = "Cabbage";
                c = "Potato";
                d = "Beetroot";
                answer = "b";
                break;
            case 11:
                question = "Who wrote about Willie Wonka and the Chocolate Factory?";
                a = "William Steig";
                b = "Judy Blume";
                c = "Roald dahl";
                d = "Enid Blyton";
                answer = "c";
                break;
            case 12:
                question = "Which group believes in The Great Architect of the Universe?";
                a = "KKK";
                b = "Illuminati";
                c = "Carbonari";
                d = "Freemasons";
                answer = "d";
                break;
            case 13:
                question = "Portugal has had siz Kings with which first name?";
                a = "John";
                b = "Edward";
                c = "Steven";
                d = "George";
                answer = "a";
                break;
            case 14:
                question = "In which country would you find the Negev desert?";
                a = "Egypt";
                b = "Israel";
                c = "Iran";
                d = "Iraq";
                answer = "b";
                break;
            case 15:
                question = "Which character has been played by the most actors?";
                a = "Doctor Who";
                b = "Batman";
                c = "Sherlock Holmes";
                d = "James Bond";
                answer = "c";
                break;
            case 16:
                question = "What animals name translates as water horse?";
                a = "Sea Lion";
                b = "Narwhal";
                c = "Walrus";
                d = "Hippopotamus";
                answer = "d";
                break;
            case 17:
                question = "Which two metals are alloyed to make pewter?";
                a = "Tin and Lead";
                b = "Tin and Indium";
                c = "Tin and Zinc";
                d = "Tin and Bismuth";
                answer = "a";
                break;
            case 18:
                question = "Brisbane is the state capital of which Australian State?";
                a = "New South Wales";
                b = "Queensland";
                c = "Victoria";
                d = "South Australia";
                answer = "b";
                break;
            case 19:
                question = "Linus Torwalds invented and wrote what?";
                a = "Windows Computer Operating System";
                b = "Macintosh Computer Operating System";
                c = "Linux Computer Operating System";
                d = "All of the Above";
                answer = "c";
                break;
            case 20:
                question = "What is the staple food of one third of the worlds population?";
                a = "Bread";
                b = "Pasta";
                c = "Noodles";
                d = "Rice";
                answer = "d";
                break;
            case 21:
                question = "What digit does not exist in Roman Numerals?";
                a = "Zero";
                b = "One";
                c = "Two";
                d = "Three";
                answer = "a";
                break;
            case 22:
                question = "What is missing from ale that is included in beer?";
                a = "Water";
                b = "Hops";
                c = "Barley";
                d = "Yeast";
                answer = "b";
                break;
            case 23:
                question = "Who is the only American president that was elected unopposed?";
                a = "Theodore Roosevelt";
                b = "Abraham Lincoln";
                c = "George Washington";
                d = "William McKinley";
                answer = "c";
                break;
            case 24:
                question = "Which countries men use the most deodorant?";
                a = "Switzerland";
                b = "France";
                c = "The United States";
                d = "Japan";
                answer = "d";
                break;
            case 25:
                question = "What was the first credit card?";
                a = "Diners club";
                b = "Visa";
                c = "Mastercard";
                d = "American Express";
                answer = "a";
                break;
            case 26:
                question = "How did King George II die?";
                a = "Stabbed";
                b = "Fell off the toilet";
                c = "Tripped on a rock";
                d = "Fell off his horse";
                answer = "b";
                break;
            case 28:
                question = "Which sea on Earth has no beaches?";
                a = "Red Sea";
                b = "Tasman Sea";
                c = "Sargasso Sea";
                d = "Meditterranean Sea";
                answer = "c";
                break;
            case 27:
                question = "What is six inches taller in summer?";
                a = "Sky Tower";
                b = "Empire State Building";
                c = "Statue of Liberty";
                d = "Eiffel Tower";
                answer = "d";
                break;
            case 29:
                question = "Who did the USA buy the Virgin Islands from?";
                a = "Denmark";
                b = "Switzerland";
                c = "Sweden";
                d = "Canada";
                answer = "a";
                break;
            case 30:
                question = "What is the main ingredient of the sauce Lyonnaise?";
                a = "Oil";
                b = "Onion";
                c = "Tomato";
                d = "Chilli";
                answer = "b";
                break;
            case 31:
                question = "A pearman is what type of fruit?";
                a = "Orange";
                b = "Pear";
                c = "Apple";
                d = "Mandarin";
                answer = "c";
                break;
            case 32:
                question = "A bind is a group of what type of fish?";
                a = "Kingfish";
                b = "Tuna";
                c = "Trout";
                d = "Salmon";
                answer = "d";
                break;
            case 33:
                question = "What does a galactophagist drink?";
                a = "Milk";
                b = "Water";
                c = "Lemon Juice";
                d = "Vegetable Oil";
                answer = "a";
                break;
            case 34:
                question = "What were the first false teeth made from?";
                a = "Plastic";
                b = "Ivory";
                c = "Clay";
                d = "Wood";
                answer = "b";
                break;
            case 35:
                question = "What is a baby whale called?";
                a = "Doe";
                b = "Child";
                c = "Calf";
                d = "Grub";
                answer = "c";
                break;
            case 36:
                question = "With which organ does a snake hear?";
                a = "Nose";
                b = "Eyes";
                c = "Ears";
                d = "Tongue";
                answer = "d";
                break;
            case 37:
                question = "Which bird turns its head upside down to eat?";
                a = "Flamingo";
                b = "Kakapo";
                c = "Eagle";
                d = "Kingfisher";
                answer = "a";
                break;
            case 38:
                question = "Who invented popcorn?";
                a = "French";
                b = "Native Americans";
                c = "Chinese";
                d = "Maori";
                answer = "b";
                break;
            case 39:
                question = "Which item was originally called a Hanway?";
                a = "Door handle";
                b = "Table";
                c = "Umbrella";
                d = "Teapot";
                answer = "c";
                break;
            case 40:
                question = "What does a racoon do before eating its food?";
                a = "Spit on it";
                b = "Bury it";
                c = "Lick the surface of it";
                d = "Wash it in water";
                answer = "d";
                break;
            case 41:
                question = "Which Mediterranen countries orchestra is bigger than its army?";
                a = "Monaco";
                b = "Lebanon";
                c = "Cyprus";
                d = "Spain";
                answer = "a";
                break;
            case 42:
                question = "What is produced in a ginnery?";
                a = "Gin";
                b = "Cotton";
                c = "Silk";
                d = "Mead";
                answer = "b";
                break;
            case 43:
                question = "Which country grows the most potatoes?";
                a = "The United States";
                b = "New Zealand";
                c = "Russia";
                d = "Turkey";
                answer = "c";
                break;
            case 44:
                question = "What is the worlds most popular green vegatable?";
                a = "Brussel Sprouts";
                b = "Cabbage";
                c = "Broccoli";
                d = "Lettuce";
                answer = "d";
                break;
            case 45:
                question = "What is the worlds most widely used vegetable?";
                a = "Onion";
                b = "Lettuce";
                c = "Carrot";
                d = "Cauliflower";
                answer = "a";
                break;
            case 46:
                question = "Only approximately one third of the world uses what regularly?";
                a = "Toothbrush";
                b = "Fork";
                c = "Underwear";
                d = "Deodorant";
                answer = "b";
                break;
            case 47:
                question = "Males outnumber females by 5 to 1 in which addiction?";
                a = "Drug addiction";
                b = "Porn addiction";
                c = "Alcohol addiction";
                d = "Video game addiction";
                answer = "c";
                break;
            case 48:
                question = "What is the Roman Numeral for 1000?";
                a = "L";
                b = "T";
                c = "N";
                d = "M";
                answer = "d";
                break;
            case 49:
                question = "Which insect has the best eyesight?";
                a = "Dragonfly";
                b = "Honey bee";
                c = "Praying mantis";
                d = "Lady bird";
                answer = "a";
                break;
            case 50:
                question = "In which country did turkeys originate?";
                a = "Turkey";
                b = "The United States";
                c = "Spain";
                d = "Australia";
                answer = "b";
                break;
            case 51:
                question = "What colour is worn for funerals in Egypt?";
                a = "Black";
                b = "White";
                c = "Yellow";
                d = "Orange";
                answer = "c";
                break;
            case 52:
                question = "What is the main food of the oyster catcher bird?";
                a = "Salt";
                b = "Guppys";
                c = "Fruits";
                d = "Mussels";
                answer = "d";
                break;
            case 53:
                question = "What is a geo duck?";
                a = "A clam";
                b = "A duck";
                c = "A fish";
                d = "A rock";
                answer = "a";
                break;
            case 54:
                question = "What do the quarters of a hot cross bun symbolise?";
                a = "Four Saints";
                b = "Four Seasons";
                c = "Four Spirits";
                d = "Four Animals";
                answer = "b";
                break;
            case 55:
                question = "What is the smallest state of Australia?";
                a = "New South Wales";
                b = "Victoria";
                c = "Tasmania";
                d = "Queensland";
                answer = "c";
                break;
            case 56:
                question = "What is the national bird of India?";
                a = "Dove";
                b = "Swallow";
                c = "Eagle";
                d = "Peacock";
                answer = "d";
                break;
            case 57:
                question = "What does the word economy mean in original Greek?";
                a = "Home Management";
                b = "Money Management";
                c = "Home Safety";
                d = "Money Safety";
                answer = "a";
                break;
            case 58:
                question = "Which metal is the best conductor of electricity?";
                a = "Gold";
                b = "Silver";
                c = "Copper";
                d = "Lead";
                answer = "b";
                break;
            case 59:
                question = "What is the main flavour of aioli?";
                a = "Onion";
                b = "Carrot";
                c = "Garlic";
                d = "Turmeric";
                answer = "c";
                break;
            case 60:
                question = "What is the name of The Titanic's sister ship?";
                a = "The Fallen";
                b = "The Guardian";
                c = "The Savior";
                d = "The Olympic";
                answer = "d";
                break;
            case 61:
                question = "What country do brazil nuts come from?";
                a = "Bolivia";
                b = "Brazil";
                c = "Botswana";
                d = "Belgium";
                answer = "a";
                break;
            case 62:
                question = "In Australian slang, what is a dish licker?";
                a = "Somebody washing dishes";
                b = "A Dog";
                c = "A homeless person";
                d = "A hungry person";
                answer = "b";
                break;
            case 63:
                question = "In the wild, what animal pollinates bananas?";
                a = "Bees";
                b = "Butterflies";
                c = "Bats";
                d = "Spiders";
                answer = "c";
                break;
            case 64:
                question = "What colour is an aircraft's Black Box?";
                a = "Black";
                b = "White";
                c = "Green";
                d = "Orange";
                answer = "d";
                break;
            case 65:
                question = "What element was named after the Greek word for green?";
                a = "Chlorine";
                b = "Copper";
                c = "Uranium";
                d = "Bismuth";
                answer = "a";
                break;
            case 66:
                question = "What country do Great Danes come from?";
                a = "Denmark";
                b = "Germany";
                c = "Sweden";
                d = "Ukraine";
                answer = "b";
                break;
            case 67:
                question = "A Paris grocer was jailed in 1978 for stabbing his wife with what?";
                a = "A knife";
                b = "A pitchfork";
                c = "A wedge of cheese";
                d = "A doorstop";
                answer = "c";
                break;
            case 68:
                question = "Slugs have four what?";
                a = "Eyes";
                b = "Ears";
                c = "Stomachs";
                d = "Noses";
                answer = "d";
                break;
            case 69:
                question = "The average Britain consumes 4907 of these in his lifetime?";
                a = "Loaves of bread";
                b = "Boxes of tea";
                c = "Tubs of margerine";
                d = "Scones";
                answer = "a";
                break;
            case 70:
                question = "Who failed his entrance exams to shcool aged 16?";
                a = "Edison";
                b = "Einstein";
                c = "Tesla";
                d = "Rutherford";
                answer = "b";
                break;
            case 71:
                question = "What does the Greek name Vanessa mean?";
                a = "Cockroach";
                b = "Lamp post";
                c = "Butterfly";
                d = "Tiger lily";
                answer = "c";
                break;
            case 72:
                question = "What is the world's most popular first name?";
                a = "John";
                b = "Lucy";
                c = "Pierre";
                d = "Mohammed";
                answer = "d";
                break;
            case 73:
                question = "What is never shown in a Las Vegas casino?";
                a = "The time";
                b = "Food";
                c = "Drinks";
                d = "Ankle";
                answer = "a";
                break;
            case 74:
                question = "Ananas is French for what fruit?";
                a = "Bananas";
                b = "Pineapples";
                c = "Lemons";
                d = "Tangerine";
                answer = "b";
                break;
            case 75:
                question = "In which country did stamp collecting start?";
                a = "Sweden";
                b = "New Zealand";
                c = "France";
                d = "China";
                answer = "c";
                break;
            case 76:
                question = "What is the SI unit if illumination?";
                a = "Lumen";
                b = "Candela";
                c = "Flux";
                d = "Lux";
                answer = "d";
                break;
            case 77:
                question = "What country does French toast come from?";
                a = "Italy";
                b = "France";
                c = "Spain";
                d = "Taiwan";
                answer = "a";
                break;
            case 78:
                question = "What country first used pepper?";
                a = "Italy";
                b = "China";
                c = "France";
                d = "Japan";
                answer = "b";
                break;
            case 79:
                question = "What country has the most doughnut shops per capita?";
                a = "The United States";
                b = "New Zealand";
                c = "Canada";
                d = "France";
                answer = "c";
                break;
            case 80:
                question = "What is the most popular tooth brush colour?";
                a = "Red";
                b = "White";
                c = "Green";
                d = "Blue";
                answer = "d";
                break;
            case 81:
                question = "How many ponies did the pony express use?";
                a = "none";
                b = "one";
                c = "five";
                d = "ten";
                answer = "a";
                break;
            case 82:
                question = "What did Walt Disney admit her was afraid of?";
                a = "Lions";
                b = "Mice";
                c = "Clowns";
                d = "Ghosts";
                answer = "b";
                break;
            case 83:
                question = "Which European countries flag is square?";
                a = "England";
                b = "Sweden";
                c = "Switzerland";
                d = "Spain";
                answer = "c";
                break;
            case 84:
                question = "What is in the tyres of a commercial airliner?";
                a = "Nails";
                b = "Carbon Dioxide";
                c = "Rubber";
                d = "Nitrogen";
                answer = "d";
                break;
            case 85:
                question = "What has 12,000 eyes?";
                a = "Butterfly";
                b = "Goat";
                c = "Earth Worm";
                d = "House Fly";
                answer = "a";
                break;
            case 86:
                question = "What country is the largest exporter of frog legs?";
                a = "France";
                b = "Japan";
                c = "New Zealand";
                d = "Pakistan";
                answer = "b";
                break;
            case 87:
                question = "What country has an international dialing code of 86?";
                a = "India";
                b = "Egypt";
                c = "China";
                d = "Australia";
                answer = "c";
                break;
            case 88:
                question = "What colour is Bilbo's door in the Hobbit?";
                a = "Blue";
                b = "Red";
                c = "Brown";
                d = "Green";
                answer = "d";
                break;
            case 89:
                question = "What is Thalassaphobia a fear of?";
                a = "Sea";
                b = "Frogs";
                c = "Grass";
                d = "Thailand";
                answer = "a";
                break;
            case 90:
                question = "What country won first Miss World contest?";
                a = "England";
                b = "Sweden";
                c = "Australia";
                d = "Germany";
                answer = "b";
                break;
            case 91:
                question = "What colour is caffeine?";
                a = "Yellow";
                b = "Green";
                c = "White";
                d = "Brown";
                answer = "c";
                break;
            case 92:
                question = "What primate excluding humans can have blue eyes?";
                a = "Aligator";
                b = "Monkey";
                c = "Orangutan";
                d = "Black Lemur";
                answer = "d";
                break;
            case 93:
                question = "4000 people each year are injured by which household item?";
                a = "Teapots";
                b = "Towels";
                c = "Toothbrushes";
                d = "Phones";
                answer = "a";
                break;
            case 94:
                question = "The US eat the most ice cream per capita, which country is second?";
                a = "Australia";
                b = "New Zealand";
                c = "Germany";
                d = "Russia";
                answer = "b";
                break;
            case 95:
                question = "In cooking, how many drops are a dash?";
                a = "2";
                b = "10";
                c = "6";
                d = "3";
                answer = "c";
                break;
            case 96:
                question = "Where was volleyball invented?";
                a = "Brazil";
                b = "China";
                c = "Germany";
                d = "france";
                answer = "d";
                break;
            case 97:
                question = "Eight percent of people in the world have an extra what?";
                a = "Rib";
                b = "Toe";
                c = "Tooth";
                d = "Eye";
                answer = "a";
                break;
            case 98:
                question = "Catch 22 had what original name?";
                a = "Catch";
                b = "Catch 18";
                c = "Catch 24";
                d = "Catch me";
                answer = "b";
                break;
            case 99:
                question = "What is the tail fin of a fish called?";
                a = "Catch fin";
                b = "Hard fin";
                c = "Caudal Fin";
                d = "Tail fin";
                answer = "c";
                break;
            case 100:
                question = "The average American consumes 5666 what in a lifetime?";
                a = "Bananas";
                b = "Apples";
                c = "Bacon strips";
                d = "Fried eggs"; 
                answer = "d";
                break;
            default:
                break;
        }
    }


}

