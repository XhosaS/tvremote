package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogk implements oap {
    public static final ogk a = new ogk();

    private ogk() {
    }

    @Override // defpackage.oap
    public final ndo a(ndo ndoVar) throws abxv {
        int iA;
        try {
            byte[] bArrE = ndoVar.e();
            abxd abxdVarH = abxd.h(acry.a, bArrE, 0, bArrE.length, ExtensionRegistryLite.getGeneratedRegistry());
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
            acrx acrxVar = new acrx();
            acrxVar.B((acry) abxdVarH);
            if ((acrxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acrxVar.y();
            }
            acry acryVar = (acry) acrxVar.b;
            acryVar.b = 1 | acryVar.b;
            acryVar.c = "…";
            acry acryVar2 = (acry) acrxVar.v();
            try {
                int i = acryVar2.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(acryVar2.getClass()).a(acryVar2);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(acryVar2.getClass()).a(acryVar2);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        acryVar2.memoizedSerializedSize = (acryVar2.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(acryVar2.getClass()).m(acryVar2, abwa.a(abvwVar));
                abvwVar.K();
                return noj.G(bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.C(acryVar2, "byte array"), e);
            }
        } catch (abxv e2) {
            throw new ocp("Failed to parse AttributedString", e2);
        }
    }

    @Override // defpackage.oap
    public final nid b(byte[] bArr) {
        nsu nsuVar = new nsu();
        nsuVar.au(bArr);
        return nsuVar;
    }
}
