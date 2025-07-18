package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ijs extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `library_config` (`account_name`,`media_library_config`) VALUES (?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        ima imaVar = (ima) obj;
        ghiVar.i(1, imaVar.a);
        ghiVar.e(2, imaVar.b.h());
    }
}
