package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eds extends ecp {
    final edt a;
    private final String[] b;
    private final BitSet c;

    public eds(ecr ecrVar, edt edtVar) {
        super(ecrVar);
        this.b = new String[]{"component"};
        BitSet bitSet = new BitSet(1);
        this.c = bitSet;
        this.a = edtVar;
        bitSet.clear();
    }

    @Override // defpackage.ecp
    public final /* bridge */ /* synthetic */ ecq a() {
        b(1, this.c, this.b);
        return this.a;
    }

    public final void c(drq drqVar) {
        this.a.m = drqVar == null ? null : drqVar.l();
        this.c.set(0);
    }
}
