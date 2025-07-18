package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imo extends yiz implements yjv {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ wll c;
    final /* synthetic */ boolean d;
    final /* synthetic */ kdj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imo(kdj kdjVar, String str, wll wllVar, boolean z, yih yihVar) {
        super(1, yihVar);
        this.e = kdjVar;
        this.b = str;
        this.c = wllVar;
        this.d = z;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new imo(this.e, this.b, this.c, this.d, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new imo(this.e, this.b, this.c, this.d, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i != 0) {
            return obj;
        }
        wyn wynVar = (wyn) this.e.f().M(uqx.a, new uqx(this.b));
        vtw vtwVarM = wzs.a.m();
        vtw vtwVarM2 = wpr.a.m();
        wll wllVar = this.c;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wpr wprVar = (wpr) vtwVarM2.b;
        wprVar.c = wllVar;
        wprVar.b |= 1;
        vtw vtwVarM3 = wpq.a.m();
        boolean z = this.d;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        ((wpq) vtwVarM3.b).b = z;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wpr wprVar2 = (wpr) vtwVarM2.b;
        wpq wpqVar = (wpq) vtwVarM3.r();
        wpqVar.getClass();
        wprVar2.d = wpqVar;
        wprVar2.b |= 2;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wzs wzsVar = (wzs) vtwVarM.b;
        wpr wprVar3 = (wpr) vtwVarM2.r();
        wprVar3.getClass();
        wzsVar.c = wprVar3;
        wzsVar.b |= 1;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        this.a = 1;
        Object objI = wynVar.I((wzs) vucVarR, new xsm(), this);
        return objI == yioVar ? yioVar : objI;
    }
}
