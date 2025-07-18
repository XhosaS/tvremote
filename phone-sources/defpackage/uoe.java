package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uoe {
    public final String a;
    public final long b;
    public final int c;

    public uoe() {
        throw null;
    }

    public static uod a() {
        uod uodVar = new uod();
        uodVar.b(0L);
        return uodVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uoe) {
            uoe uoeVar = (uoe) obj;
            String str = this.a;
            if (str != null ? str.equals(uoeVar.a) : uoeVar.a == null) {
                if (this.b == uoeVar.b) {
                    int i = this.c;
                    int i2 = uoeVar.c;
                    if (i != 0 ? i == i2 : i2 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            a.bl(i2);
            i = i2;
        }
        return ((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
        long j = this.b;
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + j + ", responseCode=" + str + "}";
    }

    public uoe(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }
}
