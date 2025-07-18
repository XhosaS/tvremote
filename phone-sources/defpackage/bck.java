package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bck implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bck(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, yft] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, yft] */
    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                List list = ((bcl) this.a).a;
                ki kiVar = new ki(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    tqp tqpVar = (tqp) list.get(i);
                    Object obj = tqpVar.d;
                    bfv.b(kiVar, obj != null ? new bbr(Integer.valueOf(tqpVar.b), obj) : Integer.valueOf(tqpVar.b), tqpVar);
                }
                return new bfv(kiVar);
            case 1:
                float fA = no.b.a(0.0f);
                float[] fArr = box.a;
                Object obj2 = this.a;
                bov bovVar = box.x;
                axd axdVar = ((aux) obj2).i;
                long jE = bnq.e(axdVar.a, bovVar);
                long j = axdVar.b;
                long jE2 = bnq.e(j, bovVar);
                float fA2 = bnq.a(jE);
                float fD = bnq.d(jE);
                float fC = bnq.c(jE);
                float fB = bnq.b(jE);
                float fA3 = bnq.a(jE2);
                float fD2 = bnq.d(jE2);
                float fC2 = bnq.c(jE2);
                float fB2 = bnq.b(jE2);
                float f = fA >= 0.0f ? fA : 0.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                return new bnq(bnq.e(bny.l(cmq.f(fD, fD2, f), cmq.f(fC, fC2, f), cmq.f(fB, fB2, f), cmq.f(fA2, fA3, f), bovVar), bnq.f(j)));
            case 2:
                return this.a;
            case 3:
                return this.a;
            case 4:
                return this.a;
            case 5:
                return this.a;
            case 6:
                return this.a;
            case 7:
                return this.a;
            case 8:
                return this.a;
            case 9:
                return this.a;
            case 10:
                return this.a;
            case 11:
                return this.a;
            case 12:
                return this.a;
            case 13:
                return this.a;
            case 14:
                return this.a;
            case 15:
                return this.a;
            case 16:
                return this.a;
            case 17:
                return ((bck) this.a).a;
            case 18:
                return czu.l(this.a).getViewModelStore();
            case 19:
                dxd dxdVarL = czu.l(this.a);
                duz duzVar = dxdVarL instanceof duz ? (duz) dxdVarL : null;
                return duzVar != null ? duzVar.getDefaultViewModelCreationExtras() : dxh.a;
            default:
                return this.a;
        }
    }
}
