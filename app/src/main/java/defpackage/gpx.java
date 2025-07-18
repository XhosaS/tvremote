package defpackage;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PathPermission;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpx implements jbd {
    public static final IntentFilter a;
    private static final zdy f = zdy.h("com/google/android/apps/tvsearch/ondevice/sources/SystemSearchableSources");
    public final Context b;
    public final ahbt c;
    public final AtomicBoolean d;
    public ahdl e;
    private final fiu g;
    private final agow h;
    private final PackageManager i;
    private final agow j;
    private final agow k;
    private final List l;
    private final agpc m;
    private final eul n;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.search.action.SEARCHABLES_CHANGED");
        intentFilter.addAction("android.search.action.SETTINGS_CHANGED");
        a = intentFilter;
    }

    public gpx(fiu fiuVar, Context context, ahbt ahbtVar, agow agowVar, PackageManager packageManager, agow agowVar2, eul eulVar, agow agowVar3) {
        fiuVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        agowVar.getClass();
        agowVar2.getClass();
        eulVar.getClass();
        agowVar3.getClass();
        this.g = fiuVar;
        this.b = context;
        this.c = ahbtVar;
        this.h = agowVar;
        this.i = packageManager;
        this.j = agowVar2;
        this.n = eulVar;
        this.k = agowVar3;
        this.d = new AtomicBoolean();
        this.l = new ArrayList();
        this.m = new agpn(new agum() { // from class: gpp
            @Override // defpackage.agum
            public final Object a() {
                return new gpu(this.a);
            }
        });
    }

    public final gpu a() {
        return (gpu) this.m.a();
    }

    @Override // defpackage.jbd
    public final Object b(agsw agswVar) {
        if (((Boolean) this.k.a()).booleanValue() || !((Boolean) this.h.a()).booleanValue()) {
            return agpu.a;
        }
        if (!this.d.getAndSet(true)) {
            abs.c(this.b, a(), a, null, 2);
        }
        this.e = ahal.e(this.c, null, 0, new gpw(this, null), 3);
        return agpu.a;
    }

    @Override // defpackage.jbj
    public final List c() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r8.m(r7, r0) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [fiu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.List r7, defpackage.agsw r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.gpv
            if (r0 == 0) goto L13
            r0 = r8
            gpv r0 = (defpackage.gpv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gpv r0 = new gpv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r8)
            goto L96
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.a
            defpackage.agpl.b(r8)
            goto L88
        L38:
            defpackage.agpl.b(r8)
            r0.a = r7
            r0.d = r4
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r7.iterator()
        L48:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r2.next()
            jba r4 = (defpackage.jba) r4
            java.lang.String r4 = r4.i()
            r8.add(r4)
            goto L48
        L5c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L65:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r8.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L65
            r2.add(r4)
            goto L65
        L7c:
            fiu r8 = r6.g
            java.lang.Object r8 = r8.n(r2, r0)
            if (r8 == r1) goto L86
            agpu r8 = defpackage.agpu.a
        L86:
            if (r8 == r1) goto L99
        L88:
            fiu r8 = r6.g
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r7 = r8.m(r7, r0)
            if (r7 != r1) goto L96
            goto L99
        L96:
            agpu r7 = defpackage.agpu.a
            return r7
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpx.d(java.util.List, agsw):java.lang.Object");
    }

    public final List e() {
        Uri uriBuild;
        zdy zdyVar = f;
        ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/ondevice/sources/SystemSearchableSources", "createSources", 177, "SystemSearchableSources.kt")).u("createSources");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        agow agowVar = this.j;
        if (((List) agowVar.a()).isEmpty()) {
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/ondevice/sources/SystemSearchableSources", "createSources", 184, "SystemSearchableSources.kt")).u("No searchable providers found.");
            return arrayList;
        }
        for (SearchableInfo searchableInfo : (List) agowVar.a()) {
            gpo gpoVar = null;
            try {
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                String strFlattenToShortString = searchActivity.flattenToShortString();
                strFlattenToShortString.getClass();
                String suggestAuthority = searchableInfo.getSuggestAuthority();
                if (suggestAuthority == null) {
                    uriBuild = null;
                } else {
                    Uri.Builder builderAuthority = new Uri.Builder().scheme("content").authority(suggestAuthority);
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        builderAuthority.appendEncodedPath(suggestPath);
                    }
                    builderAuthority.appendPath("search_suggest_query");
                    uriBuild = builderAuthority.build();
                }
                if (uriBuild != null) {
                    String authority = uriBuild.getAuthority();
                    ProviderInfo providerInfoResolveContentProvider = authority != null ? this.i.resolveContentProvider(authority, 0) : null;
                    if (providerInfoResolveContentProvider != null) {
                        String str = providerInfoResolveContentProvider.readPermission;
                        if (str != null) {
                            int iMyPid = Process.myPid();
                            int iMyUid = Process.myUid();
                            Context context = this.b;
                            if (context.checkPermission(str, iMyPid, iMyUid) != 0) {
                                PathPermission[] pathPermissionArr = providerInfoResolveContentProvider.pathPermissions;
                                pathPermissionArr.getClass();
                                if (pathPermissionArr.length != 0) {
                                    Iterator itA = agvm.a(pathPermissionArr);
                                    while (itA.hasNext()) {
                                        PathPermission pathPermission = (PathPermission) itA.next();
                                        String readPermission = pathPermission.getReadPermission();
                                        if (!pathPermission.match(uriBuild.getPath()) || context.checkPermission(readPermission, iMyPid, iMyUid) != 0) {
                                        }
                                    }
                                }
                            }
                        }
                        PackageManager packageManager = this.i;
                        ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 0);
                        activityInfo.getClass();
                        eul eulVar = this.n;
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                        packageInfo.getClass();
                        eup eupVar = eulVar.a.a;
                        gpoVar = new gpo(activityInfo, (fiu) eupVar.eY.a(), uriBuild, eupVar.i(), (ahbt) eupVar.q.a(), (gtu) eupVar.bE.a(), strFlattenToShortString, (fcu) eupVar.fb.a(), eupVar.ct(), packageInfo, eupVar.k(), searchableInfo, (ghr) eupVar.fg.a());
                        break;
                    }
                    uriBuild.getAuthority();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (gpoVar != null) {
                ApplicationInfo applicationInfo = gpoVar.c;
                if (applicationInfo == null || (applicationInfo.flags & 1) != 1) {
                    arrayList2.add(gpoVar);
                } else {
                    arrayList.add(gpoVar);
                }
            } else {
                searchableInfo.getSuggestPackage();
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final void f(List list) {
        List list2 = this.l;
        synchronized (list2) {
            list2.clear();
            list2.addAll(list);
        }
    }
}
