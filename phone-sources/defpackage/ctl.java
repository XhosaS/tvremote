package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ctl {
    public boolean a;
    public Object b;
    public boolean c;
    public gmz d;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.c = true;
            gmz gmzVar = this.d;
            Object obj = this.b;
            if (gmzVar != null) {
                try {
                    gmzVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.c = false;
                notifyAll();
            }
        }
    }
}
