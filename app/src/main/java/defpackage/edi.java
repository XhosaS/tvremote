package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edi extends ecp {
    public final edj a;
    public final BitSet b;
    private final String[] c;

    public edi(ecr ecrVar, edj edjVar) {
        super(ecrVar);
        this.c = new String[]{"data"};
        BitSet bitSet = new BitSet(1);
        this.b = bitSet;
        this.a = edjVar;
        bitSet.clear();
    }

    @Override // defpackage.ecp
    public final /* bridge */ /* synthetic */ ecq a() {
        b(1, this.b, this.c);
        return this.a;
    }
}
