package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guq extends gei {
    @Override // defpackage.gei
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.gei
    public final /* bridge */ /* synthetic */ void b(ghi ghiVar, Object obj) {
        fse fseVar = (fse) obj;
        ghiVar.i(1, (String) fseVar.a);
        ghiVar.i(2, (String) fseVar.b);
    }
}
