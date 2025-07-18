package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class OptionalLong {
    public static final OptionalLong c = new OptionalLong();
    public final boolean a;
    public final long b;

    public OptionalLong() {
        this.a = false;
        this.b = 0L;
    }

    public static OptionalLong empty() {
        return c;
    }

    public static OptionalLong of(long j) {
        return new OptionalLong(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalLong)) {
            return false;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        boolean z = this.a;
        return (z && optionalLong.a) ? this.b == optionalLong.b : z == optionalLong.a;
    }

    public long getAsLong() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public boolean isPresent() {
        return this.a;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }

    public OptionalLong(long j) {
        this.a = true;
        this.b = j;
    }
}
