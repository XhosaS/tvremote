package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebd {
    public static final ebd a = new ebd(new ebc());
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public final int e;
    public final boolean f;
    public final boolean g;

    public ebd(ebc ebcVar) {
        this.e = ebcVar.a;
        this.f = ebcVar.b;
        this.g = ebcVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ebd ebdVar = (ebd) obj;
            if (this.e == ebdVar.e && this.f == ebdVar.f && this.g == ebdVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.e + 31) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
