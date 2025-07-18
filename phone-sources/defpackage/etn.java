package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etn {
    public final euh a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    final eud h;

    public etn(euh euhVar, int i, long j, long j2, int i2) {
        this(euhVar, i, j, j2, -1L, i2, 0, new eud());
    }

    public final float a() {
        return this.h.b;
    }

    public final long b() {
        return this.h.a;
    }

    public etn(euh euhVar, int i, long j, long j2, long j3, int i2, int i3, eud eudVar) {
        boolean z = true;
        a.H((i3 == 0) == (i != 4));
        if (i2 != 0) {
            if (i == 2) {
                z = false;
            } else if (i == 0) {
                i = 0;
                z = false;
            }
            a.H(z);
        }
        this.a = euhVar;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = eudVar;
    }
}
