package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class trp extends tru {
    private final BitSet a;

    public trp(BitSet bitSet, String str) {
        super(str);
        this.a = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    @Override // defpackage.tsa
    public final void a(BitSet bitSet) {
        bitSet.or(this.a);
    }

    @Override // defpackage.tsa
    public final boolean b(char c) {
        return this.a.get(c);
    }
}
