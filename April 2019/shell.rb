def minimum_swaps(ratings)
    n = ratings.size - 1
    swap = 0
    n.times do |i|
       (n).downto(i+1) { |j|
          if ratings[j] > ratings[i]  
            ratings[i], ratings[j] = ratings[j], ratings[i] 
             swap += 1
          end
          }
    end
     
   swap
 
 end

  list = [3,1,2,4]
  print  minimum_swaps(list)