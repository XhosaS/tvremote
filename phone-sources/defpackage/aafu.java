package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aafu {
    public final long a;
    public final aabs b;
    aafu c;
    private String d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;

    public aafu(aabs aabsVar, long j) {
        this.a = j;
        this.b = aabsVar;
    }

    public final int a(long j) {
        aafu aafuVar = this.c;
        if (aafuVar != null && j >= aafuVar.a) {
            return aafuVar.a(j);
        }
        int i = this.e;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int iA = this.b.a(this.a);
        this.e = iA;
        return iA;
    }

    public final int b(long j) {
        aafu aafuVar = this.c;
        if (aafuVar != null && j >= aafuVar.a) {
            return aafuVar.b(j);
        }
        int i = this.f;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        int iB = this.b.b(this.a);
        this.f = iB;
        return iB;
    }

    public final String c(long j) {
        aafu aafuVar = this.c;
        if (aafuVar != null && j >= aafuVar.a) {
            return aafuVar.c(j);
        }
        if (this.d == null) {
            this.d = this.b.g(this.a);
        }
        return this.d;
    }
}
