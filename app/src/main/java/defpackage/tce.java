package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tce implements wnu {
    private final tbe a;
    private final vyb b;
    private final vhb c;
    private final ExecutorService d;

    public tce(tbe tbeVar, vhb vhbVar, vyb vybVar, ExecutorService executorService) {
        this.a = tbeVar;
        this.c = vhbVar;
        this.b = vybVar;
        this.d = executorService;
    }

    @Override // defpackage.wnu
    public final zyd a() {
        zyd zydVarB = this.b.b(this.c.a(), vyr.DONT_CARE);
        yqi yqiVarA = wyo.a(new yqi() { // from class: tcc
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                List<vha> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (vha vhaVar : list) {
                    if (!tej.a(vhaVar)) {
                        arrayList.add(vhaVar.b().g);
                    }
                }
                return arrayList;
            }
        });
        ExecutorService executorService = this.d;
        final zyd zydVarG = zuz.g(zydVarB, yqiVarA, executorService);
        final zyd zydVarB2 = this.a.a.b();
        return xab.d(zydVarG, zydVarB2).a(new Callable() { // from class: tcd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zyd zydVarL;
                yzq yzqVarO = yzq.o((Collection) zxn.o(zydVarG));
                final Geller geller = (Geller) zxn.o(zydVarB2);
                ArrayList arrayList = new ArrayList(yzqVarO.size());
                arrayList.add(geller.d(yzqVarO));
                zdl it = yzqVarO.iterator();
                while (it.hasNext()) {
                    final String str = (String) it.next();
                    if (!yqv.c(str)) {
                        geller.f.b();
                        final yqt yqtVarH = yqt.h((ros) geller.k.get(str));
                        rqo rqoVar = rpr.a;
                        onx.b(yqtVarH, new rqt(new rpz("GELLER_CLEANUP_START", true, ypv.a, 101, rps.GELLER_CLEANUP, rpr.b, rpr.a, rpr.c, rpr.d)));
                        boolean z = geller.j;
                        yqw.M(true, "cleanup() not allowed if Geller is read-only");
                        if (geller.e.b(str) == null) {
                            onx.c(yqtVarH, rpr.a(), abqb.INVALID_ARGUMENT);
                            zydVarL = zxn.g(new GellerException(abqb.UNKNOWN, "Geller database instance is null."));
                        } else {
                            zvh zvhVar = new zvh() { // from class: onf
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.zvh
                                public final zyd a() throws GellerException {
                                    acoc acocVar;
                                    accg accgVar;
                                    long jA;
                                    long jA2;
                                    abyy abwxVar;
                                    yrn yrnVarC = yrn.c(yps.a);
                                    String str2 = str;
                                    yqt yqtVar = yqtVarH;
                                    Geller geller2 = geller;
                                    try {
                                        jA2 = geller2.e.a(str2);
                                    } catch (GellerException e) {
                                        ((zdv) ((zdv) ((zdv) Geller.a.d()).p(e)).q("com/google/android/libraries/geller/portable/Geller", "cleanupResult", (char) 1710, "Geller.java")).u("Cleanup call failed");
                                        onx.c(yqtVar, rpr.a(), e.a);
                                        acoc acocVar2 = acoc.a;
                                        acob acobVar = new acob();
                                        long jA3 = yrnVarC.a(TimeUnit.MILLISECONDS);
                                        if ((acobVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                            acobVar.y();
                                        }
                                        acoc acocVar3 = (acoc) acobVar.b;
                                        acocVar3.c |= 1;
                                        acocVar3.e = jA3;
                                        acocVar = (acoc) acobVar.v();
                                    }
                                    if (jA2 == 0) {
                                        throw new GellerException(abqb.UNKNOWN, "Geller native database pointer is null.");
                                    }
                                    rqo rqoVar2 = rpr.a;
                                    ypv ypvVar = ypv.a;
                                    rps rpsVar = rps.NONE;
                                    int[] iArr = rpr.b;
                                    rqo rqoVar3 = rpr.a;
                                    yzq yzqVar = rpr.c;
                                    String str3 = rpr.d;
                                    onx.b(yqtVar, new rqt(new rpz("GELLER_CLEANUP_DATABASE", false, ypvVar, 102, rpsVar, iArr, rqoVar3, yzqVar, str3)));
                                    byte[] bArrNativeCleanupAll = geller2.nativeCleanupAll(geller2.a(), jA2);
                                    onx.b(yqtVar, new rqt(new rpz("GELLER_CLEANUP_RESULT", false, ypvVar, 103, rpsVar, iArr, rqoVar3, yzqVar, str3)));
                                    acoc acocVar4 = acoc.a;
                                    if (bArrNativeCleanupAll != null) {
                                        try {
                                            abyy abyyVar = acoc.b;
                                            if (abyyVar == null) {
                                                synchronized (acoc.class) {
                                                    abwxVar = acoc.b;
                                                    if (abwxVar == null) {
                                                        abwxVar = new abwx(acocVar4);
                                                        acoc.b = abwxVar;
                                                    }
                                                }
                                                abyyVar = abwxVar;
                                            }
                                            Object objE = abyyVar.e(bArrNativeCleanupAll, ExtensionRegistryLite.getGeneratedRegistry());
                                            onx.c(yqtVar, new rqw(new rpz("GELLER_CLEANUP_END", false, ypv.a, 104, rps.GELLER_CLEANUP, new int[]{101}, rpr.a, rpr.c, rpr.d)), abqb.OK);
                                            acocVar4 = objE;
                                        } catch (abxv e2) {
                                            ((zdv) ((zdv) ((zdv) onx.a.c()).p(e2)).q("com/google/android/libraries/geller/portable/GellerUtil", "processNativeCleanupResult", 'Y', "GellerUtil.java")).u("Invalid native result.");
                                            onx.c(yqtVar, rpr.a(), abqb.INTERNAL);
                                        }
                                    } else {
                                        ((zdv) ((zdv) onx.a.c()).q("com/google/android/libraries/geller/portable/GellerUtil", "processNativeCleanupResult", 94, "GellerUtil.java")).u("Native result is null.");
                                        onx.c(yqtVar, rpr.a(), abqb.INVALID_ARGUMENT);
                                    }
                                    acob acobVar2 = new acob();
                                    acobVar2.B(acocVar4);
                                    long jA4 = yrnVarC.a(TimeUnit.MILLISECONDS);
                                    if ((acobVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        acobVar2.y();
                                    }
                                    acoc acocVar5 = (acoc) acobVar2.b;
                                    acocVar5.c |= 1;
                                    acocVar5.e = jA4;
                                    acocVar = (acoc) acobVar2.v();
                                    geller2.f.a(acocVar);
                                    GellerLoggingCallback gellerLoggingCallback = geller2.f;
                                    acoi acoiVar = acoi.a;
                                    int i = yyk.e;
                                    yyk yykVar = zcg.b;
                                    int i2 = ((zcg) yykVar).d;
                                    String[] strArr = new String[i2];
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        strArr[i3] = ((acgd) yykVar.get(i3)).name();
                                    }
                                    try {
                                        jA = geller2.e.a(str2);
                                    } catch (GellerException e3) {
                                        ((zdv) ((zdv) ((zdv) Geller.a.d()).p(e3)).q("com/google/android/libraries/geller/portable/Geller", "getCorpusStats", (char) 1766, "Geller.java")).u("getCorpusStats call failed.");
                                        accgVar = accg.a;
                                    }
                                    if (jA == 0) {
                                        throw new GellerException(abqb.UNKNOWN, "Geller native database pointer is null.");
                                    }
                                    accgVar = (accg) onx.a(geller2.nativeGetCorpusStats(geller2.a(), jA, strArr), accg.a);
                                    Iterator it2 = accgVar.c.iterator();
                                    while (it2.hasNext()) {
                                        geller2.e(acgd.c(((acce) it2.next()).c), "get_corpus_stats", acoiVar);
                                    }
                                    gellerLoggingCallback.c(accgVar);
                                    return zxy.a;
                                }
                            };
                            zydVarL = zxn.l(wyo.b(zvhVar), geller.d);
                        }
                        arrayList.add(zydVarL);
                    }
                }
                return arrayList;
            }
        }, executorService);
    }
}
