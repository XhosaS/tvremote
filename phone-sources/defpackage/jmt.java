package defpackage;

import android.support.v7.appcompat.R;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmt implements ykc {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jmt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r1v1, types: [iea, java.lang.Object] */
    @Override // defpackage.ykc
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.b;
        if (i == 0) {
            bkp bkpVar = (bkp) obj;
            ixo ixoVar = (ixo) obj2;
            wkx wkxVar = (wkx) obj3;
            int iIntValue = ((Number) obj5).intValue();
            wkxVar.getClass();
            obj4.x(1849434622);
            bas basVar = (bas) obj4;
            Object objT = basVar.T();
            Object obj6 = this.a;
            if (objT == ban.a) {
                jmu jmuVar = (jmu) obj6;
                gag gagVar = new gag(jmuVar.b, jmuVar.a, wkxVar);
                basVar.ae(gagVar);
                objT = gagVar;
            }
            gag gagVar2 = (gag) objT;
            basVar.aa();
            ?? r0 = gagVar2.c;
            isw iswVar = (isw) gagVar2.d;
            ((jmu) obj6).d((jmq) dad.h(r0, new jmq(iswVar, gagVar2.b, (wkx) gagVar2.e, iswVar.t((iog) gagVar2.a)), null, obj4, 0, 14).a(), ixoVar, bkpVar, obj4, (iIntValue & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((iIntValue << 6) & 896));
            return ygi.a;
        }
        if (i == 1) {
            bkp bkpVar2 = (bkp) obj;
            ixo ixoVar2 = (ixo) obj2;
            wkx wkxVar2 = (wkx) obj3;
            int iIntValue2 = ((Number) obj5).intValue();
            wkxVar2.getClass();
            wkw wkwVarB = wkw.b(wkxVar2.d);
            if (wkwVarB == null) {
                wkwVarB = wkw.TYPE_UNSPECIFIED;
            }
            Map map = ((ixm) this.a).b;
            ixn ixnVar = null;
            if (map.containsKey(wkwVarB)) {
                wkw wkwVarB2 = wkw.b(wkxVar2.d);
                if (wkwVarB2 == null) {
                    wkwVarB2 = wkw.TYPE_UNSPECIFIED;
                }
                yfo yfoVar = (yfo) map.get(wkwVarB2);
                if (yfoVar != null) {
                    ixnVar = (ixn) yfoVar.b();
                }
            } else {
                tug tugVar = (tug) ixm.a.f();
                wkw wkwVarB3 = wkw.b(wkxVar2.d);
                if (wkwVarB3 == null) {
                    wkwVarB3 = wkw.TYPE_UNSPECIFIED;
                }
                Objects.toString(wkwVarB3);
                tug tugVar2 = (tug) tugVar.i(new Exception("No renderer registered for type=".concat(String.valueOf(wkwVarB3)))).j("com/google/android/apps/googletv/app/framework/compose/ComposeComponentManager", "getRenderer$java_com_google_android_apps_googletv_app_framework_compose_compose_component_manager", 42, "ComposeComponentManager.kt");
                wkw wkwVarB4 = wkw.b(wkxVar2.d);
                if (wkwVarB4 == null) {
                    wkwVarB4 = wkw.TYPE_UNSPECIFIED;
                }
                tugVar2.v("No renderer registered for type=%s", wkwVarB4);
            }
            ixn ixnVar2 = ixnVar;
            if (ixnVar2 != null) {
                int i2 = iIntValue2 >> 6;
                int i3 = iIntValue2 << 3;
                ixnVar2.c(wkxVar2, bkpVar2, ixoVar2, obj4, (i2 & 14) | (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i3 & 896));
            }
            return ygi.a;
        }
        if (i == 2) {
            ixo ixoVar3 = (ixo) obj2;
            wkx wkxVar3 = (wkx) obj3;
            int iIntValue3 = ((Number) obj5).intValue();
            wkxVar3.getClass();
            String str = wkxVar3.c;
            str.getClass();
            bkp bkpVarD = ccf.d((bkp) obj, str);
            jzv jzvVar = (jzv) this.a;
            jzvVar.d(bkpVarD, ixoVar3, new jzs((isf) jzvVar.b.a, wkxVar3), obj4, iIntValue3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            return ygi.a;
        }
        if (i == 3) {
            bkp bkpVar3 = (bkp) obj;
            wkx wkxVar4 = (wkx) obj3;
            int iIntValue4 = ((Number) obj5).intValue();
            wkxVar4.getClass();
            wv.i(bkpVar3, null, false, bga.k(1979534709, new ada((ixo) obj2, this.a, wkxVar4, bkpVar3, 5), obj4), obj4, (iIntValue4 & 14) | 3072, 6);
            return ygi.a;
        }
        bkp bkpVar4 = (bkp) obj;
        wkx wkxVar5 = (wkx) obj3;
        ((Number) obj5).intValue();
        wkxVar5.getClass();
        vvd vvdVar = wvb.d;
        wkxVar5.i(vvdVar);
        Object objK = wkxVar5.l.k((vub) vvdVar.c);
        if (objK == null) {
            objK = vvdVar.b;
        } else {
            vvdVar.c(objK);
        }
        objK.getClass();
        wvb wvbVar = (wvb) objK;
        kdj kdjVar = (kdj) obj4.f(jab.a);
        wmc wmcVar = wkxVar5.e;
        if (wmcVar == null) {
            wmcVar = wmc.a;
        }
        wmcVar.getClass();
        Integer numA = jab.a(wmcVar);
        kdjVar.d(numA != null ? numA.intValue() : 141948, bga.k(622256412, new jwy((kby) this.a, wvbVar, bkpVar4, 3), obj4), obj4, 48);
        return ygi.a;
    }
}
