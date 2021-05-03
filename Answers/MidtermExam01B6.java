package midtermExam01;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

    /*
     public boolean findTheThird(T entry) {
        int counter = 0;
        if (!isEmpty()) {
            Node currentNode = firstNode;
            T currentEntry;
            while (currentNode != null) {
                currentEntry = currentNode.data;
                if (currentEntry.equals(entry)) {
                    counter++;

                    // Leave the second item intact
                    if (counter == 2) {
                        currentNode = currentNode.next; // Continue searching
                        continue;
                    }

                    // Replace the third occurence with the string "Found3rd"  
                    if (counter == 3) {
                        currentNode.data = (T) "Found3rd";
                        currentNode = currentNode.next; // Continue searching
                        continue;
                    }

                    currentNode.data = firstNode.data; // Replace located entry with entry in first node
                    firstNode = firstNode.next; // Remove first node
                    numberOfEntries--;
                } // end if
                currentNode = currentNode.next; // Continue searching
            } // end while
        }
        return counter > 0;
    }
    */