package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uod {
    public int a;
    public Object b;
    private long c;
    private byte d;

    public final uoe a() {
        if (this.d != 1) {
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }
        return new uoe((String) this.b, this.c, this.a);
    }

    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public final qah c() {
        Object obj;
        if (this.d == 3 && (obj = this.b) != null) {
            return new qah(this.c, this.a, (byte[]) obj);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" id");
        }
        if ((this.d & 2) == 0) {
            sb.append(" jobType");
        }
        if (this.b == null) {
            sb.append(" payload");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(long j) {
        this.c = j;
        this.d = (byte) (this.d | 1);
    }

    public final void e(int i) {
        this.a = i;
        this.d = (byte) (this.d | 2);
    }

    public final void f(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = bArr;
    }
}
