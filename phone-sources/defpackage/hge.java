package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hge implements hhc {
    public static final hge a = new hge();
    private static final ghd b = ghd.d("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private hge() {
    }

    @Override // defpackage.hhc
    public final /* synthetic */ Object a(hhf hhfVar, float f) {
        hhfVar.h();
        String strF = null;
        String strF2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        boolean zO = true;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        while (true) {
            int i = 3;
            while (hhfVar.n()) {
                switch (hhfVar.q(b)) {
                    case 0:
                        strF = hhfVar.f();
                        break;
                    case 1:
                        strF2 = hhfVar.f();
                        break;
                    case 2:
                        fA = (float) hhfVar.a();
                        break;
                    case 3:
                        int iB4 = hhfVar.b();
                        if (iB4 <= 2 && iB4 >= 0) {
                            i = a.aZ()[iB4];
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 4:
                        iB = hhfVar.b();
                        break;
                    case 5:
                        fA2 = (float) hhfVar.a();
                        break;
                    case 6:
                        fA3 = (float) hhfVar.a();
                        break;
                    case 7:
                        iB2 = hgm.b(hhfVar);
                        break;
                    case 8:
                        iB3 = hgm.b(hhfVar);
                        break;
                    case 9:
                        fA4 = (float) hhfVar.a();
                        break;
                    case 10:
                        zO = hhfVar.o();
                        break;
                    case 11:
                        hhfVar.g();
                        PointF pointF3 = new PointF(((float) hhfVar.a()) * f, ((float) hhfVar.a()) * f);
                        hhfVar.i();
                        pointF = pointF3;
                        break;
                    case 12:
                        hhfVar.g();
                        PointF pointF4 = new PointF(((float) hhfVar.a()) * f, ((float) hhfVar.a()) * f);
                        hhfVar.i();
                        pointF2 = pointF4;
                        break;
                    default:
                        hhfVar.l();
                        hhfVar.m();
                        break;
                }
            }
            hhfVar.j();
            return new hea(strF, strF2, fA, i, iB, fA2, fA3, iB2, iB3, fA4, zO, pointF, pointF2);
        }
    }
}
