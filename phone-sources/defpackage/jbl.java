package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jbl {
    public final Duration a;
    public final Instant b;

    public jbl(Duration duration, Instant instant) {
        this.a = duration;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbl)) {
            return false;
        }
        jbl jblVar = (jbl) obj;
        return yks.e(this.a, jblVar.a) && yks.e(this.b, jblVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LastWatchInfo(resumePositionMillis=" + this.a + ", lastWatchTimestampMillis=" + this.b + ")";
    }
}
