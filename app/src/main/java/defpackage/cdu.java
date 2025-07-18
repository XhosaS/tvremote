package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdu extends boy {
    public static final cdu c = new cdu();

    private cdu() {
        super(8, 9);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        ((brz) brmVar).f.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
