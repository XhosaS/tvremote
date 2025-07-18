package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qah {
    public final long a;
    public final byte[] b;
    private final int c;

    public qah() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qah) {
            qah qahVar = (qah) obj;
            if (this.a == qahVar.a && this.c == qahVar.c) {
                boolean z = qahVar instanceof qah;
                if (Arrays.equals(this.b, qahVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ChimeTaskData{id=" + this.a + ", jobType=" + this.c + ", payload=" + Arrays.toString(this.b) + "}";
    }

    public qah(long j, int i, byte[] bArr) {
        this.a = j;
        this.c = i;
        this.b = bArr;
    }
}
