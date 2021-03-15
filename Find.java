public DataItem find(int key) { // find item with key
// (assumes table not full)
int hashVal = hashFunc(key); // hash the key
while(hashArray[hashVal] != null) {// until empty cell,
 // found the key?
if(hashArray[hashVal].getKey() == key)
return hashArray[hashVal]; // yes, return item
++hashVal; // go to next cell
hashVal %= arraySize; // wrap around if necessary
}
return null; // can’t find item
}
