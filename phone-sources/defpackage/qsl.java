package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsl {
    public Object a;
    public Object b;
    public Object c;
    private boolean d;
    private boolean e;
    private byte f;

    public qsl() {
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, vvj] */
    public final qsm a() {
        if (this.f != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" isRetryableError");
            }
            if ((this.f & 2) == 0) {
                sb.append(" isAuthError");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj = this.a;
        return new qsm((Integer) obj, this.b, (Throwable) this.c, this.d, this.e);
    }

    public final void b(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 1);
    }

    public final mwu d() {
        Object obj;
        if (this.f == 3 && (obj = this.b) != null) {
            return new mwu((mwv) obj, (tst) this.c, this.e, this.d, (tst) this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" primaryAction");
        }
        if ((this.f & 1) == 0) {
            sb.append(" discountsAvailable");
        }
        if ((this.f & 2) == 0) {
            sb.append(" watchOnGpmRibbon");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void e(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 1);
    }

    public final void f(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 2);
    }

    public qsl(byte[] bArr, byte[] bArr2) {
        trk trkVar = trk.a;
        this.c = trkVar;
        this.a = trkVar;
    }
}
