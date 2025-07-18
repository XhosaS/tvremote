package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableSortedSet;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skn implements sjp {
    private final /* synthetic */ int a;

    public skn(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, skt] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final InputStream b(unc uncVar) {
        InputStream inputStreamC = uncVar.a.c((Uri) uncVar.c);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamC);
        ?? r2 = uncVar.d;
        if (!r2.isEmpty()) {
            int i = sjm.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                skv skvVarA = ((skx) it.next()).a();
                if (skvVarA != null) {
                    arrayList2.add(skvVarA);
                }
            }
            sjm sjmVar = !arrayList2.isEmpty() ? new sjm(inputStreamC, arrayList2) : null;
            if (sjmVar != null) {
                arrayList.add(sjmVar);
            }
        }
        for (sky skyVar : uncVar.f) {
            arrayList.add(skyVar.c());
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // defpackage.sjp
    public final /* synthetic */ Object a(unc uncVar) throws IOException {
        String strX;
        long j;
        rxn rxnVar;
        int i = this.a;
        if (i == 0) {
            sko skoVar = new sko();
            skoVar.b();
            File fileA = skoVar.a(uncVar);
            tyq.c(fileA);
            return new RandomAccessFile(fileA, "rw");
        }
        if (i != 1) {
            return b(uncVar);
        }
        InputStream inputStreamB = b(uncVar);
        try {
            vte vteVarL = vte.L(inputStreamB);
            rxp rxpVar = rxp.a;
            int iK = vteVarL.k();
            if (iK > 1) {
                throw new vuq("Unsupported version: " + iK + ". Current version is: 1");
            }
            vteVarL.k();
            int iE = vteVarL.e(vteVarL.n());
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vtp vtpVar2 = vtp.a;
            vuc vucVarO = rxk.a.o();
            try {
                try {
                    try {
                        vvy vvyVarB = vvs.a.b(vucVarO);
                        vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVar2);
                        vvyVarB.g(vucVarO);
                        vuc.B(vucVarO);
                        rxk rxkVar = (rxk) vucVarO;
                        vteVarL.A(iE);
                        byte[] bArrF = vteVarL.F();
                        rxm rxmVar = new rxm();
                        try {
                            rxmVar.a.setInput(bArrF);
                            try {
                                vte vteVarL2 = vte.L(new rxl(rxmVar));
                                rxo rxoVar = rxo.a;
                                int iJ = vteVarL2.j();
                                if (iJ < 0) {
                                    throw new vuq("Negative number of flags");
                                }
                                ImmutableSortedSet.Builder builderNaturalOrder = ImmutableSortedSet.naturalOrder();
                                long j2 = 0;
                                for (int i2 = 0; i2 < iJ; i2++) {
                                    long jR = vteVarL2.r();
                                    int i3 = (int) jR;
                                    long j3 = jR >>> 3;
                                    if (j3 == 0) {
                                        strX = vteVarL2.x();
                                        j = 0;
                                    } else {
                                        long j4 = j3 + j2;
                                        if (j4 > 2305843009213693951L) {
                                            throw new vuq("Flag name larger than max size");
                                        }
                                        strX = null;
                                        j = j4;
                                    }
                                    String str = strX;
                                    int i4 = i3 & 7;
                                    if (i4 == 0 || i4 == 1) {
                                        rxnVar = new rxn(j, str, i4, 0L, null);
                                    } else if (i4 == 2) {
                                        rxnVar = new rxn(j, str, i4, vteVarL2.r(), null);
                                    } else if (i4 == 3) {
                                        rxnVar = new rxn(j, str, i4, Double.doubleToRawLongBits(vteVarL2.b()), null);
                                    } else if (i4 == 4) {
                                        rxnVar = new rxn(j, str, i4, 0L, vteVarL2.x());
                                    } else {
                                        if (i4 != 5) {
                                            throw new vuq("Unrecognized flag type " + i4);
                                        }
                                        rxnVar = new rxn(j, str, i4, 0L, vteVarL2.F());
                                    }
                                    rxn rxnVar2 = rxnVar;
                                    long j5 = rxnVar2.a;
                                    if (j5 != 0) {
                                        j2 = j5;
                                    }
                                    builderNaturalOrder.add((ImmutableSortedSet.Builder) rxnVar2);
                                }
                                rxo rxoVar2 = new rxo(builderNaturalOrder.build());
                                rxmVar.close();
                                rxp rxpVar2 = new rxp(rxoVar2, rxkVar);
                                if (inputStreamB != null) {
                                    inputStreamB.close();
                                }
                                return rxpVar2;
                            } finally {
                                rxmVar.a.reset();
                            }
                        } finally {
                        }
                    } catch (vuq e) {
                        if (e.a) {
                            throw new vuq(e);
                        }
                        throw e;
                    } catch (IOException e2) {
                        if (e2.getCause() instanceof vuq) {
                            throw ((vuq) e2.getCause());
                        }
                        throw new vuq(e2);
                    }
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof vuq) {
                        throw ((vuq) e3.getCause());
                    }
                    throw e3;
                }
            } catch (vwf e4) {
                throw e4.a();
            }
        } finally {
        }
    }
}
