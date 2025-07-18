package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzv implements ixn {
    private static final int c = Color.parseColor("#ff131314");
    public final ixm a;
    public final hfw b;
    private final ykc d;
    private final irc e;
    private final iom f;

    public jzv(ixm ixmVar, irc ircVar, hfw hfwVar, iom iomVar) {
        ixmVar.getClass();
        ircVar.getClass();
        this.a = ixmVar;
        this.e = ircVar;
        this.b = hfwVar;
        this.f = iomVar;
        this.d = new bhq(1510849069, true, new jmt(this, 2));
    }

    @Override // defpackage.ixn
    public final ykc a() {
        return this.d;
    }

    @Override // defpackage.ixn
    public final /* synthetic */ void b(wkx wkxVar, bkp bkpVar, ixo ixoVar, bao baoVar, int i) {
        jbr.af(this, wkxVar, bkpVar, ixoVar, baoVar, i);
    }

    @Override // defpackage.ixn
    public final /* synthetic */ void c(wkx wkxVar, bkp bkpVar, ixo ixoVar, bao baoVar, int i) {
        jbr.ag(this, wkxVar, bkpVar, ixoVar, baoVar, i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[PHI: r5
  0x0083: PHI (r5v1 char) = (r5v0 char), (r5v4 char), (r5v5 char), (r5v6 char), (r5v7 char), (r5v8 char) binds: [B:38:0x006a, B:40:0x006d, B:47:0x007e, B:46:0x007b, B:45:0x0078, B:43:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.bkp r13, defpackage.ixo r14, defpackage.jzs r15, defpackage.bao r16, int r17) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzv.d(bkp, ixo, jzs, bao, int):void");
    }

    public final void e(bkp bkpVar, ixo ixoVar, jzs jzsVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1026780227);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(ixoVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(jzsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(this) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
        } else {
            yva yvaVarB = ((dvk) baoVarD.f(dxf.a)).getLifecycle().b();
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = bbn.a(yim.a, baoVarD);
                basVar.ae(objT);
            }
            yow yowVar = (yow) objT;
            bkp bkpVarF = hq.f(bkpVar, bny.i(c), boh.a);
            ixm ixmVar = this.a;
            irc ircVar = this.e;
            iom iomVar = this.f;
            baoVarD.x(5004770);
            boolean zH = baoVarD.H(jzsVar);
            Object objT2 = basVar.T();
            if (zH || objT2 == obj) {
                objT2 = new ahf(jzsVar, 8, (char[][]) null);
                basVar.ae(objT2);
            }
            ymj ymjVar = (ymj) objT2;
            basVar.aa();
            boolean z = ixoVar instanceof jzr;
            jzr jzrVar = z ? (jzr) ixoVar : null;
            wlf wlfVar = jzrVar != null ? jzrVar.a : null;
            jzr jzrVar2 = z ? (jzr) ixoVar : null;
            boolean z2 = jzrVar2 != null ? jzrVar2.b : true;
            yjv yjvVar = (yjv) ymjVar;
            yjvVar.getClass();
            yowVar.getClass();
            kaz.b(new kbc((mdw) iomVar.d, (ovq) iomVar.a, (kuw) iomVar.c, (Context) iomVar.b, yjvVar, wlfVar, z2, yvaVarB, yowVar), bkpVarF, ixmVar, ircVar, baoVarD, 520);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(this, bkpVar, ixoVar, jzsVar, i, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, ysx] */
    public final void f(bkp bkpVar, ixo ixoVar, jzs jzsVar, bao baoVar, int i) {
        bkp bkpVar2;
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-388697871);
        if (i3 == 0) {
            bkpVar2 = bkpVar;
            i2 = (true != baoVarD.F(bkpVar2) ? 2 : 4) | i;
        } else {
            bkpVar2 = bkpVar;
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(jzsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(this) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1155) == 1154 && baoVarD.K()) {
            baoVarD.t();
        } else {
            int i4 = 0;
            gag gagVarA = gcg.a(jzsVar.v(false).a, baoVarD);
            xf xfVarE = xk.e(24.0f);
            baoVarD.x(-1633490746);
            boolean zH = baoVarD.H(gagVarA) | baoVarD.H(this);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new jzu(gagVarA, this, i4, null);
                basVar.ae(objT);
            }
            basVar.aa();
            d.n(bkpVar2, null, null, xfVarE, null, null, false, null, (yjv) objT, baoVarD, (i2 & 14) | 24576, 494);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(this, bkpVar, ixoVar, jzsVar, i, 8);
        }
    }
}
