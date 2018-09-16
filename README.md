Brownies
This is a project to devise a programme to help brownie guide leaders plan for brownie camps by sorting brownies into tents according to friendships. 

Brownie pseudocode:
  Purpose of program: to fill tents with Brownies on the basis of friendships to optimise the happiness of the camp

Information input:
  Each brownie names up to three people (in order) that she wishes to share with
  The camp organiser can indicate if there are brownie pairings or groupings that are disallowed


Brownie class:
  Each brownie has:
    private: a name
    private: a list of up to three other brownies she would wish to pair with (obtained from input)
    private: a popularity score calculated according to how many brownies like them
  
Brownie instantiator function:
  from file instantiates brownie with name and list of friends (populariry remains null)
  thus has a list of brownies 


Temt_filler class
  fills tents with browmies according a rule basd oon their attributes e.g. popularity

Tent class
  Each tent:
    has a know capacity for brownies
    will be populated with brownies up to that capacity
    
Camp class
  Has a list of tent objects
  Each (theore
  
   
Brownies class store string array of friends (array)

 Brownies have a popularity score (can calculate and get) (instance variable)      
    Brownie have names (setter)
    Brownies have up to two people they mustn't share with (not themselves)(setter and getter)
    Brownies have brownies they like (not themselves)(setter  and getter)
          Tents start empty

Tent class
stores brownies objects as key value pairs 

Camp class
stores brownies objects paired with popularity scores that is calculates 



Tent are numbered (setter)
Tents have a capacity (getter and setter) (constant)
Tents have means of calculating and returning a happiness score (instance variable) (getter)
Tents have an occupancy (instance variable)

Venue class
venue
       number of tents (constant)
       tent total happiness (getter) (instance variable)
       tent average happiness (getter) 

       Assess tent happiness (total)
       Greatest overall happiness (getter)
       Greatest average happiness (getter)
       Least variable happiness (getter)

Rule class
Assess above using a rule
      

               Rule 1 brownie in tent with          someone she likes .... Score 1 (variable)
                                                                     someone she likes who likes her.....Score 2 (variable)
    t
