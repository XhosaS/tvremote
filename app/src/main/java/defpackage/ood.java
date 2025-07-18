package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ood {
    public static boolean a(ooe ooeVar, yqt yqtVar, aceh acehVar) {
        int iA;
        String strName;
        try {
            for (aceg acegVar : acehVar.b) {
                int i = acegVar.b;
                if ((i & 8) != 0 && ((i & 1) != 0 || (i & 64) != 0)) {
                    if ((i & 2) != 0) {
                        acgi acgiVar = acegVar.g;
                        if (acgiVar == null) {
                            acgiVar = acgi.a;
                        }
                        try {
                            int i2 = acgiVar.memoizedSerializedSize;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                iA = abza.a.a(acgiVar.getClass()).a(acgiVar);
                                if (iA < 0) {
                                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                }
                            } else {
                                iA = i2 & Integer.MAX_VALUE;
                                if (iA == Integer.MAX_VALUE) {
                                    iA = abza.a.a(acgiVar.getClass()).a(acgiVar);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                    acgiVar.memoizedSerializedSize = (Integer.MIN_VALUE & acgiVar.memoizedSerializedSize) | iA;
                                }
                            }
                            byte[] bArr = new byte[iA];
                            boolean z = abvz.e;
                            abvw abvwVar = new abvw(bArr, 0, iA);
                            abza.a.a(acgiVar.getClass()).m(acgiVar, abwa.a(abvwVar));
                            abvwVar.K();
                            if ((acegVar.b & 64) != 0) {
                                strName = acegVar.j;
                            } else {
                                acgd acgdVarB = acgd.b(acegVar.c);
                                if (acgdVarB == null) {
                                    acgdVarB = acgd.UNKNOWN;
                                }
                                strName = acgdVarB.name();
                            }
                            ooe ooeVar2 = ooeVar;
                            yqt yqtVar2 = yqtVar;
                            if (!ooeVar2.g(yqtVar2, strName, (String[]) ooj.c(acegVar.d).toArray(new String[0]), acegVar.e, acegVar.f, bArr)) {
                                return false;
                            }
                            ooeVar = ooeVar2;
                            yqtVar = yqtVar2;
                        } catch (IOException e) {
                            throw new RuntimeException(a.C(acgiVar, "byte array"), e);
                        }
                    }
                }
                return false;
            }
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
