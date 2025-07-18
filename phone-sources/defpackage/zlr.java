package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlr extends zix {
    public static final zmd a;
    public static final zmd b;
    public static final ziu c;
    public static final ziu d;
    public zmd e;
    private zmd f;
    private ziu g;
    private ziu h;

    static {
        zmd zmdVar = new zmd(zoq.a, zkm.a);
        a = zmdVar;
        b = new zmd(zlp.e, zmdVar);
        c = new ziu(20L);
        d = new ziu(1L);
    }

    public zlr() {
        this.e = a;
        this.f = b;
        this.g = c;
        this.h = d;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(4);
        if (!this.e.equals(a)) {
            ziiVar.b(new zks(true, 0, this.e));
        }
        if (!this.f.equals(b)) {
            ziiVar.b(new zks(true, 1, this.f));
        }
        if (!this.g.w(c)) {
            ziiVar.b(new zks(true, 2, this.g));
        }
        if (!this.h.w(d)) {
            ziiVar.b(new zks(true, 3, this.h));
        }
        return new zkq(ziiVar);
    }

    public zlr(zmd zmdVar, zmd zmdVar2, ziu ziuVar, ziu ziuVar2) {
        this.e = zmdVar;
        this.f = zmdVar2;
        this.g = ziuVar;
        this.h = ziuVar2;
    }

    public zlr(zjm zjmVar) {
        this.e = a;
        this.f = b;
        this.g = c;
        this.h = d;
        for (int i = 0; i != zjmVar.b(); i++) {
            zjr zjrVar = (zjr) zjmVar.h(i);
            int i2 = zjrVar.c;
            if (i2 == 0) {
                this.e = zmd.b(zjrVar);
            } else if (i2 == 1) {
                this.f = zmd.b(zjrVar);
            } else if (i2 == 2) {
                this.g = ziu.n(zjrVar, true);
            } else if (i2 == 3) {
                this.h = ziu.n(zjrVar, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }
}
