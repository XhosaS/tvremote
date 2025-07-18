package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dqd implements dqe {
    final /* synthetic */ dqe a;
    private volatile Object b;

    public dqd(dqe dqeVar) {
        this.a = dqeVar;
    }

    @Override // defpackage.dqe
    public final Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object objA = this.a.a();
                    dqk.d(objA, "Argument must not be null");
                    this.b = objA;
                }
            }
        }
        return this.b;
    }
}
