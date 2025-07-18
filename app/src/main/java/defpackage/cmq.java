package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmq extends bku {
    @Override // defpackage.bku
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.bku
    public final /* bridge */ /* synthetic */ void b(brj brjVar, Object obj) {
        cml cmlVar = (cml) obj;
        brjVar.i(1, cmlVar.a);
        brjVar.i(2, cmlVar.b);
    }
}
