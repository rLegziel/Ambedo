package com.example.android.ambedo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Metal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<Recommendation> recommendations = new ArrayList<Recommendation>();
        recommendations.add(new Recommendation("At The Gates","Suicide Nation \nWorld Of Lies \nSlaughter Of The Soul  \nCold",R.drawable.atthegates));
        recommendations.add(new Recommendation("Death","Symbolic \nCrystal Mountain  \nSpirit Crusher \nMisanthrope \nScavanger Of Human Sorrow",R.drawable.death));
        recommendations.add(new Recommendation("Dream Theater ","I Walk Beside You \nPull Me Under \nAnother Day  \nUnder A Glass Moon  \nConstant Motion ",R.drawable.dreamtheater));
        recommendations.add(new Recommendation("Gojira","Flying Whales  \nThe Art Of Dying \nThe Heaviest Matter In the Universe",R.drawable.gojira));
        recommendations.add(new Recommendation("Lamb Of God","Redneck  \nOmerta   \nLaid To Rest  \nHourglass  \nPathetic",R.drawable.lambofgod));
        recommendations.add(new Recommendation("Machine Head","Now I Lay Thee Down\nDavidian \nImperium  \nAesthetics Of Hate \nA Farewell To Arms",R.drawable.machinehead));
        recommendations.add(new Recommendation("Mastodon","Crack The Skye \nBlood And Thunder \nDivinations \nColony Of Birchmen  \nOblivion",R.drawable.mastodon));
        recommendations.add(new Recommendation("Megadeth","Foreclosure Of A Dream  \nHoly Wars \nLucretia  \nTornado Of Souls \nSymphony Of Destruction",R.drawable.megadeth));
        recommendations.add(new Recommendation("Metallica","Orion \nFade To Black \nRide The Lightning \nSad But True \nWherever I May Roam  \nEnter Sandman \nMaster Of Puppets",R.drawable.metallica));
        recommendations.add(new Recommendation("Nevermore","This Godless Endeavor \nThe Psalm Of Lydia \nThe River Dragon \nThe Sound Of Silence \nNarcosynthesis \nInsignificant \nThe Heart Collector ",R.drawable.nevermore));
        recommendations.add(new Recommendation("Opeth","Masters Apprentice \nIn My Time Of Need \nThe Drapery Falls  \nGhost Of Predition  \nHeir Apparent  \nThe Lotus Eater",R.drawable.opeth));
        recommendations.add(new Recommendation("Pantera","Cemetery Gates \nWalk  \nHollow \nDomination \nIm Broken  \n5 Minutes Alone  \nRevolution Is My Name",R.drawable.pantera));
        recommendations.add(new Recommendation("Sikth","Part Of The Friction \nWhen The Moments Gone \nBland Street Bloom \nWhere Do We Fall?",R.drawable.sikth));
        recommendations.add(new Recommendation("Slipknot","Psychosocial \nSnuff  \nDuality  \nLeft Behind \nPeople = Shit \nVermillion Pt. 2  \nBefore I Forget ",R.drawable.slipknot));

        ReccomendationAdapter adapter = new ReccomendationAdapter(this, recommendations);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
