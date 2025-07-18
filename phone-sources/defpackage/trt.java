package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class trt extends trq {
    private final char a;
    private final char b;

    public trt(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.tsa
    public final void a(BitSet bitSet) {
        bitSet.set(this.a);
        bitSet.set(this.b);
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + tsa.l(this.a) + tsa.l(this.b) + "\")";
    }
}
