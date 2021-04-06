# bitmap-transformer

## Challenge

  Take in a bitmap file, manipulate it, and return it as a new - manipulated - file.
  
## Big 0

Time = 0(n)
Space = O(1)

## Solution

  We scanned a bmp with imageIO, using File, and made manipulations to it, including:
  
### Invert
 
 Takes the pixel rgb value and subtracts the original value from 255 and reassigns the new pixel to that pixel.

### NinetyDegrees

 Turns the picture 90 degrees clockwise using linear algebra.

### Whiteout

 We itereated over each pixel and overwrites it to a RGB value of -1 (white).
