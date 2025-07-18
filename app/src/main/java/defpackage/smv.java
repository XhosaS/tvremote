package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smv {
    public final sgo a;
    public final Integer b;
    private final Integer c;
    private final Integer d;

    public smv(sgo sgoVar, Integer num, Integer num2, Integer num3) {
        this.a = sgoVar;
        this.c = num;
        this.b = num2;
        this.d = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smv)) {
            return false;
        }
        smv smvVar = (smv) obj;
        return agvy.c(this.a, smvVar.a) && agvy.c(this.c, smvVar.c) && agvy.c(this.b, smvVar.b) && agvy.c(this.d, smvVar.d);
    }

    public final int hashCode() {
        int iB;
        sgo sgoVar = this.a;
        if ((sgoVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(sgoVar.getClass()).b(sgoVar);
        } else {
            int iB2 = sgoVar.memoizedHashCode;
            if (iB2 == 0) {
                iB2 = abza.a.a(sgoVar.getClass()).b(sgoVar);
                sgoVar.memoizedHashCode = iB2;
            }
            iB = iB2;
        }
        Integer num = this.c;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i = iB * 31;
        Integer num2 = this.b;
        int iHashCode2 = (((i + iHashCode) * 31) + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "AudioLoggingMetadata(clientInfo=" + this.a + ", routeToken=" + this.c + ", sessionToken=" + this.b + ", clientToken=" + this.d + ")";
    }

    public /* synthetic */ smv(sgo sgoVar, Integer num, Integer num2, int i) {
        this(sgoVar, num, (Integer) null, (i & 8) != 0 ? null : num2);
    }
}
