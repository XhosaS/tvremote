package defpackage;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bsc {
    public bqr c;
    final /* synthetic */ bsd i;
    private boolean k;
    public final long b = SystemClock.uptimeMillis();
    public final clo j = bst.a.o();
    private final AtomicBoolean a = new AtomicBoolean();
    final brt d = new brr();
    int e = 0;
    int f = 0;
    final long g = SystemClock.uptimeMillis();
    int h = 0;

    public bsc(bsd bsdVar) {
        this.i = bsdVar;
    }

    public abstract int a(int i);

    public abstract int b();

    public abstract short c();

    public abstract void d(byte[] bArr);

    public abstract void e(ByteBuffer byteBuffer);

    public abstract boolean f(brw brwVar);

    public abstract byte[] g();

    public abstract byte[] h();

    public final void i() {
        boolean andSet = this.a.getAndSet(true);
        if (this.k || andSet) {
            return;
        }
        bsd bsdVar = this.i;
        bsdVar.b.accept(g());
    }

    public final void j(short s) {
        if (this.k) {
            ((cbs) bsd.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle$MicSession", "onError", 491, "VoiceOverBle.java")).p("Receiving error for already closed audio session");
            return;
        }
        this.k = true;
        bsd bsdVar = this.i;
        int i = bsdVar.j;
        int i2 = this.e;
        bsdVar.j = i + i2;
        bsdVar.k += this.h;
        ((cbs) bsd.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle$MicSession", "onError", 499, "VoiceOverBle.java")).B("Received mic open error (code: %X, total: %d, skipped: %d, delay: %+dms)", Short.valueOf(s), Integer.valueOf(this.e), Integer.valueOf(this.h), Long.valueOf((SystemClock.uptimeMillis() - this.g) - a(i2)));
        if (this.a.get()) {
            return;
        }
        this.c.b(true);
    }

    public final void k(int i) {
        if (this.k) {
            ((cbs) bsd.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle$MicSession", "onStop", 517, "VoiceOverBle.java")).p("Receiving close for already closed audio session");
            return;
        }
        this.k = true;
        bsd bsdVar = this.i;
        bsdVar.j += this.e;
        bsdVar.k += this.h;
        clo cloVar = this.j;
        short sC = c();
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        bst bstVar = (bst) cloVar.b;
        bst bstVar2 = bst.a;
        bstVar.b |= 2;
        bstVar.d = sC;
        int i2 = this.f >> 1;
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        clt cltVar = cloVar.b;
        bst bstVar3 = (bst) cltVar;
        bstVar3.b |= 32;
        bstVar3.g = i2;
        int i3 = this.e;
        if (!cltVar.A()) {
            cloVar.l();
        }
        clt cltVar2 = cloVar.b;
        bst bstVar4 = (bst) cltVar2;
        bstVar4.b |= 8;
        bstVar4.e = i3;
        int i4 = this.h;
        if (!cltVar2.A()) {
            cloVar.l();
        }
        bst bstVar5 = (bst) cloVar.b;
        bstVar5.b |= 16;
        bstVar5.f = i4;
        long jUptimeMillis = SystemClock.uptimeMillis();
        clt cltVar3 = cloVar.b;
        long j = jUptimeMillis - ((bst) cltVar3).i;
        long j2 = this.b;
        if (!cltVar3.A()) {
            cloVar.l();
        }
        bst bstVar6 = (bst) cloVar.b;
        bstVar6.b |= 64;
        bstVar6.h = j - j2;
        ((cbs) bsd.a.c().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle$MicSession", "onStop", 532, "VoiceOverBle.java")).B("Received audio stop command (reason: %d, total: %d, skipped: %d, delay: %+dms)", Integer.valueOf(i), Integer.valueOf(this.e), Integer.valueOf(this.h), Long.valueOf((SystemClock.uptimeMillis() - this.g) - a(this.e)));
        if (!this.a.get()) {
            this.c.b(false);
        }
        bro broVar = bsdVar.l;
        long jUptimeMillis2 = SystemClock.uptimeMillis() - broVar.b;
        clo cloVar2 = broVar.m;
        if (!cloVar2.b.A()) {
            cloVar2.l();
        }
        bsi bsiVar = broVar.l;
        bss bssVar = (bss) cloVar2.b;
        bss bssVar2 = bss.a;
        bssVar.b = 1 | bssVar.b;
        bssVar.c = jUptimeMillis2;
        clo cloVarC = bsiVar.c(404);
        if (!cloVarC.b.A()) {
            cloVarC.l();
        }
        bse bseVar = (bse) cloVarC.b;
        bss bssVar3 = (bss) cloVar2.i();
        bse bseVar2 = bse.a;
        bssVar3.getClass();
        bseVar.f = bssVar3;
        bseVar.b |= 16;
        if (!cloVarC.b.A()) {
            cloVarC.l();
        }
        bse bseVar3 = (bse) cloVarC.b;
        bst bstVar7 = (bst) cloVar.i();
        bstVar7.getClass();
        bseVar3.g = bstVar7;
        bseVar3.b |= 32;
        bsiVar.b(cloVarC);
    }

    public final void l(bqr bqrVar) {
        int i;
        bdq.j(this.c == null);
        this.c = bqrVar;
        int iB = b();
        if (iB != 1) {
            i = 2;
            if (iB == 2) {
                i = 5;
            } else if (!bqrVar.c()) {
                i = 3;
            }
        } else {
            i = 4;
        }
        clo cloVar = this.j;
        if (!cloVar.b.A()) {
            cloVar.l();
        }
        bst bstVar = (bst) cloVar.b;
        bst bstVar2 = bst.a;
        bstVar.c = i - 1;
        bstVar.b |= 1;
    }

    final void m(int i, int i2) {
        if (i2 < 0) {
            ((cbs) bsd.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle$MicSession", "writeZeros", 455, "VoiceOverBle.java")).r("Invalid number of dropped audio samples: %d", i2);
            return;
        }
        int i3 = this.c.c() ? bqj.b >> 1 : i;
        if (i2 > i3) {
            ((cbs) bsd.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle$MicSession", "writeZeros", 460, "VoiceOverBle.java")).w("%d dropped audio samples capped at %d", i2, i3);
            i2 = i3;
        }
        ((cbs) bsd.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle$MicSession", "writeZeros", 464, "VoiceOverBle.java")).r("Inserting %s empty audio samples", i2);
        this.c.d(new dln(i, new byte[i2 + i2]));
    }

    final void n(dln dlnVar) {
        if (this.k) {
            ((cbs) bsd.a.g().j("com/google/android/tv/remote/service/bleremote/protocol/VoiceOverBle$MicSession", "write", 470, "VoiceOverBle.java")).p("Receiving audio data for already closed audio session");
            return;
        }
        if (!this.a.get()) {
            this.c.d(dlnVar);
        }
        int length = ((byte[]) dlnVar.b).length;
        if (length != 0 && this.f == 0) {
            clo cloVar = this.j;
            long jUptimeMillis = SystemClock.uptimeMillis();
            clt cltVar = cloVar.b;
            long j = jUptimeMillis - ((bst) cltVar).i;
            long j2 = this.b;
            if (!cltVar.A()) {
                cloVar.l();
            }
            bst bstVar = (bst) cloVar.b;
            bstVar.b |= 256;
            bstVar.j = j - j2;
        }
        this.f += length;
    }
}
