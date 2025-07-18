package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qib implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public qib(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    public final yow a() {
        int i = this.b;
        if (i != 0 && i != 1 && i == 2) {
            return yoz.l(((mdx) this.a).a().plus(new yqy(null)));
        }
        return yoz.l(((mdx) this.a).a().plus(new yqy(null)));
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? a() : a() : a() : a();
    }
}
