package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eri {
    public static eql a(eql eqlVar, epp eppVar, eqp eqpVar, Boolean bool, Boolean bool2) {
        eql eqlVar2 = new eql();
        Iterator itK = eqlVar.k();
        while (itK.hasNext()) {
            int iIntValue = ((Integer) itK.next()).intValue();
            if (eqlVar.r(iIntValue)) {
                eqw eqwVarA = eqpVar.a(eppVar, Arrays.asList(eqlVar.e(iIntValue), new eqo(Double.valueOf(iIntValue)), eqlVar));
                if (eqwVarA.g().equals(bool)) {
                    break;
                }
                if (bool2 == null || eqwVarA.g().equals(bool2)) {
                    eqlVar2.p(iIntValue, eqwVarA);
                }
            }
        }
        return eqlVar2;
    }

    public static eqw b(eql eqlVar, epp eppVar, List list, boolean z) {
        eqw eqwVarA;
        epq.h("reduce", 1, list);
        epq.i("reduce", 2, list);
        eqw eqwVar = (eqw) list.get(0);
        ere ereVar = eppVar.b;
        eqw eqwVarA2 = ereVar.a(eppVar, eqwVar);
        if (!(eqwVarA2 instanceof eqp)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            eqwVarA = ereVar.a(eppVar, (eqw) list.get(1));
            if (eqwVarA instanceof eqn) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (eqlVar.c() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            eqwVarA = null;
        }
        eqp eqpVar = (eqp) eqwVarA2;
        int iC = eqlVar.c();
        int i = z ? 0 : iC - 1;
        int i2 = z ? iC - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (eqwVarA == null) {
            eqwVarA = eqlVar.e(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (eqlVar.r(i)) {
                eqwVarA = eqpVar.a(eppVar, Arrays.asList(eqwVarA, eqlVar.e(i), new eqo(Double.valueOf(i)), eqlVar));
                if (eqwVarA instanceof eqn) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return eqwVarA;
    }
}
