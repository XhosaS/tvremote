package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mrv implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;

    public mrv(xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mru b() {
        return new mru(this.a, this.b, this.c);
    }
}
