package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fft extends ffr {
    @Override // defpackage.ffr
    protected final ead b(ffq ffqVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            edh edhVar = new edh(byteBuffer.array(), byteBuffer.limit());
            edhVar.n(12);
            int iB = edhVar.b() + edhVar.d(12);
            edhVar.n(44);
            edhVar.o(edhVar.d(12));
            edhVar.n(16);
            ArrayList arrayList = new ArrayList();
            while (edhVar.b() < iB - 4) {
                edhVar.n(48);
                int iD = edhVar.d(8);
                edhVar.n(4);
                int iB2 = edhVar.b() + edhVar.d(12);
                String strF = null;
                String strF2 = null;
                while (edhVar.b() < iB2) {
                    int iD2 = edhVar.d(8);
                    int iD3 = edhVar.d(8);
                    int iB3 = edhVar.b() + iD3;
                    if (iD2 == 2) {
                        int iD4 = edhVar.d(16);
                        edhVar.n(8);
                        if (iD4 == 3) {
                            while (edhVar.b() < iB3) {
                                strF = edhVar.f(edhVar.d(8), StandardCharsets.US_ASCII);
                                int iD5 = edhVar.d(8);
                                for (int i = 0; i < iD5; i++) {
                                    edhVar.o(edhVar.d(8));
                                }
                            }
                        }
                    } else if (iD2 == 21) {
                        strF2 = edhVar.f(iD3, StandardCharsets.US_ASCII);
                    }
                    edhVar.l(iB3 * 8);
                }
                edhVar.l(iB2 * 8);
                if (strF != null && strF2 != null) {
                    arrayList.add(new ffs(iD, strF.concat(strF2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new ead(arrayList);
            }
        }
        return null;
    }
}
