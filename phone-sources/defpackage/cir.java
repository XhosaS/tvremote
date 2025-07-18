package defpackage;

/* compiled from: PG */
@yji
/* loaded from: classes.dex */
public final class cir {
    public final Object a;

    public final boolean equals(Object obj) {
        return (obj instanceof cir) && yks.e(this.a, ((cir) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ')';
    }
}
