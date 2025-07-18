package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ze {
    public float a;
    public boolean b;
    public ye c;
    private yj d;

    public ze() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        ze zeVar = (ze) obj;
        if (Float.compare(this.a, zeVar.a) != 0 || this.b != zeVar.b || !yks.e(this.c, zeVar.c)) {
            return false;
        }
        yj yjVar = zeVar.d;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        int iQ = a.q(this.b);
        ye yeVar = this.c;
        return (((iFloatToIntBits + iQ) * 31) + (yeVar == null ? 0 : yeVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public /* synthetic */ ze(byte[] bArr) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
        this.d = null;
    }
}
