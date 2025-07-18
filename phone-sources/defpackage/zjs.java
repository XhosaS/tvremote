package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zjs {
    final Class a;

    public zjs(Class cls) {
        this.a = cls;
    }

    public zjh a(zjm zjmVar) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public zjh b(zkn zknVar) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public final zjh c(byte[] bArr) throws IOException {
        zjh zjhVarV = zjh.v(bArr);
        e(zjhVarV);
        return zjhVarV;
    }

    public final zjh d(zjr zjrVar, boolean z) {
        zjh zjhVarA;
        wcq.ar(zjrVar);
        if (!z) {
            int i = zjrVar.a;
            if (i == 1) {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            zjh zjhVarP = zjrVar.d.p();
            if (i == 3) {
                zjhVarA = a(zjrVar.i(zjhVarP));
            } else if (i != 4) {
                e(zjhVarP);
                zjhVarA = zjhVarP;
            } else {
                zjhVarA = zjhVarP instanceof zjm ? a((zjm) zjhVarP) : b((zkn) zjhVarP);
            }
        } else {
            if (!zjrVar.n()) {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            zjhVarA = zjrVar.d.p();
            e(zjhVarA);
        }
        e(zjhVarA);
        return zjhVarA;
    }

    public final void e(zjh zjhVar) {
        if (!this.a.isInstance(zjhVar)) {
            throw new IllegalStateException("unexpected object: ".concat(String.valueOf(zjhVar.getClass().getName())));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }
}
