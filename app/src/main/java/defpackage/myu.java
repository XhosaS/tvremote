package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class myu extends dxx {

    @eat(a = 5)
    Set a;

    @Override // defpackage.dxx
    public final void b(dxw dxwVar) {
        Object[] objArr = dxwVar.b;
        if (dxwVar.a != 0) {
            return;
        }
        dxz dxzVar = new dxz();
        dxzVar.a = this.a;
        Integer num = (Integer) objArr[0];
        num.intValue();
        int i = mzh.b;
        Set set = (Set) dxzVar.a;
        if (set != null) {
            HashSet hashSet = new HashSet(set);
            hashSet.add(num);
            dxzVar.a = hashSet;
        }
        this.a = (Set) dxzVar.a;
    }
}
