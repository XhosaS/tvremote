package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdm extends boy {
    public static final cdm c = new cdm();

    private cdm() {
        super(12, 13);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        SQLiteDatabase sQLiteDatabase = ((brz) brmVar).f;
        sQLiteDatabase.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        sQLiteDatabase.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
