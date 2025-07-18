package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pyb {
    public Object a;
    public Object b;
    public Object c;
    private boolean d;
    private byte e;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, vvj] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, vvj] */
    public final pyc a() {
        if (this.e != 1) {
            throw new IllegalStateException("Missing required properties: isRetryableError");
        }
        return new pyc(this.a, this.b, (Throwable) this.c, this.d);
    }

    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }

    public final myj c() {
        Object obj;
        Object obj2;
        Object obj3;
        if (this.e == 1 && (obj = this.a) != null && (obj2 = this.b) != null && (obj3 = this.c) != null) {
            return new mye((ksn) obj, (ksy) obj2, (String) obj3, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" account");
        }
        if (this.b == null) {
            sb.append(" assetId");
        }
        if (this.c == null) {
            sb.append(" assetTitle");
        }
        if (this.e == 0) {
            sb.append(" isToShare");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(ksy ksyVar) {
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.b = ksyVar;
    }

    public final void e(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}
