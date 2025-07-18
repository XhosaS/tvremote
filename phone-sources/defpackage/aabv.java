package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aabv extends aabw {
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;

    public aabv(String str, byte b) {
        super(str);
        this.n = b;
    }

    private Object readResolve() {
        switch (this.n) {
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case 4:
                return d;
            case 5:
                return e;
            case 6:
                return f;
            case 7:
                return g;
            case 8:
                return h;
            case 9:
                return i;
            case 10:
                return j;
            case 11:
                return k;
            default:
                return l;
        }
    }

    @Override // defpackage.aabw
    public final aabu a(aabk aabkVar) {
        byte b = this.n;
        aabk aabkVarC = aabp.c(aabkVar);
        switch (b) {
            case 1:
                return aabkVarC.C();
            case 2:
                return aabkVarC.A();
            case 3:
                return aabkVarC.K();
            case 4:
                return aabkVarC.L();
            case 5:
                return aabkVarC.H();
            case 6:
                return aabkVarC.J();
            case 7:
                return aabkVarC.B();
            case 8:
                return aabkVarC.D();
            case 9:
                return aabkVarC.E();
            case 10:
                return aabkVarC.G();
            case 11:
                return aabkVarC.I();
            default:
                return aabkVarC.F();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aabv) && this.n == ((aabv) obj).n;
    }

    public final int hashCode() {
        return 1 << this.n;
    }
}
