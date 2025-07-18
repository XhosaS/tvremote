package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class utm implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ utm(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, xqh] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                ((utr) this.a).j((vvd) this.b);
                break;
            case 1:
                try {
                    this.a.run();
                    break;
                } catch (Throwable th) {
                    utr utrVar = (utr) this.b;
                    utrVar.h = true;
                    wbb wbbVar = utrVar.j;
                    if (wbbVar != null) {
                        wbbVar.a(xtk.c(th), new xsm());
                        xqb xqbVar = utrVar.i;
                        if (xqbVar == null || utrVar.e.e != 4) {
                            return;
                        }
                        xqbVar.c(null, th);
                        return;
                    }
                    return;
                }
            case 2:
                utn utnVar = (utn) this.b;
                if (!utnVar.a) {
                    utnVar.c.c((xsm) this.a);
                    break;
                }
                break;
            case 3:
                utn utnVar2 = (utn) this.b;
                if (!utnVar2.a) {
                    utnVar2.c.d(this.a);
                    break;
                }
                break;
            case 4:
                ((utw) this.b).a.c((xsm) this.a);
                break;
            case 5:
                ((utw) this.b).a.d(this.a);
                break;
            case 6:
                ((xwe) this.b).g(xtk.e.e(((StringBuilder) this.a).toString()), true);
                break;
            case 7:
                xtk xtkVar = (xtk) this.b;
                Throwable th2 = xtkVar.p;
                ((xwe) this.a).b.c(xtkVar.o, th2);
                break;
            case 8:
                ((xwe) this.b).b.f(this.a);
                break;
            case 9:
                ((xwd) this.a).c.c((xsm) this.b);
                break;
            case 10:
                ((xwd) this.b).c.d(this.a);
                break;
            case 11:
                ((xwj) this.a).h.v(this.b);
                break;
            case 12:
                ((xwj) this.a).h.l((xqs) this.b);
                break;
            case 13:
                ((xwj) this.a).h.k((xqp) this.b);
                break;
            case 14:
                ((xwj) this.b).h.w((InputStream) this.a);
                break;
            case 15:
                ((xwj) this.a).h.h((xtk) this.b);
                break;
            case 16:
                ((xwi) this.b).a.e((xzg) this.a);
                break;
            case 17:
                ((xwi) this.a).a.c((xsm) this.b);
                break;
            case 18:
                xwk xwkVar = new xwk(null);
                xwkVar.b = xtm.b((xtk) ((xwk) this.b).a);
                ((xwl) this.a).b.G(xwkVar.a());
                break;
            case 19:
                ((xwl) this.a).b.G(((xwk) this.b).a());
                break;
            default:
                xwk xwkVar2 = new xwk(null);
                xwl xwlVar = (xwl) this.b;
                xwkVar2.b = xtm.b(xtk.k.e("Unable to resolve host ".concat(String.valueOf(xwlVar.a.i))).d((Throwable) this.a));
                xwlVar.b.G(xwkVar2.a());
                break;
        }
    }

    public utm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public utm(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ utm(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
