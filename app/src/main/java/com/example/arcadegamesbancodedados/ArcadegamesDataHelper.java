package com.example.arcadegamesbancodedados;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ArcadegamesDataHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "arcadegames5";
    private static final int DB_VERSION = 2;
    ArcadegamesDataHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE produto (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "IMAGE_RESOURCE_ID INTEGER);");
            insertProduto(db, "Master System", "Master System é um console de videogame de 8-bits produzido pela Sega, para concorrer com o Nintendo Entertainment System.\n Lançado inicialmente no Japão em 1986, com o nome Sega Mark III, ele enfrentou grandes dificuldades devido à forte concorrência do NES da Nintendo.\n A Nintendo possuía contratos de exclusividade junto às produtoras de jogos. O contrato não permitia que elas produzissem jogos para nenhum outro aparelho, fazendo com que o Master System dependesse principalmente dos lançamentos desenvolvidos pela Sega.\n O baixo sucesso no Japão não evitou que a Sega lançasse o Master System no resto do mundo. Nos Estados Unidos o domínio da Nintendo também era muito grande, e logo a Sega vendeu os direitos de comercialização do Master System naquele país para a Tonka, que não conseguiu fazer um trabalho eficiente de divulgação e distribuição do console, fazendo com que a popularidade do aparelho fosse muito baixa.\n", R.drawable.mastersystem);
            insertProduto(db, "Mega Driver", "Mega Driver, conhecido como Sega Genesis na América do Norte, é um console de video game de 16 bits da Sega que concorria diretamente com o Super Nintendo Entertainment System. O console fez grande sucesso na década de 1990, perdendo espaço após o surgimento e popularização da nova geração de consoles de 32 bits, como o PlayStation da Sony.\n Dentre os jogos de maior sucesso desse sistema está a série Sonic the Hedgehog, a aventura de um veloz ouriço azul para salvar os animais de seu planeta. O jogo foi criado com o objetivo de mostrar a capacidade do console de processar informações rapidamente, e ainda cativar o público jovem, criando assim a Sega seu próprio mascote e maior símbolo. A velocidade do jogo tinha por objetivo mostrar a superioridade do processador do Mega Drive em relação ao console de 16 bits da Nintendo.\n No Brasil, o Mega Drive ainda é produzido pela Tectoy, com novas versões. No exterior, de 2006 até o momento, 3 novos jogos para o console foram produzidos, sendo o mais famoso dentre eles o Pier Solar and the Great Architects.\n E em 05 de maio de 2017 a Tectoy relançou o console Mega Drive.[9]. O Mega Drive consta com mais de 40 milhões de consoles vendidos.", R.drawable.megadrive);
            insertProduto(db, "Super Nitendo", "Super Nintendo Entertainment System, (Super NES ou SNES ou Super Nintendo) é um console de videogame de 16 bits desenvolvido pela Nintendo que foi lançado em 1990 no Japão, 1991 nos Estados Unidos, 1992 na Europa e Australásia (Oceania) e América do Sul em 1993. No Japão, o sistema é chamado de Super Famicom (em japonês: スーパーファミコン, transl. Sūpā Famikon), oficialmente, adotando o nome abreviado do seu antecessor, o Famicom), ou SFC para breve. Na Coréia do Sul, é conhecida como a Super Comboy e foi distribuído pela Hyundai Electronics. Embora cada versão é essencialmente o mesmo, várias formas de bloqueio regional impedem as diferentes versões sejam compatíveis entre si.\n O Super Nintendo Entertainment System é o segundo home console da Nintendo, sucessor do Nintendo Entertainment System (NES). O console apresentou gráficos e recursos de som avançados em comparação com outros consoles na época. Além disso, o desenvolvimento de uma variedade de chips de aprimoramento (que foram integrados em placas de circuito) ajudou a mantê-lo competitivo no mercado. Enquanto brutos gráficos tridimensionais raramente tinham sido vistos antes em consoles domésticos, utilizando o chip Super FX começando com Star Fox em 1993, o SNES foi capaz de rodar jogos com gráficos tridimensionais suave e mais detalhados.", R.drawable.snes);

            if (oldVersion <2) {
            }
        }

    }

    private static void insertProduto(SQLiteDatabase db, String name, String description, int resourceId) {
        ContentValues produtoValues = new ContentValues();
        produtoValues.put("NAME", name);
        produtoValues.put("DESCRIPTION", description);
        produtoValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("produto", null, produtoValues);
    }
}
