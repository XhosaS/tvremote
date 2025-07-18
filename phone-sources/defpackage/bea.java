package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bea implements bec {
    public final Object a;

    public bea(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bec
    public final Object a(bhu bhuVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bea) && yks.e(this.a, ((bea) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
