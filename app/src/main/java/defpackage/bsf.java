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
final class bsf extends SQLiteOpenHelper {
    public static final bse a = new bse();
    private final Context b;
    private final bsb c;
    private final brn d;
    private final boolean e;
    private boolean f;
    private final bsr g;
    private boolean h;

    public bsf(Context context, String str, final bsb bsbVar, final brn brnVar, boolean z) {
        String string;
        super(context, str, null, brnVar.b, new DatabaseErrorHandler() { // from class: bsc
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                bse bseVar = bsf.a;
                sQLiteDatabase.getClass();
                brz brzVarA = bseVar.a(bsbVar, sQLiteDatabase);
                Log.e("SupportSQLite", a.c(brzVarA, "Corruption reported by sqlite on database: ", ".path"));
                SQLiteDatabase sQLiteDatabase2 = brzVarA.f;
                brn brnVar2 = brnVar;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        brnVar2.b(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        brzVarA.f.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs == null) {
                        String path2 = brzVarA.f.getPath();
                        if (path2 != null) {
                            brnVar2.b(path2);
                            return;
                        }
                        return;
                    }
                    Iterator<T> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        obj.getClass();
                        brnVar2.b((String) obj);
                    }
                } catch (Throwable th) {
                    if (attachedDbs != null) {
                        Iterator<T> it2 = attachedDbs.iterator();
                        while (it2.hasNext()) {
                            Object obj2 = ((Pair) it2.next()).second;
                            obj2.getClass();
                            brnVar2.b((String) obj2);
                        }
                    } else {
                        String path3 = brzVarA.f.getPath();
                        if (path3 != null) {
                            brnVar2.b(path3);
                        }
                    }
                    throw th;
                }
            }
        });
        this.b = context;
        this.c = bsbVar;
        this.d = brnVar;
        this.e = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.g = new bsr(string, context.getCacheDir());
    }

    public final brz a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return a.a(this.c, sQLiteDatabase);
    }

    public final brm b() {
        SQLiteDatabase writableDatabase;
        brm brmVarA;
        File parentFile;
        try {
            this.g.a((this.h || getDatabaseName() == null) ? false : true);
            this.f = false;
            String databaseName = getDatabaseName();
            boolean z = this.h;
            if (databaseName != null && !z && (parentFile = this.b.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                writableDatabase = super.getWritableDatabase();
                writableDatabase.getClass();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    writableDatabase = super.getWritableDatabase();
                    writableDatabase.getClass();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof bsd) {
                        bsd bsdVar = (bsd) th;
                        Throwable th2 = bsdVar.a;
                        int i = bsdVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new agpg();
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.e) {
                        throw th;
                    }
                    this.b.deleteDatabase(databaseName);
                    try {
                        writableDatabase = super.getWritableDatabase();
                        writableDatabase.getClass();
                    } catch (bsd e) {
                        throw e.a;
                    }
                }
            }
            if (this.f) {
                close();
                brmVarA = b();
            } else {
                brmVarA = a(writableDatabase);
            }
            return brmVarA;
        } finally {
            this.g.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            bsr bsrVar = this.g;
            Map map = bsr.a;
            boolean z = bsrVar.b;
            bsrVar.a(false);
            super.close();
            this.c.a = null;
            this.h = false;
        } finally {
            this.g.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.f && this.d.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            a(sQLiteDatabase);
        } catch (Throwable th) {
            throw new bsd(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            brn brnVar = this.d;
            bsk bskVar = new bsk(a(sQLiteDatabase));
            brj brjVarA = bskVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (brjVarA.l()) {
                    if (brjVarA.b(0) == 0) {
                        z = true;
                    }
                }
                bmd bmdVar = ((bmb) brnVar).a;
                aguj.a(brjVarA, null);
                bmu bmuVar = bmdVar.b;
                bmuVar.b(bskVar);
                if (!z) {
                    bmt bmtVarA = bmuVar.a(bskVar);
                    if (!bmtVarA.a) {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(bmtVarA.b)));
                    }
                }
                bmdVar.b(bskVar);
                bmuVar.f();
                for (bmj bmjVar : bmdVar.c) {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw new bsd(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.f = true;
        try {
            ((bmb) this.d).a(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new bsd(4, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsf.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.f = true;
        try {
            this.d.a(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new bsd(3, th);
        }
    }
}
