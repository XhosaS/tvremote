package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtl {
    public Object a;
    public final Set b = new CopyOnWriteArraySet();

    public dtl(Object obj) {
        this.a = obj;
    }

    public final void a(Object obj) {
        Object obj2 = this.a;
        if (obj2 != obj) {
            if (obj2 == null || !obj2.equals(obj)) {
                this.a = obj;
                for (dtk dtkVar : this.b) {
                    Set set = (Set) dtkVar.a.get(this);
                    if (set != null) {
                        for (drq drqVar : (drq[]) set.toArray(new drq[set.size()])) {
                            Object obj3 = dtkVar.c.get(drqVar);
                            if (obj3 != null) {
                                if (dtk.c(drqVar, obj3)) {
                                    SparseArray sparseArrayI = drqVar.i();
                                    for (int i = 0; i < sparseArrayI.size(); i++) {
                                        if (sparseArrayI.valueAt(i) == this) {
                                            dtkVar.b(sparseArrayI.keyAt(i), this, (View) obj3);
                                        }
                                    }
                                }
                                int length = drq.h.length;
                            }
                        }
                    }
                }
            }
        }
    }
}
