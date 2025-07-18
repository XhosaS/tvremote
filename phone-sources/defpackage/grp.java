package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grp extends ggi {
    public grp() {
        super(23, 24);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
    }
}
