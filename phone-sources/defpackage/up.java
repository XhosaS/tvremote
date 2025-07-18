package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class up implements yjv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ up(nxb nxbVar, gt gtVar, String str, gx gxVar, bdy bdyVar, int i) {
        this.f = i;
        this.a = nxbVar;
        this.d = gtVar;
        this.b = str;
        this.e = gxVar;
        this.c = bdyVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, yy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        List listSubList;
        int i = this.f;
        if (i == 0) {
            float fFloatValue = ((Float) obj).floatValue();
            uu uuVar = (uu) this.a;
            un unVarF = uu.f(uuVar.c);
            if (unVarF != null) {
                Object obj2 = this.e;
                Object obj3 = this.d;
                Object obj4 = this.c;
                Object obj5 = this.b;
                uuVar.d(unVarF);
                ylf ylfVar = (ylf) obj5;
                ylfVar.a = ((un) ylfVar.a).a(unVarF);
                vx vxVar = (vx) obj3;
                ((ylc) obj4).a = vxVar.b(vxVar.d(((un) ylfVar.a).a));
                ((ylb) obj2).a = !a.bG(r0 - fFloatValue);
            }
            return Boolean.valueOf(unVarF != null);
        }
        if (i == 1) {
            gp gpVarA = ((gt) this.d).a((String) this.b, (gx) this.e, new hiq(this.c, 1));
            Object obj6 = this.a;
            ((nxb) obj6).a = gpVarA;
            return new gd(obj6, 1);
        }
        if (i == 2) {
            fwr fwrVar = (fwr) obj;
            fwrVar.getClass();
            ((ylb) this.c).a = true;
            ?? r0 = this.e;
            int iIndexOf = r0.indexOf(fwrVar);
            if (iIndexOf != -1) {
                int i2 = iIndexOf + 1;
                yld yldVar = (yld) this.b;
                listSubList = r0.subList(yldVar.a, i2);
                yldVar.a = i2;
            } else {
                listSubList = yhb.a;
            }
            ((fyr) this.d).i(fwrVar.a, (Bundle) this.a, fwrVar, listSubList);
            return ygi.a;
        }
        fxe fxeVar = (fxe) obj;
        fxeVar.getClass();
        String str = jye.a.b;
        ?? r7 = this.b;
        Object obj7 = this.e;
        Object obj8 = this.c;
        Object obj9 = this.d;
        ?? r3 = this.a;
        mdw mdwVar = (mdw) obj7;
        fus.D(fxeVar, str, null, new bhq(1858656723, true, new jyc((yy) r3, (fwv) obj9, (jyb) obj8, mdwVar, (List) r7, 0)), 254);
        String str2 = jyf.a.b;
        jxd jxdVar = new jxd(6);
        dxc dxcVar = new dxc((byte[]) null, (char[]) null);
        jxdVar.a(dxcVar);
        Object obj10 = ((nxb) dxcVar.a).a;
        if (obj10 == null) {
            obj10 = fxm.b;
        }
        fus.D(fxeVar, str2, yfm.p(new fse(new fwq((fxm) obj10))), new bhq(1119393482, true, new jyd(r7, r3, mdwVar)), 252);
        return ygi.a;
    }

    public /* synthetic */ up(uu uuVar, ylf ylfVar, ylc ylcVar, vx vxVar, ylb ylbVar, int i) {
        this.f = i;
        this.a = uuVar;
        this.b = ylfVar;
        this.c = ylcVar;
        this.d = vxVar;
        this.e = ylbVar;
    }

    public /* synthetic */ up(ylb ylbVar, List list, yld yldVar, fyr fyrVar, Bundle bundle, int i) {
        this.f = i;
        this.c = ylbVar;
        this.e = list;
        this.b = yldVar;
        this.d = fyrVar;
        this.a = bundle;
    }

    public /* synthetic */ up(yy yyVar, fwv fwvVar, jyb jybVar, mdw mdwVar, List list, int i) {
        this.f = i;
        this.a = yyVar;
        this.d = fwvVar;
        this.c = jybVar;
        this.e = mdwVar;
        this.b = list;
    }
}
