package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahj implements amd {
    private final ahf a;
    private final int b;
    private final agr c;
    private final long d;
    private final long e;

    public ahj(ahf ahfVar, int i, agr agrVar, long j, long j2) {
        this.a = ahfVar;
        this.b = i;
        this.c = agrVar;
        this.d = j;
        this.e = j2;
    }

    public static aig b(ahc ahcVar, aib aibVar, int i) {
        int[] iArr;
        int[] iArr2;
        aif aifVar = aibVar.m;
        aig aigVar = aifVar == null ? null : aifVar.d;
        if (aigVar == null || !aigVar.b || ((iArr = aigVar.d) != null ? !qq.g(iArr, i) : !((iArr2 = aigVar.f) == null || !qq.g(iArr2, i))) || ahcVar.h >= aigVar.e) {
            return null;
        }
        return aigVar;
    }

    @Override // defpackage.amd
    public final void a(ami amiVar) {
        ahc ahcVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        ahf ahfVar = this.a;
        if (ahfVar.e()) {
            ajd ajdVar = ajc.a().a;
            if ((ajdVar == null || ajdVar.b) && (ahcVarB = ahfVar.b(this.c)) != null) {
                Object obj = ahcVarB.b;
                if (obj instanceof aib) {
                    long j3 = this.d;
                    boolean z = j3 > 0;
                    if (ajdVar != null) {
                        z &= ajdVar.c;
                        aib aibVar = (aib) obj;
                        boolean z2 = aibVar.z();
                        i = ajdVar.d;
                        int i7 = ajdVar.e;
                        int i8 = ajdVar.a;
                        if (!z2 || aibVar.k()) {
                            i2 = i8;
                            i3 = i7;
                        } else {
                            aig aigVarB = b(ahcVarB, aibVar, this.b);
                            if (aigVarB == null) {
                                return;
                            }
                            boolean z3 = aigVarB.c && j3 > 0;
                            i2 = i8;
                            i3 = aigVarB.e;
                            z = z3;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int iElapsedRealtime = -1;
                    if (amiVar.d()) {
                        i6 = 0;
                        i5 = 0;
                    } else if (((amn) amiVar).c) {
                        i5 = -1;
                        i6 = 100;
                    } else {
                        Exception excB = amiVar.b();
                        if (excB instanceof afy) {
                            Status status = ((afy) excB).a;
                            i4 = status.d;
                            aeq aeqVar = status.g;
                            if (aeqVar != null) {
                                i5 = aeqVar.c;
                            }
                            i6 = i4;
                        } else {
                            i4 = 101;
                        }
                        i5 = -1;
                        i6 = i4;
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
                    int i9 = ((aib) obj).i;
                    Handler handler = ahfVar.k;
                    handler.sendMessage(handler.obtainMessage(18, new ahk(new aix(this.b, i6, i5, j, j2, null, null, i9, iElapsedRealtime), i2, i, i3)));
                }
            }
        }
    }
}
