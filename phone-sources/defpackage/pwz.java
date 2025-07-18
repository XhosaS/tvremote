package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwz implements pwy {
    public static final /* synthetic */ int a = 0;
    private static final tvn b = tvn.n("GnpSdk");
    private final tst c;
    private final tst d;
    private final Map e;

    public pwz(tst tstVar, tst tstVar2, Map map) {
        tstVar2.getClass();
        this.c = tstVar;
        this.d = tstVar2;
        this.e = map;
    }

    @Override // defpackage.pwy
    public final /* synthetic */ tst a(ptn ptnVar) {
        yfm.p(ptnVar);
        return b();
    }

    @Override // defpackage.pwy
    public final tst b() {
        qrl qrlVar;
        try {
            qrlVar = (qrl) this.c.f();
        } catch (Exception e) {
            ((tvk) ((tvk) b.f()).i(e)).s("Error resolving callback key, using default callback");
        }
        String strA = qrlVar != null ? qrlVar.a() : null;
        if (strA == null) {
            return this.d;
        }
        yfo yfoVar = (yfo) this.e.get(strA);
        tst tstVarB = yfoVar != null ? tst.h(yfoVar).b(new pgc(new oun(10), 6)) : null;
        if (tstVarB != null) {
            return tstVarB;
        }
        b.k().v("Callback not found for key: %s, using Optional.absent()", strA);
        return trk.a;
    }
}
