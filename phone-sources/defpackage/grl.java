package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grl extends ggi {
    public grl() {
        super(18, 19);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
