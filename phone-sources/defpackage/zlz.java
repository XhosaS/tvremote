package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zlz implements zly {
    public static Hashtable f(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    private static final int h(zih zihVar) {
        return wef.ac(zihVar).hashCode();
    }

    @Override // defpackage.zly
    public final int a(zlw zlwVar) {
        zlv[] zlvVarArrC = zlwVar.c();
        int iHashCode = 0;
        for (int i = 0; i != zlvVarArrC.length; i++) {
            if (zlvVarArrC[i].c()) {
                zlu[] zluVarArrD = zlvVarArrC[i].d();
                for (int i2 = 0; i2 != zluVarArrD.length; i2++) {
                    iHashCode = (iHashCode ^ zluVarArrD[i2].a.hashCode()) ^ h(zluVarArrD[i2].b);
                }
            } else {
                iHashCode = (iHashCode ^ zlvVarArrC[i].b().a.hashCode()) ^ h(zlvVarArrC[i].b().b);
            }
        }
        return iHashCode;
    }

    @Override // defpackage.zly
    public final zih c(zjb zjbVar, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return g(zjbVar, str);
        }
        try {
            int length = (str.length() - 1) / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i++) {
                int i2 = i + i;
                char cCharAt = str.charAt(i2 + 1);
                bArr[i] = (byte) (wef.ab(str.charAt(i2 + 2)) | (wef.ab(cCharAt) << 4));
            }
            return zjh.v(bArr);
        } catch (IOException unused) {
            throw new zjg("can't recode value for oid ".concat(String.valueOf(zjbVar.b())));
        }
    }

    @Override // defpackage.zly
    public final boolean e(zlw zlwVar, zlw zlwVar2) {
        if (zlwVar.a() != zlwVar2.a()) {
            return false;
        }
        zlv[] zlvVarArrC = zlwVar.c();
        zlv[] zlvVarArrC2 = zlwVar2.c();
        zlu zluVarB = zlvVarArrC[0].b();
        zlu zluVarB2 = zlvVarArrC2[0].b();
        boolean z = (zluVarB == null || zluVarB2 == null) ? false : !zluVarB.a.w(zluVarB2.a);
        loop0: for (int i = 0; i != zlvVarArrC.length; i++) {
            zlv zlvVar = zlvVarArrC[i];
            if (!z) {
                for (int i2 = 0; i2 != zlvVarArrC2.length; i2++) {
                    zlv zlvVar2 = zlvVarArrC2[i2];
                    if (zlvVar2 != null && wef.aj(zlvVar, zlvVar2)) {
                        zlvVarArrC2[i2] = null;
                    }
                }
                return false;
            }
            int length = zlvVarArrC2.length;
            while (true) {
                length--;
                if (length < 0) {
                    break loop0;
                }
                zlv zlvVar3 = zlvVarArrC2[length];
                if (zlvVar3 != null && wef.aj(zlvVar, zlvVar3)) {
                    zlvVarArrC2[length] = null;
                    break;
                }
            }
        }
        return true;
    }

    protected zih g(zjb zjbVar, String str) {
        throw null;
    }
}
