package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghx extends SQLiteOpenHelper {
    private final Context a;
    private final ghl b;
    private final boolean c;
    private boolean d;
    private final gii e;
    private boolean f;
    private final nxb g;

    public ghx(Context context, String str, final nxb nxbVar, ghl ghlVar, boolean z) {
        String string;
        super(context, str, null, ghlVar.a, new DatabaseErrorHandler() { // from class: ghv
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                ghu ghuVarX = gli.X(nxbVar, sQLiteDatabase);
                Log.e("SupportSQLite", a.cj(ghuVarX, "Corruption reported by sqlite on database: ", ".path"));
                if (!ghuVarX.i()) {
                    String strB = ghuVarX.b();
                    if (strB != null) {
                        ghl.a(strB);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = ghuVarX.d.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        ghuVarX.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs == null) {
                        String strB2 = ghuVarX.b();
                        if (strB2 != null) {
                            ghl.a(strB2);
                            return;
                        }
                        return;
                    }
                    Iterator<T> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        obj.getClass();
                        ghl.a((String) obj);
                    }
                } catch (Throwable th) {
                    if (attachedDbs != null) {
                        Iterator<T> it2 = attachedDbs.iterator();
                        while (it2.hasNext()) {
                            Object obj2 = ((Pair) it2.next()).second;
                            obj2.getClass();
                            ghl.a((String) obj2);
                        }
                    } else {
                        String strB3 = ghuVarX.b();
                        if (strB3 != null) {
                            ghl.a(strB3);
                        }
                    }
                    throw th;
                }
            }
        });
        this.a = context;
        this.g = nxbVar;
        this.b = ghlVar;
        this.c = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.e = new gii(string, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final ghu a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return gli.X(this.g, sQLiteDatabase);
    }

    public final ghk b() {
        SQLiteDatabase sQLiteDatabaseC;
        ghk ghkVarA;
        File parentFile;
        try {
            this.e.a((this.f || getDatabaseName() == null) ? false : true);
            this.d = false;
            String databaseName = getDatabaseName();
            boolean z = this.f;
            if (databaseName != null && !z && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                sQLiteDatabaseC = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    sQLiteDatabaseC = c();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof ghw) {
                        ghw ghwVar = (ghw) th;
                        Throwable th2 = ghwVar.a;
                        int i = ghwVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new yfu();
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.c) {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        sQLiteDatabaseC = c();
                    } catch (ghw e) {
                        throw e.a;
                    }
                }
            }
            if (this.d) {
                close();
                ghkVarA = b();
            } else {
                ghkVarA = a(sQLiteDatabaseC);
            }
            return ghkVarA;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            gii giiVar = this.e;
            Map map = gii.a;
            boolean z = giiVar.b;
            giiVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d && this.b.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            throw new ghw(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ghl ghlVar = this.b;
            gic gicVar = new gic(a(sQLiteDatabase));
            ghi ghiVarA = gicVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (ghiVarA.l()) {
                    if (ghiVarA.b(0) == 0) {
                        z = true;
                    }
                }
                ged gedVar = ghlVar.b;
                wef.r(ghiVarA, null);
                gfa gfaVar = gedVar.b;
                gfaVar.a(gicVar);
                if (!z) {
                    xqr xqrVarG = gfaVar.g(gicVar);
                    if (!xqrVarG.a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(xqrVarG.b)));
                    }
                }
                gedVar.a(gicVar);
                gfaVar.e();
                for (gez gezVar : gedVar.c) {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw new ghw(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ghw(4, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r14) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghx.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ghw(3, th);
        }
    }
}
