package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcl {
    public int b;
    public int c;
    final /* synthetic */ agco e;
    private final int f;
    private final agck g;
    public final ahwx a = new ahwx();
    public boolean d = false;

    public agcl(agco agcoVar, int i, int i2, agck agckVar) {
        this.e = agcoVar;
        this.f = i;
        this.b = i2;
        this.g = agckVar;
    }

    final int a() {
        return Math.max(0, Math.min(this.b, (int) this.a.b));
    }

    final int b() {
        return Math.min(this.b, this.e.d.b);
    }

    final void c(ahwx ahwxVar, int i, boolean z) {
        while (true) {
            agco agcoVar = this.e;
            agdi agdiVar = agcoVar.b;
            agdi agdiVar2 = ((agbh) ((agbg) agdiVar).b).b;
            int iMin = Math.min(i, ((agdq) agdiVar2).a);
            int i2 = -iMin;
            agcoVar.d.f(i2);
            f(i2);
            try {
                boolean z2 = false;
                if (ahwxVar.b == iMin && z) {
                    z2 = true;
                }
                boolean z3 = z2;
                int i3 = this.f;
                ahwx ahwxVar2 = ahwxVar;
                ((agbg) agdiVar).c.b(2, i3, ahwxVar2, iMin, z3);
                try {
                    agdiVar2.c(z3, i3, ahwxVar2, iMin);
                } catch (IOException e) {
                    ((agbg) agdiVar).a.e(e);
                }
                this.g.m(iMin);
                i -= iMin;
                if (i <= 0) {
                    return;
                } else {
                    ahwxVar = ahwxVar2;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    final boolean d() {
        return this.a.b > 0;
    }

    final void e(int i, agcn agcnVar) {
        int iMin = Math.min(i, b());
        int i2 = 0;
        while (d() && iMin > 0) {
            ahwx ahwxVar = this.a;
            long j = iMin;
            long j2 = ahwxVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                c(ahwxVar, i3, this.d);
            } else {
                i2 += iMin;
                c(ahwxVar, iMin, false);
            }
            agcnVar.a++;
            iMin = Math.min(i - i2, b());
        }
    }

    final void f(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.b) {
            this.b += i;
            return;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f);
    }
}
