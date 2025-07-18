package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiw extends ggi {
    public iiw() {
        super(3, 4);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `library_item` (\n            `account_name` TEXT NOT NULL,\n            `entity_id` TEXT NOT NULL,\n            `type` INTEGER NOT NULL,\n            `component_bytes` BLOB NOT NULL,\n            PRIMARY KEY(`account_name`, `type`,\n            `entity_id`))\n            ");
    }
}
