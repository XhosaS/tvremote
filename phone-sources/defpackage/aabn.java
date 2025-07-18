package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aabn extends aabo {
    private static final long serialVersionUID = -9937958251642L;
    public final transient aabw a;
    private final byte z;

    public aabn(String str, byte b, aabw aabwVar) {
        super(str);
        this.z = b;
        this.a = aabwVar;
    }

    private Object readResolve() {
        switch (this.z) {
            case 1:
                return aabo.b;
            case 2:
                return aabo.c;
            case 3:
                return aabo.d;
            case 4:
                return aabo.e;
            case 5:
                return aabo.f;
            case 6:
                return aabo.g;
            case 7:
                return aabo.h;
            case 8:
                return aabo.i;
            case 9:
                return aabo.j;
            case 10:
                return aabo.k;
            case 11:
                return aabo.l;
            case 12:
                return aabo.m;
            case 13:
                return aabo.n;
            case 14:
                return aabo.o;
            case 15:
                return aabo.p;
            case 16:
                return aabo.q;
            case 17:
                return aabo.r;
            case 18:
                return aabo.s;
            case 19:
                return aabo.t;
            case 20:
                return aabo.u;
            case 21:
                return aabo.v;
            case 22:
                return aabo.w;
            default:
                return aabo.x;
        }
    }

    @Override // defpackage.aabo
    public final aabm a(aabk aabkVar) {
        byte b = this.z;
        aabk aabkVarC = aabp.c(aabkVar);
        switch (b) {
            case 1:
                return aabkVarC.i();
            case 2:
                return aabkVarC.y();
            case 3:
                return aabkVarC.c();
            case 4:
                return aabkVarC.x();
            case 5:
                return aabkVarC.w();
            case 6:
                return aabkVarC.h();
            case 7:
                return aabkVarC.q();
            case 8:
                return aabkVarC.f();
            case 9:
                return aabkVarC.v();
            case 10:
                return aabkVarC.u();
            case 11:
                return aabkVarC.t();
            case 12:
                return aabkVarC.g();
            case 13:
                return aabkVarC.j();
            case 14:
                return aabkVarC.l();
            case 15:
                return aabkVarC.e();
            case 16:
                return aabkVarC.d();
            case 17:
                return aabkVarC.k();
            case 18:
                return aabkVarC.o();
            case 19:
                return aabkVarC.p();
            case 20:
                return aabkVarC.r();
            case 21:
                return aabkVarC.s();
            case 22:
                return aabkVarC.m();
            default:
                return aabkVarC.n();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aabn) && this.z == ((aabn) obj).z;
    }

    public final int hashCode() {
        return 1 << this.z;
    }
}
