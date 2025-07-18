package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdq extends boy {
    public static final cdq c = new cdq();

    private cdq() {
        super(3, 4);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        ((brz) brmVar).f.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
