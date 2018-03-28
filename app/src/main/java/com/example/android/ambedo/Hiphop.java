package com.example.android.ambedo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hiphop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Recommendation> recommendations = new ArrayList<Recommendation>();
        recommendations.add(new Recommendation("Nas", "The World Is Yours \nNas Be Like \nRepresent  \nNY State Of Mind  \nNo Ideas Original \nIf I Ruled The World", R.drawable.nas));
        recommendations.add(new Recommendation("Drake", "Underground Kings\nPound Cake \nThe Calm \nFireworks \nLight Up", R.drawable.drake));
        recommendations.add(new Recommendation("GZA", "Liquid Swords \nShadowboxin  \n4th Chamber  \nSparring Mind   \nSilent", R.drawable.gza));
        recommendations.add(new Recommendation("J Cole ", "Neighbors \n4 Your Eyez Only  \nImmortal \nEverybody Dies \nGOMD  \nNo Role Modelz", R.drawable.jcole));
        recommendations.add(new Recommendation("Jeru Da Damaja", "The Sun Toucher  \nMe Or The Papes  \nYa Playin Yourself \nWhatever ", R.drawable.jerudadamaja));
        recommendations.add(new Recommendation("Kendrick Lamar", "The Art Of Peer Pressure \nHow Much a Dollar Cost  \nADHD \nMoney Trees  \nSwimming Pools \nThe Blacker The Berry", R.drawable.kendricklamar));
        recommendations.add(new Recommendation("Logic", "Gang Related \nIm Gone \nInnermission  \nParadise  \nNikki  \nBuried Alive", R.drawable.logic));
        recommendations.add(new Recommendation("Mobb Deep", "Shook Ones \nSurvival Of The Fittest \nParty Over \nGive Up The Goods  \nGive It Up ", R.drawable.mobbdeep));
        recommendations.add(new Recommendation("Notorious B.I.G", "Juicy \nThe Warning  \nThe What \nBig Poppa  \nHypnotize \nWho Shot Ya ", R.drawable.notoriousbig));
        recommendations.add(new Recommendation("Outkast", "Wheelz Of Steel \nJazzy Belle  \nGet Out Get Something  \nAquemini  \nTwo Dope Boyz (In A Cadillac)", R.drawable.outkast));
        recommendations.add(new Recommendation("RA The Rugged Man", "Uncommon Valor \nChains  \nLessons  \nSam Peckinpah  \nStill Get Through The Day", R.drawable.ratheruggedman));
        recommendations.add(new Recommendation("Redman", "Tonights Da Night  \nWhatever Man \nPick It Up  \nDa Rockwilder  \nCant Wait ", R.drawable.redman));
        recommendations.add(new Recommendation("Skepta", "Back Then  \nNasty \nNo Security \nHypocrisy \nAce Hood Flow  \nCastles ", R.drawable.skepta));
        recommendations.add(new Recommendation("Wu-Tang Clan", "C.R.E.A.M  \nProtect Ya Neck  \nMethod Man  \nShame On A Nigga ", R.drawable.wutangclan));

        ReccomendationAdapter adapter = new ReccomendationAdapter(this, recommendations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
