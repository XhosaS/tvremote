package defpackage;

import android.os.SystemClock;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnr implements bqp {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/EmoteDevice");
    public int b = 8000;
    public int c;
    public bqr d;
    public long e;
    public int f;
    private final String g;
    private final Consumer h;
    private int i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private final bqa n;

    public bnr(String str, Consumer consumer, bqa bqaVar) {
        this.g = str;
        this.h = consumer;
        this.n = bqaVar;
    }

    private final void f(int i, boolean z, boolean z2) {
        synchronized (this) {
            bqr bqrVar = this.d;
            if (bqrVar != null && this.c == i) {
                this.c = 0;
                this.d = null;
                long jUptimeMillis = SystemClock.uptimeMillis();
                clo cloVarO = bst.a.o();
                int i2 = true != this.j ? 3 : 2;
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                clt cltVar = cloVarO.b;
                bst bstVar = (bst) cltVar;
                bstVar.c = i2 - 1;
                bstVar.b |= 1;
                int i3 = this.f >> 1;
                if (!cltVar.A()) {
                    cloVarO.l();
                }
                clt cltVar2 = cloVarO.b;
                bst bstVar2 = (bst) cltVar2;
                bstVar2.b |= 32;
                bstVar2.g = i3;
                long j = jUptimeMillis - this.m;
                if (!cltVar2.A()) {
                    cloVarO.l();
                }
                clt cltVar3 = cloVarO.b;
                bst bstVar3 = (bst) cltVar3;
                bstVar3.b |= 512;
                bstVar3.k = j;
                long j2 = this.k;
                if (j2 != 0) {
                    long j3 = this.m - j2;
                    if (!cltVar3.A()) {
                        cloVarO.l();
                    }
                    bst bstVar4 = (bst) cloVarO.b;
                    bstVar4.b |= 4096;
                    bstVar4.m = j3;
                    this.k = 0L;
                }
                long j4 = this.l;
                if (j4 != 0) {
                    long j5 = jUptimeMillis - j4;
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bst bstVar5 = (bst) cloVarO.b;
                    bstVar5.b |= 64;
                    bstVar5.h = j5;
                }
                long j6 = this.e;
                if (j6 != 0) {
                    long j7 = j6 - this.m;
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    bst bstVar6 = (bst) cloVarO.b;
                    bstVar6.b |= 256;
                    bstVar6.j = j7;
                }
                if (z) {
                    bqrVar.b(z2);
                } else {
                    bqa bqaVar = this.n;
                    bqb bqbVar = bqaVar.b;
                    if (bqbVar.d != i) {
                        ((cbs) bqc.a.g().j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler$1", "closeSessionRequest", 141, "VoiceFeature.java")).w("Closing session id %d, opened session %d", i, bqaVar.a);
                    }
                    bqbVar.d = 0;
                    bug bugVar = bqbVar.b;
                    clo cloVarO2 = bvw.a.o();
                    clo cloVarO3 = bvy.a.o();
                    if (!cloVarO3.b.A()) {
                        cloVarO3.l();
                    }
                    bvy bvyVar = (bvy) cloVarO3.b;
                    bvyVar.b |= 1;
                    bvyVar.c = i;
                    if (!cloVarO2.b.A()) {
                        cloVarO2.l();
                    }
                    bvw bvwVar = (bvw) cloVarO2.b;
                    bvy bvyVar2 = (bvy) cloVarO3.i();
                    bvyVar2.getClass();
                    bvwVar.c = bvyVar2;
                    bvwVar.b = 31;
                    bugVar.d((bvw) cloVarO2.i());
                }
                this.h.accept(cloVarO);
            }
        }
    }

    public final int a(bqr bqrVar, int i) {
        bqr bqrVar2;
        synchronized (this) {
            bqrVar2 = this.d;
            if (i == 0) {
                i = this.i + 1;
                this.i = i;
            }
            this.c = i;
            this.d = bqrVar;
            this.j = bqrVar.c();
            this.e = 0L;
            this.f = 0;
            this.l = 0L;
            this.m = SystemClock.uptimeMillis();
        }
        if (bqrVar2 != null) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/EmoteDevice", "requestAudioSession", 95, "EmoteDevice.java")).p("Previous audio session is not closed, but want to start a new one");
            bqrVar2.b(true);
        }
        return i;
    }

    @Override // defpackage.bqp
    public final bqq b(bqr bqrVar) {
        String[] packagesForUid;
        int iA = a(bqrVar, 0);
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/EmoteDevice", "startAudioSession", 68, "EmoteDevice.java")).p("Voice recorder started");
        int iA2 = bqrVar.a();
        bqb bqbVar = this.n.b;
        bqbVar.d = iA;
        clo cloVarO = bwb.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        bwb bwbVar = (bwb) cloVarO.b;
        int i = 1;
        bwbVar.b |= 1;
        bwbVar.c = iA;
        if (iA2 != -1 && (packagesForUid = bqbVar.e.b.getPackagesForUid(iA2)) != null) {
            for (String str : packagesForUid) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                bwb bwbVar2 = (bwb) cloVarO.b;
                str.getClass();
                cme cmeVar = bwbVar2.d;
                if (!cmeVar.c()) {
                    bwbVar2.d = clt.t(cmeVar);
                }
                bwbVar2.d.add(str);
            }
        }
        bug bugVar = bqbVar.b;
        clo cloVarO2 = bvw.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        bvw bvwVar = (bvw) cloVarO2.b;
        bwb bwbVar3 = (bwb) cloVarO.i();
        bwbVar3.getClass();
        bvwVar.c = bwbVar3;
        bvwVar.b = 30;
        bugVar.d((bvw) cloVarO2.i());
        return new bpz(this, iA, i);
    }

    final void c(int i) {
        ((cbs) ((cbs) a.c().g(btt.a)).j("com/google/android/tv/remote/service/EmoteDevice", "forgetSink", 112, "EmoteDevice.java")).p("Voice recorder stopped");
        f(i, false, false);
    }

    final synchronized void d(int i, int i2) {
        if (this.c != i) {
            return;
        }
        this.k = SystemClock.uptimeMillis();
        this.l = SystemClock.uptimeMillis();
        this.b = i2;
    }

    final synchronized void e(boolean z) {
        f(this.c, true, z);
    }

    public final String toString() {
        return this.g;
    }
}
