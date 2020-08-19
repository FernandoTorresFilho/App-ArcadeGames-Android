package com.example.arcadegamesbancodedados;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class JogosDetalhesFragment extends Fragment {


        private long jogoId;

        public JogosDetalhesFragment(){
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            if(savedInstanceState !=null) {
                jogoId = savedInstanceState.getLong("jogoId");
            }
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.activity_jogos_detalhes_fragment, container, false);
        }

        public void onStart(){
            super.onStart();
            View view = getView ();
            if (view != null) {

//                Console console = Console.consoles[(int)consoleId];
                Jogos jogos = Jogos.jogo[(int)jogoId];



//                ImageView photo = findViewById(R.id.photo);
//                photo.setImageResource(jogos.getImageResourceId());
//                photo.setContentDescription(jogos.getName());

                TextView title = view.findViewById(R.id.name);
                title.setText(jogos.getName());

                TextView description = view.findViewById(R.id.description);
                description.setText(jogos.getDescription());

            }
        }

//        public void setConsoleId(long id) {
//            this.consoleId = id;
//        }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putLong("jogoId", jogoId);
    }

    public void setJogoId(long id) {
        this.jogoId = id;
    }
    }
