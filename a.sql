set serveroutput on declare a number;
b number;
c number;
begin a := & a;
b := & b;
c := a;
a := b;
b := c;
dbms_output.put_line(' after swapping value of a and b is ' || a || ', ' || b || '');
end;
/