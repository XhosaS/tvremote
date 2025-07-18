package defpackage;

import android.content.BroadcastReceiver;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aze implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aze(ViewGroup viewGroup, View view, h hVar, int i) {
        this.d = i;
        this.c = viewGroup;
        this.b = view;
        this.a = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v19, types: [bob, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            azf.b(new ame(this.a, this.b, 6), this.c);
            return;
        }
        if (i == 1) {
            int i2 = g.e;
            ((ViewGroup) this.c).endViewTransition((View) this.b);
            Object obj = this.a;
            ((h) obj).a.a.f((bc) obj);
            return;
        }
        if (i == 2) {
            ((cbs) ((cbs) bna.a.e().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothLeServer", "<init>", 106, "BluetoothLeServer.java")).p("Stopping Bluetooth LE server");
            ((buf) this.c).unregisterReceiver((BroadcastReceiver) this.a);
            ((bna) this.b).b();
        } else if (i != 3) {
            ((bnx) this.a).c = true;
            bux buxVar = (bux) this.c;
            this.b.sendDownUpKeyEvents((buxVar.b == 20 ? (bvl) buxVar.c : bvl.a).b);
        } else {
            ((cbs) ((cbs) bnd.a.e().g(btt.a)).j("com/google/android/tv/remote/service/BluetoothServer", "<init>", 109, "BluetoothServer.java")).p("Stopping Bluetooth server");
            ((buf) this.c).unregisterReceiver((BroadcastReceiver) this.a);
            ((bnd) this.b).b();
        }
    }

    public /* synthetic */ aze(Object obj, buf bufVar, BroadcastReceiver broadcastReceiver, int i) {
        this.d = i;
        this.b = obj;
        this.c = bufVar;
        this.a = broadcastReceiver;
    }

    public /* synthetic */ aze(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
