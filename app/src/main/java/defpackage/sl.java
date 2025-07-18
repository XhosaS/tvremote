package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class sl {
    public final wx a = new wx(0);
    public final wr b = new wr(10);

    public final pw a(qv qvVar, int i) {
        sk skVar;
        pw pwVar;
        wx wxVar = this.a;
        int iD = wxVar.d(qvVar);
        if (iD >= 0 && (skVar = (sk) wxVar.h(iD)) != null) {
            int i2 = skVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                skVar.b = i3;
                if (i == 4) {
                    pwVar = skVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    pwVar = skVar.d;
                }
                if ((i3 & 12) == 0) {
                    wxVar.f(iD);
                    sk.b(skVar);
                }
                return pwVar;
            }
        }
        return null;
    }

    final void b(qv qvVar) {
        wx wxVar = this.a;
        sk skVarA = (sk) wxVar.get(qvVar);
        if (skVarA == null) {
            skVarA = sk.a();
            wxVar.put(qvVar, skVarA);
        }
        skVarA.b |= 1;
    }

    public final void c(qv qvVar, pw pwVar) {
        wx wxVar = this.a;
        sk skVarA = (sk) wxVar.get(qvVar);
        if (skVarA == null) {
            skVarA = sk.a();
            wxVar.put(qvVar, skVarA);
        }
        skVarA.d = pwVar;
        skVarA.b |= 8;
    }

    public final void d(qv qvVar, pw pwVar) {
        wx wxVar = this.a;
        sk skVarA = (sk) wxVar.get(qvVar);
        if (skVarA == null) {
            skVarA = sk.a();
            wxVar.put(qvVar, skVarA);
        }
        skVarA.c = pwVar;
        skVarA.b |= 4;
    }

    public final void e() {
        this.a.clear();
        this.b.h();
    }

    final void f(qv qvVar) {
        sk skVar = (sk) this.a.get(qvVar);
        if (skVar == null) {
            return;
        }
        skVar.b &= -2;
    }

    final void g(qv qvVar) {
        wr wrVar = this.b;
        int iC = wrVar.c();
        while (true) {
            iC--;
            if (iC < 0) {
                break;
            } else if (qvVar == wrVar.g(iC)) {
                wrVar.k(iC);
                break;
            }
        }
        sk skVar = (sk) this.a.remove(qvVar);
        if (skVar != null) {
            sk.b(skVar);
        }
    }

    public final boolean h(qv qvVar) {
        sk skVar = (sk) this.a.get(qvVar);
        return (skVar == null || (skVar.b & 1) == 0) ? false : true;
    }
}
