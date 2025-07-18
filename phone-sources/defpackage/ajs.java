package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.util.Log;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajs {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public ajs() {
        this.a = new dhd(null);
        this.b = new nxb();
        this.c = afv.a;
    }

    public static final cfx n(cfx cfxVar, cgz cgzVar) {
        int iE = cgzVar.e() - 1;
        int i = cfxVar.b;
        int iF = cgzVar.f(iE, false);
        if (i < iF) {
            return cfx.a(cfxVar, null, 0, Math.min(cfxVar.c, iF), 11);
        }
        return null;
    }

    public static final cgs o(cgs cgsVar) {
        if (cgsVar != null) {
            return cgsVar;
        }
        return null;
    }

    public static ajs u(Context context) {
        return new ajs(new cb(context));
    }

    private final int v() {
        Object obj = this.c;
        if (obj == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        nhl nhlVar = (nhl) obj;
        if (nhlVar.d()) {
            return !nhlVar.c() ? 11 : 0;
        }
        return 12;
    }

    private final int w() {
        return !((cb) this.b).d() ? v() : v() == 0 ? 0 : -1;
    }

    private final int x() {
        Object obj = this.a;
        if (obj != null) {
            return hp.a(abh$$ExternalSyntheticApiModelOutline0.m(obj));
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public final Bundle a(String str, Bundle bundle) {
        return bundle != null ? (Bundle) ((HashMap) this.a).put(str, bundle) : (Bundle) ((HashMap) this.a).remove(str);
    }

    public final bv b(String str) {
        nxo nxoVar = (nxo) ((HashMap) this.c).get(str);
        if (nxoVar != null) {
            return (bv) nxoVar.d;
        }
        return null;
    }

    public final bv c(String str) {
        bv bvVarFindFragmentByWho;
        for (nxo nxoVar : ((HashMap) this.c).values()) {
            if (nxoVar != null && (bvVarFindFragmentByWho = ((bv) nxoVar.d).findFragmentByWho(str)) != null) {
                return bvVarFindFragmentByWho;
            }
        }
        return null;
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        for (nxo nxoVar : ((HashMap) this.c).values()) {
            if (nxoVar != null) {
                arrayList.add(nxoVar);
            }
        }
        return arrayList;
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (nxo nxoVar : ((HashMap) this.c).values()) {
            if (nxoVar != null) {
                arrayList.add(nxoVar.d);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final List f() {
        ArrayList arrayList;
        ?? r0 = this.b;
        if (((ArrayList) r0).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (r0) {
            arrayList = new ArrayList((Collection) r0);
        }
        return arrayList;
    }

    public final void g(bv bvVar) {
        Object obj = this.b;
        if (((ArrayList) obj).contains(bvVar)) {
            Objects.toString(bvVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(bvVar)));
        }
        synchronized (obj) {
            ((ArrayList) obj).add(bvVar);
        }
        bvVar.mAdded = true;
    }

    public final void h() {
        ((HashMap) this.c).values().removeAll(Collections.singleton(null));
    }

    public final void i(bv bvVar) {
        Object obj = this.b;
        synchronized (obj) {
            ((ArrayList) obj).remove(bvVar);
        }
        bvVar.mAdded = false;
    }

    public final boolean j(String str) {
        return ((HashMap) this.c).get(str) != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final cgz k() {
        return (cgz) this.a.a();
    }

    public final void l(bao baoVar, int i) {
        int i2;
        int i3;
        int i4;
        char c;
        boolean z;
        int i5 = i & 6;
        bao baoVarD = baoVar.d(1154651354);
        int i6 = 4;
        char c2 = 2;
        boolean z2 = true;
        if (i5 == 0) {
            i2 = (true != baoVarD.H(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            Object obj = (ccf) baoVarD.f(ccq.l);
            cfy cfyVar = (cfy) this.d;
            List listE = cfyVar.e(cfyVar.a());
            int size = listE.size();
            int i7 = 0;
            while (i7 < size) {
                cfx cfxVar = (cfx) listE.get(i7);
                if (cfxVar.b != cfxVar.c) {
                    baoVarD.x(725478935);
                    bas basVar = (bas) baoVarD;
                    Object objT = basVar.T();
                    c = c2;
                    Object obj2 = ban.a;
                    z = z2;
                    if (objT == obj2) {
                        objT = new kw((byte[]) null, (byte[]) null);
                        basVar.ae(objT);
                    }
                    kw kwVar = (kw) objT;
                    int i8 = 6;
                    bkp bkpVarC = bny.c(bkp.g, new afk(this, cfxVar, i6));
                    Object objT2 = basVar.T();
                    i4 = i6;
                    if (objT2 == obj2) {
                        objT2 = new afh(5);
                        basVar.ae(objT2);
                    }
                    bkp bkpVarA = cfd.b(bkpVarC, false, (yjv) objT2).a(new agi(new atx(this, cfxVar))).a(new HoverableElement(kwVar)).a(new PointerHoverIconModifierElement(bsv.c));
                    boolean zH = baoVarD.H(this) | baoVarD.F(cfxVar) | baoVarD.H(obj);
                    Object objT3 = basVar.T();
                    int i9 = 3;
                    if (zH || objT3 == obj2) {
                        objT3 = new afi(cfxVar, i9);
                        basVar.ae(objT3);
                    }
                    i3 = i2;
                    xo.b(bkpVarA.a(new CombinedClickableElement(kwVar, false, (yjk) objT3, null)), baoVarD, 0);
                    cgf cgfVar = (cgf) cfxVar.a;
                    if (hq.n(cgfVar.a())) {
                        baoVarD.x(728331710);
                        basVar.aa();
                    } else {
                        baoVarD.x(726303039);
                        Object objT4 = basVar.T();
                        if (objT4 == obj2) {
                            objT4 = new bhi(kwVar);
                            basVar.ae(objT4);
                        }
                        bhi bhiVar = (bhi) objT4;
                        ygi ygiVar = ygi.a;
                        Object objT5 = basVar.T();
                        if (objT5 == obj2) {
                            objT5 = new qy(bhiVar, (yih) null, 16);
                            basVar.ae(objT5);
                        }
                        bbn.f(ygiVar, (yjz) objT5, baoVarD);
                        Object objValueOf = Boolean.valueOf(bhiVar.o());
                        Object objValueOf2 = Boolean.valueOf(bhiVar.n());
                        Object objValueOf3 = Boolean.valueOf(bhiVar.p());
                        cha chaVarA = cgfVar.a();
                        Object obj3 = chaVarA != null ? chaVarA.a : null;
                        cgfVar.a();
                        cgfVar.a();
                        cgfVar.a();
                        Object[] objArr = new Object[7];
                        objArr[0] = objValueOf;
                        objArr[z ? 1 : 0] = objValueOf2;
                        objArr[c] = objValueOf3;
                        objArr[3] = obj3;
                        byte[] bArr = null;
                        objArr[i4] = null;
                        objArr[5] = null;
                        objArr[6] = null;
                        boolean zH2 = baoVarD.H(this) | baoVarD.F(cfxVar);
                        Object objT6 = basVar.T();
                        if (zH2 || objT6 == obj2) {
                            objT6 = new afk(cfxVar, bhiVar, i8, bArr);
                            basVar.ae(objT6);
                        }
                        m(objArr, (yjv) objT6, baoVarD, (i3 << 6) & 896);
                        basVar.aa();
                    }
                    basVar.aa();
                } else {
                    i3 = i2;
                    i4 = i6;
                    c = c2;
                    z = z2;
                    baoVarD.x(728345598);
                    ((bas) baoVarD).aa();
                }
                i7++;
                c2 = c;
                z2 = z;
                i6 = i4;
                i2 = i3;
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(this, i, 6);
        }
    }

    public final void m(Object[] objArr, yjv yjvVar, bao baoVar, int i) {
        int i2 = i & 48;
        bao baoVarD = baoVar.d(-2083052099);
        int i3 = i2 == 0 ? (true != baoVarD.H(yjvVar) ? 16 : 32) | i : i;
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.H(this) ? 128 : 256;
        }
        baoVarD.v(-358305778, 7);
        int i4 = i3 | (true != baoVarD.D(7) ? 0 : 4);
        for (int i5 = 0; i5 < 7; i5++) {
            i4 |= true != baoVarD.H(objArr[i5]) ? 0 : 4;
        }
        bas basVar = (bas) baoVarD;
        basVar.aa();
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if (baoVarD.L((i4 & 147) != 146, i4 & 1)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(yjvVar);
            yks.g(objArr, arrayList);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = baoVarD.H(this) | ((i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new afk(this, yjvVar, 5);
                basVar.ae(objT);
            }
            bbn.d(array, (yjv) objT, baoVarD);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sv(this, objArr, yjvVar, i, 3);
        }
    }

    public final int p(int i) {
        BiometricPrompt.CryptoObject cryptoObjectB;
        q();
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.a;
            if (obj == null) {
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            int iA = hq.a(abh$$ExternalSyntheticApiModelOutline0.m(obj), i);
            if (iA == 21) {
                return 1;
            }
            return iA;
        }
        if (!hu.j(i)) {
            return -2;
        }
        cb cbVar = (cb) this.b;
        if (hu.m((Context) cbVar.a) == null) {
            return 12;
        }
        if (hu.i(i)) {
            return !cbVar.d() ? 11 : 0;
        }
        if (Build.VERSION.SDK_INT != 29) {
            if (Build.VERSION.SDK_INT != 28) {
                return v();
            }
            if (hv.f((Context) ((cb) this.b).a)) {
                return w();
            }
            return 12;
        }
        if (hu.k(i)) {
            return x();
        }
        Method methodC = hp.c();
        if (methodC != null && (cryptoObjectB = hw.b(hw.c())) != null) {
            try {
                Object objInvoke = Build.VERSION.SDK_INT == 29 ? methodC.invoke(this.a, cryptoObjectB) : null;
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int iX = x();
        return ((Build.VERSION.SDK_INT < 30 && ht.e((Context) ((cb) this.b).a, Build.MODEL, com.google.android.videos.R.array.assume_strong_biometrics_models)) || iX != 0) ? iX : w();
    }

    public final boolean q() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 != null) {
            return ((Boolean) obj2).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 35 || (obj = this.a) == null) {
            this.d = false;
        } else {
            try {
                hq.a(abh$$ExternalSyntheticApiModelOutline0.m(obj), 65536);
                this.d = true;
            } catch (SecurityException unused) {
                this.d = false;
            }
        }
        return ((Boolean) this.d).booleanValue();
    }

    public final nxo r(String str) {
        return (nxo) ((HashMap) this.c).get(str);
    }

    public final void s(nxo nxoVar) {
        Object obj = nxoVar.d;
        bv bvVar = (bv) obj;
        if (j(bvVar.mWho)) {
            return;
        }
        ((HashMap) this.c).put(bvVar.mWho, nxoVar);
        if (bvVar.mRetainInstanceChangedWhileDetached) {
            if (bvVar.mRetainInstance) {
                ((ct) this.d).a(bvVar);
            } else {
                ((ct) this.d).e(bvVar);
            }
            bvVar.mRetainInstanceChangedWhileDetached = false;
        }
        if (cr.Y(2)) {
            Objects.toString(obj);
        }
    }

    public final void t(nxo nxoVar) {
        Object obj = nxoVar.d;
        bv bvVar = (bv) obj;
        if (bvVar.mRetainInstance) {
            ((ct) this.d).e(bvVar);
        }
        HashMap map = (HashMap) this.c;
        if (map.get(bvVar.mWho) == nxoVar && ((nxo) map.put(bvVar.mWho, null)) != null && cr.Y(2)) {
            Objects.toString(obj);
        }
    }

    public ajs(char[] cArr) {
        this.b = new ArrayList();
        this.c = new HashMap();
        this.a = new HashMap();
    }

    public ajs(cb cbVar) {
        this.d = null;
        this.b = cbVar;
        this.a = Build.VERSION.SDK_INT >= 29 ? hp.b((Context) cbVar.a) : null;
        this.c = Build.VERSION.SDK_INT <= 29 ? new nhl(cbVar.a) : null;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public ajs(cfy cfyVar) {
        this.c = cfyVar;
        this.a = new bci(null, bcz.c);
        afh afhVar = new afh(4);
        cfw cfwVar = new cfw(cfyVar);
        List list = cfwVar.c;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ?? A = afhVar.a(((cfv) list.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList2 = new ArrayList(A.size());
            int size2 = A.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(ccf.V((cfx) A.get(i2)));
            }
            yfm.I(arrayList, arrayList2);
        }
        cfwVar.c.clear();
        cfwVar.c.addAll(arrayList);
        this.d = cfwVar.a();
        this.b = new bje();
    }

    public ajs(byte[] bArr) {
        this();
    }
}
