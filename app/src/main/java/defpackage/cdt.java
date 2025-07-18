package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdt extends boy {
    public static final cdt c = new cdt();

    private cdt() {
        super(7, 8);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        ((brz) brmVar).f.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
