package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqk {
    public final CancellationSignal a = new CancellationSignal();
    public final SQLiteDatabase b;

    public uqk(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    public static String a(Cursor cursor) {
        String string;
        try {
            StringBuilder sb = new StringBuilder();
            String[] columnNames = cursor.getColumnNames();
            sb.append(Arrays.toString(columnNames));
            sb.append('\n');
            while (cursor.moveToNext()) {
                for (int i = 0; i < columnNames.length; i++) {
                    try {
                        string = cursor.getString(i);
                    } catch (Exception unused) {
                        string = cursor.getType(i) != 4 ? "Unknown" : "Blob, length " + cursor.getBlob(i).length;
                    }
                    sb.append("|");
                    sb.append(string);
                }
                sb.append('\n');
            }
            String string2 = sb.toString();
            if (cursor != null) {
                cursor.close();
            }
            return string2;
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void b() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final void c(uqg uqgVar) throws InterruptedException {
        b();
        String str = uqgVar.a;
        wvx wvxVarF = wzg.f("execSQL: ".concat(str), wwb.a, true);
        try {
            this.b.execSQL(str, uqgVar.b);
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
