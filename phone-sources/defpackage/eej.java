package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eej {
    static {
        dzz.b("media3.database");
    }

    public static int a(SQLiteDatabase sQLiteDatabase, int i, String str) throws eei {
        try {
            if (!edt.aq(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{krh.VERSION}, "feature = ? AND instance_uid = ?", d(i, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return -1;
                }
                cursorQuery.moveToNext();
                int i2 = cursorQuery.getInt(0);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return i2;
            } finally {
            }
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws eei, SQLException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put(krh.VERSION, Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, String str) throws eei {
        try {
            if (edt.aq(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", d(1, str));
            }
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    private static String[] d(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }
}
