package defpackage;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import java.io.Closeable;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class smq implements ComponentCallbacks2 {
    public static final tui a = tui.l("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final tst d;
    public final List e;
    public final List f;
    public final Executor i;
    public uhp j;
    public boolean m;
    public final zuw n;
    public final ulp o;
    private final ufv q;
    private ScheduledFuture t;
    public final Set g = new HashSet();
    public final Object h = new Object();
    public final zft p = new zft(this, null);
    private final uha r = new qvj(this, 5);
    public int k = 0;
    private boolean s = false;
    public boolean l = false;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @Deprecated
    public smq(Context context, ScheduledExecutorService scheduledExecutorService, ulp ulpVar, ufv ufvVar, vvd vvdVar) {
        this.q = ufvVar;
        this.c = scheduledExecutorService;
        this.o = ulpVar;
        this.i = new uib(scheduledExecutorService);
        this.b = context;
        this.d = (tst) vvdVar.b;
        this.e = vvdVar.c;
        this.f = vvdVar.d;
        this.n = (zuw) vvdVar.a;
    }

    public static uge a(uhp uhpVar, Closeable... closeableArr) {
        uhpVar.getClass();
        zft zftVar = new zft(closeableArr);
        Executor executor = ugk.a;
        uho uhoVar = uge.a;
        ugb ugbVar = new ugb();
        uik uikVar = new uik(new ufy(zftVar, ugbVar, 0));
        executor.execute(uikVar);
        return new uge(uikVar, ugbVar).b(new smh(uhpVar, 4), executor);
    }

    public static SQLiteDatabase e(Context context, File file, zuw zuwVar, tst tstVar, List list, List list2) {
        SQLiteDatabase sQLiteDatabaseH = h(context, zuwVar, file);
        try {
            if (!i(sQLiteDatabaseH, zuwVar, list, list2)) {
                return sQLiteDatabaseH;
            }
            sQLiteDatabaseH.close();
            SQLiteDatabase sQLiteDatabaseH2 = h(context, zuwVar, file);
            try {
                tql tqlVarQ = szg.q("Configuring reopened database.");
                try {
                    sij.x(!i(sQLiteDatabaseH2, zuwVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                    tqlVarQ.close();
                    return sQLiteDatabaseH2;
                } catch (Throwable th) {
                    try {
                        tqlVarQ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (SQLiteException e) {
                e = e;
                sQLiteDatabaseH2.close();
                throw new smm("Failed to open database.", e);
            } catch (IllegalStateException e2) {
                e = e2;
                sQLiteDatabaseH2.close();
                throw new smm("Failed to open database.", e);
            } catch (Throwable th3) {
                sQLiteDatabaseH2.close();
                throw th3;
            }
        } catch (SQLiteException e3) {
            sQLiteDatabaseH.close();
            throw new smm("Failed to open database.", e3);
        } catch (Throwable th4) {
            sQLiteDatabaseH.close();
            throw th4;
        }
    }

    public static boolean f(Context context, zuw zuwVar) {
        int i = zuwVar.a;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private static boolean g(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        int version = sQLiteDatabase.getVersion();
        ((tug) ((tug) a.b()).j("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "upgradeDatabase", 747, "AsyncSQLiteOpenHelper.java")).t("Database version is %d", version);
        int size = list.size();
        int size2 = list.size();
        if (version > size) {
            throw new IllegalStateException(sij.m("Can't downgrade from version %s to version %s", Integer.valueOf(version), Integer.valueOf(size2)));
        }
        rzy rzyVar = new rzy(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            try {
                try {
                    if (version != list.size()) {
                        tql tqlVarQ = szg.q("Applying upgrade steps");
                        try {
                            Iterator it = list.subList(version, list.size()).iterator();
                            while (it.hasNext()) {
                                ((smv) it.next()).a(rzyVar);
                            }
                            tqlVarQ.close();
                            sQLiteDatabase.setVersion(list.size());
                        } catch (Throwable th) {
                            try {
                                tqlVarQ.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    Iterator it2 = list2.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    return version != sQLiteDatabase.getVersion();
                } catch (SQLiteDiskIOException e) {
                    e = e;
                    throw new smp("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteFullException e2) {
                    e = e2;
                    throw new smp("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteOutOfMemoryException e3) {
                    e = e3;
                    throw new smp("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (SQLiteTableLockedException e4) {
                    e = e4;
                    throw new smp("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (Throwable th3) {
                    throw new smo(th3);
                }
            } catch (SQLiteDatabaseLockedException e5) {
                e = e5;
                throw new smp("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
            } catch (InterruptedException e6) {
                throw new smp("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e6);
            }
        } catch (Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    private static SQLiteDatabase h(Context context, zuw zuwVar, File file) {
        boolean zF = f(context, zuwVar);
        int i = zF ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (zF) {
                sQLiteDatabaseOpenDatabase.enableWriteAheadLogging();
            }
            return sQLiteDatabaseOpenDatabase;
        } catch (Throwable th) {
            throw new smm("Failed to open database.", th);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    private static boolean i(SQLiteDatabase sQLiteDatabase, zuw zuwVar, List list, List list2) throws SQLException {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        Iterator it = zuwVar.b.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf((String) it.next())));
        }
        return g(sQLiteDatabase, list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[Catch: all -> 0x0081, Merged into TryCatch #2 {all -> 0x007f, blocks: (B:3:0x0003, B:4:0x0005, B:20:0x0051, B:22:0x0057, B:23:0x005a, B:28:0x007e, B:5:0x0006, B:10:0x0016, B:11:0x0021, B:15:0x0045, B:14:0x0041, B:16:0x0047, B:18:0x004d, B:19:0x0050), top: B:40:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.uge b() {
        /*
            r8 = this;
            java.util.WeakHashMap r0 = defpackage.tqg.a
            r0 = 0
            java.lang.Object r1 = r8.h     // Catch: java.lang.Throwable -> L7f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L7f
            int r2 = r8.k     // Catch: java.lang.Throwable -> L81
            r3 = 1
            int r2 = r2 + r3
            r8.k = r2     // Catch: java.lang.Throwable -> L81
            uhp r4 = r8.j     // Catch: java.lang.Throwable -> L81
            r5 = 0
            if (r4 != 0) goto L47
            if (r2 != r3) goto L15
            r2 = r3
            goto L16
        L15:
            r2 = r5
        L16:
            java.lang.String r4 = "DB was null with nonzero refcount"
            defpackage.sij.x(r2, r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "Opening database"
            tql r0 = defpackage.szg.q(r2)     // Catch: java.lang.Throwable -> L81
            ufv r2 = r8.q     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            java.util.concurrent.Executor r4 = r8.i     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            uhp r2 = defpackage.sfy.G(r2, r4)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            uha r6 = r8.r     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            java.util.concurrent.ScheduledExecutorService r7 = r8.c     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            defpackage.sfy.K(r2, r6, r7)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            pgc r6 = new pgc     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            r7 = 18
            r6.<init>(r8, r7)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            tsl r6 = defpackage.trc.a(r6)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            uhp r2 = defpackage.ufn.i(r2, r6, r4)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L81
            goto L45
        L40:
            r2 = move-exception
            uhp r2 = defpackage.sfy.B(r2)     // Catch: java.lang.Throwable -> L81
        L45:
            r8.j = r2     // Catch: java.lang.Throwable -> L81
        L47:
            uhp r2 = r8.j     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.ScheduledFuture r4 = r8.t     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L50
            r4.cancel(r3)     // Catch: java.lang.Throwable -> L81
        L50:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L81
            uhp r1 = defpackage.sfy.D(r2)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L5a
            r0.a(r1)     // Catch: java.lang.Throwable -> L7f
        L5a:
            java.io.Closeable[] r2 = new java.io.Closeable[r3]     // Catch: java.lang.Throwable -> L7f
            rts r3 = new rts     // Catch: java.lang.Throwable -> L7f
            r4 = 3
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L7f
            r2[r5] = r3     // Catch: java.lang.Throwable -> L7f
            uge r1 = a(r1, r2)     // Catch: java.lang.Throwable -> L7f
            smh r2 = new smh     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r8, r4)     // Catch: java.lang.Throwable -> L7f
            uga r2 = defpackage.trc.d(r2)     // Catch: java.lang.Throwable -> L7f
            ugk r3 = defpackage.ugk.a     // Catch: java.lang.Throwable -> L7f
            uge r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            return r1
        L7d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L81
            throw r2     // Catch: java.lang.Throwable -> L7f
        L7f:
            r1 = move-exception
            goto L83
        L81:
            r2 = move-exception
            goto L7d
        L83:
            if (r0 == 0) goto L88
            r0.close()
        L88:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.smq.b():uge");
    }

    public final void c() {
        if (this.k != 0 || this.j == null) {
            return;
        }
        if (this.s) {
            d();
            return;
        }
        this.t = this.c.schedule(new slt(this, 2), 60L, TimeUnit.SECONDS);
        if (this.m) {
            return;
        }
        sfy.K(this.j, new qvj(this, 6), this.i);
    }

    public final void d() {
        this.i.execute(new slt(this, 3));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.h) {
            this.s = i >= 40;
            c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
