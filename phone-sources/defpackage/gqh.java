package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqh extends ggi {
    public static final gqh c = new gqh();

    private gqh() {
        super(11, 12);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
