package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imm extends yiz implements yjv {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ vuc d;
    final /* synthetic */ kdj e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imm(kdj kdjVar, String str, vwe vweVar, long j, yih yihVar, int i) {
        super(1, yihVar);
        this.f = i;
        this.e = kdjVar;
        this.b = str;
        this.d = vweVar;
        this.c = j;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        if (this.f == 0) {
            yih yihVar = (yih) obj;
            return new imm(this.e, (wll) this.d, this.b, this.c, yihVar, 0).invokeSuspend(ygi.a);
        }
        yih yihVar2 = (yih) obj;
        return new imm(this.e, this.b, (vwe) this.d, this.c, yihVar2, 1).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(yih yihVar) {
        if (this.f == 0) {
            return new imm(this.e, (wll) this.d, this.b, this.c, yihVar, 0);
        }
        return new imm(this.e, this.b, (vwe) this.d, this.c, yihVar, 1);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.f != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i != 0) {
                return obj;
            }
            kdj kdjVar = this.e;
            String str = this.b;
            vuc vucVar = this.d;
            long j = this.c;
            wyn wynVarF = kdjVar.f();
            vtw vtwVarM = wyx.a.m();
            vtwVarM.getClass();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vuc vucVar2 = vtwVarM.b;
            ((wyx) vucVar2).c = str;
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            wyx wyxVar = (wyx) vtwVarM.b;
            wyxVar.d = (vwe) vucVar;
            wyxVar.b |= 1;
            vwe vweVarE = vxf.e(j);
            vweVarE.getClass();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wyx wyxVar2 = (wyx) vtwVarM.b;
            wyxVar2.e = vweVarE;
            wyxVar2.b |= 2;
            vuc vucVarR = vtwVarM.r();
            vucVarR.getClass();
            this.a = 1;
            Object objY = wynVarF.y((wyx) vucVarR, new xsm(), this);
            return objY == yioVar ? yioVar : objY;
        }
        yio yioVar2 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
            return obj;
        }
        ybn.f(obj);
        kdj kdjVar2 = this.e;
        vuc vucVar3 = this.d;
        String str2 = this.b;
        long j2 = this.c;
        wyn wynVarF2 = kdjVar2.f();
        vtw vtwVarM2 = wyz.a.m();
        vtwVarM2.getClass();
        vtw vtwVarM3 = wpn.a.m();
        vtwVarM3.getClass();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar4 = vtwVarM3.b;
        wpn wpnVar = (wpn) vucVar4;
        wpnVar.c = (wll) vucVar3;
        wpnVar.b |= 1;
        if (!vucVar4.A()) {
            vtwVarM3.u();
        }
        ((wpn) vtwVarM3.b).e = str2;
        vwe vweVarE2 = vxf.e(j2);
        vweVarE2.getClass();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        wpn wpnVar2 = (wpn) vtwVarM3.b;
        wpnVar2.d = vweVarE2;
        wpnVar2.b |= 2;
        vuc vucVarR2 = vtwVarM3.r();
        vucVarR2.getClass();
        wpn wpnVar3 = (wpn) vucVarR2;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wyz wyzVar = (wyz) vtwVarM2.b;
        wyzVar.c = wpnVar3;
        wyzVar.b |= 1;
        vuc vucVarR3 = vtwVarM2.r();
        vucVarR3.getClass();
        this.a = 1;
        Object objZ = wynVarF2.z((wyz) vucVarR3, new xsm(), this);
        return objZ == yioVar2 ? yioVar2 : objZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imm(kdj kdjVar, wll wllVar, String str, long j, yih yihVar, int i) {
        super(1, yihVar);
        this.f = i;
        this.e = kdjVar;
        this.d = wllVar;
        this.b = str;
        this.c = j;
    }
}
