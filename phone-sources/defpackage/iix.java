package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iix extends ggi {
    public iix() {
        super(4, 5);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            ALTER TABLE `library_item`\n            ADD `filters_bytes` BLOB\n            ");
        ghkVar.f("\n            ALTER TABLE `library_item`\n            ADD `sorts_bytes` BLOB\n            ");
    }
}
