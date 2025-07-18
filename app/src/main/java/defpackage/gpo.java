package defpackage;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.OperationCanceledException;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpo implements jba {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/ondevice/sources/SearchableSource");
    public final fiu a;
    public final PackageInfo b;
    public final ApplicationInfo c;
    private final ActivityInfo e;
    private final Uri f;
    private final ContentResolver g;
    private final ahbt h;
    private final gtu i;
    private final String j;
    private final jbc k;
    private final PackageManager l;
    private final SearchableInfo m;
    private final ghr n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private Cursor r;
    private final String s;
    private final String t;
    private final ComponentName u;
    private final String v;
    private final int w;
    private final fcu x;

    public gpo(ActivityInfo activityInfo, fiu fiuVar, Uri uri, ContentResolver contentResolver, ahbt ahbtVar, gtu gtuVar, String str, fcu fcuVar, jbc jbcVar, PackageInfo packageInfo, PackageManager packageManager, SearchableInfo searchableInfo, ghr ghrVar) {
        Bundle bundle;
        fiuVar.getClass();
        ahbtVar.getClass();
        gtuVar.getClass();
        fcuVar.getClass();
        searchableInfo.getClass();
        ghrVar.getClass();
        this.e = activityInfo;
        this.a = fiuVar;
        this.f = uri;
        this.g = contentResolver;
        this.h = ahbtVar;
        this.i = gtuVar;
        this.j = str;
        this.x = fcuVar;
        this.k = jbcVar;
        this.b = packageInfo;
        this.l = packageManager;
        this.m = searchableInfo;
        this.n = ghrVar;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        this.o = ((applicationInfo != null ? applicationInfo.flags : 0) & 2) != 0;
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(authority == null ? "" : authority, 128);
        String string = null;
        if (providerInfoResolveContentProvider != null && (bundle = providerInfoResolveContentProvider.metaData) != null) {
            string = bundle.getString("SupportedSwitchActionType");
        }
        string = string == null ? "" : string;
        this.p = agyv.o(string, "TVINPUT");
        this.q = agyv.o(string, "CHANNEL");
        agyv.o(string, "POWER");
        this.c = packageInfo.applicationInfo;
        String suggestIntentAction = searchableInfo.getSuggestIntentAction();
        this.s = suggestIntentAction == null ? "android.intent.action.VIEW" : suggestIntentAction;
        String suggestIntentData = searchableInfo.getSuggestIntentData();
        this.t = suggestIntentData != null ? suggestIntentData : "";
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        searchActivity.getClass();
        this.u = searchActivity;
        agvy.c(searchableInfo.getSuggestAuthority(), "com.android.contacts");
        String str2 = packageInfo.packageName;
        str2.getClass();
        this.v = str2;
        this.w = activityInfo.getIconResource();
        searchableInfo.getSuggestAuthority().getClass();
    }

    private final CharSequence o(int i) {
        if (i == 0) {
            return null;
        }
        return this.l.getText(this.v, i, this.c);
    }

    @Override // defpackage.jbe
    public final int a() {
        return this.w;
    }

    @Override // defpackage.jba
    public final ComponentName b() {
        return this.u;
    }

    @Override // defpackage.jbe
    public final ApplicationInfo c() {
        return this.c;
    }

    @Override // defpackage.jba
    public final Cursor d(String str, int i, Map map) throws RemoteException {
        String[] strArr;
        str.getClass();
        try {
            SearchableInfo searchableInfo = this.m;
            if (this.r != null) {
                ((zdv) d.b().q("com/google/android/apps/tvsearch/ondevice/sources/SearchableSource", "getSuggestions", 187, "SearchableSource.kt")).u("Closing cursor and/or contentProviderClient from previous query.");
                j();
            }
            Uri.Builder builderBuildUpon = this.f.buildUpon();
            String suggestSelection = searchableInfo.getSuggestSelection();
            if (suggestSelection != null) {
                strArr = new String[]{str};
            } else {
                builderBuildUpon.appendPath(str);
                strArr = null;
            }
            for (String str2 : map.keySet()) {
                builderBuildUpon.appendQueryParameter(str2, (String) map.get(str2));
            }
            builderBuildUpon.appendQueryParameter("limit", String.valueOf(i));
            Uri uriBuild = builderBuildUpon.build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.g.acquireUnstableContentProviderClient(uriBuild);
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                ((zdv) d.b().q("com/google/android/apps/tvsearch/ondevice/sources/SearchableSource", "getSuggestions", 208, "SearchableSource.kt")).u("contentProvider is null");
                return null;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, suggestSelection, strArr, null, null);
            this.r = cursorQuery;
            return cursorQuery;
        } catch (Exception e) {
            if ((e instanceof DeadObjectException) || (e instanceof OperationCanceledException)) {
                zdv zdvVar = (zdv) ((zdv) d.d()).p(e).q("com/google/android/apps/tvsearch/ondevice/sources/SearchableSource", "getSuggestions", 143, "SearchableSource.kt");
                ApplicationInfo applicationInfo = this.c;
                zdvVar.I("Recoverable Error: app[%s], package[%s], query[%s]", applicationInfo != null ? applicationInfo.name : null, this.v, str);
                this.n.aa(10);
            } else {
                zdv zdvVar2 = (zdv) ((zdv) d.c()).p(e).q("com/google/android/apps/tvsearch/ondevice/sources/SearchableSource", "getSuggestions", 158, "SearchableSource.kt");
                ApplicationInfo applicationInfo2 = this.c;
                zdvVar2.I("Unrecoverable Error: app[%s], package[%s], query[%s]", applicationInfo2 != null ? applicationInfo2.name : null, this.v, str);
                if (!this.o) {
                    ahal.e(this.h, null, 0, new gpm(this, null), 3);
                }
                this.n.aa(11);
            }
            return null;
        }
    }

    @Override // defpackage.jbe
    public final CharSequence e() {
        CharSequence charSequenceO = o(this.e.labelRes);
        if (charSequenceO != null) {
            return charSequenceO;
        }
        ApplicationInfo applicationInfo = this.c;
        CharSequence charSequenceO2 = applicationInfo != null ? o(applicationInfo.labelRes) : null;
        return charSequenceO2 == null ? this.v : charSequenceO2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.jbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.gpn
            if (r0 == 0) goto L13
            r0 = r8
            gpn r0 = (defpackage.gpn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gpn r0 = new gpn
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            java.lang.String r2 = r0.e
            jbc r4 = r0.d
            defpackage.agpl.b(r8)
            goto L52
        L3a:
            defpackage.agpl.b(r8)
            jbc r8 = r7.k
            java.lang.String r2 = r7.v
            gtu r5 = r7.i
            r0.d = r8
            r0.e = r2
            r0.c = r4
            java.lang.Object r4 = r5.j(r0)
            if (r4 == r1) goto L6d
            r6 = r4
            r4 = r8
            r8 = r6
        L52:
            android.accounts.Account r8 = (android.accounts.Account) r8
            r5 = 0
            if (r8 == 0) goto L5a
            java.lang.String r8 = r8.name
            goto L5b
        L5a:
            r8 = r5
        L5b:
            r0.d = r5
            r0.e = r5
            r0.c = r3
            if (r8 != 0) goto L65
            java.lang.String r8 = ""
        L65:
            java.lang.Object r8 = r4.a(r2, r8, r0)
            if (r8 != r1) goto L6c
            goto L6d
        L6c:
            return r8
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpo.f(agsw):java.lang.Object");
    }

    @Override // defpackage.jbe
    public final String g() {
        return this.s;
    }

    @Override // defpackage.jbe
    public final String h() {
        return this.t;
    }

    @Override // defpackage.jbe
    public final String i() {
        return this.v;
    }

    @Override // defpackage.jbe
    public final void j() {
        Cursor cursor = this.r;
        if (cursor != null) {
            cursor.close();
        }
        this.r = null;
    }

    @Override // defpackage.jba
    public final boolean k() {
        return this.q;
    }

    @Override // defpackage.jba
    public final boolean l() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // defpackage.jbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() {
        /*
            r8 = this;
            android.content.pm.PackageInfo r0 = r8.b
            java.lang.String r0 = r0.packageName
            r0.getClass()
            jbc r1 = r8.k
            java.util.function.Supplier r2 = r1.a
            java.lang.Object r2 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L40
            java.util.function.Supplier r2 = r1.d
            java.lang.Object r2 = defpackage.al$$ExternalSyntheticApiModelOutline1.m(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L40
            fsg r2 = r1.c
            gtu r4 = r1.e
            android.accounts.Account r4 = r4.c()
            if (r4 == 0) goto L33
            java.lang.String r4 = r4.name
            goto L34
        L33:
            r4 = 0
        L34:
            if (r4 != 0) goto L38
            java.lang.String r4 = ""
        L38:
            fwe r2 = r2.a(r4)
            fwe r4 = defpackage.fwe.DSC_GRANTED
            if (r2 != r4) goto L83
        L40:
            hab r2 = r1.f
            gzs r2 = r2.a(r0)
            if (r2 == 0) goto L4b
            long r4 = r2.b
            goto L55
        L4b:
            android.content.pm.PackageManager r2 = r1.g     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
            long r4 = defpackage.jj$$ExternalSyntheticApiModelOutline0.m(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L83
        L55:
            fqm r2 = r1.h
            java.util.Map r2 = r2.b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r2 = j$.util.Map.EL.getOrDefault(r2, r0, r6)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L83
            fja r1 = r1.b
            java.util.Map r1 = r1.b
            r6 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Object r0 = j$.util.Map.EL.getOrDefault(r1, r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L83
            r0 = 1
            return r0
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpo.m():boolean");
    }

    @Override // defpackage.jba
    public final boolean n() {
        return this.x.a().contains(this.b.packageName);
    }

    public final String toString() {
        return "SearchableSource[name=" + this.j + ", packageName=" + this.v + "]";
    }
}
