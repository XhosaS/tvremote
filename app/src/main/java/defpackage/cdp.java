package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdp extends boy {
    public static final cdp c = new cdp();

    private cdp() {
        super(1, 2);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        SQLiteDatabase sQLiteDatabase = ((brz) brmVar).f;
        sQLiteDatabase.execSQL("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        sQLiteDatabase.execSQL("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS alarmInfo");
        sQLiteDatabase.execSQL("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
