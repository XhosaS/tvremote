package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyx extends oal {
    public final WeakReference a;
    public final int b;
    public final int c;
    public final int d;
    public final ofl e;
    public final aghb f;
    public final boolean g;
    public final StringBuilder h;
    public final String i;
    public final String j;
    public final WeakReference k;
    public final WeakReference l;
    public final obj m;
    public final ocj q;
    public final boolean r;
    public final int s;
    public final AtomicReference t;
    public final MaterializationResult u;
    public final boolean x;
    public final String y;
    public final BlockRegistryProvider z;
    public final String n = null;
    public final String o = null;
    public final boolean p = false;
    public final String v = null;
    public final String w = null;

    public nyx(WeakReference weakReference, int i, int i2, int i3, ofl oflVar, aghb aghbVar, boolean z, StringBuilder sb, String str, String str2, WeakReference weakReference2, WeakReference weakReference3, obj objVar, String str3, String str4, boolean z2, ocj ocjVar, boolean z3, int i4, AtomicReference atomicReference, MaterializationResult materializationResult, String str5, String str6, boolean z4, String str7, BlockRegistryProvider blockRegistryProvider) {
        this.a = weakReference;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = oflVar;
        this.f = aghbVar;
        this.g = z;
        this.h = sb;
        this.i = str;
        this.j = str2;
        this.k = weakReference2;
        this.l = weakReference3;
        this.m = objVar;
        this.q = ocjVar;
        this.r = z3;
        this.s = i4;
        this.t = atomicReference;
        this.u = materializationResult;
        this.x = z4;
        this.y = str7;
        this.z = blockRegistryProvider;
    }

    @Override // defpackage.oal
    public final int a() {
        return this.s;
    }

    @Override // defpackage.oal
    public final int b() {
        return this.c;
    }

    @Override // defpackage.oal
    public final int c() {
        return this.d;
    }

    @Override // defpackage.oal
    public final int d() {
        return this.b;
    }

    @Override // defpackage.oal
    public final BlockRegistryProvider e() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        ofl oflVar;
        aghb aghbVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        AtomicReference atomicReference;
        MaterializationResult materializationResult;
        if (obj == this) {
            return true;
        }
        if (obj instanceof oal) {
            oal oalVar = (oal) obj;
            WeakReference weakReference3 = this.a;
            if (weakReference3 != null ? weakReference3.equals(oalVar.s()) : oalVar.s() == null) {
                oalVar.N();
                oalVar.M();
                if (this.b == oalVar.d() && this.c == oalVar.b() && this.d == oalVar.c() && ((oflVar = this.e) != null ? oflVar.equals(oalVar.i()) : oalVar.i() == null) && ((aghbVar = this.f) != null ? aghbVar.equals(oalVar.j()) : oalVar.j() == null)) {
                    int iFloatToIntBits = Float.floatToIntBits(0.0f);
                    oalVar.G();
                    if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                        oalVar.F();
                        oalVar.E();
                        if (this.g == oalVar.z()) {
                            oalVar.L();
                            oalVar.I();
                            StringBuilder sb = this.h;
                            if (sb != null ? sb.equals(oalVar.r()) : oalVar.r() == null) {
                                if (this.i.equals(oalVar.m()) && this.j.equals(oalVar.n()) && ((weakReference = this.k) != null ? weakReference.equals(oalVar.t()) : oalVar.t() == null) && ((weakReference2 = this.l) != null ? weakReference2.equals(oalVar.u()) : oalVar.u() == null)) {
                                    oalVar.B();
                                    oalVar.C();
                                    oalVar.D();
                                    obj objVar = this.m;
                                    if (objVar != null ? objVar.equals(oalVar.f()) : oalVar.f() == null) {
                                        oalVar.l();
                                        oalVar.q();
                                        oalVar.y();
                                        ocj ocjVar = this.q;
                                        if (ocjVar != null ? ocjVar.equals(oalVar.g()) : oalVar.g() == null) {
                                            if (this.r == oalVar.w() && this.s == oalVar.a() && ((atomicReference = this.t) != null ? atomicReference.equals(oalVar.v()) : oalVar.v() == null) && ((materializationResult = this.u) != null ? materializationResult.equals(oalVar.h()) : oalVar.h() == null)) {
                                                oalVar.o();
                                                oalVar.p();
                                                if (this.x == oalVar.x()) {
                                                    oalVar.A();
                                                    String str = this.y;
                                                    if (str != null ? str.equals(oalVar.k()) : oalVar.k() == null) {
                                                        BlockRegistryProvider blockRegistryProvider = this.z;
                                                        if (blockRegistryProvider != null ? blockRegistryProvider.equals(oalVar.e()) : oalVar.e() == null) {
                                                            oalVar.H();
                                                            oalVar.K();
                                                            oalVar.J();
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.oal
    public final obj f() {
        return this.m;
    }

    @Override // defpackage.oal
    public final ocj g() {
        return this.q;
    }

    @Override // defpackage.oal
    public final MaterializationResult h() {
        return this.u;
    }

    public final int hashCode() {
        WeakReference weakReference = this.a;
        int iHashCode = ((((((weakReference == null ? 0 : weakReference.hashCode()) ^ 1000003) * 583896283) ^ this.b) * 1000003) ^ this.c) * 1000003;
        int i = this.d;
        ofl oflVar = this.e;
        int iHashCode2 = (((iHashCode ^ i) * 1000003) ^ (oflVar == null ? 0 : oflVar.hashCode())) * 1000003;
        aghb aghbVar = this.f;
        int iHashCode3 = ((((((iHashCode2 ^ (aghbVar == null ? 0 : aghbVar.hashCode())) * 1000003) ^ Float.floatToIntBits(0.0f)) * 583896283) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237;
        StringBuilder sb = this.h;
        int iHashCode4 = ((((((iHashCode3 * (-721379959)) ^ (sb == null ? 0 : sb.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        WeakReference weakReference2 = this.k;
        int iHashCode5 = (iHashCode4 ^ (weakReference2 == null ? 0 : weakReference2.hashCode())) * 1000003;
        WeakReference weakReference3 = this.l;
        int iHashCode6 = iHashCode5 ^ (weakReference3 == null ? 0 : weakReference3.hashCode());
        obj objVar = this.m;
        int iHashCode7 = ((((iHashCode6 * 1525764945) ^ (objVar == null ? 0 : objVar.hashCode())) * 583896283) ^ 1237) * 1000003;
        ocj ocjVar = this.q;
        int iHashCode8 = (((((iHashCode7 ^ (ocjVar == null ? 0 : ocjVar.hashCode())) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ this.s) * 1000003;
        AtomicReference atomicReference = this.t;
        int iHashCode9 = (iHashCode8 ^ (atomicReference == null ? 0 : atomicReference.hashCode())) * 1000003;
        MaterializationResult materializationResult = this.u;
        int iHashCode10 = (((iHashCode9 ^ (materializationResult == null ? 0 : materializationResult.hashCode())) * 583896283) ^ (true != this.x ? 1237 : 1231)) * (-721379959);
        String str = this.y;
        int iHashCode11 = (iHashCode10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        BlockRegistryProvider blockRegistryProvider = this.z;
        return (iHashCode11 ^ (blockRegistryProvider != null ? blockRegistryProvider.hashCode() : 0)) * 583896283;
    }

    @Override // defpackage.oal
    public final ofl i() {
        return this.e;
    }

    @Override // defpackage.oal
    public final aghb j() {
        return this.f;
    }

    @Override // defpackage.oal
    public final String k() {
        return this.y;
    }

    @Override // defpackage.oal
    public final String l() {
        return null;
    }

    @Override // defpackage.oal
    public final String m() {
        return this.i;
    }

    @Override // defpackage.oal
    public final String n() {
        return this.j;
    }

    @Override // defpackage.oal
    public final String o() {
        return null;
    }

    @Override // defpackage.oal
    public final String p() {
        return null;
    }

    @Override // defpackage.oal
    public final String q() {
        return null;
    }

    @Override // defpackage.oal
    protected final StringBuilder r() {
        return this.h;
    }

    @Override // defpackage.oal
    public final WeakReference s() {
        return this.a;
    }

    @Override // defpackage.oal
    protected final WeakReference t() {
        return this.k;
    }

    public final String toString() {
        BlockRegistryProvider blockRegistryProvider = this.z;
        MaterializationResult materializationResult = this.u;
        AtomicReference atomicReference = this.t;
        ocj ocjVar = this.q;
        obj objVar = this.m;
        WeakReference weakReference = this.l;
        WeakReference weakReference2 = this.k;
        StringBuilder sb = this.h;
        aghb aghbVar = this.f;
        ofl oflVar = this.e;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(oflVar);
        String strValueOf3 = String.valueOf(aghbVar);
        String strValueOf4 = String.valueOf(sb);
        String strValueOf5 = String.valueOf(weakReference2);
        String strValueOf6 = String.valueOf(weakReference);
        String strValueOf7 = String.valueOf(objVar);
        String strValueOf8 = String.valueOf(ocjVar);
        String strValueOf9 = String.valueOf(atomicReference);
        String strValueOf10 = String.valueOf(materializationResult);
        String strValueOf11 = String.valueOf(blockRegistryProvider);
        StringBuilder sb2 = new StringBuilder("ConversionContext{containerInternal=");
        sb2.append(strValueOf);
        sb2.append(", widthConstraint=null, heightConstraint=null, gridRowIndex=");
        sb2.append(this.b);
        sb2.append(", gridColumnCount=");
        sb2.append(this.c);
        sb2.append(", gridColumnIndex=");
        sb2.append(this.d);
        sb2.append(", templateLoggerFactory=");
        sb2.append(strValueOf2);
        sb2.append(", rootDisposableContainer=");
        sb2.append(strValueOf3);
        sb2.append(", imagePrefetchRangeRatio=0.0, horizontalCollectionTouchInterceptor=null, horizontalCollectionSwipeProtector=null, useIncrementalMountOnChildrenInternal=");
        sb2.append(this.g);
        sb2.append(", useLegacyVisibleInternal=false, recyclerBinderConfiguration=null, pathBuilder=");
        sb2.append(strValueOf4);
        sb2.append(", elementId=");
        sb2.append(this.i);
        sb2.append(", identifierProperty=");
        sb2.append(this.j);
        sb2.append(", loggingNodeInternal=");
        sb2.append(strValueOf5);
        sb2.append(", parentLoggingNodeInternal=");
        sb2.append(strValueOf6);
        sb2.append(", elementsInteractionLoggerInternal=null, globalCommandEventDataDecoratorsInternal=null, globalCommandEventWithViewDataDecoratorsInternal=null, decoratingElementBuilder=");
        sb2.append(strValueOf7);
        sb2.append(", debugId=null, treeDebugId=null, shouldAddDebuggerViewTags=false, elementsConfig=");
        sb2.append(strValueOf8);
        sb2.append(", couldOverlapWithElementsConfig=");
        sb2.append(this.r);
        String str = this.y;
        boolean z = this.x;
        int i = this.s;
        sb2.append(", elementDepthInTree=");
        sb2.append(i);
        sb2.append(", scrollStrategyListenerHolder=");
        sb2.append(strValueOf9);
        sb2.append(", materializationResult=");
        sb2.append(strValueOf10);
        sb2.append(", stylesheetId=null, themeKey=null, enableDroppedFrameLogging=");
        sb2.append(z);
        sb2.append(", clientDataObservableInternal=null, blockRegistryRef=");
        sb2.append(str);
        sb2.append(", blockRegistryProvider=");
        sb2.append(strValueOf11);
        sb2.append(", propagatedCommandEventData=null, renderNextServices=null, renderNextGroupScope=null}");
        return sb2.toString();
    }

    @Override // defpackage.oal
    public final WeakReference u() {
        return this.l;
    }

    @Override // defpackage.oal
    public final AtomicReference v() {
        return this.t;
    }

    @Override // defpackage.oal
    protected final boolean w() {
        return this.r;
    }

    @Override // defpackage.oal
    public final boolean x() {
        return this.x;
    }

    @Override // defpackage.oal
    public final boolean y() {
        return false;
    }

    @Override // defpackage.oal
    protected final boolean z() {
        return this.g;
    }

    @Override // defpackage.oal
    public final void A() {
    }

    @Override // defpackage.oal
    protected final void B() {
    }

    @Override // defpackage.oal
    protected final void C() {
    }

    @Override // defpackage.oal
    protected final void D() {
    }

    @Override // defpackage.oal
    public final void E() {
    }

    @Override // defpackage.oal
    public final void F() {
    }

    @Override // defpackage.oal
    public final void G() {
    }

    @Override // defpackage.oal
    public final void H() {
    }

    @Override // defpackage.oal
    @Deprecated
    public final void I() {
    }

    @Override // defpackage.oal
    public final void J() {
    }

    @Override // defpackage.oal
    public final void K() {
    }

    @Override // defpackage.oal
    public final void L() {
    }

    @Override // defpackage.oal
    public final void M() {
    }

    @Override // defpackage.oal
    public final void N() {
    }
}
