package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpr extends drn {
    public final mpt a;
    public final BitSet d;
    private final String[] e;

    public mpr(dru druVar, mpt mptVar) {
        super(druVar, mptVar);
        this.e = new String[]{"children", "commandResolver", "conversionContext", "decoratorManager", "enableAndroidScrollableContainerInitialState", "enableScrollableContainerCommandEventDataDecorator", "flexDirection", "logger", "onScrollBeganDraggingCommandFuture", "onScrollCommandFuture", "onScrollDidStopCommandFuture", "scrollableContainerType"};
        BitSet bitSet = new BitSet(12);
        this.d = bitSet;
        this.a = mptVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(12, this.d, this.e);
        return this.a;
    }

    public final void b(boolean z) {
        this.a.e = z;
        this.d.set(4);
    }

    public final void c(int i) {
        this.a.y = i;
        this.d.set(6);
    }
}
