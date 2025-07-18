package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiv extends ggi {
    public iiv() {
        super(2, 3);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            CREATE TABLE `search_history` (\n            `account_name` TEXT NOT NULL, \n            `query` TEXT NOT NULL,\n            `last_write_mills` INTEGER NOT NULL,\n            PRIMARY KEY(`account_name`, `query`))\n            ");
        ghkVar.f("\n            CREATE INDEX `index_search_history_last_write_mills`\n            ON `search_history` (\n              `last_write_mills`\n            );\n          ");
    }
}
