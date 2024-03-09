package com.rafaelsantos.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFraseAleatorio(View view) {
        String[] frases = {
                "Seja bem-vindo",
                "O sucesso é a soma de pequenos esforços repetidos diariamente.",
                "Acredite em você mesmo e tudo será possível.",
                "A jornada de mil milhas começa com um único passo.",
                "A persistência é o caminho do êxito.",
                "A única maneira de fazer um excelente trabalho é amar o que você faz.",
                "Não desista do dia que poderia ser o seu dia de sorte.",
                "Acredite nos seus sonhos, mesmo quando ninguém mais acredita.",
                "Cada dia é uma nova oportunidade para ser melhor.",
                "O otimismo é a fé em ação.",
                "Quanto maior o obstáculo, maior a glória em superá-lo.",
                "O sucesso nasce do querer, da determinação e persistência.",
                "Se você quer alcançar o impossível, precisa pensar no inimaginável.",
                "A confiança em si mesmo é o primeiro segredo do sucesso.",
                "O que você faz hoje pode melhorar todos os seus amanhãs.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "A disciplina é a ponte entre metas e realizações.",
                "Você é mais forte do que pensa.",
                "Encare cada desafio como uma oportunidade para o sucesso.",
                "A maior glória em viver está em nunca cair, mas em levantar-se a cada vez que caímos.",
                "Sua atitude determina sua direção.",
                "Sucesso não é a chave para a felicidade. Felicidade é a chave para o sucesso.",
                "Acreditar é o primeiro passo para conseguir.",
                "A mente é tudo. Você se torna aquilo que você pensa.",
                "Você não pode ter um amanhã melhor se estiver pensando sobre ontem o tempo todo.",
                "A verdadeira medida de um homem não é como ele se comporta em momentos de conforto, mas em tempos de desafio e controvérsia.",
                "Cada dia traz novas escolhas.",
                "A jornada é tão importante quanto o destino.",
                "A coragem não é a ausência do medo, mas a vitória sobre ele.",
                "O sucesso é a soma de pequenos esforços repetidos diariamente.",
                "Se você quer voar, precisa abrir mão do que te prende ao chão.",
                "A chave para o sucesso é começar antes que você esteja pronto.",
                "O tempo é limitado, não o desperdice vivendo a vida de outra pessoa.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "Acredite em si mesmo e tudo será possível.",
                "O sucesso nasce do querer, da determinação e persistência.",
                "Sua atitude determina sua direção.",
                "Não espere por circunstâncias ideais, elas nunca chegarão. Comece onde você está, com o que você tem.",
                "O sucesso é a soma de pequenos esforços repetidos diariamente.",
                "Quanto maior o obstáculo, maior a glória em superá-lo.",
                "A confiança em si mesmo é o primeiro segredo do sucesso.",
                "O que você faz hoje pode melhorar todos os seus amanhãs.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "A disciplina é a ponte entre metas e realizações.",
                "Você é mais forte do que pensa.",
                "Encare cada desafio como uma oportunidade para o sucesso.",
                "A maior glória em viver está em nunca cair, mas em levantar-se a cada vez que caímos.",
                "Sua atitude determina sua direção.",
                "Sucesso não é a chave para a felicidade. Felicidade é a chave para o sucesso.",
                "Acreditar é o primeiro passo para conseguir.",
                "A mente é tudo. Você se torna aquilo que você pensa.",
                "Você não pode ter um amanhã melhor se estiver pensando sobre ontem o tempo todo.",
                "A verdadeira medida de um homem não é como ele se comporta em momentos de conforto, mas em tempos de desafio e controvérsia.",
                "Cada dia traz novas escolhas.",
                "A jornada é tão importante quanto o destino.",
                "A coragem não é a ausência do medo, mas a vitória sobre ele.",
                "O sucesso é a soma de pequenos esforços repetidos diariamente.",
                "Se você quer voar, precisa abrir mão do que te prende ao chão.",
                "A chave para o sucesso é começar antes que você esteja pronto.",
                "O tempo é limitado, não o desperdice vivendo a vida de outra pessoa.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "Acredite em si mesmo e tudo será possível.",
                "O sucesso nasce do querer, da determinação e persistência.",
                "Sua atitude determina sua direção.",
                "Não espere por circunstâncias ideais, elas nunca chegarão. Comece onde você está, com o que você tem.",
                "O sucesso é a soma de pequenos esforços repetidos diariamente.",
                "Quanto maior o obstáculo, maior a glória em superá-lo.",
                "A confiança em si mesmo é o primeiro segredo do sucesso.",
                "O que você faz hoje pode melhorar todos os seus amanhãs.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "A disciplina é a ponte entre metas e realizações.",
                "Você é mais forte do que pensa.",
                "Encare cada desafio como uma oportunidade para o sucesso.",
                "A maior glória em viver está em nunca cair, mas em levantar-se a cada vez que caímos.",
                "Sua atitude determina sua direção.",
                "Sucesso não é a chave para a felicidade. Felicidade é a chave para o sucesso.",
                "Acreditar é o primeiro passo para conseguir.",
                "A mente é tudo. Você se torna aquilo que você pensa.",
                "Você não pode ter um amanhã melhor se estiver pensando sobre ontem o tempo todo.",
                "A verdadeira medida de um homem não é como ele se comporta em momentos de conforto, mas em tempos de desafio e controvérsia.",
                "Cada dia traz novas escolhas.",
                "A jornada é tão importante quanto o destino.",
                "A coragem não é a ausência do medo, mas a vitória sobre ele.",
                "O sucesso é a soma de pequenos esforços repetidos diariamente.",
                "Se você quer voar, precisa abrir mão do que te prende ao chão.",
                "A chave para o sucesso é começar antes que você esteja pronto.",
                "O tempo é limitado, não o desperdice vivendo a vida de outra pessoa.",
                "O único lugar onde o sucesso vem antes do trabalho é no dicionário.",
                "Acredite em si mesmo e tudo será possível.",
                "O sucesso nasce do querer, da determinação e persistência.",
        };

        int numeroAleatorio = new Random().nextInt(90);
        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frases[numeroAleatorio]);
    }
}
