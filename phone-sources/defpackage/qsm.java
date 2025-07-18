package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsm {
    public final Integer a;
    public final vvj b;
    public final Throwable c;
    public final boolean d;
    public final boolean e;

    public qsm() {
        throw null;
    }

    public static qsl b() {
        qsl qslVar = new qsl();
        qslVar.c(true);
        qslVar.b(false);
        return qslVar;
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qsm) {
            qsm qsmVar = (qsm) obj;
            Integer num = this.a;
            if (num != null ? num.equals(qsmVar.a) : qsmVar.a == null) {
                vvj vvjVar = this.b;
                if (vvjVar != null ? vvjVar.equals(qsmVar.b) : qsmVar.b == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(qsmVar.c) : qsmVar.c == null) {
                        if (this.d == qsmVar.d && this.e == qsmVar.e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        vvj vvjVar = this.b;
        int iHashCode2 = vvjVar == null ? 0 : vvjVar.hashCode();
        int i = iHashCode ^ 1000003;
        Throwable th = this.c;
        return (((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        Throwable th = this.c;
        return "ChimeRpcResponse{statusCode=" + this.a + ", response=" + String.valueOf(this.b) + ", error=" + String.valueOf(th) + ", isRetryableError=" + this.d + ", isAuthError=" + this.e + "}";
    }

    public qsm(Integer num, vvj vvjVar, Throwable th, boolean z, boolean z2) {
        this.a = num;
        this.b = vvjVar;
        this.c = th;
        this.d = z;
        this.e = z2;
    }
}
