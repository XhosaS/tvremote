package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpj {
    public String a;
    private String b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private byte g;

    public final qpk a() {
        if (this.g == 15 && this.b != null) {
            return new qpk(this.b, this.a, this.c, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" url");
        }
        if ((this.g & 1) == 0) {
            sb.append(" width");
        }
        if ((this.g & 2) == 0) {
            sb.append(" height");
        }
        if ((this.g & 4) == 0) {
            sb.append(" shouldAuthenticateFifeUrls");
        }
        if ((this.g & 8) == 0) {
            sb.append(" shouldApplyFifeOptions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.g = (byte) (this.g | 2);
    }

    public final void c(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 8);
    }

    public final void d(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 4);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
    }

    public final void f(int i) {
        this.c = i;
        this.g = (byte) (this.g | 1);
    }
}
