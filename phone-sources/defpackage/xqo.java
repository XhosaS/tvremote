package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqo {
    static final Logger a = Logger.getLogger(xqo.class.getName());
    public static final xqo b = new xqo();

    private xqo() {
    }

    public static xqo b() {
        xqo xqoVarA = xqm.a.a();
        return xqoVarA == null ? b : xqoVarA;
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public final xqo a() {
        xqo xqoVarB = xqm.a.b(this);
        return xqoVarB == null ? b : xqoVarB;
    }

    public final void c(xqo xqoVar) {
        d(xqoVar, "toAttach");
        xqm.a.c(this, xqoVar);
    }
}
