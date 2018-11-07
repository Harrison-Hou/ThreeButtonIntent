package com.mrhou.threebuttonintent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    public static final String COUNTRY = "COUNTRY";



    public static final String CHINA = "China, officially the People's Republic of China (PRC)," +
            " is a unitary one-party sovereign state in East Asia and the world's most populous " +
            "country, with a population of around 1.404 billion.[13] Covering approximately " +
            "9,600,000 square kilometers (3,700,000 sq mi), " +
            "it is the third- or fourth-largest country by total area,[k][19] " +
            "depending on the source consulted. Governed by the Communist Party of China, " +
            "the state exercises jurisdiction over 22 provinces, five autonomous regions, " +
            "four direct-controlled municipalities (Beijing, Tianjin, Shanghai, and Chongqing), " +
            "and the special administrative regions of Hong Kong and Macau.";

    public static final String AUSTRALIA ="Australia, officially the Commonwealth of Australia,[11] " +
            "is a sovereign " +
            "country comprising the mainland of the Australian continent, the island of Tasmania " +
            "and numerous smaller islands. It is the largest country in Oceania and the world's " +
            "sixth-largest country by total area. The neighbouring countries are Papua New Guinea, " +
            "Indonesia and East Timor to the north; the Solomon Islands and Vanuatu to the north-east; " +
            "and New Zealand to the south-east. The population of 25 million[6] is highly " +
            "urbanised and heavily concentrated on the eastern seaboard.[12] Australia's capital " +
            "is Canberra, and its largest city is Sydney. The country's other major metropolitan " +
            "areas are Melbourne, Brisbane, Perth and Adelaide, which all have over 1 million inhabitants.";

    public static final String AMERICA = "\n" +
            "United States of America\n" +
            "Flag of the United States\n" +
            "Flag\n" +
            "{{{coat_alt}}}\n" +
            "Great Seal\n" +
            "Motto: \n" +
            "\"In God We Trust\"[1][fn 1]\n" +
            "Other traditional mottos   [show]\n" +
            "Anthem: \n" +
            "\"The Star-Spangled Banner\"\n" +
            "MENU0:00\n" +
            "March:\n" +
            "\"The Stars and Stripes Forever\"[2][3]\n" +
            "MENU0:00\n" +
            "Projection of North America with the United States in green\n" +
            "The contiguous United States plus Alaska and Hawaii\n" +
            "The United States and its territories\n" +
            "The United States including its territories\n" +
            "Capital\tWashington, D.C.\n" +
            "38°53′N 77°01′W\n" +
            "Largest city\tNew York City\n" +
            "40°43′N 74°00′W\n" +
            "Official languages\tNone at federal level[fn 2]\n" +
            "National language\tEnglish[fn 3]\n" +
            "Ethnic groups (2016)[6]\tBy race:\n" +
            "77.1% White\n" +
            "13.3% Black\n" +
            "5.6% Asian\n" +
            "2.6% Other/multiracial\n" +
            "1.2% Native\n" +
            "0.2% Pacific Islander\n" +
            "Ethnicity:\n" +
            "17.6% Hispanic or Latino\n" +
            "82.4% non-Hispanic or Latino\n" +
            "Religion (2016)[7]\t73.7% Christian\n" +
            "18.2% Unaffiliated\n" +
            "2.1% Jewish\n" +
            "0.8% Muslim\n" +
            "2.5% Other\n" +
            "2.6% Unknown\n" +
            "Demonym\tAmerican\n" +
            "Government\tFederal republic\n" +
            "• President\n" +
            "Donald Trump\n" +
            "• Vice President\n" +
            "Mike Pence\n" +
            "• House Speaker\n" +
            "Paul Ryan\n" +
            "• Chief Justice\n" +
            "John Roberts\n" +
            "Legislature\tCongress\n" +
            "• Upper house\n" +
            "Senate\n" +
            "• Lower house\n" +
            "House of Representatives\n" +
            "Independence from Great Britain\n" +
            "• Declaration\n" +
            "July 4, 1776\n" +
            "• Confederation\n" +
            "March 1, 1781\n" +
            "• Treaty of Paris\n" +
            "September 3, 1783\n" +
            "• Constitution\n" +
            "June 21, 1788\n" +
            "• Last polity admitted\n" +
            "March 24, 1976\n" +
            "Area\n" +
            "• Total area\n" +
            "3,796,742 sq mi (9,833,520 km2)[8] (3rd/4th)\n" +
            "• Water (%)\n" +
            "6.97\n" +
            "• Total land area\n" +
            "3,531,905 sq mi (9,147,590 km2)\n" +
            "Population\n" +
            "• 2017 estimate\n" +
            "325,719,178[9] (3rd)\n" +
            "• 2010 census\n" +
            "308,745,538[10] (3rd)\n" +
            "• Density\n" +
            "85/sq mi (32.8/km2) (179th)\n" +
            "GDP (PPP)\t2017 estimate\n" +
            "• Total\n" +
            "$19.390 trillion[11] (2nd)\n" +
            "• Per capita\n" +
            "$59,501[11] (11th)\n" +
            "GDP (nominal)\t2017 estimate\n" +
            "• Total\n" +
            "$19.390 trillion[11] (1st)\n" +
            "• Per capita\n" +
            "$59,501[11] (7th)\n" +
            "Gini (2015)\tPositive decrease 39.0[12]\n" +
            "medium\n" +
            "HDI (2015)\tIncrease 0.920[13]\n" +
            "very high · 10th\n" +
            "Currency\tUnited States dollar ($) (USD)\n" +
            "Time zone\t(UTC−4 to −12, +10, +11)\n" +
            "• Summer (DST)\n" +
            " (UTC−4 to −10[fn 4])\n" +
            "Date format\tmm/dd/yyyy\n" +
            "Drives on the\tright[fn 5]\n" +
            "Calling code\t+1\n" +
            "ISO 3166 code\tUS\n" +
            "Internet TLD\t.us\n" +
            "The United States of America (USA), commonly known as the United States (U.S.) or " +
            "America, is a federal republic composed of 50 states, a federal district, five major " +
            "self-governing territories, and various possessions.[fn 6] At 3.8 million square miles" +
            " (9.8 million km2), the United States is the world's third- or fourth-largest country" +
            " by total area[fn 7] and just fractionally smaller than the entire continent of Europe'" +
            "s 3.9 million square miles. With a population of over 325 million people, the U.S. is " +
            "the third-most populous country. The capital is Washington, D.C., and the largest city " +
            "by population is New York City. Forty-eight states and the capital's federal district " +
            "are contiguous in North America between Canada and Mexico. The State of Alaska is in " +
            "the northwest corner of North America, bordered by Canada to the east and across the " +
            "Bering Strait from Russia to the west. The State of Hawaii is an archipelago in the " +
            "mid-Pacific Ocean. The U.S. territories are scattered about the Pacific Ocean and the " +
            "Caribbean Sea, stretching across nine official time zones. The extremely diverse " +
            "geography, climate, and wildlife of the United States make it one of the world's 17 " +
            "megadiverse countries";


    String Country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void showChina(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MainActivity.COUNTRY, CHINA);
        startActivity(intent);


    }

    public void showAustralia(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MainActivity.COUNTRY, AUSTRALIA);
        startActivity(intent);
    }

    public void showAmerica(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MainActivity.COUNTRY, AMERICA);
        startActivity(intent);
    }
}
