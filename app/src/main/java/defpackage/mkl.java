package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkl extends drn {
    final mkm a;
    public final BitSet d;
    private final String[] e;

    public mkl(dru druVar, mkm mkmVar) {
        super(druVar, mkmVar);
        this.e = new String[]{"commandResolver", "conversionContext", "logger", "onFrameCompleteCommandFuture", "onProgressCompleteCommandFuture", "type"};
        BitSet bitSet = new BitSet(6);
        this.d = bitSet;
        this.a = mkmVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(6, this.d, this.e);
        return this.a;
    }
}
