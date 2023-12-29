package com.mongodb.app.games

import android.content.res.Resources
import com.mongodb.app.R

/* Returns initial list of games. */
fun gameList(resources: Resources): List<Game> {
    return listOf(
        Game(
            id = 1,
            name = "Valorant",
            image = R.mipmap.valorant_foreground,
            description = "Valorant is a free-to-play first-person hero shooter developed and" +
                    " published by Riot Games, for Microsoft Windows."
        ),
        Game(
            id = 2,
            name = "Fortnite",
            image = R.mipmap.fortnite_foreground,
            description = "Fortnite is an online video game developed by Epic Games and released in 2017"
        ),
        Game(
            id = 3,
            name = "Apex Legends",
            image = R.mipmap.apex,
            description = "Apex Legends is a free-to-play battle royale-hero shooter game developed " +
                    "by Respawn Entertainment and published by Electronic Arts."
        ),
        Game(
            id = 4,
            name = "Dragon Ball FighterZ",
            image = R.mipmap.dbz_foreground,
            description = "Dragon Ball FighterZ is a 2.5D fighting game, developed by Arc System Works and published by Bandai Namco Entertainment."
        ),
        Game(
            id = 5,
            name = "Super Smash Bros.",
            image = R.mipmap.smash_foreground,
            description = "Super Smash Bros. is a crossover fighting game series published by Nintendo, " +
                    "and primarily features characters from various Nintendo franchises."
        ),
        Game(
            id = 6,
            name = "League of Legends",
            image = R.mipmap.lol_foreground,
            description = "League of Legends, commonly referred to as League, is a 2009 multiplayer " +
                    "online battle arena video game developed and published by Riot Games."
        ),
        Game(
            id = 7,
            name = "Dota",
            image = R.mipmap.dota_foreground,
            description = "Dota is a series of strategy video games now developed by Valve."
        ),
        Game(
            id = 8,
            name = "Counter-Strike: Global Offensive",
            image = R.mipmap.csgo_foreground,
            description = "Counter-Strike: Global Offensive is a multiplayer first-person shooter " +
                    "developed by Valve and Hidden Path Entertainment"
        ),
        Game(
            id = 9,
            name = "Tom Clancy's Rainbow Six Siege",
            image = R.mipmap.r6_foreground,
            description = "Tom Clancy's Rainbow Six Siege is an online tactical shooter video game " +
                    "developed by Ubisoft Montreal and published by Ubisoft."
        ),
        Game (
            id = 10,
            name = "Rocket League",
            image = R.mipmap.rocket_foreground,
            description = "Rocket League is a vehicular soccer video game developed and published " +
                    "by Psyonix."
        )
    )
}