package com.example.arcadegamesbancodedados;

import androidx.appcompat.app.AppCompatActivity;



public class Jogos extends AppCompatActivity {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Jogos [] jogo = {
            new Jogos("SPACE INVADERS – 1978", "Parecendo um jogo primitivo atualmente, Space Invaders foi um feito da engenharia quando lançado em arcades ao redor do mundo, em 1978. Em Space Invaders, os jogadores controlam um canhão laser e defendem seu território contra ondas de inimigos que gradualmente descem do céu. A idéia é derrotar todos os inimigos antes que eles destruam o planeta, caso não avance pelo caminho, em uma tela rudimentar aparece o mítico “Game Over”. Space Invaders permanece o game arcade mais popular de todos os tempos, vendendo 360.000 unidades em 2 anos, e ganhando US$ 2.702.000.000 em apenas 4 anos após seu lançamento inicial.", R.drawable.jogo1),
            new Jogos("PAC-MAN – 1980", "Lançado em todo o mundo para arcades em 1980, o game original e suas mais de 30 revisões são agora disponíveis em cada plataforma de Android para ZX Spectrum a partir de 2015. Pac-Man foi um dos primeiros personagens em um video game a transcender o meio. Após apenas 2 anos, Pac-Man vendeu mais de 400.000 gabinetes de arcade ganhando US$ 2.500.000.000.", R.drawable.jogo2),
            new Jogos("STREET FIGHTER II’: CHAMPIONSHIP EDITION – 1992", "Street Fighter II: The World Warrior foi um sucesso imediato quando bateu arcades em 1991. E Street Fighter II’: Championship Edition se destaca como terceira posição nesta seleção. Implacavelmente portado e re-lançado para cada console de game de casa conhecido pelo homem, Street Fighter II: The World Warrior, e re introdução como Street Fighter II’: Championship Edition vendeu mais de 200.000 gabinetes nos Estados Unidos, acumulando extraordinários US$ 2.500.000.000 em receita em menos de 5 anos.", R.drawable.jogo3),
    };

    private Jogos (String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public int getImageResourceId() { return imageResourceId; }

    public String toString() { return this.name; }
}

