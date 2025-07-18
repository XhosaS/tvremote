package defpackage;

import android.os.SystemClock;
import com.google.android.tv.remote.service.audio.compression.Lc3Decoder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqb extends btc {
    public final long a = SystemClock.uptimeMillis();
    public final bug b;
    public bnr c;
    public int d;
    public final /* synthetic */ bqc e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private bqm k;

    public bqb(bqc bqcVar, bug bugVar) {
        this.e = bqcVar;
        this.b = bugVar;
    }

    @Override // defpackage.btc
    public final int a() {
        bqc bqcVar = this.e;
        return (bqcVar.f && "com.google.android.katniss".equals(bqcVar.d.b)) ? 24 : 8;
    }

    @Override // defpackage.btc
    protected final void b(int i) {
        bnr bnrVar = this.c;
        if (bnrVar != null) {
            bnrVar.e(true);
            bqc bqcVar = this.e;
            bqcVar.c.b(this.c);
        }
    }

    @Override // defpackage.btc
    public final void c(int i, int i2) {
        buy buyVar = buy.VOICE;
        if (h(buyVar, i, i2)) {
            boolean zI = i(buyVar, i2);
            this.g = zI;
            if (zI) {
                bqc bqcVar = this.e;
                bqcVar.c.c(this.c);
            } else {
                this.c.e(true);
                bqc bqcVar2 = this.e;
                bqcVar2.c.d(this.c);
            }
        }
        this.i = i(buy.PTT_ASSISTANT, i2);
    }

    @Override // defpackage.btc
    public final boolean d(bux buxVar) throws Throwable {
        long jUptimeMillis;
        Throwable th;
        int iOrdinal = buv.a(buxVar.b).ordinal();
        if (iOrdinal == 4) {
            if (this.f) {
                this.e.c.c(this.c);
            }
            return false;
        }
        switch (iOrdinal) {
            case 8:
                bvx bvxVar = buxVar.b == 30 ? (bvx) buxVar.c : bvx.a;
                int i = bvxVar.d;
                if (i < 0) {
                    jUptimeMillis = SystemClock.uptimeMillis();
                    bqc.a(this.h, this.i);
                } else {
                    if (i <= 0) {
                        throw new btb(8);
                    }
                    bqc.a(this.f, this.g);
                    if (i != this.d) {
                        ((cbs) bqc.a.g().j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler", "handleMessage", 193, "VoiceFeature.java")).w("Incoming voice session id %d doesn't match the requested session id %d", i, this.d);
                        bug bugVar = this.b;
                        clo cloVarO = bvw.a.o();
                        clo cloVarO2 = bvy.a.o();
                        if (!cloVarO2.b.A()) {
                            cloVarO2.l();
                        }
                        bvy bvyVar = (bvy) cloVarO2.b;
                        bvyVar.b |= 1;
                        bvyVar.c = i;
                        if (!cloVarO.b.A()) {
                            cloVarO.l();
                        }
                        bvw bvwVar = (bvw) cloVarO.b;
                        bvy bvyVar2 = (bvy) cloVarO2.i();
                        bvyVar2.getClass();
                        bvwVar.c = bvyVar2;
                        bvwVar.b = 31;
                        bugVar.d((bvw) cloVarO.i());
                        return true;
                    }
                    jUptimeMillis = -1;
                }
                int i2 = bvxVar.e;
                int i3 = bvxVar.f;
                int i4 = bvxVar.g;
                int iB = awc.b(bvxVar.b);
                if (iB == 0) {
                    throw null;
                }
                int i5 = iB - 1;
                if (i5 == 0) {
                    th = null;
                    this.k = new bql();
                    ((cbs) bqc.a.b().j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler", "handleMessage", 233, "VoiceFeature.java")).p("Using NOOP decoder");
                } else if (i5 != 20) {
                    th = null;
                } else {
                    if (!Lc3Decoder.a) {
                        ((cbs) bqc.a.f().j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler", "handleMessage", 213, "VoiceFeature.java")).p("LC3 decoder unavailable");
                        throw new btb(8);
                    }
                    int i6 = (bvxVar.b == 20 ? (bwa) bvxVar.c : bwa.a).b;
                    th = null;
                    if (i6 != 7500 && i6 != 10000) {
                        ((cbs) bqc.a.f().j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler", "handleMessage", 218, "VoiceFeature.java")).r("Invalid frame length %d", i6);
                        throw new btb(8);
                    }
                    try {
                        this.k = new Lc3Decoder((bvxVar.b == 20 ? (bwa) bvxVar.c : bwa.a).b, i2);
                        ((cbs) bqc.a.b().j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler", "handleMessage", 227, "VoiceFeature.java")).r("Using LC3 decoder with %d frame length", (bvxVar.b == 20 ? (bwa) bvxVar.c : bwa.a).b);
                    } catch (RuntimeException e) {
                        ((cbs) ((cbs) bqc.a.f().i(e)).j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler", "handleMessage", 224, "VoiceFeature.java")).p("Failed to create LC3 decoder");
                        throw new btb(e);
                    }
                }
                cbs cbsVar = (cbs) bqc.a.e().j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler", "handleMessage", 237, "VoiceFeature.java");
                Integer numValueOf = Integer.valueOf(i);
                Integer numValueOf2 = Integer.valueOf(i2);
                Integer numValueOf3 = Integer.valueOf(i3);
                Integer numValueOf4 = Integer.valueOf(i4);
                int iB2 = awc.b(bvxVar.b);
                int i7 = iB2 - 1;
                if (iB2 == 0) {
                    throw th;
                }
                Integer numValueOf5 = Integer.valueOf(i7);
                bug bugVar2 = this.b;
                cbsVar.J(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, bugVar2);
                if (i3 != 16 || i4 != 2) {
                    throw new btb(8);
                }
                this.j = i;
                if (i < 0) {
                    this.d = i;
                    bqr bqrVarA = this.e.e.a(new bpz(this, i, 0), 1, jUptimeMillis);
                    if (bqrVarA == null) {
                        clo cloVarO3 = bvw.a.o();
                        clo cloVarO4 = bvt.a.o();
                        if (!cloVarO4.b.A()) {
                            cloVarO4.l();
                        }
                        clt cltVar = cloVarO4.b;
                        bvt bvtVar = (bvt) cltVar;
                        bvtVar.c = 8;
                        bvtVar.b |= 1;
                        if (!cltVar.A()) {
                            cloVarO4.l();
                        }
                        bvt bvtVar2 = (bvt) cloVarO4.b;
                        bvtVar2.d = buxVar;
                        bvtVar2.b |= 2;
                        if (!cloVarO3.b.A()) {
                            cloVarO3.l();
                        }
                        bvw bvwVar2 = (bvw) cloVarO3.b;
                        bvt bvtVar3 = (bvt) cloVarO4.i();
                        bvtVar3.getClass();
                        bvwVar2.c = bvtVar3;
                        bvwVar2.b = 3;
                        bugVar2.d((bvw) cloVarO3.i());
                        this.j = 0;
                        this.d = 0;
                        return true;
                    }
                    bnr bnrVar = this.c;
                    ((cbs) ((cbs) bnr.a.c().g(btt.a)).j("com/google/android/tv/remote/service/EmoteDevice", "startAudioSession", 74, "EmoteDevice.java")).p("Voice session requested");
                    bnrVar.a(bqrVarA, i);
                }
                this.c.d(i, i2);
                return true;
            case 9:
                if (!this.f && !this.h) {
                    throw new btb(5);
                }
                if (this.j != 0) {
                    byte[] bArrT = (buxVar.b == 31 ? (ckv) buxVar.c : ckv.b).t();
                    ((cbs) ((cbs) bqc.a.c().g(btt.a)).j("com/google/android/tv/remote/service/VoiceFeature$ClientMessageHandler", "handleMessage", 283, "VoiceFeature.java")).x("Voice Packet %d from %s", bArrT.length, this.b);
                    byte[] bArrB = this.k.b(bArrT);
                    if (bArrB != null) {
                        bnr bnrVar2 = this.c;
                        int i8 = this.j;
                        synchronized (bnrVar2) {
                            if (bnrVar2.c == i8) {
                                bqr bqrVar = bnrVar2.d;
                                if (bnrVar2.e == 0) {
                                    bnrVar2.e = SystemClock.uptimeMillis();
                                }
                                bnrVar2.f += bArrB.length;
                                if (bqrVar != null) {
                                    bqrVar.d(new dln(bnrVar2.b, bArrB));
                                }
                            }
                        }
                    }
                }
                return true;
            case 10:
                if (!this.f && !this.h) {
                    throw new btb(5);
                }
                int i9 = (buxVar.b == 32 ? (bvz) buxVar.c : bvz.a).b;
                if (i9 == 0) {
                    throw new btb(8);
                }
                if (i9 == this.d) {
                    this.j = 0;
                    this.d = 0;
                    this.c.e(false);
                    this.k = null;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.btc
    public final boolean e(int i, bsw bswVar) {
        this.f = i(buy.VOICE, i);
        boolean zI = i(buy.PTT_ASSISTANT, i);
        this.h = zI;
        int i2 = 1;
        if (this.f || zI) {
            this.c = new bnr(this.b.toString(), new brk(this, i2), new bqa(this, i));
        }
        if (this.f) {
            bqc bqcVar = this.e;
            bqcVar.c.a(this.c);
        }
        return true;
    }

    @Override // defpackage.btc
    public final void f(bxj bxjVar) {
    }
}
