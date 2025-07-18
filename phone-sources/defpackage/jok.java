package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jok extends ixi {
    public final iye d;
    public final Map e;
    private final isy f;

    /* JADX WARN: Illegal instructions before constructor call */
    public jok(isy isyVar, wkx wkxVar) {
        vvd vvdVar = wso.i;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.f = isyVar;
        wkxVar.i(vvdVar);
        Object objK = wkxVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        wly wlyVar = ((wso) objK).e;
        this.d = jbr.ad(isyVar.a(wlyVar == null ? wly.a : wlyVar));
        this.e = new LinkedHashMap();
    }

    @Override // defpackage.ixi, defpackage.sbt
    protected final void e() {
        y(ixv.class, new ale(this, (yih) null, 12));
    }

    public final void i(rrx rrxVar, Object obj) {
        this.e.put(rrxVar, obj);
    }
}
