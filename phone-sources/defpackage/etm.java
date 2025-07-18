package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etm implements euo {
    private static final String c = k(3, 4);
    private static final String[] d = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final kdh b;
    private boolean g;
    private final String e = "";
    public final String a = "ExoPlayerDownloads";
    private final Object f = new Object();

    public etm(kdh kdhVar) {
        this.b = kdhVar;
    }

    public static etn b(Cursor cursor) {
        int i;
        byte[] blob = cursor.getBlob(14);
        int i2 = 0;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        eue eueVar = new eue(string, Uri.parse(string2));
        eueVar.b(cursor.getString(1));
        eueVar.a = l(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        eueVar.b = blob;
        eueVar.c = cursor.getString(4);
        eueVar.d = cursor.getBlob(5);
        euh euhVarA = eueVar.a();
        eud eudVar = new eud();
        eudVar.a = cursor.getLong(13);
        eudVar.b = cursor.getFloat(12);
        int i3 = cursor.getInt(6);
        if (i3 == 4) {
            i2 = cursor.getInt(11);
            i = 4;
        } else {
            i = i3;
        }
        return new etn(euhVarA, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2, eudVar);
    }

    private final Cursor j(String str, String[] strArr) throws eei {
        try {
            return this.b.i().query(this.a, d, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e) {
            throw new eei(e);
        }
    }

    private static String k(int... iArr) {
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    private static List l(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : edt.at(str, ",")) {
                String[] strArrAt = edt.at(str2, "\\.");
                a.ab(strArrAt.length == 3);
                arrayList.add(new eas(Integer.parseInt(strArrAt[0]), Integer.parseInt(strArrAt[1]), Integer.parseInt(strArrAt[2])));
            }
        }
        return arrayList;
    }

    private final void m(etn etnVar, SQLiteDatabase sQLiteDatabase) throws SQLException {
        euh euhVar = etnVar.a;
        byte[] bArr = euhVar.e;
        if (bArr == null) {
            bArr = edt.b;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", euhVar.a);
        contentValues.put("mime_type", euhVar.c);
        contentValues.put("uri", euhVar.b.toString());
        List list = euhVar.d;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            eas easVar = (eas) list.get(i);
            sb.append(easVar.d);
            sb.append('.');
            sb.append(easVar.e);
            sb.append('.');
            sb.append(easVar.f);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", euhVar.f);
        contentValues.put("data", euhVar.g);
        contentValues.put("state", Integer.valueOf(etnVar.b));
        contentValues.put("start_time_ms", Long.valueOf(etnVar.c));
        contentValues.put("update_time_ms", Long.valueOf(etnVar.d));
        contentValues.put("content_length", Long.valueOf(etnVar.e));
        contentValues.put("stop_reason", Integer.valueOf(etnVar.f));
        contentValues.put("failure_reason", Integer.valueOf(etnVar.g));
        contentValues.put("percent_downloaded", Float.valueOf(etnVar.a()));
        contentValues.put("bytes_downloaded", Long.valueOf(etnVar.b()));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.a, null, contentValues);
    }

    @Override // defpackage.ety
    public final etn a(String str) throws eei {
        c();
        try {
            Cursor cursorJ = j("id = ?", new String[]{str});
            try {
                if (cursorJ.getCount() == 0) {
                    if (cursorJ == null) {
                        return null;
                    }
                    cursorJ.close();
                    return null;
                }
                cursorJ.moveToNext();
                etn etnVarB = b(cursorJ);
                if (cursorJ != null) {
                    cursorJ.close();
                }
                return etnVarB;
            } finally {
            }
        } catch (SQLiteException e) {
            throw new eei(e);
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i;
        int i2;
        synchronized (this.f) {
            if (this.g) {
                return;
            }
            try {
                kdh kdhVar = this.b;
                SQLiteDatabase sQLiteDatabaseI = kdhVar.i();
                String str = this.e;
                int iA = eej.a(sQLiteDatabaseI, 0, str);
                if (iA != 3) {
                    SQLiteDatabase sQLiteDatabaseJ = kdhVar.j();
                    sQLiteDatabaseJ.beginTransactionNonExclusive();
                    try {
                        eej.b(sQLiteDatabaseJ, 0, str, 3);
                        if (iA == 2) {
                            arrayList = new ArrayList();
                            String str2 = this.a;
                            if (edt.aq(sQLiteDatabaseJ, str2)) {
                                Cursor cursorQuery = sQLiteDatabaseJ.query(str2, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        String string = cursorQuery.getString(0);
                                        string.getClass();
                                        String string2 = cursorQuery.getString(2);
                                        string2.getClass();
                                        eue eueVar = new eue(string, Uri.parse(string2));
                                        String string3 = cursorQuery.getString(1);
                                        eueVar.b("dash".equals(string3) ? "application/dash+xml" : "hls".equals(string3) ? "application/x-mpegURL" : "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown");
                                        eueVar.a = l(cursorQuery.getString(3));
                                        eueVar.c = cursorQuery.getString(4);
                                        eueVar.d = cursorQuery.getBlob(5);
                                        euh euhVarA = eueVar.a();
                                        eud eudVar = new eud();
                                        eudVar.a = cursorQuery.getLong(13);
                                        eudVar.b = cursorQuery.getFloat(12);
                                        int i3 = cursorQuery.getInt(6);
                                        if (i3 == 4) {
                                            i2 = 4;
                                            i = cursorQuery.getInt(11);
                                        } else {
                                            i = 0;
                                            i2 = i3;
                                        }
                                        arrayList.add(new etn(euhVarA, i2, cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9), cursorQuery.getInt(10), i, eudVar));
                                    } finally {
                                    }
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        String str3 = this.a;
                        sQLiteDatabaseJ.execSQL(a.cr(str3, "DROP TABLE IF EXISTS "));
                        sQLiteDatabaseJ.execSQL(a.cg(str3, "CREATE TABLE ", " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)"));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            m((etn) it.next(), sQLiteDatabaseJ);
                        }
                        sQLiteDatabaseJ.setTransactionSuccessful();
                        sQLiteDatabaseJ.endTransaction();
                    } catch (Throwable th) {
                        sQLiteDatabaseJ.endTransaction();
                        throw th;
                    }
                }
                this.g = true;
            } catch (SQLException e) {
                throw new eei(e);
            }
        }
    }

    @Override // defpackage.euo
    public final void d(etn etnVar) throws eei, SQLException {
        c();
        try {
            m(etnVar, this.b.j());
        } catch (SQLiteException e) {
            throw new eei(e);
        }
    }

    @Override // defpackage.euo
    public final void e() throws eei {
        c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.b.j().update(this.a, contentValues, "state = 2", null);
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    @Override // defpackage.euo
    public final void f() throws eei {
        c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.b.j().update(this.a, contentValues, null, null);
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    @Override // defpackage.euo
    public final void g(int i) throws eei {
        c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.b.j().update(this.a, contentValues, c, null);
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    @Override // defpackage.euo
    public final void h(String str, int i) throws eei {
        c();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.b.j().update(this.a, contentValues, c + " AND id = ?", new String[]{str});
        } catch (SQLException e) {
            throw new eei(e);
        }
    }

    @Override // defpackage.ety
    public final etl i(int... iArr) {
        c();
        return new etl(j(k(iArr), null));
    }
}
