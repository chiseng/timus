## Lonesome Knight

I got stuck at somewhat bruteforcing the solution but thanks to marioyc's c++ solution, it gave me a much better algorithm which was intuitive after some visualisation.

Here we can visualise the whole chessboard as a 2D x-y plane with the origin at a1. Shifting up would be positive y, shifting left would be negative x. Convert the chessboard coordinates to 'x' and 'y' coordinates accordingly and shift as how a knight moves. If out of the space, do not include; else increment.
