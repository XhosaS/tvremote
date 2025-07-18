package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxy implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;

    public pxy(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pxx b() {
        return new pxx((pyd) this.a.b(), (qbd) this.b.b(), (pwp) this.c.b(), xcl.a(this.d));
    }
}
