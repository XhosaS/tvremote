package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Duration;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfb {
    public static final /* synthetic */ int a = 0;
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/logging/appflow/ClientExecutionContextConverterKt");
    private static final agyu c = new agyu("/entity/|/asset/|/person/");
    private static final agyu d = new agyu("/destination/search_results_page");
    private static final agyu e = new agyu("/gemini/chat");

    public static final gez a(String str, Map map, String str2) throws abxv {
        byte bByteValue;
        fbo fboVar = fbo.J;
        abxd abxdVar = null;
        int i = 4;
        if (agvy.c(str, fboVar.a())) {
            if (map.containsKey("open_provider_args")) {
                try {
                    byte[] bArrB = irw.b((byte[]) map.get("open_provider_args"));
                    abxd abxdVarH = abxd.h(xnr.a, bArrB, 0, bArrB.length, ExtensionRegistryLite.getGeneratedRegistry());
                    if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                        if (bByteValue != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            if (true == zL) {
                                abxdVar = abxdVarH;
                            }
                            abxdVarH.cM(2, abxdVar);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                    xnr xnrVar = (xnr) abxdVarH;
                    xnrVar.getClass();
                    xbg xbgVar = xnrVar.b;
                    if (xbgVar == null) {
                        xbgVar = xbg.a;
                    }
                    String str3 = (xbgVar.b == 1 ? (xaq) xbgVar.c : xaq.a).g;
                    str3.getClass();
                    xbg xbgVar2 = xnrVar.b;
                    if (xbgVar2 == null) {
                        xbgVar2 = xbg.a;
                    }
                    if (agvy.c((xbgVar2.b == 1 ? (xaq) xbgVar2.c : xaq.a).c, "com.google.android.apps.tv.launcherx")) {
                        if (c.b(str3)) {
                            i = 2;
                        } else if (d.b(str3)) {
                            i = 3;
                        } else if (e.b(str3)) {
                            i = 9;
                        }
                    }
                } catch (abxv e2) {
                    ((zdv) ((zdv) b.d()).p(e2).q("com/google/android/apps/tvsearch/logging/appflow/ClientExecutionContextConverterKt", "toOpenProviderExecutionType", 132, "clientExecutionContextConverter.kt")).u("Failed to parse OpenProviderArgs.");
                }
            } else {
                i = 1;
            }
            return new gez(fboVar, i, str2);
        }
        fbo fboVar2 = fbo.v;
        if (agvy.c(str, fboVar2.a())) {
            return new gez(fboVar2, 5, str2);
        }
        fbo fboVar3 = fbo.w;
        if (agvy.c(str, fboVar3.a())) {
            return new gez(fboVar3, 5, str2);
        }
        fbo fboVar4 = fbo.y;
        if (agvy.c(str, fboVar4.a())) {
            return new gez(fboVar4, 5, str2);
        }
        fbo fboVar5 = fbo.B;
        if (agvy.c(str, fboVar5.a())) {
            return new gez(fboVar5, 5, str2);
        }
        fbo fboVar6 = fbo.C;
        if (agvy.c(str, fboVar6.a())) {
            return new gez(fboVar6, 5, str2);
        }
        fbo fboVar7 = fbo.D;
        if (agvy.c(str, fboVar7.a())) {
            return new gez(fboVar7, 5, str2);
        }
        fbo fboVar8 = fbo.E;
        if (agvy.c(str, fboVar8.a())) {
            return new gez(fboVar8, 5, str2);
        }
        fbo fboVar9 = fbo.G;
        if (agvy.c(str, fboVar9.a())) {
            return new gez(fboVar9, 5, str2);
        }
        fbo fboVar10 = fbo.A;
        if (agvy.c(str, fboVar10.a())) {
            return new gez(fboVar10, 4, str2);
        }
        fbo fboVar11 = fbo.k;
        if (agvy.c(str, fboVar11.a())) {
            return new gez(fboVar11, 6, str2);
        }
        fbo fboVar12 = fbo.l;
        if (agvy.c(str, fboVar12.a())) {
            return new gez(fboVar12, 6, str2);
        }
        fbo fboVar13 = fbo.n;
        if (agvy.c(str, fboVar13.a())) {
            return new gez(fboVar13, 6, str2);
        }
        fbo fboVar14 = fbo.o;
        if (agvy.c(str, fboVar14.a())) {
            return new gez(fboVar14, 6, str2);
        }
        fbo fboVar15 = fbo.p;
        if (agvy.c(str, fboVar15.a())) {
            return new gez(fboVar15, 6, str2);
        }
        fbo fboVar16 = fbo.Y;
        if (agvy.c(str, fboVar16.a())) {
            return new gez(fboVar16, 7, str2);
        }
        fbo fboVar17 = fbo.ac;
        if (agvy.c(str, fboVar17.a())) {
            return new gez(fboVar17, 8, str2);
        }
        fbo fboVar18 = fbo.W;
        if (agvy.c(str, fboVar18.a())) {
            return new gez(fboVar18, 10, str2);
        }
        return null;
    }

    public static final Duration b(abzy abzyVar, long j) {
        long jB = acbj.b(abzyVar) - j;
        if (jB < 0) {
            ((zdv) ((zdv) b.d()).r(zfc.SMALL).q("com/google/android/apps/tvsearch/logging/appflow/ClientExecutionContextConverterKt", "toElapsedRealtimeNanosOrNull", 212, "clientExecutionContextConverter.kt")).C("Invalid timestamp: bootTimeNanos: %s, elapsedRealTimeNanos: %s", j, jB);
            return null;
        }
        Duration durationOfNanos = Duration.ofNanos(jB);
        durationOfNanos.getClass();
        return durationOfNanos;
    }

    public static final rqw c(gez gezVar, agow agowVar) {
        switch (gezVar.d - 1) {
            case 1:
                return ((Boolean) agowVar.a()).booleanValue() ? rpm.dN() : rpm.dL();
            case 2:
                return ((Boolean) agowVar.a()).booleanValue() ? rpm.dW() : rpm.dL();
            case 3:
                return rpm.dL();
            case 4:
                return rpm.dR();
            case 5:
                return rpm.dM();
            case 6:
                return rpm.dV();
            case 7:
                return rpm.dX();
            case 8:
                return ((Boolean) agowVar.a()).booleanValue() ? rpm.dO() : rpm.dL();
            case 9:
                return rpm.dQ();
            default:
                return null;
        }
    }
}
