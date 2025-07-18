package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pdz {
    static zpn a(pdf pdfVar, boolean z) {
        List listB = pdfVar.b();
        for (int i = !z ? 1 : 0; i < listB.size(); i++) {
            pcc pccVar = (pcc) listB.get(i);
            zpk zpkVar = pccVar.d;
            if (zpkVar == null) {
                zpkVar = zpk.a;
            }
            if ((zpkVar.b & 2048) != 0) {
                zpk zpkVar2 = pccVar.d;
                if (zpkVar2 == null) {
                    zpkVar2 = zpk.a;
                }
                zpn zpnVar = zpkVar2.f;
                return zpnVar == null ? zpn.a : zpnVar;
            }
        }
        return null;
    }
}
