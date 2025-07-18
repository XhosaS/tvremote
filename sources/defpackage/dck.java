package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dck extends czr {
    public static final dcw a;
    public static final dcw b;
    public static final czo c;
    public static final czo d;
    public dcw e;
    private dcw f;
    private czo g;
    private czo h;

    static {
        dcw dcwVar = new dcw(dfh.a, dbg.a);
        a = dcwVar;
        b = new dcw(dci.e, dcwVar);
        c = new czo(20L);
        d = new czo(1L);
    }

    public dck() {
        this.e = a;
        this.f = b;
        this.g = c;
        this.h = d;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(4);
        if (!this.e.equals(a)) {
            czcVar.b(new dbm(true, 0, this.e));
        }
        if (!this.f.equals(b)) {
            czcVar.b(new dbm(true, 1, this.f));
        }
        if (!this.g.w(c)) {
            czcVar.b(new dbm(true, 2, this.g));
        }
        if (!this.h.w(d)) {
            czcVar.b(new dbm(true, 3, this.h));
        }
        return new dbk(czcVar);
    }

    public dck(dcw dcwVar, dcw dcwVar2, czo czoVar, czo czoVar2) {
        this.e = dcwVar;
        this.f = dcwVar2;
        this.g = czoVar;
        this.h = czoVar2;
    }

    public dck(dag dagVar) {
        this.e = a;
        this.f = b;
        this.g = c;
        this.h = d;
        for (int i = 0; i != dagVar.b(); i++) {
            dal dalVar = (dal) dagVar.h(i);
            int i2 = dalVar.c;
            if (i2 == 0) {
                this.e = dcw.b(dalVar);
            } else if (i2 == 1) {
                this.f = dcw.b(dalVar);
            } else if (i2 == 2) {
                this.g = czo.n(dalVar, true);
            } else if (i2 == 3) {
                this.h = czo.n(dalVar, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }
}
