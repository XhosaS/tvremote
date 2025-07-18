package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogs extends drn {
    public final ogu a;
    private final String[] d;
    private final BitSet e;

    public ogs(dru druVar, ogu oguVar) {
        super(druVar, oguVar);
        this.d = new String[]{"componentCallable", "conversionContext"};
        BitSet bitSet = new BitSet(2);
        this.e = bitSet;
        this.a = oguVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ogu a() {
        j(2, this.e, this.d);
        return this.a;
    }

    public final void c(ogh oghVar) {
        this.a.b = oghVar;
        this.e.set(0);
    }

    public final void d(oal oalVar) {
        this.a.c = oalVar;
        this.e.set(1);
    }
}
