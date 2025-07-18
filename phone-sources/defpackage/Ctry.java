package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* renamed from: try, reason: invalid class name */
/* loaded from: classes.dex */
public final class Ctry extends tsa {
    final tsa a;
    final tsa b;

    public Ctry(tsa tsaVar, tsa tsaVar2) {
        this.a = tsaVar;
        this.b = tsaVar2;
    }

    @Override // defpackage.tsa
    public final void a(BitSet bitSet) {
        this.a.a(bitSet);
        this.b.a(bitSet);
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return this.a.b(c) || this.b.b(c);
    }

    public final String toString() {
        tsa tsaVar = this.b;
        return "CharMatcher.or(" + this.a.toString() + ", " + tsaVar.toString() + ")";
    }
}
