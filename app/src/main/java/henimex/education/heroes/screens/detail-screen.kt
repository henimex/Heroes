package henimex.education.heroes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import henimex.education.heroes.R
import henimex.education.heroes.models.Hero
import henimex.education.heroes.ui.theme.HeroesTheme

@Composable
fun HeroDetails(hero: Hero) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primaryContainer),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = hero.name,
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.padding(5.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Image(
                bitmap = ImageBitmap.imageResource(id = hero.image),
                contentDescription = hero.name,
                modifier = Modifier
                    .padding(5.dp)
                    .size(300.dp, 200.dp),
                )
            Text(
                text = hero.description,
                modifier = Modifier.padding(5.dp),
                fontSize = 10.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            TableRow("Speciality", hero.speciality)

            TableRow("Strength", hero.strength)
            TableRow("Intelligence", hero.intelligence)
            TableRow("Speed", hero.speed)
            TableRow("Durability", hero.durability)

            TableRow("Weakness", hero.weakSpot)
            TableRow("Mask Name", hero.maskName)
            TableRow("Mask Job", hero.maskJob)
            TableRow("Universe", hero.universe)
        }
    }
}

@Composable
fun TableRow(label:String, value:String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Transparent, RoundedCornerShape(4.dp))
            .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "$label ",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = ": $value",
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = Color.DarkGray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeroDetailsPreview() {
    HeroesTheme {
        //region Hero Data
        val superman = Hero(
            name = "SUPERMAN",
            speciality = "Super Strength, Flight, Heat Vision",
            universe = "DC",
            weakSpot = "Kryptonite",
            maskName = "Clark Kent",
            maskJob = "Journalist",
            description = "The last son of Krypton, Superman is a beacon of hope and justice. His incredible powers make him one of Earth's greatest protectors, and his compassion defines his heroism.",
            strength = "100",
            speed = "95",
            intelligence = "85",
            durability = "100",
            image = R.drawable.superman // Replace with your drawable resource for Superman
        )

        val batman = Hero(
            name = "BATMAN",
            speciality = "Tactical Genius, Martial Arts",
            universe = "DC",
            weakSpot = "No Superpowers",
            maskName = "Bruce Wayne",
            maskJob = "Billionaire Philanthropist",
            description = "The Dark Knight of Gotham, Batman uses his intellect, advanced gadgets, and mastery of martial arts to strike fear into the hearts of criminals.",
            strength = "80",
            speed = "70",
            intelligence = "100",
            durability = "75",
            image = R.drawable.batman // Replace with your drawable resource for Batman
        )

        val spiderMan = Hero(
            name = "SPIDER-MAN",
            speciality = "Agility, Wall-Crawling, Spider Sense",
            universe = "Marvel",
            weakSpot = "Emotional Vulnerability",
            maskName = "Peter Parker",
            maskJob = "Photographer",
            description = "A young hero balancing life and responsibility, Spider-Man’s wit and agility make him a formidable opponent to villains, while his compassion inspires those around him.",
            strength = "85",
            speed = "90",
            intelligence = "80",
            durability = "70",
            image = R.drawable.spiderman // Replace with your drawable resource for Spider-Man
        )

        val wonderWoman = Hero(
            name = "WONDER WOMAN",
            speciality = "Super Strength, Combat Mastery, Lasso of Truth",
            universe = "DC",
            weakSpot = "Magical Weakness",
            maskName = "Diana Prince",
            maskJob = "Diplomat",
            description = "An Amazon warrior and goddess, Wonder Woman is a symbol of strength, wisdom, and compassion. Her unbreakable will and combat skills make her an iconic hero.",
            strength = "95",
            speed = "85",
            intelligence = "90",
            durability = "90",
            image = R.drawable.wonder_woman // Replace with your drawable resource for Wonder Woman
        )

        val ironMan = Hero(
            name = "IRON MAN",
            speciality = "Advanced Technology, High Intelligence",
            universe = "Marvel",
            weakSpot = "Reliance on the Suit",
            maskName = "Tony Stark",
            maskJob = "Billionaire Inventor",
            description = "A genius inventor, Tony Stark built the Iron Man suit to protect the world from evil. His charm and brilliance are matched only by his commitment to heroism.",
            strength = "85",
            speed = "80",
            intelligence = "100",
            durability = "85",
            image = R.drawable.ironman // Replace with your drawable resource for Iron Man
        )

        val thor = Hero(
            name = "THOR",
            speciality = "God of Thunder, Mjolnir Wielding, Immortality",
            universe = "Marvel",
            weakSpot = "Overconfidence",
            maskName = "Thor Odinson",
            maskJob = "Asgardian Prince",
            description = "The Norse God of Thunder, Thor wields his enchanted hammer, Mjolnir, to protect the realms. His strength and courage are legendary.",
            strength = "95",
            speed = "80",
            intelligence = "75",
            durability = "95",
            image = R.drawable.thor // Replace with your drawable resource for Thor
        )

        val captainAmerica = Hero(
            name = "CAPTAIN AMERICA",
            speciality = "Enhanced Strength, Vibranium Shield, Leadership",
            universe = "Marvel",
            weakSpot = "Human Limitations",
            maskName = "Steve Rogers",
            maskJob = "Soldier",
            description = "The Sentinel of Liberty, Captain America is a super-soldier who embodies bravery and justice. With his iconic shield, he leads the Avengers into battle.",
            strength = "85",
            speed = "75",
            intelligence = "80",
            durability = "90",
            image = R.drawable.captain_america // Replace with your drawable resource for Captain America
        )

        val hulk = Hero(
            name = "HULK",
            speciality = "Unmatched Strength, Regeneration, Rage Power",
            universe = "Marvel",
            weakSpot = "Emotional Unpredictability",
            maskName = "Bruce Banner",
            maskJob = "Scientist",
            description = "When angered, Bruce Banner transforms into the Hulk, a green powerhouse with nearly limitless strength and durability.",
            strength = "100",
            speed = "70",
            intelligence = "80",
            durability = "100",
            image = R.drawable.hulk // Replace with your drawable resource for Hulk
        )

        val flash = Hero(
            name = "FLASH",
            speciality = "Super Speed, Time Travel, Speed Force",
            universe = "DC",
            weakSpot = "Energy Drain",
            maskName = "Barry Allen",
            maskJob = "Forensic Scientist",
            description = "The fastest man alive, Flash uses his connection to the Speed Force to save lives and fight crime, often outpacing time itself.",
            strength = "70",
            speed = "100",
            intelligence = "85",
            durability = "80",
            image = R.drawable.flash // Replace with your drawable resource for Flash
        )

        val greenLantern = Hero(
            name = "GREEN LANTERN",
            speciality = "Power Ring Constructs, Willpower",
            universe = "DC",
            weakSpot = "Willpower Dependency",
            maskName = "Hal Jordan",
            maskJob = "Test Pilot",
            description = "Wielding a power ring fueled by willpower, Green Lantern creates constructs of energy to defend the universe as part of the Green Lantern Corps.",
            strength = "85",
            speed = "80",
            intelligence = "85",
            durability = "80",
            image = R.drawable.greenlantern // Replace with your drawable resource for Green Lantern
        )

        val blackPanther = Hero(
            name = "BLACK PANTHER",
            speciality = "Enhanced Senses, Vibranium Suit\n",
            universe = "Marvel",
            weakSpot = "Dependence on Vibranium",
            maskName = "T’Challa",
            maskJob = "King of Wakanda",
            description = "As the ruler of Wakanda, Black Panther combines his natural abilities with advanced technology to protect his people and fight for global justice.",
            strength = "85",
            speed = "80",
            intelligence = "90",
            durability = "80",
            image = R.drawable.greenlantern // Replace with your drawable resource for Green Lantern
        )
        //endregion
        HeroDetails(batman);
    }
}