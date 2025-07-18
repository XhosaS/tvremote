package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class apw implements crv {
    private final /* synthetic */ int a;

    public /* synthetic */ apw(int i) {
        this.a = i;
    }

    @Override // defpackage.crv, defpackage.cru
    public final Object a() {
        switch (this.a) {
            case 0:
                return new avw(null);
            case 1:
                return new auo(null);
            case 2:
                return new avo(null);
            case 3:
                return new awm(null);
            case 4:
                return ayd.d().a();
            case 5:
                axr axrVar = new axr(bxw.a);
                bdq.f(true, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
                return axrVar;
            case 6:
                ayg aygVarD = ayh.d();
                aygVarD.b(false);
                return aygVarD.a();
            case 7:
                return new atf(new atg(null));
            case 8:
                ayo ayoVarD = ayp.d();
                ayoVarD.b(false);
                return ayoVarD.a();
            case 9:
                ayg aygVarD2 = aut.d();
                aygVarD2.d(false);
                return aygVarD2.c();
            case 10:
                return new ayn(new awc());
            case 11:
                return axb.d().a();
            default:
                return Integer.MAX_VALUE;
        }
    }
}
