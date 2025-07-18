package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iis extends ggi {
    public iis() {
        super(25, 26);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            DROP TABLE IF EXISTS `media_library_item_tag`;\n          ");
        ghkVar.f("\n            CREATE TABLE `media_library_item_tag` (\n            `play_id` TEXT NOT NULL,\n            `account_name` TEXT NOT NULL,\n            `tag_id` TEXT NOT NULL,\n            PRIMARY KEY(`play_id`, `account_name`, `tag_id`),\n            FOREIGN KEY(`play_id`, `account_name`) REFERENCES `media_library_item`(`play_id`, `account_name`) ON UPDATE NO ACTION ON DELETE NO ACTION)\n            ");
        ghkVar.f("\n            CREATE INDEX `index_media_library_item_tag_account_name`\n            ON `media_library_item_tag` (\n              `account_name`\n            );\n          ");
        ghkVar.f("\n            CREATE INDEX `index_media_library_item_tag_tag_id`\n            ON `media_library_item_tag` (\n              `tag_id`\n            );\n          ");
    }
}
