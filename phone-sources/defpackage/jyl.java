package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.videos.R;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jyl implements yka {
    final /* synthetic */ jyb a;
    final /* synthetic */ bcb b;
    final /* synthetic */ by c;
    final /* synthetic */ gi d;
    final /* synthetic */ bcb e;
    final /* synthetic */ List f;
    final /* synthetic */ fwv g;
    final /* synthetic */ bcb h;
    final /* synthetic */ mdw i;

    public jyl(mdw mdwVar, jyb jybVar, bcb bcbVar, by byVar, gi giVar, bcb bcbVar2, List list, fwv fwvVar, bcb bcbVar3) {
        this.i = mdwVar;
        this.a = jybVar;
        this.b = bcbVar;
        this.c = byVar;
        this.d = giVar;
        this.e = bcbVar2;
        this.f = list;
        this.g = fwvVar;
        this.h = bcbVar3;
    }

    @Override // defpackage.yka
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws XmlPullParserException, Resources.NotFoundException, IOException {
        bkm bkmVar;
        jyb jybVar;
        String string;
        String string2;
        bao baoVar = (bao) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((bhi) obj).getClass();
        if ((iIntValue & 17) == 16 && baoVar.K()) {
            baoVar.t();
        } else {
            final mdw mdwVar = this.i;
            jyb jybVar2 = this.a;
            bcb bcbVar = this.b;
            final by byVar = this.c;
            final gi giVar = this.d;
            final bcb bcbVar2 = this.e;
            jxl.E(mdwVar, jybVar2, bcbVar, byVar, giVar, bcbVar2, baoVar, 33152);
            jyb jybVar3 = jybVar2;
            bao baoVar2 = baoVar;
            bkm bkmVar2 = bkp.g;
            og.v(hq.f(bkmVar2, wv.K(baoVar2).B, boh.a), 0.0f, 0L, baoVar2, 0, 6);
            baoVar2.x(-747509236);
            for (final isy isyVar : this.f) {
                bkp bkpVarP = wv.p(zi.a(bkmVar2, 1.0f), 16.0f);
                boolean zBooleanValue = ((Boolean) bcbVar.a()).booleanValue();
                baoVar2.x(-1224400529);
                boolean zH = baoVar2.H(jybVar3);
                bkm bkmVar3 = bkmVar2;
                final fwv fwvVar = this.g;
                boolean zH2 = zH | baoVar2.H(fwvVar) | baoVar2.H(byVar) | baoVar2.H(mdwVar) | baoVar2.H(isyVar);
                final bcb bcbVar3 = this.h;
                boolean zF = zH2 | baoVar2.F(bcbVar3) | baoVar2.F(bcbVar2) | baoVar2.H(giVar);
                Object objG = baoVar2.g();
                if (zF || objG == ban.a) {
                    final jyb jybVar4 = jybVar3;
                    bkmVar = bkmVar3;
                    yjk yjkVar = new yjk() { // from class: jyk
                        @Override // defpackage.yjk
                        public final Object a() {
                            mdw mdwVar2 = mdwVar;
                            jaz jazVarD = isyVar.d();
                            int iQ = mdwVar2.q();
                            if (mdwVar2.p()) {
                                bcbVar3.b(true);
                            } else if (iQ == 1) {
                                bcbVar2.b(true);
                            } else {
                                fwv fwvVar2 = fwvVar;
                                jyb jybVar5 = jybVar4;
                                if (jybVar5.a) {
                                    fwv.f(fwvVar2, jyf.a(jazVarD));
                                } else {
                                    mdwVar2.m(byVar, giVar, new ikc(jybVar5, fwvVar2, jazVarD, 11, (short[]) null));
                                }
                            }
                            return ygi.a;
                        }
                    };
                    jybVar = jybVar4;
                    baoVar2.A(yjkVar);
                    objG = yjkVar;
                } else {
                    jybVar = jybVar3;
                    bkmVar = bkmVar3;
                }
                baoVar2.p();
                bkp bkpVarU = hu.u(bkpVarP, zBooleanValue, null, (yjk) objG, 14);
                int iAs = a.as(((wnv) isyVar.a).b);
                if (iAs == 0) {
                    iAs = 1;
                }
                int i = iAs - 2;
                if (i == 1) {
                    string = ((Context) isyVar.b).getString(R.string.movies_sub_nav_tab);
                    string.getClass();
                } else if (i != 2) {
                    string = "";
                } else {
                    string = ((Context) isyVar.b).getString(R.string.shows_sub_nav_tab);
                    string.getClass();
                }
                if (isyVar.e().e == 0) {
                    string2 = ((Context) isyVar.b).getString(R.string.allow_all);
                    string2.getClass();
                } else {
                    string2 = isyVar.e().b;
                    string2.getClass();
                }
                int iOrdinal = isyVar.d().ordinal();
                int i2 = iOrdinal != 0 ? iOrdinal != 1 ? R.drawable.empty : R.drawable.ic_tv_24dp : R.drawable.ic_movie_24dp;
                bao baoVar3 = baoVar2;
                jxl.b(bkpVarU, string, string2, i2, ((Boolean) bcbVar.a()).booleanValue(), baoVar3, 0);
                jyb jybVar5 = jybVar;
                bkmVar2 = bkmVar;
                jybVar3 = jybVar5;
                baoVar2 = baoVar3;
            }
            baoVar2.p();
            bcb bcbVar4 = this.h;
            if (((Boolean) bcbVar4.a()).booleanValue()) {
                baoVar2.x(-1697081896);
                baoVar2.x(5004770);
                boolean zF2 = baoVar2.F(bcbVar4);
                Object objG2 = baoVar2.g();
                if (zF2 || objG2 == ban.a) {
                    objG2 = new jwz(bcbVar4, 14);
                    baoVar2.A(objG2);
                }
                baoVar2.p();
                jxl.d((yjk) objG2, baoVar2, 0);
                baoVar2.p();
            } else if (((Boolean) bcbVar2.a()).booleanValue()) {
                baoVar2.x(-1696958733);
                baoVar2.x(5004770);
                boolean zF3 = baoVar2.F(bcbVar2);
                Object objG3 = baoVar2.g();
                if (zF3 || objG3 == ban.a) {
                    objG3 = new jwz(bcbVar2, 15);
                    baoVar2.A(objG3);
                }
                baoVar2.p();
                jxl.c((yjk) objG3, baoVar2, 0);
                baoVar2.p();
            } else {
                baoVar2.x(-1696867190);
                baoVar2.p();
            }
        }
        return ygi.a;
    }
}
