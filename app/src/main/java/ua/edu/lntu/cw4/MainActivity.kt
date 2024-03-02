package ua.edu.lntu.cw4

import androidx.compose.foundation.layout.Arrangement
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw4.ui.theme.IPZ_CR_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CR_4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        ListScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun ListScreen() {
    val data = listOf("Елемент 1", "Елемент 2", "Елемент 3", "Елемент 4", "Елемент 5")

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp) // Встановлюємо відступ між елементами
    ) {
        items(data) { item ->
            ListItem(text = item, onItemClick = { /* Обробник натискання */ })
        }
    }
}

@Composable
fun ListItem(text: String, onItemClick: () -> Unit) {
    Text(
        text = text,
        fontSize = 28.sp, // Розмір шрифту 28
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable { onItemClick() } // Додавання обробника натискань
    )
}



@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    IPZ_CR_4Theme {
        ListScreen()
    }
}

