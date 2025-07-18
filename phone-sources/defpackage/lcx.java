package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcx implements idf {
    public static final idf a;
    private static final idf b;

    static {
        lcx lcxVar = new lcx();
        b = lcxVar;
        a = idh.d().c(lcxVar);
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        lcw lcwVar = (lcw) obj;
        vsz vszVar = lcwVar.c;
        lar larVar = lcwVar.d;
        if (larVar == null) {
            larVar = lar.a;
        }
        String str = larVar.b;
        kuf kufVar = kuf.a;
        ktn ktnVar = new ktn(str);
        kzk kzkVar = lcwVar.e;
        if (kzkVar == null) {
            kzkVar = kzk.a;
        }
        String str2 = kzkVar.b;
        ksr ksrVar = ksr.a;
        ktg ktgVar = new ktg(str2);
        lcr lcrVar = lcwVar.f;
        if (lcrVar == null) {
            lcrVar = lcr.a;
        }
        Uri uriA = lbk.a(lcrVar);
        int iAQ = a.aQ(lcwVar.g);
        int i = 1;
        if (iAQ == 0) {
            iAQ = 1;
        }
        int i2 = iAQ - 2;
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 0;
                }
            }
        }
        return kxg.b(vszVar, ktnVar, ktgVar, uriA, i, lcwVar.h);
    }
}
