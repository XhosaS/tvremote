package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iie extends ggi {
    public iie() {
        super(12, 13);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n            ALTER TABLE `library_item`\n            ADD `short_rental_expiration_timestamp` INTEGER\n            ");
        ghkVar.f("\n            ALTER TABLE `library_item_metadata`\n            ADD `short_rental_expiration_timestamp` INTEGER\n            ");
    }
}
