package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class epv extends eqp {
    final /* synthetic */ lba a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epv(lba lbaVar) {
        super("getValue");
        this.a = lbaVar;
    }

    @Override // defpackage.eqp
    public final eqw a(epp eppVar, List list) {
        epq.g("getValue", 2, list);
        eqw eqwVar = (eqw) list.get(0);
        ere ereVar = eppVar.b;
        eqw eqwVarA = ereVar.a(eppVar, eqwVar);
        eqw eqwVarA2 = ereVar.a(eppVar, (eqw) list.get(1));
        String strI = eqwVarA.i();
        lba lbaVar = this.a;
        Map map = (Map) lbaVar.b.a.get(lbaVar.a);
        String str = null;
        if (map != null && map.containsKey(strI)) {
            str = (String) map.get(strI);
        }
        return str != null ? new era(str) : eqwVarA2;
    }
}
