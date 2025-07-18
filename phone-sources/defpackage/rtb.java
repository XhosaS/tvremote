package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rtb implements ttm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rtb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, ttm] */
    @Override // defpackage.ttm
    public final Object get() {
        int i = 5;
        switch (this.b) {
            case 0:
                return rpd.a(((rtd) this.a).b, "getMemoryUsageMetric");
            case 1:
                return this.a.b();
            case 2:
                return Boolean.valueOf(xov.a.get().b((Context) this.a));
            case 3:
                Context context = rwv.a;
                sjo sjoVar = new sjo();
                sjoVar.e = this.a;
                Object obj = sjoVar.e;
                obj.getClass();
                if (sjoVar.a == null) {
                    sjoVar.a = rwv.b;
                }
                if (sjoVar.f == null) {
                    sjoVar.f = sij.l(new rtb(obj, 4));
                }
                if (sjoVar.d == null) {
                    sjoVar.d = new rtb(sjoVar, 7);
                }
                if (sjoVar.c == null) {
                    Object obj2 = sjoVar.e;
                    ArrayList arrayList = new ArrayList();
                    Collections.addAll(arrayList, new sjr(new upc((Context) obj2)), new sju(new ska()));
                    sjoVar.c = sij.l(new rtb(arrayList, i));
                }
                if (sjoVar.b == null) {
                    sjoVar.b = new rtb(sjoVar, 8);
                }
                return new rwv((Context) sjoVar.e, sjoVar.a, sjoVar.f, sjoVar.d, sjoVar.c, sjoVar.b);
            case 4:
                Context context2 = rwv.a;
                jzs jzsVar = omg.a;
                return new ulp(new omi((Context) this.a), (byte[]) null);
            case 5:
                Context context3 = rwv.a;
                return new aafi((List) this.a);
            case 6:
                Context context4 = rwv.a;
                return (rza) ((ttd) this.a.get()).a;
            case 7:
                return tst.i(new rza(((sjo) this.a).a));
            case 8:
                Object obj3 = ((sjo) this.a).e;
                Context context5 = rwv.a;
                try {
                    return tst.i(((Context) obj3).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (PackageManager.NameNotFoundException unused) {
                    return trk.a;
                }
            case 9:
                rwz rwzVar = rxa.a;
                return rwr.a((Context) this.a);
            case 10:
                Object obj4 = this.a;
                rzk rzkVar = (rzk) obj4;
                uht uhtVar = (uht) rzkVar.e.get();
                uhtVar.getClass();
                ulp ulpVar = (ulp) rzkVar.d.get();
                ulpVar.getClass();
                oaf oafVar = new oaf();
                oafVar.a = new nku(6);
                oafVar.b = new nvg[]{olz.i};
                oafVar.b();
                int i2 = 17;
                uhp uhpVarI = ufn.i(ues.i(uhi.v(ulp.aE(((nwq) ulpVar.a).r(oafVar.a()))), rxh.class, new rke(i2), uhtVar), new pgc(obj4, 16), uhtVar);
                uhpVarI.c(new rtr(uhpVarI, i2), uhtVar);
                return uhpVarI;
            case 11:
                uht uhtVar2 = (uht) this.a.get();
                uhtVar2.getClass();
                return uhtVar2.schedule(new oym(5), 10000L, TimeUnit.MILLISECONDS);
            case 12:
                Intent intent = new Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService");
                rzr rzrVar = (rzr) this.a;
                while (true) {
                    ServiceInfo serviceInfo = null;
                    for (ResolveInfo resolveInfo : ((PackageManager) rzrVar.f.c).queryIntentServices(intent.setPackage(rzrVar.a), 787072)) {
                        if (serviceInfo == null) {
                            if (resolveInfo.serviceInfo == null || resolveInfo.serviceInfo.metaData == null || !"com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(resolveInfo.serviceInfo.name)) {
                                break;
                            }
                            serviceInfo = resolveInfo.serviceInfo;
                        }
                    }
                    if (serviceInfo == null) {
                        return ImmutableMap.of();
                    }
                    ir irVar = new ir();
                    ir irVar2 = new ir();
                    Bundle bundle = serviceInfo.metaData;
                    for (String str : bundle.keySet()) {
                        boolean zStartsWith = str.startsWith("com.google.android.gms.phenotype.registration.binarypb:");
                        boolean zStartsWith2 = str.startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
                        if (zStartsWith || zStartsWith2) {
                            int i3 = bundle.getInt(str, 0);
                            if (i3 != 0) {
                                String str2 = (String) Iterables.get(uof.g(':').b(str), 1);
                                if (zStartsWith) {
                                    irVar.put(str2, Integer.valueOf(i3));
                                } else {
                                    irVar2.put(str2, Integer.valueOf(i3));
                                }
                            }
                        }
                    }
                    ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(irVar.d);
                    for (Map.Entry entry : irVar.entrySet()) {
                        String str3 = (String) entry.getKey();
                        builderBuilderWithExpectedSize.put(str3, new rzq(rzrVar, str3, ((Integer) entry.getValue()).intValue(), ((Integer) irVar2.getOrDefault(str3, 0)).intValue()));
                    }
                    return builderBuilderWithExpectedSize.buildKeepingLast();
                }
                break;
            default:
                return ((sea) this.a).h;
        }
    }
}
