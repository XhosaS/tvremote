package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqo {
    public final int a;
    public final int b;
    public final boolean c;

    public aqo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqo) {
            aqo aqoVar = (aqo) obj;
            if (this.a == aqoVar.a && this.b == aqoVar.b && this.c == aqoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.c ? 1237 : 1231) ^ ((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=null, primesMetricExecutorPriority=" + this.a + ", primesMetricExecutorPoolSize=" + this.b + ", enableDeferredTasks=" + this.c + "}";
    }

    public aqo(byte[] bArr) {
        this.a = 11;
        this.b = 2;
        this.c = true;
    }
}
