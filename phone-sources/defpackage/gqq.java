package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqq extends ggi {
    public static final gqq c = new gqq();

    private gqq() {
        super(8, 9);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
