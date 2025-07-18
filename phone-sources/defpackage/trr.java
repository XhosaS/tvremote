package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class trr extends trq {
    private final char a;
    private final char b;

    public trr(char c, char c2) {
        a.H(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.tsa
    public final void a(BitSet bitSet) {
        bitSet.set(this.a, this.b + 1);
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + tsa.l(this.a) + "', '" + tsa.l(this.b) + "')";
    }
}
