package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.libraries.geller.portable.Geller;
import com.google.common.collect.Lists;
import com.google.protobuf.ExtensionRegistryLite;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.time.Duration;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olk {
    public static final zdy a = zdy.h("com/google/android/libraries/geller/gellersync/GellerSyncClient");
    public final yqt b;
    public final Geller c;
    public final ont d;
    public final Set e;
    public final yqi f;
    public final ExecutorService g;
    public final ExecutorService h;
    public final ExecutorService i;
    public final Map j;
    public final yrn k;
    public final yqt l;
    public int m = 0;
    private final String n = "agsa";
    private final yqi o;
    private final abwf p;
    private final Boolean q;
    private final okc r;
    private String s;
    private String t;
    private String u;

    public olk(yqt yqtVar, Geller geller, ont ontVar, yqi yqiVar, Set set, yqi yqiVar2, abwf abwfVar, Boolean bool, okc okcVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, yrx yrxVar) {
        this.b = yqtVar;
        this.c = geller;
        this.d = ontVar;
        this.o = yqiVar;
        this.e = set;
        this.f = yqiVar2;
        this.p = abwfVar;
        this.q = bool;
        this.r = okcVar;
        this.g = executorService;
        this.h = executorService2;
        this.i = executorService3;
        this.j = map;
        this.k = new yrn(yrxVar);
        this.l = yqt.i(new oiz(new oja(), executorService));
    }

    public final /* synthetic */ okb a(zvz zvzVar) throws PackageManager.NameNotFoundException {
        yqt yqtVarA;
        Signature signature;
        omi omiVar = this.r.a;
        String str = omiVar.c;
        int i = omiVar.d;
        String str2 = this.u;
        String str3 = this.t;
        agbo agboVar = new agbo(afrq.d(str, i));
        agboVar.e = new afrb(new otj(omiVar.b));
        afih afihVar = new afih();
        afib afibVar = afih.b;
        int i2 = afid.c;
        afihVar.e(new afia("x-response-encoding", afibVar), "gzip");
        if (!yqv.c(str2)) {
            Context context = omiVar.a;
            afihVar.e(new afia("X-Goog-Api-Key", afibVar), str2);
            yqt yqtVarB = yqt.h(context).b(new yqi() { // from class: omp
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    return ((Context) obj).getPackageName();
                }
            });
            if (context == null) {
                yqtVarA = ypv.a;
            } else {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728);
                    if (packageInfo == null || packageInfo.signingInfo == null) {
                        ((zdv) ((zdv) omq.a.c()).q("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil", "getAndroidCertificate", 121, "GrpcMetadataUtil.java")).x("Invalid signature for app %s", context.getPackageName());
                        yqtVarA = ypv.a;
                    } else {
                        Signature[] apkContentsSigners = packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory();
                        if (apkContentsSigners.length == 0 || (signature = apkContentsSigners[0]) == null) {
                            ((zdv) ((zdv) omq.a.c()).q("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil", "getAndroidCertificate", 129, "GrpcMetadataUtil.java")).x("Invalid signature for app %s", context.getPackageName());
                            yqtVarA = ypv.a;
                        } else {
                            yqtVarA = omq.a(signature);
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((zdv) ((zdv) ((zdv) omq.a.c()).p(e)).q("com/google/android/libraries/geller/gellersync/util/GrpcMetadataUtil", "getAndroidCertificate", (char) 148, "GrpcMetadataUtil.java")).u("Could not find certificate for package");
                    yqtVarA = ypv.a;
                }
            }
            if (yqtVarB.g() && yqtVarA.g()) {
                afib afibVar2 = afih.b;
                afihVar.e(new afia("X-Android-Package", afibVar2), (String) yqtVarB.c());
                afihVar.e(new afia("X-Android-Cert", afibVar2), (String) yqtVarA.c());
            }
        }
        if (!yqv.c(str3)) {
            afihVar.e(new afia("Cookie", afih.b), String.format("%s=%s; path=/*; domain=*.googleapis.com", "NID", str3));
        }
        afuv afuvVar = agboVar.c;
        affw affwVar = affw.b;
        if (affwVar != null) {
            afuvVar.m = affwVar;
        } else {
            afuvVar.m = afuv.d;
        }
        afuvVar.e(Arrays.asList(new ageq(afihVar)));
        okb okbVar = new okb(afuvVar.a(), this.p, this.q);
        zvzVar.a(okbVar, this.h);
        return okbVar;
    }

    final zyd b(acfr acfrVar) {
        final yzq yzqVarO = yzq.o(new abxl(acfrVar.e, acfr.a));
        String str = acfrVar.f;
        achm achmVarB = achm.b(acfrVar.g);
        if (achmVarB == null) {
            achmVarB = achm.UNKNOWN_REQUEST_REASON;
        }
        final int iA = acho.a(acfrVar.h);
        if (iA == 0) {
            iA = 1;
        }
        int iA2 = achq.a(acfrVar.i);
        final int i = iA2 == 0 ? 1 : iA2;
        final boolean z = acfrVar.j;
        this.s = acfrVar.k;
        this.t = acfrVar.l;
        this.u = acfrVar.m;
        final yqt yqtVarI = (acfrVar.d & 256) != 0 ? yqt.i(Integer.valueOf(acfrVar.n)) : ypv.a;
        final oir oirVarA = oms.a(this.f, str);
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncClient", "startBatchSync", 193, "GellerSyncClient.java")).x("Starting batch sync for corpora: %s", yzqVarO);
        if (yzqVarO.isEmpty()) {
            return zxn.h(zcl.a);
        }
        for (omm ommVar : this.e) {
            zdl it = yzqVarO.iterator();
            while (it.hasNext()) {
                ommVar.c();
            }
        }
        this.m = 0;
        omj omjVar = (omj) this.o.apply(str);
        if (omjVar == null) {
            throw new IllegalArgumentException("SyncContextGenerator is null");
        }
        yqt yqtVar = this.b;
        ExecutorService executorService = this.g;
        zyd zydVarG = zuz.g(omjVar.a(oms.b(yqtVar), yzqVarO, achmVarB), wyo.a(new yqi() { // from class: omr
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                achk achkVar = (achk) obj;
                achk achkVar2 = achk.a;
                achj achjVar = new achj();
                achjVar.B(achkVar);
                if ((achjVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    achjVar.y();
                }
                int i2 = iA;
                achk achkVar3 = (achk) achjVar.b;
                yqt yqtVar2 = yqtVarI;
                achkVar3.d = i2 - 1;
                achkVar3.b |= 32;
                if (yqtVar2.g()) {
                    abxc abxcVar = ache.b;
                    if (abxcVar.a != achk.a) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    Object objK = achkVar.n.k(abxcVar.d);
                    Object objB = objK == null ? abxcVar.b : abxcVar.b(objK);
                    achd achdVar = new achd();
                    achdVar.B((ache) objB);
                    int iIntValue = ((Integer) yqtVar2.c()).intValue();
                    if ((Integer.MIN_VALUE & achdVar.b.memoizedSerializedSize) == 0) {
                        achdVar.y();
                    }
                    ache acheVar = (ache) achdVar.b;
                    acheVar.c |= 2;
                    acheVar.e = iIntValue;
                    achjVar.f(abxcVar, (ache) achdVar.v());
                }
                return (achk) achjVar.v();
            }
        }), executorService);
        zvi zviVarC = wyo.c(new zvi() { // from class: oki
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final achk achkVar = (achk) obj;
                achm achmVarB2 = achm.b(achkVar.c);
                if (achmVarB2 == null) {
                    achmVarB2 = achm.UNKNOWN_REQUEST_REASON;
                }
                final int i2 = i;
                oir oirVar = oirVarA;
                final yzq yzqVar = yzqVarO;
                final olk olkVar = this.a;
                return zuz.g(zwx.u(olkVar.d(yzqVar, oirVar, i2, achmVarB2)), wyo.a(new yqi() { // from class: oli
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        yyr yyrVar = (yyr) obj2;
                        HashMap map = new HashMap();
                        int i3 = i2;
                        Set<acgd> set = yzqVar;
                        if (i3 != 3) {
                            for (acgd acgdVar : set) {
                                acfu acfuVar = acfu.a;
                                acft acftVar = new acft();
                                if ((acftVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acftVar.y();
                                }
                                acfu acfuVar2 = (acfu) acftVar.b;
                                acfuVar2.c = acgdVar.dE;
                                acfuVar2.b |= 1;
                                map.put(acgdVar, (acfu) acftVar.v());
                            }
                        }
                        achk achkVar2 = achkVar;
                        olk olkVar2 = olkVar;
                        ypv ypvVar = ypv.a;
                        return olkVar2.f(set, achkVar2, i3, map, yyrVar, ypvVar, ypvVar);
                    }
                }), olkVar.i);
            }
        });
        ExecutorService executorService2 = this.h;
        final zyd zydVarH = zuz.h(zydVarG, zviVarC, executorService2);
        final okq okqVar = new okq(this);
        final wwq wwqVarE = wum.e();
        return zuz.g(zud.g(zuz.g(zwx.u(new wzv(zwc.c(new zvx() { // from class: wxw
            @Override // defpackage.zvx
            public final Object a(zvz zvzVar) {
                wyo wyoVar = wyo.a;
                zvzVar.getClass();
                wwq wwqVarG = wum.g(wum.c(), wwqVarE);
                try {
                    return ((okq) okqVar).a.a(zvzVar);
                } finally {
                }
            }
        }, executorService2)).c(new zvv() { // from class: okr
            @Override // defpackage.zvv
            public final zwc a(zvz zvzVar, Object obj) {
                final okb okbVar = (okb) obj;
                wzv wzvVar = new wzv(new zwc(zydVarH));
                final oir oirVar = oirVarA;
                final int i2 = i;
                final olk olkVar = this.a;
                final boolean z2 = z;
                zvv zvvVar = new zvv() { // from class: oko
                    @Override // defpackage.zvv
                    public final zwc a(zvz zvzVar2, Object obj2) {
                        final HashMap map = new HashMap();
                        final HashMap map2 = new HashMap();
                        final HashMap map3 = new HashMap();
                        final olk olkVar2 = olkVar;
                        wzv wzvVar2 = new wzv(new zwc(olkVar2.e(okbVar, oirVar, i2, (acfv) obj2, map, map2, map3)));
                        final boolean z3 = z2;
                        return wzvVar2.c(new zvv() { // from class: ole
                            @Override // defpackage.zvv
                            public final zwc a(zvz zvzVar3, Object obj3) {
                                final olk olkVar3;
                                final Map map4 = (Map) obj3;
                                ArrayList arrayList = new ArrayList();
                                final HashMap map5 = new HashMap();
                                final Map map6 = map;
                                Iterator it2 = map6.keySet().iterator();
                                while (true) {
                                    olkVar3 = olkVar2;
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    acgd acgdVar = (acgd) it2.next();
                                    ojj ojjVar = (ojj) olkVar3.j.get(acgdVar);
                                    if (ojjVar != null) {
                                        yqt yqtVar2 = olkVar3.b;
                                        yyk.j((Collection) map6.get(acgdVar));
                                        Geller geller = olkVar3.c;
                                        zyd zydVarA = ojjVar.a();
                                        if (oms.c(oms.b(yqtVar2), acgdVar, geller)) {
                                            map5.put(acgdVar, zydVarA);
                                        } else {
                                            arrayList.add(zydVarA);
                                        }
                                    }
                                }
                                boolean z4 = z3;
                                final Map map7 = map2;
                                final Map map8 = map3;
                                zxj zxjVarA = zxn.a(map5.values());
                                zvh zvhVarB = wyo.b(new zvh() { // from class: okm
                                    @Override // defpackage.zvh
                                    public final zyd a() {
                                        ArrayList arrayList2 = new ArrayList();
                                        HashSet hashSet = new HashSet();
                                        Map map9 = map5;
                                        Iterator it3 = map9.keySet().iterator();
                                        Map map10 = map8;
                                        while (true) {
                                            Map map11 = map6;
                                            final Map map12 = map4;
                                            olk olkVar4 = olkVar3;
                                            if (!it3.hasNext()) {
                                                Map map13 = map7;
                                                ont ontVar = olkVar4.d;
                                                ontVar.a(hashSet, map11);
                                                ontVar.c(hashSet, map13);
                                                return zxn.a(arrayList2).b(wyo.b(new zvh() { // from class: okw
                                                    @Override // defpackage.zvh
                                                    public final zyd a() {
                                                        return zxn.h(map12);
                                                    }
                                                }), olkVar4.h);
                                            }
                                            acgd acgdVar2 = (acgd) it3.next();
                                            try {
                                                zxn.o((Future) map9.get(acgdVar2));
                                                hashSet.add(acgdVar2);
                                                if (map10.containsKey(acgdVar2)) {
                                                    final Geller geller2 = olkVar4.c;
                                                    final String strB = oms.b(olkVar4.b);
                                                    final achs achsVar = (achs) map10.get(acgdVar2);
                                                    boolean z5 = geller2.j;
                                                    yqw.M(true, "updateMetadata() not allowed if Geller is read-only");
                                                    arrayList2.add(zxn.k(wyo.i(new Callable() { // from class: omy
                                                        @Override // java.util.concurrent.Callable
                                                        public final Object call() {
                                                            int iA3;
                                                            achs achsVar2 = achsVar;
                                                            Geller geller3 = geller2;
                                                            onp onpVar = geller3.e;
                                                            String str2 = strB;
                                                            long jA = geller3.a();
                                                            long jA2 = onpVar.a(str2);
                                                            try {
                                                                int i3 = achsVar2.memoizedSerializedSize;
                                                                if ((i3 & Integer.MIN_VALUE) != 0) {
                                                                    iA3 = abza.a.a(achsVar2.getClass()).a(achsVar2);
                                                                    if (iA3 < 0) {
                                                                        throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                                                    }
                                                                } else {
                                                                    iA3 = i3 & Integer.MAX_VALUE;
                                                                    if (iA3 == Integer.MAX_VALUE) {
                                                                        iA3 = abza.a.a(achsVar2.getClass()).a(achsVar2);
                                                                        if (iA3 < 0) {
                                                                            throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                                                        }
                                                                        achsVar2.memoizedSerializedSize = (Integer.MIN_VALUE & achsVar2.memoizedSerializedSize) | iA3;
                                                                    }
                                                                }
                                                                byte[] bArr = new byte[iA3];
                                                                boolean z6 = abvz.e;
                                                                abvw abvwVar = new abvw(bArr, 0, iA3);
                                                                abza.a.a(achsVar2.getClass()).m(achsVar2, abwa.a(abvwVar));
                                                                abvwVar.K();
                                                                return Boolean.valueOf(geller3.nativeUpdateMetadata(jA, jA2, bArr, true));
                                                            } catch (IOException e) {
                                                                throw new RuntimeException(a.u(achsVar2, " to a byte array threw an IOException (should never happen)."), e);
                                                            }
                                                        }
                                                    }), geller2.d));
                                                }
                                                int i3 = yyk.e;
                                                yyf yyfVar = new yyf(4);
                                                for (acgi acgiVar : map11.containsKey(acgdVar2) ? (List) map11.get(acgdVar2) : zcg.b) {
                                                    if ((acgiVar.b & 4) != 0) {
                                                        yyfVar.g(acgiVar.d);
                                                    }
                                                }
                                                ojf ojfVar = new ojf();
                                                ojfVar.c().i(yyfVar.f());
                                                map12.put(acgdVar2, ojfVar.a());
                                            } catch (ExecutionException e) {
                                                ojf ojfVar2 = new ojf();
                                                ojfVar2.b().g(new oll("Failed to commit downloads to the custom storage: ".concat(String.valueOf(e.getMessage())), e));
                                                map12.put(acgdVar2, ojfVar2.a());
                                                olkVar4.d.d(acgdVar2.name(), "DOWNLOAD_COMMIT_FAILURE");
                                            }
                                        }
                                    }
                                });
                                ExecutorService executorService3 = olkVar3.h;
                                final zyd zydVarB = zxjVarA.b(zvhVarB, executorService3);
                                return z4 ? new zwc(zxn.c(arrayList).b(wyo.b(new zvh() { // from class: olf
                                    @Override // defpackage.zvh
                                    public final zyd a() {
                                        return zydVarB;
                                    }
                                }), executorService3)) : new zwc(zydVarB);
                            }
                        }, olkVar2.h).a;
                    }
                };
                ExecutorService executorService3 = olkVar.h;
                wzv wzvVarC = wzvVar.c(zvvVar, executorService3);
                final yzq yzqVar = yzqVarO;
                return wzvVarC.a(Exception.class, new zvy() { // from class: okp
                    @Override // defpackage.zvy
                    public final Object a(zvz zvzVar2, Object obj2) {
                        Exception exc = (Exception) obj2;
                        return olkVar.c(yzqVar, exc, 10, "Failed to generate BatchSyncRequest: ".concat(String.valueOf(exc.getMessage())));
                    }
                }, executorService3).a;
            }
        }, executorService2).a(Exception.class, new zvy() { // from class: oks
            @Override // defpackage.zvy
            public final Object a(zvz zvzVar, Object obj) {
                Exception exc = (Exception) obj;
                return this.a.c(yzqVarO, exc, 9, "Failed to load GellerOneplatformClient: ".concat(String.valueOf(exc.getMessage())));
            }
        }, executorService2).d()), wyo.a(new yqi() { // from class: okj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                olk olkVar = this.a;
                Set<omm> set = olkVar.e;
                Map map = (Map) obj;
                for (omm ommVar2 : set) {
                    yyr.j(map);
                    ommVar2.a();
                }
                for (acgd acgdVar : map.keySet()) {
                    oml omlVar = (oml) map.get(acgdVar);
                    acgdVar.name();
                    yqt yqtVar2 = olkVar.b;
                    oms.b(yqtVar2);
                    omlVar.d().size();
                    omlVar.e().size();
                    int i2 = ((zcg) omlVar.b()).d;
                    for (omm ommVar3 : set) {
                        ommVar3.b();
                    }
                }
                return map;
            }
        }), executorService), Exception.class, wyo.a(new yqi() { // from class: okk
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                olk olkVar;
                Exception exc = (Exception) obj;
                yyn yynVar = new yyn(4);
                zdl it2 = yzqVarO.iterator();
                while (true) {
                    olkVar = this.a;
                    if (!it2.hasNext()) {
                        break;
                    }
                    acgd acgdVar = (acgd) it2.next();
                    ojf ojfVar = new ojf();
                    ojfVar.b().g(new oll("Geller oneplatform server generated an exception", exc));
                    oml omlVarA = ojfVar.a();
                    acgdVar.name();
                    yqt yqtVar2 = olkVar.b;
                    oms.b(yqtVar2);
                    olkVar.d.d(acgdVar.name(), "ONE_PLATFORM_SERVER_FAILURE");
                    yynVar.c(acgdVar, omlVarA);
                    for (omm ommVar2 : olkVar.e) {
                        ommVar2.b();
                    }
                }
                for (omm ommVar3 : olkVar.e) {
                    yynVar.a(true);
                    ommVar3.a();
                }
                return yynVar.a(true);
            }
        }), executorService), wyo.a(new yqi() { // from class: okl
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                olk olkVar = this.a;
                Map map = (Map) obj;
                int i2 = olkVar.m;
                for (Map.Entry entry : map.entrySet()) {
                    ont ontVar = olkVar.d;
                    String strName = ((acgd) entry.getKey()).name();
                    boolean zIsEmpty = ((oml) entry.getValue()).b().isEmpty();
                    oth othVar = (oth) ((ono) ontVar).a;
                    ((uqq) othVar.a.N.eV()).b(i2, othVar.b, othVar.c, strName, Boolean.valueOf(zIsEmpty));
                }
                return map;
            }
        }), executorService);
    }

    public final yyr c(Iterable iterable, Exception exc, int i, String str) {
        String str2;
        yyn yynVar = new yyn(4);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            acgd acgdVar = (acgd) it.next();
            ojf ojfVar = new ojf();
            ojfVar.b().g(new oll(str, exc));
            yynVar.c(acgdVar, ojfVar.a());
            ont ontVar = this.d;
            String strName = acgdVar.name();
            switch (i) {
                case 9:
                    str2 = "ONE_PLATFORM_CLIENT_LOAD_FAILURE";
                    break;
                case 10:
                    str2 = "BATCH_SYNC_REQUEST_GENERATION_FAILURE";
                    break;
                case 11:
                    str2 = "BATCH_SYNC_RPC_FAILURE";
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    str2 = "ELEMENT_DECRYPTION_FAILURE";
                    break;
                default:
                    str2 = "FOLLOW_UP_REQUEST_GENERATION_FAILURE";
                    break;
            }
            ontVar.d(strName, str2);
        }
        return yynVar.a(true);
    }

    public final zyd d(Set set, final oir oirVar, int i, final achm achmVar) {
        zyd zydVarG;
        if (i == 2) {
            zydVarG = zxn.h(zcp.b);
        } else {
            int i2 = yyk.e;
            yyf yyfVar = new yyf(4);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                final acgd acgdVar = (acgd) it.next();
                zvh zvhVar = new zvh() { // from class: okf
                    @Override // defpackage.zvh
                    public final zyd a() {
                        yqt yqtVar = this.a.b;
                        if (!yqtVar.g()) {
                            return zxn.h(true);
                        }
                        acgd acgdVar2 = acgdVar;
                        oir oirVar2 = oirVar;
                        return oirVar2.b(acgdVar2);
                    }
                };
                ExecutorService executorService = this.g;
                yyfVar.g(zuz.g(zxn.l(wyo.b(zvhVar), executorService), wyo.a(new yqi() { // from class: okg
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        acgd acgdVar2 = acgdVar;
                        if (zBooleanValue) {
                            return acgdVar2;
                        }
                        ((zdv) ((zdv) olk.a.d()).q("com/google/android/libraries/geller/gellersync/GellerSyncClient", "filterUploadEnabled", 1129, "GellerSyncClient.java")).x("Upload permissions denied for Corpus %s", acgdVar2.name());
                        return null;
                    }
                }), executorService));
            }
            zydVarG = zuz.g(zxn.m(yyfVar.f()), wyo.a(new yqi() { // from class: okh
                @Override // defpackage.yqi
                public final Object apply(Object obj) {
                    yzo yzoVar = new yzo();
                    for (acgd acgdVar2 : (List) obj) {
                        if (acgdVar2 != null) {
                            yzoVar.c(acgdVar2);
                        }
                    }
                    return yzoVar.f();
                }
            }), this.g);
        }
        zwx zwxVarU = zwx.u(zydVarG);
        zvi zviVarC = wyo.c(new zvi() { // from class: okz
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                olk olkVar = this.a;
                final Geller geller = olkVar.c;
                final yzq yzqVar = (yzq) obj;
                final String strB = oms.b(olkVar.b);
                acoi acoiVar = acoi.a;
                final boolean z = geller.h.t;
                Iterator<E> it2 = yzqVar.iterator();
                while (it2.hasNext()) {
                    geller.e((acgd) it2.next(), "read_snapshot", acoiVar);
                }
                zvh zvhVar2 = new zvh() { // from class: one
                    @Override // defpackage.zvh
                    public final zyd a() {
                        yzq yzqVar2 = yzqVar;
                        String[] strArr = new String[yzqVar2.size()];
                        zdl it3 = yzqVar2.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            strArr[i3] = ((acgd) it3.next()).name();
                            i3++;
                        }
                        String str = strB;
                        Geller geller2 = geller;
                        acdx acdxVar = (acdx) onx.a(geller2.nativeReadSnapshot(geller2.a(), geller2.e.a(str), strArr, 1, z), acdx.a);
                        zdl it4 = yzqVar2.iterator();
                        while (it4.hasNext()) {
                            acgd acgdVar2 = (acgd) it4.next();
                            geller2.b(acgdVar2).j(acgdVar2.name(), acdxVar);
                        }
                        return zxn.h(acdxVar);
                    }
                };
                return zxn.l(wyo.b(zvhVar2), geller.d);
            }
        });
        ExecutorService executorService2 = this.g;
        return zuz.g(zuz.h(zuz.h(zwxVarU, zviVarC, executorService2), wyo.c(new zvi() { // from class: ola
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                acdx acdxVar = (acdx) obj;
                ArrayList arrayList = new ArrayList(acdxVar.b.size());
                for (acbu acbuVar : acdxVar.b) {
                    final acgd acgdVarB = acgd.b(acbuVar.d);
                    if (acgdVarB == null) {
                        acgdVarB = acgd.UNKNOWN;
                    }
                    final ArrayList arrayList2 = new ArrayList((acbuVar.b == 2 ? (acbw) acbuVar.c : acbw.a).b);
                    final abxs abxsVar = (acbuVar.b == 2 ? (acbw) acbuVar.c : acbw.a).c;
                    if (acgdVarB.name().startsWith("ENCRYPTED_")) {
                        olk olkVar = this.a;
                        oiz oizVar = (oiz) ((yqz) olkVar.l).a;
                        arrayList.add(zuz.g(zuz.g(oizVar.c.a(oms.b(olkVar.b)), wyo.a(new yqi() { // from class: oiy
                            @Override // defpackage.yqi
                            public final Object apply(Object obj2) throws GeneralSecurityException {
                                oiu oiuVar;
                                Exception exc;
                                int iA;
                                int iA2;
                                oiu oiuVar2 = (oiu) ((yqt) obj2).f();
                                if (oiuVar2 == null) {
                                    ((zdv) ((zdv) oiz.a.c()).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 62, "EncryptionUtil.java")).u("Failed to fetch encryption key to encrypt Elements.");
                                    int i3 = yyk.e;
                                    return zcg.b;
                                }
                                List<acgi> list = arrayList2;
                                ArrayList arrayList3 = new ArrayList(list.size());
                                for (acgi acgiVar : list) {
                                    if ((acgiVar.b & 8) != 0) {
                                        acgo acgoVar = acgo.a;
                                        acgn acgnVar = new acgn();
                                        try {
                                            abuy abuyVar = acgiVar.e;
                                            if (abuyVar == null) {
                                                try {
                                                    abuyVar = abuy.a;
                                                } catch (Exception e) {
                                                    exc = e;
                                                    oiuVar = oiuVar2;
                                                    ((zdv) ((zdv) ((zdv) oiz.a.c()).p(exc)).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 'U', "EncryptionUtil.java")).u("Unexpected error when trying to encrypt element.");
                                                    oiuVar2 = oiuVar;
                                                }
                                            }
                                            try {
                                                int i4 = abuyVar.memoizedSerializedSize;
                                                if ((i4 & Integer.MIN_VALUE) != 0) {
                                                    iA = abza.a.a(abuyVar.getClass()).a(abuyVar);
                                                    if (iA < 0) {
                                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                    }
                                                } else {
                                                    iA = i4 & Integer.MAX_VALUE;
                                                    if (iA == Integer.MAX_VALUE) {
                                                        iA = abza.a.a(abuyVar.getClass()).a(abuyVar);
                                                        if (iA < 0) {
                                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                        }
                                                        abuyVar.memoizedSerializedSize = (abuyVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                                    }
                                                }
                                                byte[] bArr = new byte[iA];
                                                boolean z = abvz.e;
                                                abvw abvwVar = new abvw(bArr, 0, iA);
                                                abza.a.a(abuyVar.getClass()).m(abuyVar, abwa.a(abvwVar));
                                                abvwVar.K();
                                                aafh aafhVar = new aafh(oiuVar2.a());
                                                byte[] bArrB = aacb.b(12);
                                                AlgorithmParameterSpec algorithmParameterSpecA = aaab.a(bArrB, 0, bArrB.length);
                                                Cipher cipherB = aaab.b();
                                                oiuVar = oiuVar2;
                                                try {
                                                    cipherB.init(1, aafhVar.b, algorithmParameterSpecA);
                                                    int outputSize = cipherB.getOutputSize(iA);
                                                    byte[] bArr2 = aafhVar.c;
                                                    int length = bArr2.length;
                                                    if (outputSize > 2147483635 - length) {
                                                        throw new GeneralSecurityException("plaintext too long");
                                                    }
                                                    int i5 = length + 12;
                                                    byte[] bArrCopyOf = Arrays.copyOf(bArr2, i5 + outputSize);
                                                    System.arraycopy(bArrB, 0, bArrCopyOf, length, 12);
                                                    if (cipherB.doFinal(bArr, 0, iA, bArrCopyOf, i5) != outputSize) {
                                                        throw new GeneralSecurityException("not enough data written");
                                                    }
                                                    abvo abvoVar = abvo.b;
                                                    abvo abvoVarU = abvo.u(bArrCopyOf, 0, bArrCopyOf.length);
                                                    if ((acgnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        acgnVar.y();
                                                    }
                                                    acgo acgoVar2 = (acgo) acgnVar.b;
                                                    acgoVar2.b |= 1;
                                                    acgoVar2.c = abvoVarU;
                                                    if ((acgnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        acgnVar.y();
                                                    }
                                                    acgo acgoVar3 = (acgo) acgnVar.b;
                                                    acgoVar3.b |= 2;
                                                    acgoVar3.d = -1;
                                                    acgh acghVar = new acgh();
                                                    acghVar.B(acgiVar);
                                                    abux abuxVar = new abux();
                                                    if ((abuxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                        abuxVar.y();
                                                    }
                                                    ((abuy) abuxVar.b).b = "type.googleapis.com/geller.oneplatform.GellerE2eeElement";
                                                    acgo acgoVar4 = (acgo) acgnVar.v();
                                                    try {
                                                        int i6 = acgoVar4.memoizedSerializedSize;
                                                        if ((i6 & Integer.MIN_VALUE) != 0) {
                                                            iA2 = abza.a.a(acgoVar4.getClass()).a(acgoVar4);
                                                            if (iA2 < 0) {
                                                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                                            }
                                                        } else {
                                                            iA2 = i6 & Integer.MAX_VALUE;
                                                            if (iA2 == Integer.MAX_VALUE) {
                                                                iA2 = abza.a.a(acgoVar4.getClass()).a(acgoVar4);
                                                                if (iA2 < 0) {
                                                                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                                                }
                                                                acgoVar4.memoizedSerializedSize = (acgoVar4.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                                                            }
                                                        }
                                                        byte[] bArr3 = new byte[iA2];
                                                        abvw abvwVar2 = new abvw(bArr3, 0, iA2);
                                                        abza.a.a(acgoVar4.getClass()).m(acgoVar4, abwa.a(abvwVar2));
                                                        abvo abvoVarA = abvk.a(abvwVar2, bArr3);
                                                        if ((abuxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                            abuxVar.y();
                                                        }
                                                        ((abuy) abuxVar.b).c = abvoVarA;
                                                        if ((acghVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                            acghVar.y();
                                                        }
                                                        acgi acgiVar2 = (acgi) acghVar.b;
                                                        abuy abuyVar2 = (abuy) abuxVar.v();
                                                        abuyVar2.getClass();
                                                        acgiVar2.e = abuyVar2;
                                                        acgiVar2.b |= 8;
                                                        arrayList3.add((acgi) acghVar.v());
                                                    } catch (IOException e2) {
                                                        throw new RuntimeException(a.C(acgoVar4, "ByteString"), e2);
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    exc = e;
                                                    ((zdv) ((zdv) ((zdv) oiz.a.c()).p(exc)).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 'U', "EncryptionUtil.java")).u("Unexpected error when trying to encrypt element.");
                                                    oiuVar2 = oiuVar;
                                                }
                                            } catch (IOException e4) {
                                                throw new RuntimeException(a.C(abuyVar, "byte array"), e4);
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            oiuVar = oiuVar2;
                                        }
                                    } else {
                                        oiuVar = oiuVar2;
                                        ((zdv) ((zdv) oiz.a.c()).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "encryptElements", 68, "EncryptionUtil.java")).u("Element to encrypt is missing data field.");
                                    }
                                    oiuVar2 = oiuVar;
                                }
                                return yyk.j(arrayList3);
                            }
                        }), oizVar.d), wyo.a(new yqi() { // from class: olc
                            @Override // defpackage.yqi
                            public final Object apply(Object obj2) {
                                yyk yykVarJ = yyk.j(abxsVar);
                                return new ojc(acgdVarB, (yyk) obj2, yykVarJ);
                            }
                        }), olkVar.g));
                    } else {
                        arrayList.add(zxn.h(new ojc(acgdVarB, yyk.j(arrayList2), yyk.j(abxsVar))));
                    }
                }
                return zxn.e(arrayList);
            }
        }), executorService2), wyo.a(new yqi() { // from class: olb
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                int i3;
                yqt yqtVarI;
                int iA;
                int iA2;
                int iA3;
                int iA4;
                int iA5;
                yyn yynVar = new yyn(4);
                Iterator it2 = ((List) obj).iterator();
                long j = 0;
                while (it2.hasNext()) {
                    achm achmVar2 = achmVar;
                    oji ojiVar = (oji) it2.next();
                    acgd acgdVarC = ojiVar.c();
                    yyk<acgi> yykVarB = ojiVar.b();
                    yyk<acgi> yykVarA = ojiVar.a();
                    zdy zdyVar = olk.a;
                    Iterator it3 = it2;
                    long j2 = j;
                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1032, "GellerSyncClient.java")).I("There are %d elements to be updated on the server for corpus %s and with the reason %s.", Integer.valueOf(yykVarB.size()), new qsk(acgdVarC), new qsk(achmVar2));
                    Lists.c(yykVarB, new yqi() { // from class: okd
                        @Override // defpackage.yqi
                        public final Object apply(Object obj2) {
                            return ((acgi) obj2).d;
                        }
                    });
                    ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPartsForUpload", 1042, "GellerSyncClient.java")).I("There are %d elements to delete from the server for corpus %s and with the reason %s.", Integer.valueOf(yykVarA.size()), new qsk(acgdVarC), new qsk(achmVar2));
                    if (yykVarA.isEmpty() && yykVarB.isEmpty()) {
                        yqtVarI = ypv.a;
                        i3 = Integer.MIN_VALUE;
                    } else {
                        acfu acfuVar = acfu.a;
                        acft acftVar = new acft();
                        long j3 = j2;
                        for (acgi acgiVar : yykVarA) {
                            int i4 = acgiVar.memoizedSerializedSize;
                            if ((i4 & Integer.MIN_VALUE) != 0) {
                                iA3 = abza.a.a(acgiVar.getClass()).a(acgiVar);
                                if (iA3 < 0) {
                                    throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA3 = i4 & Integer.MAX_VALUE;
                                if (iA3 == Integer.MAX_VALUE) {
                                    iA3 = abza.a.a(acgiVar.getClass()).a(acgiVar);
                                    if (iA3 < 0) {
                                        throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                    }
                                    acgiVar.memoizedSerializedSize = (acgiVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                                }
                            }
                            if (iA3 + j3 <= 3670016.0d) {
                                if ((acftVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acftVar.y();
                                }
                                acfu acfuVar2 = (acfu) acftVar.b;
                                acgiVar.getClass();
                                abxs abxsVar = acfuVar2.g;
                                if (!abxsVar.c()) {
                                    int size = abxsVar.size();
                                    acfuVar2.g = abxsVar.d(size + size);
                                }
                                acfuVar2.g.add(acgiVar);
                                int i5 = acgiVar.memoizedSerializedSize;
                                if ((i5 & Integer.MIN_VALUE) != 0) {
                                    iA4 = abza.a.a(acgiVar.getClass()).a(acgiVar);
                                    if (iA4 < 0) {
                                        throw new IllegalStateException(a.b(iA4, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA4 = i5 & Integer.MAX_VALUE;
                                    if (iA4 == Integer.MAX_VALUE) {
                                        iA4 = abza.a.a(acgiVar.getClass()).a(acgiVar);
                                        if (iA4 < 0) {
                                            throw new IllegalStateException(a.b(iA4, "serialized size must be non-negative, was "));
                                        }
                                        acgiVar.memoizedSerializedSize = (acgiVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA4;
                                    }
                                }
                                j3 += iA4;
                            } else {
                                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPaginatedPartForUpload", 1083, "GellerSyncClient.java")).x("Unable to fit deleted element into current page for corpus %s", acgdVarC.name());
                            }
                        }
                        i3 = Integer.MIN_VALUE;
                        for (acgi acgiVar2 : yykVarB) {
                            int i6 = acgiVar2.memoizedSerializedSize;
                            if ((i6 & Integer.MIN_VALUE) != 0) {
                                iA = abza.a.a(acgiVar2.getClass()).a(acgiVar2);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA = i6 & Integer.MAX_VALUE;
                                if (iA == Integer.MAX_VALUE) {
                                    iA = abza.a.a(acgiVar2.getClass()).a(acgiVar2);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                    acgiVar2.memoizedSerializedSize = (acgiVar2.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                                }
                            }
                            if (iA + j3 <= 3670016.0d) {
                                if ((acftVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                    acftVar.y();
                                }
                                acfu acfuVar3 = (acfu) acftVar.b;
                                acgiVar2.getClass();
                                abxs abxsVar2 = acfuVar3.f;
                                if (!abxsVar2.c()) {
                                    int size2 = abxsVar2.size();
                                    acfuVar3.f = abxsVar2.d(size2 + size2);
                                }
                                acfuVar3.f.add(acgiVar2);
                                int i7 = acgiVar2.memoizedSerializedSize;
                                if ((i7 & Integer.MIN_VALUE) != 0) {
                                    iA2 = abza.a.a(acgiVar2.getClass()).a(acgiVar2);
                                    if (iA2 < 0) {
                                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    int iA6 = i7 & Integer.MAX_VALUE;
                                    if (iA6 == Integer.MAX_VALUE) {
                                        iA6 = abza.a.a(acgiVar2.getClass()).a(acgiVar2);
                                        if (iA6 < 0) {
                                            throw new IllegalStateException(a.b(iA6, "serialized size must be non-negative, was "));
                                        }
                                        acgiVar2.memoizedSerializedSize = (acgiVar2.memoizedSerializedSize & Integer.MIN_VALUE) | iA6;
                                    }
                                    iA2 = iA6;
                                }
                                j3 += iA2;
                            } else {
                                ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncClient", "getPaginatedPartForUpload", 1092, "GellerSyncClient.java")).x("Unable to fit element into current page for corpus %s", acgdVarC.name());
                            }
                        }
                        if ((acftVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acftVar.y();
                        }
                        acfu acfuVar4 = (acfu) acftVar.b;
                        acfuVar4.c = acgdVarC.dE;
                        acfuVar4.b |= 1;
                        yqtVarI = yqt.i((acfu) acftVar.v());
                    }
                    if (yqtVarI.g()) {
                        yynVar.c(acgdVarC, yqtVarI.c());
                        Object objC = yqtVarI.c();
                        abxd abxdVar = (abxd) objC;
                        int i8 = abxdVar.memoizedSerializedSize;
                        if ((i8 & i3) != 0) {
                            iA5 = abza.a.a(objC.getClass()).a(objC);
                            if (iA5 < 0) {
                                throw new IllegalStateException(a.b(iA5, "serialized size must be non-negative, was "));
                            }
                        } else {
                            int i9 = i8 & Integer.MAX_VALUE;
                            if (i9 != Integer.MAX_VALUE) {
                                iA5 = i9;
                            } else {
                                iA5 = abza.a.a(objC.getClass()).a(objC);
                                if (iA5 < 0) {
                                    throw new IllegalStateException(a.b(iA5, "serialized size must be non-negative, was "));
                                }
                                abxdVar.memoizedSerializedSize = (abxdVar.memoizedSerializedSize & i3) | iA5;
                            }
                        }
                        j = j2 + iA5;
                    } else {
                        j = j2;
                    }
                    it2 = it3;
                }
                return yynVar.a(true);
            }
        }), executorService2);
    }

    public final zyd e(final okb okbVar, final oir oirVar, final int i, final acfv acfvVar, final Map map, final Map map2, final Map map3) {
        zyd zydVarA;
        this.m++;
        yrn yrnVar = this.k;
        yrnVar.d();
        yrnVar.e();
        if (acfvVar.c.size() == 0) {
            ((zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/gellersync/GellerSyncClient", "batchSync", 772, "GellerSyncClient.java")).u("Created batch sync request with no parts, returning immediately.");
            zydVarA = zxn.h(acfz.a);
        } else {
            String str = this.s;
            achb achbVar = (achb) ((achb) agec.b(new acha(), okbVar.a, afem.a)).f(acbg.b(okbVar.b), TimeUnit.MILLISECONDS);
            okbVar.c.booleanValue();
            afen afenVar = achbVar.a;
            afek afekVarA = afem.a(achbVar.b);
            afekVarA.d = "gzip";
            achb achbVar2 = new achb(afenVar, new afem(afekVarA));
            if (str != null) {
                yoz yozVar = new yoz(str, null);
                Duration duration = ypk.b;
                ype ypeVar = new ype();
                ypeVar.a = yozVar;
                achbVar2 = new achb(achbVar2.a, achbVar2.b.b(new afki(new ypk(ypeVar.a, ypeVar.b, ypeVar.c), afki.b)));
            }
            afil afilVarA = achc.a;
            if (afilVarA == null) {
                synchronized (achc.class) {
                    afilVarA = achc.a;
                    if (afilVarA == null) {
                        afii afiiVarC = afil.c();
                        afiiVarC.c = afik.UNARY;
                        afiiVarC.d = afil.b("geller.oneplatform.GellerService", "BatchSync");
                        afiiVarC.e = true;
                        acfv acfvVar2 = acfv.a;
                        ExtensionRegistryLite extensionRegistryLite = agea.a;
                        afiiVarC.a = new agdz(acfvVar2);
                        afiiVarC.b = new agdz(acfz.a);
                        afilVarA = afiiVarC.a();
                        achc.a = afilVarA;
                    }
                }
            }
            zydVarA = agen.a(achbVar2.a.a(afilVarA, achbVar2.b), acfvVar);
        }
        return wzx.g(zydVarA).i(wyo.c(new zvi() { // from class: okx
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v8, types: [abzj] */
            /* JADX WARN: Type inference failed for: r8v11 */
            /* JADX WARN: Type inference failed for: r8v12 */
            /* JADX WARN: Type inference failed for: r8v21, types: [abvu, abzd] */
            /* JADX WARN: Type inference failed for: r8v22 */
            /* JADX WARN: Type inference failed for: r8v26 */
            /* JADX WARN: Type inference failed for: r8v27 */
            /* JADX WARN: Type inference failed for: r8v28 */
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws abxv {
                final Map map4;
                final olk olkVar;
                int i2;
                String str2;
                acfz acfzVar;
                boolean z;
                Exception exc;
                int i3;
                ?? P;
                int i4;
                final acgo acgoVar;
                acfz acfzVar2 = (acfz) obj;
                Iterator it = acfzVar2.b.iterator();
                while (true) {
                    map4 = map3;
                    olkVar = this.a;
                    i2 = 2;
                    if (!it.hasNext()) {
                        break;
                    }
                    acfy acfyVar = (acfy) it.next();
                    acgd acgdVarB = acgd.b(acfyVar.d);
                    if (acgdVarB == null) {
                        acgdVarB = acgd.UNKNOWN;
                    }
                    if (oms.c(oms.b(olkVar.b), acgdVarB, olkVar.c)) {
                        map4.put(acgdVarB, acfyVar.b == 2 ? (achs) acfyVar.c : achs.a);
                    }
                }
                ArrayList arrayList = new ArrayList(acfzVar2.b.size());
                Iterator it2 = acfzVar2.b.iterator();
                loop1: while (it2.hasNext()) {
                    final acfy acfyVar2 = (acfy) it2.next();
                    acgd acgdVarB2 = acgd.b(acfyVar2.d);
                    if (acgdVarB2 == null) {
                        acgdVarB2 = acgd.UNKNOWN;
                    }
                    if (acgdVarB2.name().startsWith("ENCRYPTED_")) {
                        int i5 = acfyVar2.b;
                        if (i5 != 1) {
                            final achs achsVar = i5 == i2 ? (achs) acfyVar2.c : achs.a;
                            yqt yqtVar = olkVar.l;
                            yqt yqtVar2 = olkVar.b;
                            abxs abxsVar = achsVar.e;
                            String strB = oms.b(yqtVar2);
                            ArrayList arrayList2 = new ArrayList(abxsVar.size());
                            Iterator it3 = abxsVar.iterator();
                            while (true) {
                                Object obj2 = ((yqz) yqtVar).a;
                                if (!it3.hasNext()) {
                                    arrayList.add(zuz.g(zuz.g(zxn.e(arrayList2), wyo.a(new yqi() { // from class: oix
                                        @Override // defpackage.yqi
                                        public final Object apply(Object obj3) {
                                            List<yqt> list = (List) obj3;
                                            ArrayList arrayList3 = new ArrayList(list.size());
                                            for (yqt yqtVar3 : list) {
                                                if (yqtVar3.g()) {
                                                    arrayList3.add((acgi) yqtVar3.c());
                                                }
                                            }
                                            return yyk.j(arrayList3);
                                        }
                                    }), ((oiz) obj2).d), wyo.a(new yqi() { // from class: olj
                                        @Override // defpackage.yqi
                                        public final Object apply(Object obj3) {
                                            yyk yykVar = (yyk) obj3;
                                            acfx acfxVar = new acfx();
                                            acfxVar.B(acfyVar2);
                                            achr achrVar = new achr();
                                            achrVar.B(achsVar);
                                            if ((achrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                achrVar.y();
                                            }
                                            achs achsVar2 = (achs) achrVar.b;
                                            achs achsVar3 = achs.a;
                                            achsVar2.e = abzb.b;
                                            if ((achrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                achrVar.y();
                                            }
                                            achs achsVar4 = (achs) achrVar.b;
                                            abxs abxsVar2 = achsVar4.e;
                                            if (!abxsVar2.c()) {
                                                int size = abxsVar2.size();
                                                achsVar4.e = abxsVar2.d(size + size);
                                            }
                                            abus.m(yykVar, achsVar4.e);
                                            achs achsVar5 = (achs) achrVar.v();
                                            if ((acfxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                acfxVar.y();
                                            }
                                            acfy acfyVar3 = (acfy) acfxVar.b;
                                            acfy acfyVar4 = acfy.a;
                                            achsVar5.getClass();
                                            acfyVar3.c = achsVar5;
                                            acfyVar3.b = 2;
                                            return (acfy) acfxVar.v();
                                        }
                                    }), olkVar.g));
                                    i2 = i2;
                                    it2 = it2;
                                    acfzVar2 = acfzVar2;
                                    break;
                                }
                                final acgi acgiVar = (acgi) it3.next();
                                abuy abuyVar = acgiVar.e;
                                if (abuyVar == null) {
                                    abuyVar = abuy.a;
                                }
                                if (abuyVar.b.equals("type.googleapis.com/geller.oneplatform.GellerE2eeElement")) {
                                    Iterator it4 = it2;
                                    try {
                                        abuy abuyVar2 = acgiVar.e;
                                        if (abuyVar2 == null) {
                                            try {
                                                abuyVar2 = abuy.a;
                                            } catch (Exception e) {
                                                exc = e;
                                                str2 = "EncryptionUtil.java";
                                                acfzVar = acfzVar2;
                                                z = true;
                                                i3 = 2;
                                                ((zdv) ((zdv) ((zdv) oiz.a.c()).p(exc)).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 146, str2)).u("Unexpected error when trying to parse encrypted element, skipping element.");
                                                i4 = i3;
                                                i2 = i4;
                                                it2 = it4;
                                                acfzVar2 = acfzVar;
                                            }
                                        }
                                        abvo abvoVar = abuyVar2.c;
                                        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                                        acgo acgoVar2 = acgo.a;
                                        abvt abvtVarK = abvoVar.k();
                                        acgoVar = new acgo();
                                        str2 = "EncryptionUtil.java";
                                        try {
                                            acfzVar = acfzVar2;
                                        } catch (abxv e2) {
                                            e = e2;
                                        } catch (abzz e3) {
                                            e = e3;
                                        } catch (IOException e4) {
                                            e = e4;
                                        } catch (RuntimeException e5) {
                                            e = e5;
                                        } catch (Exception e6) {
                                            e = e6;
                                            acfzVar = acfzVar2;
                                            z = true;
                                            P = 2;
                                            exc = e;
                                            i3 = P;
                                            ((zdv) ((zdv) ((zdv) oiz.a.c()).p(exc)).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 146, str2)).u("Unexpected error when trying to parse encrypted element, skipping element.");
                                            i4 = i3;
                                            i2 = i4;
                                            it2 = it4;
                                            acfzVar2 = acfzVar;
                                        }
                                        try {
                                            try {
                                                ?? A = abza.a.a(acgoVar.getClass());
                                                P = abvu.p(abvtVarK);
                                                A.i(acgoVar, P, generatedRegistry);
                                                A.g(acgoVar);
                                                z = false;
                                                try {
                                                    abvtVarK.z(0);
                                                    z = true;
                                                } catch (abxv e7) {
                                                    throw e7;
                                                }
                                            } catch (abxv e8) {
                                                e = e8;
                                                if (e.a) {
                                                    throw new abxv(e);
                                                }
                                                throw e;
                                            } catch (abzz e9) {
                                                e = e9;
                                                throw e.a();
                                            } catch (IOException e10) {
                                                e = e10;
                                                if (e.getCause() instanceof abxv) {
                                                    throw ((abxv) e.getCause());
                                                }
                                                throw new abxv(e);
                                            } catch (RuntimeException e11) {
                                                e = e11;
                                                if (e.getCause() instanceof abxv) {
                                                    throw ((abxv) e.getCause());
                                                }
                                                throw e;
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            z = true;
                                            P = 2;
                                            exc = e;
                                            i3 = P;
                                            ((zdv) ((zdv) ((zdv) oiz.a.c()).p(exc)).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 146, str2)).u("Unexpected error when trying to parse encrypted element, skipping element.");
                                            i4 = i3;
                                            i2 = i4;
                                            it2 = it4;
                                            acfzVar2 = acfzVar;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        str2 = "EncryptionUtil.java";
                                    }
                                    try {
                                        byte bByteValue = ((Byte) acgoVar.cM(1, null)).byteValue();
                                        if (bByteValue != 1) {
                                            if (bByteValue != 0) {
                                                boolean zL = abza.a.a(acgoVar.getClass()).l(acgoVar);
                                                P = 2;
                                                acgoVar.cM(2, true == zL ? acgoVar : null);
                                                if (!zL) {
                                                    break loop1;
                                                }
                                            } else {
                                                break loop1;
                                            }
                                        } else {
                                            P = 2;
                                        }
                                        try {
                                            arrayList2.add(zuz.g(((oja) ((oiz) obj2).c).a(strB), wyo.a(new yqi() { // from class: oiw
                                                @Override // defpackage.yqi
                                                public final Object apply(Object obj3) throws abxv {
                                                    acgo acgoVar3 = acgoVar;
                                                    acgi acgiVar2 = acgiVar;
                                                    try {
                                                        oiu oiuVar = (oiu) ((yqt) obj3).f();
                                                        if (oiuVar == null) {
                                                            ((zdv) ((zdv) oiz.a.c()).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", 127, "EncryptionUtil.java")).u("Failed to find matching encryption key to decrypt Element.");
                                                            return ypv.a;
                                                        }
                                                        byte[] bArrA = new aafh(oiuVar.a()).a(acgoVar3.c.B(), oiz.b);
                                                        abxd abxdVarH = abxd.h(abuy.a, bArrA, 0, bArrA.length, ExtensionRegistryLite.getGeneratedRegistry());
                                                        if (abxdVarH != null) {
                                                            abxd abxdVar = null;
                                                            byte bByteValue2 = ((Byte) abxdVarH.cM(1, null)).byteValue();
                                                            if (bByteValue2 != 1) {
                                                                if (bByteValue2 != 0) {
                                                                    boolean zL2 = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                                                                    if (true == zL2) {
                                                                        abxdVar = abxdVarH;
                                                                    }
                                                                    abxdVarH.cM(2, abxdVar);
                                                                    if (zL2) {
                                                                    }
                                                                }
                                                                throw new abzz().a();
                                                            }
                                                        }
                                                        abuy abuyVar3 = (abuy) abxdVarH;
                                                        acgh acghVar = new acgh();
                                                        acghVar.B(acgiVar2);
                                                        if ((acghVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                                            acghVar.y();
                                                        }
                                                        acgi acgiVar3 = (acgi) acghVar.b;
                                                        acgi acgiVar4 = acgi.a;
                                                        abuyVar3.getClass();
                                                        acgiVar3.e = abuyVar3;
                                                        acgiVar3.b |= 8;
                                                        return yqt.i((acgi) acghVar.v());
                                                    } catch (Exception e14) {
                                                        ((zdv) ((zdv) ((zdv) oiz.a.c()).p(e14)).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 139, "EncryptionUtil.java")).u("Unexpected error when trying to decrypt encrypted element.");
                                                        return ypv.a;
                                                    }
                                                }
                                            }), ((oiz) obj2).d));
                                            i4 = P;
                                        } catch (Exception e14) {
                                            e = e14;
                                            exc = e;
                                            i3 = P;
                                            ((zdv) ((zdv) ((zdv) oiz.a.c()).p(exc)).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 146, str2)).u("Unexpected error when trying to parse encrypted element, skipping element.");
                                            i4 = i3;
                                            i2 = i4;
                                            it2 = it4;
                                            acfzVar2 = acfzVar;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        P = 2;
                                        exc = e;
                                        i3 = P;
                                        ((zdv) ((zdv) ((zdv) oiz.a.c()).p(exc)).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", (char) 146, str2)).u("Unexpected error when trying to parse encrypted element, skipping element.");
                                        i4 = i3;
                                        i2 = i4;
                                        it2 = it4;
                                        acfzVar2 = acfzVar;
                                    }
                                    i2 = i4;
                                    it2 = it4;
                                    acfzVar2 = acfzVar;
                                } else {
                                    ((zdv) ((zdv) oiz.a.c()).q("com/google/android/libraries/geller/e2ee/EncryptionUtil", "decryptElements", 110, "EncryptionUtil.java")).u("Trying to decrypt Element with unexpected data type url, skipping element.");
                                    it2 = it2;
                                    i2 = 2;
                                }
                            }
                            throw new abzz().a();
                        }
                        arrayList.add(zxn.h(acfyVar2));
                    } else {
                        arrayList.add(zxn.h(acfyVar2));
                    }
                }
                final acfz acfzVar3 = acfzVar2;
                final Map map5 = map2;
                final Map map6 = map;
                final int i6 = i;
                final oir oirVar2 = oirVar;
                final okb okbVar2 = okbVar;
                final acfv acfvVar3 = acfvVar;
                zyd zydVarE = zxn.e(arrayList);
                yqi yqiVarA = wyo.a(new yqi() { // from class: oke
                    @Override // defpackage.yqi
                    public final Object apply(Object obj3) {
                        List list = (List) obj3;
                        acfz acfzVar4 = acfz.a;
                        acfw acfwVar = new acfw();
                        if ((acfwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acfwVar.y();
                        }
                        acfz acfzVar5 = (acfz) acfwVar.b;
                        abxs abxsVar2 = acfzVar5.b;
                        if (!abxsVar2.c()) {
                            int size = abxsVar2.size();
                            acfzVar5.b = abxsVar2.d(size + size);
                        }
                        abus.m(list, acfzVar5.b);
                        return (acfz) acfwVar.v();
                    }
                });
                ExecutorService executorService = olkVar.g;
                return zuz.h(zwx.u(zud.g(zuz.h(zwx.u(zuz.g(zydVarE, yqiVarA, executorService)), wyo.c(new zvi() { // from class: okt
                    @Override // defpackage.zvi
                    public final zyd a(Object obj3) {
                        olk olkVar2 = olkVar;
                        final oka okaVar = new oka(oms.b(olkVar2.b), olkVar2.c, olkVar2.d, new ojb(acfvVar3, (acfz) obj3), olkVar2.i, olkVar2.g);
                        final HashMap map7 = new HashMap();
                        acfz acfzVar4 = ((ojb) okaVar.c).b;
                        for (acfy acfyVar3 : acfzVar4.b) {
                            acgd acgdVarB3 = acgd.b(acfyVar3.d);
                            if (acgdVarB3 == null) {
                                acgdVarB3 = acgd.UNKNOWN;
                            }
                            achu achuVar = acfyVar3.e;
                            if (achuVar == null) {
                                achuVar = achu.a;
                            }
                            if ((achuVar.b & 1) != 0) {
                                if (achuVar.c) {
                                    map7.put(acgdVarB3, Status.OK);
                                } else {
                                    ((zdv) ((zdv) oka.a.d()).q("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "processResult", 105, "GellerBatchSyncResultWriter.java")).x("Upload failed for corpus:%s", acgdVarB3.name());
                                    okaVar.a(acgdVarB3).b().g(new oll("Failed to upload data"));
                                    map7.put(acgdVarB3, acfyVar3.b == 1 ? Status.fromCodeValue(((adci) acfyVar3.c).b) : Status.c);
                                    okaVar.f.d(acgdVarB3.name(), "UPLOAD_FAILURE");
                                }
                            }
                            if (acfyVar3.b == 1) {
                                ((zdv) ((zdv) oka.a.d()).q("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter", "processResult", 116, "GellerBatchSyncResultWriter.java")).I("There was an error when syncing corpus: %s. Error message: %s. Error code: %d.", acgdVarB3.name(), (acfyVar3.b == 1 ? (adci) acfyVar3.c : adci.a).c, Integer.valueOf((acfyVar3.b == 1 ? (adci) acfyVar3.c : adci.a).b));
                                omk omkVarA = okaVar.a(acgdVarB3);
                                int i7 = acfyVar3.b;
                                omkVarA.b().g(new oll((i7 == 1 ? (adci) acfyVar3.c : adci.a).c, new StatusException(Status.fromCodeValue((i7 == 1 ? (adci) acfyVar3.c : adci.a).b), null)));
                                map7.put(acgdVarB3, Status.fromCodeValue((acfyVar3.b == 1 ? (adci) acfyVar3.c : adci.a).b));
                                okaVar.f.d(acgdVarB3.name(), "UPLOAD_OR_DOWNLOAD_FAILURE");
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        final HashSet hashSet = new HashSet();
                        for (final acfy acfyVar4 : acfzVar4.b) {
                            final acgd acgdVarB4 = acgd.b(acfyVar4.d);
                            if (acgdVarB4 == null) {
                                acgdVarB4 = acgd.UNKNOWN;
                            }
                            arrayList3.add(zxn.l(wyo.b(new zvh() { // from class: ojt
                                @Override // defpackage.zvh
                                public final zyd a() {
                                    zyd zydVarG;
                                    final oka okaVar2 = okaVar;
                                    Geller geller = okaVar2.e;
                                    String str3 = okaVar2.g;
                                    final acgd acgdVar = acgdVarB4;
                                    if (oms.c(str3, acgdVar, geller)) {
                                        return zxy.a;
                                    }
                                    if (((zdd) oka.b).b.equals(acgdVar)) {
                                        int i8 = yyk.e;
                                        zydVarG = zuz.g(zwx.u(geller.g(str3, acgdVar, zcg.b)), wyo.a(new yqi() { // from class: ojo
                                            @Override // defpackage.yqi
                                            public final Object apply(Object obj4) {
                                                zdy zdyVar = oka.a;
                                                return null;
                                            }
                                        }), okaVar2.h);
                                    } else {
                                        zydVarG = zxy.a;
                                    }
                                    final Set set = hashSet;
                                    final acfy acfyVar5 = acfyVar4;
                                    wzx wzxVarG = wzx.g(zydVarG);
                                    zvi zviVar = new zvi() { // from class: ojk
                                        @Override // defpackage.zvi
                                        public final zyd a(Object obj4) {
                                            acfy acfyVar6 = acfyVar5;
                                            final achs achsVar2 = acfyVar6.b == 2 ? (achs) acfyVar6.c : achs.a;
                                            yrx yrxVar = yps.a;
                                            final yrn yrnVarC = yrn.c(yrxVar);
                                            final yrn yrnVar2 = new yrn(yrxVar);
                                            acgd acgdVarB5 = acgd.b(achsVar2.c);
                                            if (acgdVarB5 == null) {
                                                acgdVarB5 = acgd.UNKNOWN;
                                            }
                                            final acgd acgdVar2 = acgdVarB5;
                                            oka okaVar3 = okaVar2;
                                            final acgd acgdVar3 = acgdVar;
                                            final Geller geller2 = okaVar3.e;
                                            geller2.b(acgdVar2).n(acgdVar2);
                                            boolean z2 = geller2.j;
                                            yqw.M(true, "update() not allowed if Geller is read-only");
                                            final String str4 = okaVar3.g;
                                            return wzx.g(zxn.k(wyo.i(new Callable() { // from class: onk
                                                /* JADX WARN: Multi-variable type inference failed */
                                                /* JADX WARN: Type inference failed for: r11v0 */
                                                /* JADX WARN: Type inference failed for: r11v1, types: [abxd] */
                                                /* JADX WARN: Type inference failed for: r11v2 */
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    ?? r11;
                                                    int i9;
                                                    int iA;
                                                    Geller geller3 = geller2;
                                                    yrn yrnVar3 = yrnVar2;
                                                    String str5 = str4;
                                                    achs achsVar3 = achsVar2;
                                                    acgd acgdVar4 = acgdVar2;
                                                    yrn yrnVar4 = yrnVarC;
                                                    try {
                                                        yrnVar3.e();
                                                        long jA = geller3.a();
                                                        long jA2 = geller3.e.a(str5);
                                                        try {
                                                            i9 = achsVar3.memoizedSerializedSize;
                                                            r11 = -2147483648;
                                                        } catch (IOException e16) {
                                                            e = e16;
                                                            r11 = achsVar3;
                                                        }
                                                        try {
                                                            if ((i9 & Integer.MIN_VALUE) != 0) {
                                                                iA = abza.a.a(achsVar3.getClass()).a(achsVar3);
                                                                if (iA < 0) {
                                                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                                }
                                                            } else {
                                                                iA = i9 & Integer.MAX_VALUE;
                                                                if (iA == Integer.MAX_VALUE) {
                                                                    iA = abza.a.a(achsVar3.getClass()).a(achsVar3);
                                                                    if (iA < 0) {
                                                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                                                    }
                                                                    achsVar3.memoizedSerializedSize = (Integer.MIN_VALUE & achsVar3.memoizedSerializedSize) | iA;
                                                                }
                                                            }
                                                            byte[] bArr = new byte[iA];
                                                            boolean z3 = abvz.e;
                                                            abvw abvwVar = new abvw(bArr, 0, iA);
                                                            abza.a.a(achsVar3.getClass()).m(achsVar3, abwa.a(abvwVar));
                                                            abvwVar.K();
                                                            yzq yzqVarP = yzq.p(geller3.nativeUpdate(jA, jA2, bArr));
                                                            geller3.b(acgdVar4).l(acgdVar4, true, yrnVar3.a(TimeUnit.MILLISECONDS));
                                                            geller3.b(acgdVar4).m(acgdVar4, true, yrnVar4.a(TimeUnit.MILLISECONDS));
                                                            return yzqVarP;
                                                        } catch (IOException e17) {
                                                            e = e17;
                                                            throw new RuntimeException(a.C(r11, "byte array"), e);
                                                        }
                                                    } catch (Throwable th) {
                                                        geller3.b(acgdVar4).l(acgdVar4, false, yrnVar3.a(TimeUnit.MILLISECONDS));
                                                        geller3.b(acgdVar4).m(acgdVar4, false, yrnVar4.a(TimeUnit.MILLISECONDS));
                                                        throw th;
                                                    }
                                                }
                                            }), geller2.d)).h(new yqi() { // from class: ojq
                                                @Override // defpackage.yqi
                                                public final Object apply(Object obj5) {
                                                    yzq yzqVar = (yzq) obj5;
                                                    zdy zdyVar = oka.a;
                                                    acgdVar3.name();
                                                    return yzqVar;
                                                }
                                            }, okaVar3.i);
                                        }
                                    };
                                    ExecutorService executorService2 = okaVar2.i;
                                    return wzxVarG.i(zviVar, executorService2).i(new zvi() { // from class: ojr
                                        @Override // defpackage.zvi
                                        public final zyd a(Object obj4) {
                                            oka okaVar3 = okaVar2;
                                            acgd acgdVar2 = acgdVar;
                                            okaVar3.a(acgdVar2).c().i((Set) obj4);
                                            set.add(acgdVar2);
                                            return zxy.a;
                                        }
                                    }, executorService2).e(Exception.class, new zvi() { // from class: ojs
                                        @Override // defpackage.zvi
                                        public final zyd a(Object obj4) {
                                            Exception exc2 = (Exception) obj4;
                                            oka okaVar3 = okaVar2;
                                            acgd acgdVar2 = acgdVar;
                                            omk omkVarA2 = okaVar3.a(acgdVar2);
                                            omkVarA2.b().g(new oll("Failed to commit downloads to the database: ".concat(String.valueOf(exc2.getMessage())), exc2));
                                            okaVar3.f.d(acgdVar2.name(), "DOWNLOAD_COMMIT_FAILURE");
                                            return zxy.a;
                                        }
                                    }, executorService2);
                                }
                            }), okaVar.h));
                        }
                        zxj zxjVarA = zxn.a(arrayList3);
                        Callable callableI = wyo.i(new Callable() { // from class: oju
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                HashMap map8 = new HashMap();
                                oka okaVar2 = okaVar;
                                acfz acfzVar5 = ((ojb) okaVar2.c).b;
                                for (acfy acfyVar5 : acfzVar5.b) {
                                    if (acfyVar5.b == 2) {
                                        acgd acgdVarB5 = acgd.b(acfyVar5.d);
                                        if (acgdVarB5 == null) {
                                            acgdVarB5 = acgd.UNKNOWN;
                                        }
                                        map8.put(acgdVarB5, ((achs) acfyVar5.c).e);
                                    }
                                }
                                ont ontVar = okaVar2.f;
                                Set set = hashSet;
                                ontVar.a(set, map8);
                                HashMap map9 = new HashMap();
                                for (acfy acfyVar6 : acfzVar5.b) {
                                    if (acfyVar6.b == 2) {
                                        acgd acgdVarB6 = acgd.b(acfyVar6.d);
                                        if (acgdVarB6 == null) {
                                            acgdVarB6 = acgd.UNKNOWN;
                                        }
                                        map9.put(acgdVarB6, ((achs) acfyVar6.c).f);
                                    }
                                }
                                ontVar.c(set, map9);
                                return null;
                            }
                        });
                        ExecutorService executorService2 = okaVar.i;
                        return zuz.g(zuz.h(zwx.u(zxjVarA.a(callableI, executorService2)), wyo.c(new zvi() { // from class: ojx
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r17v1 */
                            /* JADX WARN: Type inference failed for: r17v2 */
                            /* JADX WARN: Type inference failed for: r17v3 */
                            @Override // defpackage.zvi
                            public final zyd a(Object obj4) {
                                ont ontVar;
                                acfv acfvVar4;
                                int i8;
                                char c;
                                boolean z2;
                                boolean z3;
                                ?? r17;
                                boolean z4;
                                int iA;
                                int iA2;
                                Map map8 = map7;
                                if (map8.isEmpty()) {
                                    return zxy.a;
                                }
                                final oka okaVar2 = okaVar;
                                Iterator it5 = map8.keySet().iterator();
                                while (true) {
                                    ojh ojhVar = okaVar2.c;
                                    ontVar = okaVar2.f;
                                    boolean zHasNext = it5.hasNext();
                                    acfvVar4 = ((ojb) ojhVar).a;
                                    i8 = 3;
                                    c = 2;
                                    z2 = true;
                                    z3 = false;
                                    if (!zHasNext) {
                                        break;
                                    }
                                    acgd acgdVar = (acgd) it5.next();
                                    otg otgVar = ((ono) ontVar).a;
                                    String strName = acgdVar.name();
                                    boolean zE = ((Status) map8.get(acgdVar)).e();
                                    achk achkVar = acfvVar4.e;
                                    if (achkVar == null) {
                                        achkVar = achk.a;
                                    }
                                    achm achmVarB = achm.b(achkVar.c);
                                    if (achmVarB == null) {
                                        achmVarB = achm.UNKNOWN_REQUEST_REASON;
                                    }
                                    oth othVar = (oth) otgVar;
                                    ((uqo) othVar.a.K.eV()).a(100L, othVar.b, othVar.c, strName, Boolean.valueOf(zE), achmVarB.name());
                                }
                                HashMap map9 = new HashMap();
                                HashMap map10 = new HashMap();
                                HashMap map11 = new HashMap();
                                HashMap map12 = new HashMap();
                                Map map13 = map8;
                                for (acfu acfuVar : acfvVar4.c) {
                                    char c2 = c;
                                    acgd acgdVarB5 = acgd.b(acfuVar.c);
                                    if (acgdVarB5 == null) {
                                        acgdVarB5 = acgd.UNKNOWN;
                                    }
                                    if (map13.containsKey(acgdVarB5) && ((Status) map13.get(acgdVarB5)).e()) {
                                        z4 = z2;
                                        r17 = z4;
                                    } else {
                                        r17 = z2;
                                        z4 = z3;
                                    }
                                    otg otgVar2 = ((ono) ontVar).a;
                                    String strName2 = acgdVarB5.name();
                                    boolean z5 = z3;
                                    Iterator it6 = acfuVar.f.iterator();
                                    while (it6.hasNext()) {
                                        int i9 = i8;
                                        acgi acgiVar2 = (acgi) it6.next();
                                        oth othVar2 = (oth) otgVar2;
                                        otf otfVar = othVar2.a;
                                        otg otgVar3 = otgVar2;
                                        double dA = othVar2.a(acgiVar2);
                                        String str3 = othVar2.b;
                                        String str4 = othVar2.c;
                                        uqq uqqVar = (uqq) otfVar.D.eV();
                                        Boolean boolValueOf = Boolean.valueOf(z4);
                                        Object[] objArr = new Object[4];
                                        objArr[z5 ? 1 : 0] = str3;
                                        objArr[r17] = str4;
                                        objArr[c2] = strName2;
                                        objArr[i9] = boolValueOf;
                                        uqqVar.b(dA, objArr);
                                        i8 = i9;
                                        otgVar2 = otgVar3;
                                        it6 = it6;
                                        ontVar = ontVar;
                                    }
                                    ont ontVar2 = ontVar;
                                    int i10 = i8;
                                    otg otgVar4 = otgVar2;
                                    String strName3 = acgdVarB5.name();
                                    Map map14 = map13;
                                    for (Iterator it7 = acfuVar.g.iterator(); it7.hasNext(); it7 = it7) {
                                        acgi acgiVar3 = (acgi) it7.next();
                                        oth othVar3 = (oth) otgVar4;
                                        otf otfVar2 = othVar3.a;
                                        String str5 = strName3;
                                        double dA2 = othVar3.a(acgiVar3);
                                        String str6 = othVar3.b;
                                        String str7 = othVar3.c;
                                        uqq uqqVar2 = (uqq) otfVar2.G.eV();
                                        Boolean boolValueOf2 = Boolean.valueOf(z4);
                                        Object[] objArr2 = new Object[4];
                                        objArr2[z5 ? 1 : 0] = str6;
                                        objArr2[r17] = str7;
                                        objArr2[c2] = str5;
                                        objArr2[i10] = boolValueOf2;
                                        uqqVar2.b(dA2, objArr2);
                                        map14 = map14;
                                        strName3 = str5;
                                    }
                                    Map map15 = map14;
                                    ono.e(map9, acgdVarB5, acfuVar.f.size());
                                    ono.e(map10, acgdVarB5, acfuVar.g.size());
                                    int i11 = z5 ? 1 : 0;
                                    for (acgi acgiVar4 : acfuVar.f) {
                                        int i12 = acgiVar4.memoizedSerializedSize;
                                        if ((i12 & Integer.MIN_VALUE) != 0) {
                                            iA2 = abza.a.a(acgiVar4.getClass()).a(acgiVar4);
                                            if (iA2 < 0) {
                                                throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                            }
                                        } else {
                                            iA2 = i12 & Integer.MAX_VALUE;
                                            if (iA2 == Integer.MAX_VALUE) {
                                                iA2 = abza.a.a(acgiVar4.getClass()).a(acgiVar4);
                                                if (iA2 < 0) {
                                                    throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                                                }
                                                acgiVar4.memoizedSerializedSize = (acgiVar4.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                                            } else {
                                                continue;
                                            }
                                        }
                                        i11 += iA2;
                                    }
                                    ono.e(map11, acgdVarB5, i11);
                                    int i13 = z5 ? 1 : 0;
                                    for (acgi acgiVar5 : acfuVar.g) {
                                        int i14 = acgiVar5.memoizedSerializedSize;
                                        if ((i14 & Integer.MIN_VALUE) != 0) {
                                            iA = abza.a.a(acgiVar5.getClass()).a(acgiVar5);
                                            if (iA < 0) {
                                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                            }
                                        } else {
                                            int iA3 = i14 & Integer.MAX_VALUE;
                                            if (iA3 == Integer.MAX_VALUE) {
                                                iA3 = abza.a.a(acgiVar5.getClass()).a(acgiVar5);
                                                if (iA3 < 0) {
                                                    throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                                                }
                                                acgiVar5.memoizedSerializedSize = (acgiVar5.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                                            }
                                            iA = iA3;
                                        }
                                        i13 += iA;
                                    }
                                    ono.e(map12, acgdVarB5, i13);
                                    c = c2;
                                    map13 = map15;
                                    z2 = r17;
                                    z3 = z5 ? 1 : 0;
                                    i8 = i10;
                                    ontVar = ontVar2;
                                }
                                ont ontVar3 = ontVar;
                                int i15 = i8;
                                char c3 = c;
                                boolean z6 = z2;
                                boolean z7 = z3;
                                Map map16 = map13;
                                Iterator it8 = map9.keySet().iterator();
                                while (it8.hasNext()) {
                                    acgd acgdVar2 = (acgd) it8.next();
                                    otg otgVar5 = ((ono) ontVar3).a;
                                    String strName4 = acgdVar2.name();
                                    double dLongValue = ((Long) map9.get(acgdVar2)).longValue();
                                    oth othVar4 = (oth) otgVar5;
                                    otf otfVar3 = othVar4.a;
                                    uqq uqqVar3 = (uqq) otfVar3.H.eV();
                                    String str8 = othVar4.b;
                                    String str9 = othVar4.c;
                                    Iterator it9 = it8;
                                    HashMap map17 = map9;
                                    Object[] objArr3 = new Object[i15];
                                    objArr3[z7 ? 1 : 0] = str8;
                                    objArr3[z6 ? 1 : 0] = str9;
                                    objArr3[c3] = strName4;
                                    uqqVar3.b(dLongValue * 100.0d, objArr3);
                                    String strName5 = acgdVar2.name();
                                    double dLongValue2 = ((Long) map11.get(acgdVar2)).longValue();
                                    uqq uqqVar4 = (uqq) otfVar3.Y.eV();
                                    Object[] objArr4 = new Object[3];
                                    objArr4[z7 ? 1 : 0] = str8;
                                    objArr4[z6 ? 1 : 0] = str9;
                                    objArr4[c3] = strName5;
                                    uqqVar4.b(dLongValue2, objArr4);
                                    it8 = it9;
                                    map9 = map17;
                                    i15 = 3;
                                }
                                for (acgd acgdVar3 : map10.keySet()) {
                                    otg otgVar6 = ((ono) ontVar3).a;
                                    String strName6 = acgdVar3.name();
                                    double dLongValue3 = ((Long) map10.get(acgdVar3)).longValue();
                                    oth othVar5 = (oth) otgVar6;
                                    otf otfVar4 = othVar5.a;
                                    uqq uqqVar5 = (uqq) otfVar4.I.eV();
                                    String str10 = othVar5.b;
                                    String str11 = othVar5.c;
                                    Object[] objArr5 = new Object[3];
                                    objArr5[z7 ? 1 : 0] = str10;
                                    objArr5[z6 ? 1 : 0] = str11;
                                    objArr5[c3] = strName6;
                                    uqqVar5.b(dLongValue3 * 100.0d, objArr5);
                                    String strName7 = acgdVar3.name();
                                    double dLongValue4 = ((Long) map12.get(acgdVar3)).longValue();
                                    uqq uqqVar6 = (uqq) otfVar4.Z.eV();
                                    Object[] objArr6 = new Object[3];
                                    objArr6[z7 ? 1 : 0] = str10;
                                    objArr6[z6 ? 1 : 0] = str11;
                                    objArr6[c3] = strName7;
                                    uqqVar6.b(dLongValue4, objArr6);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                for (final acfu acfuVar2 : acfvVar4.c) {
                                    final acgd acgdVarB6 = acgd.b(acfuVar2.c);
                                    if (acgdVarB6 == null) {
                                        acgdVarB6 = acgd.UNKNOWN;
                                    }
                                    if (map16.containsKey(acgdVarB6) && ((Status) map16.get(acgdVarB6)).e()) {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (final acgi acgiVar6 : acfuVar2.g) {
                                            Geller geller = okaVar2.e;
                                            if (geller.h.f) {
                                                String str12 = acgiVar6.d;
                                                aceu aceuVar = acgiVar6.c;
                                                if (aceuVar == null) {
                                                    aceuVar = aceu.a;
                                                }
                                                arrayList5.add(zxn.h(omw.c(str12, aceuVar.c)));
                                            } else {
                                                String str13 = okaVar2.g;
                                                acgd acgdVarB7 = acgd.b(acfuVar2.c);
                                                if (acgdVarB7 == null) {
                                                    acgdVarB7 = acgd.UNKNOWN;
                                                }
                                                String str14 = acgiVar6.d;
                                                aceu aceuVar2 = acgiVar6.c;
                                                if (aceuVar2 == null) {
                                                    aceuVar2 = aceu.a;
                                                }
                                                arrayList5.add(zuz.g(geller.g(str13, acgdVarB7, yyk.o(omw.c(str14, aceuVar2.c))), wyo.a(new yqi() { // from class: ojv
                                                    @Override // defpackage.yqi
                                                    public final Object apply(Object obj5) {
                                                        acgi acgiVar7 = acgiVar6;
                                                        String str15 = acgiVar7.d;
                                                        aceu aceuVar3 = acgiVar7.c;
                                                        if (aceuVar3 == null) {
                                                            aceuVar3 = aceu.a;
                                                        }
                                                        acfu acfuVar3 = acfuVar2;
                                                        long j = aceuVar3.c;
                                                        acgd acgdVarB8 = acgd.b(acfuVar3.c);
                                                        if (acgdVarB8 == null) {
                                                            acgdVarB8 = acgd.UNKNOWN;
                                                        }
                                                        acgdVarB8.name();
                                                        String str16 = acgiVar7.d;
                                                        aceu aceuVar4 = acgiVar7.c;
                                                        if (aceuVar4 == null) {
                                                            aceuVar4 = aceu.a;
                                                        }
                                                        return omw.c(str16, aceuVar4.c);
                                                    }
                                                }), okaVar2.h));
                                            }
                                        }
                                        zwx zwxVarU = zwx.u(zxn.m(arrayList5));
                                        yqi yqiVarA2 = wyo.a(new yqi() { // from class: ojw
                                            @Override // defpackage.yqi
                                            public final Object apply(Object obj5) {
                                                ArrayList arrayList6 = new ArrayList();
                                                for (omw omwVar : (List) obj5) {
                                                    if (omwVar != null) {
                                                        arrayList6.add(omwVar);
                                                    }
                                                }
                                                acgd acgdVar4 = acgdVarB6;
                                                oka okaVar3 = okaVar2;
                                                okaVar3.e.j(okaVar3.g, acgdVar4, oka.b(3, arrayList6));
                                                return null;
                                            }
                                        });
                                        ExecutorService executorService3 = okaVar2.h;
                                        zyd zydVarG = zuz.g(zwx.u(zuz.g(zwxVarU, yqiVarA2, executorService3)), wyo.a(new yqi() { // from class: ojz
                                            @Override // defpackage.yqi
                                            public final Object apply(Object obj5) {
                                                ArrayList arrayList6 = new ArrayList();
                                                ArrayList arrayList7 = new ArrayList();
                                                acfu acfuVar3 = acfuVar2;
                                                for (acgi acgiVar7 : acfuVar3.f) {
                                                    String str15 = acgiVar7.d;
                                                    aceu aceuVar3 = acgiVar7.c;
                                                    if (aceuVar3 == null) {
                                                        aceuVar3 = aceu.a;
                                                    }
                                                    arrayList6.add(omw.c(str15, aceuVar3.c));
                                                    arrayList7.add(acgiVar7.d);
                                                }
                                                acgd acgdVar4 = acgdVarB6;
                                                oka okaVar3 = okaVar2;
                                                okaVar3.e.j(okaVar3.g, acgdVar4, oka.b(1, arrayList6));
                                                acgd acgdVarB8 = acgd.b(acfuVar3.c);
                                                if (acgdVarB8 == null) {
                                                    acgdVarB8 = acgd.UNKNOWN;
                                                }
                                                acgdVarB8.name();
                                                return arrayList7;
                                            }
                                        }), executorService3);
                                        yqi yqiVarA3 = wyo.a(new yqi() { // from class: ojl
                                            @Override // defpackage.yqi
                                            public final Object apply(Object obj5) {
                                                okaVar2.a(acgdVarB6).d().i((List) obj5);
                                                return true;
                                            }
                                        });
                                        ExecutorService executorService4 = okaVar2.i;
                                        arrayList4.add(zud.g(zuz.g(zydVarG, yqiVarA3, executorService4), Exception.class, wyo.a(new yqi() { // from class: ojm
                                            @Override // defpackage.yqi
                                            public final Object apply(Object obj5) {
                                                Exception exc2 = (Exception) obj5;
                                                oka okaVar3 = okaVar2;
                                                acgd acgdVar4 = acgdVarB6;
                                                omk omkVarA2 = okaVar3.a(acgdVar4);
                                                omkVarA2.b().g(new oll("Failed to commit uploads to the database: ".concat(String.valueOf(exc2.getMessage())), exc2));
                                                okaVar3.f.d(acgdVar4.name(), "UPLOAD_COMMIT_FAILURE");
                                                return false;
                                            }
                                        }), executorService4));
                                    }
                                }
                                return zxn.a(arrayList4).a(wyo.i(new Callable() { // from class: ojn
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        zdy zdyVar = oka.a;
                                        return null;
                                    }
                                }), okaVar2.i);
                            }
                        }), executorService2), new yqi() { // from class: ojy
                            @Override // defpackage.yqi
                            public final Object apply(Object obj4) {
                                HashMap map8 = new HashMap();
                                for (Map.Entry entry : okaVar.d.entrySet()) {
                                    map8.put((acgd) entry.getKey(), ((omk) entry.getValue()).a());
                                }
                                return map8;
                            }
                        }, executorService2);
                    }
                }), executorService), Exception.class, wyo.a(new yqi() { // from class: oku
                    @Override // defpackage.yqi
                    public final Object apply(Object obj3) {
                        Exception exc2 = (Exception) obj3;
                        int i7 = yyk.e;
                        yyf yyfVar = new yyf(4);
                        Iterator it5 = acfvVar3.c.iterator();
                        while (it5.hasNext()) {
                            acgd acgdVarB3 = acgd.b(((acfu) it5.next()).c);
                            if (acgdVarB3 == null) {
                                acgdVarB3 = acgd.UNKNOWN;
                            }
                            yyfVar.g(acgdVarB3);
                        }
                        return olkVar.c(yyfVar.f(), exc2, 12, "Failed to decrypt the elements of the corpora requiring e2ee: ".concat(String.valueOf(exc2.getMessage())));
                    }
                }), executorService)), wyo.c(new zvi() { // from class: okv
                    @Override // defpackage.zvi
                    public final zyd a(Object obj3) {
                        final int i7;
                        final olk olkVar2 = olkVar;
                        final Map map7 = (Map) obj3;
                        long jA = olkVar2.k.a(TimeUnit.MILLISECONDS);
                        for (Map.Entry entry : map7.entrySet()) {
                            ont ontVar = olkVar2.d;
                            ((uqq) ((oth) ((ono) ontVar).a).a.M.eV()).b(jA, ((acgd) entry.getKey()).name(), Boolean.valueOf(((oml) entry.getValue()).b().isEmpty()));
                        }
                        final acfz acfzVar4 = acfzVar3;
                        final TreeSet treeSet = new TreeSet();
                        final HashMap map8 = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it5 = acfzVar4.b.iterator();
                        while (true) {
                            i7 = i6;
                            if (!it5.hasNext()) {
                                break;
                            }
                            acfy acfyVar3 = (acfy) it5.next();
                            acgd acgdVarB3 = acgd.b(acfyVar3.d);
                            if (acgdVarB3 == null) {
                                acgdVarB3 = acgd.UNKNOWN;
                            }
                            if (map7.containsKey(acgdVarB3) && ((oml) map7.get(acgdVarB3)).b().isEmpty()) {
                                treeSet.add(acgdVarB3);
                                if (((acfyVar3.b == 2 ? (achs) acfyVar3.c : achs.a).b & 32) != 0) {
                                    arrayList3.add((acfyVar3.b == 2 ? (achs) acfyVar3.c : achs.a).g);
                                }
                                if (!(acfyVar3.b == 2 ? (achs) acfyVar3.c : achs.a).d.isEmpty() && i7 != 3) {
                                    acfu acfuVar = acfu.a;
                                    acft acftVar = new acft();
                                    if ((acftVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        acftVar.y();
                                    }
                                    acfu acfuVar2 = (acfu) acftVar.b;
                                    acfuVar2.c = acgdVarB3.dE;
                                    acfuVar2.b |= 1;
                                    String str3 = (acfyVar3.b == 2 ? (achs) acfyVar3.c : achs.a).d;
                                    if ((acftVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                        acftVar.y();
                                    }
                                    acfu acfuVar3 = (acfu) acftVar.b;
                                    str3.getClass();
                                    acfuVar3.b |= 4;
                                    acfuVar3.e = str3;
                                    map8.put(acgdVarB3, (acfu) acftVar.v());
                                }
                            }
                        }
                        final acfv acfvVar4 = acfvVar3;
                        achk achkVar = acfvVar4.e;
                        if (achkVar == null) {
                            achkVar = achk.a;
                        }
                        final achj achjVar = new achj();
                        achjVar.B(achkVar);
                        abxc abxcVar = achw.b;
                        achjVar.e(abxcVar);
                        achv achvVar = new achv();
                        achvVar.a(arrayList3);
                        achjVar.f(abxcVar, (achw) achvVar.v());
                        achm achmVarB = achm.b(((achk) achjVar.b).c);
                        if (achmVarB == null) {
                            achmVarB = achm.UNKNOWN_REQUEST_REASON;
                        }
                        final Map map9 = map4;
                        final Map map10 = map5;
                        final Map map11 = map6;
                        final oir oirVar3 = oirVar2;
                        final okb okbVar3 = okbVar2;
                        zwx zwxVarU = zwx.u(zuz.g(zwx.u(olkVar2.d(treeSet, oirVar3, i7, achmVarB)), wyo.a(new yqi() { // from class: okn
                            @Override // defpackage.yqi
                            public final Object apply(Object obj4) {
                                yyr yyrVar = (yyr) obj4;
                                achk achkVar2 = (achk) achjVar.v();
                                olk olkVar3 = olkVar2;
                                int i8 = i7;
                                return olkVar3.f(treeSet, achkVar2, i8, map8, yyrVar, yqt.i(acfvVar4), yqt.i(map7));
                            }
                        }), olkVar2.h));
                        zvi zviVarC = wyo.c(new zvi() { // from class: olg
                            @Override // defpackage.zvi
                            public final zyd a(Object obj4) {
                                Map map12;
                                Map map13;
                                olk olkVar3;
                                acfv acfvVar5 = (acfv) obj4;
                                Iterator it6 = acfzVar4.b.iterator();
                                while (true) {
                                    map12 = map10;
                                    map13 = map11;
                                    olkVar3 = olkVar2;
                                    if (!it6.hasNext()) {
                                        break;
                                    }
                                    acfy acfyVar4 = (acfy) it6.next();
                                    Map map14 = olkVar3.j;
                                    acgd acgdVarB4 = acgd.b(acfyVar4.d);
                                    if (acgdVarB4 == null) {
                                        acgdVarB4 = acgd.UNKNOWN;
                                    }
                                    if (map14.containsKey(acgdVarB4)) {
                                        acgd acgdVarB5 = acgd.b(acfyVar4.d);
                                        if (acgdVarB5 == null) {
                                            acgdVarB5 = acgd.UNKNOWN;
                                        }
                                        if (acfyVar4.b == 1) {
                                            map13.remove(acgdVarB5);
                                        } else {
                                            List arrayList4 = map13.containsKey(acgdVarB5) ? (List) map13.get(acgdVarB5) : new ArrayList();
                                            arrayList4.addAll((acfyVar4.b == 2 ? (achs) acfyVar4.c : achs.a).e);
                                            map13.put(acgdVarB5, arrayList4);
                                            List arrayList5 = map12.containsKey(acgdVarB5) ? (List) map12.get(acgdVarB5) : new ArrayList();
                                            arrayList5.addAll((acfyVar4.b == 2 ? (achs) acfyVar4.c : achs.a).f);
                                            map12.put(acgdVarB5, arrayList5);
                                        }
                                    }
                                }
                                final Map map15 = map7;
                                if (acfvVar5.c.size() == 0) {
                                    return zxn.h(map15);
                                }
                                Map map16 = map9;
                                return zuz.g(olkVar3.e(okbVar3, oirVar3, i7, acfvVar5, map13, map12, map16), wyo.a(new yqi() { // from class: old
                                    @Override // defpackage.yqi
                                    public final Object apply(Object obj5) {
                                        Map map17 = (Map) obj5;
                                        HashMap map18 = new HashMap();
                                        Map map19 = map15;
                                        for (acgd acgdVar : map19.keySet()) {
                                            map18.put(acgdVar, map17.containsKey(acgdVar) ? ((oml) map19.get(acgdVar)).f((oml) map17.get(acgdVar)) : (oml) map19.get(acgdVar));
                                        }
                                        return map18;
                                    }
                                }), olkVar3.h);
                            }
                        });
                        ExecutorService executorService2 = olkVar2.g;
                        return zud.g(zuz.h(zwxVarU, zviVarC, executorService2), Exception.class, wyo.a(new yqi() { // from class: olh
                            @Override // defpackage.yqi
                            public final Object apply(Object obj4) {
                                Exception exc2 = (Exception) obj4;
                                TreeSet treeSet2 = new TreeSet();
                                Iterator it6 = acfzVar4.b.iterator();
                                while (it6.hasNext()) {
                                    acgd acgdVarB4 = acgd.b(((acfy) it6.next()).d);
                                    if (acgdVarB4 == null) {
                                        acgdVarB4 = acgd.UNKNOWN;
                                    }
                                    Map map12 = map7;
                                    if (map12.containsKey(acgdVarB4) && ((oml) map12.get(acgdVarB4)).b().isEmpty()) {
                                        treeSet2.add(acgdVarB4);
                                    }
                                }
                                return olkVar2.c(treeSet2, exc2, 13, "Failed to construct follow up BatchSyncRequests: ".concat(String.valueOf(exc2.getMessage())));
                            }
                        }), executorService2);
                    }
                }), olkVar.h);
            }
        }), this.h).c(Exception.class, new yqi() { // from class: oky
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                int i2 = yyk.e;
                yyf yyfVar = new yyf(4);
                Iterator it = acfvVar.c.iterator();
                while (it.hasNext()) {
                    acgd acgdVarB = acgd.b(((acfu) it.next()).c);
                    if (acgdVarB == null) {
                        acgdVarB = acgd.UNKNOWN;
                    }
                    yyfVar.g(acgdVarB);
                }
                return this.a.c(yyfVar.f(), exc, 11, "Geller batch sync rpc call failed: ".concat(String.valueOf(exc.getMessage())));
            }
        }, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02df  */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.acfv f(java.util.Set r21, defpackage.achk r22, int r23, java.util.Map r24, java.util.Map r25, defpackage.yqt r26, defpackage.yqt r27) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.olk.f(java.util.Set, achk, int, java.util.Map, java.util.Map, yqt, yqt):acfv");
    }
}
