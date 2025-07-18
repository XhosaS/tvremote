package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgk implements lgr {
    private static final String[] a = {"account", "asset_id", "license_release_pending", "license_cenc_key_set_id IS NOT NULL", "license_last_synced_sdk_int", "license_type = 1"};
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;
    private static final ReentrantLock g;
    private final long h;
    private final lfn i;
    private final idf j;
    private final ContentResolver k;
    private final Executor l;
    private final lie m;
    private final idr n;
    private final PowerManager o;
    private final WifiManager p;
    private final mem q;
    private final xig r;
    private final lyz s;
    private final lrq t;
    private final isy u;
    private final isy v;

    static {
        String str = "(purchase_type != " + kvm.TYPE_RENTAL.f + " AND license_last_synced_timestamp < ?)";
        b = str;
        String strCd = a.cd(ksk.b, "(license_last_synced_sdk_int != ", ")");
        c = strCd;
        String str2 = "(pinned IS NOT NULL AND pinned > 0) AND (license_type IS NOT NULL AND license_type != 0) AND (" + str + " OR (license_last_synced_timestamp > ?) OR license_force_sync OR (license_type = 1) OR " + strCd + ")";
        d = str2;
        String str3 = "license_release_pending OR (" + str2 + ")";
        e = str3;
        f = "SELECT 1 FROM purchased_assets WHERE " + str3 + " LIMIT 1";
        g = new ReentrantLock(true);
    }

    public lgk(lfn lfnVar, lyz lyzVar, idf idfVar, lrq lrqVar, Context context, Executor executor, lie lieVar, idr idrVar, isy isyVar, isy isyVar2, xig xigVar, mem memVar) {
        this.s = lyzVar;
        this.i = lfnVar;
        this.j = idfVar;
        this.t = lrqVar;
        this.l = executor;
        this.m = lieVar;
        this.n = idrVar;
        this.v = isyVar;
        this.u = isyVar2;
        this.r = xigVar;
        this.h = lfnVar.aS();
        this.k = context.getContentResolver();
        this.o = (PowerManager) context.getSystemService("power");
        this.p = (WifiManager) context.getSystemService("wifi");
        this.q = memVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, lie] */
    /* JADX WARN: Type inference failed for: r11v7, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r18v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, lfn] */
    private final boolean d() {
        boolean z;
        lyz lyzVar;
        kuh kuhVar;
        int i;
        boolean z2;
        String str;
        byte[] bArr;
        lfn lfnVar = this.i;
        int i2 = 1;
        if (lfnVar.cW()) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArr = {Long.toString(jCurrentTimeMillis - this.h), Long.toString(jCurrentTimeMillis)};
        lyz lyzVar2 = this.s;
        Class<?> cls = getClass();
        SQLiteDatabase sQLiteDatabaseB = lyzVar2.b();
        String strValueOf = String.valueOf(cls.getName());
        PowerManager powerManager = this.o;
        String strConcat = strValueOf.concat("_tasks");
        String strB = lnz.b("REFRESH_");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        wakeLockNewWakeLock.acquire();
        int i3 = 3;
        WifiManager.WifiLock wifiLockCreateWifiLock = this.p.createWifiLock(3, strConcat);
        wifiLockCreateWifiLock.acquire();
        try {
            String[] strArr2 = a;
            boolean z3 = e;
            Cursor cursorQuery = sQLiteDatabaseB.query("purchased_assets", strArr2, z3, strArr, null, null, "pinned");
            int i4 = 0;
            boolean z4 = false;
            while (cursorQuery.moveToNext()) {
                try {
                    if (!((Boolean) this.n.a()).booleanValue() && this.q.d()) {
                        boolean zH = mei.h(cursorQuery, i3);
                        boolean zH2 = mei.h(cursorQuery, 5);
                        boolean zH3 = mei.h(cursorQuery, 2);
                        int i5 = i3;
                        kuh kuhVar2 = new kuh(ksn.b(cursorQuery.getString(i4)), cursorQuery.getString(i2));
                        if (cursorQuery.getInt(4) < ksk.b) {
                            i = i5;
                            z2 = i2;
                        } else {
                            i = i5;
                            z2 = i4;
                        }
                        if (!zH) {
                            z3 = i4;
                            if (zH2) {
                                krd.f(hhh.c(kuhVar2, "Supposed to release legacy license "));
                            } else {
                                krd.f(hhh.c(kuhVar2, "Downloading lacks license information "));
                            }
                        } else if (zH3) {
                            try {
                                z3 = i4;
                            } catch (lgq e2) {
                                e = e2;
                            }
                            try {
                                mdw.f(kuhVar2, this.m, this.j, this.t, this.i, this.s, this.k, this.l, strB);
                            } catch (lgq e3) {
                                e = e3;
                                kuhVar2 = kuhVar2;
                                krd.d(hhh.c(kuhVar2, "Refresh failure "), e);
                                i4 = z3;
                                i3 = 3;
                                i2 = 1;
                                z4 = true;
                            }
                        } else {
                            try {
                                int i6 = i4;
                                try {
                                    z3 = i6;
                                    str = strB;
                                } catch (lgq e4) {
                                    e = e4;
                                    z3 = i6;
                                }
                            } catch (lgq e5) {
                                e = e5;
                                z3 = i4;
                            }
                            try {
                                wfn wfnVar = new wfn(kuhVar2, this.m, this.j, this.t, lfnVar, lyzVar2, this.k, this.l, this.u, z2, str);
                                strB = str;
                                try {
                                    Object obj = wfnVar.j;
                                    String str2 = ((kuh) obj).b;
                                    krd.e(a.cr(str2, "Refresh "));
                                    kug kugVarT = ktw.t((lyz) wfnVar.d, (kuh) obj);
                                    if (kugVarT == null || kugVarT.k == null || (bArr = kugVarT.i) == null) {
                                        wfnVar.j(new lgq("Invalid license data"));
                                    } else {
                                        try {
                                            lhe lheVarA = lgn.a(((kuh) obj).a, str2, kugVarT.c ? ksy.h(str2) : ksy.i(str2), bArr, kugVarT.l, false, (lrq) wfnVar.c, wfnVar.h, wfnVar.i, wfnVar.e, (ContentResolver) wfnVar.b, (String) wfnVar.g);
                                            int i7 = lheVarA.c;
                                            int i8 = kugVarT.l;
                                            if (i8 <= 0 || i8 == i7) {
                                                try {
                                                    lheVarA.m(kugVarT.h);
                                                    mfl mflVar = new mfl();
                                                    lheVarA.d(kugVarT.j, kugVarT.k, null, mflVar);
                                                    ieg iegVarA = mflVar.a();
                                                    if (iegVarA.k()) {
                                                        wfnVar.j(iegVarA.i());
                                                    } else {
                                                        mfl mflVar2 = new mfl();
                                                        lheVarA.l(null, mflVar2);
                                                        ieg iegVarA2 = mflVar2.a();
                                                        if (iegVarA2.m()) {
                                                            iegVarA2 = ieg.f(Boolean.valueOf(lheVarA.a() > 0 ? true : z3));
                                                        } else {
                                                            iegVarA2.p();
                                                        }
                                                        boolean z5 = (wfnVar.a && wfnVar.e.cz()) ? true : z3;
                                                        if (!iegVarA2.k() || z5) {
                                                            Boolean boolValueOf = Boolean.valueOf((boolean) z3);
                                                            boolean zBooleanValue = ((Boolean) iegVarA2.h(boolValueOf)).booleanValue();
                                                            mfl mflVar3 = new mfl();
                                                            lheVarA.i(null, mflVar3);
                                                            ieg iegVarA3 = mflVar3.a();
                                                            if (iegVarA3.m()) {
                                                                byte[] bArr2 = (byte[]) ((ieg) iegVarA3.g()).c;
                                                                ContentValues contentValues = new ContentValues();
                                                                contentValues.put("license_cenc_key_set_id", bArr2);
                                                                contentValues.put("license_last_synced_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                                contentValues.put("license_last_synced_sdk_int", Integer.valueOf(ksk.b));
                                                                contentValues.put("license_force_sync", boolValueOf);
                                                                contentValues.putNull("license_activation");
                                                                ktw.u((lyz) wfnVar.d, (kuh) wfnVar.j, contentValues);
                                                            } else {
                                                                Throwable thI = iegVarA3.i();
                                                                if (zBooleanValue && !kwy.h(thI)) {
                                                                    throw new lgq("License task failed " + wfnVar.j.toString(), thI);
                                                                }
                                                                wfnVar.j(thI);
                                                            }
                                                        } else {
                                                            wfnVar.j(iegVarA2.i());
                                                        }
                                                    }
                                                    lheVarA.c();
                                                    wfnVar.f.B(((kuh) wfnVar.j).b);
                                                } catch (Throwable th) {
                                                    lheVarA.c();
                                                    throw th;
                                                }
                                            } else {
                                                wfnVar.j(new lgq(a.ce(i7, i8, "Security level mismatch: ", ", ")));
                                            }
                                        } catch (eqc e6) {
                                            wfnVar.j(e6);
                                        }
                                    }
                                } catch (Exception e7) {
                                    throw new lgq("unexpected exception executing task ".concat(String.valueOf(wfnVar.getClass().getSimpleName())), e7);
                                }
                            } catch (lgq e8) {
                                e = e8;
                                strB = str;
                                krd.d(hhh.c(kuhVar2, "Refresh failure "), e);
                                i4 = z3;
                                i3 = 3;
                                i2 = 1;
                                z4 = true;
                            }
                        }
                        i4 = z3;
                        i3 = 3;
                        i2 = 1;
                    }
                    boolean z6 = i4;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return z6;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
            }
            int i9 = i4;
            if (z4) {
                krd.c("Refresh failure - try release");
                lyz lyzVar3 = this.s;
                Cursor cursorQuery2 = lyzVar3.b().query("purchased_assets", a, "license_release_pending", null, null, null, "pinned");
                while (cursorQuery2.moveToNext()) {
                    try {
                        boolean zH4 = mei.h(cursorQuery2, 3);
                        boolean zH5 = mei.h(cursorQuery2, 5);
                        int i10 = i9;
                        kuh kuhVar3 = new kuh(ksn.b(cursorQuery2.getString(i10)), cursorQuery2.getString(1));
                        if (zH4) {
                            try {
                                lyzVar = lyzVar3;
                            } catch (lgq e9) {
                                e = e9;
                                lyzVar = lyzVar3;
                                kuhVar = kuhVar3;
                            }
                            try {
                                mdw.f(kuhVar3, this.m, this.j, this.t, this.i, lyzVar, this.k, this.l, strB);
                            } catch (lgq e10) {
                                e = e10;
                                kuhVar = kuhVar3;
                                krd.d(hhh.c(kuhVar, "Refresh release failure "), e);
                                i9 = i10;
                                lyzVar3 = lyzVar;
                            }
                        } else {
                            lyzVar = lyzVar3;
                            kuhVar = kuhVar3;
                            if (zH5) {
                                try {
                                    krd.f(hhh.c(kuhVar, "Supposed to release legacy license "));
                                } catch (lgq e11) {
                                    e = e11;
                                    krd.d(hhh.c(kuhVar, "Refresh release failure "), e);
                                    i9 = i10;
                                    lyzVar3 = lyzVar;
                                }
                            } else {
                                krd.f(hhh.c(kuhVar, "Downloading lacks license information "));
                            }
                        }
                        i9 = i10;
                        lyzVar3 = lyzVar;
                    } finally {
                        if (cursorQuery2 == null) {
                            throw th;
                        }
                        try {
                            cursorQuery2.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                    }
                }
                int i11 = i9;
                z = i11;
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                    z = i11;
                }
            } else {
                z = i9;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (z4) {
                return z;
            }
            return true;
        } finally {
            wakeLockNewWakeLock.release();
            wifiLockCreateWifiLock.release();
        }
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, lfn] */
    @Override // defpackage.lgr
    public final void a() {
        if (this.i.cW()) {
            return;
        }
        if (((Boolean) xih.a.et(((xih) this.r).b)).booleanValue()) {
            isy isyVar = this.v;
            try {
                gpo gpoVar = new gpo(MoviesWorkerWrapper.class);
                gpoVar.b("refresh_license_forced_v2");
                gpoVar.c((gou) isyVar.a);
                gpoVar.e((gox) isyVar.b);
                cvi cviVarF = gpoVar.f();
                krd.e("Scheduling an immediate forced refresh of licenses.");
                ((ufb) ufn.i(((gpt) ((gpz) isyVar.c).g("refresh_license_forced_v2", 1, cviVarF)).c, new ldl(cviVarF, 4), ugk.a)).t(60L, TimeUnit.SECONDS);
            } catch (Exception e2) {
                krd.f("Unable to force immediate license refresh. Exception=".concat(e2.toString()));
            }
        } else {
            this.l.execute(new jlr(this, 19));
        }
        isy isyVar2 = this.v;
        long jAy = isyVar2.d.ay();
        aabt aabtVar = jAy == 0 ? aabt.a : new aabt(vxr.aw(jAy, 1000));
        try {
            gpo gpoVar2 = new gpo(MoviesWorkerWrapper.class);
            gpoVar2.b("refresh_license_delayed_forced");
            gpoVar2.c((gou) isyVar2.a);
            gpoVar2.e((gox) isyVar2.b);
            gpoVar2.d(aabtVar.a(), TimeUnit.SECONDS);
            cvi cviVarF2 = gpoVar2.f();
            krd.e("Scheduling a delayed forced refresh of licenses in: " + aabtVar.a() + " seconds.");
            ((ufb) ufn.i(((gpt) ((gpz) isyVar2.c).g("refresh_license_delayed_forced", 1, cviVarF2)).c, new ldl(cviVarF2, 2), ugk.a)).t(60L, TimeUnit.SECONDS);
        } catch (Exception e3) {
            krd.f("Unable to force delayed license refresh. Exception=".concat(e3.toString()));
        }
    }

    @Override // defpackage.lgr
    public final synchronized boolean b() {
        lfn lfnVar = this.i;
        if (lfnVar.cW()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorRawQuery = this.s.b().rawQuery(f, new String[]{Long.toString(jCurrentTimeMillis - lfnVar.aS()), Long.toString(jCurrentTimeMillis)});
        try {
            boolean zMoveToNext = cursorRawQuery.moveToNext();
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return zMoveToNext;
        } finally {
        }
    }

    @Override // defpackage.lgr
    public final boolean c() {
        boolean zD;
        if (!this.i.cn()) {
            synchronized (lgr.class) {
                zD = d();
            }
            return zD;
        }
        try {
            ReentrantLock reentrantLock = g;
            if (!reentrantLock.tryLock(0L, TimeUnit.SECONDS)) {
                krd.f("Failed to acquire lock to refresh licenses. Currently waiting threads: " + reentrantLock.getQueueLength());
                return false;
            }
            try {
                boolean zD2 = d();
                reentrantLock.unlock();
                return zD2;
            } catch (Throwable th) {
                g.unlock();
                throw th;
            }
        } catch (InterruptedException unused) {
            krd.f("Failed to acquire lock to refresh licenses. Lock was interrupted");
            return false;
        }
    }
}
