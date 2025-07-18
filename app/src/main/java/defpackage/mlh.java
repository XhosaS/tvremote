package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlh extends ecp {
    final mli a;
    public final BitSet b;
    private final String[] c;

    public mlh(ecr ecrVar, mli mliVar) {
        super(ecrVar);
        this.c = new String[]{"children", "collectionType", "componentElementSubscription", "conversionContext", "decorator", "elementConverterFlat"};
        BitSet bitSet = new BitSet(6);
        this.b = bitSet;
        this.a = mliVar;
        bitSet.clear();
    }

    @Override // defpackage.ecp
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final mli a() {
        b(6, this.b, this.c);
        return this.a;
    }
}
