package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qam extends SQLiteOpenHelper {
    private static final tvn a = tvn.n("GnpSdk");

    public qam(Context context, long j) {
        super(context, j + "_tasks.notifications.db", (SQLiteDatabase.CursorFactory) null, 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ((tvk) a.l().j("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataSQLiteHelper", "onCreate", 54, "ChimeTaskDataSQLiteHelper.java")).v("Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        ((tvk) a.l().j("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataSQLiteHelper", "onUpgrade", 62, "ChimeTaskDataSQLiteHelper.java")).E("Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 5) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tasks");
            sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
        }
    }
}
