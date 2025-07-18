package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwo {
    private int a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private long h;
    private byte i;

    public kwo() {
    }

    public final kwp a() {
        if (this.i == -1) {
            return new kwp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" numberOfEpisodes");
        }
        if ((this.i & 2) == 0) {
            sb.append(" containsRentedItems");
        }
        if ((this.i & 4) == 0) {
            sb.append(" containsUnwatchedItems");
        }
        if ((this.i & 8) == 0) {
            sb.append(" containsHDItems");
        }
        if ((this.i & 16) == 0) {
            sb.append(" containsUHDItems");
        }
        if ((this.i & 32) == 0) {
            sb.append(" containsSDItems");
        }
        if ((this.i & 64) == 0) {
            sb.append(" mostRecentTimeAdded");
        }
        if ((this.i & 128) == 0) {
            sb.append(" mostRecentExpTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.i = (byte) (this.i | 8);
    }

    public final void c(boolean z) {
        this.b = z;
        this.i = (byte) (this.i | 2);
    }

    public final void d(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 32);
    }

    public final void e(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 16);
    }

    public final void f(boolean z) {
        this.c = z;
        this.i = (byte) (this.i | 4);
    }

    public final void g(long j) {
        this.h = j;
        this.i = (byte) (this.i | Byte.MIN_VALUE);
    }

    public final void h(long j) {
        this.g = j;
        this.i = (byte) (this.i | 64);
    }

    public final void i(int i) {
        this.a = i;
        this.i = (byte) (this.i | 1);
    }

    public kwo(kwp kwpVar) {
        this.a = kwpVar.a;
        this.b = kwpVar.b;
        this.c = kwpVar.c;
        this.d = kwpVar.d;
        this.e = kwpVar.e;
        this.f = kwpVar.f;
        this.g = kwpVar.g;
        this.h = kwpVar.h;
        this.i = (byte) -1;
    }
}
