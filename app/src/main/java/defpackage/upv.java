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
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class upv implements ComponentCallbacks2 {
    public static final zdy a = zdy.h("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final upu d;
    public final yqt e;
    public final List f;
    public final List g;
    public final uqa h;
    public final Executor k;
    public zyd l;
    public boolean o;
    private final zvh q;
    private ScheduledFuture t;
    public final Set i = new HashSet();
    public final Object j = new Object();
    public final upn p = new upn(this);
    private final zxe r = new upo(this);
    public int m = 0;
    private boolean s = false;
    public boolean n = false;

    @Deprecated
    public upv(Context context, ScheduledExecutorService scheduledExecutorService, upu upuVar, zvh zvhVar, uqe uqeVar) {
        this.q = zvhVar;
        this.c = scheduledExecutorService;
        this.d = upuVar;
        this.k = new zyt(scheduledExecutorService);
        this.b = context;
        this.e = uqeVar.a;
        this.f = uqeVar.b;
        this.g = uqeVar.c;
        this.h = uqeVar.d;
    }

    public static SQLiteDatabase a(Context context, File file, uqa uqaVar, yqt yqtVar, List list, List list2) {
        SQLiteDatabase sQLiteDatabaseI = i(context, uqaVar, file);
        try {
            if (yqtVar.g()) {
                yqtVar.c();
                if (sQLiteDatabaseI.getVersion() <= 0) {
                    wvx wvxVarF = wzg.f("Dropping tables.", wwb.a, true);
                    try {
                        sQLiteDatabaseI.close();
                        f(file);
                        sQLiteDatabaseI = i(context, uqaVar, file);
                        yqtVar.c();
                        sQLiteDatabaseI.setVersion(1);
                        wvxVarF.close();
                    } finally {
                    }
                }
            }
            try {
                if (!j(sQLiteDatabaseI, uqaVar, yqtVar, list, list2)) {
                    return sQLiteDatabaseI;
                }
                sQLiteDatabaseI.close();
                SQLiteDatabase sQLiteDatabaseI2 = i(context, uqaVar, file);
                try {
                    wvx wvxVarF2 = wzg.f("Configuring reopened database.", wwb.a, true);
                    try {
                        yqw.M(!j(sQLiteDatabaseI2, uqaVar, yqtVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                        wvxVarF2.close();
                        return sQLiteDatabaseI2;
                    } catch (Throwable th) {
                        try {
                            wvxVarF2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    sQLiteDatabaseI2.close();
                    throw new upq("Failed to open database.", e);
                } catch (IllegalStateException e2) {
                    e = e2;
                    sQLiteDatabaseI2.close();
                    throw new upq("Failed to open database.", e);
                } catch (Throwable th3) {
                    sQLiteDatabaseI2.close();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                sQLiteDatabaseI.close();
                throw new upq("Failed to open database.", e3);
            } catch (Throwable th4) {
                sQLiteDatabaseI.close();
                throw th4;
            }
        } catch (upr e4) {
            throw new upq("Failed to drop tables to apply new schema.", e4);
        }
    }

    public static zwc b(final zyd zydVar, final Closeable... closeableArr) {
        zydVar.getClass();
        zvx zvxVar = new zvx() { // from class: upl
            @Override // defpackage.zvx
            public final Object a(zvz zvzVar) {
                for (int i = 0; i <= 0; i++) {
                    zvzVar.a(closeableArr[i], zwk.a);
                }
                return null;
            }
        };
        zwk zwkVar = zwk.a;
        return zwc.c(zvxVar, zwkVar).e(new zvv() { // from class: upm
            @Override // defpackage.zvv
            public final zwc a(zvz zvzVar, Object obj) {
                return new zwc(zydVar);
            }
        }, zwkVar);
    }

    public static void f(File file) throws upr {
        File file2 = new File(String.valueOf(file.getPath()).concat("-wal"));
        File file3 = new File(String.valueOf(file.getPath()).concat("-journal"));
        File file4 = new File(String.valueOf(file.getPath()).concat("-shm"));
        try {
            if ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && ((!file4.exists() || file4.delete()) && file.delete()))) {
            } else {
                throw new upr(String.format("Unable to clean up database %s", file.getAbsolutePath()));
            }
        } catch (Throwable th) {
            throw new upr(String.format("Unable to clean up database %s", file.getAbsolutePath()), th);
        }
    }

    public static boolean g(Context context, uqa uqaVar) {
        int i = uqaVar.b;
        return !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private static int h(SQLiteDatabase sQLiteDatabase, yqt yqtVar) {
        if (!yqtVar.g()) {
            return sQLiteDatabase.getVersion();
        }
        int version = sQLiteDatabase.getVersion();
        yqtVar.c();
        return version - 1;
    }

    private static SQLiteDatabase i(Context context, uqa uqaVar, File file) {
        boolean zG = g(context, uqaVar);
        int i = zG ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (zG) {
                sQLiteDatabaseOpenDatabase.enableWriteAheadLogging();
            }
            return sQLiteDatabaseOpenDatabase;
        } catch (Throwable th) {
            throw new upq("Failed to open database.", th);
        }
    }

    private static boolean j(SQLiteDatabase sQLiteDatabase, uqa uqaVar, yqt yqtVar, List list, List list2) throws SQLException {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        Iterator it = uqaVar.a.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf((String) it.next())));
        }
        return k(sQLiteDatabase, yqtVar, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean k(SQLiteDatabase sQLiteDatabase, yqt yqtVar, List list, List list2) {
        int iH = h(sQLiteDatabase, yqtVar);
        int i = ((zcg) list).d;
        yqw.Y(iH <= i, "Can't downgrade from version %s to version %s", iH, i);
        uqk uqkVar = new uqk(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            if (iH != i) {
                try {
                    try {
                        wvx wvxVarF = wzg.f("Applying upgrade steps", wwb.a, true);
                        try {
                            Iterator it = ((yyk) list).subList(iH, i).iterator();
                            while (it.hasNext()) {
                                uqkVar.c(((uqc) it.next()).a);
                            }
                            wvxVarF.close();
                            if (yqtVar.g()) {
                                yqtVar.c();
                                sQLiteDatabase.setVersion(i + 1);
                            } else {
                                sQLiteDatabase.setVersion(i);
                            }
                        } catch (Throwable th) {
                            try {
                                wvxVarF.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (SQLiteDiskIOException e) {
                        e = e;
                        throw new upt("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (SQLiteFullException e2) {
                        e = e2;
                        throw new upt("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (SQLiteOutOfMemoryException e3) {
                        e = e3;
                        throw new upt("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (SQLiteTableLockedException e4) {
                        e = e4;
                        throw new upt("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (Throwable th3) {
                        throw new ups(th3);
                    }
                } catch (SQLiteDatabaseLockedException e5) {
                    e = e5;
                    throw new upt("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (InterruptedException e6) {
                    throw new upt("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e6);
                }
            }
            zdm zdmVarListIterator = ((yyk) list2).listIterator(0);
            if (zdmVarListIterator.hasNext()) {
                throw null;
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return iH != h(sQLiteDatabase, yqtVar);
        } catch (Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[Catch: all -> 0x0081, Merged into TryCatch #2 {all -> 0x007f, blocks: (B:3:0x0005, B:4:0x0007, B:20:0x0052, B:22:0x0058, B:23:0x005b, B:28:0x007e, B:5:0x0008, B:10:0x0017, B:11:0x0024, B:15:0x0046, B:14:0x0042, B:16:0x0048, B:18:0x004e, B:19:0x0051), top: B:40:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zwc c() {
        /*
            r8 = this;
            r0 = 0
            defpackage.wum.w(r0)
            r1 = 0
            java.lang.Object r2 = r8.j     // Catch: java.lang.Throwable -> L7f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7f
            int r3 = r8.m     // Catch: java.lang.Throwable -> L81
            r4 = 1
            int r3 = r3 + r4
            r8.m = r3     // Catch: java.lang.Throwable -> L81
            zyd r5 = r8.l     // Catch: java.lang.Throwable -> L81
            if (r5 != 0) goto L48
            if (r3 != r4) goto L16
            r3 = r4
            goto L17
        L16:
            r3 = r0
        L17:
            java.lang.String r5 = "DB was null with nonzero refcount"
            defpackage.yqw.M(r3, r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "Opening database"
            wwc r5 = defpackage.wwb.a     // Catch: java.lang.Throwable -> L81
            wvx r1 = defpackage.wzg.f(r3, r5, r4)     // Catch: java.lang.Throwable -> L81
            zvh r3 = r8.q     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            java.util.concurrent.Executor r5 = r8.k     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            zyd r3 = defpackage.zxn.l(r3, r5)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            zxe r6 = r8.r     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            java.util.concurrent.ScheduledExecutorService r7 = r8.c     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            defpackage.zxn.p(r3, r6, r7)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            uph r6 = new uph     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            r6.<init>()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            yqi r6 = defpackage.wyo.a(r6)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            zyd r3 = defpackage.zuz.g(r3, r6, r5)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L81
            goto L46
        L41:
            r3 = move-exception
            zyd r3 = defpackage.zxn.g(r3)     // Catch: java.lang.Throwable -> L81
        L46:
            r8.l = r3     // Catch: java.lang.Throwable -> L81
        L48:
            zyd r3 = r8.l     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.ScheduledFuture r5 = r8.t     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L51
            r5.cancel(r4)     // Catch: java.lang.Throwable -> L81
        L51:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
            zyd r2 = defpackage.zxn.i(r3)     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L5b
            r1.a(r2)     // Catch: java.lang.Throwable -> L7f
        L5b:
            java.io.Closeable[] r3 = new java.io.Closeable[r4]     // Catch: java.lang.Throwable -> L7f
            upj r4 = new upj     // Catch: java.lang.Throwable -> L7f
            r4.<init>()     // Catch: java.lang.Throwable -> L7f
            r3[r0] = r4     // Catch: java.lang.Throwable -> L7f
            zwc r0 = b(r2, r3)     // Catch: java.lang.Throwable -> L7f
            upk r2 = new upk     // Catch: java.lang.Throwable -> L7f
            r2.<init>()     // Catch: java.lang.Throwable -> L7f
            zvv r2 = defpackage.wyo.d(r2)     // Catch: java.lang.Throwable -> L7f
            zwk r3 = defpackage.zwk.a     // Catch: java.lang.Throwable -> L7f
            zwc r0 = r0.e(r2, r3)     // Catch: java.lang.Throwable -> L7f
            if (r1 == 0) goto L7c
            r1.close()
        L7c:
            return r0
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            goto L83
        L81:
            r0 = move-exception
            goto L7d
        L83:
            if (r1 == 0) goto L88
            r1.close()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upv.c():zwc");
    }

    public final void d() {
        if (this.m != 0 || this.l == null) {
            return;
        }
        if (this.s) {
            e();
            return;
        }
        this.t = this.c.schedule(new Runnable() { // from class: upg
            @Override // java.lang.Runnable
            public final void run() {
                upv upvVar = this.a;
                synchronized (upvVar.j) {
                    if (upvVar.m == 0) {
                        upvVar.e();
                    }
                }
            }
        }, 60L, TimeUnit.SECONDS);
        if (this.o) {
            return;
        }
        zxn.p(this.l, new upp(this), this.k);
    }

    public final void e() {
        this.k.execute(new Runnable() { // from class: upi
            @Override // java.lang.Runnable
            public final void run() {
                upv upvVar = this.a;
                synchronized (upvVar.j) {
                    zyd zydVar = upvVar.l;
                    if (upvVar.m == 0 && zydVar != null) {
                        upvVar.l = null;
                        if (!zydVar.cancel(true)) {
                            try {
                                ((SQLiteDatabase) zxn.o(zydVar)).close();
                            } catch (ExecutionException unused) {
                            }
                        }
                        upvVar.b.unregisterComponentCallbacks(upvVar);
                        Iterator it = upvVar.i.iterator();
                        while (it.hasNext()) {
                            if (((WeakReference) it.next()).get() == null) {
                                it.remove();
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.j) {
            this.s = i >= 40;
            d();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
