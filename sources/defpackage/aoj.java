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
/* loaded from: classes.dex */
public final class aoj extends anx {
    public aoj() {
        super(aco.EXEC_SQL_FIX, 10L);
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

    @Override // defpackage.anx
    public final aod a(aod aodVar, byg bygVar) {
        if (!bygVar.f() || ((adb) bygVar.b()).b != 2) {
            throw new IllegalArgumentException();
        }
        Context contextCreateDeviceProtectedStorageContext = aodVar.b;
        adb adbVar = (adb) bygVar.b();
        acs acsVar = adbVar.b == 2 ? (acs) adbVar.c : acs.a;
        if (acsVar.f) {
            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
        }
        File databasePath = contextCreateDeviceProtectedStorageContext.getDatabasePath(acsVar.c);
        if (databasePath.exists()) {
            int i = 0;
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(databasePath.getPath(), null, 0);
            try {
                int version = sQLiteDatabaseOpenDatabase.getVersion();
                int i2 = acsVar.d;
                if (i2 == 0 || i2 == version) {
                    int i3 = acsVar.b;
                    if (i3 == 0) {
                        i = 2;
                    } else if (i3 == 1) {
                        i = 3;
                    } else if (i3 == 2) {
                        i = 4;
                    }
                    if (i == 0) {
                        i = 1;
                    }
                    int i4 = i - 2;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new UnsupportedOperationException("This command type is not supported");
                        }
                        contextCreateDeviceProtectedStorageContext.deleteDatabase(acsVar.c);
                    } else if (acsVar.g) {
                        cme cmeVar = acsVar.e;
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            c(sQLiteDatabaseOpenDatabase, cmeVar);
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                        } catch (Throwable th) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        c(sQLiteDatabaseOpenDatabase, acsVar.e);
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
        return aodVar;
    }

    @Override // defpackage.anx
    public final String b() {
        return "EXEC_SQL_FIX";
    }
}
