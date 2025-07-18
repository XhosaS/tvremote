package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpf implements qor {
    private static final tvn b = tvn.n("GnpSdk");
    public final Context a;
    private final qei c;
    private final tst d;
    private final tst e;
    private final tst f;
    private final qmv g;
    private final yfo h;

    public qpf(Context context, qei qeiVar, tst tstVar, tst tstVar2, tst tstVar3, qmv qmvVar, uhs uhsVar, yfo yfoVar) {
        qeiVar.getClass();
        uhsVar.getClass();
        yfoVar.getClass();
        this.a = context;
        this.c = qeiVar;
        this.d = tstVar;
        this.e = tstVar2;
        this.f = tstVar3;
        this.g = qmvVar;
        this.h = yfoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
    
        if (r14 != r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qpv r11, java.util.Set r12, defpackage.qel r13, defpackage.yih r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpf.a(qpv, java.util.Set, qel, yih):java.lang.Object");
    }

    public final vkh b() throws PackageManager.NameNotFoundException {
        String str;
        List list;
        List list2;
        String strValueOf = "";
        vtw vtwVarM = vkh.a.m();
        vtwVarM.getClass();
        Context context = this.a;
        vef.q(context.getResources().getDisplayMetrics().density, vtwVarM);
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            ((tvk) ((tvk) b.f()).i(e)).s("Couldn't get app version name.");
        }
        if (str == null) {
            str = "";
        }
        vef.l(str, vtwVarM);
        try {
            Context context2 = this.a;
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
            strValueOf = qtl.F() ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            ((tvk) ((tvk) b.f()).i(e2)).s("Couldn't get app version code.");
        }
        vef.m(strValueOf, vtwVarM);
        vef.j(Build.VERSION.SDK_INT, vtwVarM);
        vef.y(vtwVarM);
        vef.z(vtwVarM);
        Context context3 = this.a;
        vef.k(new crv(context3).c() ? vkb.ALLOWED : vkb.BANNED, vtwVarM);
        DesugarCollections.unmodifiableList(((vkh) vtwVarM.b).n).getClass();
        if (qtl.E()) {
            try {
                List notificationChannels = Build.VERSION.SDK_INT >= 26 ? new crv(context3).d.getNotificationChannels() : Collections.EMPTY_LIST;
                notificationChannels.getClass();
                List arrayList = new ArrayList(yfm.z(notificationChannels, 10));
                Iterator it = notificationChannels.iterator();
                while (it.hasNext()) {
                    NotificationChannel notificationChannelM = kw$$ExternalSyntheticApiModelOutline0.m(it.next());
                    vtw vtwVarM2 = vke.a.m();
                    vtwVarM2.getClass();
                    String id = notificationChannelM.getId();
                    id.getClass();
                    vef.C(id, vtwVarM2);
                    int importance = notificationChannelM.getImportance();
                    vef.E(importance != 0 ? importance != 1 ? importance != 2 ? importance != 3 ? importance != 4 ? importance != 5 ? vkd.IMPORTANCE_UNSPECIFIED : vkd.IMPORTANCE_MAX : vkd.IMPORTANCE_HIGH : vkd.IMPORTANCE_DEFAULT : vkd.IMPORTANCE_LOW : vkd.IMPORTANCE_MIN : vkd.IMPORTANCE_NONE, vtwVarM2);
                    vef.B(notificationChannelM.canShowBadge() ? vkc.TRUE : vkc.FALSE, vtwVarM2);
                    String group = notificationChannelM.getGroup();
                    if (group != null && group.length() != 0) {
                        String group2 = notificationChannelM.getGroup();
                        group2.getClass();
                        vef.D(group2, vtwVarM2);
                    }
                    arrayList.add(vef.A(vtwVarM2));
                }
                list = arrayList;
            } catch (NullPointerException e3) {
                ((tvk) ((tvk) b.g()).i(e3)).s("Failed to get notification channels from Android.");
                list = yhb.a;
            }
        } else {
            list = yhb.a;
        }
        vef.u(list, vtwVarM);
        DesugarCollections.unmodifiableList(((vkh) vtwVarM.b).o).getClass();
        if (qtl.F()) {
            try {
                List notificationChannelGroups = Build.VERSION.SDK_INT >= 26 ? new crv(this.a).d.getNotificationChannelGroups() : Collections.EMPTY_LIST;
                notificationChannelGroups.getClass();
                List arrayList2 = new ArrayList(yfm.z(notificationChannelGroups, 10));
                Iterator it2 = notificationChannelGroups.iterator();
                while (it2.hasNext()) {
                    NotificationChannelGroup notificationChannelGroupM441m = kw$$ExternalSyntheticApiModelOutline0.m441m(it2.next());
                    vtw vtwVarM3 = vkg.a.m();
                    vtwVarM3.getClass();
                    String id2 = notificationChannelGroupM441m.getId();
                    id2.getClass();
                    vef.H(id2, vtwVarM3);
                    vef.G(notificationChannelGroupM441m.isBlocked() ? vkf.BANNED : vkf.ALLOWED, vtwVarM3);
                    arrayList2.add(vef.F(vtwVarM3));
                }
                list2 = arrayList2;
            } catch (NullPointerException e4) {
                ((tvk) ((tvk) b.g()).i(e4)).s("Failed to get notification channel groups from Android.");
                list2 = yhb.a;
            }
        } else {
            list2 = yhb.a;
        }
        vef.v(list2, vtwVarM);
        String str2 = this.c.d;
        if (str2 != null && str2.length() != 0) {
            vef.p(str2, vtwVarM);
        }
        String str3 = Build.VERSION.RELEASE;
        if (str3 != null && str3.length() != 0) {
            String str4 = Build.VERSION.RELEASE;
            str4.getClass();
            vef.t(str4, vtwVarM);
        }
        String str5 = Build.ID;
        if (str5 != null && str5.length() != 0) {
            String str6 = Build.ID;
            str6.getClass();
            vef.r(str6, vtwVarM);
        }
        String str7 = Build.MODEL;
        if (str7 != null && str7.length() != 0) {
            String str8 = Build.MODEL;
            str8.getClass();
            vef.s(str8, vtwVarM);
        }
        String str9 = Build.MANUFACTURER;
        if (str9 != null && str9.length() != 0) {
            String str10 = Build.MANUFACTURER;
            str10.getClass();
            vef.o(str10, vtwVarM);
        }
        String strD = null;
        try {
            strD = opc.d(this.a.getContentResolver(), "device_country", null);
        } catch (SecurityException e5) {
            ((tvk) ((tvk) b.f()).i(e5)).s("Exception reading GServices 'device_country' key.");
        }
        if (strD != null && strD.length() != 0) {
            vef.n(strD, vtwVarM);
        }
        vka vkaVar = (vka) qpb.a.convert(qtl.L(this.a));
        if (vkaVar != null) {
            vef.i(vkaVar, vtwVarM);
        }
        return vef.h(vtwVarM);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qpv r6, defpackage.tst r7, defpackage.yih r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.qpe
            if (r0 == 0) goto L13
            r0 = r8
            qpe r0 = (defpackage.qpe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qpe r0 = new qpe
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r8)     // Catch: java.lang.Exception -> L28
            goto L4a
        L28:
            r6 = move-exception
            goto L4e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ybn.f(r8)
            boolean r6 = r6.b()
            if (r6 == 0) goto L3c
            return r4
        L3c:
            ttd r7 = (defpackage.ttd) r7     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = r7.a     // Catch: java.lang.Exception -> L28
            qqd r6 = (defpackage.qqd) r6     // Catch: java.lang.Exception -> L28
            r0.c = r3     // Catch: java.lang.Exception -> L28
            r6.b()     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L4d
            r8 = r4
        L4a:
            vsl r8 = (defpackage.vsl) r8     // Catch: java.lang.Exception -> L28
            return r8
        L4d:
            return r4
        L4e:
            tvn r7 = defpackage.qpf.b
            tuv r7 = r7.f()
            java.lang.String r8 = "Failed getting device payload"
            defpackage.a.co(r7, r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpf.c(qpv, tst, yih):java.lang.Object");
    }

    public final String d() {
        String languageTag = this.a.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.tst r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qpd
            if (r0 == 0) goto L13
            r0 = r7
            qpd r0 = (defpackage.qpd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qpd r0 = new qpd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.ybn.f(r7)     // Catch: java.lang.Exception -> L28
            goto L43
        L28:
            r6 = move-exception
            goto L47
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.ybn.f(r7)
            ttd r6 = (defpackage.ttd) r6     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = r6.a     // Catch: java.lang.Exception -> L28
            qqd r6 = (defpackage.qqd) r6     // Catch: java.lang.Exception -> L28
            r0.c = r3     // Catch: java.lang.Exception -> L28
            r6.c()     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L46
            r7 = r4
        L43:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L28
            return r7
        L46:
            return r4
        L47:
            tvn r7 = defpackage.qpf.b
            tuv r7 = r7.f()
            java.lang.String r0 = "Failed getting language code"
            defpackage.a.co(r7, r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpf.e(tst, yih):java.lang.Object");
    }
}
