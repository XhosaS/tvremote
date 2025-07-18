package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rou {
    public rov a;
    public roo b;
    public final rot c = new rot();

    public rou(cb cbVar, rpb rpbVar, yfo yfoVar, yfo yfoVar2) {
        int i = 14;
        ttm ttmVarL = sij.l(new riu(yfoVar, i));
        ttm ttmVarL2 = sij.l(new riu(yfoVar2, i));
        if (!((Boolean) ttmVarL2.get()).booleanValue()) {
            d(cbVar, ttmVarL, ttmVarL2);
            c(rpbVar, ttmVarL, ttmVarL2);
        } else if (((Boolean) ttmVarL.get()).booleanValue()) {
            c(rpbVar, ttmVarL, ttmVarL2);
        } else {
            d(cbVar, ttmVarL, ttmVarL2);
        }
    }

    private final void c(rpb rpbVar, ttm ttmVar, ttm ttmVar2) {
        this.b = new roo(new ros(this, ttmVar2, ttmVar, rpbVar, 0));
        rpbVar.g.add(this.b);
    }

    private final void d(cb cbVar, ttm ttmVar, ttm ttmVar2) {
        rov rovVar = new rov(new ros(this, ttmVar2, ttmVar, cbVar, 1));
        this.a = rovVar;
        cbVar.x(rovVar);
    }

    public final void a(roq roqVar) {
        this.c.b.add(roqVar);
    }

    public final void b(roq roqVar) {
        this.c.b.remove(roqVar);
    }
}
