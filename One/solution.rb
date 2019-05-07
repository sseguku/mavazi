def loop_size(node)
 
    slow = node 
    fast = node 
    len_slow = 1
    len_fast = 1
    loop do
      slow = slow.next   
      fast = fast.next.next 
      
      len_slow += 1
      len_fast += 2
      break if slow == fast
    end
    
    loop_len = len_fast - len_slow
    return loop_len
  end