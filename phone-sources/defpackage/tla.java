package defpackage;

import android.os.SystemClock;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tla {
    public final long a = SystemClock.elapsedRealtime();
    public final int b;
    private final byte[] c;

    public tla(byte[] bArr, int i) {
        this.c = bArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tla) {
            return Arrays.equals(this.c, ((tla) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return 0;
        }
        return Arrays.hashCode(bArr);
    }
}
