package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmf extends zix {
    zif a;
    public ziu b;

    public zmf() {
        this.b = null;
        this.a = null;
    }

    public static zmf a(Object obj) {
        if (obj != null) {
            return new zmf(zjm.j(obj));
        }
        return null;
    }

    public final boolean b() {
        zif zifVar = this.a;
        return zifVar != null && zifVar.h();
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(2);
        zif zifVar = this.a;
        if (zifVar != null) {
            ziiVar.b(zifVar);
        }
        ziu ziuVar = this.b;
        if (ziuVar != null) {
            ziiVar.b(ziuVar);
        }
        return new zkq(ziiVar);
    }

    public final String toString() {
        ziu ziuVar = this.b;
        if (ziuVar == null) {
            return "BasicConstraints: isCa(" + b() + ")";
        }
        return "BasicConstraints: isCa(" + b() + "), pathLenConstraint = " + ziuVar.j().toString();
    }

    private zmf(zjm zjmVar) {
        this.a = zif.g(false);
        this.b = null;
        if (zjmVar.b() == 0) {
            this.a = null;
            this.b = null;
            return;
        }
        if (zjmVar.h(0) instanceof zif) {
            this.a = zif.f(zjmVar.h(0));
        } else {
            this.a = null;
            this.b = ziu.m(zjmVar.h(0));
        }
        if (zjmVar.b() > 1) {
            if (this.a == null) {
                throw new IllegalArgumentException("wrong sequence in constructor");
            }
            this.b = ziu.m(zjmVar.h(1));
        }
    }
}
