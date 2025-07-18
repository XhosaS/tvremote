package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class frw {
    private boolean a;
    final Object o = new Object();
    final MediaSession.Callback p = new frv(this);
    WeakReference q = new WeakReference(null);
    fru r;

    public boolean I(Intent intent) {
        frx frxVar;
        fru fruVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.o) {
            frxVar = (frx) this.q.get();
            fruVar = this.r;
        }
        if (frxVar == null || fruVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        fsf fsfVarC = frxVar.c();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            K(frxVar, fruVar);
            return false;
        }
        if (keyEvent.getRepeatCount() != 0) {
            K(frxVar, fruVar);
        } else if (this.a) {
            fruVar.removeMessages(1);
            this.a = false;
            fsl fslVar = frxVar.f;
            if (((fslVar == null ? 0L : fslVar.e) & 32) != 0) {
                B();
            }
        } else {
            this.a = true;
            fruVar.sendMessageDelayed(fruVar.obtainMessage(1, fsfVarC), ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    final void K(frx frxVar, Handler handler) {
        if (this.a) {
            boolean z = false;
            this.a = false;
            handler.removeMessages(1);
            fsl fslVar = frxVar.f;
            long j = fslVar == null ? 0L : fslVar.e;
            if (fslVar != null && fslVar.a == 3) {
                z = true;
            }
            long j2 = 516 & j;
            long j3 = j & 514;
            if (z) {
                if (j3 != 0) {
                    l();
                }
            } else if (j2 != 0) {
                m();
            }
        }
    }

    public void B() {
    }

    public void C() {
    }

    public void E() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void q() {
    }

    public void v() {
    }

    public void A(int i) {
    }

    public void D(long j) {
    }

    public void J(fsm fsmVar) {
    }

    public void g(frs frsVar) {
    }

    public void u(frs frsVar) {
    }

    public void w(long j) {
    }

    public void x(float f) {
    }

    public void y(fsm fsmVar) {
    }

    public void z(int i) {
    }

    public void h(frs frsVar, int i) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void r(String str, Bundle bundle) {
    }

    public void s(String str, Bundle bundle) {
    }

    public void t(Uri uri, Bundle bundle) {
    }

    public void i(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
