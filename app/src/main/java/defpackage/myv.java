package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myv extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public mrg A;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Boolean a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public oaa b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public oal c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public oap d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public obh e;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean f;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public oco s;

    @eau(a = eav.COLOR)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Integer t;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float u;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float v;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float w;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public Map x;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public nmt y;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public ofy z;

    public myv() {
        super("TextViewComponent");
        this.d = mzh.a;
    }

    private final myu aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (myu) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        int i = mzh.b;
        return new mxx(context);
    }

    @Override // defpackage.drq
    protected final void C(duv duvVar, duv duvVar2) {
        myt mytVar = (myt) duvVar;
        myt mytVar2 = (myt) duvVar2;
        mytVar.a = mytVar2.a;
        mytVar.b = mytVar2.b;
        mytVar.c = mytVar2.c;
        mytVar.d = mytVar2.d;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        myu myuVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        int i = mzh.b;
        dxzVar.a = new HashSet();
        myuVarAA.a = (Set) dxzVar.a;
    }

    @Override // defpackage.drq
    protected final void I(final dru druVar, dse dseVar, duv duvVar) throws abxv {
        myt mytVar;
        ndo ndoVarM;
        myt mytVar2;
        dwz dwzVar;
        dwz dwzVar2;
        dwz dwzVar3;
        CharSequence charSequence;
        myu myuVarAA = aA(druVar);
        dwz dwzVar4 = new dwz();
        dwz dwzVar5 = new dwz();
        nmt nmtVar = this.y;
        oaa oaaVar = this.b;
        ofy ofyVar = this.z;
        oco ocoVar = this.s;
        oal oalVar = this.c;
        Map map = this.x;
        obh obhVar = this.e;
        mrg mrgVar = this.A;
        boolean z = this.r;
        Set set = myuVarAA.a;
        myt mytVar3 = (myt) duvVar;
        eny enyVar = mytVar3.c;
        CharSequence charSequence2 = mytVar3.b;
        int i = mzh.b;
        if (enyVar == null || charSequence2 == null) {
            Context context = druVar.a;
            Resources resources = context.getResources();
            CharSequence charSequenceD = null;
            if (nmtVar.m()) {
                mytVar = mytVar3;
                ndoVarM = ogr.m(nmtVar.i(), oalVar, ocoVar, set);
            } else {
                mytVar = mytVar3;
                ndoVarM = null;
            }
            ndo ndoVar = ndoVarM;
            myt mytVar4 = mytVar;
            CharSequence charSequenceL = myf.l(oalVar, context, ndoVar, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z, new obg() { // from class: mzd
                @Override // defpackage.obg
                public final void a(int i2) {
                    int i3 = mzh.b;
                    mym.aA(druVar, i2);
                }
            }, set, 0);
            if (ndoVar == null || TextUtils.isEmpty(charSequenceL)) {
                mytVar2 = mytVar4;
                dwzVar = dwzVar4;
                dwzVar2 = dwzVar5;
                myt mytVar5 = mytVar2;
                mytVar5.d = (eny) dwzVar.a;
                mytVar5.a = (CharSequence) dwzVar2.a;
            }
            CharSequence charSequenceL2 = myf.l(oalVar, context, nmtVar.n() ? ogr.m(nmtVar.j(), oalVar, ocoVar, set) : null, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z, new obg() { // from class: mze
                @Override // defpackage.obg
                public final void a(int i2) {
                    int i3 = mzh.b;
                    mym.aA(druVar, i2);
                }
            }, set, 0);
            if (true == TextUtils.isEmpty(charSequenceL2)) {
                charSequenceL2 = "…";
            }
            int iH = nmtVar.l() ? nmtVar.h() : Integer.MAX_VALUE;
            int iF = (dseVar.f() - dseVar.c()) - dseVar.d();
            if (ndoVar.x() && ndoVar.C() == 2) {
                charSequenceL2 = "";
            }
            Layout.Alignment alignmentH = myf.h(ndoVar.u() ? ndoVar.E() : 6);
            TextPaint textPaintB = mzh.b(charSequenceL, resources, charSequenceL2);
            StaticLayout staticLayoutA = mzh.a(charSequenceL, textPaintB, iF, alignmentH, ndoVar);
            ndt ndtVarC = mzh.c(ndoVar);
            if (ndtVarC != null) {
                mytVar2 = mytVar4;
                dwzVar3 = dwzVar4;
                charSequence = charSequenceL;
                dwzVar2 = dwzVar5;
                charSequenceD = mzh.g(charSequenceL2, charSequence, ndoVar, iH, iF, alignmentH, staticLayoutA, textPaintB, druVar, oaaVar, ofyVar, ocoVar, oalVar, map, obhVar, mrgVar, z, set, ndtVarC);
            } else {
                mytVar2 = mytVar4;
                dwzVar3 = dwzVar4;
                CharSequence charSequence3 = charSequenceL2;
                dwzVar2 = dwzVar5;
                if (iH > 0 && staticLayoutA.getLineCount() > iH) {
                    charSequenceD = mzh.d(iH, staticLayoutA, charSequenceL, charSequence3, textPaintB, ndoVar, alignmentH);
                } else if (ndoVar.x() && staticLayoutA.getHeight() > dseVar.a()) {
                    charSequenceD = mzh.d((int) (dseVar.a() / (staticLayoutA.getHeight() / staticLayoutA.getLineCount())), staticLayoutA, charSequenceL, charSequence3, textPaintB, ndoVar, alignmentH);
                }
                charSequence = charSequenceL;
            }
            CharSequence charSequence4 = charSequenceD;
            if (charSequence4 != null) {
                dwzVar2.a = charSequence4;
            }
            if (TextUtils.isEmpty((CharSequence) dwzVar2.a)) {
                dwzVar2.a = charSequence;
            }
            dwzVar = dwzVar3;
        } else {
            dwzVar4.a = enyVar;
            dwzVar5.a = charSequence2;
            dwzVar = dwzVar4;
            dwzVar2 = dwzVar5;
            mytVar2 = mytVar3;
        }
        if (dwzVar.a == null) {
            dwzVar.a = dseVar.g();
        }
        myt mytVar52 = mytVar2;
        mytVar52.d = (eny) dwzVar.a;
        mytVar52.a = (CharSequence) dwzVar2.a;
    }

    @Override // defpackage.drq
    protected final void K(final dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        dwz dwzVar;
        dwz dwzVar2;
        dwz dwzVar3;
        Layout.Alignment alignment;
        oco ocoVar;
        obh obhVar;
        boolean z;
        boolean z2;
        StaticLayout staticLayout;
        dwz dwzVar4;
        CharSequence charSequence;
        int i3;
        CharSequence charSequenceD;
        TextPaint textPaint;
        StaticLayout staticLayoutBuild;
        myu myuVarAA = aA(druVar);
        dwz dwzVar5 = new dwz();
        dwz dwzVar6 = new dwz();
        nmt nmtVar = this.y;
        oaa oaaVar = this.b;
        ofy ofyVar = this.z;
        oco ocoVar2 = this.s;
        oal oalVar = this.c;
        Map map = this.x;
        obh obhVar2 = this.e;
        mrg mrgVar = this.A;
        boolean z3 = this.r;
        Set set = myuVarAA.a;
        int i4 = mzh.b;
        Context context = druVar.a;
        Resources resources = context.getResources();
        ndo ndoVarM = nmtVar.m() ? ogr.m(nmtVar.i(), oalVar, ocoVar2, set) : null;
        CharSequence charSequenceL = myf.l(oalVar, context, ndoVarM, oaaVar, ofyVar, ocoVar2, map, obhVar2, mrgVar, z3, new obg() { // from class: myw
            @Override // defpackage.obg
            public final void a(int i5) {
                int i6 = mzh.b;
                mym.aA(druVar, i5);
            }
        }, set, 0);
        if (ndoVarM == null || TextUtils.isEmpty(charSequenceL)) {
            dwzVar = dwzVar6;
            dxtVar.a = 0;
            dxtVar.b = 0;
        } else {
            CharSequence charSequenceL2 = myf.l(oalVar, context, nmtVar.n() ? ogr.m(nmtVar.j(), oalVar, ocoVar2, set) : null, oaaVar, ofyVar, ocoVar2, map, obhVar2, mrgVar, z3, new obg() { // from class: myx
                @Override // defpackage.obg
                public final void a(int i5) {
                    int i6 = mzh.b;
                    mym.aA(druVar, i5);
                }
            }, set, 0);
            if (true == TextUtils.isEmpty(charSequenceL2)) {
                charSequenceL2 = "…";
            }
            int iH = nmtVar.l() ? nmtVar.h() : Integer.MAX_VALUE;
            int size = View.MeasureSpec.getSize(i);
            Layout.Alignment alignmentH = myf.h(ndoVarM.u() ? ndoVarM.E() : 6);
            if (ndoVarM.x() && ndoVarM.C() == 2) {
                charSequenceL2 = "";
            }
            TextPaint textPaintB = mzh.b(charSequenceL, resources, charSequenceL2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                float desiredWidth = Layout.getDesiredWidth(charSequenceL, textPaintB);
                dwzVar2 = dwzVar5;
                if ((View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && desiredWidth < size) || (View.MeasureSpec.getMode(i) == 0 && desiredWidth > size)) {
                    size = (int) Math.ceil(desiredWidth);
                }
            } else {
                dwzVar2 = dwzVar5;
            }
            StaticLayout staticLayoutA = mzh.a(charSequenceL, textPaintB, size, alignmentH, ndoVarM);
            if (iH <= 0 || staticLayoutA.getLineCount() <= iH) {
                dwzVar3 = dwzVar6;
                alignment = alignmentH;
                ocoVar = ocoVar2;
                obhVar = obhVar2;
                z = z3;
                z2 = false;
            } else {
                dwzVar3 = dwzVar6;
                alignment = alignmentH;
                ocoVar = ocoVar2;
                obhVar = obhVar2;
                z = z3;
                z2 = true;
            }
            ndt ndtVarC = mzh.c(ndoVarM);
            if (ndtVarC != null) {
                int i5 = size;
                textPaint = textPaintB;
                dwzVar = dwzVar3;
                charSequence = charSequenceL;
                CharSequence charSequence2 = charSequenceL2;
                i3 = i5;
                dwzVar4 = dwzVar2;
                charSequenceD = mzh.g(charSequence2, charSequence, ndoVarM, iH, i3, alignment, staticLayoutA, textPaint, druVar, oaaVar, ofyVar, ocoVar, oalVar, map, obhVar, mrgVar, z, set, ndtVarC);
                staticLayout = staticLayoutA;
            } else {
                dwzVar = dwzVar3;
                int i6 = iH;
                staticLayout = staticLayoutA;
                dwzVar4 = dwzVar2;
                charSequence = charSequenceL;
                CharSequence charSequence3 = charSequenceL2;
                i3 = size;
                charSequenceD = z2 ? mzh.d(i6, staticLayout, charSequence, charSequence3, textPaintB, ndoVarM, alignment) : null;
                iH = i6;
                textPaint = textPaintB;
            }
            CharSequence charSequence4 = charSequenceD;
            if (charSequence4 != null) {
                staticLayoutBuild = mzh.a(charSequence4, textPaint, i3, alignment, ndoVarM);
                dwzVar.a = charSequence4;
            } else if (z2) {
                StaticLayout.Builder ellipsize = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i3).setMaxLines(iH).setEllipsize(ndoVarM.x() ? myf.i(ndoVarM.C()) : TextUtils.TruncateAt.END);
                mzh.e(ellipsize, ndoVarM, alignment);
                staticLayoutBuild = ellipsize.build();
            } else {
                staticLayoutBuild = staticLayout;
            }
            dxtVar.b = staticLayoutBuild.getHeight();
            dxtVar.a = staticLayoutBuild.getWidth();
            if (TextUtils.isEmpty((CharSequence) dwzVar.a)) {
                dwzVar.a = charSequence;
            }
            dwzVar5 = dwzVar4;
            dwzVar5.a = dseVar.g();
        }
        myt mytVar = (myt) duvVar;
        mytVar.c = (eny) dwzVar5.a;
        mytVar.b = (CharSequence) dwzVar.a;
    }

    @Override // defpackage.drq
    protected final void L(final dru druVar, Object obj, duv duvVar) {
        boolean z;
        myu myuVarAA = aA(druVar);
        mxx mxxVar = (mxx) obj;
        nmt nmtVar = this.y;
        oaa oaaVar = this.b;
        ofy ofyVar = this.z;
        oco ocoVar = this.s;
        oal oalVar = this.c;
        Map map = this.x;
        obh obhVar = this.e;
        mrg mrgVar = this.A;
        boolean z2 = this.r;
        float f = this.w;
        float f2 = this.u;
        float f3 = this.v;
        Integer num = this.t;
        boolean z3 = this.f;
        Boolean bool = this.a;
        myt mytVar = (myt) duvVar;
        eny enyVar = mytVar.d;
        CharSequence charSequence = mytVar.a;
        Set set = myuVarAA.a;
        int i = mzh.b;
        btt.b("TextViewComponentSpec.onMount ".concat(String.valueOf(oalVar != null ? oalVar.S("null") : "null")));
        Context context = druVar.a;
        Resources resources = context.getResources();
        if (charSequence == null || charSequence.length() <= 0) {
            CharSequence charSequenceL = myf.l(oalVar, context, nmtVar.m() ? ogr.m(nmtVar.i(), oalVar, ocoVar, set) : null, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z2, new obg() { // from class: myy
                @Override // defpackage.obg
                public final void a(int i2) {
                    int i3 = mzh.b;
                    mym.aA(druVar, i2);
                }
            }, set, 0);
            CharSequence charSequenceL2 = myf.l(oalVar, context, nmtVar.n() ? ogr.m(nmtVar.j(), oalVar, ocoVar, set) : null, oaaVar, ofyVar, ocoVar, map, obhVar, mrgVar, z2, new obg() { // from class: myz
                @Override // defpackage.obg
                public final void a(int i2) {
                    int i3 = mzh.b;
                    mym.aA(druVar, i2);
                }
            }, set, 0);
            if (true == TextUtils.isEmpty(charSequenceL2)) {
                charSequenceL2 = "…";
            }
            for (ImageSpan imageSpan : (ImageSpan[]) new SpannableString(charSequenceL).getSpans(0, charSequenceL.length(), ImageSpan.class)) {
                Drawable drawable = imageSpan.getDrawable();
                if (drawable != null) {
                    drawable.setCallback(new mzg(mxxVar, charSequenceL, charSequenceL2, nmtVar));
                }
            }
            mzh.f(resources, mxxVar, charSequenceL, nmtVar, f, f2, f3, num, z3, bool, enyVar);
            mxxVar.b(charSequenceL, charSequenceL2, nmtVar.h());
            z = false;
        } else {
            for (ImageSpan imageSpan2 : (ImageSpan[]) new SpannableString(charSequence).getSpans(0, charSequence.length(), ImageSpan.class)) {
                Drawable drawable2 = imageSpan2.getDrawable();
                if (drawable2 != null) {
                    drawable2.setCallback(new mzf(mxxVar, charSequence));
                }
            }
            mzh.f(resources, mxxVar, charSequence, nmtVar, f, f2, f3, num, z3, bool, enyVar);
            mxxVar.addOnLayoutChangeListener(new mxs(mxxVar, charSequence));
            z = false;
        }
        mxxVar.b = z;
        Trace.endSection();
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ((myu) dxxVar2).a = ((myu) dxxVar).a;
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
    protected final boolean ab() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        myv myvVar = (myv) drqVar;
        Boolean bool = this.a;
        if (bool == null ? myvVar.a != null : !bool.equals(myvVar.a)) {
            return false;
        }
        oaa oaaVar = this.b;
        if (oaaVar == null ? myvVar.b != null : !oaaVar.equals(myvVar.b)) {
            return false;
        }
        oal oalVar = this.c;
        if (oalVar == null ? myvVar.c != null : !oalVar.equals(myvVar.c)) {
            return false;
        }
        oap oapVar = this.d;
        if (oapVar == null ? myvVar.d != null : !oapVar.equals(myvVar.d)) {
            return false;
        }
        obh obhVar = this.e;
        if (obhVar == null ? myvVar.e != null : !obhVar.equals(myvVar.e)) {
            return false;
        }
        if (this.f != myvVar.f || this.r != myvVar.r) {
            return false;
        }
        mrg mrgVar = this.A;
        if (mrgVar == null ? myvVar.A != null : !mrgVar.equals(myvVar.A)) {
            return false;
        }
        oco ocoVar = this.s;
        if (ocoVar == null ? myvVar.s != null : !ocoVar.equals(myvVar.s)) {
            return false;
        }
        Integer num = this.t;
        if (num == null ? myvVar.t != null : !num.equals(myvVar.t)) {
            return false;
        }
        if (Float.compare(this.u, myvVar.u) != 0 || Float.compare(this.v, myvVar.v) != 0 || Float.compare(this.w, myvVar.w) != 0) {
            return false;
        }
        Map map = this.x;
        if (map == null ? myvVar.x != null : !map.equals(myvVar.x)) {
            return false;
        }
        nmt nmtVar = this.y;
        if (nmtVar == null ? myvVar.y != null : !nmtVar.equals(myvVar.y)) {
            return false;
        }
        ofy ofyVar = this.z;
        return ofyVar == null ? myvVar.z == null : ofyVar.equals(myvVar.z);
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (myv) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ duv r() {
        return new myt();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new myu();
    }
}
