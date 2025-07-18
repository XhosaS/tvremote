package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class adp {
    public boolean a;
    public boolean b;
    public bug c;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            bug bugVar = this.c;
            if (bugVar != null) {
                try {
                    bugVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.b = false;
                notifyAll();
            }
        }
    }
}
