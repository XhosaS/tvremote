package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qmd extends ggi {
    public qmd() {
        super(6, 7);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `actual_account_oid` TEXT DEFAULT NULL");
    }
}
