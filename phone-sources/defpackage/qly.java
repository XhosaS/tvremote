package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qly extends ggi {
    private final ggh c;

    public qly() {
        super(1, 2);
        this.c = new gqe(2);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "CREATE TABLE IF NOT EXISTS `_new_gnp_accounts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account_specific_id` TEXT, `account_type` INTEGER, `obfuscated_gaia_id` TEXT, `registration_status` INTEGER NOT NULL, `registration_id` TEXT, `sync_sources` TEXT)");
        gez.t(gicVar, "INSERT INTO `_new_gnp_accounts` (`id`,`account_specific_id`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources`) SELECT `id`,`account_name`,`obfuscated_gaia_id`,`registration_status`,`registration_id`,`sync_sources` FROM `gnp_accounts`");
        gez.t(gicVar, "DROP TABLE `gnp_accounts`");
        gez.t(gicVar, "ALTER TABLE `_new_gnp_accounts` RENAME TO `gnp_accounts`");
        gez.n(this.c, gicVar);
    }
}
