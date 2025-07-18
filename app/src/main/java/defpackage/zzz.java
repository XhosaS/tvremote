package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzz {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static aadi a(aade aadeVar) {
        aadi aadiVar = aadi.a;
        aadf aadfVar = new aadf();
        int i = aadeVar.b;
        if ((aadfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aadfVar.y();
        }
        ((aadi) aadfVar.b).b = i;
        for (aadd aaddVar : aadeVar.c) {
            aadh aadhVar = aadh.a;
            aadg aadgVar = new aadg();
            aacz aaczVar = aaddVar.c;
            if (aaczVar == null) {
                aaczVar = aacz.a;
            }
            String str = aaczVar.b;
            if ((aadgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aadgVar.y();
            }
            aadh aadhVar2 = (aadh) aadgVar.b;
            str.getClass();
            aadhVar2.b = str;
            int iB = aada.b(aaddVar.d);
            if (iB == 0) {
                iB = 1;
            }
            if ((aadgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aadgVar.y();
            }
            ((aadh) aadgVar.b).c = aada.a(iB);
            aadj aadjVarB = aadj.b(aaddVar.f);
            if (aadjVarB == null) {
                aadjVarB = aadj.UNRECOGNIZED;
            }
            if ((aadgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aadgVar.y();
            }
            ((aadh) aadgVar.b).e = aadjVarB.a();
            int i2 = aaddVar.e;
            if ((aadgVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aadgVar.y();
            }
            ((aadh) aadgVar.b).d = i2;
            aadh aadhVar3 = (aadh) aadgVar.v();
            if ((aadfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aadfVar.y();
            }
            aadi aadiVar2 = (aadi) aadfVar.b;
            aadhVar3.getClass();
            abxs abxsVar = aadiVar2.c;
            if (!abxsVar.c()) {
                int size = abxsVar.size();
                aadiVar2.c = abxsVar.d(size + size);
            }
            aadiVar2.c.add(aadhVar3);
        }
        return (aadi) aadfVar.v();
    }
}
