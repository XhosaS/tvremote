package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cds extends boy {
    public static final cds c = new cds();

    private cds() {
        super(6, 7);
    }

    @Override // defpackage.boy
    public final void a(brm brmVar) throws SQLException {
        ((brz) brmVar).f.execSQL("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
