package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grp {
    public final xhe a(String str) {
        int iA;
        xhe xheVar = xhe.a;
        xhb xhbVar = new xhb();
        xjv xjvVar = xjv.a;
        xjs xjsVar = new xjs();
        xnw.b(xju.OK, xjsVar);
        xjv xjvVarA = xnw.a(xjsVar);
        if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xhbVar.y();
        }
        xhe xheVar2 = (xhe) xhbVar.b;
        xheVar2.c = xjvVarA;
        xheVar2.b |= 1;
        xhd xhdVar = xhd.a;
        xhc xhcVar = new xhc();
        DesugarCollections.unmodifiableList(((xhd) xhcVar.b).b).getClass();
        xjr xjrVar = xjr.a;
        xjq xjqVar = new xjq();
        if ((xjqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjqVar.y();
        }
        xjr xjrVar2 = (xjr) xjqVar.b;
        xjrVar2.b |= 1;
        xjrVar2.c = "open_provider_result";
        xjp xjpVar = xjp.a;
        xnu xnuVar = new xnu(new xjo());
        xjo xjoVar = xnuVar.a;
        if ((xjoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xjoVar.y();
        }
        xjp xjpVar2 = (xjp) xjoVar.b;
        xjpVar2.b |= 1;
        xjpVar2.c = "assistant.api.client_op.OpenProviderResult";
        xnt xntVar = xnt.a;
        xns xnsVar = new xns();
        str.getClass();
        if ((xnsVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xnsVar.y();
        }
        xnt xntVar2 = (xnt) xnsVar.b;
        xntVar2.b |= 1;
        xntVar2.c = str;
        abxd abxdVarV = xnsVar.v();
        abxdVarV.getClass();
        xnt xntVar3 = (xnt) abxdVarV;
        try {
            int i = xntVar3.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xntVar3.getClass()).a(xntVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xntVar3.getClass()).a(xntVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xntVar3.memoizedSerializedSize = (xntVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            abvo abvoVar = abvo.b;
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(xntVar3.getClass()).m(xntVar3, abwa.a(abvwVar));
            xnuVar.b(abvk.a(abvwVar, bArr));
            xjp xjpVarA = xnuVar.a();
            if ((xjqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xjqVar.y();
            }
            xjr xjrVar3 = (xjr) xjqVar.b;
            xjrVar3.d = xjpVarA;
            xjrVar3.b |= 2;
            xhcVar.a(xnv.a(xjqVar));
            xhd xhdVarA = xko.a(xhcVar);
            if ((xhbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                xhbVar.y();
            }
            xhe xheVar3 = (xhe) xhbVar.b;
            xheVar3.d = xhdVarA;
            xheVar3.b |= 2;
            return xkn.a(xhbVar);
        } catch (IOException e) {
            throw new RuntimeException(a.x(xntVar3, "Serializing ", " to a ByteString threw an IOException (should never happen)."), e);
        }
    }
}
