package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.ban;
import defpackage.bao;
import defpackage.bas;
import defpackage.bbe;
import defpackage.bbl;
import defpackage.bbn;
import defpackage.bcb;
import defpackage.bci;
import defpackage.bcm;
import defpackage.bcp;
import defpackage.bcq;
import defpackage.bcr;
import defpackage.bcz;
import defpackage.bdz;
import defpackage.bga;
import defpackage.bie;
import defpackage.bif;
import defpackage.big;
import defpackage.bmf;
import defpackage.brs;
import defpackage.cbc;
import defpackage.cbq;
import defpackage.cbr;
import defpackage.cbs;
import defpackage.cbt;
import defpackage.ccf;
import defpackage.ccq;
import defpackage.ccr;
import defpackage.ccs;
import defpackage.cct;
import defpackage.ccu;
import defpackage.ccv;
import defpackage.cdj;
import defpackage.cf;
import defpackage.cne;
import defpackage.cvw;
import defpackage.cxe;
import defpackage.dhk;
import defpackage.dvk;
import defpackage.dxf;
import defpackage.ghc;
import defpackage.ghg;
import defpackage.lz;
import defpackage.ygi;
import defpackage.yjv;
import defpackage.yjz;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final bcp a = new bbl(bcz.c, bmf.h);
    public static final bcp b = new bdz(bmf.i);
    public static final bcp c = new bbe(ccu.b);
    public static final bcp d = new bdz(bmf.j);
    public static final bcp e = new bdz(bmf.k);
    public static final bcp f = new bdz(bmf.l);

    /* JADX WARN: Type inference failed for: r11v6, types: [ghe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [bdy, java.lang.Object] */
    public static final void a(cbc cbcVar, yjz yjzVar, bao baoVar, int i) {
        char c2;
        cvw cvwVar;
        LinkedHashMap linkedHashMap;
        boolean z;
        int i2 = i & 6;
        bao baoVarD = baoVar.d(-520299287);
        int i3 = i2 == 0 ? (true != baoVarD.H(cbcVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if (baoVarD.L((i3 & 19) != 18, i3 & 1)) {
            Context context = cbcVar.getContext();
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bci bciVar = new bci(new Configuration(context.getResources().getConfiguration()), bcz.c);
                basVar.ae(bciVar);
                objT = bciVar;
            }
            bcb bcbVar = (bcb) objT;
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new cbq(bcbVar, 0);
                basVar.ae(objT2);
            }
            cbcVar.t = (yjv) objT2;
            Object objT3 = basVar.T();
            if (objT3 == obj) {
                objT3 = new ccf();
                basVar.ae(objT3);
            }
            ccf ccfVar = (ccf) objT3;
            dhk dhkVarP = cbcVar.P();
            if (dhkVarP == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objT4 = basVar.T();
            int i4 = 3;
            if (objT4 == obj) {
                ?? r11 = dhkVarP.b;
                int i5 = ccv.a;
                Object parent = cbcVar.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = bie.class.getSimpleName() + ':' + strValueOf;
                ghc savedStateRegistry = r11.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                bif bifVar = new bif(linkedHashMap, ccu.a);
                try {
                    savedStateRegistry.b(str, new cf(bifVar, i4));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                objT4 = new ccs(bifVar, new cct(z, savedStateRegistry, str));
                basVar.ae(objT4);
            }
            ccs ccsVar = (ccs) objT4;
            ygi ygiVar = ygi.a;
            boolean zH = baoVarD.H(ccsVar);
            Object objT5 = basVar.T();
            if (zH || objT5 == ban.a) {
                objT5 = new cbq(ccsVar, 2);
                basVar.ae(objT5);
            }
            bbn.c(ygiVar, (yjv) objT5, baoVarD);
            Object objT6 = basVar.T();
            Object obj2 = ban.a;
            if (objT6 == obj2) {
                if (Build.VERSION.SDK_INT >= 31) {
                    c2 = 3;
                    if (((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) {
                        objT6 = new ccr(cbcVar, 0);
                    }
                    basVar.ae(objT6);
                } else {
                    c2 = 3;
                }
                objT6 = new cdj();
                basVar.ae(objT6);
            } else {
                c2 = 3;
            }
            brs brsVar = (brs) objT6;
            Configuration configurationC = c(bcbVar);
            Object objT7 = basVar.T();
            if (objT7 == obj2) {
                objT7 = new cvw((byte[]) null, (byte[]) null);
                basVar.ae(objT7);
            }
            cvw cvwVar2 = (cvw) objT7;
            Object objT8 = basVar.T();
            Object obj3 = objT8;
            if (objT8 == obj2) {
                Configuration configuration = new Configuration();
                if (configurationC != null) {
                    configuration.setTo(configurationC);
                }
                basVar.ae(configuration);
                obj3 = configuration;
            }
            Configuration configuration2 = (Configuration) obj3;
            Object objT9 = basVar.T();
            if (objT9 == obj2) {
                objT9 = new cbs(configuration2, cvwVar2);
                basVar.ae(objT9);
            }
            cbs cbsVar = (cbs) objT9;
            boolean zH2 = baoVarD.H(context);
            Object objT10 = basVar.T();
            if (zH2 || objT10 == obj2) {
                objT10 = new lz(context, cbsVar, 8);
                basVar.ae(objT10);
            }
            bbn.c(cvwVar2, (yjv) objT10, baoVarD);
            Object objT11 = basVar.T();
            if (objT11 == obj2) {
                objT11 = new cxe((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                basVar.ae(objT11);
            }
            cxe cxeVar = (cxe) objT11;
            Object objT12 = basVar.T();
            if (objT12 == obj2) {
                objT12 = new cbt(cxeVar);
                basVar.ae(objT12);
            }
            cbt cbtVar = (cbt) objT12;
            boolean zH3 = baoVarD.H(context);
            Object objT13 = basVar.T();
            if (zH3 || objT13 == obj2) {
                objT13 = new lz(context, cbtVar, 9);
                basVar.ae(objT13);
            }
            bbn.c(cxeVar, (yjv) objT13, baoVarD);
            bcp bcpVar = ccq.p;
            boolean zBooleanValue = ((Boolean) baoVarD.f(bcpVar)).booleanValue();
            boolean zBooleanValue2 = (Build.VERSION.SDK_INT < 31 || (cvwVar = cbcVar.W) == null) ? false : ((Boolean) cvwVar.a.a()).booleanValue();
            bcq[] bcqVarArr = new bcq[10];
            bcqVarArr[0] = a.c(c(bcbVar));
            bcqVarArr[1] = b.c(context);
            bcqVarArr[2] = dxf.a.c(dhkVarP.a);
            bcqVarArr[c2] = ghg.a.c(dhkVarP.b);
            bcqVarArr[4] = big.a.c(ccsVar);
            bcqVarArr[5] = f.c(cbcVar);
            bcqVarArr[6] = d.c(cvwVar2);
            bcqVarArr[7] = e.c(cxeVar);
            bcqVarArr[8] = bcpVar.c(Boolean.valueOf(zBooleanValue | zBooleanValue2));
            bcqVarArr[9] = ccq.g.c(brsVar);
            bcm.j(bcqVarArr, bga.k(1059770793, new cbr(cbcVar, ccfVar, yjzVar), baoVarD), baoVarD, 56);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new cne(cbcVar, yjzVar, i, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(a.cg(str, "CompositionLocal ", " not present"));
    }

    private static final Configuration c(bcb bcbVar) {
        return (Configuration) bcbVar.a();
    }

    public static final bcp<dvk> getLocalLifecycleOwner() {
        return dxf.a;
    }
}
