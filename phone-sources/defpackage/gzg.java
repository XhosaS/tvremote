package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzg {
    public final long a;
    public final long b;
    public final boolean c;
    public final zcc d;
    private final yft e;
    private final yft f;

    public gzg(zcl zclVar) {
        zclVar.getClass();
        this.e = ybn.g(3, new grq(this, 10));
        this.f = ybn.g(3, new grq(this, 11));
        this.a = zclVar.k;
        this.b = zclVar.l;
        this.c = zclVar.e != null;
        this.d = zclVar.f;
    }

    public final zbm a() {
        return (zbm) this.e.a();
    }

    public final zcg b() {
        return (zcg) this.f.a();
    }

    public final void c(zgl zglVar) {
        zglVar.Y(this.a);
        zglVar.W(10);
        zglVar.Y(this.b);
        zglVar.W(10);
        zglVar.Y(true != this.c ? 0L : 1L);
        zglVar.W(10);
        zcc zccVar = this.d;
        zglVar.Y(zccVar.a());
        zglVar.W(10);
        int iA = zccVar.a();
        for (int i = 0; i < iA; i++) {
            zglVar.Z(zccVar.c(i));
            zglVar.Z(": ");
            zglVar.Z(zccVar.d(i));
            zglVar.W(10);
        }
    }

    public gzg(zgm zgmVar) throws NumberFormatException {
        this.e = ybn.g(3, new grq(this, 10));
        this.f = ybn.g(3, new grq(this, 11));
        this.a = Long.parseLong(zgmVar.p());
        this.b = Long.parseLong(zgmVar.p());
        this.c = Integer.parseInt(zgmVar.p()) > 0;
        int i = Integer.parseInt(zgmVar.p());
        upq upqVar = new upq((byte[]) null, (byte[]) null);
        for (int i2 = 0; i2 < i; i2++) {
            String strP = zgmVar.p();
            int iT = ylh.T(strP, ':', 0, 6);
            if (iT != -1) {
                String strSubstring = strP.substring(0, iT);
                strSubstring.getClass();
                String string = ylh.E(strSubstring).toString();
                String strSubstring2 = strP.substring(iT + 1);
                strSubstring2.getClass();
                upqVar.u(string, strSubstring2);
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(strP));
            }
        }
        this.d = upqVar.t();
    }
}
