package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adi {
    public final Object a;
    public int c;
    public boolean d;
    public adi f;
    private final adk g;
    public int b = -1;
    public final bcb e = new bci(null, bcz.c);

    public adi(Object obj, adk adkVar) {
        this.a = obj;
        this.g = adkVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        if (this.c <= 0) {
            wv.d("Release should only be called once");
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.g.a.remove(this);
            adi adiVar = this.f;
            if (adiVar != null) {
                adiVar.a();
            }
            this.f = null;
        }
    }

    public final adi b() {
        return (adi) this.e.a();
    }

    public final void c() {
        if (this.d) {
            wv.d("Pin should not be called on an already disposed item ");
        }
        if (this.c == 0) {
            this.g.a.add(this);
            adi adiVarB = b();
            if (adiVarB != null) {
                adiVarB.c();
            } else {
                adiVarB = null;
            }
            this.f = adiVarB;
        }
        this.c++;
    }
}
