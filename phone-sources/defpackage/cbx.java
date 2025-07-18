package defpackage;

import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbx extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException("no Looper on this thread");
        }
        cbz cbzVar = new cbz(choreographer, crh.k(looperMyLooper));
        return cbzVar.plus(cbzVar.j);
    }
}
