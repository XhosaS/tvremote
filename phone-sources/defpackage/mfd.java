package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mfd implements idy, mfb {
    final /* synthetic */ mfe a;
    private final idy b;
    private volatile boolean c;
    private volatile boolean d;

    public mfd(mfe mfeVar, idy idyVar) {
        this.a = mfeVar;
        mfeVar.a++;
        this.b = idyVar;
    }

    @Override // defpackage.mfb
    public final synchronized void a() {
        this.c = true;
    }

    @Override // defpackage.idy
    public final synchronized void c(Object obj) {
        if (!this.c) {
            this.b.c(obj);
            if (!this.d) {
                this.d = true;
                this.a.d();
            }
        }
    }
}
