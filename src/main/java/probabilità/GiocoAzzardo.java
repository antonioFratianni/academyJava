package probabilità;

import javax.naming.ldap.spi.LdapDnsProvider;

public class GiocoAzzardo {

    public static void main(String[] args) {

        Moneta moneta = new Moneta();
        Dado dado = new Dado();

        moneta.lancio();
        moneta.print();

        dado.lancio();
        dado.print();

    }
}
