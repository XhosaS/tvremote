package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhx {
    public int a;
    public boolean b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public nhx() {
    }

    public final int a() {
        if ((this.c & 1) != 0) {
            return this.a;
        }
        throw new IllegalStateException("Property \"delegationType\" has not been set");
    }

    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 4);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, lio] */
    public final mwv d() {
        Object obj;
        ?? r4;
        int i;
        if (this.c == 3 && (obj = this.f) != null && (r4 = this.k) != 0 && (i = this.a) != 0) {
            Object obj2 = this.j;
            boolean z = this.b;
            Object obj3 = this.d;
            Object obj4 = this.e;
            Object obj5 = this.g;
            tst tstVar = (tst) obj5;
            tst tstVar2 = (tst) obj4;
            return new mwv((String) obj, (tst) obj2, r4, z, i, (tst) obj3, tstVar2, tstVar, (tst) this.h, (tst) this.i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" text");
        }
        if (this.k == null) {
            sb.append(" actionNode");
        }
        if ((this.c & 1) == 0) {
            sb.append(" isRestricted");
        }
        if ((this.c & 2) == 0) {
            sb.append(" providerIsEntitled");
        }
        if (this.a == 0) {
            sb.append(" actionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(lio lioVar) {
        if (lioVar == null) {
            throw new NullPointerException("Null actionNode");
        }
        this.k = lioVar;
    }

    public final void f(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.f = str;
    }

    public nhx(byte[] bArr, byte[] bArr2) {
        trk trkVar = trk.a;
        this.j = trkVar;
        this.d = trkVar;
        this.e = trkVar;
        this.g = trkVar;
        this.h = trkVar;
        this.i = trkVar;
    }
}
