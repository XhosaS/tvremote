package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gql {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static final MessageLite a(xgy xgyVar, String str, abyy abyyVar) throws gqj {
        Object next;
        abxs abxsVar = xgyVar.b;
        abxsVar.getClass();
        Iterator<E> it = abxsVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (agvy.c(str, ((xjr) next).c)) {
                break;
            }
        }
        xjr xjrVar = (xjr) next;
        if (xjrVar != null) {
            xjp xjpVar = xjrVar.d;
            if (xjpVar == null) {
                xjpVar = xjp.a;
            }
            abvo abvoVar = xjpVar.d;
            ExtensionRegistryLite extensionRegistryLite = abuv.a;
            abvt abvtVarK = abvoVar.k();
            ?? H = ((abuv) abyyVar).h(abvtVarK, extensionRegistryLite);
            abvtVarK.z(0);
            ((abuv) abyyVar).f(H);
            if (H != 0) {
                return H;
            }
        }
        throw new gqj(str);
    }
}
