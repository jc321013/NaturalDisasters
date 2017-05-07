package com.example.jc321013.naturaldisasters;

/**
 * Created by jc321013 on 27/04/2017.
 */

public class QuestionLibrary {

    private String mQuestions [] = {
            "Bushfires are only caused by humans?",
            "What is a flood?",
            "Tropical Cyclones form over warm waters?",
            "To cause damage an earthquake needs to exceed what magnitude?",
            "What isn't a requirement for severe storms to develop?",
            "What is a Tsunami?",
            "Is an Earthquake caused by sudden movements of tectonic plates?",
            "Which of the following is not a natural hazard?",
            "Which of the following is Incorrect about Volcanoes?:"
    };

    private String mChoices [][] = {
            {"True", "False", " "},
            {"Excess water", "Heavy Rainfall", "An overflow of water that submerges land"},
            {"True", "False", " "},
            {"9", "6", "7"},
            {"Moist/Humid air", "Rainfall", "An area of low pressure"},
            {"A Massive wave", "Big Surf", "A large wave usually formed by undersea earthquakes and landslides"},
            {"yes", "no", " "},
            {"Sunny Days", "Earthquakes", "Cyclones"},
            {"A Volcano is a mountain containing a crater filled with lava", "A Volcano can only irrupt above sea level", "A Volcano produces smoke, magma and gas"},
    };

    private String mCorrectAnswers[] = {"False", "An overflow of water that submerges land", "True", "7", "Rainfall", "A large wave usually formed by undersea earthquakes and landslides", "yes", "Sunny Days", "A Volcano can only irrupt above sea level"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
