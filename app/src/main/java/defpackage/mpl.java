package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpl {
    static nmt a(nir nirVar, boolean z) throws abxv {
        int iA;
        byte bByteValue;
        byte bByteValue2;
        byte bByteValue3;
        if (nirVar instanceof nbg) {
            Boolean boolValueOf = Boolean.valueOf(z);
            aart aartVar = new aart(0);
            int iB = nirVar.z() ? ogr.b(aartVar, nirVar.l()) : 0;
            int iB2 = nirVar.q() ? ogr.b(aartVar, nirVar.h()) : 0;
            int iB3 = nirVar.y() ? ogr.b(aartVar, nirVar.k()) : 0;
            boolValueOf.getClass();
            aartVar.u(aegz.h(aartVar, iB3, !z ? nirVar.g() : 0L, iB, iB2));
            aartVar.k();
            return new ncm(aegz.g(aartVar.a));
        }
        if (!(nirVar instanceof ntf)) {
            throw new ocp("Unknown data layer type");
        }
        try {
            acyy acyyVar = acyy.a;
            acyx acyxVar = new acyx();
            abxd abxdVar = null;
            if (nirVar.z() && nirVar.l().w()) {
                byte[] bArrE = nirVar.l().e();
                abxd abxdVarH = abxd.h(acry.a, bArrE, 0, bArrE.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH != null && (bByteValue3 = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue3 != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        abxdVarH.cM(2, true != zL ? null : abxdVarH);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
                acry acryVar = (acry) abxdVarH;
                if ((acyxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyxVar.y();
                }
                acyy acyyVar2 = (acyy) acyxVar.b;
                acryVar.getClass();
                acyyVar2.e = acryVar;
                acyyVar2.b |= 4;
            }
            if (nirVar.q() && nirVar.h().w()) {
                byte[] bArrE2 = nirVar.h().e();
                abxd abxdVarH2 = abxd.h(acry.a, bArrE2, 0, bArrE2.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH2 != null && (bByteValue2 = ((Byte) abxdVarH2.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue2 != 0) {
                        boolean zL2 = abza.a.a(abxdVarH2.getClass()).l(abxdVarH2);
                        abxdVarH2.cM(2, true != zL2 ? null : abxdVarH2);
                        if (zL2) {
                        }
                    }
                    throw new abzz().a();
                }
                acry acryVar2 = (acry) abxdVarH2;
                if ((acyxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyxVar.y();
                }
                acyy acyyVar3 = (acyy) acyxVar.b;
                acryVar2.getClass();
                acyyVar3.f = acryVar2;
                acyyVar3.b |= 8;
            }
            if (nirVar.y() && nirVar.k().w()) {
                byte[] bArrE3 = nirVar.k().e();
                abxd abxdVarH3 = abxd.h(acry.a, bArrE3, 0, bArrE3.length, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH3 != null && (bByteValue = ((Byte) abxdVarH3.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue != 0) {
                        boolean zL3 = abza.a.a(abxdVarH3.getClass()).l(abxdVarH3);
                        if (true == zL3) {
                            abxdVar = abxdVarH3;
                        }
                        abxdVarH3.cM(2, abxdVar);
                        if (zL3) {
                        }
                    }
                    throw new abzz().a();
                }
                acry acryVar3 = (acry) abxdVarH3;
                if ((acyxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyxVar.y();
                }
                acyy acyyVar4 = (acyy) acyxVar.b;
                acryVar3.getClass();
                acyyVar4.c = acryVar3;
                acyyVar4.b |= 1;
            }
            if (!z) {
                int iG = nirVar.g();
                if ((acyxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acyxVar.y();
                }
                acyy acyyVar5 = (acyy) acyxVar.b;
                acyyVar5.b |= 2;
                acyyVar5.d = iG;
            }
            acyy acyyVar6 = (acyy) acyxVar.v();
            try {
                int i = acyyVar6.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(acyyVar6.getClass()).a(acyyVar6);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(acyyVar6.getClass()).a(acyyVar6);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        acyyVar6.memoizedSerializedSize = (acyyVar6.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z2 = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(acyyVar6.getClass()).m(acyyVar6, abwa.a(abvwVar));
                abvwVar.K();
                return nwt.r(bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.C(acyyVar6, "byte array"), e);
            }
        } catch (abxv e2) {
            throw new ocp("Failed to create ExpandableTextComponent", e2);
        }
    }
}
