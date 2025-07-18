package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btv {
    public final btu a = new btu(1, 1);
    public final btu b = new btu(1, 1);
    public long c;

    public final void a(long j, long j2) {
        this.a.b(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.b.b(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void b() {
        this.a.c();
        this.b.c();
        this.c = 0L;
    }
}
