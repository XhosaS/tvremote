package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ku implements AutoCloseable, xd {
    final /* synthetic */ kt a;
    final /* synthetic */ xc b;
    final /* synthetic */ cih c;

    public ku(cih cihVar, kt ktVar, xc xcVar) {
        this.c = cihVar;
        this.a = ktVar;
        this.b = xcVar;
    }

    @Override // defpackage.xd
    public final void a(xf xfVar, xa xaVar) throws Exception {
        if (xaVar != xa.ON_START) {
            if (xaVar == xa.ON_STOP) {
                this.a.b.e();
                return;
            } else {
                if (xaVar == xa.ON_DESTROY) {
                    this.a.e();
                    return;
                }
                return;
            }
        }
        cih cihVar = this.c;
        kt ktVar = this.a;
        Object obj = cihVar.b;
        aav aavVar = ktVar.b;
        if (abb.a(0)) {
            ((aaz) obj).b.addFirst(aavVar);
        } else if (abb.a(1)) {
            ((aaz) obj).c.addFirst(aavVar);
        }
        aaz aazVar = (aaz) obj;
        aavVar.d.add(new aaw(aazVar, aavVar));
        aazVar.d();
        aavVar.c = new aay(obj);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.c(this);
        this.a.c.remove(this);
    }
}
