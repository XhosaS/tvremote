package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbs {
    public static abar a(abdx abdxVar) {
        boolean z;
        try {
            try {
                abdxVar.p();
                z = false;
                try {
                    abbd abbdVar = abdm.S;
                    int iP = abdxVar.p();
                    abar abarVarD = ((abcd) abbdVar).d(abdxVar, iP);
                    if (abarVarD == null) {
                        return ((abcd) abbdVar).c(abdxVar, iP);
                    }
                    ArrayDeque arrayDeque = new ArrayDeque();
                    while (true) {
                        if (abdxVar.n()) {
                            String strE = abarVarD instanceof abau ? abdxVar.e() : null;
                            int iP2 = abdxVar.p();
                            abar abarVarD2 = ((abcd) abbdVar).d(abdxVar, iP2);
                            abar abarVarC = abarVarD2 == null ? ((abcd) abbdVar).c(abdxVar, iP2) : abarVarD2;
                            if (abarVarD instanceof abaq) {
                                ((abaq) abarVarD).a.add(abarVarC);
                            } else {
                                ((abau) abarVarD).k(strE, abarVarC);
                            }
                            if (abarVarD2 != null) {
                                arrayDeque.addLast(abarVarD);
                                abarVarD = abarVarC;
                            }
                        } else {
                            if (abarVarD instanceof abaq) {
                                abdxVar.k();
                            } else {
                                abdxVar.l();
                            }
                            if (arrayDeque.isEmpty()) {
                                return abarVarD;
                            }
                            abarVarD = (abar) arrayDeque.removeLast();
                        }
                    }
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return abat.a;
                    }
                    throw new abay(e);
                }
            } catch (abea e2) {
                throw new abay(e2);
            } catch (IOException e3) {
                throw new abas(e3);
            } catch (NumberFormatException e4) {
                throw new abay(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }
}
