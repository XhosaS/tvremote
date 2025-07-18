package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqv extends oqk {
    public oqv() {
        super(ngl.EXEC_SQL_FIX, 10L);
    }

    private static void c(SQLiteDatabase sQLiteDatabase, List list) throws SQLException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                sQLiteDatabase.execSQL(str);
            } catch (SQLiteException e) {
                Log.e("EXEC_SQL_FIX", "Unable to execute query ".concat(String.valueOf(str)));
                throw e;
            }
        }
    }

    @Override // defpackage.oqk
    public final oqp a(oqp oqpVar, tst tstVar) {
        if (!tstVar.g() || ((ngy) tstVar.c()).b != 2) {
            throw new IllegalArgumentException();
        }
        Context contextCreateDeviceProtectedStorageContext = oqpVar.b;
        ngy ngyVar = (ngy) tstVar.c();
        ngp ngpVar = ngyVar.b == 2 ? (ngp) ngyVar.c : ngp.a;
        if (ngpVar.f) {
            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
        }
        File databasePath = contextCreateDeviceProtectedStorageContext.getDatabasePath(ngpVar.c);
        if (databasePath.exists()) {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(databasePath.getPath(), null, 0);
            try {
                int version = sQLiteDatabaseOpenDatabase.getVersion();
                int i = ngpVar.d;
                if (i == 0 || i == version) {
                    int iAs = a.as(ngpVar.b);
                    if (iAs == 0) {
                        iAs = 1;
                    }
                    int i2 = iAs - 2;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new UnsupportedOperationException("This command type is not supported");
                        }
                        contextCreateDeviceProtectedStorageContext.deleteDatabase(ngpVar.c);
                    } else if (ngpVar.g) {
                        vun vunVar = ngpVar.e;
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            c(sQLiteDatabaseOpenDatabase, vunVar);
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                        } catch (Throwable th) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        c(sQLiteDatabaseOpenDatabase, ngpVar.e);
                    }
                }
                if (sQLiteDatabaseOpenDatabase != null) {
                    sQLiteDatabaseOpenDatabase.close();
                }
            } catch (Throwable th2) {
                if (sQLiteDatabaseOpenDatabase != null) {
                    try {
                        sQLiteDatabaseOpenDatabase.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return oqpVar;
    }

    @Override // defpackage.oqk
    public final String b() {
        return "EXEC_SQL_FIX";
    }
}
