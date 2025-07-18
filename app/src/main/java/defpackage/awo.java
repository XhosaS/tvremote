package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awo extends azn {
    private final ArrayList a = new ArrayList();
    private final HashMap b = new HashMap();

    @Override // defpackage.azn
    public final azm a(Object obj) {
        Object obj2;
        azm azmVarA;
        if (obj == null) {
            return null;
        }
        Class<?> superclass = obj.getClass();
        do {
            obj2 = this.b.get(superclass);
            if ((obj2 instanceof azn) && (azmVarA = ((azn) obj2).a(obj)) != null) {
                return azmVarA;
            }
            superclass = superclass.getSuperclass();
            if (obj2 != null) {
                break;
            }
        } while (superclass != null);
        return (azm) obj2;
    }

    public final void b(Class cls, azm azmVar) {
        this.b.put(cls, azmVar);
        ArrayList arrayList = this.a;
        if (arrayList.contains(azmVar)) {
            return;
        }
        arrayList.add(azmVar);
    }
}
