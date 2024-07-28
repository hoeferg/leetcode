[11, 3, 23, 7, 17]

//O(1) b/c the index does not change
myList.add(17);
myList.remove(4);

//O(n) b/c we have to touch each item in the arrray list. We had the change the index for each instance
myList.remove(0);
myList.add(0, 11);

//O(n) because we have to touch all the iteams after the insert
myList.add(1, 99);
myLiast.remove(1);

//Finding number of value is o(n)
//We have to look at each item

// O(n) only measures worse case

//If we are looking for something by index then it is O(1) because we only have to touch something one time
