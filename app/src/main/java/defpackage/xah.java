package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xah {
    public static final /* synthetic */ xaq a(xap xapVar) {
        abxd abxdVarV = xapVar.v();
        abxdVarV.getClass();
        return (xaq) abxdVarV;
    }

    public static final void b(String str, xap xapVar) {
        if ((xapVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xapVar.y();
        }
        xaq xaqVar = (xaq) xapVar.b;
        xaq xaqVar2 = xaq.a;
        xaqVar.b |= 32;
        xaqVar.f = str;
    }

    public static final void c(String str, xap xapVar) {
        str.getClass();
        if ((xapVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            xapVar.y();
        }
        xaq xaqVar = (xaq) xapVar.b;
        xaq xaqVar2 = xaq.a;
        xaqVar.b |= 1;
        xaqVar.c = str;
    }
}
