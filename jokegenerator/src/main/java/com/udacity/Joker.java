package com.udacity;

import java.util.Random;

public class Joker {

    private static String[] jokeReactor = new String[]{
            "- Two Android phone are walking in the desert. Which of them is 2.2?\n" +
                    "- The one who called \"Froyo\"",
            "Question: Definition of an upgrade?\n" +
                    "Answer: Take old bugs out, put new ones in.\n",
            "Chuck Norris runs Android on his I-Phone.",
            "An Android app walks into a bar. Bartender asks, \"Can I get you a drink?\" " +
                    "The app looks disappointed and says, \"That wasn't my intent.\"",
            "A fragment walks into a bar and says, \"I'm lost. Can I please speak to the " +
                    "FragmentManager?\"",
            "A pregnant fragment walks into a bar. The bartender says, \"Whoa! Whoa! We don't" +
                    " support nested fragments here!\"",
            "Your first Android app walks into a hotel and asks for a room with an upright bed." +
                    " \"Why?\" asks the concierge. \"I haven't implemented my horizontal yet\".\n",
            "A fragment walks into a bar, and the bartender asks for an ID. Fragment says, \"I" +
                    " don't have an ID.\" So the bartender says, \"Okay, I'll make a " +
                    "NullPointerException.\""};

    public static String getRandomJoke() {
            final Random random = new Random();
        return jokeReactor[random.nextInt(jokeReactor.length)];
    }
}
