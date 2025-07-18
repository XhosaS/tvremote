package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndu {
    public final Integer a;
    public final Object b;
    public final int c;
    private final ndv d;

    public ndu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ndu) {
            ndu nduVar = (ndu) obj;
            Integer num = this.a;
            if (num != null ? num.equals(nduVar.a) : nduVar.a == null) {
                if (this.b.equals(nduVar.b) && this.c == nduVar.c) {
                    ndv ndvVar = this.d;
                    ndv ndvVar2 = nduVar.d;
                    if (ndvVar != null ? ndvVar.equals(ndvVar2) : ndvVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        a.bl(i);
        ndv ndvVar = this.d;
        return ((((iHashCode * 1000003) ^ i) * 1000003) ^ (ndvVar != null ? ndvVar.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        int i = this.c;
        String string = this.b.toString();
        String str = i != 1 ? "VERY_LOW" : "DEFAULT";
        return "Event{code=" + this.a + ", payload=" + string + ", priority=" + str + ", productData=" + String.valueOf(this.d) + ", eventContext=null}";
    }

    public ndu(Integer num, Object obj, int i, ndv ndvVar) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        this.c = i;
        this.d = ndvVar;
    }
}
