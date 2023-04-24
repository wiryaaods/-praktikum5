package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().hide();

        fact = findViewById(R.id.fact);
        fact.setText("1. The term \"fairy tale\" was coined by French writer, Marie-Catherine d'Aulnoy. First used in the late 17th century, but the stories themselves are much older. \n" + "\n"+
                "2. Fairy tales originated from oral storytelling traditions that were passed down from generation to generation. \n" + "\n"+
                "3. The Brothers Grimm, Jacob and Wilhelm Grimm, are known for their collection of fairy tales, which includes classics like Cinderella, Snow White, and Hansel and Gretel. \n" + "\n"+
                "4. Fairy tales often have a moral or lesson to teach, such as the importance of being kind, brave, or honest. \n" + "\n" +
                "5. Fairy tales are an ancient form of storytelling, with roots that can be traced back thousands of years.\n" + "\n"+
                "6. Famous fairy tales, such as \"Little Red Riding Hood\" and \"Hansel and Gretel,\" were originally much darker and more violent than the versions we know today.\n" + "\n"+
                "7. A lot of the famous authors we know and love today are fans of fairy tales. This includes the likes of C.S. Lewis, Terry Pratchett, and J.R.R. Tolkien. In fact, Charles Dickens said that fairy tales kept him ever young!\n" + "\n"+
                "8. Fairy tales have been adapted into various forms of media, including movies, TV shows, and video games. \n" + "\n"+
                "9. Some of the most famous fairy tales, such as Little Red Riding Hood and Beauty and the Beast, have been retold and reimagined countless times throughout history. \n" + "\n"+
                "10. Fairy tales are enjoyed by people of all ages and continue to be an important part of popular culture today. \n" + "\n"+
                "11. Some of fairy tales have been translated into multiple languages and have become beloved stories around the world.\n" + "\n"+
                "12. When Little Red Riding Hood first came out, it was used for the purpose of warning children about the dangerous wild animals that lived in the woods.\n" + "\n"+
                "13. Fairy tales mostly have gruesome and dark origins. For example, the original version of Little Red Riding Hood features the wolf eating both the grandmother and the little girl. \n" + "\n"+
                "14. The Brothers Grimm, who are known for collecting and publishing fairy tales, actually sanitized many of the stories to make them more appropriate for children. \n" + "\n"+
                "15. A lot of fairy tales have been used as political allegories throughout history. \"The Emperor's New Clothes\" is often interpreted as a commentary on the vanity and foolishness of leaders. \n" + "\n"+
                "16. Some fairy tales have been used as cautionary tales about the dangers of trusting strangers. For example, \"Hansel and Gretel\" warns children not to wander too far from home and to be wary of people who might try to lure them away. \n" + "\n"+
                "17. Many fairy tales have been adapted to fit different cultures and time periods. For example, the Disney version of Mulan is based on a Chinese folktale, but the story has been modified to fit Western audiences.\n" + "\n"+
                "18. Fairy tales often contain symbolic motifs that have deep cultural significance. For example, the apple in Snow White is a symbol of temptation and knowledge. \n" + "\n"+
                "19. A lot of fairy tales feature strong female characters who defy gender norms and expectations. For example, Cinderella is often portrayed as a resilient and resourceful heroine who overcomes adversity. \n" + "\n"+
                "20. Fairy tales have been used to teach children about the world around them, including nature, morality, and social norms. \n" + "\n"+
                "21. Some fairy tales have been used to teach children about death and loss, such as \"The Little Mermaid,\" which explores themes of sacrifice and transformation. \n" + "\n"+
                "22. Fairy tales continue to evolve and be reinterpreted by new generations, demonstrating their enduring power and relevance.\n" + "\n"+
                "23. Fairy tales originate from oral traditions. They are passed down from generation to generation through oral storytelling before being written down. \n" + "\n"+
                "24. Some popular fairy tales such as Cinderella, Snow White, and Sleeping Beauty come from Europe and have been adapted into various languages and cultures worldwide. \n" + "\n"+
                "25. Some famous writers like Hans Christian Andersen and The Brothers Grimm are well-known for collecting and rewriting classic fairy tales. \n" + "\n"+
                "26. Fairy tales are not just meant for children but can also be enjoyed by adults and provide entertainment, inspiration, and meaning in life.\n");
    }
    public void back(View view){
        finish();
    }
}