package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iik extends ggi {
    public iik() {
        super(18, 19);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `media_library_item_page_data` (\n            `play_id` TEXT NOT NULL,\n            `account_name` TEXT NOT NULL,\n            `entity_stream` BLOB NOT NULL,\n            PRIMARY KEY(`play_id`, `account_name`)\n            )\n            ");
    }
}
