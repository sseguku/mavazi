=begin 
Task
Mary is a famous shopkeeper who sells n items in her shop. She assigns each item a unique popularity rating in the inclusive range from 1 to n.

The shop only has one shelf, so the items are displayed array-style in a single row spanning from left to right in a random order. She wants to rearrange the items on the shelf by decreasing popularity rating such that the rating for the i item is always greater than the popularity rating of the (i + 1) item. Mary can swap any two items, i and j, in a single operation. 
=end

def minimum_swaps(ratings)
   n = ratings.size - 1
   swap = 0
   n.times do |i|
      (i + 1).upto(n) { |j|
         if ratings[j] > ratings[i]  
           ratings[i], ratings[j] = ratings[j], ratings[i] 
            swap += 1
         end
         }
   end
    
  ratings

end

  print minimum_swaps([3,1,2,4])