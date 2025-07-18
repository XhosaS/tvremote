package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class luk implements Runnable {
    final /* synthetic */ lvf a;
    final /* synthetic */ lul b;

    public luk(lul lulVar, lvf lvfVar) {
        this.a = lvfVar;
        this.b = lulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lvf lvfVar = this.a;
        if (((lvn) lvfVar).a) {
            this.b.b.r();
            return;
        }
        try {
            this.b.b.p(this.b.a.a(lvfVar));
        } catch (lvd e) {
            if (!(e.getCause() instanceof Exception)) {
                this.b.b.o(e);
                return;
            }
            lul lulVar = this.b;
            lulVar.b.o((Exception) e.getCause());
        } catch (Exception e2) {
            this.b.b.o(e2);
        }
    }
}
