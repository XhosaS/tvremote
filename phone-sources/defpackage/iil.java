package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iil extends ggi {
    public iil() {
        super(19, 20);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n       CREATE TABLE `media_library_item_rental` (\n            `play_id` TEXT NOT NULL,\n            `account_name` TEXT NOT NULL,\n            `short_rental_expiration_timestamp` INTEGER,\n            PRIMARY KEY(`play_id`, `account_name`)\n            )\n            ");
    }
}
