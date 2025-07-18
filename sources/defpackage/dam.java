package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dam {
    final Class a;

    public dam(Class cls) {
        this.a = cls;
    }

    public dab a(dag dagVar) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public dab b(dbh dbhVar) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public final dab c(byte[] bArr) throws IOException {
        dab dabVarV = dab.v(bArr);
        e(dabVarV);
        return dabVarV;
    }

    public final dab d(dal dalVar, boolean z) {
        dab dabVarA;
        dnx.an(dalVar);
        if (!z) {
            int i = dalVar.a;
            if (i == 1) {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            dab dabVarP = dalVar.d.p();
            if (i == 3) {
                dabVarA = a(dalVar.i(dabVarP));
            } else if (i != 4) {
                e(dabVarP);
                dabVarA = dabVarP;
            } else {
                dabVarA = dabVarP instanceof dag ? a((dag) dabVarP) : b((dbh) dabVarP);
            }
        } else {
            if (!dalVar.n()) {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            dabVarA = dalVar.d.p();
            e(dabVarA);
        }
        e(dabVarA);
        return dabVarA;
    }

    public final void e(dab dabVar) {
        if (!this.a.isInstance(dabVar)) {
            throw new IllegalStateException("unexpected object: ".concat(String.valueOf(dabVar.getClass().getName())));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }
}
