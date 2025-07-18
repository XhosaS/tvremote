package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ijm extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `cache_domain` (`cache_id`,`domain`) VALUES (?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        ily ilyVar = (ily) obj;
        ghiVar.g(1, ilyVar.a);
        ghiVar.i(2, ijn.o(ilyVar.b));
    }
}
