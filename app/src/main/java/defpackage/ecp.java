package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ecp {
    protected ecp(ecr ecrVar) {
        dxl dxlVar = ecrVar.e;
    }

    protected static void b(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException("The following props are not marked as optional and were not supplied: ".concat(String.valueOf(Arrays.toString(arrayList.toArray()))));
        }
    }

    public abstract ecq a();
}
