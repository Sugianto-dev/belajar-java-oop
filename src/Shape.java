// MATERI 9 METHOD OVERRIDING
// MATERI 10 SUPER KEYWORD

class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner(){ // Method Overriding dari class Shape diatas
        return 4;
    }

    int getParentCorner(){
        return super.getCorner(); // Super Keyword
    }
}