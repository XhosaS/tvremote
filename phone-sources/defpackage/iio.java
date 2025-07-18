package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iio extends ggi {
    public iio() {
        super(21, 22);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n              DROP TABLE IF EXISTS `library_item`\n            ");
        ghkVar.f("\n              DROP TABLE IF EXISTS `library_item_metadata`\n            ");
    }
}
