package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wlx extends wma {
    public final String a;
    public final Integer b;
    private final aasp c;

    public wlx(String str, Integer num, aasp aaspVar) {
        this.a = str;
        this.b = num;
        this.c = aaspVar;
    }

    @Override // defpackage.wma
    public final aasp a() {
        return this.c;
    }

    @Override // defpackage.wma
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.wma
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wma) {
            wma wmaVar = (wma) obj;
            String str = this.a;
            if (str != null ? str.equals(wmaVar.c()) : wmaVar.c() == null) {
                Integer num = this.b;
                if (num != null ? num.equals(wmaVar.b()) : wmaVar.b() == null) {
                    if (this.c.equals(wmaVar.a())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.b;
        return ((((iHashCode ^ 1000003) * 1000003) ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "GrpcClientConfig{host=" + this.a + ", port=" + this.b + ", rpcServiceConfig=" + this.c.toString() + "}";
    }
}
