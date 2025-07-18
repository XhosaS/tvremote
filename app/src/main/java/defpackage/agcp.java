package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agcp {
    static {
        Logger.getLogger(agcp.class.getName());
    }

    private agcp() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            agdj agdjVar = (agdj) it.next();
            bArr[i] = agdjVar.f.i();
            bArr[i + 1] = agdjVar.g.i();
            i += 2;
        }
        return agab.b(bArr);
    }
}
