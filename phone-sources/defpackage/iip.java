package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iip extends ggi {
    public iip() {
        super(22, 23);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n              ALTER TABLE `media_library_item` \n              ADD COLUMN `root_id` TEXT\n            ");
    }
}
