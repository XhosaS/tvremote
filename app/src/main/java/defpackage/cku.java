package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cku extends bku {
    @Override // defpackage.bku
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.bku
    public final /* bridge */ /* synthetic */ void b(brj brjVar, Object obj) {
        ckq ckqVar = (ckq) obj;
        brjVar.i(1, ckqVar.a);
        brjVar.i(2, ckqVar.b);
    }
}
