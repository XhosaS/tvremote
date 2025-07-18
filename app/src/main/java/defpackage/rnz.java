package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnz {
    private Map a;

    public rnz(Map map) {
        this.a = map;
    }

    public final void a() {
        uea.c();
        this.a.getClass();
        for (rnx rnxVar : rnx.values()) {
            rny rnyVar = (rny) this.a.get(rnxVar);
            if (rnyVar != null) {
                rnyVar.a();
            }
        }
        this.a = null;
    }
}
