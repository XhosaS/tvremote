package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psy {
    public static final psy a = new psy(1, null);
    public final Throwable b;
    public final int c;

    public psy() {
        throw null;
    }

    public static final psy a(Throwable th) {
        return new psy(3, th);
    }

    public static final psy b(Throwable th) {
        return new psy(2, th);
    }

    public final String c() {
        int i = this.c;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "PERMANENT_FAILURE" : "TRANSIENT_FAILURE" : "SUCCESS";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof psy)) {
            return false;
        }
        psy psyVar = (psy) obj;
        int i = this.c;
        int i2 = psyVar.c;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            Throwable th = this.b;
            Throwable th2 = psyVar.b;
            if (th != null ? th.equals(th2) : th2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bl(i);
        Throwable th = this.b;
        return ((i ^ 1000003) * 1000003) ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        int i = this.c;
        return "Result{code=" + (i != 1 ? i != 2 ? i != 3 ? "null" : "PERMANENT_FAILURE" : "TRANSIENT_FAILURE" : "SUCCESS") + ", error=" + String.valueOf(this.b) + "}";
    }

    public psy(int i, Throwable th) {
        this.c = i;
        this.b = th;
    }
}
