val todoList: Any

fun main(){
    val todolist=
      mutableListOf<string>()
      var exit=false
     while(!exit){
         println("what would you like to do?")
         println("1.View all todos")
         println("2.Add a todo")
         println("3.Update a todo")
         println("4.Delete a todo")
         println("Exit")

           val choice=
               readline()?.toIntOrNull()
         when(choice){
             1->{
                 println("Todos:")
                 if(todoList.isEmpty()){
                     println("NO todos found.")
                 } else{
                     todolist.forEachlndexed
                     {
                       index,todo->
                         println("${index+1}.$todo")
                     }
                 }

             }
             2->{
                 println("Enter the todo:")
                 val todo=readline()
                 todo?.let{
                     todoList.add(it)
                     println("Todo added sucessfully.")

                 }
                 3->run run {
                     prinln("Enter the index of the todo to update:")
                     val index =
                         readline()?.toIntOrNull()
                     if (index != null && index >= 1 && index <= todoList.size) {
                         println("Enter the new todo:")
                         val newTodo = readline()
                         newTodo?.let {
                             todoList[index - 1] = it
                             println("Todo updated sucessfully.")
                         }
                     } else {
                         println("Enter the index of the todo to delete:")
                         var index =
                             readline()?.toIntOrNull
                         if (index1 != null && index >= 1 && index <= todoList.size) {
                             val todoListodoList = null
                             todoListodoList.removeAt(index - 1)
                             println("Todo deleted sucessfully.")
                         } else {
                             println("invalid index.")

                         }

                     }
                     5->{
                     exit = true
                     println("Goodbye!")
                 }
                     println()
                 }
             }

         }
     }










}
