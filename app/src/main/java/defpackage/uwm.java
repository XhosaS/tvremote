package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwm {
    private static final byte[] a;
    private final oat b;

    static {
        int iA;
        abvd abvdVar = abvd.a;
        abvc abvcVar = new abvc();
        if ((abvcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abvcVar.y();
        }
        ((abvd) abvcVar.b).b = true;
        abvd abvdVar2 = (abvd) abvcVar.v();
        try {
            int i = abvdVar2.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(abvdVar2.getClass()).a(abvdVar2);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(abvdVar2.getClass()).a(abvdVar2);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    abvdVar2.memoizedSerializedSize = (Integer.MIN_VALUE & abvdVar2.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(abvdVar2.getClass()).m(abvdVar2, abwa.a(abvwVar));
            abvwVar.K();
            a = bArr;
        } catch (IOException e) {
            throw new RuntimeException(a.u(abvdVar2, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public uwm(oat oatVar) {
        this.b = oatVar;
    }

    public final String a(String str) throws abxv {
        agfo agfoVarA = this.b.a(str);
        Object obj = ypv.a;
        aghx aghxVar = new aghx();
        agfoVarA.m(aghxVar);
        if (aghxVar.getCount() != 0) {
            try {
                boolean z = agoh.p;
                aghxVar.await();
            } catch (InterruptedException e) {
                aghxVar.dispose();
                throw agnx.a(e);
            }
        }
        Throwable th = aghxVar.b;
        if (th != null) {
            throw agnx.a(th);
        }
        Object obj2 = aghxVar.a;
        if (obj2 != null) {
            obj = obj2;
        }
        ypv ypvVar = (yqt) obj;
        if (!ypvVar.g()) {
            return "";
        }
        try {
            byte[] bArr = (byte[]) ypvVar.c();
            abxd abxdVarH = abxd.h(abzr.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            return ((abzr) abxdVarH).b;
        } catch (Exception e2) {
            throw new IllegalArgumentException("Cannot parse selection key.", e2);
        }
    }

    public final void b(String str, String str2, boolean z) throws abxv {
        int iA;
        String strA = a(str);
        if (!z && !strA.equals(str2)) {
            throw new IllegalArgumentException(String.format("An item should not be deselected if it is not currently selected. Expected selected key: %s, actual selected key: %s", str2, strA));
        }
        if (true != z) {
            str2 = "";
        }
        if (str2.equals(strA)) {
            return;
        }
        oat oatVar = this.b;
        abzr abzrVar = abzr.a;
        abzq abzqVar = new abzq();
        if ((abzqVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            abzqVar.y();
        }
        abzr abzrVar2 = (abzr) abzqVar.b;
        str2.getClass();
        abzrVar2.b = str2;
        abzr abzrVar3 = (abzr) abzqVar.v();
        try {
            int i = abzrVar3.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(abzrVar3.getClass()).a(abzrVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(abzrVar3.getClass()).a(abzrVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    abzrVar3.memoizedSerializedSize = (Integer.MIN_VALUE & abzrVar3.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z2 = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(abzrVar3.getClass()).m(abzrVar3, abwa.a(abvwVar));
            abvwVar.K();
            oatVar.b(str, bArr);
            if (!strA.equals("")) {
                this.b.b(strA, null);
            }
            if (str2.equals("")) {
                return;
            }
            this.b.b(str2, a);
        } catch (IOException e) {
            throw new RuntimeException(a.u(abzrVar3, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
