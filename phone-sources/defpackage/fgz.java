package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgz {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final fhc c = new fhc();
    public int d;
    public int e;
    public long f;
    public pku g;

    public final long a(fdq fdqVar, int i) {
        fdqVar.j(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
