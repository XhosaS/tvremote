package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmp extends ecp {
    final mmr a;
    public final BitSet b;
    private final String[] c;

    public mmp(ecr ecrVar, mmr mmrVar) {
        super(ecrVar);
        this.c = new String[]{"collectionDataSource", "collectionType", "commandResolver", "componentElementSubscription", "conversionContext", "dataLayerSelector", "decorator", "elementConverterFlat", "elementsErrorLogger", "elementsItemTouchHelper", "enableDdcDelayedGetElementByIndex", "enableDebugger"};
        BitSet bitSet = new BitSet(12);
        this.b = bitSet;
        this.a = mmrVar;
        bitSet.clear();
    }

    @Override // defpackage.ecp
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final mmr a() {
        b(12, this.b, this.c);
        return this.a;
    }
}
