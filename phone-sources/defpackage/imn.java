package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imn extends yiz implements yjv {
    int a;
    final /* synthetic */ wll b;
    final /* synthetic */ boolean c;
    final /* synthetic */ kdj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imn(kdj kdjVar, wll wllVar, boolean z, yih yihVar) {
        super(1, yihVar);
        this.d = kdjVar;
        this.b = wllVar;
        this.c = z;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new imn(this.d, this.b, this.c, (yih) obj).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(yih<?> yihVar) {
        return new imn(this.d, this.b, this.c, yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i != 0) {
            return obj;
        }
        wyn wynVarF = this.d.f();
        vtw vtwVarM = wzl.a.m();
        vtw vtwVarM2 = wpp.a.m();
        wll wllVar = this.b;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wpp wppVar = (wpp) vtwVarM2.b;
        wllVar.getClass();
        wppVar.c = wllVar;
        wppVar.b |= 1;
        vtw vtwVarM3 = woe.a.m();
        boolean z = this.c;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        ((woe) vtwVarM3.b).b = z;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wpp wppVar2 = (wpp) vtwVarM2.b;
        woe woeVar = (woe) vtwVarM3.r();
        woeVar.getClass();
        wppVar2.d = woeVar;
        wppVar2.b |= 2;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wzl wzlVar = (wzl) vtwVarM.b;
        wpp wppVar3 = (wpp) vtwVarM2.r();
        wppVar3.getClass();
        wzlVar.c = wppVar3;
        wzlVar.b |= 1;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        this.a = 1;
        Object objF = wynVarF.F((wzl) vucVarR, new xsm(), this);
        return objF == yioVar ? yioVar : objF;
    }
}
