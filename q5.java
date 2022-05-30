// final methods cannot be overridden
class q15 {
    // Can't be overridden
    final void show() {}
    
}
  
class Child1 extends q5 {
    // This would produce error
    void show() {}
}