package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iku extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `search_history` (`account_name`,`query`,`last_write_mills`) VALUES (?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        imh imhVar = (imh) obj;
        ghiVar.i(1, imhVar.a);
        ghiVar.i(2, imhVar.b);
        ghiVar.g(3, imhVar.c);
    }
}
