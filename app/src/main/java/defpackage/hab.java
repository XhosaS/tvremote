package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hab implements Iterable {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/packagemanager/PackageCache");
    public static final Intent b = new Intent("com.google.assistant.DATA_SHARING_CONSENT");
    public static final Intent c;
    public static final Intent d;
    public static final Intent e;
    private static final IntentFilter n;
    private static final List o;
    private static final List p;
    public final fiu f;
    public final ahbt g;
    public final gph h;
    public final PackageManager i;
    public Map j;
    public List k;
    public List l;
    public final List m;
    private final Context q;
    private final agte r;

    static {
        Intent intentAddCategory = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME");
        intentAddCategory.getClass();
        c = intentAddCategory;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
        intentFilter.addDataScheme("package");
        n = intentFilter;
        Intent intentAddCategory2 = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LEANBACK_LAUNCHER");
        intentAddCategory2.getClass();
        d = intentAddCategory2;
        Intent intentAddCategory3 = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LEANBACK_SETTINGS");
        intentAddCategory3.getClass();
        e = intentAddCategory3;
        o = agqq.d("com.google.android.apps.tv.dreamx", "com.google.android.gms", "com.google.android.apps.tv.launcherx", "com.google.android.youtube.tv");
        p = agqq.d("com.google.android.gms", "com.google.android.youtube.tv");
    }

    public hab(fiu fiuVar, Context context, agte agteVar, ahbt ahbtVar, gph gphVar, PackageManager packageManager) {
        fiuVar.getClass();
        context.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        this.f = fiuVar;
        this.q = context;
        this.r = agteVar;
        this.g = ahbtVar;
        this.h = gphVar;
        this.i = packageManager;
        this.j = agre.a;
        agrd agrdVar = agrd.a;
        this.k = agrdVar;
        this.l = agrdVar;
        this.m = new ArrayList();
    }

    public final gzs a(String str) {
        str.getClass();
        return (gzs) this.j.get(str);
    }

    public final gzs b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfoA = had.a(packageManager, str);
            ApplicationInfo applicationInfo = packageInfoA.applicationInfo;
            Boolean boolValueOf = applicationInfo != null ? Boolean.valueOf(applicationInfo.enabled) : null;
            if (boolValueOf == null) {
                boolValueOf = false;
            }
            boolean zBooleanValue = boolValueOf.booleanValue();
            long longVersionCode = packageInfoA.getLongVersionCode();
            String str2 = packageInfoA.packageName;
            str2.getClass();
            return new gzs(zBooleanValue, longVersionCode, str2, packageInfoA.versionCode, packageInfoA.versionName);
        } catch (PackageManager.NameNotFoundException e2) {
            ((zdv) ((zdv) a.b()).p(e2).q("com/google/android/apps/tvsearch/platform/packagemanager/PackageCache", "getAppInfo", 180, "PackageCache.kt")).x("Queried package not found: %s", str);
            return null;
        }
    }

    public final Object c(Intent intent, agsw agswVar) throws Throwable {
        Object objA = ahal.a(this.r, new gzx(intent, this, null), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.gzy
            if (r0 == 0) goto L13
            r0 = r9
            gzy r0 = (defpackage.gzy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gzy r0 = new gzy
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.agpl.b(r9)
            goto L55
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L30:
            defpackage.agpl.b(r9)
            zdy r9 = defpackage.hab.a
            zeo r9 = r9.b()
            r2 = 77
            java.lang.String r5 = "PackageCache.kt"
            java.lang.String r6 = "com/google/android/apps/tvsearch/platform/packagemanager/PackageCache"
            java.lang.String r7 = "init$java_com_google_android_apps_tvsearch_platform_packagemanager_package_cache"
            zeo r9 = r9.q(r6, r7, r2, r5)
            zdv r9 = (defpackage.zdv) r9
            java.lang.String r2 = "Initializing package cache"
            r9.u(r2)
            r0.c = r4
            java.lang.Object r9 = r8.c(r3, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            android.content.Context r9 = r8.q
            haa r0 = new haa
            r0.<init>(r8)
            android.content.IntentFilter r1 = defpackage.hab.n
            r2 = 2
            defpackage.abs.c(r9, r0, r1, r3, r2)
            agpu r9 = defpackage.agpu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hab.d(agsw):java.lang.Object");
    }

    public final List e() {
        gph gphVar = gph.a;
        return this.h.ordinal() != 0 ? p : o;
    }

    public final List f(Intent intent) {
        PackageManager packageManager = this.i;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.packageName;
            str.getClass();
            gzs gzsVarB = b(packageManager, str);
            if (gzsVarB != null) {
                arrayList.add(gzsVarB);
            }
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/platform/packagemanager/PackageCache", "queryApps", 156, "PackageCache.kt")).F("Apps for %s: %s", intent, arrayList);
        return arrayList;
    }

    public final void g(gzv gzvVar) {
        gzvVar.getClass();
        this.m.add(gzvVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.j.values().iterator();
    }
}
