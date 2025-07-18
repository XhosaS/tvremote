package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckz implements ckw {
    private final bmn a;

    public ckz(bmn bmnVar) {
        this.a = bmnVar;
    }

    @Override // defpackage.ckw
    public final void a(final String str) {
        bpr.b(this.a, false, true, new agux() { // from class: cky
            public final /* synthetic */ String a = "DELETE from WorkProgress where work_spec_id=?";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.i(1, str);
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.ckw
    public final void b() {
        bpr.b(this.a, false, true, new agux() { // from class: ckx
            public final /* synthetic */ String a = "DELETE FROM WorkProgress";

            @Override // defpackage.agux
            public final Object a(Object obj) {
                bsk bskVar = (bsk) obj;
                bskVar.getClass();
                brj brjVarA = bskVar.a(this.a);
                try {
                    brjVarA.l();
                    brjVarA.close();
                    return agpu.a;
                } catch (Throwable th) {
                    brjVarA.close();
                    throw th;
                }
            }
        });
    }
}
