package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwi implements hwj {
    final /* synthetic */ hwj a;
    private volatile Object b;

    public hwi(hwj hwjVar) {
        this.a = hwjVar;
    }

    @Override // defpackage.hwj
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object objA = this.a.a();
                    hju.p(objA);
                    this.b = objA;
                }
            }
        }
        return this.b;
    }
}
