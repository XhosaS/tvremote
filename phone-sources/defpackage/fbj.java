package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbj implements Handler.Callback {
    final /* synthetic */ fbk a;
    private final Handler b;

    public fbj(fbk fbkVar, esp espVar) {
        this.a = fbkVar;
        Handler handlerK = edt.K(this);
        this.b = handlerK;
        espVar.n(this, handlerK);
    }

    private final void b(long j) {
        fbk fbkVar = this.a;
        if (this != fbkVar.h || ((esv) fbkVar).k == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            ((esv) fbkVar).r = true;
            return;
        }
        try {
            fbkVar.aw(j);
            fbkVar.aK(fbkVar.g);
            fbkVar.t.e++;
            fbkVar.aJ();
            fbkVar.ar(j);
        } catch (eii e) {
            this.a.s = e;
        }
    }

    public final void a(long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            b(j);
            return;
        }
        Handler handler = this.b;
        handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        b(edt.D(message.arg1, message.arg2));
        return true;
    }
}
