package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iic extends ggi {
    public iic() {
        super(10, 11);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            ALTER TABLE `library_item`\n            ADD `library_item_metadata_bytes` BLOB\n            ");
    }
}
