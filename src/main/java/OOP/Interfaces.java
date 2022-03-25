package OOP;

// <modificatore di visibilita> [interface] nome dell interfaccia
// gli indicatori di visibilita dei metodo non ha motivo di essere utilizzato perche sono implicitamente public abstract
//i metodi all interno dell interfaccia non possono essere implementati, questo la differenza dalla classe astratta, tranne nel caso di default
//le interfaccie non fanno parte di nessun gerarchia di classi tranne nel caso di eredità multipla.
//fanno parte della gerarchia delle interfacce che esprime relazioni concettuali della realta ed è qui possibile l implementazione multipla


public interface Interfaces {

    int x = 10;
    int Z = 40;
    //le classi che implementano le interfacce devono fare l overloading o l override dei metodi dell interfaccia
    //è possibile rendere dei metodi default in modo tale da non dover essere reimplementati
    void stampa();
}
