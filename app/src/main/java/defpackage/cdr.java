package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdr extends boy {
    public static final cdr c = new cdr();

    private cdr() {
        super(4, 5);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        SQLiteDatabase sQLiteDatabase = ((brz) brmVar).f;
        sQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        sQLiteDatabase.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
