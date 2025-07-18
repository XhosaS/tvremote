package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iif extends ggi {
    public iif() {
        super(13, 14);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `library_config` (\n            `account_name` TEXT NOT NULL,\n            `media_library_config` BLOB NOT NULL,\n            PRIMARY KEY(`account_name`))\n            ");
    }
}
