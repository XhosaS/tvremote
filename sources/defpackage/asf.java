package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class asf implements byo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ asf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [byo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [cov, java.lang.Object] */
    @Override // defpackage.byo
    public final Object aL() {
        Collection collection;
        int i = 1;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                return Long.valueOf(Double.valueOf((String) ((asg) this.a).a.aL()).longValue());
            case 1:
                return ((Context) this.a).getSharedPreferences("primes", 0);
            case 2:
                return (Boolean) this.a.a();
            case 3:
                return this.a;
            case 4:
                if (Build.VERSION.SDK_INT < 30) {
                    return bxw.a;
                }
                Context context = (Context) this.a;
                try {
                    return byg.g(context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName());
                } catch (PackageManager.NameNotFoundException unused) {
                    return bxw.a;
                }
            case 5:
                Comparator comparatorComparing = Comparator$CC.comparing(new aro(6), Comparator$CC.reverseOrder());
                Iterable iterable = (Iterable) this.a.a();
                int i2 = bzs.d;
                comparatorComparing.getClass();
                if (iterable instanceof Collection) {
                    collection = (Collection) iterable;
                } else {
                    Iterator it = iterable.iterator();
                    ArrayList arrayList = new ArrayList();
                    biu.i(arrayList, it);
                    collection = arrayList;
                }
                Object[] array = collection.toArray();
                bjz.h(array);
                Arrays.sort(array, comparatorComparing);
                return bzs.k(array);
            case 6:
                return Long.valueOf(((aui) this.a).e.a().getTotalSpace() / 1024);
            case 7:
                return ((aur) this.a).a();
            case 8:
                Object obj = this.a;
                int i3 = awg.a;
                long j = awc.a;
                if (j == 0) {
                    synchronized (awc.class) {
                        j = awc.a;
                        if (j == 0) {
                            float f = 60.0f;
                            float fFloatValue = ((Float) awc.a((Context) obj).d(Float.valueOf(60.0f))).floatValue();
                            if (fFloatValue >= 1.0f) {
                                f = fFloatValue;
                            }
                            long jCeil = (long) Math.ceil(1.0E9d / f);
                            awc.a = jCeil;
                            j = jCeil;
                        }
                    }
                }
                return Long.valueOf(j);
            case 9:
                return this.a.a();
            case 10:
                return atb.a(((axq) this.a).b, "getMemoryUsageMetric");
            case 11:
                return (SharedPreferences) ((byi) this.a).a;
            case 12:
                return Boolean.valueOf(cqz.a.aL().b((Context) this.a));
            case 13:
                Object obj2 = bav.a;
                bat batVar = new bat();
                batVar.a = (Context) this.a;
                Context context2 = batVar.a;
                context2.getClass();
                if (batVar.b == null) {
                    batVar.b = bav.c;
                }
                if (batVar.c == null) {
                    batVar.c = bit.k(new asf(context2, 14));
                }
                if (batVar.d == null) {
                    batVar.d = new asf(batVar, 17);
                }
                if (batVar.e == null) {
                    Context context3 = batVar.a;
                    ArrayList arrayList2 = new ArrayList();
                    Collections.addAll(arrayList2, new beo(new asv(context3, (byte[]) null)), new ber());
                    batVar.e = bit.k(new asf(arrayList2, 15));
                }
                if (batVar.f == null) {
                    batVar.f = new asf(batVar, 18);
                }
                return new bav(batVar.a, batVar.b, batVar.c, batVar.d, batVar.e, batVar.f);
            case 14:
                Object obj3 = bav.a;
                return new asv(new alh((Context) this.a), (byte[]) null);
            case 15:
                Object obj4 = bav.a;
                return new bzt((List) this.a);
            case 16:
                Object obj5 = bav.a;
                return (bda) ((byi) this.a.aL()).a;
            case 17:
                return byg.h(new bda(((bat) this.a).b));
            case 18:
                Context context4 = ((bat) this.a).a;
                Object obj6 = bav.a;
                try {
                    return byg.h(context4.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                } catch (PackageManager.NameNotFoundException unused2) {
                    return bxw.a;
                }
            case 19:
                baz bazVar = bba.a;
                return bap.a((Context) this.a);
            default:
                Object obj7 = this.a;
                bdp bdpVar = (bdp) obj7;
                cjd cjdVar = (cjd) bdpVar.e.aL();
                cjdVar.getClass();
                asv asvVar = (asv) bdpVar.d.aL();
                asvVar.getClass();
                ahq ahqVar = new ahq();
                ahqVar.a = new ald(i);
                ahqVar.b = new aes[]{aku.i};
                ahqVar.b();
                cja cjaVarH = chk.h(cgp.h(cit.x(asv.e(((agb) asvVar.a).c(ahqVar.a()))), bbh.class, new ata(10), cjdVar), new adz(obj7, 9), cjdVar);
                cjaVarH.m(new ama(cjaVarH, 19, bArr), cjdVar);
                return cjaVarH;
        }
    }
}
