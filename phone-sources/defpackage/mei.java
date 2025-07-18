package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mei {
    public static final /* synthetic */ int a = 0;
    private static final List b = krh.i('%', '_');

    public static int a(Cursor cursor, int i, int i2) {
        return (i < 0 || cursor.isNull(i)) ? i2 : cursor.getInt(i);
    }

    public static long b(Cursor cursor, int i, long j) {
        return (i < 0 || cursor.isNull(i)) ? j : cursor.getLong(i);
    }

    public static String c(String str) {
        return str.concat(" LIKE ? ESCAPE '!'");
    }

    public static String d(String str, int i) {
        a.H(i > 0);
        StringBuilder sb = new StringBuilder(str);
        sb.append(" IN (?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        sb.append(")");
        return sb.toString();
    }

    public static String e(String str) {
        return f(str, b, '!');
    }

    public static String f(String str, List list, char c) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == c || list.contains(Character.valueOf(cCharAt))) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static void g(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    String strCz = a.cz(string2, string, "DROP ", " IF EXISTS ");
                    try {
                        sQLiteDatabase.execSQL(strCz);
                    } catch (SQLException e) {
                        krd.d(a.cr(strCz, "Error executing "), e);
                    }
                }
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    public static boolean h(Cursor cursor, int i) {
        return cursor.getInt(i) != 0;
    }

    public static boolean i(Cursor cursor, int i) {
        return (i < 0 || cursor.isNull(i) || cursor.getInt(i) == 0) ? false : true;
    }

    public static String j(Cursor cursor, int i) {
        return (i < 0 || cursor.isNull(i)) ? "" : cursor.getString(i);
    }

    public static void k(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                sb.append(" AND ");
            }
            sb.append(strArr[i]);
            sb.append(" IS ");
            DatabaseUtils.appendValueToSql(sb, contentValues.get(strArr[i]));
        }
        int iUpdate = sQLiteDatabase.update(str, contentValues, sb.toString(), null);
        if (iUpdate == 1) {
            return;
        }
        if (iUpdate > 1) {
            throw new IllegalArgumentException("Multiple rows updated");
        }
        sQLiteDatabase.replace(str, null, contentValues);
    }
}
