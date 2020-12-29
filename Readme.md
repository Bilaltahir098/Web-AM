# Web-AM
The project contains data and implementation code of "Web-AM: Web-AM: An Efficient Boilerplate Removal Algorithm for Web Articles". The PDF of the paper is available at https://ieeexplore.ieee.org/document/8991633

## Datasets
Web-AM algorithm is tested on three gold standard datasets of CleanPortalEval, L3S-GN1, and CURWEB dataset.
1. CleanPortalEval dataset is available at https://github.com/ppke-nlpg/CleanPortalEval
2. L3S-GN1 dataset can be downloaded from http://www.l3s.de/~kohlschuetter/boilerplate/
3. CURWEB dataset is exclusively build to test the efficacy of Web-AM algorithm on Urdu text. The dataset contains 200 webpages related to 5 categories crawled from 103 websites. 
The dataset contains one document per file. The first line of each file contains the URL of the webpage and main content of webpages is copied in the next lines of the file.

## Web-AM implementation
The Web-AM algorithm is implemented in Java language. To test the Web-AM, first, compile the code attached in Web-AM folder. Next, the compiled code can be used to import the Web-AM class. The sample code to test the compiled Web-AM code is also attached as "Test Web-AM.java".


## Reference

If you use the data or algorithm, please cite the following paper:

` @inproceedings{aslam2019web,
 title={Web-AM: An Efficient Boilerplate Removal Algorithm for Web Articles},
  author={Aslam, Naseer and Tahir, Bilal and Shafiq, Hafiz Muhammad and Mehmood, Muhammad Amir},
  booktitle={2019 International Conference on Frontiers of Information Technology (FIT)},
  pages={287--2875},
  year={2019},
  organization={IEEE}
}`

