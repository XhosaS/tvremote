package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ksf implements ids {
    private final Handler a;
    private final idt b;

    public ksf(idt idtVar, Handler handler) {
        this.b = idtVar;
        this.a = handler;
    }

    public static ksf a() {
        idt idtVar = new idt(null);
        return new ksf(idtVar, new Handler(Looper.getMainLooper(), new kse(idtVar)));
    }

    public final void b() {
        this.a.removeMessages(0);
    }

    public final void c(long j) {
        b();
        d(j);
    }

    public final void d(long j) {
        this.a.sendMessageDelayed(new Message(), j);
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.b.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.b.ee(iejVar);
    }
}
