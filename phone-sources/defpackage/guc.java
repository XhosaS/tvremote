package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guc extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        fse fseVar = (fse) obj;
        ghiVar.i(1, (String) fseVar.b);
        ghiVar.i(2, (String) fseVar.a);
    }
}
