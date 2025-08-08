package com.example.lista_contatos_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lista_contatos_compose.ui.theme.Lista_Contatos_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lista_Contatos_ComposeTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val claudia = Contato(
                        name = "Cláudia",
                        number = "(79) 9 8845-5465",
                        image = R.drawable.sample1
                    )

                    val xau = Contato(
                        name = "Xau",
                        number = "79 97848-5589",
                        image = R.drawable.sample2
                    )

                    val marues = Contato(
                        name = "Marues",
                        number = "87 88854-7985",
                        image = R.drawable.sample3
                    )

                    val cary = Contato(
                        name = "Cary",
                        number = "87 89999-7985",
                        image = R.drawable.sample4
                    )

                    val paul = Contato(
                        name = "Paul",
                        number = "87 89999-7900",
                        image = R.drawable.sample5
                    )

                    val mel = Contato(
                        name = "Mel",
                        number = "87 89000-7455",
                        image = R.drawable.sample6
                    )

                    val tina = Contato(
                        name = "Tina",
                        number = "87 89999-7985",
                        image = R.drawable.sample7
                    )

                    val caio = Contato(
                        name = "Caio",
                        number = "78 85599-7985",
                        image = R.drawable.sample8
                    )

                    val malu = Contato(
                        name = "Malu",
                        number = "77 98799-7985",
                        image = R.drawable.sample9
                    )

                    val moby = Contato(
                        name = "Moby",
                        number = "87 89999-0000",
                        image = R.drawable.sample10
                    )

                    val helena = Contato(
                        name = "Helena",
                        number = "87 89999-9999",
                        image = R.drawable.sample11
                    )

                    val vander = Contato(
                        name = "Vander",
                        number = "87 89900-1111",
                        image = R.drawable.sample12
                    )

                    val fatima = Contato(
                        name = "Fátima",
                        number = "79 00999-7785",
                        image = R.drawable.sample13
                    )

                    val paulo = Contato(
                        name = "Paulo",
                        number = "11 00999-7985",
                        image = R.drawable.sample14
                    )

                    val ana = Contato(
                        name = "Ana",
                        number = "87 89111-7985",
                        image = R.drawable.sample15
                    )

                    val mariana = Contato(
                        name = "Mariana",
                        number = "78 99999-7985",
                        image = R.drawable.sample16
                    )


                    val contatos = listOf(
                        claudia,
                        xau,
                        marues,
                        cary,
                        mel,
                        tina,
                        mariana,
                        ana,
                        paulo,
                        fatima,
                        vander,
                        helena,
                        moby,
                        malu,
                        caio
                    )

                    Column(
                        modifier = Modifier
                            .padding(top = 52.dp)
                    ) {
                        TituloContatos("Lista de Contatos")
                        LazyColumn {
                            items(contatos) { contato ->
                                ListaContatos(
                                    contato = contato,

                                    )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TituloContatos(titulo: String) {
    Column(
        modifier = Modifier
            .padding(12.dp)
    ) {
        Text(
            "Lista de Contatos",
            fontSize = 32.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = FontFamily.Serif
        )
    }

}

@Composable
fun ListaContatos(contato: Contato) {

    Row(
        modifier = Modifier
            .padding(8.dp)

    ) {

        Image(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = contato.image), contentDescription = "contato imagem"
        )

        Column(
            modifier = Modifier
                .padding(start = 12.dp)
        ) {
            Text(contato.name)
            Text("79 98451-5352")
        }

    }

}

data class Contato(
    val name: String,
    val number: String,
    @DrawableRes val image: Int,
)

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lista_Contatos_ComposeTheme {
        val ronaldo = Contato(
            name = "Cláudia",
            number = "(79) 9 8845-5465",
            image = R.drawable.sample1
        )
        val contatos = listOf(ronaldo)

        LazyColumn {
            items(contatos) { contato ->
                ListaContatos(
                    contato = contato,

                    )
            }
        }
    }
}