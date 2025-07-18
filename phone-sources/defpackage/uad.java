package defpackage;

import j$.time.Duration;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uad extends uae {
    final int a;
    final Duration b;
    final double c;

    public uad(Duration duration, int i) {
        boolean z = false;
        sij.u(i > 0, "%s (%s) must be > 0", "numAttempts", i);
        this.a = i;
        int i2 = uen.a;
        if (!duration.isNegative() && !duration.isZero()) {
            z = true;
        }
        sij.s(z, "duration (%s) must be positive", duration);
        this.b = duration;
        sij.v(true, "%s (%s) must be > 0", "multiplier", Double.valueOf(2.0d));
        this.c = 2.0d;
    }

    @Override // defpackage.uae
    public final boolean a(int i) {
        sij.u(i >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uad) {
            uad uadVar = (uad) obj;
            if (this.b.equals(uadVar.b)) {
                double d = uadVar.c;
                if (this.a == uadVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Double.valueOf(2.0d)});
    }
}
