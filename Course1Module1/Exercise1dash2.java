package Course1Module1;
public class Exercise1dash2 {
    public static void main(String[] args) {
        boolean p = true;
        boolean q = true;
        boolean r = true;

        System.out.println((!p && !q) || (p && r));
        
    }
}
/*

    ((r ∧¬m ∧ ¬b) → g)

         (q→p)
        (q∧¬p)
         (q→p) 
        (¬q→¬p)
    The following questions relate to inhabitants of the island of knights and knaves created by Smullyan, where knights always tell the truth and knaves always lie. You encounter two people, A and B. Determine, if possible, what A and B are if they address you in the ways described. If you cannot determine what these two people are, can you draw any conclusions?
        A says “At least one of us is a knave” and B says nothing.  -- If A is lying, then he is a Knave. As such, B must also be a Knave. If A is a Knight, then B must be a Knave. Either way, B is a Knave.
        A says “I am a knave or B is a knight” and B says nothing. -- If A is lying, then he is a Knave. As such, B must also be a Knave. If A is a Knight, then B must be a Knave. Either way, B is a Knave.
        A says “We are both knaves” and B says nothing. -- A must be a Knave, and B must be a Knight.
    A detective has interviewed four witnesses to a crime. From the stories of the witnesses the detective has concluded that if the butler is telling the truth then so is the cook; the cook and the gardener cannot both be telling the truth; the gardener and the handyman are not both lying; and if the handyman is telling the truth then the cook is lying. For each of the four witnesses, can the detective determine whether that person is telling the truth or lying? Explain your reasoning. (Hint: This puzzle can be solved by translating statements into logical expressions and reasoning from these expressions using truth tables.)

if b then c

c nand g

g or h

h then not c

b     c    then

T      T      T

T       F     F

F       T     T

F       F      T

___________

c      g      nand

T      T       F

T      F        T

F       T       T

F       F      T

____________

g       h      or

T      T        T

T       F       T 

F       T       T

F       F       F

____________

h       !c      then

T        T         F

T        F         T

F        T          T

F       F           T

c cannot be true if h is true.

h cannot be false if g is false

c cannot be true if g is true

b cannot be true if c is false

 

if c is false b is false

if c is true, h is false

if c is true, g is false

h and g are not both false

therefore:

c is false

b is false

 

in other words,

if c is true: g is false and h is false. g cannot be false because h is false. Therefore: C must be false

The butler must be lying, because otherwise the cook would be telling the truth, and the cook must lie.

if h is true, c is false or true.

if h is false, c is false or true.

if c is true, h must be false.

 

Conclusion: We know with 100% certainty that the cook is lying. Additionally, we know that the butler is lying. However, we cannot determine whether the handyman or the gardener is lying. We know they both cannot lie, however, either or both could be telling the truth.

 

    Find the output of each of these combinatorial circuits.
        Ex1-2.5a
        p   q   r    result
        T   T   T      F
        T   F    F     F
        F   T    F     T
        F    F   T     T 
        T    T   F     F
        T    F   T     T
        F    T   T     T
        F    F   F     T
        Ex1-2.5b
        p   q   r    result
        T   T   T      T   
        T   F    F     F  
        F   T    F     F
        F    F   T     T
        T    T   F     F
        T    F   T     T
        F    T   T     F
        F    F   F     T


 */