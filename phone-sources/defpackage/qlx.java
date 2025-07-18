package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlx extends ggi {
    public qlx() {
        super(8, 9);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("CREATE TABLE gnp_accounts_new (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, account_specific_id TEXT, account_type INTEGER, obfuscated_gaia_id TEXT, actual_account_name TEXT, actual_account_oid TEXT, registration_status INTEGER NOT NULL, registration_id TEXT, sync_sources TEXT, representative_target_id TEXT, sync_version INTEGER NOT NULL DEFAULT 0, last_registration_time_ms INTEGER NOT NULL DEFAULT 0, last_registration_request_hash INTEGER NOT NULL DEFAULT 0, first_registration_version INTEGER NOT NULL DEFAULT 0, internal_target_id TEXT, fitbit_decoded_id INTEGER NOT NULL DEFAULT 0)");
        ghkVar.f("INSERT INTO gnp_accounts_new (id, account_specific_id, account_type, obfuscated_gaia_id, actual_account_name, actual_account_oid, registration_status, registration_id, sync_sources, representative_target_id, sync_version, last_registration_time_ms, last_registration_request_hash, first_registration_version, internal_target_id, fitbit_decoded_id) SELECT id, account_specific_id, account_type, obfuscated_gaia_id, actual_account_name, actual_account_oid, registration_status, registration_id, sync_sources, representative_target_id, sync_version, last_registration_time_ms, last_registration_request_hash, first_registration_version, internal_target_id, fitbit_decoded_id FROM gnp_accounts GROUP BY account_specific_id HAVING MAX(id)");
        ghkVar.f("DROP TABLE gnp_accounts");
        ghkVar.f("ALTER TABLE gnp_accounts_new RENAME TO gnp_accounts");
        ghkVar.f("CREATE UNIQUE INDEX `index_gnp_accounts_account_specific_id` ON `gnp_accounts` (`account_specific_id`)");
    }
}
