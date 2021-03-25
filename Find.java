 // find item with key and (assumes table not full)
public DataItem find(int key) {
  // hash the key
  int hashVal = hashFunc(key); 

   while(hashArray[hashVal] != null) {
    // until empty cell, found the key?
    if(hashArray[hashVal].getKey() == key)
      return hashArray[hashVal]; // yes, return item
      ++hashVal; // go to next cell
      hashVal %= arraySize; // wrap around if necessary
   }
   return null; // can’t find item
}
