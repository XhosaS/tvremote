package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qma extends ggi {
    public qma() {
        super(3, 4);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `sync_version` INTEGER NOT NULL DEFAULT 0");
        gez.t(gicVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_time_ms` INTEGER NOT NULL DEFAULT 0");
        gez.t(gicVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `last_registration_request_hash` INTEGER NOT NULL DEFAULT 0");
        gez.t(gicVar, "ALTER TABLE `gnp_accounts` ADD COLUMN `first_registration_version` INTEGER NOT NULL DEFAULT 0");
    }
}
