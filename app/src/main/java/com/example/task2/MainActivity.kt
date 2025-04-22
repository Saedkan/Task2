package com.example.task2

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task2.di.appModule
import com.example.task2.di.dataModule
import com.example.task2.di.databaseModule
import com.example.task2.di.domainModule
import com.example.task2.di.networkModule
import com.example.task2.di.presentationModule
import com.example.task2.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            modules(
                listOf(
                    appModule,
                    viewModelModule,
                    networkModule,
                    databaseModule,
                    dataModule,
                    presentationModule,
                    domainModule
                )
            )
        }
    }
}


@Composable
fun TaskManagerApp() {
    var tasks by remember { mutableStateOf(listOf("Task 1", "Task 2", "Task 3")) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                tasks = tasks + "New Task ${(tasks.size + 1)}"

            }) {
                Text("+")
            }
        },
        containerColor = Color.Black
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            TaskList(tasks) { task ->
                tasks = tasks - task
            }
        }
    }
}

@Composable
fun TaskList(tasks: List<String>, onTaskRemove: (String) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(tasks) { task ->
            TaskItem(task, onTaskRemove)
        }
    }
}

@Composable
fun TaskItem(task: String, onTaskRemove: (String) -> Unit) {
    var completed by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { completed = !completed },
        colors = CardDefaults.cardColors(containerColor = if (completed) Color.Gray else Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = task, color = Color.Black)
            IconButton(onClick = { onTaskRemove(task) }) {
                Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete", tint = Color.Red)
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewTaskManagerApp() {
    TaskManagerApp()
}

