package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mna {
    public static void a(drn drnVar, Map map) {
        dtl dtlVar = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_ALPHA);
        if (dtlVar != null) {
            drnVar.M(dtlVar);
        }
        dtl dtlVar2 = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_SCALE_X);
        if (dtlVar2 != null) {
            drnVar.V(dtlVar2);
        }
        dtl dtlVar3 = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_SCALE_Y);
        if (dtlVar3 != null) {
            drnVar.W(dtlVar3);
        }
        dtl dtlVar4 = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_ROTATION);
        if (dtlVar4 != null) {
            drnVar.c.j().put(8, dtlVar4);
        }
        dtl dtlVar5 = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_TRANSLATION_X);
        if (dtlVar5 != null) {
            drnVar.c.j().put(2, dtlVar5);
        }
        dtl dtlVar6 = (dtl) map.get(acvm.DYNAMIC_PROP_TYPE_TRANSLATION_Y);
        if (dtlVar6 != null) {
            drnVar.c.j().put(3, dtlVar6);
        }
    }
}
