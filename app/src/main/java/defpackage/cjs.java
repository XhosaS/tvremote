package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjs extends bku {
    @Override // defpackage.bku
    public final String a() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.bku
    public final /* bridge */ /* synthetic */ void b(brj brjVar, Object obj) {
        cjn cjnVar = (cjn) obj;
        brjVar.i(1, cjnVar.a);
        brjVar.i(2, cjnVar.b);
    }
}
