package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myn {
    public final boolean a;
    public final boolean b;
    public final tst c;

    public myn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myn) {
            myn mynVar = (myn) obj;
            if (this.a == mynVar.a && this.b == mynVar.b && this.c.equals(mynVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "FamilyLibraryViewModel{isShared=" + this.a + ", enableSwitch=" + this.b + ", welcomeCard=" + String.valueOf(this.c) + "}";
    }

    public myn(boolean z, boolean z2, tst tstVar) {
        this.a = z;
        this.b = z2;
        this.c = tstVar;
    }
}
