import java.util.*;
public class Event {

protected int id;
protected String title,description;
private Date startD = new Date(); 
private Date endD = new Date();

public Event(String title,String des,Date start,Date end){

id = 0;

this.title = title;
description = des;

if(start.after(end))
throw new IllegalArgumentException() ;

else

startD = start;
endD = end; }

}