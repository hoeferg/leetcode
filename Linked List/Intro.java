// to add something to the end of a linked list would be 0(1)
//to remove from end is O(m) because we had to touch evert single node in the list. This is because we cannot go back in a linked list
//Adding an item in the begining O(1). Its the same num of operations to add to the begineening
//To remove from the front we need to move the pointer to the next. Then remove node from list. This is a fixed num of steps so this is O(1)
//To instert a node in the middle inmdex = 3. We start of head and then go theouigh the list and find wich node we want the insert node to point to. We then point the new node to the next node and the old node points to the nbumber that we are inserting. Because we had to interate though the list this is o(n)
//To remove the node in the middle of list, we have to start at the beginening of the list with head, iteratge though to get to the needed node. We change the pinter to point to the next number and then set the olde pointer = to null. We had to iterate though the list so this is O(n)
//Of we want to look for an item of value. We start at the head a nd iterate though. At each step we check if the value is the needed value. We can also use index. If we know the index its the same steps. This is O(n).
//An array list is better for remove last and luukup by index. 
//Linked list is better for prepend (adding to the begineeing) and remove first


//What is a node = The value and the pointer
{
    "value" = 4,
    "next" = null
}

//How you have a node point to the next node
{
    "value" = 4,
    "next" = {
        "value" = 4,
        "next" = null
    }
}
 //Hasmap wiht in a hashmap