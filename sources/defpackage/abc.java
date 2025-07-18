package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abc implements ctu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ abc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ctu
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aaz aazVar = ((abf) this.a).a;
            aau aauVar = (aau) obj;
            List listAM = dnx.aM(aazVar.a);
            if (listAM.isEmpty()) {
                listAM = aazVar.a();
            }
            Iterator it = listAM.iterator();
            if (it.hasNext()) {
                ((aav) it.next()).c(aauVar);
            }
            return cse.a;
        }
        if (i != 1) {
            return obj == this.a ? "(this Collection)" : String.valueOf(obj);
        }
        aaz aazVar2 = ((abf) this.a).a;
        List list = aazVar2.a;
        if (!list.isEmpty()) {
            aazVar2.b();
        }
        Iterator it2 = aazVar2.a().iterator();
        if (it2.hasNext()) {
            aav aavVar = (aav) it2.next();
            list.add(aavVar);
            aavVar.d();
        }
        return cse.a;
    }
}
