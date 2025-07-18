package defpackage;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bro {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/bleremote/BleRemoteDevice");
    public final long b;
    public final Context c;
    public final bqo d;
    public final BluetoothDevice e;
    public final bqv f;
    public final brf g;
    public final bqp h;
    public final bsd i;
    public final AtomicInteger j = new AtomicInteger();
    public long k;
    public final bsi l;
    public final clo m;
    private final btj n;
    private final bth o;
    private final btf p;
    private final brs q;
    private boolean r;
    private brn s;
    private final brj t;

    public bro(Context context, bqo bqoVar, bsi bsiVar, bqv bqvVar, btj btjVar, bth bthVar, btf btfVar, boolean z, boolean z2, brj brjVar, BluetoothDevice bluetoothDevice, boolean z3) {
        this.q = (z && bqvVar.b()) ? brs.HTT : (z2 && bqvVar.b()) ? brs.PTT : brs.LEGACY;
        this.b = SystemClock.uptimeMillis();
        this.c = context;
        this.d = bqoVar;
        this.e = bluetoothDevice;
        this.l = bsiVar;
        this.f = bqvVar;
        this.n = btjVar;
        this.o = bthVar;
        this.p = btfVar;
        this.t = brjVar;
        clo cloVarO = bss.a.o();
        String address = bluetoothDevice.getAddress();
        int i = 2;
        int iDigit = Character.digit(address.charAt(0), 16) >> 2;
        String strSubstring = iDigit == 1 ? "<Random Device Address>" : iDigit == 3 ? "<Resolvable Private Address>" : address.substring(0, 8);
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bss bssVar = (bss) cloVarO.b;
        strSubstring.getClass();
        bssVar.b |= 2;
        bssVar.d = strSubstring;
        int type = bluetoothDevice.getType();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bss bssVar2 = (bss) cloVarO.b;
        bssVar2.b |= 128;
        bssVar2.j = type;
        if (z3) {
            String name = bluetoothDevice.getName();
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bss bssVar3 = (bss) cloVarO.b;
            name.getClass();
            bssVar3.b |= 512;
            bssVar3.l = name;
        }
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass != null) {
            int deviceClass = bluetoothClass.getDeviceClass();
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            bss bssVar4 = (bss) cloVarO.b;
            bssVar4.b |= 256;
            bssVar4.k = deviceClass;
        }
        this.m = cloVarO;
        brf brfVar = new brf(this);
        this.g = brfVar;
        this.i = new bsd(this, new brk(brfVar, i));
        this.h = new brm(this, bluetoothDevice);
    }

    public static void a(bsc bscVar) {
        clo cloVar = bscVar.j;
        if (((bst) cloVar.b).g != 0) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/BleRemoteDevice", "closeSink", 163, "BleRemoteDevice.java")).p("Mic session was closed prior to the sink");
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - bscVar.b;
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        bst bstVar = (bst) cloVar.b;
        bstVar.b |= 512;
        bstVar.k = jUptimeMillis;
        bscVar.i();
    }

    static /* bridge */ /* synthetic */ void h(bro broVar) {
        if (broVar.g(true)) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/BleRemoteDevice", "sendCapabilityRequest", 331, "BleRemoteDevice.java")).p("Non-legacy assistant mode is allowed");
            broVar.i.d(1, broVar.q);
        } else {
            ((cbs) a.g().j("com/google/android/tv/remote/service/bleremote/BleRemoteDevice", "sendCapabilityRequest", 334, "BleRemoteDevice.java")).p("Non-legacy assistant mode is suppressed due to missing Google Assistant, ongoing setup wizard or enabled microphone privacy");
            broVar.i.d(1, brs.LEGACY);
        }
    }

    public final void b() {
        brf brfVar = this.g;
        if (brfVar.d(brfVar.i)) {
            e(0);
        }
    }

    public final void c(int i) {
        e(i);
        this.t.e(this);
    }

    public final synchronized void d(int i) {
        this.r = true;
        this.t.c(this);
        this.d.a(this.h);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.b;
        clo cloVar = this.m;
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        bsi bsiVar = this.l;
        bss bssVar = (bss) cloVar.b;
        bss bssVar2 = bss.a;
        bssVar.b = 1 | bssVar.b;
        bssVar.c = jUptimeMillis;
        clo cloVarC = bsiVar.c(401);
        if (!cloVarC.b.A()) {
            cloVarC.l();
        }
        bse bseVar = (bse) cloVarC.b;
        bss bssVar3 = (bss) cloVar.i();
        bse bseVar2 = bse.a;
        bssVar3.getClass();
        bseVar.f = bssVar3;
        bseVar.b |= 16;
        bsiVar.b(cloVarC);
        if (i <= 0 || this.q == brs.LEGACY) {
            this.i.d(i, brs.LEGACY);
            return;
        }
        brn brnVar = new brn(this);
        this.s = brnVar;
        this.n.c(brnVar);
        this.o.c(this.s);
        this.p.c(this.s);
    }

    public final synchronized void e(int i) {
        if (this.r) {
            brn brnVar = this.s;
            if (brnVar != null) {
                this.n.b(brnVar);
                this.o.b(this.s);
                this.p.b(this.s);
            }
            this.i.c();
            this.d.b(this.h);
            bsi bsiVar = this.l;
            long j = this.b;
            clo cloVar = this.m;
            long jUptimeMillis = SystemClock.uptimeMillis() - j;
            if (!cloVar.b.A()) {
                cloVar.l();
            }
            bss bssVar = (bss) cloVar.b;
            bss bssVar2 = bss.a;
            bssVar.b |= 1;
            bssVar.c = jUptimeMillis;
            if (i != 0) {
                if (!cloVar.b.A()) {
                    cloVar.l();
                }
                bss bssVar3 = (bss) cloVar.b;
                bssVar3.b |= 4;
                bssVar3.e = i;
            }
            clo cloVarC = bsiVar.c(402);
            if (!cloVarC.b.A()) {
                cloVarC.l();
            }
            bse bseVar = (bse) cloVarC.b;
            bss bssVar4 = (bss) cloVar.i();
            bse bseVar2 = bse.a;
            bssVar4.getClass();
            bseVar.f = bssVar4;
            bseVar.b |= 16;
            bsiVar.b(cloVarC);
        }
    }

    public final void f() {
        this.t.d(this);
    }

    public final boolean g(boolean z) {
        if (!this.n.a || this.o.b) {
            return false;
        }
        return z ? "com.google.android.katniss".equals(this.p.b) : this.p.b != null;
    }
}
