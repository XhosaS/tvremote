package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.BatchUploadStatusParcel;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.ConsentParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lcl extends kzi {
    public final lih a;
    private Boolean b;
    private String c;

    public lcl(lih lihVar) {
        kkk.k(lihVar);
        this.a = lihVar;
        this.c = null;
    }

    private final void F(String str, boolean z) throws PackageManager.NameNotFoundException {
        boolean z2;
        PackageInfo packageInfo;
        kdv kdvVarA;
        int length;
        if (TextUtils.isEmpty(str)) {
            this.a.aB().c.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    if ("com.google.android.gms".equals(this.c)) {
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    } else {
                        Context context = this.a.l.a;
                        if (kmb.a.a(context).d(Binder.getCallingUid(), "com.google.android.gms")) {
                            try {
                                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                kdvVarA = kdv.a(context);
                            } catch (PackageManager.NameNotFoundException unused) {
                                if (Log.isLoggable("UidVerifier", 3)) {
                                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                                }
                            }
                            if (packageInfo != null) {
                                if (!kdvVarA.b(packageInfo, false)) {
                                    if (kdvVarA.b(packageInfo, true)) {
                                        if (!kdu.c(kdvVarA.a)) {
                                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                        }
                                    }
                                }
                                z2 = true;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        kdv kdvVarA2 = kdv.a(this.a.l.a);
                        String[] packagesForUid = kdvVarA2.a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                        kdp kdpVar = null;
                        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    kkk.k(kdpVar);
                                    break;
                                }
                                kdpVar = kdvVarA2.c(packagesForUid[i], false);
                                if (kdpVar.b) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        } else {
                            kdpVar = new kdp(false, "no pkgs", null);
                        }
                        kdpVar.b();
                        if (kdpVar.b) {
                            z2 = true;
                            this.b = Boolean.valueOf(z2);
                        } else {
                            z2 = false;
                            this.b = Boolean.valueOf(z2);
                        }
                    }
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.aB().c.b("Measurement Service called with invalid calling package. appId", lab.b(str));
                throw e;
            }
        }
        if (this.c == null) {
            Context context2 = this.a.l.a;
            int callingUid = Binder.getCallingUid();
            boolean z3 = kdu.b;
            if (kmb.a.a(context2).d(callingUid, str)) {
                this.c = str;
            }
        }
        if (str.equals(this.c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void G(AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        kkk.k(appMetadata);
        String str = appMetadata.a;
        kkk.h(str);
        F(str, false);
        this.a.p().Z(appMetadata.b);
    }

    @Override // defpackage.kzj
    public final void A(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        kkk.k(userAttributeParcel);
        G(appMetadata);
        E(new lci(this, userAttributeParcel, appMetadata));
    }

    @Override // defpackage.kzj
    public final void B(final AppMetadata appMetadata, final BatchUploadStatusParcel batchUploadStatusParcel) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        E(new Runnable() { // from class: lbl
            /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0238  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 572
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lbl.run():void");
            }
        });
    }

    @Override // defpackage.kzj
    public final byte[] C(EventParcel eventParcel, String str) throws PackageManager.NameNotFoundException {
        kkk.h(str);
        kkk.k(eventParcel);
        F(str, true);
        lih lihVar = this.a;
        kzz kzzVar = lihVar.aB().j;
        lbk lbkVar = lihVar.l;
        kzu kzuVar = lbkVar.j;
        String str2 = eventParcel.a;
        kzzVar.b("Log and bundle. event", kzuVar.c(str2));
        kkk.k(lbkVar);
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) lihVar.aC().d(new lch(this, eventParcel, str)).get();
            if (bArr == null) {
                lihVar.aB().c.b("Log and bundle returned null. appId", lab.b(str));
                bArr = new byte[0];
            }
            kkk.k(lbkVar);
            lihVar.aB().j.d("Log and bundle processed. event, size, time_ms", kzuVar.c(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            lih lihVar2 = this.a;
            lihVar2.aB().c.d("Failed to log and bundle. appId, event, error", lab.b(str), lihVar2.l.j.c(eventParcel.a), e);
            return null;
        }
    }

    @Override // defpackage.kzj
    public final void D(EventParcel eventParcel, String str) throws PackageManager.NameNotFoundException {
        kkk.k(eventParcel);
        kkk.h(str);
        F(str, true);
        E(new lcg(this, eventParcel, str));
    }

    final void E(Runnable runnable) {
        lih lihVar = this.a;
        if (lihVar.aC().k()) {
            runnable.run();
        } else {
            lihVar.aC().h(runnable);
        }
    }

    public final void c(EventParcel eventParcel, AppMetadata appMetadata) {
        lih lihVar = this.a;
        lihVar.t();
        lihVar.E(eventParcel, appMetadata);
    }

    final void d(Runnable runnable) {
        lih lihVar = this.a;
        if (lihVar.aC().k()) {
            runnable.run();
        } else {
            lihVar.aC().j(runnable);
        }
    }

    @Override // defpackage.kzj
    public final ConsentParcel e(AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        kkk.h(appMetadata.a);
        try {
            return (ConsentParcel) this.a.aC().d(new lce(this, appMetadata)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.a.aB().c.c("Failed to get consent. appId", lab.b(appMetadata.a), e);
            return new ConsentParcel(null);
        }
    }

    @Override // defpackage.kzj
    public final String f(AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        return this.a.r(appMetadata);
    }

    @Override // defpackage.kzj
    public final List g(AppMetadata appMetadata, Bundle bundle) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        kkk.k(appMetadata.a);
        lih lihVar = this.a;
        if (!lihVar.j().t(null, kzg.aY)) {
            try {
                return (List) this.a.aC().c(new lck(this, appMetadata, bundle)).get();
            } catch (InterruptedException | ExecutionException e) {
                this.a.aB().c.c("Failed to get trigger URIs. appId", lab.b(appMetadata.a), e);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) lihVar.aC().d(new lcj(this, appMetadata, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.a.aB().c.c("Failed to get trigger URIs. appId", lab.b(appMetadata.a), e2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kzj
    public final List h(AppMetadata appMetadata, boolean z) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        String str = appMetadata.a;
        kkk.k(str);
        try {
            List<lim> list = (List) this.a.aC().c(new lbr(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (lim limVar : list) {
                if (z || !lio.am(limVar.c)) {
                    arrayList.add(new UserAttributeParcel(limVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aB().c.c("Failed to get user properties. appId", lab.b(appMetadata.a), e);
            return null;
        }
    }

    @Override // defpackage.kzj
    public final List i(String str, String str2, AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        String str3 = appMetadata.a;
        kkk.k(str3);
        try {
            return (List) this.a.aC().c(new lbz(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.aB().c.b("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kzj
    public final List j(String str, String str2, String str3) throws PackageManager.NameNotFoundException {
        F(str, true);
        try {
            return (List) this.a.aC().c(new lca(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.aB().c.b("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kzj
    public final List k(String str, String str2, boolean z, AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        String str3 = appMetadata.a;
        kkk.k(str3);
        try {
            List<lim> list = (List) this.a.aC().c(new lbx(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (lim limVar : list) {
                if (z || !lio.am(limVar.c)) {
                    arrayList.add(new UserAttributeParcel(limVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aB().c.c("Failed to query user properties. appId", lab.b(appMetadata.a), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kzj
    public final List l(String str, String str2, String str3, boolean z) throws PackageManager.NameNotFoundException {
        F(str, true);
        try {
            List<lim> list = (List) this.a.aC().c(new lby(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (lim limVar : list) {
                if (z || !lio.am(limVar.c)) {
                    arrayList.add(new UserAttributeParcel(limVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aB().c.c("Failed to get user properties as. appId", lab.b(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.kzj
    public final void m(AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        E(new lbt(this, appMetadata));
    }

    @Override // defpackage.kzj
    public final void n(AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        E(new lbs(this, appMetadata));
    }

    @Override // defpackage.kzj
    public final void o(AppMetadata appMetadata, final UploadBatchesCriteria uploadBatchesCriteria, final kzp kzpVar) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        final String str = appMetadata.a;
        kkk.k(str);
        this.a.aC().h(new Runnable() { // from class: lbo
            /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 713
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lbo.run():void");
            }
        });
    }

    @Override // defpackage.kzj
    public final void p(EventParcel eventParcel, AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        kkk.k(eventParcel);
        G(appMetadata);
        E(new lcf(this, eventParcel, appMetadata));
    }

    @Override // defpackage.kzj
    public final void q(final AppMetadata appMetadata, final Bundle bundle, final kzm kzmVar) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        final String str = appMetadata.a;
        kkk.k(str);
        this.a.aC().h(new Runnable() { // from class: lbm
            @Override // java.lang.Runnable
            public final void run() {
                lcl lclVar = this.a;
                lih lihVar = lclVar.a;
                lihVar.t();
                try {
                    kzmVar.e(lihVar.s(appMetadata, bundle));
                } catch (RemoteException e) {
                    lclVar.a.aB().c.c("Failed to return trigger URIs for app", str, e);
                }
            }
        });
    }

    @Override // defpackage.kzj
    public final void r(AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        String str = appMetadata.a;
        kkk.h(str);
        F(str, false);
        E(new lcc(this, appMetadata));
    }

    @Override // defpackage.kzj
    public final void s(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        kkk.k(conditionalUserPropertyParcel);
        kkk.k(conditionalUserPropertyParcel.c);
        G(appMetadata);
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
        conditionalUserPropertyParcel2.a = appMetadata.a;
        E(new lbv(this, conditionalUserPropertyParcel2, appMetadata));
    }

    @Override // defpackage.kzj
    public final void t(ConditionalUserPropertyParcel conditionalUserPropertyParcel) throws PackageManager.NameNotFoundException {
        kkk.k(conditionalUserPropertyParcel);
        kkk.k(conditionalUserPropertyParcel.c);
        kkk.h(conditionalUserPropertyParcel.a);
        F(conditionalUserPropertyParcel.a, true);
        E(new lbw(this, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
    }

    @Override // defpackage.kzj
    public final void u(AppMetadata appMetadata) {
        kkk.h(appMetadata.a);
        kkk.k(appMetadata.s);
        d(new lcd(this, appMetadata));
    }

    @Override // defpackage.kzj
    public final void v(long j, String str, String str2, String str3) {
        E(new lbu(this, str2, str3, str, j));
    }

    @Override // defpackage.kzj
    public final void w(final Bundle bundle, final AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        final String str = appMetadata.a;
        kkk.k(str);
        E(new Runnable() { // from class: lbq
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int iA;
                lcl lclVar = this.a;
                lih lihVar = lclVar.a;
                boolean zT = lihVar.j().t(null, kzg.aV);
                String str2 = str;
                Bundle bundle2 = bundle;
                if (bundle2.isEmpty() && zT) {
                    lih lihVar2 = lclVar.a;
                    kug kugVar = lihVar2.c;
                    lihVar2.ai(kugVar);
                    kugVar.g();
                    kugVar.ag();
                    try {
                        kugVar.e().execSQL("delete from default_event_params where app_id=?", new String[]{str2});
                        return;
                    } catch (SQLiteException e) {
                        lbk lbkVar = kugVar.y;
                        lab labVar = lbkVar.f;
                        lbkVar.o(labVar);
                        labVar.c.b("Error clearing default event params", e);
                        return;
                    }
                }
                kug kugVar2 = lihVar.c;
                lihVar.ai(kugVar2);
                kugVar2.g();
                kugVar2.ag();
                lkw lkwVarM = kugVar2.af().m(new kum(kugVar2.y, "", str2, "dep", 0L, 0L, bundle2));
                try {
                    int i = lkwVarM.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(lkwVarM.getClass()).a(lkwVarM);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(lkwVarM.getClass()).a(lkwVarM);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            lkwVarM.memoizedSerializedSize = (Integer.MIN_VALUE & lkwVarM.memoizedSerializedSize) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(lkwVarM.getClass()).m(lkwVarM, abwa.a(abvwVar));
                    abvwVar.K();
                    lbk lbkVar2 = kugVar2.y;
                    lab labVar2 = lbkVar2.f;
                    lbkVar2.o(labVar2);
                    labVar2.k.c("Saving default event parameters, appId, data size", str2, Integer.valueOf(iA));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str2);
                    contentValues.put("parameters", bArr);
                    try {
                        if (kugVar2.e().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                            lbkVar2.o(labVar2);
                            labVar2.c.b("Failed to insert default event parameters (got -1). appId", lab.b(str2));
                        }
                    } catch (SQLiteException e2) {
                        lbk lbkVar3 = kugVar2.y;
                        lab labVar3 = lbkVar3.f;
                        lbkVar3.o(labVar3);
                        labVar3.c.c("Error storing default event parameters. appId", lab.b(str2), e2);
                    }
                    AppMetadata appMetadata2 = appMetadata;
                    lih lihVar3 = lclVar.a;
                    kug kugVar3 = lihVar3.c;
                    lihVar3.ai(kugVar3);
                    long j = appMetadata2.D;
                    try {
                        if (kugVar3.d("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j)}, 0L) > 0) {
                            return;
                        }
                        if (kugVar3.d("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j)}, 0L) > 0) {
                            lih lihVar4 = lclVar.a;
                            kug kugVar4 = lihVar4.c;
                            lihVar4.ai(kugVar4);
                            kugVar4.x(str2, Long.valueOf(appMetadata2.D), null, bundle2);
                        }
                    } catch (SQLiteException e3) {
                        lbk lbkVar4 = kugVar3.y;
                        lab labVar4 = lbkVar4.f;
                        lbkVar4.o(labVar4);
                        labVar4.c.b("Error checking backfill conditions", e3);
                    }
                } catch (IOException e4) {
                    throw new RuntimeException(a.u(lkwVarM, " to a byte array threw an IOException (should never happen)."), e4);
                }
            }
        });
    }

    @Override // defpackage.kzj
    public final void x(final AppMetadata appMetadata) {
        kkk.h(appMetadata.a);
        kkk.k(appMetadata.s);
        d(new Runnable() { // from class: lbp
            @Override // java.lang.Runnable
            public final void run() {
                lih lihVar = this.a.a;
                lihVar.t();
                lihVar.Q(appMetadata);
            }
        });
    }

    @Override // defpackage.kzj
    public final void y(AppMetadata appMetadata) throws PackageManager.NameNotFoundException {
        G(appMetadata);
        E(new lcb(this, appMetadata));
    }

    @Override // defpackage.kzj
    public final void z(final AppMetadata appMetadata) {
        kkk.h(appMetadata.a);
        kkk.k(appMetadata.s);
        d(new Runnable() { // from class: lbn
            @Override // java.lang.Runnable
            public final void run() {
                lih lihVar = this.a.a;
                lihVar.t();
                lihVar.S(appMetadata);
            }
        });
    }
}
