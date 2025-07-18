package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gug extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        gue gueVar = (gue) obj;
        ghiVar.i(1, gueVar.a);
        ghiVar.g(2, gueVar.b.longValue());
    }
}
