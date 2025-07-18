package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fby {
    public long a;
    public long b;
    public double c;
    public Range d;

    public fby() {
        a.H(true);
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void a() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }
}
