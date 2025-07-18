package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhx extends drn {
    final mhy a;
    public final BitSet d;
    private final String[] e;

    public mhx(dru druVar, mhy mhyVar) {
        super(druVar, mhyVar);
        this.e = new String[]{"componentElementSubscription", "delegate", "elementConverterFlat", "templateLoggerFactory"};
        BitSet bitSet = new BitSet(4);
        this.d = bitSet;
        this.a = mhyVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mhy a() {
        j(4, this.d, this.e);
        return this.a;
    }
}
