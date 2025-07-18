package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckm extends bku {
    @Override // defpackage.bku
    public final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.bku
    public final /* bridge */ /* synthetic */ void b(brj brjVar, Object obj) {
        brjVar.i(1, ((ckf) obj).a);
        brjVar.g(2, r5.b);
        brjVar.g(3, r5.c);
    }
}
