package defpackage;

import com.google.protobuf.MessageLite;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdi implements ulk {
    private static String a(String str, String str2) {
        return str + "|" + str2;
    }

    @Override // defpackage.ulk
    public final /* bridge */ /* synthetic */ MessageLite b(ull ullVar, MessageLite messageLite) throws NumberFormatException {
        pjd pjdVar = (pjd) messageLite;
        if (pjdVar.e) {
            return pjdVar;
        }
        HashSet hashSet = new HashSet();
        pjb pjbVar = new pjb();
        pjbVar.B(pjdVar);
        int i = Integer.MIN_VALUE;
        if ((pjbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjbVar.y();
        }
        pjd pjdVar2 = (pjd) pjbVar.b;
        pjdVar2.b |= 2;
        int i2 = 1;
        pjdVar2.e = true;
        zdl it = ullVar.a().entrySet().iterator();
        while (it.hasNext()) {
            List listG = yrl.c("|").g((CharSequence) ((Map.Entry) it.next()).getKey());
            if (listG.size() >= 4) {
                String str = (String) listG.get(0);
                String str2 = (String) listG.get(i2);
                int i3 = Integer.parseInt((String) listG.get(2));
                String str3 = str + "|" + str2 + "|" + i3;
                if (!hashSet.contains(str3)) {
                    hashSet.add(str3);
                    String strA = a(str3, "w");
                    String strA2 = a(str3, "c");
                    long jF = ullVar.f(strA);
                    long jF2 = ullVar.f(strA2);
                    piq piqVar = piq.a;
                    pip pipVar = new pip();
                    piy piyVar = piy.a;
                    pix pixVar = new pix();
                    int i4 = i;
                    if ((pixVar.b.memoizedSerializedSize & i4) == 0) {
                        pixVar.y();
                    }
                    piy piyVar2 = (piy) pixVar.b;
                    str2.getClass();
                    int i5 = i2;
                    piyVar2.c |= 1;
                    piyVar2.d = str2;
                    if ((pixVar.b.memoizedSerializedSize & i4) == 0) {
                        pixVar.y();
                    }
                    piy piyVar3 = (piy) pixVar.b;
                    str.getClass();
                    piyVar3.c |= 2;
                    piyVar3.e = str;
                    if ((pipVar.b.memoizedSerializedSize & i4) == 0) {
                        pipVar.y();
                    }
                    piq piqVar2 = (piq) pipVar.b;
                    piy piyVar4 = (piy) pixVar.v();
                    piyVar4.getClass();
                    piqVar2.c = piyVar4;
                    piqVar2.b |= 1;
                    if ((pipVar.b.memoizedSerializedSize & i4) == 0) {
                        pipVar.y();
                    }
                    piq piqVar3 = (piq) pipVar.b;
                    piqVar3.b |= 8;
                    piqVar3.f = i3;
                    if ((pipVar.b.memoizedSerializedSize & i4) == 0) {
                        pipVar.y();
                    }
                    piq piqVar4 = (piq) pipVar.b;
                    piqVar4.b |= 16;
                    piqVar4.g = jF2;
                    if ((pipVar.b.memoizedSerializedSize & i4) == 0) {
                        pipVar.y();
                    }
                    piq piqVar5 = (piq) pipVar.b;
                    piqVar5.b |= 32;
                    piqVar5.h = jF;
                    if ((pjbVar.b.memoizedSerializedSize & i4) == 0) {
                        pjbVar.y();
                    }
                    pjd pjdVar3 = (pjd) pjbVar.b;
                    piq piqVar6 = (piq) pipVar.v();
                    piqVar6.getClass();
                    abxs abxsVar = pjdVar3.d;
                    if (!abxsVar.c()) {
                        int size = abxsVar.size();
                        pjdVar3.d = abxsVar.d(size + size);
                    }
                    pjdVar3.d.add(piqVar6);
                    i = i4;
                    i2 = i5;
                }
            }
        }
        return (pjd) pjbVar.v();
    }
}
