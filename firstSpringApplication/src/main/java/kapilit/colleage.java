package kapilit;

import java.util.Map;

public class colleage {
 private int cid;
 private int cName;
 Map<String,String> map;
 public colleage() {
	super();
 }
 public colleage(int cid, int cName, Map<String, String> map) {
	super();
	this.cid = cid;
	this.cName = cName;
	this.map = map;
 }
 @Override
 public String toString() {
	return "colleage [cid=" + cid + ", cName=" + cName + ", map=" + map + "]";
 }
 
 
}
