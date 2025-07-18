package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdl extends boy {
    public static final cdl c = new cdl();

    private cdl() {
        super(11, 12);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        ((brz) brmVar).f.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
