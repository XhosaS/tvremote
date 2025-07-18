package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class len implements Application.ActivityLifecycleCallbacks, lel {
    final /* synthetic */ leo a;

    public len(leo leoVar) {
        this.a = leoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    @Override // defpackage.lel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.measurement.api.internal.ScionActivityInfo r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r7 = this;
            leo r0 = r7.a     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            lbk r1 = r0.y     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            lab r2 = r1.f     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            r1.o(r2)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            kzz r2 = r2.k     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            java.lang.String r3 = "onActivityCreated"
            r2.a(r3)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            android.content.Intent r2 = r8.c     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r2 == 0) goto L8b
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r3 == 0) goto L23
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r4 != 0) goto L21
            goto L23
        L21:
            r4 = r3
            goto L3b
        L23:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            r4 = 0
            if (r3 == 0) goto L3b
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r5 != 0) goto L3b
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            goto L21
        L3b:
            if (r4 == 0) goto L8b
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r3 != 0) goto L44
            goto L8b
        L44:
            lio r0 = r1.i     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            r1.m(r0)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r2 != 0) goto L6b
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r2 != 0) goto L6b
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r0 == 0) goto L68
            goto L6b
        L68:
            java.lang.String r0 = "auto"
            goto L6d
        L6b:
            java.lang.String r0 = "gs"
        L6d:
            r5 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            if (r9 != 0) goto L78
            r0 = 1
            goto L79
        L78:
            r0 = 0
        L79:
            r3 = r0
            lbh r0 = r1.g     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            r1.o(r0)     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            lem r1 = new lem     // Catch: java.lang.Throwable -> L97 java.lang.RuntimeException -> L9a
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L89 java.lang.Throwable -> Lb3
            r0.h(r1)     // Catch: java.lang.RuntimeException -> L89 java.lang.Throwable -> Lb3
            goto Lac
        L89:
            r0 = move-exception
            goto L9c
        L8b:
            r2 = r7
            lbk r0 = r0.y
            lfg r1 = r0.k
        L90:
            r0.n(r1)
            r1.m(r8, r9)
            return
        L97:
            r0 = move-exception
            r2 = r7
            goto Lb4
        L9a:
            r0 = move-exception
            r2 = r7
        L9c:
            leo r1 = r2.a     // Catch: java.lang.Throwable -> Lb3
            lbk r1 = r1.y     // Catch: java.lang.Throwable -> Lb3
            lab r3 = r1.f     // Catch: java.lang.Throwable -> Lb3
            r1.o(r3)     // Catch: java.lang.Throwable -> Lb3
            kzz r1 = r3.c     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r1.b(r3, r0)     // Catch: java.lang.Throwable -> Lb3
        Lac:
            leo r0 = r2.a
            lbk r0 = r0.y
            lfg r1 = r0.k
            goto L90
        Lb3:
            r0 = move-exception
        Lb4:
            leo r1 = r2.a
            lbk r1 = r1.y
            lfg r3 = r1.k
            r1.n(r3)
            r3.m(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.len.a(com.google.android.gms.measurement.api.internal.ScionActivityInfo, android.os.Bundle):void");
    }

    @Override // defpackage.lel
    public final void b(ScionActivityInfo scionActivityInfo) {
        lbk lbkVar = this.a.y;
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        synchronized (lfgVar.j) {
            if (Objects.equals(lfgVar.e, scionActivityInfo)) {
                lfgVar.e = null;
            }
        }
        if (lfgVar.y.d.v()) {
            lfgVar.d.remove(Integer.valueOf(scionActivityInfo.a));
        }
    }

    @Override // defpackage.lel
    public final void c(ScionActivityInfo scionActivityInfo) {
        lbk lbkVar = this.a.y;
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        synchronized (lfgVar.j) {
            lfgVar.i = false;
            lfgVar.f = true;
        }
        lbk lbkVar2 = lfgVar.y;
        klk klkVar = lbkVar2.B;
        ktx ktxVar = lbkVar2.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (ktxVar.v()) {
            lez lezVarI = lfgVar.i(scionActivityInfo);
            lfgVar.b = lfgVar.a;
            lfgVar.a = null;
            lbh lbhVar = lbkVar2.g;
            lbkVar2.o(lbhVar);
            lbhVar.h(new lfe(lfgVar, lezVarI, jElapsedRealtime));
        } else {
            lfgVar.a = null;
            lbh lbhVar2 = lbkVar2.g;
            lbkVar2.o(lbhVar2);
            lbhVar2.h(new lfd(lfgVar, jElapsedRealtime));
        }
        lbk lbkVar3 = this.a.y;
        lhg lhgVar = lbkVar3.h;
        lbkVar3.n(lhgVar);
        lbk lbkVar4 = lhgVar.y;
        klk klkVar2 = lbkVar4.B;
        lbh lbhVar3 = lbkVar4.g;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        lbkVar4.o(lbhVar3);
        lbhVar3.h(new lgz(lhgVar, jElapsedRealtime2));
    }

    @Override // defpackage.lel
    public final void d(ScionActivityInfo scionActivityInfo) {
        lbk lbkVar = this.a.y;
        lhg lhgVar = lbkVar.h;
        lbkVar.n(lhgVar);
        lbk lbkVar2 = lhgVar.y;
        klk klkVar = lbkVar2.B;
        lbh lbhVar = lbkVar2.g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lbkVar2.o(lbhVar);
        lbhVar.h(new lgy(lhgVar, jElapsedRealtime));
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        Object obj = lfgVar.j;
        synchronized (obj) {
            lfgVar.i = true;
            if (!Objects.equals(scionActivityInfo, lfgVar.e)) {
                synchronized (obj) {
                    lfgVar.e = scionActivityInfo;
                    lfgVar.f = false;
                    lbk lbkVar3 = lfgVar.y;
                    if (lbkVar3.d.v()) {
                        lfgVar.g = null;
                        lbh lbhVar2 = lbkVar3.g;
                        lbkVar3.o(lbhVar2);
                        lbhVar2.h(new lff(lfgVar));
                    }
                }
            }
        }
        lbk lbkVar4 = lfgVar.y;
        if (!lbkVar4.d.v()) {
            lfgVar.a = lfgVar.g;
            lbh lbhVar3 = lbkVar4.g;
            lbkVar4.o(lbhVar3);
            lbhVar3.h(new lfc(lfgVar));
            return;
        }
        lfgVar.k(scionActivityInfo.b, lfgVar.i(scionActivityInfo), false);
        lbk lbkVar5 = lfgVar.y;
        kst kstVar = lbkVar5.m;
        lbkVar5.l(kstVar);
        lbk lbkVar6 = kstVar.y;
        klk klkVar2 = lbkVar6.B;
        lbh lbhVar4 = lbkVar6.g;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        lbkVar6.o(lbhVar4);
        lbhVar4.h(new kss(kstVar, jElapsedRealtime2));
    }

    @Override // defpackage.lel
    public final void e(ScionActivityInfo scionActivityInfo, Bundle bundle) {
        lez lezVar;
        lbk lbkVar = this.a.y;
        lfg lfgVar = lbkVar.k;
        lbkVar.n(lfgVar);
        if (!lfgVar.y.d.v() || bundle == null || (lezVar = (lez) lfgVar.d.get(Integer.valueOf(scionActivityInfo.a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", lezVar.c);
        bundle2.putString("name", lezVar.a);
        bundle2.putString("referrer_name", lezVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        a(ScionActivityInfo.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(ScionActivityInfo.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(ScionActivityInfo.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(ScionActivityInfo.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(ScionActivityInfo.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
