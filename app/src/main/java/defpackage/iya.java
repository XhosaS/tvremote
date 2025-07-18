package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iya extends boy {
    public iya() {
        super(1, 2);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        SQLiteDatabase sQLiteDatabase = ((brz) brmVar).f;
        sQLiteDatabase.execSQL("CREATE TABLE `temp_fallback_suggestion_table` (`display_text` TEXT NOT NULL, `foreground_app` TEXT NOT NULL, `server_log` TEXT NOT NULL, PRIMARY KEY (`display_text`, `foreground_app`))");
        sQLiteDatabase.execSQL("INSERT INTO 'temp_fallback_suggestion_table' (`display_text`, `foreground_app`, `server_log`) SELECT `display_text`, `geppetto_subtype`, `server_log` FROM 'fallback_suggestion_table'");
        sQLiteDatabase.execSQL("DROP TABLE 'fallback_suggestion_table'");
        sQLiteDatabase.execSQL("ALTER TABLE 'temp_fallback_suggestion_table' RENAME TO 'fallback_suggestion_table'");
    }
}
