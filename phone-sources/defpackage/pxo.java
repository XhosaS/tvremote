package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxo implements xcm {
    private final xcq a;
    private final xcq b;
    private final /* synthetic */ int c;

    public pxo(xcq xcqVar, xcq xcqVar2, int i) {
        this.c = i;
        this.a = xcqVar;
        this.b = xcqVar2;
    }

    public final qjl a() {
        if (this.c == 0) {
            return ((qtb) this.a).b().l(((pxv) this.b).b(), "CHIME_NOTIFICATION_RECEIVED", 5);
        }
        xcq xcqVar = this.b;
        yyh yyhVarB = ((qtb) this.a).b();
        pui puiVar = (pui) xcqVar.b();
        puiVar.getClass();
        return yyhVarB.l(puiVar, "CHIME_REFRESH_NOTIFICATIONS", 9);
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        return this.c != 0 ? a() : a();
    }
}
