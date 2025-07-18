package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zim extends zjh {
    public zjb a;
    public ziu b;
    public zjh c;
    public int d;
    public zjh e;

    public zim(zjb zjbVar, ziu ziuVar, zjh zjhVar, int i, zjh zjhVar2) {
        this.a = zjbVar;
        this.b = ziuVar;
        this.c = zjhVar;
        g(i);
        this.d = i;
        if (i == 1) {
            zjd.c.e(zjhVar2);
        } else if (i == 2) {
            zic.b.e(zjhVar2);
        }
        this.e = zjhVar2;
    }

    private static zjh f(zjm zjmVar, int i) {
        if (zjmVar.b() > i) {
            return zjmVar.h(i).p();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    private static void g(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(a.cf(i, "invalid encoding value: "));
        }
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return b().a(z);
    }

    public abstract zjm b();

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.m(z, 40);
        b().c(zjfVar, false);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (this == zjhVar) {
            return true;
        }
        if (!(zjhVar instanceof zim)) {
            return false;
        }
        zim zimVar = (zim) zjhVar;
        return vxr.aZ(this.a, zimVar.a) && vxr.aZ(this.b, zimVar.b) && vxr.aZ(this.c, zimVar.c) && this.d == zimVar.d && this.e.w(zimVar.e);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return true;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return (((vxr.aY(this.a) ^ vxr.aY(this.b)) ^ vxr.aY(this.c)) ^ this.d) ^ this.e.hashCode();
    }

    @Override // defpackage.zjh
    public zjh k() {
        return new zkk(this.a, this.b, this.c, this.d, this.e);
    }

    public zim(zjm zjmVar) {
        int i;
        zjh zjhVarP;
        zjh zjhVarF = f(zjmVar, 0);
        if (zjhVarF instanceof zjb) {
            this.a = (zjb) zjhVarF;
            zjhVarF = f(zjmVar, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (zjhVarF instanceof ziu) {
            this.b = (ziu) zjhVarF;
            i++;
            zjhVarF = f(zjmVar, i);
        }
        if (!(zjhVarF instanceof zjr)) {
            this.c = zjhVarF;
            i++;
            zjhVarF = f(zjmVar, i);
        }
        if (zjmVar.b() == i + 1) {
            if (zjhVarF instanceof zjr) {
                zjr zjrVar = (zjr) zjhVarF;
                int i2 = zjrVar.c;
                g(i2);
                this.d = i2;
                wcq.ar(zjrVar);
                int i3 = zjrVar.c;
                if (i3 == 0) {
                    zjhVarP = zjrVar.f().p();
                } else if (i3 == 1) {
                    zjhVarP = zjd.g(zjrVar, false);
                } else if (i3 == 2) {
                    zjhVarP = zic.o(zjrVar);
                } else {
                    throw new IllegalArgumentException("invalid tag: ".concat(wcq.ap(zjrVar)));
                }
                this.e = zjhVarP;
                return;
            }
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        throw new IllegalArgumentException("input sequence too large");
    }
}
