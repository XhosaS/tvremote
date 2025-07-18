package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iit extends ggi {
    public iit() {
        super(26, 27);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n              ALTER TABLE `media_library_item` \n              ADD COLUMN `family_shared` INTEGER DEFAULT 0 NOT NULL\n            ");
    }
}
