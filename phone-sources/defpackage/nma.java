package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class nma implements nkl {
    public final Object a;
    public final nsk b;
    public final nlv c;
    public pku d;
    public pku e;

    static {
        String str = nsk.d;
    }

    public nma() {
        nsk nskVar = new nsk();
        this.a = new Object();
        this.b = nskVar;
        nskVar.g = new nqf(this, 1);
        nlv nlvVar = new nlv(this);
        this.c = nlvVar;
        nskVar.c(nlvVar);
    }

    public final nln a() {
        nln nlnVar;
        synchronized (this.a) {
            nlnVar = this.b.e;
        }
        return nlnVar;
    }

    public final String b() {
        return this.b.b;
    }

    @Override // defpackage.nkl
    public final void f(String str) {
        this.b.k(str);
    }
}
