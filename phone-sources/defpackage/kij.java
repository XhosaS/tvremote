package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.CancellationSignal;
import com.google.android.apps.play.movies.mobile.service.restart.GtvExperienceInitializer;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kij implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kij(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        iwr iwrVar;
        iwf iwfVarB;
        ghi ghiVarA;
        SharedPreferences sharedPreferences = null;
        switch (this.b) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.a.b(Boolean.valueOf(!((Boolean) r11.a()).booleanValue()));
                return ygi.a;
            case 1:
                iom iomVar = (iom) this.a;
                iomVar.c.b(true);
                iomVar.i(true);
                return ygi.a;
            case 2:
                ((Boolean) obj).booleanValue();
                this.a.b(Boolean.valueOf(!((Boolean) r11.a()).booleanValue()));
                return ygi.a;
            case 3:
                kgl kglVar = (kgl) obj;
                kglVar.getClass();
                ((kiq) this.a).b(kglVar);
                return ygi.a;
            case 4:
                kgl kglVar2 = (kgl) obj;
                kglVar2.getClass();
                ((kiq) this.a).b(kglVar2);
                return ygi.a;
            case 5:
                ith ithVar = (ith) obj;
                ithVar.getClass();
                iwf iwfVarB2 = ithVar.b();
                if (iwfVarB2 == null || (iwrVar = ((iwu) iwfVarB2).e) == null || !iwrVar.r()) {
                    iwf iwfVarB3 = ithVar.b();
                    if (iwfVarB3 != null) {
                        iwfVarB3.d();
                    }
                } else if (czi.b(((kiq) this.a).a, "android.permission.RECORD_AUDIO") == 0 && (iwfVarB = ithVar.b()) != null) {
                    iwfVarB.e();
                }
                return ygi.a;
            case 6:
                bvc bvcVar = (bvc) obj;
                bvcVar.getClass();
                this.a.b(new cmh(bvcVar.h()));
                return ygi.a;
            case 7:
                byu byuVar = (byu) obj;
                byuVar.getClass();
                byuVar.r();
                brx.G(byuVar, (bnn) this.a, 0L, 0L, 0.0f, null, 6, 62);
                return ygi.a;
            case 8:
                cfc cfcVar = (cfc) obj;
                cfcVar.getClass();
                cfk.y(cfcVar);
                cfk.p(cfcVar, 1.0f);
                cfk.g(cfcVar, (String) this.a);
                return ygi.a;
            case 9:
                ((bdn) this.a).h((int) (((cmh) obj).a & 4294967295L));
                return ygi.a;
            case 10:
                ghiVarA = ((gic) obj).a("SELECT asset_id, asset_type FROM watchlist WHERE account_name = ? AND asset_state != ? ORDER BY asset_order");
                try {
                    ghiVarA.i(1, (String) this.a);
                    ghiVarA.g(2, 3L);
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList.add(new loq(ghiVarA.k(0) ? null : ghiVarA.d(0), ghiVarA.k(1) ? null : Integer.valueOf((int) ghiVarA.b(1))));
                    }
                    return arrayList;
                } finally {
                }
            case 11:
                gic gicVar = (gic) obj;
                ghiVarA = gicVar.a("DELETE FROM watchlist WHERE account_name = ? AND in_cloud = ? AND asset_state != ?");
                try {
                    ghiVarA.i(1, (String) this.a);
                    ghiVarA.g(2, 0L);
                    ghiVarA.g(3, 2L);
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar));
                } finally {
                }
            case 12:
                ghiVarA = ((gic) obj).a("DELETE FROM watchlist WHERE account_name = ?");
                try {
                    ghiVarA.i(1, (String) this.a);
                    ghiVarA.l();
                    return ygi.a;
                } finally {
                }
            case 13:
                ghiVarA = ((gic) obj).a("UPDATE watchlist SET in_cloud = ? WHERE account_name = ? ");
                Object obj2 = this.a;
                try {
                    ghiVarA.g(1, 0L);
                    ghiVarA.i(2, (String) obj2);
                    ghiVarA.l();
                    return ygi.a;
                } finally {
                }
            case 14:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                GtvExperienceInitializer gtvExperienceInitializer = (GtvExperienceInitializer) this.a;
                lfn lfnVar = gtvExperienceInitializer.e;
                if (lfnVar == null) {
                    yks.c("config");
                    lfnVar = null;
                }
                if (!lfnVar.cL()) {
                    krd.e("GTV not enabled after sync");
                    return ygi.a;
                }
                if (meb.a.a()) {
                    krd.f("Cancel upgrading since app is in foreground");
                    return ygi.a;
                }
                if (!zBooleanValue) {
                    return ygi.a;
                }
                krd.e("Skip GTV introduction for new user");
                SharedPreferences sharedPreferences2 = gtvExperienceInitializer.c;
                if (sharedPreferences2 == null) {
                    yks.c("preferences");
                } else {
                    sharedPreferences = sharedPreferences2;
                }
                sharedPreferences.edit().putBoolean(krh.GTV_INTRODUCTION_NEEDED, false).commit();
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 15:
                return BootstrapWatchActivity.$r8$lambda$wENdGOwRGI51gqY0AZDRxmuFsr4((BootstrapWatchActivity) this.a, (Exception) obj);
            case 16:
                return BootstrapWatchActivity.$r8$lambda$i0lwZRpkg8qNaQfxlODzC575ITw((BootstrapWatchActivity) this.a, (Exception) obj);
            case 17:
                ((Integer) obj).getClass();
                return new opz((Context) this.a, null);
            case 18:
                pev pevVar = (pev) obj;
                pevVar.getClass();
                vtw vtwVar = (vtw) pevVar.a(5, null);
                vtwVar.x(pevVar);
                vtwVar.getClass();
                rdd.am(vtwVar);
                vww vwwVarAm = rdd.am(vtwVar);
                Object obj3 = this.a;
                Integer num = (Integer) vwwVarAm.get(obj3);
                int iIntValue = num != null ? num.intValue() : 0;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                pev pevVar2 = (pev) vtwVar.b;
                vve vveVar = pevVar2.b;
                if (!vveVar.b) {
                    pevVar2.b = vveVar.a();
                }
                pevVar2.b.put(obj3, Integer.valueOf(iIntValue + 1));
                vuc vucVarR = vtwVar.r();
                vucVarR.getClass();
                return (pev) vucVarR;
            case 19:
                pqf pqfVar = pqf.a;
                if (((Throwable) obj) instanceof CancellationException) {
                    ((CancellationSignal) this.a).cancel();
                }
                return ygi.a;
            default:
                gic gicVar2 = (gic) obj;
                ghiVarA = gicVar2.a("DELETE FROM preview_programs WHERE package_name = ?");
                try {
                    ghiVarA.i(1, (String) this.a);
                    ghiVarA.l();
                    return Integer.valueOf(gez.K(gicVar2));
                } finally {
                }
        }
    }
}
