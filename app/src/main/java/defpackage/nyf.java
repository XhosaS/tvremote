package defpackage;

import android.content.Context;
import android.os.Trace;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.katniss.R;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyf extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Boolean a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogf b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    njs d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    njs f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    njs r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    odj s;

    @eau(a = eav.NONE)
    @eat(a = 0)
    float t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco u;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean v;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    int w;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    int x;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mrf y;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mrg z;

    public nyf() {
        super("GlideImage");
    }

    private final nye aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (nye) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        yrp yrpVar = nym.a;
        ImageView imageView = new ImageView(context);
        imageView.setTag(R.id.elements_image_ready, new AtomicBoolean(false));
        return imageView;
    }

    @Override // defpackage.drq
    protected final void C(duv duvVar, duv duvVar2) {
        nyd nydVar = (nyd) duvVar;
        nyd nydVar2 = (nyd) duvVar2;
        nydVar.a = nydVar2.a;
        nydVar.b = nydVar2.b;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        nye nyeVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        yrp yrpVar = nym.a;
        Context context = druVar.a;
        if (!nyp.b(context)) {
            dxzVar.a = cyg.c(context).b(context);
        }
        nyeVarAA.a = (czb) dxzVar.a;
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        dwz dwzVar = new dwz();
        dwz dwzVar2 = new dwz();
        njs njsVar = this.r;
        int i = this.w;
        oco ocoVar = this.u;
        njs njsVar2 = this.d;
        njs njsVar3 = this.f;
        mrg mrgVar = this.z;
        oal oalVar = this.c;
        yrp yrpVar = nym.a;
        dwzVar2.a = new dxt(dseVar.f(), dseVar.a());
        int iF = dseVar.f();
        int iA = dseVar.a();
        Context context = druVar.a;
        nyo nyoVarE = nyp.e(context, njsVar, njsVar2, njsVar3, mrgVar, iF, iA, false);
        if (nyoVarE != null) {
            dwzVar.a = nyoVarE;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            cyx cyxVar = ((nxw) nyoVarE).a;
            if (i2 == 1) {
                cyxVar.m((czc) nym.a.eV());
            }
            nfg nfgVarA = nym.a(njsVar);
            if (nfgVarA != null && nfgVarA.q()) {
                float fG = nfgVarA.k().g();
                if (fG > 0.01f) {
                    cyx cyxVar2 = (cyx) cyxVar.E(new nxx(context, oalVar, ocoVar, njsVar.m(), TypedValue.applyDimension(1, fG, context.getResources().getDisplayMetrics())));
                    int iM = njsVar.m() - 1;
                }
            }
        }
        nyd nydVar = (nyd) duvVar;
        nydVar.a = (nyo) dwzVar.a;
        nydVar.b = (dxt) dwzVar2.a;
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        float fH;
        njs njsVar = this.r;
        yrp yrpVar = nym.a;
        if (njsVar.g() == 0) {
            fH = 1.0f;
        } else {
            njw njwVarI = njsVar.i(0);
            fH = njwVarI.h() / njwVarI.g();
        }
        eew.b(i, i2, fH, dxtVar);
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        ImageView imageView = (ImageView) obj;
        njs njsVar = this.r;
        njs njsVar2 = this.d;
        njs njsVar3 = this.f;
        odj odjVar = this.s;
        Boolean bool = this.a;
        oal oalVar = this.c;
        ogf ogfVar = this.b;
        int i = this.x;
        nyd nydVar = (nyd) duvVar;
        nyo nyoVar = nydVar.a;
        dxt dxtVar = nydVar.b;
        oco ocoVar = this.u;
        mrf mrfVar = this.y;
        boolean z = this.e;
        boolean z2 = this.v;
        nyq nyqVar = (nyq) druVar.g(nyq.class);
        yrp yrpVar = nym.a;
        try {
            btt.b("GlideImageSpec.onMount|eml=" + oalVar.S("null"));
            int i2 = UnifiedTemplateResolver.a;
            if (nyoVar != null) {
                if (odjVar != null) {
                    imageView.hashCode();
                }
                cyx cyxVarA = nyoVar.a();
                nyk nykVar = new nyk(dxtVar, imageView, njsVar, z, odjVar, nyoVar.b(), njsVar2, njsVar3, ogfVar, ocoVar, mrfVar, i, oalVar, nyqVar);
                int iHashCode = imageView.hashCode();
                njw njwVarB = nyoVar.b();
                oalVar.P();
                cyxVarA.a(new nyl(iHashCode, njsVar, njwVarB, odjVar, nykVar, z));
                if (bool != null && bool.booleanValue()) {
                    acxb acxbVar = acxb.a;
                    acxa acxaVar = new acxa();
                    for (int i3 = 0; i3 < njsVar.g(); i3++) {
                        njw njwVarI = njsVar.i(i3);
                        acxd acxdVar = acxd.a;
                        acxc acxcVar = new acxc();
                        int iH = njwVarI.h();
                        if ((acxcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acxcVar.y();
                        }
                        acxd acxdVar2 = (acxd) acxcVar.b;
                        acxdVar2.b |= 1;
                        acxdVar2.e = iH;
                        int iG = njwVarI.g();
                        if ((acxcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acxcVar.y();
                        }
                        acxd acxdVar3 = (acxd) acxcVar.b;
                        acxdVar3.b |= 2;
                        acxdVar3.f = iG;
                        if (njwVarI.o()) {
                            String strK = njwVarI.k();
                            if ((acxcVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acxcVar.y();
                            }
                            acxd acxdVar4 = (acxd) acxcVar.b;
                            strK.getClass();
                            acxdVar4.c = 1;
                            acxdVar4.d = strK;
                        }
                        if ((acxaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acxaVar.y();
                        }
                        acxb acxbVar2 = (acxb) acxaVar.b;
                        acxd acxdVar5 = (acxd) acxcVar.v();
                        acxdVar5.getClass();
                        abxs abxsVar = acxbVar2.b;
                        if (!abxsVar.c()) {
                            int size = abxsVar.size();
                            acxbVar2.b = abxsVar.d(size + size);
                        }
                        acxbVar2.b.add(acxdVar5);
                    }
                    imageView.setTag(R.id.elements_image, (acxb) acxaVar.v());
                }
                cyxVarA.p(nykVar, cyxVarA, dqc.a);
            } else if (z2 && !nyp.b(druVar.a)) {
                acwg acwgVar = acwg.a;
                acvx acvxVar = new acvx();
                acsw acswVar = acsw.LOG_TYPE_MISSING_FIELD;
                if ((acvxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvxVar.y();
                }
                acwg acwgVar2 = (acwg) acvxVar.b;
                acwgVar2.c = acswVar.E;
                acwgVar2.b |= 2;
                acwb acwbVar = acwb.a;
                acwa acwaVar = new acwa();
                for (int i4 = 0; i4 < njsVar.g(); i4++) {
                    acwd acwdVar = acwd.a;
                    if ((acwaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acwaVar.y();
                    }
                    acwb acwbVar2 = (acwb) acwaVar.b;
                    acwdVar.getClass();
                    abxs abxsVar2 = acwbVar2.b;
                    if (!abxsVar2.c()) {
                        int size2 = abxsVar2.size();
                        acwbVar2.b = abxsVar2.d(size2 + size2);
                    }
                    acwbVar2.b.add(acwdVar);
                }
                acwb acwbVar3 = (acwb) acwaVar.v();
                if ((Integer.MIN_VALUE & acvxVar.b.memoizedSerializedSize) == 0) {
                    acvxVar.y();
                }
                acwg acwgVar3 = (acwg) acvxVar.b;
                acwbVar3.getClass();
                acwgVar3.g = acwbVar3;
                acwgVar3.b |= 128;
                ocoVar.c((acwg) acvxVar.v(), oalVar, "Failed to find a valid source for the image. Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data.", new Object[0]);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.drq
    protected final void M(dru druVar) {
        yrp yrpVar = nym.a;
        float f = this.t;
        if (f > 0.0f) {
            ogn ognVar = new ogn(f);
            druVar.i();
            dxo dxoVar = druVar.j;
            dxoVar.getClass();
            if (dxoVar.g == null) {
                dxoVar.g = new ArrayList();
            }
            dxoVar.g.add(new dzp(ognVar, dxoVar));
        }
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ((nye) dxxVar2).a = ((nye) dxxVar).a;
    }

    @Override // defpackage.drq
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean X() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean Y(dru druVar, dru druVar2) {
        return druVar.g(nyq.class) != null ? ((nyq) druVar.g(nyq.class)).equals(druVar2.g(nyq.class)) : druVar2.g(nyq.class) == null;
    }

    @Override // defpackage.drq
    protected final boolean ab() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean ag(drq drqVar, dxx dxxVar, drq drqVar2, dxx dxxVar2) {
        nyf nyfVar = (nyf) drqVar;
        nyf nyfVar2 = (nyf) drqVar2;
        dtd dtdVar = new dtd(nyfVar == null ? null : nyfVar.r, nyfVar2 == null ? null : nyfVar2.r);
        dtd dtdVar2 = new dtd(nyfVar == null ? null : nyfVar.d, nyfVar2 == null ? null : nyfVar2.d);
        dtd dtdVar3 = new dtd(nyfVar == null ? null : nyfVar.f, nyfVar2 != null ? nyfVar2.f : null);
        yrp yrpVar = nym.a;
        return (Objects.equals(dtdVar.b, dtdVar.a) && Objects.equals(dtdVar2.b, dtdVar2.a) && Objects.equals(dtdVar3.b, dtdVar3.a)) ? false : true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    public final void ai(duv duvVar) {
        nyd nydVar = (nyd) duvVar;
        nyo nyoVar = nydVar.a;
        dxt dxtVar = nydVar.b;
        njs njsVar = this.r;
        yrp yrpVar = nym.a;
        if (nyoVar == null || njsVar.g() == 0 || !njsVar.i(0).o()) {
            return;
        }
        String scheme = nyp.a(njsVar.i(0).k()).getScheme();
        if (("http".equals(scheme) || "https".equals(scheme)) && dxtVar.a > 0 && dxtVar.b > 0) {
            cyx cyxVar = (cyx) nyoVar.a().clone().s(dcr.c);
            cyxVar.p(new dpd(cyxVar.a, dxtVar.a, dxtVar.b), cyxVar, dqc.a);
        }
    }

    @Override // defpackage.drq
    public final void aj() {
        yrp yrpVar = nym.a;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        List list;
        nye nyeVarAA = aA(druVar);
        ImageView imageView = (ImageView) obj;
        odj odjVar = this.s;
        Boolean bool = this.a;
        ogf ogfVar = this.b;
        czb czbVar = nyeVarAA.a;
        yrp yrpVar = nym.a;
        if (odjVar != null) {
            imageView.hashCode();
        }
        if (czbVar != null) {
            czbVar.j(imageView);
        }
        if (bool != null && bool.booleanValue()) {
            imageView.setTag(R.id.elements_image, null);
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) imageView.getTag(R.id.elements_image_ready);
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        if (ogfVar != null) {
            ogfVar.b();
            FrameSequenceDrawable frameSequenceDrawable = ogfVar.b;
            if (frameSequenceDrawable != null) {
                frameSequenceDrawable.setOnFinishedListener(null);
            } else {
                dlz dlzVar = ogfVar.c;
                if (dlzVar != null && (list = dlzVar.d) != null) {
                    list.clear();
                }
            }
            ogfVar.b = null;
            ogfVar.c = null;
        }
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        nyf nyfVar = (nyf) drqVar;
        Boolean bool = this.a;
        if (bool == null ? nyfVar.a != null : !bool.equals(nyfVar.a)) {
            return false;
        }
        ogf ogfVar = this.b;
        if (ogfVar == null ? nyfVar.b != null : !ogfVar.equals(nyfVar.b)) {
            return false;
        }
        oal oalVar = this.c;
        if (oalVar == null ? nyfVar.c != null : !oalVar.equals(nyfVar.c)) {
            return false;
        }
        njs njsVar = this.d;
        if (njsVar == null ? nyfVar.d != null : !njsVar.equals(nyfVar.d)) {
            return false;
        }
        if (this.e != nyfVar.e) {
            return false;
        }
        njs njsVar2 = this.f;
        if (njsVar2 == null ? nyfVar.f != null : !njsVar2.equals(nyfVar.f)) {
            return false;
        }
        njs njsVar3 = this.r;
        if (njsVar3 == null ? nyfVar.r != null : !njsVar3.equals(nyfVar.r)) {
            return false;
        }
        odj odjVar = this.s;
        if (odjVar == null ? nyfVar.s != null : !odjVar.equals(nyfVar.s)) {
            return false;
        }
        if (Float.compare(this.t, nyfVar.t) != 0) {
            return false;
        }
        mrf mrfVar = this.y;
        if (mrfVar == null ? nyfVar.y != null : !mrfVar.equals(nyfVar.y)) {
            return false;
        }
        mrg mrgVar = this.z;
        if (mrgVar == null ? nyfVar.z != null : !mrgVar.equals(nyfVar.z)) {
            return false;
        }
        int i = this.w;
        if (i == 0 ? nyfVar.w != 0 : i != nyfVar.w) {
            return false;
        }
        oco ocoVar = this.u;
        if (ocoVar == null ? nyfVar.u != null : !ocoVar.equals(nyfVar.u)) {
            return false;
        }
        int i2 = this.x;
        if (i2 == 0 ? nyfVar.x == 0 : i2 == nyfVar.x) {
            return this.v == nyfVar.v;
        }
        return false;
    }

    @Override // defpackage.drq
    protected final int h() {
        return 30;
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (nyf) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ duv r() {
        return new nyd();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new nye();
    }
}
