package com.example.arcadegamesbancodedados;

import androidx.appcompat.app.AppCompatActivity;



public class Lojas extends AppCompatActivity {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Lojas [] loja = {
            new Lojas("Sede Recife", "Rua Frei caneca, 21 A, Santo Antônio\n" + "Recife/PE | CEP: 50.010-120\n" + "(81) 3039.7590 | (81) 9 9727.4141 (Whatsapp)" + "contato@lojaodosgamesonline.com.br", R.drawable.lojas),
            new Lojas("Shopping Rio Mar", "Av. República do Líbano, 251 - Pina, Recife/PE | CEP: 51110-160\n" + "(81) 3039.7590 | (81) 9 9727.4141 (Whatsapp)" + "contato@lojaodosgamesonline.com.br", R.drawable.lojas),
            new Lojas("Shopping Recife", "R. Padre Carapuceiro, 777 - Boa Viagem, Recife/PE | CEP: 51020-900\n" + "(81) 3039.7590 | (81) 9 9727.4141 (Whatsapp)" + "contato@lojaodosgamesonline.com.br", R.drawable.lojas),
    };

    private Lojas (String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public int getImageResourceId() { return imageResourceId; }

    public String toString() { return this.name; }
}

