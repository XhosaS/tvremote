package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnh {
    public static final String a = cbx.d("NetworkRequestCompat");
    public final Object b;

    public cnh() {
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnh) && agvy.c(this.b, ((cnh) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.b + ')';
    }

    public cnh(Object obj) {
        this.b = obj;
    }
}
