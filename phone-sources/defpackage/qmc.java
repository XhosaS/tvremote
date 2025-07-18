package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmc extends ggi {
    public qmc() {
        super(5, 6);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `actual_account_name` TEXT DEFAULT NULL");
    }
}
