package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class owt extends wbb {
    public final Object a;
    public ows b;
    public boolean c;
    public final rtg d;

    public owt(rtg rtgVar) {
        super(null);
        this.a = new Object();
        this.c = false;
        this.d = rtgVar;
        if (sij.F("application/grpc")) {
            return;
        }
        rtgVar.k = "application/grpc";
    }

    @Override // defpackage.wbb
    public final xqe b() {
        synchronized (this.a) {
            if (this.b != null) {
                return new xqe();
            }
            ows owsVar = new ows(this.d);
            this.b = owsVar;
            return owsVar;
        }
    }
}
