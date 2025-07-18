package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qls extends geh {
    @Override // defpackage.geh
    protected final String a() {
        return "DELETE FROM `threads` WHERE `id` = ?";
    }

    @Override // defpackage.geh
    protected final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        ghiVar.g(1, ((qlu) obj).a);
    }
}
