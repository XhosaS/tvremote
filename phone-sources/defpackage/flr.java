package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flr {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    private final fel g;
    private long h;

    public flr(fel felVar) {
        this.g = felVar;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.b) {
            int i3 = this.e;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.e = i3 + (i2 - i);
            } else {
                this.c = ((bArr[i4] & 192) >> 6) == 0;
                this.b = false;
            }
        }
    }

    public final void b(long j, int i, boolean z) {
        a.ab(this.f != -9223372036854775807L);
        if (this.d == 182 && z && this.a) {
            this.g.e(this.f, this.c ? 1 : 0, (int) (j - this.h), i, null);
        }
        if (this.d != 179) {
            this.h = j;
        }
    }

    public final void c() {
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = -1;
    }
}
