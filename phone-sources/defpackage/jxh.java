package defpackage;

import androidx.compose.foundation.layout.SizeElement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxh implements yjz {
    final /* synthetic */ float a;
    final /* synthetic */ wqo b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bkp d;
    final /* synthetic */ irc e;

    public jxh(float f, wqo wqoVar, boolean z, irc ircVar, bkp bkpVar) {
        this.a = f;
        this.b = wqoVar;
        this.c = z;
        this.e = ircVar;
        this.d = bkpVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        float f;
        bao baoVar = (bao) obj;
        int i = 3;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
            baoVar.t();
        } else {
            bkm bkmVar = bkp.g;
            baoVar.x(5004770);
            final float f2 = this.a;
            boolean zC = baoVar.C(f2);
            Object objG = baoVar.g();
            if (zC || objG == ban.a) {
                objG = new yka() { // from class: jxg
                    @Override // defpackage.yka
                    public final Object a(Object obj3, Object obj4, Object obj5) {
                        bvv bvvVar = (bvv) obj3;
                        bvs bvsVar = (bvs) obj4;
                        bvvVar.getClass();
                        bvsVar.getClass();
                        bwj bwjVarU = bvsVar.u(((clv) obj5).a);
                        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new sh(f2, bwjVarU, 3));
                    }
                };
                baoVar.A(objG);
            }
            baoVar.p();
            bkp bkpVarA = bty.j((yka) objG).a(zi.c);
            wqo wqoVar = this.b;
            if (wqoVar.c == 12) {
                jxf jxfVar = jxf.a;
                f = 28.0f;
            } else {
                jxf jxfVar2 = jxf.a;
                f = 32.0f;
            }
            boolean z = this.c;
            irc ircVar = this.e;
            bkp bkpVarO = this.d;
            bvt bvtVarA = xu.a(xk.e(f), bkb.j, baoVar, 0);
            int iK = a.k(zy.p(baoVar));
            bhu bhuVarO = baoVar.O();
            bkp bkpVarC = bdi.C(baoVar, bkpVarA);
            yjk yjkVar = bxt.a;
            baoVar.c();
            baoVar.z();
            if (baoVar.J()) {
                baoVar.k(yjkVar);
            } else {
                baoVar.B();
            }
            beb.a(baoVar, bvtVarA, bxt.d);
            beb.a(baoVar, bhuVarO, bxt.c);
            yjz yjzVar = bxt.e;
            if (baoVar.J() || !yks.e(baoVar.g(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                baoVar.A(numValueOf);
                baoVar.i(numValueOf, yjzVar);
            }
            beb.a(baoVar, bkpVarC, bxt.b);
            baoVar.x(-2042094295);
            if (z) {
                String str = (wqoVar.c == 5 ? (wtm) wqoVar.d : wtm.a).c;
                str.getClass();
                jwq.v(str, new SizeElement(337.0f, 0.0f, 337.0f, 0.0f, 10), baoVar, 48);
            }
            baoVar.p();
            bkp bkpVarO2 = wqoVar.c == 12 ? wv.o(zi.a(bkmVar, 1.0f), jxf.b) : zi.a(bkmVar, 1.0f);
            baoVar.x(1849434622);
            Object objG2 = baoVar.g();
            if (objG2 == ban.a) {
                objG2 = new jxd(i);
                baoVar.A(objG2);
            }
            baoVar.p();
            jwq.s(wqoVar, cfd.b(bkpVarO2, true, (yjv) objG2), baoVar, 0);
            jwq.B(wqoVar, ircVar, zi.a(bkmVar, 1.0f), baoVar, 384);
            baoVar.x(-2042071938);
            if ((wqoVar.b & 16) != 0) {
                wqm wqmVar = wqoVar.h;
                if (wqmVar == null) {
                    wqmVar = wqm.a;
                }
                if ((wqmVar.b & 2) != 0) {
                    wqm wqmVar2 = wqoVar.h;
                    if (wqmVar2 == null) {
                        wqmVar2 = wqm.a;
                    }
                    String str2 = wqmVar2.c;
                    str2.getClass();
                    if (str2.length() > 0) {
                        if (wqoVar.c == 8) {
                            bkpVarO = wv.o(bkpVarO, jxf.c);
                        }
                        wqm wqmVar3 = wqoVar.h;
                        if (wqmVar3 == null) {
                            wqmVar3 = wqm.a;
                        }
                        String str3 = wqmVar3.c;
                        str3.getClass();
                        jwq.r(bkpVarO, str3, baoVar, 0);
                    }
                }
            }
            baoVar.p();
            baoVar.o();
        }
        return ygi.a;
    }
}
