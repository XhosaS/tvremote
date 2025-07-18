package defpackage;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eay {
    public final AtomicReference a = new AtomicReference();
    private Runnable b;
    private Choreographer.FrameCallback c;

    public final Choreographer.FrameCallback a() {
        if (this.c == null) {
            this.c = new eaw(this);
        }
        return this.c;
    }

    public final Runnable b() {
        if (this.b == null) {
            this.b = new eax(this);
        }
        return this.b;
    }

    public abstract void c(long j);

    public final void d(long j) {
        this.a.getAndSet(null);
        dzm dzmVar = dzn.a;
        try {
            c(j);
        } finally {
        }
    }
}
