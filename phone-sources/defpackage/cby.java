package defpackage;

import android.view.Choreographer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cby implements Choreographer.FrameCallback, Runnable {
    final /* synthetic */ cbz a;

    public cby(cbz cbzVar) {
        this.a = cbzVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        cbz cbzVar = this.a;
        cbzVar.d.removeCallbacks(this);
        cbzVar.b();
        synchronized (cbzVar.e) {
            if (cbzVar.h) {
                cbzVar.h = false;
                List list = cbzVar.f;
                cbzVar.f = cbzVar.g;
                cbzVar.g = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        cbz cbzVar = this.a;
        cbzVar.b();
        synchronized (cbzVar.e) {
            if (cbzVar.f.isEmpty()) {
                cbzVar.c.removeFrameCallback(this);
                cbzVar.h = false;
            }
        }
    }
}
