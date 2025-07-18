package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class em {
    final Object a = new Object();
    final MediaSession.Callback b = new el(this);
    WeakReference c = new WeakReference(null);
    ek d;
    private boolean e;

    public boolean i(Intent intent) {
        en enVar;
        ek ekVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.a) {
            enVar = (en) this.c.get();
            ekVar = this.d;
        }
        if (enVar == null || ekVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        dyg dygVarB = enVar.b();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            j(enVar, ekVar);
            return false;
        }
        if (keyEvent.getRepeatCount() != 0) {
            j(enVar, ekVar);
        } else if (this.e) {
            ekVar.removeMessages(1);
            this.e = false;
            ey eyVar = enVar.e;
            if (((eyVar == null ? 0L : eyVar.e) & 32) != 0) {
                f();
            }
        } else {
            this.e = true;
            ekVar.sendMessageDelayed(ekVar.obtainMessage(1, dygVarB), ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    final void j(en enVar, Handler handler) {
        if (this.e) {
            boolean z = false;
            this.e = false;
            handler.removeMessages(1);
            ey eyVar = enVar.e;
            long j = eyVar == null ? 0L : eyVar.e;
            if (eyVar != null && eyVar.a == 3) {
                z = true;
            }
            long j2 = 516 & j;
            long j3 = j & 514;
            if (z) {
                if (j3 != 0) {
                    b();
                }
            } else if (j2 != 0) {
                c();
            }
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void e(long j) {
    }

    public void k(String str) {
    }
}
