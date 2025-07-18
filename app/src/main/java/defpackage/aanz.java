package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanz extends aaof {
    public final String a;
    public final long b;
    public final int c;

    public aanz(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.aaof
    public final long a() {
        return this.b;
    }

    @Override // defpackage.aaof
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aaof
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaof) {
            aaof aaofVar = (aaof) obj;
            String str = this.a;
            if (str != null ? str.equals(aaofVar.b()) : aaofVar.b() == null) {
                if (this.b == aaofVar.a() && ((i = this.c) != 0 ? i == aaofVar.c() : aaofVar.c() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = this.c;
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (i != 0 ? i : 0);
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
        long j = this.b;
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + j + ", responseCode=" + str + "}";
    }
}
