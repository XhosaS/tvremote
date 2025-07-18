package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class en {
    public final MediaSession a;
    final et b;
    final Object c = new Object();
    final RemoteCallbackList d = new RemoteCallbackList();
    ey e;
    du f;
    em g;
    dyg h;
    final ea i;

    public en(Context context, String str) {
        MediaSession mediaSessionE = e(context, str);
        this.a = mediaSessionE;
        ea eaVar = new ea(this);
        this.i = eaVar;
        this.b = new et(mediaSessionE.getSessionToken(), eaVar);
        f();
    }

    public final em a() {
        em emVar;
        synchronized (this.c) {
            emVar = this.g;
        }
        return emVar;
    }

    public dyg b() {
        dyg dygVar;
        synchronized (this.c) {
            dygVar = this.h;
        }
        return dygVar;
    }

    public final void c(em emVar, Handler handler) {
        synchronized (this.c) {
            this.g = emVar;
            ek ekVar = null;
            this.a.setCallback(emVar == null ? null : emVar.b, handler);
            if (emVar != null) {
                synchronized (emVar.a) {
                    emVar.c = new WeakReference(this);
                    ek ekVar2 = emVar.d;
                    if (ekVar2 != null) {
                        ekVar2.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        ekVar = new ek(emVar, handler.getLooper());
                    }
                    emVar.d = ekVar;
                }
            }
        }
    }

    public void d(dyg dygVar) {
        synchronized (this.c) {
            this.h = dygVar;
        }
    }

    public MediaSession e(Context context, String str) {
        return new MediaSession(context, str);
    }

    public final void f() {
        this.a.setFlags(3);
    }
}
