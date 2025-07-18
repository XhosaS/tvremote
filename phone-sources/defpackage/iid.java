package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iid extends ggi {
    public iid() {
        super(11, 12);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `destinations` (\n            `account_name` TEXT NOT NULL,\n            `destinations_info` BLOB NOT NULL,\n            PRIMARY KEY(`account_name`))\n            ");
    }
}
