import { HashTable } from "./HashTable.mjs";

let hashTable = new HashTable();

hashTable.set(1, "김1");
hashTable.set(4, "김4");
hashTable.set(20, "김20");
hashTable.set(16, "김16");
hashTable.set(21, "김21");
hashTable.set(22, "김22");

console.log(`1: ${hashTable.get(1)}`);
hashTable.remove(1);
console.log(`1: ${hashTable.get(1)}`);
console.log(`21: ${hashTable.get(21)}`);