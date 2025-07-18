package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ann {
    public static final float a;
    public static final float b;
    public static final yy c;
    private static final yy d;

    static {
        za zaVar = new za(16.0f, 8.0f, 16.0f, 8.0f);
        d = zaVar;
        a = 64.0f;
        b = 36.0f;
        c = new za(8.0f, zaVar.a, 8.0f, zaVar.b);
    }

    public static final any a(long j, bao baoVar, int i) {
        long j2 = (i & 1) != 0 ? bnq.f : 0L;
        if ((i & 2) != 0) {
            j = kv.B(baoVar).h();
        }
        long j3 = j;
        long jG = kv.B(baoVar).g();
        return new any(j2, j3, j2, bny.k(bnq.d(jG), bnq.c(jG), bnq.b(jG), kv.G(0.38f, 0.38f, baoVar), bnq.f(jG)));
    }
}
