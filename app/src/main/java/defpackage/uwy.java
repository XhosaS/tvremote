package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwy extends drn {
    final uwz a;
    public final BitSet d;
    private final String[] e;

    public uwy(dru druVar, uwz uwzVar) {
        super(druVar, uwzVar);
        this.e = new String[]{"binder", "clientScrollable", "commonGridProperties", "layoutInfo", "numRows", "startBiasedScrolling", "xUiKitBridge"};
        BitSet bitSet = new BitSet(7);
        this.d = bitSet;
        this.a = uwzVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(7, this.d, this.e);
        return this.a;
    }
}
