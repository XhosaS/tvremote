package defpackage;

import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ema {
    public final elz a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final pku h;
    private final int i;

    public ema(AudioTrack audioTrack, pku pkuVar) {
        this.a = new elz(audioTrack);
        this.i = audioTrack.getSampleRate();
        this.h = pkuVar;
        c();
    }

    public final long a(long j, float f) {
        elz elzVar = this.a;
        return b(elzVar.e, elzVar.a(), j, f);
    }

    public final long b(long j, long j2, long j3, float f) {
        return edt.A(j, this.i) + edt.v(j3 - j2, f);
    }

    public final void c() {
        d(0);
    }

    public final void d(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.g = -9223372036854775807L;
            this.c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.d = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
