package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dcs implements dcr {
    public static Hashtable f(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    private static final int h(czb czbVar) {
        return dnx.aa(czbVar).hashCode();
    }

    @Override // defpackage.dcr
    public final int a(dcp dcpVar) {
        dco[] dcoVarArrC = dcpVar.c();
        int iHashCode = 0;
        for (int i = 0; i != dcoVarArrC.length; i++) {
            if (dcoVarArrC[i].c()) {
                dcn[] dcnVarArrD = dcoVarArrC[i].d();
                for (int i2 = 0; i2 != dcnVarArrD.length; i2++) {
                    iHashCode = (iHashCode ^ dcnVarArrD[i2].a.hashCode()) ^ h(dcnVarArrD[i2].b);
                }
            } else {
                iHashCode = (iHashCode ^ dcoVarArrC[i].b().a.hashCode()) ^ h(dcoVarArrC[i].b().b);
            }
        }
        return iHashCode;
    }

    @Override // defpackage.dcr
    public final czb c(czv czvVar, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return g(czvVar, str);
        }
        try {
            int length = (str.length() - 1) / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i++) {
                int i2 = i + i;
                char cCharAt = str.charAt(i2 + 1);
                bArr[i] = (byte) (dnx.Z(str.charAt(i2 + 2)) | (dnx.Z(cCharAt) << 4));
            }
            return dab.v(bArr);
        } catch (IOException unused) {
            throw new daa("can't recode value for oid ".concat(String.valueOf(czvVar.b())));
        }
    }

    @Override // defpackage.dcr
    public final boolean e(dcp dcpVar, dcp dcpVar2) {
        if (dcpVar.a() != dcpVar2.a()) {
            return false;
        }
        dco[] dcoVarArrC = dcpVar.c();
        dco[] dcoVarArrC2 = dcpVar2.c();
        dcn dcnVarB = dcoVarArrC[0].b();
        dcn dcnVarB2 = dcoVarArrC2[0].b();
        boolean z = (dcnVarB == null || dcnVarB2 == null) ? false : !dcnVarB.a.w(dcnVarB2.a);
        loop0: for (int i = 0; i != dcoVarArrC.length; i++) {
            dco dcoVar = dcoVarArrC[i];
            if (!z) {
                for (int i2 = 0; i2 != dcoVarArrC2.length; i2++) {
                    dco dcoVar2 = dcoVarArrC2[i2];
                    if (dcoVar2 != null && dnx.ah(dcoVar, dcoVar2)) {
                        dcoVarArrC2[i2] = null;
                    }
                }
                return false;
            }
            int length = dcoVarArrC2.length;
            while (true) {
                length--;
                if (length < 0) {
                    break loop0;
                }
                dco dcoVar3 = dcoVarArrC2[length];
                if (dcoVar3 != null && dnx.ah(dcoVar, dcoVar3)) {
                    dcoVarArrC2[length] = null;
                    break;
                }
            }
        }
        return true;
    }

    protected czb g(czv czvVar, String str) {
        throw null;
    }
}
