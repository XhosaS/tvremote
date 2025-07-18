package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqo extends ggi {
    public static final gqo c = new gqo();

    private gqo() {
        super(6, 7);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
