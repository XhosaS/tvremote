package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahjp extends ahjj {
    private final Iterable d;

    public ahjp(Iterable iterable, agte agteVar, int i, int i2) {
        super(agteVar, i, i2);
        this.d = iterable;
    }

    @Override // defpackage.ahjj
    protected final Object b(ahge ahgeVar, agsw agswVar) {
        ahki ahkiVar = new ahki(ahgeVar);
        Iterator itA = agvm.a(((agqn) this.d).a);
        while (itA.hasNext()) {
            ahal.e(ahgeVar, null, 0, new ahjo((ahgr) itA.next(), ahkiVar, null), 3);
        }
        return agpu.a;
    }

    @Override // defpackage.ahjj
    protected final ahjj c(agte agteVar, int i, int i2) {
        return new ahjp(this.d, agteVar, i, i2);
    }

    @Override // defpackage.ahjj
    public final ahgg f(ahbt ahbtVar) {
        return ahgd.b(ahbtVar, this.a, this.b, 1, 1, new ahji(this, null));
    }

    public /* synthetic */ ahjp(Iterable iterable) {
        super(agtf.a, -2, 1);
        this.d = iterable;
    }
}
