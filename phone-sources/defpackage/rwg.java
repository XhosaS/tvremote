package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.common.collect.Lists;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwg {
    public static final /* synthetic */ int d = 0;
    private static final uof e = uof.g('/').f();
    static final rwf a = new rwe(1);
    static final rwf b = new rwe(0);
    static final rwf c = new rwe(2);

    static void a(rwf rwfVar, vvi vviVar) {
        String strA = rwfVar.a(vviVar);
        String strB = rwfVar.b(vviVar);
        if (!strA.isEmpty() || strB.isEmpty()) {
            rwfVar.c(vviVar, null);
        } else {
            rwfVar.c(vviVar, uin.a(strB));
        }
        rwfVar.d(vviVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final zba b(zba zbaVar) {
        vtw vtwVar = (vtw) zbaVar.a(5, null);
        vtwVar.x(zbaVar);
        a(a, vtwVar);
        yyx yyxVar = ((zba) vtwVar.b).k;
        if (yyxVar == null) {
            yyxVar = yyx.a;
        }
        if ((yyxVar.b & 1) != 0) {
            yyx yyxVar2 = ((zba) vtwVar.b).k;
            if (yyxVar2 == null) {
                yyxVar2 = yyx.a;
            }
            yyw yywVar = yyxVar2.c;
            if (yywVar == null) {
                yywVar = yyw.a;
            }
            vtw vtwVar2 = (vtw) yywVar.a(5, null);
            vtwVar2.x(yywVar);
            a(b, vtwVar2);
            yyx yyxVar3 = ((zba) vtwVar.b).k;
            if (yyxVar3 == null) {
                yyxVar3 = yyx.a;
            }
            vtw vtwVar3 = (vtw) yyxVar3.a(5, null);
            vtwVar3.x(yyxVar3);
            if (!vtwVar3.b.A()) {
                vtwVar3.u();
            }
            yyx yyxVar4 = (yyx) vtwVar3.b;
            yyw yywVar2 = (yyw) vtwVar2.r();
            yywVar2.getClass();
            yyxVar4.c = yywVar2;
            yyxVar4.b |= 1;
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            zba zbaVar2 = (zba) vtwVar.b;
            yyx yyxVar5 = (yyx) vtwVar3.r();
            yyxVar5.getClass();
            zbaVar2.k = yyxVar5;
            zbaVar2.b |= 256;
        }
        zan zanVar = ((zba) vtwVar.b).i;
        if (zanVar == null) {
            zanVar = zan.a;
        }
        if ((zanVar.b & 256) != 0) {
            zan zanVar2 = ((zba) vtwVar.b).i;
            if (zanVar2 == null) {
                zanVar2 = zan.a;
            }
            udg udgVar = zanVar2.i;
            if (udgVar == null) {
                udgVar = udg.a;
            }
            vtw vtwVar4 = (vtw) udgVar.a(5, null);
            vtwVar4.x(udgVar);
            udd uddVar = ((udg) vtwVar4.b).e;
            if (uddVar == null) {
                uddVar = udd.a;
            }
            udd uddVarD = d(uddVar);
            if (!vtwVar4.b.A()) {
                vtwVar4.u();
            }
            udg udgVar2 = (udg) vtwVar4.b;
            uddVarD.getClass();
            udgVar2.e = uddVarD;
            udgVar2.b |= 1;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(udgVar2.f);
            if (!vtwVar4.b.A()) {
                vtwVar4.u();
            }
            ((udg) vtwVar4.b).f = vvt.a;
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                udd uddVarD2 = d((udd) it.next());
                if (!vtwVar4.b.A()) {
                    vtwVar4.u();
                }
                udg udgVar3 = (udg) vtwVar4.b;
                uddVarD2.getClass();
                udgVar3.b();
                udgVar3.f.add(uddVarD2);
            }
            udg udgVar4 = (udg) vtwVar4.b;
            vun<udf> vunVar = (udgVar4.c == 4 ? (ude) udgVar4.d : ude.a).b;
            vtw vtwVarM = ude.a.m();
            for (udf udfVar : vunVar) {
                udd uddVar2 = udfVar.c;
                if (uddVar2 == null) {
                    uddVar2 = udd.a;
                }
                if ((uddVar2.b & 2) != 0) {
                    vtw vtwVar5 = (vtw) udfVar.a(5, null);
                    vtwVar5.x(udfVar);
                    udd uddVarD3 = d(uddVar2);
                    if (!vtwVar5.b.A()) {
                        vtwVar5.u();
                    }
                    udf udfVar2 = (udf) vtwVar5.b;
                    uddVarD3.getClass();
                    udfVar2.c = uddVarD3;
                    udfVar2.b |= 1;
                    udfVar = (udf) vtwVar5.r();
                }
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                ude udeVar = (ude) vtwVarM.b;
                udfVar.getClass();
                udeVar.b();
                udeVar.b.add(udfVar);
            }
            ude udeVar2 = (ude) vtwVarM.r();
            if (!vtwVar4.b.A()) {
                vtwVar4.u();
            }
            udg udgVar5 = (udg) vtwVar4.b;
            udeVar2.getClass();
            udgVar5.d = udeVar2;
            udgVar5.c = 4;
            zan zanVar3 = ((zba) vtwVar.b).i;
            if (zanVar3 == null) {
                zanVar3 = zan.a;
            }
            vtw vtwVar6 = (vtw) zanVar3.a(5, null);
            vtwVar6.x(zanVar3);
            udg udgVar6 = (udg) vtwVar4.r();
            if (!vtwVar6.b.A()) {
                vtwVar6.u();
            }
            zan zanVar4 = (zan) vtwVar6.b;
            udgVar6.getClass();
            zanVar4.i = udgVar6;
            zanVar4.b |= 256;
            zan zanVar5 = (zan) vtwVar6.r();
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            zba zbaVar3 = (zba) vtwVar.b;
            zanVar5.getClass();
            zbaVar3.i = zanVar5;
            zbaVar3.b |= 64;
        }
        zaw zawVar = ((zba) vtwVar.b).j;
        if (zawVar == null) {
            zawVar = zaw.a;
        }
        if (zawVar.k.size() != 0) {
            zaw zawVar2 = ((zba) vtwVar.b).j;
            if (zawVar2 == null) {
                zawVar2 = zaw.a;
            }
            vtw vtwVar7 = (vtw) zawVar2.a(5, null);
            vtwVar7.x(zawVar2);
            for (int i = 0; i < ((zaw) vtwVar7.b).k.size(); i++) {
                zav zavVar = (zav) ((zaw) vtwVar7.b).k.get(i);
                vtw vtwVar8 = (vtw) zavVar.a(5, null);
                vtwVar8.x(zavVar);
                if (!((zav) vtwVar8.b).c.isEmpty()) {
                    if (!vtwVar8.b.A()) {
                        vtwVar8.u();
                    }
                    ((zav) vtwVar8.b).d = vuz.a;
                    List listC = c(((zav) vtwVar8.b).c);
                    if (!vtwVar8.b.A()) {
                        vtwVar8.u();
                    }
                    zav zavVar2 = (zav) vtwVar8.b;
                    vum vumVar = zavVar2.d;
                    if (!vumVar.c()) {
                        zavVar2.d = vuc.r(vumVar);
                    }
                    vsf.h(listC, zavVar2.d);
                }
                if (!vtwVar8.b.A()) {
                    vtwVar8.u();
                }
                zav zavVar3 = (zav) vtwVar8.b;
                zavVar3.b &= -2;
                zavVar3.c = zav.a.c;
                if (!vtwVar7.b.A()) {
                    vtwVar7.u();
                }
                zaw zawVar3 = (zaw) vtwVar7.b;
                zav zavVar4 = (zav) vtwVar8.r();
                zavVar4.getClass();
                vun vunVar2 = zawVar3.k;
                if (!vunVar2.c()) {
                    zawVar3.k = vuc.s(vunVar2);
                }
                zawVar3.k.set(i, zavVar4);
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            zba zbaVar4 = (zba) vtwVar.b;
            zaw zawVar4 = (zaw) vtwVar7.r();
            zawVar4.getClass();
            zbaVar4.j = zawVar4;
            zbaVar4.b |= 128;
        }
        yzs yzsVar = ((zba) vtwVar.b).h;
        if (yzsVar == null) {
            yzsVar = yzs.a;
        }
        if (yzsVar.b.size() != 0) {
            yzs yzsVar2 = ((zba) vtwVar.b).h;
            if (yzsVar2 == null) {
                yzsVar2 = yzs.a;
            }
            vtw vtwVar9 = (vtw) yzsVar2.a(5, null);
            vtwVar9.x(yzsVar2);
            for (int i2 = 0; i2 < ((yzs) vtwVar9.b).b.size(); i2++) {
                yzr yzrVar = (yzr) ((yzs) vtwVar9.b).b.get(i2);
                vtw vtwVar10 = (vtw) yzrVar.a(5, null);
                vtwVar10.x(yzrVar);
                if (!((yzr) vtwVar10.b).u.isEmpty()) {
                    if (!vtwVar10.b.A()) {
                        vtwVar10.u();
                    }
                    ((yzr) vtwVar10.b).v = vuz.a;
                    List listC2 = c(((yzr) vtwVar10.b).u);
                    if (!vtwVar10.b.A()) {
                        vtwVar10.u();
                    }
                    yzr yzrVar2 = (yzr) vtwVar10.b;
                    vum vumVar2 = yzrVar2.v;
                    if (!vumVar2.c()) {
                        yzrVar2.v = vuc.r(vumVar2);
                    }
                    vsf.h(listC2, yzrVar2.v);
                }
                if (!vtwVar10.b.A()) {
                    vtwVar10.u();
                }
                yzr yzrVar3 = (yzr) vtwVar10.b;
                yzrVar3.b &= -524289;
                yzrVar3.u = yzr.a.u;
                if (!vtwVar9.b.A()) {
                    vtwVar9.u();
                }
                yzs yzsVar3 = (yzs) vtwVar9.b;
                yzr yzrVar4 = (yzr) vtwVar10.r();
                yzrVar4.getClass();
                yzsVar3.c();
                yzsVar3.b.set(i2, yzrVar4);
            }
            for (int i3 = 0; i3 < ((yzs) vtwVar9.b).c.size(); i3++) {
                yzu yzuVar = (yzu) ((yzs) vtwVar9.b).c.get(i3);
                vtw vtwVar11 = (vtw) yzuVar.a(5, null);
                vtwVar11.x(yzuVar);
                if (!((yzu) vtwVar11.b).c.isEmpty()) {
                    if (!vtwVar11.b.A()) {
                        vtwVar11.u();
                    }
                    ((yzu) vtwVar11.b).d = vuz.a;
                    List listC3 = c(((yzu) vtwVar11.b).c);
                    if (!vtwVar11.b.A()) {
                        vtwVar11.u();
                    }
                    yzu yzuVar2 = (yzu) vtwVar11.b;
                    vum vumVar3 = yzuVar2.d;
                    if (!vumVar3.c()) {
                        yzuVar2.d = vuc.r(vumVar3);
                    }
                    vsf.h(listC3, yzuVar2.d);
                }
                if (!vtwVar11.b.A()) {
                    vtwVar11.u();
                }
                yzu yzuVar3 = (yzu) vtwVar11.b;
                yzuVar3.b &= -2;
                yzuVar3.c = yzu.a.c;
                if (!vtwVar9.b.A()) {
                    vtwVar9.u();
                }
                yzs yzsVar4 = (yzs) vtwVar9.b;
                yzu yzuVar4 = (yzu) vtwVar11.r();
                yzuVar4.getClass();
                vun vunVar3 = yzsVar4.c;
                if (!vunVar3.c()) {
                    yzsVar4.c = vuc.s(vunVar3);
                }
                yzsVar4.c.set(i3, yzuVar4);
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            zba zbaVar5 = (zba) vtwVar.b;
            yzs yzsVar5 = (yzs) vtwVar9.r();
            yzsVar5.getClass();
            zbaVar5.h = yzsVar5;
            zbaVar5.b |= 32;
        }
        yzv yzvVar = ((zba) vtwVar.b).m;
        if (yzvVar == null) {
            yzvVar = yzv.a;
        }
        if (yzvVar.e.size() != 0) {
            yzv yzvVar2 = ((zba) vtwVar.b).m;
            if (yzvVar2 == null) {
                yzvVar2 = yzv.a;
            }
            vtw vtwVar12 = (vtw) yzvVar2.a(5, null);
            vtwVar12.x(yzvVar2);
            for (int i4 = 0; i4 < ((yzv) vtwVar12.b).e.size(); i4++) {
                yzw yzwVar = (yzw) ((yzv) vtwVar12.b).e.get(i4);
                vtw vtwVar13 = (vtw) yzwVar.a(5, null);
                vtwVar13.x(yzwVar);
                vty vtyVar = (vty) vtwVar13;
                a(c, vtyVar);
                if (!vtwVar12.b.A()) {
                    vtwVar12.u();
                }
                yzv yzvVar3 = (yzv) vtwVar12.b;
                yzw yzwVar2 = (yzw) vtyVar.r();
                yzwVar2.getClass();
                yzvVar3.c();
                yzvVar3.e.set(i4, yzwVar2);
            }
            if (!vtwVar.b.A()) {
                vtwVar.u();
            }
            zba zbaVar6 = (zba) vtwVar.b;
            yzv yzvVar4 = (yzv) vtwVar12.r();
            yzvVar4.getClass();
            zbaVar6.m = yzvVar4;
            zbaVar6.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        return (zba) vtwVar.r();
    }

    private static List c(String str) {
        return Lists.transform(e.d(str), new rke(15));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.udd d(defpackage.udd r5) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwg.d(udd):udd");
    }
}
