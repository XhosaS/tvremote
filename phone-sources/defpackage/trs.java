package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class trs extends trq {
    private final char a;

    public trs(char c) {
        this.a = c;
    }

    @Override // defpackage.tsa
    public final void a(BitSet bitSet) {
        bitSet.set(this.a);
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return c == this.a;
    }

    @Override // defpackage.tsa
    public final tsa d(tsa tsaVar) {
        return tsaVar.b(this.a) ? tsaVar : new Ctry(this, tsaVar);
    }

    public final String toString() {
        return "CharMatcher.is('" + tsa.l(this.a) + "')";
    }
}
