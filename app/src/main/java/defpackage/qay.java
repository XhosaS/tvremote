package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qay {
    public final Context a;
    public final yrp b;
    public final ueg c;
    public final qfg d;
    public final yqt e;
    public final qcf f;
    public final Executor g;
    public final phg h;
    public final qee i;
    final HashMap j = new HashMap();

    public qay(Context context, yrp yrpVar, ueg uegVar, qfg qfgVar, yqt yqtVar, qcf qcfVar, Executor executor, phg phgVar) {
        this.a = context;
        this.b = yrpVar;
        this.c = uegVar;
        this.d = qfgVar;
        this.e = yqtVar;
        this.f = qcfVar;
        this.g = executor;
        this.h = phgVar;
        this.i = qee.a(executor);
    }

    public final zyd a(String str, Uri uri) {
        return !this.h.F() ? zxn.h(yqt.h((zyd) this.j.get(uri))) : this.i.b(str);
    }

    public final zyd b(final String str, Uri uri) {
        if (!this.h.F()) {
            zyd zydVar = (zyd) this.j.remove(uri);
            return zydVar != null ? zydVar : zxy.a;
        }
        final qee qeeVar = this.i;
        int i = qce.a;
        return qeeVar.a.a.b(new zvh() { // from class: qea
            @Override // defpackage.zvh
            public final zyd a() {
                qee qeeVar2 = qeeVar;
                String str2 = str;
                try {
                    Map map = qeeVar2.d;
                    map.remove(str2);
                    qeeVar2.c.b(str2, map.size());
                    return zxy.a;
                } catch (Exception e) {
                    qce.g(e, "%s: Failed to remove download future (%s) from map", "DownloadFutureMap", str2);
                    return zxn.g(e);
                }
            }
        }, qeeVar.b);
    }

    public final zyd c(final String str, final piy piyVar, final int i, final long j, final String str2, final Uri uri, final String str3, final long j2, final pim pimVar, final qax qaxVar, final int i2, final List list, final abuy abuyVar) {
        return zuz.h(a(str, uri), wyo.c(new zvi() { // from class: qao
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                zyd zydVarB;
                yqt yqtVar = (yqt) obj;
                if (yqtVar.g()) {
                    return (zyd) yqtVar.c();
                }
                final abuy abuyVar2 = abuyVar;
                final List list2 = list;
                final int i3 = i2;
                final pim pimVar2 = pimVar;
                final long j3 = j2;
                final String str4 = str3;
                final String str5 = str2;
                final long j4 = j;
                final int i4 = i;
                final piy piyVar2 = piyVar;
                final qax qaxVar2 = qaxVar;
                final Uri uri2 = uri;
                final String str6 = str;
                final qay qayVar = this.a;
                zvi zviVar = new zvi() { // from class: qaw
                    /* JADX WARN: Type inference failed for: r15v3, types: [qfd] */
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) throws phc {
                        long jA;
                        int i5;
                        Uri uri3;
                        String str7;
                        ple pleVar;
                        yyk yykVar;
                        abuy abuyVar3;
                        int iA;
                        float fMin;
                        String str8 = str4;
                        qay qayVar2 = qayVar;
                        Uri uri4 = uri2;
                        long j5 = j3;
                        if (str8.startsWith("http") && qayVar2.h.B() && !str8.startsWith("https")) {
                            qce.d("%s: File url = %s is not secure", "MddFileDownloader", str8);
                            pha phaVarA = phc.a();
                            phaVarA.a = phb.INSECURE_URL_ERROR;
                            return zxn.g(phaVarA.a());
                        }
                        try {
                            jA = qayVar2.c.a(uri4);
                        } catch (IOException unused) {
                            jA = 0;
                        }
                        try {
                            Context context = qayVar2.a;
                            long j6 = j5 - jA;
                            phg phgVar = qayVar2.h;
                            boolean zK = phgVar.K();
                            pim pimVar3 = pimVar2;
                            if (!zK || (qeg.h(str8, new zdd("inlinefile")) && j6 == 0)) {
                                i5 = -1;
                            } else {
                                StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
                                i5 = -1;
                                long availableBlocks = (statFs.getAvailableBlocks() * statFs.getBlockSize()) - j6;
                                float blockCount = statFs.getBlockCount() * statFs.getBlockSize();
                                double dMin = Math.min(phgVar.a() * blockCount, phgVar.b());
                                if (pimVar3 != null) {
                                    int iA2 = pil.a(pimVar3.c);
                                    if (iA2 == 0) {
                                        iA2 = 1;
                                    }
                                    int i6 = iA2 - 1;
                                    if (i6 == 1) {
                                        fMin = Math.min(blockCount * phgVar.a(), phgVar.d());
                                    } else if (i6 == 2) {
                                        fMin = Math.min(blockCount * phgVar.a(), phgVar.c());
                                    }
                                    dMin = fMin;
                                }
                                if (availableBlocks <= dMin) {
                                    pha phaVarA2 = phc.a();
                                    phaVarA2.a = phb.LOW_DISK_ERROR;
                                    throw phaVarA2.a();
                                }
                            }
                            piy piyVar3 = piyVar2;
                            if (phgVar.M()) {
                                qfg qfgVar = qayVar2.d;
                                qcf qcfVar = qayVar2.f;
                                piq piqVar = piq.a;
                                pip pipVar = new pip();
                                if ((pipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    pipVar.y();
                                }
                                piq piqVar2 = (piq) pipVar.b;
                                piyVar3.getClass();
                                piqVar2.c = piyVar3;
                                piqVar2.b |= 1;
                                if ((pipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    pipVar.y();
                                }
                                long j7 = j4;
                                piq piqVar3 = (piq) pipVar.b;
                                piqVar3.b |= 2;
                                piqVar3.d = j7;
                                if ((pipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    pipVar.y();
                                }
                                String str9 = str5;
                                piq piqVar4 = (piq) pipVar.b;
                                str9.getClass();
                                piqVar4.b |= 4;
                                piqVar4.e = str9;
                                if ((pipVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    pipVar.y();
                                }
                                int i7 = i4;
                                piq piqVar5 = (piq) pipVar.b;
                                piqVar5.b |= 8;
                                piqVar5.f = i7;
                                piq piqVar6 = (piq) pipVar.v();
                                synchronized (qfgVar.b) {
                                    HashMap map = qfgVar.c;
                                    if (!map.containsKey(piqVar6)) {
                                        qff qffVar = new qff(qfgVar.a, qcfVar, piqVar6);
                                        final pmq pmqVar = qfgVar.e;
                                        map.put(piqVar6, new uha(qffVar, new Object() { // from class: qfd
                                        }, TimeUnit.SECONDS));
                                    }
                                    qfgVar.d.put(uri4, (uha) map.get(piqVar6));
                                }
                            } else {
                                qce.h("%s: NetworkUsageMonitor is disabled", "MddFileDownloader");
                            }
                            yqt yqtVar2 = qayVar2.e;
                            if (yqtVar2.g()) {
                                qfc qfcVar = (qfc) yqtVar2.c();
                                String str10 = piyVar3.d;
                                synchronized (qfc.class) {
                                    qfcVar.a.put(uri4, str10);
                                }
                            }
                            pla plaVar = new pla();
                            plaVar.d(i5);
                            int i8 = yyk.e;
                            plaVar.c(zcg.b);
                            plaVar.a(abuy.a);
                            if (uri4 == null) {
                                throw new NullPointerException("Null fileUri");
                            }
                            plaVar.a = uri4;
                            if (str8 == null) {
                                throw new NullPointerException("Null urlToDownload");
                            }
                            plaVar.b = str8;
                            if (pimVar3 == null || (iA = pij.a(pimVar3.d)) == 0 || iA != 2) {
                                plaVar.b(ple.b);
                            } else {
                                plaVar.b(ple.c);
                            }
                            int i9 = i3;
                            if (i9 > 0) {
                                plaVar.d(i9);
                            }
                            List<pio> list3 = list2;
                            yyf yyfVar = new yyf(4);
                            for (pio pioVar : list3) {
                                yyfVar.g(Pair.create(pioVar.b, pioVar.c));
                            }
                            abuy abuyVar4 = abuyVar2;
                            plaVar.c(yyfVar.f());
                            plaVar.a(abuyVar4);
                            plh plhVar = (plh) qayVar2.b.eV();
                            String str11 = plaVar.b;
                            if (str11 == null) {
                                throw new IllegalStateException("Property \"urlToDownload\" has not been set");
                            }
                            if (str11.startsWith("inlinefile")) {
                                yqw.B(false, "InlineDownloadParams must be set when using inlinefile: scheme");
                                plaVar.b(ple.a);
                            }
                            if (plaVar.h == 1 && (uri3 = plaVar.a) != null && (str7 = plaVar.b) != null && (pleVar = plaVar.c) != null && (yykVar = plaVar.e) != null && (abuyVar3 = plaVar.g) != null) {
                                return plhVar.a(new plb(uri3, str7, pleVar, plaVar.d, yykVar, plaVar.f, abuyVar3));
                            }
                            StringBuilder sb = new StringBuilder();
                            if (plaVar.a == null) {
                                sb.append(" fileUri");
                            }
                            if (plaVar.b == null) {
                                sb.append(" urlToDownload");
                            }
                            if (plaVar.c == null) {
                                sb.append(" downloadConstraints");
                            }
                            if (plaVar.h == 0) {
                                sb.append(" trafficTag");
                            }
                            if (plaVar.e == null) {
                                sb.append(" extraHttpHeaders");
                            }
                            if (plaVar.g == null) {
                                sb.append(" customDownloaderMetadata");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        } catch (phc e) {
                            qce.d("%s: Not enough space to download file %s", "MddFileDownloader", str8);
                            return zxn.g(e);
                        }
                    }
                };
                final zye zyeVar = new zye(new Callable() { // from class: qar
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return null;
                    }
                });
                qfr qfrVarC = qfr.c(zyeVar);
                Executor executor = qayVar.g;
                final qfr qfrVarB = qfrVarC.g(zviVar, executor).g(new zvi() { // from class: qas
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        return qaxVar2.a(uri2);
                    }
                }, executor).b(Exception.class, new zvi() { // from class: qat
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        phc phcVarA;
                        final Exception exc = (Exception) obj2;
                        if (exc instanceof phc) {
                            phcVarA = (phc) exc;
                        } else {
                            pha phaVarA = phc.a();
                            phaVarA.c = exc;
                            phaVarA.a = phb.UNKNOWN_ERROR;
                            phcVarA = phaVarA.a();
                        }
                        return zuz.h(qaxVar2.b(phcVarA), wyo.c(new zvi() { // from class: qaq
                            @Override // defpackage.zvi
                            public final zyd a(Object obj3) throws Exception {
                                throw exc;
                            }
                        }), qayVar.g);
                    }
                }, executor);
                if (qayVar.h.F()) {
                    final qee qeeVar = qayVar.i;
                    int i5 = qce.a;
                    zydVarB = qeeVar.a.a.b(new zvh() { // from class: qeb
                        @Override // defpackage.zvh
                        public final zyd a() {
                            String str7 = str6;
                            qee qeeVar2 = qeeVar;
                            zyd zydVar = qfrVarB;
                            try {
                                qed qedVar = qeeVar2.c;
                                Map map = qeeVar2.d;
                                qedVar.a(str7, map.size() + 1);
                                map.put(str7, zydVar);
                                return zxy.a;
                            } catch (Exception e) {
                                qce.g(e, "%s: Failed to add download future (%s) to map", "DownloadFutureMap", str7);
                                return zxn.g(e);
                            }
                        }
                    }, qeeVar.b);
                } else {
                    qayVar.j.put(uri2, qfrVarB);
                    zydVarB = zxy.a;
                }
                qfr qfrVarG = qfr.c(zydVarB).g(new zvi() { // from class: qau
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        zyeVar.run();
                        return qfrVarB;
                    }
                }, executor);
                qfrVarG.d(new Runnable() { // from class: qav
                    @Override // java.lang.Runnable
                    public final void run() {
                        qayVar.b(str6, uri2);
                    }
                }, executor);
                return qfrVarG;
            }
        }), this.g);
    }

    public final void d(final String str, final Uri uri) {
        zuz.h(a(str, uri), wyo.c(new zvi() { // from class: qap
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                yqt yqtVar = (yqt) obj;
                if (!yqtVar.g()) {
                    qce.h("%s: stopDownloading on non-existent download", "MddFileDownloader");
                    return zxy.a;
                }
                String str2 = str;
                Uri uri2 = uri;
                qay qayVar = this.a;
                int i = qce.a;
                ((zyd) yqtVar.c()).cancel(true);
                return qayVar.b(str2, uri2);
            }
        }), this.g);
    }
}
