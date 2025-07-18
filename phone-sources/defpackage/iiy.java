package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiy extends ggi {
    public iiy() {
        super(5, 6);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `filter_and_sort_options` (\n            `account_name` TEXT NOT NULL,\n            `id` TEXT NOT NULL,\n            `filter_options_bytes` BLOB NOT NULL,\n            `sort_options_bytes` BLOB NOT NULL,\n            PRIMARY KEY(`account_name`, `id`))\n            ");
    }
}
