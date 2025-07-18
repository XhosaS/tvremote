package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qme extends ggi {
    public qme() {
        super(7, 8);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `fitbit_decoded_id` INTEGER NOT NULL DEFAULT 0");
    }
}
