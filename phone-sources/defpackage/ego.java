package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ego implements egq {
    private static final String[] a = {"id", "key", "metadata"};
    private final SparseArray b = new SparseArray();
    private String c;
    private String d;
    private final kdh e;

    public ego(kdh kdhVar) {
        this.e = kdhVar;
    }

    private static String i(String str) {
        return "ExoPlayerCacheIndex".concat(String.valueOf(str));
    }

    private final void j(SQLiteDatabase sQLiteDatabase, egn egnVar) throws SQLException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        egr.f(egnVar.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(egnVar.a));
        contentValues.put("key", egnVar.b);
        contentValues.put("metadata", byteArray);
        String str = this.d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    private static void k(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str));
    }

    private final void l(SQLiteDatabase sQLiteDatabase) throws eei, SQLException {
        String str = this.c;
        str.getClass();
        eej.b(sQLiteDatabase, 1, str, 1);
        String str2 = this.d;
        str2.getClass();
        k(sQLiteDatabase, str2);
        sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    private static void m(kdh kdhVar, String str) throws eei {
        try {
            String strI = i(str);
            SQLiteDatabase sQLiteDatabaseJ = kdhVar.j();
            sQLiteDatabaseJ.beginTransactionNonExclusive();
            try {
                eej.c(sQLiteDatabaseJ, str);
                k(sQLiteDatabaseJ, strI);
                sQLiteDatabaseJ.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseJ.endTransaction();
            }
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    @Override // defpackage.egq
    public final void a() throws eei {
        String str = this.c;
        str.getClass();
        m(this.e, str);
    }

    @Override // defpackage.egq
    public final void b(long j) {
        String hexString = Long.toHexString(j);
        this.c = hexString;
        this.d = i(hexString);
    }

    @Override // defpackage.egq
    public final void c(HashMap map, SparseArray sparseArray) throws eei {
        a.ab(this.b.size() == 0);
        try {
            kdh kdhVar = this.e;
            SQLiteDatabase sQLiteDatabaseI = kdhVar.i();
            String str = this.c;
            str.getClass();
            if (eej.a(sQLiteDatabaseI, 1, str) != 1) {
                SQLiteDatabase sQLiteDatabaseJ = kdhVar.j();
                sQLiteDatabaseJ.beginTransactionNonExclusive();
                try {
                    l(sQLiteDatabaseJ);
                    sQLiteDatabaseJ.setTransactionSuccessful();
                    sQLiteDatabaseJ.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabaseJ.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase sQLiteDatabaseI2 = this.e.i();
            String str2 = this.d;
            str2.getClass();
            Cursor cursorQuery = sQLiteDatabaseI2.query(str2, a, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    egn egnVar = new egn(i, string, egr.c(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2)))));
                    String str3 = egnVar.b;
                    map.put(str3, egnVar);
                    sparseArray.put(egnVar.a, str3);
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new eei(e);
        }
    }

    @Override // defpackage.egq
    public final void d(egn egnVar, boolean z) {
        if (z) {
            this.b.delete(egnVar.a);
        } else {
            this.b.put(egnVar.a, null);
        }
    }

    @Override // defpackage.egq
    public final void e(egn egnVar) {
        this.b.put(egnVar.a, egnVar);
    }

    @Override // defpackage.egq
    public final void f(HashMap map) throws eei {
        try {
            SQLiteDatabase sQLiteDatabaseJ = this.e.j();
            sQLiteDatabaseJ.beginTransactionNonExclusive();
            try {
                l(sQLiteDatabaseJ);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    j(sQLiteDatabaseJ, (egn) it.next());
                }
                sQLiteDatabaseJ.setTransactionSuccessful();
                this.b.clear();
            } finally {
                sQLiteDatabaseJ.endTransaction();
            }
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    @Override // defpackage.egq
    public final void g(HashMap map) throws eei {
        SparseArray sparseArray = this.b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabaseJ = this.e.j();
            sQLiteDatabaseJ.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    egn egnVar = (egn) sparseArray.valueAt(i);
                    if (egnVar == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = this.d;
                        str.getClass();
                        sQLiteDatabaseJ.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        j(sQLiteDatabaseJ, egnVar);
                    }
                } finally {
                    sQLiteDatabaseJ.endTransaction();
                }
            }
            sQLiteDatabaseJ.setTransactionSuccessful();
            sparseArray.clear();
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    @Override // defpackage.egq
    public final boolean h() throws eei {
        try {
            SQLiteDatabase sQLiteDatabaseI = this.e.i();
            String str = this.c;
            str.getClass();
            return eej.a(sQLiteDatabaseI, 1, str) != -1;
        } catch (SQLException e) {
            throw new eei(e);
        }
    }
}
