/*

Eternity 2 Puzzle Solver
Tagline: Nothing should take an Eternity to solve
Programmer: Calvin Newman

Background:  The Eternity II is an NP-complete edge-puzzle created by Sir Lord Christopher Mockton in 2007. The game is the second iteration in edge-puzzles created
by mockton. The board itself consist of 256 square puzzle pieces arranged on a 16x16 square lattice.  Each piece has 4 "edge" (equilateral triangles) with a different color/shape. 
To win the game, the player must properly arrange all 256 pieces such that each edge matches the adjacent piece. A valid match includes a piece edge that matches the 
edge piece next to it. Arrange the pieces on a standard 2-demensional plane.  The pieces included "edge" pieces which must be an the outside the board.  The game is an example of a combinatorial optimization problem and is NP-complete, meaning it is difficult for traditional computers to
solve given the current technology. Sir Mockton said in 2007, the best supercomputer of the world may continue searching for a solution until the end of the universe.
Currently it is estimated there are 1.115 X 10^557 possible solutions. (That's 1 follow by 557 0's).

To stimulate interest in the game, sir Mockton posted a 2 million dollar prize to the first person who could find a complete solution.  To date, no one has found a
complete solution.  A partial solution was found (467 out of 480 egdes match) by Louis Verharrd in Sweeden.

The first person to submit a complete solution to Mockton will win roughly 2.0 million dollars (though the offer experied in 2010 ?)

Goals

Primary: Create an "outside the box" algorithm that efficiently solve the Eternity II puzzle with off the shelf commidity hardware.  
Secondary:  Break the "rules", ignore convention and find a unique solution no one's thoguht of..


Strategy:
1.  Start by designing an algorithm to solve the Eternity 2 (6x6) Clue puzzle, then expand the alogrithm to solve the full game.
2.  Buy the clue puzzle and index all the pieces.
3.  Each piece should have a piece numer, and its color/shape abstracted into a usable data table.
4.  Scan each piece to craete a corresponding digital pice
5.  Convert between a upright squarece simple lattice and a diagonal square centered lattic.  It dawned on me the eternity to puzzle can be viewed two ways.
    You can look at it according to the partitions of the pieces, where each piece has 4 edges OR you can look at it as a "square packing problem".  In other words,
    what if you lined up the edges and created a new virtual partition along the small squares.  Instead of looking at a piece has haveing 4 edges, you'd be looking at a
    single color/shape square. I belive you could then look at this puzzle as moref of a packing problem, specifically a "square-in-square packing problem" as opposed 
    to a traditional edge-matching puzzle. 
   - Challanges:
      - difficult to rotate the board in my mind, places a high "cognitive laod" on my brain to abstract this virtually.  Excel can help, but I need a program that lets
      me manipulate lattices and shapes, or places boxs in boxes. 
      - Very challange to store the data, How do I store this data in traditional conventional data structures, I may have to create my own class of container objects
      to make this easier. though I suppose I can still leverage some of Java's existing containers (arraylist, treemaps and arrays).
      data in conventional java data structures. 
      - how do you handle the edges?  I think I'm still going to be stuck with the proble.

****************************************************************************************************************************
 
Helpful Wiki's:

The Eternity II Puzzle: https://en.wikipedia.org/wiki/Eternity_II_puzzle

Aperiodic Tiling: https://en.wikipedia.org/wiki/List_of_aperiodic_sets_of_tiles
Bayer Filter: https://en.wikipedia.org/wiki/Bayer_filter
Cellular Automata: https://en.wikipedia.org/wiki/Cellular_automaton
Cenetered square number: https://en.wikipedia.org/wiki/Centered_square_number
Complete (complexity) Problems: https://en.wikipedia.org/wiki/Complete_(complexity)
Diophantine Equation https://en.wikipedia.org/wiki/Diophantine_equation
Edge-Matching Puzzles: https://en.wikipedia.org/wiki/Edge-matching_puzzle
Euclidian Tiling: https://en.wikipedia.org/wiki/Euclidean_tilings_by_convex_regular_polygons
Gaussian Integers: https://en.wikipedia.org/wiki/Gaussian_integer
Hill Climbing: Optimization technique) https://en.wikipedia.org/wiki/Hill_climbing
   Integer Programming: https://en.wikipedia.org/wiki/Integer_programming
Neighboorhoods (Graph Theory): https://en.wikipedia.org/wiki/Neighbourhood_(graph_theory)
Markov Blanket's: https://en.wikipedia.org/wiki/Markov_blanket
   Moore Neighborhood: https://en.wikipedia.org/wiki/Moore_neighborhood
   Penrose Tiling: https://en.wikipedia.org/wiki/Penrose_tiling
   Rotational Symemtry: https://en.wikipedia.org/wiki/Rotational_symmet
  Square Packing in a Square: : https://en.wikipedia.org/wiki/Square_packing_in_a_square
Square lattice: https://en.wikipedia.org/wiki/Square_lattice 
 TaxiCab Geometry https://en.wikipedia.org/wiki/Taxicab_geometry   
Von Neumann Neighborhood: https://en.wikipedia.org/wiki/Von_Neumann_neighborhood
Wang Tiles: https://en.wikipedia.org/wiki/Wang_tile  

Unrelated but cool 
Skew Apeiohedron: https://en.wikipedia.org/wiki/Skew_apeirohedron

   Academic Papers:

"Wang Tiles for Image and Text Generation" by Michael Cohen: http://www.cs.jhu.edu/~misha/Fall16/Readings/Cohen03.pdf
"The Eternity Puzzle" written by Panos Toulis for his undergrad CS182 class: http://isites.harvard.edu/fs/docs/icb.topic707165.files/pdfs/Toulis.pdf
   
*/



import java.lang.*;

class Eternity2PwnD {

   public static void main(String[] args) {
   
      
      Eternity2Solver e2s = new Eternity2Solver();
         
      
   
   }



















}