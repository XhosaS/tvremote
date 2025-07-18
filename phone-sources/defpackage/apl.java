package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apl {
    public final aeh a;
    public final aeh b;
    private final aeh c;

    public apl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apl)) {
            return false;
        }
        apl aplVar = (apl) obj;
        return yks.e(this.a, aplVar.a) && yks.e(this.c, aplVar.c) && yks.e(this.b, aplVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.c + ", large=" + this.b + ')';
    }

    public /* synthetic */ apl(byte[] bArr) {
        aeh aehVarA = aep.a(4.0f);
        aeh aehVarA2 = aep.a(4.0f);
        aeh aehVarA3 = aep.a(0.0f);
        this.a = aehVarA;
        this.c = aehVarA2;
        this.b = aehVarA3;
    }
}
