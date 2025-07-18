package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgh extends mgl {
    public final String a;
    public final int b;
    public final boolean c;
    public final mgn d;

    public mgh(String str, int i, boolean z, mgn mgnVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = mgnVar;
    }

    @Override // defpackage.mgl
    public final int a() {
        return this.b;
    }

    @Override // defpackage.mgl
    public final mgn b() {
        return this.d;
    }

    @Override // defpackage.mgl
    public final String c() {
        return this.a;
    }

    @Override // defpackage.mgl
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgl) {
            mgl mglVar = (mgl) obj;
            if (this.a.equals(mglVar.c()) && this.b == mglVar.a()) {
                mglVar.e();
                mglVar.f();
                mglVar.g();
                if (this.c == mglVar.d() && this.d.equals(mglVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Integer.MAX_VALUE) * 1000003) ^ Integer.MAX_VALUE) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ThreadPoolConfig{name=" + this.a + ", numThreads=" + this.b + ", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=" + this.c + ", listener=" + this.d.toString() + "}";
    }

    @Override // defpackage.mgl
    public final void e() {
    }

    @Override // defpackage.mgl
    public final void f() {
    }

    @Override // defpackage.mgl
    public final void g() {
    }
}
