package defpackage;

import android.database.Cursor;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.ImmutableList;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cme {
    public static Boolean a;

    public cme() {
    }

    public static boolean A(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static byte[] B(ees eesVar, String str, byte[] bArr, Map map) throws epv {
        Map map2;
        List list;
        efw efwVar = new efw(eesVar);
        eex eexVar = new eex();
        eexVar.b(str);
        eexVar.e = map;
        eexVar.c = 2;
        eexVar.d = bArr;
        eexVar.i = 1;
        eey eeyVarA = eexVar.a();
        int i = 0;
        while (true) {
            try {
                eew eewVar = new eew(efwVar, eeyVarA);
                try {
                    return tzu.a(eewVar);
                } catch (efm e) {
                    try {
                        int i2 = e.c;
                        String str2 = null;
                        if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i++;
                        eex eexVar2 = new eex(eeyVarA);
                        eexVar2.b(str2);
                        eeyVarA = eexVar2.a();
                    } finally {
                        edt.ac(eewVar);
                    }
                }
            } catch (Exception e2) {
                efwVar.e();
                throw new epv(e2);
            }
        }
    }

    public static void C(eox eoxVar, eox eoxVar2) {
        if (eoxVar == eoxVar2) {
            return;
        }
        if (eoxVar2 != null) {
            eoxVar2.o(null);
        }
        if (eoxVar != null) {
            eoxVar.p(null);
        }
    }

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final long c(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + cmf.a(j2);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + cmf.b(j2);
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final long d(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static float e(cmd cmdVar, long j) {
        cmn cmnVarB;
        if (!a.s(cmk.c(j), 4294967296L)) {
            b("Only Sp can convert to Px");
        }
        int i = cmo.a;
        if (cmo.a(cmdVar.b()) && (cmnVarB = cmo.b(cmdVar.b())) != null) {
            return cmnVarB.b(cmk.a(j));
        }
        float fA = cmk.a(j);
        float fB = cmdVar.b();
        return fA * fB;
    }

    public static long f(cmd cmdVar, float f) {
        int i = cmo.a;
        if (!cmo.a(cmdVar.b())) {
            return clw.u(f / cmdVar.b());
        }
        cmn cmnVarB = cmo.b(cmdVar.b());
        return clw.u(cmnVarB != null ? cmnVarB.a(f) : f / cmdVar.b());
    }

    public static float g(clx clxVar, float f) {
        return f / clxVar.a();
    }

    public static float h(clx clxVar, int i) {
        return i / clxVar.a();
    }

    public static float i(clx clxVar, long j) {
        if (!a.s(cmk.c(j), 4294967296L)) {
            b("Only Sp can convert to Px");
        }
        return clxVar.cr(clxVar.cn(j));
    }

    public static float j(clx clxVar, float f) {
        return f * clxVar.a();
    }

    public static int k(clx clxVar, float f) {
        float fCr = clxVar.cr(f);
        return Float.isInfinite(fCr) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : Math.round(fCr);
    }

    public static long l(clx clxVar, long j) {
        if (j != 9205357640488583168L) {
            return a.j(clxVar.co(Float.intBitsToFloat((int) (j >> 32))), clxVar.co(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static long m(clx clxVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fCr = clxVar.cr(cmc.b(j));
        float fCr2 = clxVar.cr(cmc.a(j));
        return (Float.floatToRawIntBits(fCr) << 32) | (Float.floatToRawIntBits(fCr2) & 4294967295L);
    }

    public static long n(clx clxVar, float f) {
        return clxVar.cx(clxVar.co(f));
    }

    public static cpy o(cpd cpdVar, int i, ArrayList arrayList, cpy cpyVar) {
        int i2;
        int i3 = i == 0 ? cpdVar.ap : cpdVar.aq;
        if (i3 != -1 && (cpyVar == null || i3 != cpyVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                cpy cpyVar2 = (cpy) arrayList.get(i4);
                if (cpyVar2.c == i3) {
                    if (cpyVar != null) {
                        cpyVar.c(i, cpyVar2);
                        arrayList.remove(cpyVar);
                    }
                    cpyVar = cpyVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return cpyVar;
        }
        if (cpyVar == null) {
            if (cpdVar instanceof cpi) {
                cpi cpiVar = (cpi) cpdVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= cpiVar.aK) {
                        i2 = -1;
                        break;
                    }
                    cpd cpdVar2 = cpiVar.aJ[i5];
                    if (i == 0) {
                        i2 = cpdVar2.ap;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = cpdVar2.aq;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        cpy cpyVar3 = (cpy) arrayList.get(i6);
                        if (cpyVar3.c == i2) {
                            cpyVar = cpyVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (cpyVar == null) {
                cpyVar = new cpy(i);
            }
            arrayList.add(cpyVar);
        }
        if (cpyVar.d(cpdVar)) {
            if (cpdVar instanceof cph) {
                cph cphVar = (cph) cpdVar;
                cphVar.d.d(cphVar.as == 0 ? 1 : 0, arrayList, cpyVar);
            }
            if (i == 0) {
                cpdVar.ap = cpyVar.c;
                cpdVar.K.d(0, arrayList, cpyVar);
                cpdVar.M.d(0, arrayList, cpyVar);
            } else {
                cpdVar.aq = cpyVar.c;
                cpdVar.L.d(1, arrayList, cpyVar);
                cpdVar.O.d(1, arrayList, cpyVar);
                cpdVar.N.d(1, arrayList, cpyVar);
            }
            cpdVar.R.d(i, arrayList, cpyVar);
        }
        return cpyVar;
    }

    public static cpy p(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cpy cpyVar = (cpy) arrayList.get(i2);
            if (i == cpyVar.c) {
                return cpyVar;
            }
        }
        return null;
    }

    public static boolean q(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0738 A[PHI: r9
  0x0738: PHI (r9v22 coy) = (r9v21 coy), (r9v27 coy) binds: [B:415:0x072c, B:418:0x0736] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(defpackage.cpe r40, defpackage.cov r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cme.r(cpe, cov, java.util.ArrayList, int):void");
    }

    public static final Object s(uhp uhpVar, yih yihVar) throws Throwable {
        try {
            if (uhpVar.isDone()) {
                int i = col.c;
                return a.G(uhpVar);
            }
            yof yofVar = new yof(wcq.S(yihVar), 1);
            yofVar.v();
            uhpVar.c(new gqz(uhpVar, (yoe) yofVar, 1), cor.a);
            yofVar.b(new bil(uhpVar, 2));
            return yofVar.i();
        } catch (ExecutionException e) {
            throw t(e);
        }
    }

    public static final Throwable t(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static final ewz u() {
        return new evi(ImmutableList.of(), ImmutableList.of());
    }

    public static boolean v(etl etlVar) {
        Cursor cursor = etlVar.a;
        return cursor.moveToPosition(cursor.getPosition() + 1);
    }

    public static int w(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            dzd dzdVar = new dzd();
            dzdVar.d("video/avc");
            dze dzeVar = new dze(dzdVar);
            if (dzeVar.Y != null) {
                List listI = ete.i(dzeVar, z, false);
                for (int i = 0; i < listI.size(); i++) {
                    if (((ess) listI.get(i)).d != null && (videoCapabilities = ((ess) listI.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return x(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60));
                    }
                }
            }
        } catch (etb unused) {
        }
        return 0;
    }

    public static int x(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (fr$$ExternalSyntheticApiModelOutline0.m412m(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }

    public static long y(Map map, String str) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean z(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public cme(cpd cpdVar) {
        new WeakReference(cpdVar);
        cov.o(cpdVar.K);
        cov.o(cpdVar.L);
        cov.o(cpdVar.M);
        cov.o(cpdVar.N);
        cov.o(cpdVar.O);
    }
}
