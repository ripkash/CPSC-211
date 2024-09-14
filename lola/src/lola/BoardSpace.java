package lola;

public enum BoardSpace
{
    // This is using an enum.  If you're not sure what that is, ask me about it.
    Available { public String toString () { return "-";}},
    Player1 { public String toString () { return "1";}}, 
    Player2 { public String toString () { return "2";}}, 
    Missing { public String toString () { return " ";}}
}