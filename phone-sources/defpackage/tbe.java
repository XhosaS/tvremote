package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbe {
    private static tbe e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new tbc(this));
    public tbd c;
    public tbd d;

    private tbe() {
    }

    public static tbe a() {
        if (e == null) {
            e = new tbe();
        }
        return e;
    }

    public final void b(tbd tbdVar) {
        int i = tbdVar.a;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(tbdVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, tbdVar), i);
    }

    public final void c() {
        tbd tbdVar = this.d;
        if (tbdVar != null) {
            this.c = tbdVar;
            this.d = null;
            zft zftVar = (zft) ((WeakReference) tbdVar.c).get();
            if (zftVar == null) {
                this.c = null;
                return;
            }
            Object obj = zftVar.a;
            Handler handler = taz.a;
            handler.sendMessage(handler.obtainMessage(0, obj));
        }
    }

    public final boolean d(tbd tbdVar, int i) {
        zft zftVar = (zft) ((WeakReference) tbdVar.c).get();
        if (zftVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(tbdVar);
        Object obj = zftVar.a;
        Handler handler = taz.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final void e(zft zftVar) {
        synchronized (this.a) {
            if (g(zftVar)) {
                tbd tbdVar = this.c;
                if (!tbdVar.b) {
                    tbdVar.b = true;
                    this.b.removeCallbacksAndMessages(tbdVar);
                }
            }
        }
    }

    public final void f(zft zftVar) {
        synchronized (this.a) {
            if (g(zftVar)) {
                tbd tbdVar = this.c;
                if (tbdVar.b) {
                    tbdVar.b = false;
                    b(tbdVar);
                }
            }
        }
    }

    public final boolean g(zft zftVar) {
        tbd tbdVar = this.c;
        return tbdVar != null && tbdVar.a(zftVar);
    }

    public final boolean h(zft zftVar) {
        tbd tbdVar = this.d;
        return tbdVar != null && tbdVar.a(zftVar);
    }
}
