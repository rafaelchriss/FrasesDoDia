package com.rafaelchriss.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

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

    public void gerarFraseAleatoria(View view){

        String[] frases = {
                "A cada página virada, você está mais perto do seu objetivo! 🚀",
                "Estudar hoje é garantir um futuro incrível amanhã! 👏",
                "O conhecimento é a chave para abrir todas as portas! 🔑",
                "Você é mais forte do que qualquer obstáculo nos estudos! 💪",
                "Todo esforço terá sua recompensa! 🌟",
                "Persistência é o caminho para o sucesso! 🛤️",
                "Seja curioso e mova montanhas com o poder do aprendizado! 🏔️",
                "Estudar é plantar sementes para colher grandes sonhos! 🌱",
                "Desafie seus limites e surpreenda a si mesmo! 🔥",
                "A disciplina é o alicerce das maiores conquistas! 🏆",
                "Cada erro é uma oportunidade de aprender e crescer! ✨",
                "O sucesso nos estudos depende da sua dedicação! 📘",
                "Nunca subestime o poder de um dia produtivo! ⏳",
                "Estudar é um superpoder que ninguém pode tirar de você! 🦸",
                "Acredite no processo, o sucesso é consequência! 🏁",
                "Todo grande sonho começa com um pequeno passo! 👣",
                "Você está construindo algo incrível, continue firme! 🏗️",
                "Seu esforço de hoje é o orgulho de amanhã! 💖",
                "Dedique-se e surpreenda o mundo com o seu talento! 🌍",
                "A educação é a arma mais poderosa para mudar o mundo! ✏️",
                "Estudar é investir no ativo mais valioso: você mesmo! 💎",
                "O futuro pertence a quem se prepara hoje! 📅",
                "Transforme cada desafio em uma oportunidade de aprendizado! 🚀",
                "O estudo é como uma escada: um degrau de cada vez! 🪜",
                "Acredite: você é capaz de aprender qualquer coisa! 🎯",
                "Hoje difícil, amanhã gratificante! 💼",
                "O conhecimento não ocupa espaço, só abre caminhos! 🌟",
                "Você está escrevendo sua própria história de sucesso! 📖",
                "A constância é a chave para grandes realizações! 🔑",
                "Estudar é o primeiro passo para ser quem você quer ser! 🪞",
                "Você é mais capaz do que acredita! 🌠",
                "Pequenas ações diárias levam a grandes resultados! 🗓️",
                "Estudar é construir asas para voar mais alto! 🦅",
                "Seja o exemplo de determinação que você admira! 💪",
                "O aprendizado de hoje é o sucesso de amanhã! 📚",
                "Não pare até se orgulhar do que conquistou! 🏅",
                "Estude como se seu futuro dependesse disso, porque depende! 🔥",
                "Você tem tudo o que precisa para vencer nos estudos! 💼",
                "O conhecimento adquirido ninguém pode tirar de você! 👏",
                "A dedicação é o que separa os bons dos extraordinários! 🌠",
                "Faça dos estudos o seu maior investimento! 🚀",
                "O esforço é passageiro, mas a conquista é eterna! 🕊️",
                "Estudar é um ato de amor por si mesmo! ❤️",
                "O conhecimento ilumina até os caminhos mais difíceis! 🌈",
                "Cada minuto de estudo é um passo para o sucesso! ⏰",
                "A motivação te inicia, a disciplina te mantém! 🚶‍♂️",
                "Transforme sua rotina de estudos em um hábito de vitória! 🏆",
                "O único limite é aquele que você impõe a si mesmo! 🌟",
                "O mundo pertence a quem nunca para de aprender! 🌍",
                "Seja o protagonista da sua jornada de aprendizado! 🎭",
                "Estudar é como malhar a mente: exige esforço, mas vale a pena! 🏋️‍♂️",
                "O sucesso está na soma de pequenos esforços diários! ➕",
                "Acredite: você está mais perto do que imagina! 🌠",
                "Cada dúvida resolvida é um tijolo a mais no seu castelo! 🏰",
                "A jornada pode ser longa, mas o destino vale a pena! 🗺️",
                "O hábito de estudar é um caminho para a liberdade! 🕊️",
                "Grandes mudanças começam com pequenos passos! 🦶",
                "Desistir não é uma opção, siga firme nos estudos! 🚀",
                "Você está moldando seu futuro com cada palavra lida! ✍️",
                "O aprendizado transforma vidas, incluindo a sua! 🌟",
                "Sua determinação é sua maior força! 💪",
                "O estudo é o combustível para os seus sonhos! ⛽",
                "Só vence quem tenta, e você está tentando! 🚶",
                "Cada esforço é uma semente plantada no jardim do sucesso! 🌳",
                "O conhecimento é a única riqueza que ninguém pode roubar! 💎",
                "Você é o autor da sua história: escreva algo incrível! 🖋️",
                "A perseverança é amiga inseparável do sucesso! 👭",
                "O estudo é como um tesouro: vale cada segundo! 🪙",
                "Nada é impossível para quem persiste nos estudos! 🚀",
                "Hoje difícil, amanhã realizado! 🌅",
                "Acredite na sua capacidade de conquistar grandes coisas! 🎯",
                "Cada momento de estudo vale a pena! ⌛",
                "Estudar é preparar o terreno para um futuro brilhante! 🌾",
                "Você nasceu para vencer, nunca duvide disso! 🦸‍♂️",
                "Estudo é a ponte entre sonhos e realizações! 🌉",
                "A disciplina te levará onde a motivação sozinha não consegue! 🏃",
                "O aprendizado é infinito e você é capaz de tudo! 🚀",
                "Seja constante, pois o sucesso não vem de uma vez! 🌟",
                "Cada dia dedicado aos estudos é uma vitória pessoal! 🏆",
                "O estudo é o combustível para seus sonhos mais altos! 🔥",
                "A cada linha lida, seu futuro fica mais brilhante! 📖",
                "Todo esforço é recompensado com grandes conquistas! 🥇",
                "Você é o escultor do seu próprio destino! ✨",
                "A força de vontade pode superar qualquer dificuldade! 💪",
                "O impossível é apenas uma palavra para quem desiste! 🚀",
                "Com dedicação, qualquer sonho pode virar realidade! 💤",
                "Estudar é como plantar: o fruto vem com o tempo! 🍎",
                "Você está investindo no seu melhor recurso: você mesmo! 🏅",
                "O sucesso recompensa quem nunca desiste dos estudos! 🌠",
                "A cada página, uma nova oportunidade de crescer! 📚",
                "O mundo pertence àqueles que buscam conhecimento! 🌍",
                "Hoje você planta, amanhã você colhe! 🌱",
                "Nada pode parar uma mente determinada a aprender! 🚦",
                "O futuro é construído com esforço no presente! 🕒",
                "Você é capaz de superar qualquer desafio nos estudos! 🚀"
        };

        int numeroAleatorio = new Random().nextInt(frases.length);// automaticamente o limite superior ao tamanho do array.
        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frases[numeroAleatorio]);


    }
}