package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiz extends ggi {
    public iiz() {
        super(6, 7);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `library_item_metadata` (\n            `account_name` TEXT NOT NULL,\n            `entity_id` TEXT NOT NULL,\n            `parent_entity_id` TEXT NOT NULL,\n            `root_entity_id` TEXT NOT NULL,\n            `sequence_number` INTEGER NOT NULL,\n            `metadata_bytes` BLOB NOT NULL,\n            PRIMARY KEY(`account_name`, `entity_id`))\n            ");
        ghkVar.f("\n            CREATE INDEX `index_library_item_metadata_parent_entity_id_root_entity_id`\n            ON `library_item_metadata` (\n              `parent_entity_id`,\n              `root_entity_id`\n            );\n          ");
    }
}
