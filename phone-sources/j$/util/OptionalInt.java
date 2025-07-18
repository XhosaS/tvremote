package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class OptionalInt {
    public static final OptionalInt c = new OptionalInt();
    public final boolean a;
    public final int b;

    public OptionalInt() {
        this.a = false;
        this.b = 0;
    }

    public static OptionalInt empty() {
        return c;
    }

    public static OptionalInt of(int i) {
        return new OptionalInt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalInt)) {
            return false;
        }
        OptionalInt optionalInt = (OptionalInt) obj;
        boolean z = this.a;
        return (z && optionalInt.a) ? this.b == optionalInt.b : z == optionalInt.a;
    }

    public int getAsInt() {
        if (this.a) {
            return this.b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public boolean isPresent() {
        return this.a;
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.b + "]";
    }

    public OptionalInt(int i) {
        this.a = true;
        this.b = i;
    }
}
