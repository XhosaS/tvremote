package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iim extends ggi {
    public iim() {
        super(1, 2);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `watch_actions` (\n            `account_name` TEXT NOT NULL, \n            `entity_id` TEXT NOT NULL,\n            `keep_forever` INTEGER NOT NULL,\n            `watch_actions_blob` BLOB NOT NULL, \n            `last_server_write_millis` INTEGER NOT NULL, \n            PRIMARY KEY(`account_name`, `entity_id`))\n            ");
        ghkVar.f("\n            CREATE INDEX `index_watch_actions_last_server_write_millis_keep_forever`\n            ON `watch_actions` (\n              `last_server_write_millis`, \n              `keep_forever`\n            );\n          ");
    }
}
