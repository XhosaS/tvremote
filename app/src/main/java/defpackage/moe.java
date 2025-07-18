package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class moe extends drn {
    final mog a;
    public final BitSet d;
    private final String[] e;

    public moe(dru druVar, mog mogVar) {
        super(druVar, mogVar);
        this.e = new String[]{"child", "gestureProtector"};
        BitSet bitSet = new BitSet(2);
        this.d = bitSet;
        this.a = mogVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    public final /* bridge */ /* synthetic */ drq a() {
        j(2, this.d, this.e);
        return this.a;
    }
}
