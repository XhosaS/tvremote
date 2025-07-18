package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfe implements bem {
    private final /* synthetic */ int a;

    public bfe(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bfi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final InputStream b(cmt cmtVar) {
        InputStream inputStreamD = cmtVar.c.d((Uri) cmtVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamD);
        ?? r2 = cmtVar.a;
        if (!r2.isEmpty()) {
            int i = bek.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                bfk bfkVarA = ((bfm) it.next()).a();
                if (bfkVarA != null) {
                    arrayList2.add(bfkVarA);
                }
            }
            bek bekVar = !arrayList2.isEmpty() ? new bek(inputStreamD, arrayList2) : null;
            if (bekVar != null) {
                arrayList.add(bekVar);
            }
        }
        for (bfn bfnVar : cmtVar.b) {
            arrayList.add(bfnVar.c());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // defpackage.bem
    public final /* synthetic */ Object a(cmt cmtVar) throws IOException {
        String strX;
        long j;
        bbn bbnVar;
        if (this.a == 0) {
            return b(cmtVar);
        }
        InputStream inputStreamB = b(cmtVar);
        try {
            cky ckyVarK = cky.K(inputStreamB);
            bbq bbqVar = bbq.a;
            int iK = ckyVarK.k();
            if (iK > 1) {
                throw new cmh("Unsupported version: " + iK + ". Current version is: 1");
            }
            ckyVarK.k();
            int iE = ckyVarK.e(ckyVarK.n());
            cli cliVar = cli.a;
            cni cniVar = cni.a;
            cli cliVar2 = cli.a;
            clt cltVarP = bbl.a.p();
            try {
                try {
                    try {
                        cno cnoVarB = cni.a.b(cltVarP);
                        cnoVarB.l(cltVarP, ckz.p(ckyVarK), cliVar2);
                        cnoVarB.g(cltVarP);
                        clt.B(cltVarP);
                        bbl bblVar = (bbl) cltVarP;
                        ckyVarK.A(iE);
                        byte[] bArrF = ckyVarK.F();
                        bev bevVar = new bev(1);
                        try {
                            ((Inflater) bevVar.a).setInput(bArrF);
                            try {
                                cky ckyVarK2 = cky.K(new bbm(bevVar));
                                bbo bboVar = bbo.a;
                                int iJ = ckyVarK2.j();
                                if (iJ < 0) {
                                    throw new cmh("Negative number of flags");
                                }
                                cac cacVar = new cac(car.a);
                                long j2 = 0;
                                for (int i = 0; i < iJ; i++) {
                                    long jR = ckyVarK2.r();
                                    int i2 = (int) jR;
                                    long j3 = jR >>> 3;
                                    if (j3 == 0) {
                                        strX = ckyVarK2.x();
                                        j = 0;
                                    } else {
                                        long j4 = j3 + j2;
                                        if (j4 > 2305843009213693951L) {
                                            throw new cmh("Flag name larger than max size");
                                        }
                                        strX = null;
                                        j = j4;
                                    }
                                    String str = strX;
                                    int i3 = i2 & 7;
                                    if (i3 == 0 || i3 == 1) {
                                        bbnVar = new bbn(j, str, i3, 0L, null);
                                    } else if (i3 == 2) {
                                        bbnVar = new bbn(j, str, i3, ckyVarK2.r(), null);
                                    } else if (i3 == 3) {
                                        bbnVar = new bbn(j, str, i3, Double.doubleToRawLongBits(ckyVarK2.b()), null);
                                    } else if (i3 == 4) {
                                        bbnVar = new bbn(j, str, i3, 0L, ckyVarK2.x());
                                    } else {
                                        if (i3 != 5) {
                                            throw new cmh("Unrecognized flag type " + i3);
                                        }
                                        bbnVar = new bbn(j, str, i3, 0L, ckyVarK2.F());
                                    }
                                    bbn bbnVar2 = bbnVar;
                                    long j5 = bbnVar2.a;
                                    if (j5 != 0) {
                                        j2 = j5;
                                    }
                                    cacVar.j(bbnVar2);
                                }
                                bbo bboVar2 = new bbo(cacVar.f());
                                bevVar.close();
                                bbq bbqVar2 = new bbq(bboVar2, bblVar);
                                if (inputStreamB != null) {
                                    inputStreamB.close();
                                }
                                return bbqVar2;
                            } finally {
                                ((Inflater) bevVar.a).reset();
                            }
                        } finally {
                        }
                    } catch (cmh e) {
                        if (e.a) {
                            throw new cmh(e);
                        }
                        throw e;
                    } catch (cnw e2) {
                        throw e2.a();
                    }
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof cmh) {
                        throw ((cmh) e3.getCause());
                    }
                    throw e3;
                }
            } catch (IOException e4) {
                if (e4.getCause() instanceof cmh) {
                    throw ((cmh) e4.getCause());
                }
                throw new cmh(e4);
            }
        } finally {
        }
    }
}
