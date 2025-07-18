package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tfj implements Runnable {
    public final kwy d;

    public tfj() {
        this.d = null;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        kwy kwyVar = this.d;
        if (kwyVar != null) {
            kwyVar.v(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            b(e);
        }
    }

    public tfj(kwy kwyVar) {
        this.d = kwyVar;
    }
}
