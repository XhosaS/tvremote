package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnd {
    public final int a;
    public final int b;
    public final boolean c;

    public rnd() {
        throw null;
    }

    public static rnc a() {
        rnc rncVar = new rnc();
        rncVar.a = 11;
        rncVar.b = 2;
        rncVar.c = true;
        rncVar.d = (byte) 7;
        return rncVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rnd) {
            rnd rndVar = (rnd) obj;
            if (this.a == rndVar.a && this.b == rndVar.b && this.c == rndVar.c) {
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

    public rnd(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }
}
