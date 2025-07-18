package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iko extends geh {
    @Override // defpackage.geh
    protected final String a() {
        return "DELETE FROM `media_library_item_tag` WHERE `play_id` = ? AND `account_name` = ? AND `tag_id` = ?";
    }

    @Override // defpackage.geh
    protected final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        ijg.a(ghiVar, obj);
    }
}
