package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhl {
    public int a;

    public bhl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhl) && this.a == ((bhl) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }

    public /* synthetic */ bhl(byte[] bArr) {
        this.a = 0;
    }
}
