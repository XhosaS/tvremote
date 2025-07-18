package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijc extends ggi {
    public ijc() {
        super(9, 10);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `offline_tvm` (\n            `account_name` TEXT NOT NULL,\n            `stream_bytes` BLOB NOT NULL,\n            `entity_id` TEXT NOT NULL,\n            PRIMARY KEY(`account_name`, `entity_id`))\n            ");
    }
}
