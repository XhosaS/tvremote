package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foi extends Handler {
    final /* synthetic */ foo a;
    private boolean b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foi(foo fooVar, Looper looper) {
        super(looper);
        this.a = fooVar;
        this.b = true;
        this.c = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.b = this.b && z;
        if (this.c && z2) {
            z3 = true;
        }
        this.c = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        foo fooVar = this.a;
        fooVar.p = fooVar.p.d(fooVar.q.aw(), fooVar.q.ax(), fooVar.p.s);
        fooVar.i(fooVar.p, this.b, this.c);
        this.b = true;
        this.c = true;
    }
}
