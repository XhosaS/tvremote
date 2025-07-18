package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nzu implements ont {
    private final nzg a;
    private final int b;
    private final nxn c;
    private final long d;
    private final long e;

    public nzu(nzg nzgVar, int i, nxn nxnVar, long j, long j2) {
        this.a = nzgVar;
        this.b = i;
        this.c = nxnVar;
        this.d = j;
        this.e = j2;
    }

    public static oay b(nzd nzdVar, oat oatVar, int i) {
        int[] iArr;
        int[] iArr2;
        oax oaxVar = oatVar.G;
        oay oayVar = oaxVar == null ? null : oaxVar.d;
        if (oayVar == null || !oayVar.b || ((iArr = oayVar.d) != null ? !ocv.t(iArr, i) : !((iArr2 = oayVar.f) == null || !ocv.t(iArr2, i))) || nzdVar.j >= oayVar.e) {
            return null;
        }
        return oayVar;
    }

    @Override // defpackage.ont
    public final void a(onz onzVar) {
        nzd nzdVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        nzg nzgVar = this.a;
        if (nzgVar.g()) {
            ocb ocbVar = oca.a().a;
            if ((ocbVar == null || ocbVar.b) && (nzdVarB = nzgVar.b(this.c)) != null) {
                Object obj = nzdVarB.b;
                if (obj instanceof oat) {
                    long j3 = this.d;
                    int i6 = 0;
                    boolean z = j3 > 0;
                    oat oatVar = (oat) obj;
                    int i7 = oatVar.C;
                    if (ocbVar != null) {
                        z &= ocbVar.c;
                        boolean zT = oatVar.T();
                        i = ocbVar.d;
                        i3 = ocbVar.e;
                        i2 = ocbVar.a;
                        if (zT && !oatVar.E()) {
                            oay oayVarB = b(nzdVarB, oatVar, this.b);
                            if (oayVarB == null) {
                                return;
                            }
                            boolean z2 = oayVarB.c && j3 > 0;
                            i3 = oayVarB.e;
                            z = z2;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int iElapsedRealtime = -1;
                    if (onzVar.i()) {
                        i5 = 0;
                    } else if (((ooe) onzVar).c) {
                        i6 = -1;
                        i5 = 100;
                    } else {
                        Exception excD = onzVar.d();
                        if (excD instanceof nwk) {
                            Status status = ((nwk) excD).a;
                            i4 = status.f;
                            nve nveVar = status.i;
                            if (nveVar != null) {
                                i5 = i4;
                                i6 = nveVar.c;
                            }
                        } else {
                            i4 = 101;
                        }
                        i5 = i4;
                        i6 = -1;
                    }
                    if (z) {
                        long j4 = this.e;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    Handler handler = nzgVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new nzv(new obv(this.b, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i2, i, i3)));
                }
            }
        }
    }
}
