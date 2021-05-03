package midtermExam01;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

    /*
        String[] contentsOfBag = {"A", "A", "A", "B", "B", "C", "D"};
        BagInterface<String> myBag = new ArrayBag<>();
        testAdd(myBag, contentsOfBag);

        int size = myBag.getCurrentSize();

        Object[] data = myBag.toArray();

        BagInterface<String> newBag = new ArrayBag<>();

        int totalDups = 0;
        for (int i = 0; i < size; i++) {
            String tmp = (String) data[i];
            if (newBag.contains(tmp)) {
                totalDups += 1;
                newBag.add("DUP." + totalDups + "." + tmp);
            } else {
                newBag.add(tmp);
            }
        }
        
        displayBag(newBag);
    */
    

    /*
    Adding A A A B B C D 
    The bag contains 7 string(s), as follows:
    A A A B B C D 
    The bag contains 7 string(s), as follows:
    A DUP.1.A DUP.2.A B DUP.3.B C D 
    */