package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class trv extends tsa {
    final tsa b;

    public trv(tsa tsaVar) {
        this.b = tsaVar;
    }

    @Override // defpackage.tsa
    public final void a(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.b.a(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return !this.b.b(c);
    }

    @Override // defpackage.tsa
    public final boolean e(CharSequence charSequence) {
        return this.b.f(charSequence);
    }

    @Override // defpackage.tsa
    public final boolean f(CharSequence charSequence) {
        return this.b.e(charSequence);
    }

    public String toString() {
        return this.b.toString().concat(".negate()");
    }
}
