package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edm implements ecu {
    public static final List a = new ArrayList(50);
    public final Handler b;

    public edm(Handler handler) {
        this.b = handler;
    }

    private static nxb l() {
        nxb nxbVar;
        List list = a;
        synchronized (list) {
            nxbVar = list.isEmpty() ? new nxb() : (nxb) list.remove(list.size() - 1);
        }
        return nxbVar;
    }

    @Override // defpackage.ecu
    public final Looper a() {
        return this.b.getLooper();
    }

    @Override // defpackage.ecu
    public final void b(int i) {
        a.H(true);
        this.b.removeMessages(i);
    }

    @Override // defpackage.ecu
    public final boolean c() {
        a.H(true);
        return this.b.hasMessages(1);
    }

    @Override // defpackage.ecu
    public final void d(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // defpackage.ecu
    public final void e() {
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.ecu
    public final void f(int i) {
        this.b.sendEmptyMessage(i);
    }

    @Override // defpackage.ecu
    public final nxb g(int i) {
        nxb nxbVarL = l();
        nxbVarL.a = this.b.obtainMessage(i);
        return nxbVarL;
    }

    @Override // defpackage.ecu
    public final nxb h(int i, Object obj) {
        nxb nxbVarL = l();
        nxbVarL.a = this.b.obtainMessage(i, obj);
        return nxbVarL;
    }

    @Override // defpackage.ecu
    public final nxb i(int i, int i2, int i3) {
        nxb nxbVarL = l();
        nxbVarL.a = this.b.obtainMessage(i, i2, i3);
        return nxbVarL;
    }

    @Override // defpackage.ecu
    public final nxb j(int i, int i2, int i3, Object obj) {
        nxb nxbVarL = l();
        nxbVarL.a = this.b.obtainMessage(i, i2, i3, obj);
        return nxbVarL;
    }

    @Override // defpackage.ecu
    public final void k(nxb nxbVar) {
        Object obj = nxbVar.a;
        obj.getClass();
        this.b.sendMessageAtFrontOfQueue((Message) obj);
        nxbVar.k();
    }
}
