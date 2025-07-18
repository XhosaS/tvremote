package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmb extends ggi {
    public qmb() {
        super(4, 5);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `internal_target_id` TEXT DEFAULT NULL");
    }
}
