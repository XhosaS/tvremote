package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.appcompat.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qao extends SQLiteOpenHelper {
    private static final tvn a = tvn.n("GnpSdk");

    public qao(Context context, long j) {
        super(context, j + "_threads.notifications.db", (SQLiteDatabase.CursorFactory) null, 24);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ((tvk) a.l().j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadSQLiteHelper", "onCreate", R.styleable.AppCompatTheme_tooltipFrameBackground, "ChimeThreadSQLiteHelper.java")).v("Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0),expiration_duration_from_display_ms INTEGER NOT NULL DEFAULT(0),opaque_backend_data BLOB NOT NULL DEFAULT(X''),external_experiment_ids TEXT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws Throwable {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws Throwable {
        int i3;
        char c;
        Cursor cursorQuery;
        int i4 = i;
        ((tvk) a.l().j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadSQLiteHelper", "onUpgrade", R.styleable.AppCompatTheme_windowFixedWidthMinor, "ChimeThreadSQLiteHelper.java")).E("Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i4), Integer.valueOf(i2));
        if (i4 < 6) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0),expiration_duration_from_display_ms INTEGER NOT NULL DEFAULT(0),opaque_backend_data BLOB NOT NULL DEFAULT(X''),external_experiment_ids TEXT);");
            return;
        }
        if (i4 == 6) {
            qau.d(sQLiteDatabase, "expiration_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 7) {
                return;
            } else {
                i4 = 7;
            }
        }
        if (i4 == 7) {
            qau.d(sQLiteDatabase, "locally_removed", "INTEGER NOT NULL DEFAULT(0)");
            i4 = 8;
            if (i2 <= 8) {
                return;
            }
        }
        if (i4 < 12) {
            qau.d(sQLiteDatabase, "storage_mode", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 12) {
                return;
            } else {
                i4 = 12;
            }
        }
        if (i4 < 14) {
            qau.d(sQLiteDatabase, "payload_type", "TEXT");
            if (i2 <= 14) {
                return;
            } else {
                i4 = 14;
            }
        }
        if (i4 == 14) {
            qau.d(sQLiteDatabase, "thread_stored_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 15) {
                return;
            } else {
                i4 = 15;
            }
        }
        if (i4 == 15) {
            qau.d(sQLiteDatabase, "creation_id", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 16) {
                return;
            } else {
                i4 = 16;
            }
        }
        if (i4 == 16) {
            qau.d(sQLiteDatabase, "actions", "BLOB");
            if (i2 <= 17) {
                return;
            } else {
                i4 = 17;
            }
        }
        if (i4 == 17) {
            String[] strArr = {"_id", "thread_id", "read_state", "count_behavior", "system_tray_behavior", "last_updated__version", "last_notification_version", "creation_id", "notification_metadata", "actions", "rendered_message", "payload_type", "payload", "update_thread_state_token", "group_id", "expiration_timestamp", "thread_stored_timestamp", "locally_removed", "storage_mode"};
            tvn tvnVar = qau.a;
            try {
                i3 = 19;
                c = 0;
                cursorQuery = sQLiteDatabase.query("threads", null, "0", null, null, null, null);
                for (int i5 = 0; i5 < 19; i5++) {
                    try {
                        if (cursorQuery.getColumnIndex(strArr[i5]) < 0) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
                            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0),reference INTEGER NOT NULL DEFAULT(0),deletion_status INTEGER NOT NULL DEFAULT(0),expiration_duration_from_display_ms INTEGER NOT NULL DEFAULT(0),opaque_backend_data BLOB NOT NULL DEFAULT(X''),external_experiment_ids TEXT);");
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (i2 <= 18) {
                    return;
                } else {
                    i4 = 18;
                }
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = null;
            }
        } else {
            i3 = 19;
            c = 0;
        }
        if (i4 == 18) {
            qau.d(sQLiteDatabase, "reference", "INTEGER NOT NULL DEFAULT(0)");
            sQLiteDatabase.execSQL("UPDATE threads SET reference = 1");
            if (i2 <= i3) {
                return;
            } else {
                i4 = i3;
            }
        }
        if (i4 == i3) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[c] = "threads";
            objArr[1] = "reference";
            objArr[2] = "locally_removed";
            sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = 0 WHERE %s != 0", objArr));
            if (i2 <= 20) {
                return;
            } else {
                i4 = 20;
            }
        }
        if (i4 == 20) {
            qau.d(sQLiteDatabase, "deletion_status", "INTEGER NOT NULL DEFAULT(0)");
            sQLiteDatabase.execSQL("UPDATE threads SET deletion_status = ?", new String[]{String.valueOf(vll.ACTIVE.d)});
            if (i2 <= 21) {
                return;
            } else {
                i4 = 21;
            }
        }
        if (i4 == 21) {
            qau.d(sQLiteDatabase, "expiration_duration_from_display_ms", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 22) {
                return;
            } else {
                i4 = 22;
            }
        }
        if (i4 == 22) {
            qau.d(sQLiteDatabase, "opaque_backend_data", "BLOB NOT NULL DEFAULT(X'')");
            if (i2 <= 23) {
                return;
            }
        } else if (i4 != 23) {
            return;
        }
        qau.d(sQLiteDatabase, "external_experiment_ids", "TEXT");
    }
}
