package defpackage;

import android.graphics.PointF;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cve implements cwh {
    public static final cve a = new cve();
    private static final cwk b = cwk.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private cve() {
    }

    @Override // defpackage.cwh
    public final /* bridge */ /* synthetic */ Object a(cwm cwmVar, float f) {
        cwmVar.i();
        String strG = null;
        String strG2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        int i = 3;
        boolean zP = true;
        while (cwmVar.o()) {
            switch (cwmVar.c(b)) {
                case 0:
                    strG = cwmVar.g();
                    break;
                case 1:
                    strG2 = cwmVar.g();
                    break;
                case 2:
                    fA = (float) cwmVar.a();
                    break;
                case 3:
                    int iB4 = cwmVar.b();
                    if (iB4 > 2) {
                        i = 3;
                        break;
                    } else if (iB4 >= 0) {
                        i = new int[]{1, 2, 3}[iB4];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                case 4:
                    iB = cwmVar.b();
                    break;
                case 5:
                    fA2 = (float) cwmVar.a();
                    break;
                case 6:
                    fA3 = (float) cwmVar.a();
                    break;
                case 7:
                    iB2 = cvo.b(cwmVar);
                    break;
                case 8:
                    iB3 = cvo.b(cwmVar);
                    break;
                case 9:
                    fA4 = (float) cwmVar.a();
                    break;
                case 10:
                    zP = cwmVar.p();
                    break;
                case 11:
                    cwmVar.h();
                    PointF pointF3 = new PointF(((float) cwmVar.a()) * f, ((float) cwmVar.a()) * f);
                    cwmVar.j();
                    pointF = pointF3;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    cwmVar.h();
                    PointF pointF4 = new PointF(((float) cwmVar.a()) * f, ((float) cwmVar.a()) * f);
                    cwmVar.j();
                    pointF2 = pointF4;
                    break;
                default:
                    cwmVar.m();
                    cwmVar.n();
                    break;
            }
        }
        cwmVar.k();
        return new csp(strG, strG2, fA, i, iB, fA2, fA3, iB2, iB3, fA4, zP, pointF, pointF2);
    }
}
