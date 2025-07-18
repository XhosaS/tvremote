package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gul extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        ghiVar.i(1, ((guj) obj).a);
        ghiVar.g(2, r5.b);
        ghiVar.g(3, r5.c);
    }
}
