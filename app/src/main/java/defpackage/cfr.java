package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfr extends boy {
    private final Context c;

    public cfr(Context context) {
        super(9, 10);
        this.c = context;
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        brz brzVar = (brz) brmVar;
        SQLiteDatabase sQLiteDatabase = brzVar.f;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = true == sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sQLiteDatabase.beginTransaction();
            try {
                brmVar.c(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                brmVar.c(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
            }
        }
        SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            SQLiteDatabase sQLiteDatabase2 = brzVar.f;
            sQLiteDatabase2.beginTransaction();
            try {
                brmVar.c(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                brmVar.c(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                sQLiteDatabase2.setTransactionSuccessful();
            } finally {
            }
        }
    }
}
