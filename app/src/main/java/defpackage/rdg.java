package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdg {
    static final rdh a = new rde(ahug.a, true);
    private final Random b;
    private final ztw c;
    private final rcq d;

    public rdg(Random random, rcq rcqVar, ztw ztwVar) {
        this.b = random;
        this.c = ztwVar;
        this.d = rcqVar;
    }

    public final rdh a(ahug ahugVar) {
        int iA = ahuf.a(ahugVar.d);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        if (i == 1) {
            return new rde(ahugVar, ahugVar.c == 1000);
        }
        if (i == 3) {
            return new rde(ahugVar, this.b.nextDouble() * 1000.0d < ((double) ahugVar.c));
        }
        if (i != 4) {
            if (i == 5) {
                ahugVar = ahug.a;
            }
            return new rde(ahugVar, true);
        }
        Random random = this.b;
        rcq rcqVar = this.d;
        rcqVar.getClass();
        return new rdf(ahugVar, random, rcqVar, this.c);
    }
}
