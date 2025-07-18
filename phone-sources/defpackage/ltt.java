package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltt implements idf {
    public final Object a;
    private final lql b;
    private final /* synthetic */ int c;
    private final moz d;

    public ltt(lql lqlVar, moz mozVar, Object obj, int i) {
        this.c = i;
        this.b = lqlVar;
        this.d = mozVar;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lie] */
    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        if (this.c != 0) {
            ieg iegVar = ((lqy) obj).a;
            vdn vdnVarD = this.d.d(iegVar, tst.i(Locale.getDefault()));
            vtw vtwVarM = vxs.a.m();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            vxs vxsVar = (vxs) vtwVarM.b;
            vdnVarD.getClass();
            vxsVar.c = vdnVarD;
            vxsVar.b |= 1;
            vtw vtwVarM2 = vxw.a.m();
            vxt vxtVar = vxt.a;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vxw vxwVar = (vxw) vtwVarM2.b;
            vxtVar.getClass();
            vxwVar.c = vxtVar;
            vxwVar.b = 1;
            vtwVarM.bF(vtwVarM2);
            return this.b.a(iegVar, (vxs) vtwVarM.r(), vxr.a(), new lqp(8)).c(new ljt(this, 4));
        }
        luk lukVar = (luk) obj;
        this.a.av();
        ksn ksnVar = lukVar.a;
        vdn vdnVarC = this.d.c(ksnVar);
        vtw vtwVarM3 = wbj.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        wbj wbjVar = (wbj) vtwVarM3.b;
        vdnVarC.getClass();
        wbjVar.c = vdnVarC;
        wbjVar.b |= 1;
        vtw vtwVarM4 = wbx.a.m();
        vtw vtwVarM5 = wbw.a.m();
        vtw vtwVarM6 = wbh.a.m();
        String str = lukVar.b;
        if (!vtwVarM6.b.A()) {
            vtwVarM6.u();
        }
        ((wbh) vtwVarM6.b).c = str;
        if (!vtwVarM5.b.A()) {
            vtwVarM5.u();
        }
        wbw wbwVar = (wbw) vtwVarM5.b;
        wbh wbhVar = (wbh) vtwVarM6.r();
        wbhVar.getClass();
        wbwVar.c = wbhVar;
        wbwVar.b = 1 | wbwVar.b;
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        wbx wbxVar = (wbx) vtwVarM4.b;
        wbw wbwVar2 = (wbw) vtwVarM5.r();
        wbwVar2.getClass();
        wbxVar.c = wbwVar2;
        wbxVar.b = 6;
        vtwVarM3.bG(vtwVarM4);
        return this.b.b(ksnVar, (wbj) vtwVarM3.r(), wcq.a(), new lsl(19)).c(new lsl(20));
    }
}
