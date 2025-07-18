package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import j$.time.Instant;
import java.io.ByteArrayInputStream;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class urq extends urx {
    public final Object b;
    public int c;
    private final Context h;
    private SQLiteOpenHelper i;
    private boolean j;
    private final uru k;
    private static final tvn g = tvn.n("xRPC");
    public static final String[] a = {"CREATE INDEX access ON cache_table(access_ms)"};

    public urq(Context context, uru uruVar, int i, int i2) {
        super(i, i2);
        this.b = new Object();
        this.c = 0;
        this.h = context;
        this.k = uruVar;
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, xso] */
    private final tst e(urr urrVar, String str, Object[] objArr) {
        tst tstVarI = trk.a;
        uro uroVarF = f();
        try {
            SQLiteDatabase sQLiteDatabase = uroVarF.a;
            String strCg = a.cg(str, "SELECT response_data, write_ms, rowid, key_metadata, value_metadata FROM cache_table WHERE (", ")");
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(new urn(objArr, 0), strCg, null, null);
                try {
                    if (cursorRawQueryWithFactory.moveToFirst()) {
                        byte[] blob = cursorRawQueryWithFactory.getBlob(cursorRawQueryWithFactory.getColumnIndexOrThrow("response_data"));
                        long j = cursorRawQueryWithFactory.getLong(cursorRawQueryWithFactory.getColumnIndexOrThrow("rowid"));
                        cursorRawQueryWithFactory.getLong(cursorRawQueryWithFactory.getColumnIndexOrThrow("write_ms"));
                        byte[] blob2 = cursorRawQueryWithFactory.getBlob(cursorRawQueryWithFactory.getColumnIndexOrThrow("key_metadata"));
                        byte[] blob3 = cursorRawQueryWithFactory.getBlob(cursorRawQueryWithFactory.getColumnIndexOrThrow("value_metadata"));
                        sQLiteDatabase.execSQL("UPDATE OR FAIL cache_table SET access_ms=? WHERE rowid=?", new Object[]{Long.valueOf(Instant.now().toEpochMilli()), Long.valueOf(j)});
                        Object objB = urrVar.e.a.b(new ByteArrayInputStream(blob, 0, blob.length));
                        uqe uqeVar = uqe.a;
                        tstVarI = tst.i(new aafi(objB, uiv.m((uqe) vxr.j(blob2, uqeVar)), uiv.m((uqe) vxr.j(blob3, uqeVar))));
                    }
                    if (cursorRawQueryWithFactory != null) {
                        cursorRawQueryWithFactory.close();
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    uroVarF.close();
                    return tstVarI;
                } finally {
                }
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (Throwable th) {
            try {
                uroVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final uro f() {
        uro uroVar;
        File file;
        sjl.b();
        synchronized (this.b) {
            if (this.i == null) {
                uru uruVar = this.k;
                int i = uruVar.a;
                Object obj = uruVar.b;
                Object obj2 = uruVar.c;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    file = new File(((Context) obj).getFilesDir(), (String) obj2);
                } else {
                    if (i2 != 1) {
                        throw new RuntimeException(null, null);
                    }
                    file = new File(((Context) obj).getCacheDir(), (String) obj2);
                }
                sij.x(!file.exists() || file.isDirectory(), "Storage directory must be a directory");
                this.i = new urp(this.h, new File(file, "persistent_resource_pool.db"));
                if (!this.j) {
                    file.mkdirs();
                    this.j = true;
                }
            }
            this.c++;
            uroVar = new uro(this, this.i.getWritableDatabase());
        }
        return uroVar;
    }

    @Override // defpackage.urx
    public final tst a(urw urwVar, urr urrVar) {
        return e(urrVar, "request_data=? AND account_name=? AND cache_name=? AND write_ms>?", new Object[]{urrVar.d.a(urwVar.c.a), urwVar.a.toString(), urwVar.b, Long.valueOf(Instant.now().toEpochMilli() - urz.a)});
    }

    @Override // defpackage.urx
    public final tst b(urw urwVar, urr urrVar) {
        byte[] bArrA = urrVar.d.a(urwVar.c.a);
        long epochMilli = Instant.now().toEpochMilli();
        return e(urrVar, "request_data=? AND account_name=? AND cache_name=? AND write_ms>? AND (expiration_time=-1 OR expiration_time>?)", new Object[]{bArrA, urwVar.a.toString(), urwVar.b, Long.valueOf(epochMilli - urz.a), Long.valueOf(epochMilli)});
    }

    @Override // defpackage.urx
    public final void c() {
        uro uroVarF = f();
        try {
            uroVarF.a.delete("cache_table", null, null);
            uroVarF.close();
        } catch (Throwable th) {
            try {
                uroVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        r6 = r9.getLong(r9.getColumnIndexOrThrow("access_ms"));
     */
    @Override // defpackage.urx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.urw r4, defpackage.xsm r5, defpackage.vvj r6, defpackage.xsm r7, int r8, long r9, java.util.concurrent.TimeUnit r11, defpackage.urr r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urq.d(urw, xsm, vvj, xsm, int, long, java.util.concurrent.TimeUnit, urr):void");
    }
}
