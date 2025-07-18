package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiq extends ggi {
    public iiq() {
        super(23, 24);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n              ALTER TABLE `media_library_item_page_data` \n              ADD COLUMN `expiration_time_millis` INT DEFAULT 0 NOT NULL\n            ");
    }
}
