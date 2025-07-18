package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flw {
    public long a;
    public boolean b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    private final fel m;

    public flw(fel felVar) {
        this.m = felVar;
    }

    public final void a(int i) {
        long j = this.k;
        if (j != -9223372036854775807L) {
            long j2 = this.a;
            long j3 = this.j;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            this.m.e(j, this.l ? 1 : 0, i2, i, null);
        }
    }
}
