package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsw extends juy {
    public String a;
    private int b;
    private int c;
    private boolean d;
    private byte e;

    @Override // defpackage.juy
    public final juz a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new jsx(this.b, str, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" internalErrorCode");
        }
        if (this.a == null) {
            sb.append(" errorMessage");
        }
        if ((this.e & 2) == 0) {
            sb.append(" httpStatusCode");
        }
        if ((this.e & 4) == 0) {
            sb.append(" retryableAsIs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.juy
    public final void b(int i) {
        this.c = i;
        this.e = (byte) (this.e | 2);
    }

    @Override // defpackage.juy
    public final void c(int i) {
        this.b = i;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.juy
    public final void d(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 4);
    }
}
