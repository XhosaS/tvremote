package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ydm {
    static {
        Logger.getLogger(ydm.class.getName());
    }

    private ydm() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            yec yecVar = (yec) it.next();
            bArr[i] = yecVar.f.o();
            bArr[i + 1] = yecVar.g.o();
            i += 2;
        }
        return ybw.b(bArr);
    }
}
