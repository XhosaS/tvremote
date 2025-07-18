package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iin extends ggi {
    public iin() {
        super(20, 21);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n       ALTER TABLE `media_library_item_metadata`\n                   ADD `search_suggestion_component` BLOB\n            ");
    }
}
