package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class aat {
    public final long a = 1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof aat)) {
            return false;
        }
        long j = ((aat) obj).a;
        return true;
    }

    public final int hashCode() {
        return a.k(1L);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=1)";
    }
}
