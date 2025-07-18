package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ine extends yiz implements yjz {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ String c;
    final /* synthetic */ kw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ine(kw kwVar, long j, String str, yih yihVar) {
        super(2, yihVar);
        this.d = kwVar;
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ine) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ine(this.d, this.b, this.c, yihVar);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, yfo] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            kw kwVar = this.d;
            long j = this.b;
            String str = this.c;
            Object objB = kwVar.a.b();
            vtw vtwVarM = wdz.a.m();
            vtwVarM.getClass();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar = vtwVarM.b;
            wdz wdzVar = (wdz) vucVar;
            wdzVar.b |= 1;
            wdzVar.c = "googletv_mobile";
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            wdz wdzVar2 = (wdz) vucVar2;
            wdzVar2.b |= 2;
            wdzVar2.d = j;
            str.getClass();
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            wdz wdzVar3 = (wdz) vtwVarM.b;
            wdzVar3.b |= 4;
            wdzVar3.e = str;
            vuc vucVarR = vtwVarM.r();
            vucVarR.getClass();
            this.a = 1;
            if (((wek) objB).b((wdz) vucVarR, new xsm(), this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
