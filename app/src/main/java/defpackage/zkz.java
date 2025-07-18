package defpackage;

import j$.time.Duration;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zkz extends zla {
    final int a;
    public final Duration b;
    public final double c;

    public zkz(Duration duration, double d, int i) {
        yqw.I(true, "%s (%s) must be > 0", "numAttempts", i);
        this.a = i;
        yqw.F(ztt.b(duration), "duration (%s) must be positive", duration);
        this.b = duration;
        yqw.J(d > 0.0d, "%s (%s) must be > 0", "multiplier", Double.valueOf(d));
        this.c = d;
    }

    @Override // defpackage.zla
    public final boolean a(int i) {
        yqw.I(i >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zkz) {
            zkz zkzVar = (zkz) obj;
            if (this.b.equals(zkzVar.b) && this.c == zkzVar.c && this.a == zkzVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Double.valueOf(this.c)});
    }
}
