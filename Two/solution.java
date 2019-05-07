import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {
  private List<I> list = null;
  private int itemsPerPage = 0;
  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
      this.list = collection;
      this.itemsPerPage = itemsPerPage;
  }
  
  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
   return list.size();
  }
  
  /**
   * returns the number of pages
   */
  public int pageCount() {
    
    int s = list.size();
    
    if(s == 0 || this.itemsPerPage==0)
      return -1;
    int i=s / this.itemsPerPage;
    
    if(s%this.itemsPerPage != 0)
      return i+1;
    return i;
  }
  
  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
     int count=pageCount();
     if(pageIndex+1>count)
       return -1;
     else if(pageIndex+1==count){
      int s=this.list.size();
      if(s<this.itemsPerPage)
        return s;
      else 
        return(s-this.itemsPerPage*pageIndex);
    }
    else return this.itemsPerPage ;
  }
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
      if(itemIndex<0 || itemIndex>this.list.size()-1)
        return -1;
      return itemIndex/this.itemsPerPage;
  }
}