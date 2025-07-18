package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iii extends ggi {
    public iii() {
        super(16, 17);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `media_library_item_metadata` (\n            `play_id` TEXT NOT NULL,\n            `account_name` TEXT NOT NULL,\n            `expiration_time_millis` INTEGER NOT NULL,\n            `component` BLOB,\n            `media_library_item_metadata` BLOB NOT NULL,\n            PRIMARY KEY(`play_id`,`account_name`))\n            ");
    }
}
