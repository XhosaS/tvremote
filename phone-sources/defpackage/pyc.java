package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyc {
    public final vvj a;
    public final vvj b;
    public final Throwable c;
    public final boolean d;

    public pyc() {
        throw null;
    }

    public static pyc a(vvj vvjVar, qsm qsmVar) {
        pyb pybVarC = c();
        pybVarC.a = vvjVar;
        pybVarC.b = qsmVar.b;
        pybVarC.c = qsmVar.c;
        pybVarC.b(qsmVar.d);
        return pybVarC.a();
    }

    public static pyb c() {
        pyb pybVar = new pyb();
        pybVar.b(true);
        return pybVar;
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pyc) {
            pyc pycVar = (pyc) obj;
            vvj vvjVar = this.a;
            if (vvjVar != null ? vvjVar.equals(pycVar.a) : pycVar.a == null) {
                vvj vvjVar2 = this.b;
                if (vvjVar2 != null ? vvjVar2.equals(pycVar.b) : pycVar.b == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(pycVar.c) : pycVar.c == null) {
                        if (this.d == pycVar.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        vvj vvjVar = this.a;
        int iHashCode = vvjVar == null ? 0 : vvjVar.hashCode();
        vvj vvjVar2 = this.b;
        int iHashCode2 = vvjVar2 == null ? 0 : vvjVar2.hashCode();
        int i = iHashCode ^ 1000003;
        Throwable th = this.c;
        return (((((i * 1000003) ^ iHashCode2) * 1000003) ^ (th != null ? th.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        Throwable th = this.c;
        vvj vvjVar = this.b;
        return "ChimeRpc{request=" + String.valueOf(this.a) + ", response=" + String.valueOf(vvjVar) + ", error=" + String.valueOf(th) + ", isRetryableError=" + this.d + "}";
    }

    public pyc(vvj vvjVar, vvj vvjVar2, Throwable th, boolean z) {
        this.a = vvjVar;
        this.b = vvjVar2;
        this.c = th;
        this.d = z;
    }
}
