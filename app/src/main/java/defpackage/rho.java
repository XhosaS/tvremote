package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rho {
    public static final rho a = new rho(rhk.a, rhg.a);
    public final rhk b;
    public final rhg c;

    private rho(rhk rhkVar, rhg rhgVar) {
        rhkVar.getClass();
        this.b = rhkVar;
        this.c = rhgVar;
    }

    public static rho b(abvt abvtVar) throws abxv {
        long j;
        String strX;
        rhj rhjVar;
        int iK = abvtVar.k();
        if (iK > 1) {
            throw new abxv(a.a(iK, "Unsupported version: ", ". Current version is: 1"));
        }
        abvtVar.k();
        int iE = abvtVar.e(abvtVar.n());
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
        abza abzaVar = abza.a;
        ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
        rhg rhgVar = rhg.a;
        rhg rhgVar2 = new rhg();
        try {
            abzj abzjVarA = abza.a.a(rhgVar2.getClass());
            abzjVarA.i(rhgVar2, abvu.p(abvtVar), extensionRegistryLite2);
            abzjVarA.g(rhgVar2);
            Byte b = (byte) 1;
            b.getClass();
            abvtVar.A(iE);
            byte[] bArrF = abvtVar.F();
            rhi rhiVar = new rhi();
            try {
                rhiVar.a.setInput(bArrF);
                try {
                    abvt abvtVarK = abvt.K(new rhh(rhiVar), 4096);
                    rhk rhkVar = rhk.a;
                    int iJ = abvtVarK.j();
                    if (iJ < 0) {
                        throw new abxv("Negative number of flags");
                    }
                    yzu yzuVar = new yzu(zbv.a);
                    long j2 = 0;
                    for (int i = 0; i < iJ; i++) {
                        long jR = abvtVarK.r();
                        int i2 = (int) jR;
                        long j3 = jR >>> 3;
                        if (j3 == 0) {
                            j = 0;
                            strX = abvtVarK.x();
                        } else {
                            long j4 = j3 + j2;
                            if (j4 > 2305843009213693951L) {
                                throw new abxv("Flag name larger than max size");
                            }
                            j = j4;
                            strX = null;
                        }
                        int i3 = i2 & 7;
                        if (i3 == 0 || i3 == 1) {
                            rhjVar = new rhj(j, strX, i3, 0L, null);
                        } else if (i3 == 2) {
                            rhjVar = new rhj(j, strX, i3, abvtVarK.r(), null);
                        } else if (i3 == 3) {
                            rhjVar = new rhj(j, strX, i3, Double.doubleToRawLongBits(abvtVarK.b()), null);
                        } else if (i3 == 4) {
                            rhjVar = new rhj(j, strX, i3, 0L, abvtVarK.x());
                        } else {
                            if (i3 != 5) {
                                throw new abxv("Unrecognized flag type " + i3);
                            }
                            rhjVar = new rhj(j, strX, i3, 0L, abvtVarK.F());
                        }
                        rhj rhjVar2 = rhjVar;
                        long j5 = rhjVar2.a;
                        if (j5 != 0) {
                            j2 = j5;
                        }
                        yzuVar.l(rhjVar2);
                    }
                    rhk rhkVar2 = new rhk(yzuVar.f());
                    rhiVar.a.end();
                    return new rho(rhkVar2, rhgVar2);
                } finally {
                    rhiVar.a.reset();
                }
            } finally {
            }
        } catch (abxv e) {
            if (e.a) {
                throw new abxv(e);
            }
            throw e;
        } catch (abzz e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof abxv) {
                throw ((abxv) e3.getCause());
            }
            throw new abxv(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof abxv) {
                throw ((abxv) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rhk a() {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rho.a():rhk");
    }

    public final Map c() {
        rhg rhgVar = this.c;
        if (rhgVar.f.size() == 0) {
            return null;
        }
        return DesugarCollections.unmodifiableMap(rhgVar.f);
    }
}
