package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egi {
    private static final String[] a = {"name", "length", "last_touch_timestamp"};
    private String b;
    private final kdh c;

    public egi(kdh kdhVar) {
        this.c = kdhVar;
    }

    public final Map a() throws eei {
        try {
            this.b.getClass();
            Cursor cursorQuery = this.c.i().query(this.b, a, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new fhk(cursorQuery.getLong(1), cursorQuery.getLong(2), null));
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    public final void b(long j) throws eei {
        try {
            String hexString = Long.toHexString(j);
            this.b = "ExoPlayerCacheFileMetadata".concat(String.valueOf(hexString));
            kdh kdhVar = this.c;
            if (eej.a(kdhVar.i(), 2, hexString) != 1) {
                SQLiteDatabase sQLiteDatabaseJ = kdhVar.j();
                sQLiteDatabaseJ.beginTransactionNonExclusive();
                try {
                    eej.b(sQLiteDatabaseJ, 2, hexString, 1);
                    sQLiteDatabaseJ.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(this.b)));
                    sQLiteDatabaseJ.execSQL("CREATE TABLE " + this.b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    sQLiteDatabaseJ.setTransactionSuccessful();
                } finally {
                    sQLiteDatabaseJ.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    public final void c(String str) throws eei {
        this.b.getClass();
        try {
            this.c.j().delete(this.b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    public final void d(Set set) throws eei {
        this.b.getClass();
        try {
            SQLiteDatabase sQLiteDatabaseJ = this.c.j();
            sQLiteDatabaseJ.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    sQLiteDatabaseJ.delete(this.b, "name = ?", new String[]{(String) it.next()});
                }
                sQLiteDatabaseJ.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseJ.endTransaction();
            }
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    public final void e(String str, long j, long j2) throws eei, SQLException {
        this.b.getClass();
        try {
            SQLiteDatabase sQLiteDatabaseJ = this.c.j();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            sQLiteDatabaseJ.replaceOrThrow(this.b, null, contentValues);
        } catch (SQLException e) {
            throw new eei(e);
        }
    }
}
