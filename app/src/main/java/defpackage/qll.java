package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qll extends qlt {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    private String j;
    private boolean k;
    private boolean l;
    private byte m;

    @Override // defpackage.qlt
    public final qlv a() {
        String str;
        int i;
        int i2;
        int i3;
        if (this.m == 3 && (str = this.j) != null && (i = this.g) != 0 && (i2 = this.h) != 0 && (i3 = this.i) != 0) {
            return new qlm(str, this.k, this.a, this.b, this.c, this.d, this.l, i, i2, this.e, this.f, i3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" accountName");
        }
        if ((this.m & 1) == 0) {
            sb.append(" isMetadataAvailable");
        }
        if ((this.m & 2) == 0) {
            sb.append(" isG1User");
        }
        if (this.g == 0) {
            sb.append(" isDasherUser");
        }
        if (this.h == 0) {
            sb.append(" isUnicornUser");
        }
        if (this.i == 0) {
            sb.append(" ageRange");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.qlt
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accountName");
        }
        this.j = str;
    }

    @Override // defpackage.qlt
    public final void c(String str) {
        this.e = str;
    }

    @Override // defpackage.qlt
    public final void d(String str) {
        this.a = str;
    }

    @Override // defpackage.qlt
    public final void e(String str) {
        this.c = str;
    }

    @Override // defpackage.qlt
    public final void f(String str) {
        this.b = str;
    }

    @Override // defpackage.qlt
    public final void g(int i) {
        this.g = i;
    }

    @Override // defpackage.qlt
    public final void h(boolean z) {
        this.l = z;
        this.m = (byte) (this.m | 2);
    }

    @Override // defpackage.qlt
    public final void i(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 1);
    }

    @Override // defpackage.qlt
    public final void j(String str) {
        this.d = str;
    }
}
