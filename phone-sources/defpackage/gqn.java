package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqn extends ggi {
    public static final gqn c = new gqn();

    private gqn() {
        super(4, 5);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        ghkVar.f("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
