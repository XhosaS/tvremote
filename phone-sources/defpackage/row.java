package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class row implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;

    public row(xcq xcqVar, xcq xcqVar2, xcq xcqVar3) {
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vvd b() {
        return new vvd(((rmk) this.a).a(), (tst) ((xcn) this.b).a, ((rmk) this.c).a());
    }
}
