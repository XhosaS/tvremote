package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dzd extends dyt {
    public final ArrayList a = new ArrayList();

    public dzd(List list) {
        for (int i = 0; i < list.size(); i++) {
            dyt dytVar = (dyt) list.get(i);
            if (dytVar instanceof dyj) {
                dyj dyjVar = (dyj) dytVar;
                dyjVar.a();
                ArrayList arrayList = dyjVar.a;
                if (arrayList.size() > 1) {
                    this.a.add(new dxb(arrayList));
                } else {
                    this.a.add((dyt) arrayList.get(0));
                }
            } else {
                if (dytVar == null) {
                    throw new IllegalStateException("Null element is not allowed in transition set");
                }
                this.a.add(dytVar);
            }
        }
    }

    public abstract eah a(List list);
}
