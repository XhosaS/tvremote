package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mld extends drn {
    final mlf a;
    public final BitSet d;
    private final String[] e;

    public mld(dru druVar, mlf mlfVar) {
        super(druVar, mlfVar);
        this.e = new String[]{"children", "collectionDisposable", "collectionType", "commandResolver", "conversionContext", "dataDrivenCollectionHelper", "dataLayerSelector", "enableDdcDelayedGetElementByIndex", "enableDebugger", "enableFlowLayoutReplaceLinearLayout", "logger", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollToItemCommandHandler"};
        BitSet bitSet = new BitSet(15);
        this.d = bitSet;
        this.a = mlfVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(15, this.d, this.e);
        return this.a;
    }
}
