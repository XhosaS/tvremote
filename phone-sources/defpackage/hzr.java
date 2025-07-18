package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzr {
    private static HashSet h;
    public final Canvas a;
    public final hxf b;
    public hzg c;
    public hzn d;
    public Stack e;
    public Stack f;
    public Stack g;

    protected hzr(Canvas canvas, hxf hxfVar) {
        this.a = canvas;
        this.b = hxfVar;
    }

    private final void A(hxm hxmVar, String str) {
        hyp hypVarA = hxmVar.t.a(str);
        if (hypVarA == null) {
            h("Gradient reference '%s' not found", str);
            return;
        }
        if (!(hypVarA instanceof hxm)) {
            e("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (hypVarA == hxmVar) {
            e("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        hxm hxmVar2 = (hxm) hypVarA;
        if (hxmVar.b == null) {
            hxmVar.b = hxmVar2.b;
        }
        if (hxmVar.c == null) {
            hxmVar.c = hxmVar2.c;
        }
        if (hxmVar.e == 0) {
            hxmVar.e = hxmVar2.e;
        }
        if (hxmVar.a.isEmpty()) {
            hxmVar.a = hxmVar2.a;
        }
        try {
            if (hxmVar instanceof hyo) {
                hyo hyoVar = (hyo) hxmVar;
                hyo hyoVar2 = (hyo) hypVarA;
                if (hyoVar.f == null) {
                    hyoVar.f = hyoVar2.f;
                }
                if (hyoVar.g == null) {
                    hyoVar.g = hyoVar2.g;
                }
                if (hyoVar.h == null) {
                    hyoVar.h = hyoVar2.h;
                }
                if (hyoVar.i == null) {
                    hyoVar.i = hyoVar2.i;
                }
            } else {
                hys hysVar = (hys) hxmVar;
                hys hysVar2 = (hys) hypVarA;
                if (hysVar.f == null) {
                    hysVar.f = hysVar2.f;
                }
                if (hysVar.g == null) {
                    hysVar.g = hysVar2.g;
                }
                if (hysVar.h == null) {
                    hysVar.h = hysVar2.h;
                }
                if (hysVar.i == null) {
                    hysVar.i = hysVar2.i;
                }
                if (hysVar.j == null) {
                    hysVar.j = hysVar2.j;
                }
            }
        } catch (ClassCastException unused) {
        }
        String str2 = hxmVar2.d;
        if (str2 != null) {
            A(hxmVar, str2);
        }
    }

    private final void B(hya hyaVar, String str) {
        hyp hypVarA = hyaVar.t.a(str);
        if (hypVarA == null) {
            h("Pattern reference '%s' not found", str);
            return;
        }
        if (!(hypVarA instanceof hya)) {
            e("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (hypVarA == hyaVar) {
            e("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        hya hyaVar2 = (hya) hypVarA;
        if (hyaVar.a == null) {
            hyaVar.a = hyaVar2.a;
        }
        if (hyaVar.b == null) {
            hyaVar.b = hyaVar2.b;
        }
        if (hyaVar.c == null) {
            hyaVar.c = hyaVar2.c;
        }
        if (hyaVar.d == null) {
            hyaVar.d = hyaVar2.d;
        }
        if (hyaVar.e == null) {
            hyaVar.e = hyaVar2.e;
        }
        if (hyaVar.f == null) {
            hyaVar.f = hyaVar2.f;
        }
        if (hyaVar.g == null) {
            hyaVar.g = hyaVar2.g;
        }
        if (hyaVar.i.isEmpty()) {
            hyaVar.i = hyaVar2.i;
        }
        if (hyaVar.w == null) {
            hyaVar.w = hyaVar2.w;
        }
        if (hyaVar.v == null) {
            hyaVar.v = hyaVar2.v;
        }
        String str2 = hyaVar2.h;
        if (str2 != null) {
            B(hyaVar, str2);
        }
    }

    private static synchronized void C() {
        HashSet hashSet = new HashSet();
        h = hashSet;
        hashSet.add("Structure");
        h.add("BasicStructure");
        h.add("ConditionalProcessing");
        h.add("Image");
        h.add("Style");
        h.add("ViewportAttribute");
        h.add("Shape");
        h.add("BasicText");
        h.add("PaintAttribute");
        h.add("BasicPaintAttribute");
        h.add("OpacityAttribute");
        h.add("BasicGraphicsAttribute");
        h.add("Marker");
        h.add("Gradient");
        h.add("Pattern");
        h.add("Clip");
        h.add("BasicClip");
        h.add("Mask");
        h.add("View");
    }

    private final void D() {
        this.f.pop();
        this.g.pop();
    }

    private final void E(hyl hylVar) {
        this.f.push(hylVar);
        this.g.push(this.a.getMatrix());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(hyp hypVar) {
        hxr hxrVar;
        hxr hxrVar2;
        hxr hxrVar3;
        String str;
        int iIndexOf;
        Set setG;
        hxr hxrVar4;
        if (hypVar instanceof hxv) {
            return;
        }
        M();
        d(hypVar);
        if (hypVar instanceof hyh) {
            hyh hyhVar = (hyh) hypVar;
            G(hyhVar, hyhVar.c, hyhVar.d);
        } else {
            if (hypVar instanceof hze) {
                hze hzeVar = (hze) hypVar;
                hxr hxrVar5 = hzeVar.e;
                if ((hxrVar5 == null || !hxrVar5.f()) && ((hxrVar4 = hzeVar.f) == null || !hxrVar4.f())) {
                    O(this.d, hzeVar);
                    if (Q()) {
                        hyp hypVarA = hzeVar.t.a(hzeVar.a);
                        if (hypVarA == null) {
                            e("Use reference '%s' not found", hzeVar.a);
                        } else {
                            Matrix matrix = hzeVar.b;
                            if (matrix != null) {
                                this.a.concat(matrix);
                            }
                            Matrix matrix2 = new Matrix();
                            hxr hxrVar6 = hzeVar.c;
                            float fC = hxrVar6 != null ? hxrVar6.c(this) : 0.0f;
                            hxr hxrVar7 = hzeVar.d;
                            matrix2.preTranslate(fC, hxrVar7 != null ? hxrVar7.d(this) : 0.0f);
                            Canvas canvas = this.a;
                            canvas.concat(matrix2);
                            s(hzeVar);
                            boolean zR = R();
                            E(hzeVar);
                            if (hypVarA instanceof hyh) {
                                M();
                                hyh hyhVar2 = (hyh) hypVarA;
                                hxr hxrVar8 = hzeVar.e;
                                if (hxrVar8 == null) {
                                    hxrVar8 = hyhVar2.c;
                                }
                                hxr hxrVar9 = hzeVar.f;
                                if (hxrVar9 == null) {
                                    hxrVar9 = hyhVar2.d;
                                }
                                G(hyhVar2, hxrVar8, hxrVar9);
                                L();
                            } else if (hypVarA instanceof hyv) {
                                hxr hxrVar10 = hzeVar.e;
                                if (hxrVar10 == null) {
                                    hxrVar10 = new hxr(100.0f, 9);
                                }
                                hxr hxrVar11 = hzeVar.f;
                                if (hxrVar11 == null) {
                                    hxrVar11 = new hxr(100.0f, 9);
                                }
                                M();
                                hyv hyvVar = (hyv) hypVarA;
                                if (!hxrVar10.f() && !hxrVar11.f()) {
                                    hxe hxeVar = hyvVar.v;
                                    if (hxeVar == null) {
                                        hxeVar = hxe.b;
                                    }
                                    O(this.d, hyvVar);
                                    float fC2 = hxrVar10.c(this);
                                    float fC3 = hxrVar11.c(this);
                                    hzn hznVar = this.d;
                                    hznVar.f = new hxf(0.0f, 0.0f, fC2, fC3);
                                    if (!hznVar.a.o.booleanValue()) {
                                        hxf hxfVar = this.d.f;
                                        K(hxfVar.a, hxfVar.b, hxfVar.c, hxfVar.d);
                                    }
                                    hxf hxfVar2 = hyvVar.w;
                                    if (hxfVar2 != null) {
                                        canvas.concat(U(this.d.f, hxfVar2, hxeVar));
                                        this.d.g = hyvVar.w;
                                    }
                                    boolean zR2 = R();
                                    H(hyvVar, true);
                                    if (zR2) {
                                        Z();
                                    }
                                    N(hyvVar);
                                }
                                L();
                            } else {
                                F(hypVarA);
                            }
                            D();
                            if (zR) {
                                Z();
                            }
                            N(hzeVar);
                        }
                    }
                }
            } else if (hypVar instanceof hyu) {
                hyu hyuVar = (hyu) hypVar;
                O(this.d, hyuVar);
                if (Q()) {
                    Matrix matrix3 = hyuVar.b;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    s(hyuVar);
                    boolean zR3 = R();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = hyuVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        hyp hypVar2 = (hyp) it.next();
                        if (hypVar2 instanceof hyi) {
                            hyi hyiVar = (hyi) hypVar2;
                            if (hyiVar.c() == null && ((setG = hyiVar.g()) == null || (!setG.isEmpty() && setG.contains(language)))) {
                                Set setD = hyiVar.d();
                                if (setD != null) {
                                    if (h == null) {
                                        C();
                                    }
                                    if (setD.isEmpty() || !h.containsAll(setD)) {
                                    }
                                }
                                Set setF = hyiVar.f();
                                if (setF == null) {
                                    Set setE = hyiVar.e();
                                    if (setE == null) {
                                        F(hypVar2);
                                        break;
                                    }
                                    setE.isEmpty();
                                } else {
                                    setF.isEmpty();
                                }
                            }
                        }
                    }
                    if (zR3) {
                        Z();
                    }
                    N(hyuVar);
                }
            } else if (hypVar instanceof hxo) {
                hxo hxoVar = (hxo) hypVar;
                O(this.d, hxoVar);
                if (Q()) {
                    Matrix matrix4 = hxoVar.b;
                    if (matrix4 != null) {
                        this.a.concat(matrix4);
                    }
                    s(hxoVar);
                    boolean zR4 = R();
                    H(hxoVar, true);
                    if (zR4) {
                        Z();
                    }
                    N(hxoVar);
                }
            } else if (hypVar instanceof hxq) {
                hxq hxqVar = (hxq) hypVar;
                hxr hxrVar12 = hxqVar.d;
                if (hxrVar12 != null && !hxrVar12.f() && (hxrVar3 = hxqVar.e) != null && !hxrVar3.f() && (str = hxqVar.a) != null) {
                    hxe hxeVar2 = hxqVar.v;
                    if (hxeVar2 == null) {
                        hxeVar2 = hxe.b;
                    }
                    Bitmap bitmapDecodeByteArray = null;
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) != -1 && iIndexOf >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    }
                    if (bitmapDecodeByteArray != null) {
                        O(this.d, hxqVar);
                        if (Q() && i()) {
                            Matrix matrix5 = hxqVar.f;
                            if (matrix5 != null) {
                                this.a.concat(matrix5);
                            }
                            hxr hxrVar13 = hxqVar.b;
                            float fC4 = hxrVar13 != null ? hxrVar13.c(this) : 0.0f;
                            hxr hxrVar14 = hxqVar.c;
                            float fD = hxrVar14 != null ? hxrVar14.d(this) : 0.0f;
                            float fC5 = hxqVar.d.c(this);
                            float fC6 = hxqVar.e.c(this);
                            hzn hznVar2 = this.d;
                            hznVar2.f = new hxf(fC4, fD, fC5, fC6);
                            if (!hznVar2.a.o.booleanValue()) {
                                hxf hxfVar3 = this.d.f;
                                K(hxfVar3.a, hxfVar3.b, hxfVar3.c, hxfVar3.d);
                            }
                            hxqVar.n = new hxf(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            Canvas canvas2 = this.a;
                            canvas2.concat(U(this.d.f, hxqVar.n, hxeVar2));
                            N(hxqVar);
                            s(hxqVar);
                            boolean zR5 = R();
                            P();
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint());
                            if (zR5) {
                                Z();
                            }
                        }
                    }
                }
            } else if (hypVar instanceof hxx) {
                hxx hxxVar = (hxx) hypVar;
                if (hxxVar.a != null) {
                    O(this.d, hxxVar);
                    if (Q() && i()) {
                        hzn hznVar3 = this.d;
                        if (hznVar3.c || hznVar3.b) {
                            Matrix matrix6 = hxxVar.e;
                            if (matrix6 != null) {
                                this.a.concat(matrix6);
                            }
                            Path path = new hzj(hxxVar.a).a;
                            if (hxxVar.n == null) {
                                hxxVar.n = T(path);
                            }
                            N(hxxVar);
                            u(hxxVar);
                            s(hxxVar);
                            boolean zR6 = R();
                            hzn hznVar4 = this.d;
                            if (hznVar4.b) {
                                int i = hznVar4.a.C;
                                Path.FillType fillType = (i != 0 && i + (-1) == 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
                                path.setFillType(fillType);
                                w(hxxVar, path);
                            }
                            if (this.d.c) {
                                x(path);
                            }
                            J(hxxVar);
                            if (zR6) {
                                Z();
                            }
                        }
                    }
                }
            } else if (hypVar instanceof hyd) {
                hyd hydVar = (hyd) hypVar;
                hxr hxrVar15 = hydVar.c;
                if (hxrVar15 != null && (hxrVar2 = hydVar.d) != null && !hxrVar15.f() && !hxrVar2.f()) {
                    O(this.d, hydVar);
                    if (Q() && i()) {
                        Matrix matrix7 = hydVar.e;
                        if (matrix7 != null) {
                            this.a.concat(matrix7);
                        }
                        Path pathO = o(hydVar);
                        N(hydVar);
                        u(hydVar);
                        s(hydVar);
                        boolean zR7 = R();
                        if (this.d.b) {
                            w(hydVar, pathO);
                        }
                        if (this.d.c) {
                            x(pathO);
                        }
                        if (zR7) {
                            Z();
                        }
                    }
                }
            } else if (hypVar instanceof hxg) {
                hxg hxgVar = (hxg) hypVar;
                hxr hxrVar16 = hxgVar.c;
                if (hxrVar16 != null && !hxrVar16.f()) {
                    O(this.d, hxgVar);
                    if (Q() && i()) {
                        Matrix matrix8 = hxgVar.e;
                        if (matrix8 != null) {
                            this.a.concat(matrix8);
                        }
                        Path pathL = l(hxgVar);
                        N(hxgVar);
                        u(hxgVar);
                        s(hxgVar);
                        boolean zR8 = R();
                        if (this.d.b) {
                            w(hxgVar, pathL);
                        }
                        if (this.d.c) {
                            x(pathL);
                        }
                        if (zR8) {
                            Z();
                        }
                    }
                }
            } else if (hypVar instanceof hxl) {
                hxl hxlVar = (hxl) hypVar;
                hxr hxrVar17 = hxlVar.c;
                if (hxrVar17 != null && (hxrVar = hxlVar.d) != null && !hxrVar17.f() && !hxrVar.f()) {
                    O(this.d, hxlVar);
                    if (Q() && i()) {
                        Matrix matrix9 = hxlVar.e;
                        if (matrix9 != null) {
                            this.a.concat(matrix9);
                        }
                        Path pathM = m(hxlVar);
                        N(hxlVar);
                        u(hxlVar);
                        s(hxlVar);
                        boolean zR9 = R();
                        if (this.d.b) {
                            w(hxlVar, pathM);
                        }
                        if (this.d.c) {
                            x(pathM);
                        }
                        if (zR9) {
                            Z();
                        }
                    }
                }
            } else if (hypVar instanceof hxs) {
                hxs hxsVar = (hxs) hypVar;
                O(this.d, hxsVar);
                if (Q() && i() && this.d.c) {
                    Matrix matrix10 = hxsVar.e;
                    if (matrix10 != null) {
                        this.a.concat(matrix10);
                    }
                    hxr hxrVar18 = hxsVar.a;
                    float fC7 = hxrVar18 == null ? 0.0f : hxrVar18.c(this);
                    hxr hxrVar19 = hxsVar.b;
                    float fD2 = hxrVar19 == null ? 0.0f : hxrVar19.d(this);
                    hxr hxrVar20 = hxsVar.c;
                    float fC8 = hxrVar20 == null ? 0.0f : hxrVar20.c(this);
                    hxr hxrVar21 = hxsVar.d;
                    fD = hxrVar21 != null ? hxrVar21.d(this) : 0.0f;
                    if (hxsVar.n == null) {
                        hxsVar.n = new hxf(Math.min(fC7, fD2), Math.min(fD2, fD), Math.abs(fC8 - fC7), Math.abs(fD - fD2));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fC7, fD2);
                    path2.lineTo(fC8, fD);
                    N(hxsVar);
                    u(hxsVar);
                    s(hxsVar);
                    boolean zR10 = R();
                    x(path2);
                    J(hxsVar);
                    if (zR10) {
                        Z();
                    }
                }
            } else if (hypVar instanceof hyc) {
                hyc hycVar = (hyc) hypVar;
                O(this.d, hycVar);
                if (Q() && i()) {
                    hzn hznVar5 = this.d;
                    if (hznVar5.c || hznVar5.b) {
                        Matrix matrix11 = hycVar.e;
                        if (matrix11 != null) {
                            this.a.concat(matrix11);
                        }
                        if (hycVar.a.length >= 2) {
                            Path pathN = n(hycVar);
                            N(hycVar);
                            u(hycVar);
                            s(hycVar);
                            boolean zR11 = R();
                            if (this.d.b) {
                                w(hycVar, pathN);
                            }
                            if (this.d.c) {
                                x(pathN);
                            }
                            J(hycVar);
                            if (zR11) {
                                Z();
                            }
                        }
                    }
                }
            } else if (hypVar instanceof hyb) {
                hyb hybVar = (hyb) hypVar;
                O(this.d, hybVar);
                if (Q() && i()) {
                    hzn hznVar6 = this.d;
                    if (hznVar6.c || hznVar6.b) {
                        Matrix matrix12 = hybVar.e;
                        if (matrix12 != null) {
                            this.a.concat(matrix12);
                        }
                        if (hybVar.a.length >= 2) {
                            Path pathN2 = n(hybVar);
                            N(hybVar);
                            u(hybVar);
                            s(hybVar);
                            boolean zR12 = R();
                            if (this.d.b) {
                                w(hybVar, pathN2);
                            }
                            if (this.d.c) {
                                x(pathN2);
                            }
                            J(hybVar);
                            if (zR12) {
                                Z();
                            }
                        }
                    }
                }
            } else if (hypVar instanceof hyy) {
                hyy hyyVar = (hyy) hypVar;
                O(this.d, hyyVar);
                if (Q()) {
                    Matrix matrix13 = hyyVar.a;
                    if (matrix13 != null) {
                        this.a.concat(matrix13);
                    }
                    List list = hyyVar.b;
                    float fC9 = (list == null || list.size() == 0) ? 0.0f : ((hxr) hyyVar.b.get(0)).c(this);
                    List list2 = hyyVar.c;
                    float fD3 = (list2 == null || list2.size() == 0) ? 0.0f : ((hxr) hyyVar.c.get(0)).d(this);
                    List list3 = hyyVar.d;
                    float fC10 = (list3 == null || list3.size() == 0) ? 0.0f : ((hxr) hyyVar.d.get(0)).c(this);
                    List list4 = hyyVar.e;
                    if (list4 != null && list4.size() != 0) {
                        fD = ((hxr) hyyVar.e.get(0)).d(this);
                    }
                    int iS = S();
                    if (iS != 1) {
                        float fJ = j(hyyVar);
                        if (iS == 2) {
                            fJ /= 2.0f;
                        }
                        fC9 -= fJ;
                    }
                    if (hyyVar.n == null) {
                        hzo hzoVar = new hzo(this, fC9, fD3);
                        y(hyyVar, hzoVar);
                        RectF rectF = hzoVar.c;
                        hyyVar.n = new hxf(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    N(hyyVar);
                    u(hyyVar);
                    s(hyyVar);
                    boolean zR13 = R();
                    y(hyyVar, new hzl(this, fC9 + fC10, fD3 + fD));
                    if (zR13) {
                        Z();
                    }
                }
            }
        }
        L();
    }

    private final void G(hyh hyhVar, hxr hxrVar, hxr hxrVar2) {
        f(hyhVar, hxrVar, hxrVar2, hyhVar.w, hyhVar.v);
    }

    private final void H(hyl hylVar, boolean z) {
        if (z) {
            E(hylVar);
        }
        Iterator it = hylVar.n().iterator();
        while (it.hasNext()) {
            F((hyp) it.next());
        }
        if (z) {
            D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6 A[PHI: r1
  0x00f6: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:61:0x00eb, B:65:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I(defpackage.hxt r13, defpackage.hzi r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzr.I(hxt, hzi):void");
    }

    private final void J(hxn hxnVar) {
        hxt hxtVar;
        hxt hxtVar2;
        hxt hxtVar3;
        List arrayList;
        int size;
        hyg hygVar = this.d.a;
        String str = hygVar.p;
        if (str == null && hygVar.q == null && hygVar.r == null) {
            return;
        }
        if (str == null) {
            hxtVar = null;
        } else {
            hyp hypVarA = hxnVar.t.a(str);
            if (hypVarA != null) {
                hxtVar = (hxt) hypVarA;
            } else {
                e("Marker reference '%s' not found", this.d.a.p);
                hxtVar = null;
            }
        }
        String str2 = this.d.a.q;
        if (str2 == null) {
            hxtVar2 = null;
        } else {
            hyp hypVarA2 = hxnVar.t.a(str2);
            if (hypVarA2 != null) {
                hxtVar2 = (hxt) hypVarA2;
            } else {
                e("Marker reference '%s' not found", this.d.a.q);
                hxtVar2 = null;
            }
        }
        String str3 = this.d.a.r;
        if (str3 == null) {
            hxtVar3 = null;
        } else {
            hyp hypVarA3 = hxnVar.t.a(str3);
            if (hypVarA3 != null) {
                hxtVar3 = (hxt) hypVarA3;
            } else {
                e("Marker reference '%s' not found", this.d.a.r);
                hxtVar3 = null;
            }
        }
        if (hxnVar instanceof hxx) {
            arrayList = new hzh(((hxx) hxnVar).a).a;
        } else {
            int i = 2;
            if (hxnVar instanceof hxs) {
                hxs hxsVar = (hxs) hxnVar;
                hxr hxrVar = hxsVar.a;
                float fC = hxrVar != null ? hxrVar.c(this) : 0.0f;
                hxr hxrVar2 = hxsVar.b;
                float fD = hxrVar2 != null ? hxrVar2.d(this) : 0.0f;
                hxr hxrVar3 = hxsVar.c;
                float fC2 = hxrVar3 != null ? hxrVar3.c(this) : 0.0f;
                hxr hxrVar4 = hxsVar.d;
                fD = hxrVar4 != null ? hxrVar4.d(this) : 0.0f;
                arrayList = new ArrayList(2);
                float f = fC2 - fC;
                float f2 = fD - fD;
                arrayList.add(new hzi(fC, fD, f, f2));
                arrayList.add(new hzi(fC2, fD, f, f2));
            } else {
                hyb hybVar = (hyb) hxnVar;
                int length = hybVar.a.length;
                if (length < 2) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    float[] fArr = hybVar.a;
                    hzi hziVar = new hzi(fArr[0], fArr[1], 0.0f, 0.0f);
                    float f3 = 0.0f;
                    while (i < length) {
                        float[] fArr2 = hybVar.a;
                        float f4 = fArr2[i];
                        float f5 = fArr2[i + 1];
                        hziVar.b(f4, f5);
                        arrayList2.add(hziVar);
                        hzi hziVar2 = new hzi(f4, f5, f4 - hziVar.a, f5 - hziVar.b);
                        i += 2;
                        f3 = f5;
                        fD = f4;
                        hziVar = hziVar2;
                    }
                    if (hybVar instanceof hyc) {
                        float[] fArr3 = hybVar.a;
                        float f6 = fArr3[0];
                        if (fD != f6) {
                            float f7 = fArr3[1];
                            if (f3 != f7) {
                                hziVar.b(f6, f7);
                                arrayList2.add(hziVar);
                                hzi hziVar3 = new hzi(f6, f7, f6 - hziVar.a, f7 - hziVar.b);
                                hziVar3.a((hzi) arrayList2.get(0));
                                arrayList2.add(hziVar3);
                                arrayList2.set(0, hziVar3);
                            }
                        }
                    } else {
                        arrayList2.add(hziVar);
                    }
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        hyg hygVar2 = this.d.a;
        hygVar2.r = null;
        hygVar2.q = null;
        hygVar2.p = null;
        if (hxtVar != null) {
            I(hxtVar, (hzi) arrayList.get(0));
        }
        if (hxtVar2 != null) {
            int i2 = size - 1;
            for (int i3 = 1; i3 < i2; i3++) {
                I(hxtVar2, (hzi) arrayList.get(i3));
            }
        }
        if (hxtVar3 != null) {
            I(hxtVar3, (hzi) arrayList.get(size - 1));
        }
    }

    private final void K(float f, float f2, float f3, float f4) {
        iom iomVar = this.d.a.L;
        float fD = f4 + f2;
        float fC = f3 + f;
        if (iomVar != null) {
            f += ((hxr) iomVar.d).c(this);
            f2 += ((hxr) this.d.a.L.a).d(this);
            fC -= ((hxr) this.d.a.L.c).c(this);
            fD -= ((hxr) this.d.a.L.b).d(this);
        }
        this.a.clipRect(f, f2, fC, fD);
    }

    private final void L() {
        this.a.restore();
        this.d = (hzn) this.e.pop();
    }

    private final void M() {
        this.a.save();
        this.e.push(this.d);
        this.d = (hzn) this.d.clone();
    }

    private final void N(hym hymVar) {
        if (hymVar.u == null || hymVar.n == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.g.peek()).invert(matrix)) {
            hxf hxfVar = hymVar.n;
            float f = hxfVar.a;
            float f2 = hxfVar.b;
            float fA = hxfVar.a();
            hxf hxfVar2 = hymVar.n;
            float f3 = hxfVar2.b;
            float fA2 = hxfVar2.a();
            float fB = hymVar.n.b();
            hxf hxfVar3 = hymVar.n;
            float[] fArr = {f, f2, fA, f3, fA2, fB, hxfVar3.a, hxfVar3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                if (fArr[i] < rectF.left) {
                    rectF.left = fArr[i];
                }
                if (fArr[i] > rectF.right) {
                    rectF.right = fArr[i];
                }
                int i2 = i + 1;
                if (fArr[i2] < rectF.top) {
                    rectF.top = fArr[i2];
                }
                if (fArr[i2] > rectF.bottom) {
                    rectF.bottom = fArr[i2];
                }
            }
            hym hymVar2 = (hym) this.f.peek();
            hxf hxfVar4 = hymVar2.n;
            if (hxfVar4 == null) {
                hymVar2.n = hxf.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            hxf hxfVarC = hxf.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
            float f6 = hxfVarC.a;
            float f7 = hxfVar4.a;
            if (f6 < f7) {
                hxfVar4.a = f6;
            } else {
                f6 = f7;
            }
            float f8 = hxfVarC.b;
            float f9 = hxfVar4.b;
            if (f8 < f9) {
                hxfVar4.b = f8;
            } else {
                f8 = f9;
            }
            if (hxfVarC.a() > hxfVar4.a()) {
                hxfVar4.c = hxfVarC.a() - f6;
            }
            if (hxfVarC.b() > hxfVar4.b()) {
                hxfVar4.d = hxfVarC.b() - f8;
            }
        }
    }

    private final void O(hzn hznVar, hyn hynVar) {
        hyl hylVar = hynVar.u;
        hyg hygVar = hznVar.a;
        hygVar.s = Boolean.TRUE;
        hygVar.o = hylVar == null ? Boolean.TRUE : Boolean.FALSE;
        hygVar.L = null;
        hygVar.w = null;
        Float fValueOf = Float.valueOf(1.0f);
        hygVar.j = fValueOf;
        hygVar.u = hxi.a;
        hygVar.v = fValueOf;
        hygVar.x = null;
        hygVar.y = null;
        hygVar.z = fValueOf;
        hygVar.A = null;
        hygVar.B = fValueOf;
        hygVar.K = 1;
        hyg hygVar2 = hynVar.q;
        if (hygVar2 != null) {
            g(hznVar, hygVar2);
        }
        List list = this.c.c.a;
        if (list != null && !list.isEmpty()) {
            for (hwy hwyVar : this.c.c.a) {
                hxa hxaVar = hwyVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj = hynVar.u; obj != null; obj = ((hyp) obj).u) {
                    arrayList.add(0, obj);
                }
                int size = arrayList.size() - 1;
                if (hxaVar.a() == 1 ? rin.e(hxaVar.b(0), arrayList, size, hynVar) : rin.d(hxaVar, hxaVar.a() - 1, arrayList, size, hynVar)) {
                    g(hznVar, hwyVar.b);
                }
            }
        }
        hyg hygVar3 = hynVar.r;
        if (hygVar3 != null) {
            g(hznVar, hygVar3);
        }
    }

    private final void P() {
        int iW;
        hyg hygVar = this.d.a;
        hyq hyqVar = hygVar.A;
        if (hyqVar instanceof hxi) {
            iW = ((hxi) hyqVar).b;
        } else if (!(hyqVar instanceof hxj)) {
            return;
        } else {
            iW = hygVar.k.b;
        }
        Float f = hygVar.B;
        if (f != null) {
            iW |= W(f.floatValue()) << 24;
        }
        this.a.drawColor(iW);
    }

    private final boolean Q() {
        Boolean bool = this.d.a.s;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean R() {
        hzn hznVar = this.d;
        if (hznVar.a.x != null) {
            boolean z = hznVar.i;
            h("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (this.d.a.j.floatValue() >= 1.0f) {
            hzn hznVar2 = this.d;
            if (hznVar2.a.x != null) {
                boolean z2 = hznVar2.i;
            }
            return false;
        }
        this.a.saveLayerAlpha(null, W(this.d.a.j.floatValue()), 31);
        this.e.push(this.d);
        hzn hznVar3 = (hzn) this.d.clone();
        this.d = hznVar3;
        if (hznVar3.a.x == null) {
            return true;
        }
        boolean z3 = hznVar3.i;
        return true;
    }

    private final int S() {
        int i;
        hyg hygVar = this.d.a;
        return (hygVar.H == 1 || (i = hygVar.I) == 2) ? hygVar.I : i == 1 ? 3 : 1;
    }

    private static final hxf T(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new hxf(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r7 != 9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.graphics.Matrix U(defpackage.hxf r9, defpackage.hxf r10, defpackage.hxe r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            hxd r1 = r11.c
            if (r1 != 0) goto La
            return r0
        La:
            float r2 = r9.c
            float r3 = r10.c
            float r2 = r2 / r3
            float r3 = r9.d
            float r4 = r10.d
            float r3 = r3 / r4
            float r4 = r10.a
            float r4 = -r4
            float r5 = r10.b
            float r5 = -r5
            hxe r6 = defpackage.hxe.a
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L78
            int r11 = r11.d
            r6 = 2
            if (r11 != r6) goto L2c
            float r11 = java.lang.Math.max(r2, r3)
            goto L30
        L2c:
            float r11 = java.lang.Math.min(r2, r3)
        L30:
            float r2 = r9.c
            float r2 = r2 / r11
            float r3 = r9.d
            float r3 = r3 / r11
            int r7 = r1.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L54
            r6 = 3
            if (r7 == r6) goto L50
            r6 = 5
            if (r7 == r6) goto L54
            r6 = 6
            if (r7 == r6) goto L50
            r6 = 8
            if (r7 == r6) goto L54
            r6 = 9
            if (r7 == r6) goto L50
            goto L59
        L50:
            float r6 = r10.c
            float r6 = r6 - r2
            goto L58
        L54:
            float r6 = r10.c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L58:
            float r4 = r4 - r6
        L59:
            int r1 = r1.ordinal()
            switch(r1) {
                case 4: goto L65;
                case 5: goto L65;
                case 6: goto L65;
                case 7: goto L61;
                case 8: goto L61;
                case 9: goto L61;
                default: goto L60;
            }
        L60:
            goto L6a
        L61:
            float r10 = r10.d
            float r10 = r10 - r3
            goto L69
        L65:
            float r10 = r10.d
            float r10 = r10 - r3
            float r10 = r10 / r8
        L69:
            float r5 = r5 - r10
        L6a:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
            return r0
        L78:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzr.U(hxf, hxf, hxe):android.graphics.Matrix");
    }

    private static final Typeface V(String str, Integer num, int i) {
        int i2 = 2;
        if (num.intValue() > 500) {
            i2 = i == 2 ? 3 : 1;
        } else if (i != 2) {
            i2 = 0;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i2);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i2);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("fantasy")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        return null;
    }

    private static final int W(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    private final void X(hyp hypVar, hzn hznVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (hypVar instanceof hyn) {
                arrayList.add(0, (hyn) hypVar);
            }
            Object obj = hypVar.u;
            if (obj == null) {
                break;
            } else {
                hypVar = (hyp) obj;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            O(hznVar, (hyn) arrayList.get(i));
        }
        hznVar.g = this.c.a.w;
        if (hznVar.g == null) {
            hznVar.g = this.b;
        }
        hznVar.f = this.b;
        boolean z = this.d.i;
        hznVar.i = false;
    }

    private static final boolean Y(hyg hygVar, long j) {
        return (j & hygVar.a) != 0;
    }

    private final void Z() {
        hzn hznVar = this.d;
        if (hznVar.a.x != null) {
            boolean z = hznVar.i;
        }
        L();
    }

    private static final void aa(hzn hznVar, boolean z, hyq hyqVar) {
        int i;
        hyg hygVar = hznVar.a;
        boolean z2 = hyqVar instanceof hxi;
        float fFloatValue = (z ? hygVar.c : hygVar.e).floatValue();
        if (z2) {
            i = ((hxi) hyqVar).b;
        } else if (!(hyqVar instanceof hxj)) {
            return;
        } else {
            i = hznVar.a.k.b;
        }
        int iW = i | (W(fFloatValue) << 24);
        if (z) {
            hznVar.d.setColor(iW);
        } else {
            hznVar.e.setColor(iW);
        }
    }

    public static void c(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, hxz hxzVar) {
        float f8;
        float f9;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            hxzVar.e(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = (float) Math.toRadians(f5 % 360.0d);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f10 = fAbs * fAbs;
        float f11 = fAbs2 * fAbs2;
        float f12 = (f - f6) / 2.0f;
        float f13 = (f2 - f7) / 2.0f;
        float f14 = ((-fSin) * f12) + (fCos * f13);
        float f15 = f14 * f14;
        float f16 = (f12 * fCos) + (f13 * fSin);
        float f17 = f16 * f16;
        float f18 = (f17 / f10) + (f15 / f11);
        if (f18 > 1.0f) {
            double d = f18;
            f8 = 2.0f;
            f9 = f15;
            fAbs *= (float) Math.sqrt(d);
            fAbs2 *= (float) Math.sqrt(d);
            f11 = fAbs2 * fAbs2;
            f10 = fAbs * fAbs;
        } else {
            f8 = 2.0f;
            f9 = f15;
        }
        float f19 = z == z2 ? -1.0f : 1.0f;
        float f20 = f10 * f9;
        float f21 = f17 * f11;
        float f22 = (((f10 * f11) - f20) - f21) / (f20 + f21);
        if (f22 < 0.0f) {
            f22 = 0.0f;
        }
        float f23 = (f + f6) / f8;
        float f24 = (f2 + f7) / f8;
        float fSqrt = (float) (f19 * Math.sqrt(f22));
        float f25 = ((fAbs * f14) / fAbs2) * fSqrt;
        float f26 = fCos * f25;
        float f27 = fSqrt * (-((fAbs2 * f16) / fAbs));
        float f28 = fSin * f27;
        float f29 = fSin * f25;
        float f30 = fCos * f27;
        float f31 = f16 - f25;
        float f32 = f14 - f27;
        float f33 = -f16;
        float f34 = -f14;
        float f35 = f31 / fAbs;
        float f36 = f32 / fAbs2;
        float f37 = (f35 * f35) + (f36 * f36);
        float degrees = (float) Math.toDegrees((f36 < 0.0f ? -1.0f : 1.0f) * Math.acos(f35 / ((float) Math.sqrt(f37))));
        float f38 = (f33 - f25) / fAbs;
        float f39 = (f34 - f27) / fAbs2;
        float fSqrt2 = (float) Math.sqrt(f37 * ((f38 * f38) + (f39 * f39)));
        float degrees2 = (float) Math.toDegrees(((f35 * f39) - (f36 * f38) < 0.0f ? -1.0f : 1.0f) * Math.acos(((f35 * f38) + (f36 * f39)) / fSqrt2));
        if (z2) {
            if (degrees2 < 0.0f) {
                degrees2 += 360.0f;
            }
        } else if (degrees2 > 0.0f) {
            degrees2 -= 360.0f;
        }
        double d2 = degrees2 % 360.0f;
        int iCeil = (int) Math.ceil(Math.abs(d2) / 90.0d);
        double radians2 = Math.toRadians(degrees % 360.0f);
        double radians3 = (float) (Math.toRadians(d2) / iCeil);
        double d3 = radians3 / 2.0d;
        double dSin = Math.sin(d3) * 1.3333333333333333d;
        double dCos = Math.cos(d3) + 1.0d;
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d4 = dSin / dCos;
            int i4 = iCeil;
            int i5 = i2;
            double d5 = (i2 * r4) + radians2;
            double dCos2 = Math.cos(d5);
            double dSin2 = Math.sin(d5);
            fArr[i3] = (float) (dCos2 - (d4 * dSin2));
            fArr[i3 + 1] = (float) (dSin2 + (dCos2 * d4));
            double d6 = d5 + radians3;
            double dCos3 = Math.cos(d6);
            double dSin3 = Math.sin(d6);
            fArr[i3 + 2] = (float) (dCos3 + (d4 * dSin3));
            fArr[i3 + 3] = (float) (dSin3 - (d4 * dCos3));
            int i6 = i3 + 5;
            fArr[i3 + 4] = (float) dCos3;
            i3 += 6;
            fArr[i6] = (float) dSin3;
            i2 = i5 + 1;
            iCeil = i4;
            dCos = dCos;
            f28 = f28;
            f23 = f23;
            radians2 = radians2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate(f23 + (f26 - f28), f24 + f29 + f30);
        matrix.mapPoints(fArr);
        if (i >= 2) {
            fArr[i - 2] = f6;
            fArr[i - 1] = f7;
        }
        for (int i7 = 0; i7 < i; i7 += 6) {
            hxzVar.c(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    public static void e(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private final float j(hza hzaVar) {
        hzq hzqVar = new hzq(this);
        y(hzaVar, hzqVar);
        return hzqVar.a;
    }

    private final Path.FillType k() {
        int i = this.d.a.J;
        return (i != 0 && i + (-1) == 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
    }

    private final Path l(hxg hxgVar) {
        hxr hxrVar = hxgVar.a;
        float fC = hxrVar != null ? hxrVar.c(this) : 0.0f;
        hxr hxrVar2 = hxgVar.b;
        float fD = hxrVar2 != null ? hxrVar2.d(this) : 0.0f;
        float fA = hxgVar.c.a(this);
        float f = fC - fA;
        float f2 = fD - fA;
        float f3 = fC + fA;
        float f4 = fD + fA;
        if (hxgVar.n == null) {
            float f5 = fA + fA;
            hxgVar.n = new hxf(f, f2, f5, f5);
        }
        float f6 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fC, f2);
        float f7 = fC + f6;
        float f8 = fD - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fD);
        float f9 = fD + f6;
        path.cubicTo(f3, f9, f7, f4, fC, f4);
        float f10 = fC - f6;
        path.cubicTo(f10, f4, f, f9, f, fD);
        path.cubicTo(f, f8, f10, f2, fC, f2);
        path.close();
        return path;
    }

    private final Path m(hxl hxlVar) {
        hxr hxrVar = hxlVar.a;
        float fC = hxrVar != null ? hxrVar.c(this) : 0.0f;
        hxr hxrVar2 = hxlVar.b;
        float fD = hxrVar2 != null ? hxrVar2.d(this) : 0.0f;
        float fC2 = hxlVar.c.c(this);
        float fD2 = hxlVar.d.d(this);
        float f = fC - fC2;
        float f2 = fD - fD2;
        float f3 = fC + fC2;
        float f4 = fD + fD2;
        if (hxlVar.n == null) {
            hxlVar.n = new hxf(f, f2, fC2 + fC2, fD2 + fD2);
        }
        float f5 = fC2 * 0.5522848f;
        float f6 = fD2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fC, f2);
        float f7 = fC + f5;
        float f8 = fD - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fD);
        float f9 = fD + f6;
        path.cubicTo(f3, f9, f7, f4, fC, f4);
        float f10 = fC - f5;
        path.cubicTo(f10, f4, f, f9, f, fD);
        path.cubicTo(f, f8, f10, f2, fC, f2);
        path.close();
        return path;
    }

    private final Path n(hyb hybVar) {
        Path path = new Path();
        float[] fArr = hybVar.a;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = hybVar.a;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (hybVar instanceof hyc) {
            path.close();
        }
        if (hybVar.n == null) {
            hybVar.n = T(path);
        }
        path.setFillType(k());
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.graphics.Path o(defpackage.hyd r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzr.o(hyd):android.graphics.Path");
    }

    private final hzn p(hyp hypVar) {
        hzn hznVar = new hzn();
        g(hznVar, hyg.a());
        X(hypVar, hznVar);
        return hznVar;
    }

    private final String q(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    private final void r(hyp hypVar, boolean z, Path path, Matrix matrix) {
        Path pathN;
        if (Q()) {
            Canvas canvas = this.a;
            canvas.save();
            this.e.push(this.d);
            hzn hznVar = (hzn) this.d.clone();
            this.d = hznVar;
            if (hypVar instanceof hze) {
                if (z) {
                    hze hzeVar = (hze) hypVar;
                    O(hznVar, hzeVar);
                    if (Q() && i()) {
                        Matrix matrix2 = hzeVar.b;
                        if (matrix2 != null) {
                            matrix.preConcat(matrix2);
                        }
                        hyp hypVarA = hzeVar.t.a(hzeVar.a);
                        if (hypVarA == null) {
                            e("Use reference '%s' not found", hzeVar.a);
                        } else {
                            s(hzeVar);
                            r(hypVarA, false, path, matrix);
                        }
                    }
                } else {
                    e("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (hypVar instanceof hxx) {
                hxx hxxVar = (hxx) hypVar;
                O(hznVar, hxxVar);
                if (Q() && i()) {
                    Matrix matrix3 = hxxVar.e;
                    if (matrix3 != null) {
                        matrix.preConcat(matrix3);
                    }
                    Path path2 = new hzj(hxxVar.a).a;
                    if (hxxVar.n == null) {
                        hxxVar.n = T(path2);
                    }
                    s(hxxVar);
                    path.setFillType(k());
                    path.addPath(path2, matrix);
                }
            } else if (hypVar instanceof hyy) {
                hyy hyyVar = (hyy) hypVar;
                O(hznVar, hyyVar);
                if (Q()) {
                    Matrix matrix4 = hyyVar.a;
                    if (matrix4 != null) {
                        matrix.preConcat(matrix4);
                    }
                    List list = hyyVar.b;
                    float fD = 0.0f;
                    float fC = (list == null || list.size() == 0) ? 0.0f : ((hxr) hyyVar.b.get(0)).c(this);
                    List list2 = hyyVar.c;
                    float fD2 = (list2 == null || list2.size() == 0) ? 0.0f : ((hxr) hyyVar.c.get(0)).d(this);
                    List list3 = hyyVar.d;
                    float fC2 = (list3 == null || list3.size() == 0) ? 0.0f : ((hxr) hyyVar.d.get(0)).c(this);
                    List list4 = hyyVar.e;
                    if (list4 != null && list4.size() != 0) {
                        fD = ((hxr) hyyVar.e.get(0)).d(this);
                    }
                    if (this.d.a.I != 1) {
                        float fJ = j(hyyVar);
                        if (this.d.a.I == 2) {
                            fJ /= 2.0f;
                        }
                        fC -= fJ;
                    }
                    if (hyyVar.n == null) {
                        hzo hzoVar = new hzo(this, fC, fD2);
                        y(hyyVar, hzoVar);
                        RectF rectF = hzoVar.c;
                        hyyVar.n = new hxf(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    s(hyyVar);
                    Path path3 = new Path();
                    y(hyyVar, new hzm(this, fC + fC2, fD2 + fD, path3));
                    path.setFillType(k());
                    path.addPath(path3, matrix);
                }
            } else if (hypVar instanceof hxn) {
                hxn hxnVar = (hxn) hypVar;
                O(hznVar, hxnVar);
                if (Q() && i()) {
                    Matrix matrix5 = hxnVar.e;
                    if (matrix5 != null) {
                        matrix.preConcat(matrix5);
                    }
                    if (hxnVar instanceof hyd) {
                        pathN = o((hyd) hxnVar);
                    } else if (hxnVar instanceof hxg) {
                        pathN = l((hxg) hxnVar);
                    } else if (hxnVar instanceof hxl) {
                        pathN = m((hxl) hxnVar);
                    } else if (hxnVar instanceof hyb) {
                        pathN = n((hyb) hxnVar);
                    }
                    s(hxnVar);
                    path.setFillType(pathN.getFillType());
                    path.addPath(pathN, matrix);
                }
            } else {
                e("Invalid %s element found in clipPath definition", hypVar.getClass().getSimpleName());
            }
            canvas.restore();
            this.d = (hzn) this.e.pop();
        }
    }

    private final void s(hym hymVar) {
        t(hymVar, hymVar.n);
    }

    private final void t(hym hymVar, hxf hxfVar) {
        String str = this.d.a.w;
        if (str == null) {
            return;
        }
        hyp hypVarA = hymVar.t.a(str);
        if (hypVarA == null) {
            e("ClipPath reference '%s' not found", this.d.a.w);
            return;
        }
        hxh hxhVar = (hxh) hypVarA;
        if (hxhVar.i.isEmpty()) {
            this.a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = hxhVar.a;
        boolean z = bool == null || bool.booleanValue();
        if ((hymVar instanceof hxo) && !z) {
            h("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", hymVar.getClass().getSimpleName());
            return;
        }
        this.e.push(this.d);
        this.d = (hzn) this.d.clone();
        Matrix matrix = new Matrix();
        if (!z) {
            Matrix matrix2 = new Matrix();
            matrix2.preTranslate(hxfVar.a, hxfVar.b);
            matrix2.preScale(hxfVar.c, hxfVar.d);
            this.a.concat(matrix2);
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
        Matrix matrix4 = hxhVar.b;
        if (matrix4 != null) {
            this.a.concat(matrix4);
            Matrix matrix5 = new Matrix();
            if (matrix4.invert(matrix5)) {
                matrix.postConcat(matrix5);
            }
        }
        this.d = p(hxhVar);
        s(hxhVar);
        Path path = new Path();
        Iterator it = hxhVar.i.iterator();
        while (it.hasNext()) {
            r((hyp) it.next(), true, path, new Matrix());
        }
        Canvas canvas = this.a;
        canvas.clipPath(path);
        this.d = (hzn) this.e.pop();
        canvas.concat(matrix);
    }

    private final void u(hym hymVar) {
        hyq hyqVar = this.d.a.b;
        if (hyqVar instanceof hxw) {
            v(true, hymVar.n, (hxw) hyqVar);
        }
        hyq hyqVar2 = this.d.a.d;
        if (hyqVar2 instanceof hxw) {
            v(false, hymVar.n, (hxw) hyqVar2);
        }
    }

    private final void v(boolean z, hxf hxfVar, hxw hxwVar) {
        float f;
        Paint paint;
        boolean z2;
        float f2;
        float fB;
        float f3;
        float fB2;
        float f4;
        Paint paint2;
        float fB3;
        float fB4;
        float fB5;
        float fB6;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z3 = z;
        hzg hzgVar = this.c;
        String str = hxwVar.a;
        hyp hypVarA = hzgVar.a(str);
        if (hypVarA == null) {
            e("%s reference '%s' not found", true != z3 ? "Stroke" : "Fill", str);
            hyq hyqVar = hxwVar.b;
            if (hyqVar != null) {
                aa(this.d, z3, hyqVar);
                return;
            } else if (z3) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        if (hypVarA instanceof hyo) {
            hyo hyoVar = (hyo) hypVarA;
            String str2 = hyoVar.d;
            if (str2 != null) {
                A(hyoVar, str2);
            }
            Boolean bool = hyoVar.b;
            boolean z4 = bool != null && bool.booleanValue();
            if (z3) {
                paint2 = this.d.d;
                z3 = true;
            } else {
                paint2 = this.d.e;
                z3 = false;
            }
            boolean z5 = z3;
            if (z4) {
                hxf hxfVarB = b();
                hxr hxrVar = hyoVar.f;
                fB3 = hxrVar != null ? hxrVar.c(this) : 0.0f;
                f = 0.0f;
                hxr hxrVar2 = hyoVar.g;
                fB4 = hxrVar2 != null ? hxrVar2.d(this) : 0.0f;
                hxr hxrVar3 = hyoVar.h;
                fB5 = hxrVar3 != null ? hxrVar3.c(this) : hxfVarB.c;
                hxr hxrVar4 = hyoVar.i;
                if (hxrVar4 != null) {
                    fB6 = hxrVar4.d(this);
                    f5 = fB5;
                    f6 = fB3;
                    f7 = fB4;
                    f8 = fB6;
                }
                f5 = fB5;
                f6 = fB3;
                f7 = fB4;
                f8 = f;
            } else {
                f = 0.0f;
                hxr hxrVar5 = hyoVar.f;
                fB3 = hxrVar5 != null ? hxrVar5.b(this, 1.0f) : 0.0f;
                hxr hxrVar6 = hyoVar.g;
                fB4 = hxrVar6 != null ? hxrVar6.b(this, 1.0f) : 0.0f;
                hxr hxrVar7 = hyoVar.h;
                fB5 = hxrVar7 != null ? hxrVar7.b(this, 1.0f) : 1.0f;
                hxr hxrVar8 = hyoVar.i;
                if (hxrVar8 != null) {
                    fB6 = hxrVar8.b(this, 1.0f);
                    f5 = fB5;
                    f6 = fB3;
                    f7 = fB4;
                    f8 = fB6;
                }
                f5 = fB5;
                f6 = fB3;
                f7 = fB4;
                f8 = f;
            }
            M();
            this.d = p(hyoVar);
            Matrix matrix = new Matrix();
            if (!z4) {
                matrix.preTranslate(hxfVar.a, hxfVar.b);
                matrix.preScale(hxfVar.c, hxfVar.d);
            }
            Matrix matrix2 = hyoVar.c;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = hyoVar.a.size();
            if (size == 0) {
                L();
                if (z5) {
                    this.d.b = false;
                } else {
                    this.d.c = false;
                }
            } else {
                int[] iArr = new int[size];
                float[] fArr = new float[size];
                Iterator it = hyoVar.a.iterator();
                int i = 0;
                float f9 = -1.0f;
                while (it.hasNext()) {
                    hyf hyfVar = (hyf) ((hyp) it.next());
                    Float f10 = hyfVar.a;
                    float fFloatValue = f10 != null ? f10.floatValue() : f;
                    if (i == 0 || fFloatValue >= f9) {
                        fArr[i] = fFloatValue;
                        f9 = fFloatValue;
                    } else {
                        fArr[i] = f9;
                    }
                    M();
                    O(this.d, hyfVar);
                    hyg hygVar = this.d.a;
                    hxi hxiVar = (hxi) hygVar.u;
                    if (hxiVar == null) {
                        hxiVar = hxi.a;
                    }
                    iArr[i] = (W(hygVar.v.floatValue()) << 24) | hxiVar.b;
                    L();
                    i++;
                }
                if ((f6 == f5 && f7 == f8) || size == 1) {
                    L();
                    paint2.setColor(iArr[size - 1]);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    int i2 = hyoVar.e;
                    if (i2 != 0) {
                        if (i2 == 2) {
                            tileMode = Shader.TileMode.MIRROR;
                        } else if (i2 == 3) {
                            tileMode = Shader.TileMode.REPEAT;
                        }
                    }
                    L();
                    LinearGradient linearGradient = new LinearGradient(f6, f7, f5, f8, iArr, fArr, tileMode);
                    linearGradient.setLocalMatrix(matrix);
                    paint2.setShader(linearGradient);
                }
            }
        } else {
            f = 0.0f;
        }
        if (hypVarA instanceof hys) {
            hys hysVar = (hys) hypVarA;
            String str3 = hysVar.d;
            if (str3 != null) {
                A(hysVar, str3);
            }
            Boolean bool2 = hysVar.b;
            boolean z6 = bool2 != null && bool2.booleanValue();
            if (z3) {
                paint = this.d.d;
                z2 = true;
            } else {
                paint = this.d.e;
                z2 = false;
            }
            if (z6) {
                hxr hxrVar9 = new hxr(50.0f, 9);
                hxr hxrVar10 = hysVar.f;
                float fC = hxrVar10 != null ? hxrVar10.c(this) : hxrVar9.c(this);
                hxr hxrVar11 = hysVar.g;
                float fD = hxrVar11 != null ? hxrVar11.d(this) : hxrVar9.d(this);
                hxr hxrVar12 = hysVar.h;
                fB2 = hxrVar12 != null ? hxrVar12.a(this) : hxrVar9.a(this);
                f3 = fC;
                f4 = fD;
            } else {
                hxr hxrVar13 = hysVar.f;
                if (hxrVar13 != null) {
                    f2 = 1.0f;
                    fB = hxrVar13.b(this, 1.0f);
                } else {
                    f2 = 1.0f;
                    fB = 0.5f;
                }
                hxr hxrVar14 = hysVar.g;
                float fB7 = hxrVar14 != null ? hxrVar14.b(this, f2) : 0.5f;
                hxr hxrVar15 = hysVar.h;
                f3 = fB;
                fB2 = hxrVar15 != null ? hxrVar15.b(this, f2) : 0.5f;
                f4 = fB7;
            }
            M();
            this.d = p(hysVar);
            Matrix matrix3 = new Matrix();
            if (!z6) {
                matrix3.preTranslate(hxfVar.a, hxfVar.b);
                matrix3.preScale(hxfVar.c, hxfVar.d);
            }
            Matrix matrix4 = hysVar.c;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = hysVar.a.size();
            if (size2 == 0) {
                L();
                if (z2) {
                    this.d.b = false;
                } else {
                    this.d.c = false;
                }
            } else {
                int[] iArr2 = new int[size2];
                float[] fArr2 = new float[size2];
                Iterator it2 = hysVar.a.iterator();
                int i3 = 0;
                float f11 = -1.0f;
                while (it2.hasNext()) {
                    hyf hyfVar2 = (hyf) ((hyp) it2.next());
                    Float f12 = hyfVar2.a;
                    float fFloatValue2 = f12 != null ? f12.floatValue() : f;
                    if (i3 == 0 || fFloatValue2 >= f11) {
                        fArr2[i3] = fFloatValue2;
                        f11 = fFloatValue2;
                    } else {
                        fArr2[i3] = f11;
                    }
                    M();
                    O(this.d, hyfVar2);
                    hyg hygVar2 = this.d.a;
                    hxi hxiVar2 = (hxi) hygVar2.u;
                    if (hxiVar2 == null) {
                        hxiVar2 = hxi.a;
                    }
                    iArr2[i3] = (W(hygVar2.v.floatValue()) << 24) | hxiVar2.b;
                    L();
                    i3++;
                }
                if (fB2 == f || size2 == 1) {
                    L();
                    paint.setColor(iArr2[size2 - 1]);
                } else {
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    int i4 = hysVar.e;
                    if (i4 != 0) {
                        if (i4 == 2) {
                            tileMode2 = Shader.TileMode.MIRROR;
                        } else if (i4 == 3) {
                            tileMode2 = Shader.TileMode.REPEAT;
                        }
                    }
                    L();
                    RadialGradient radialGradient = new RadialGradient(f3, f4, fB2, iArr2, fArr2, tileMode2);
                    radialGradient.setLocalMatrix(matrix3);
                    paint.setShader(radialGradient);
                }
            }
        }
        if (hypVarA instanceof hye) {
            hye hyeVar = (hye) hypVarA;
            if (z3) {
                if (Y(hyeVar.q, 2147483648L)) {
                    hzn hznVar = this.d;
                    hyg hygVar3 = hznVar.a;
                    hyq hyqVar2 = hyeVar.q.y;
                    hygVar3.b = hyqVar2;
                    hznVar.b = hyqVar2 != null;
                }
                if (Y(hyeVar.q, 4294967296L)) {
                    this.d.a.c = hyeVar.q.z;
                }
                if (Y(hyeVar.q, 6442450944L)) {
                    hzn hznVar2 = this.d;
                    aa(hznVar2, true, hznVar2.a.b);
                    return;
                }
                return;
            }
            if (Y(hyeVar.q, 2147483648L)) {
                hzn hznVar3 = this.d;
                hyg hygVar4 = hznVar3.a;
                hyq hyqVar3 = hyeVar.q.y;
                hygVar4.d = hyqVar3;
                hznVar3.c = hyqVar3 != null;
            }
            if (Y(hyeVar.q, 4294967296L)) {
                this.d.a.e = hyeVar.q.z;
            }
            if (Y(hyeVar.q, 6442450944L)) {
                hzn hznVar4 = this.d;
                aa(hznVar4, false, hznVar4.a.d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(defpackage.hym r22, android.graphics.Path r23) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzr.w(hym, android.graphics.Path):void");
    }

    private final void x(Path path) {
        hzn hznVar = this.d;
        if (hznVar.a.K != 2) {
            this.a.drawPath(path, hznVar.e);
            return;
        }
        Canvas canvas = this.a;
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.d.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.d.e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private final void y(hza hzaVar, hzp hzpVar) {
        float f;
        float fD;
        float fC;
        if (Q()) {
            Iterator it = hzaVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                hyp hypVar = (hyp) it.next();
                if (hypVar instanceof hzd) {
                    hzpVar.a(q(((hzd) hypVar).a, z, !it.hasNext()));
                } else if (hzpVar.b((hza) hypVar)) {
                    if (hypVar instanceof hzb) {
                        M();
                        hzb hzbVar = (hzb) hypVar;
                        O(this.d, hzbVar);
                        if (Q() && i()) {
                            hyp hypVarA = hzbVar.t.a(hzbVar.a);
                            if (hypVarA == null) {
                                e("TextPath reference '%s' not found", hzbVar.a);
                            } else {
                                hxx hxxVar = (hxx) hypVarA;
                                Path path = new hzj(hxxVar.a).a;
                                Matrix matrix = hxxVar.e;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                hxr hxrVar = hzbVar.b;
                                fD = hxrVar != null ? hxrVar.b(this, pathMeasure.getLength()) : 0.0f;
                                int iS = S();
                                if (iS != 1) {
                                    float fJ = j(hzbVar);
                                    if (iS == 2) {
                                        fJ /= 2.0f;
                                    }
                                    fD -= fJ;
                                }
                                u(hzbVar.c);
                                boolean zR = R();
                                y(hzbVar, new hzk(this, path, fD));
                                if (zR) {
                                    Z();
                                }
                            }
                        }
                        L();
                    } else if (hypVar instanceof hyx) {
                        M();
                        hyx hyxVar = (hyx) hypVar;
                        O(this.d, hyxVar);
                        if (Q()) {
                            boolean z2 = hzpVar instanceof hzl;
                            if (z2) {
                                List list = hyxVar.b;
                                float fC2 = (list == null || list.size() == 0) ? ((hzl) hzpVar).b : ((hxr) hyxVar.b.get(0)).c(this);
                                List list2 = hyxVar.c;
                                fD = (list2 == null || list2.size() == 0) ? ((hzl) hzpVar).c : ((hxr) hyxVar.c.get(0)).d(this);
                                List list3 = hyxVar.d;
                                fC = (list3 == null || list3.size() == 0) ? 0.0f : ((hxr) hyxVar.d.get(0)).c(this);
                                List list4 = hyxVar.e;
                                if (list4 != null && list4.size() != 0) {
                                    fD = ((hxr) hyxVar.e.get(0)).d(this);
                                }
                                float f2 = fC2;
                                f = fD;
                                fD = f2;
                            } else {
                                f = 0.0f;
                                fD = 0.0f;
                                fC = 0.0f;
                            }
                            u(hyxVar.a);
                            if (z2) {
                                hzl hzlVar = (hzl) hzpVar;
                                hzlVar.b = fD + fC;
                                hzlVar.c = fD + f;
                            }
                            boolean zR2 = R();
                            y(hyxVar, hzpVar);
                            if (zR2) {
                                Z();
                            }
                        }
                        L();
                    } else if (hypVar instanceof hyw) {
                        M();
                        hyw hywVar = (hyw) hypVar;
                        O(this.d, hywVar);
                        if (Q()) {
                            u(hywVar.b);
                            hyp hypVarA2 = hypVar.t.a(hywVar.a);
                            if (hypVarA2 == null || !(hypVarA2 instanceof hza)) {
                                e("Tref reference '%s' not found", hywVar.a);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                z((hza) hypVarA2, sb);
                                if (sb.length() > 0) {
                                    hzpVar.a(sb.toString());
                                }
                            }
                        }
                        L();
                    }
                }
                z = false;
            }
        }
    }

    private final void z(hza hzaVar, StringBuilder sb) {
        Iterator it = hzaVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            hyp hypVar = (hyp) it.next();
            if (hypVar instanceof hza) {
                z((hza) hypVar, sb);
            } else if (hypVar instanceof hzd) {
                sb.append(q(((hzd) hypVar).a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    protected final float a() {
        return this.d.d.getTextSize();
    }

    protected final hxf b() {
        hzn hznVar = this.d;
        hxf hxfVar = hznVar.g;
        return hxfVar != null ? hxfVar : hznVar.f;
    }

    public final void d(hyp hypVar) {
        Boolean bool;
        if ((hypVar instanceof hyn) && (bool = ((hyn) hypVar).p) != null) {
            this.d.h = bool.booleanValue();
        }
    }

    public final void f(hyh hyhVar, hxr hxrVar, hxr hxrVar2, hxf hxfVar, hxe hxeVar) {
        float fD;
        if (hxrVar == null || !hxrVar.f()) {
            if (hxrVar2 == null || !hxrVar2.f()) {
                if (hxeVar == null && (hxeVar = hyhVar.v) == null) {
                    hxeVar = hxe.b;
                }
                O(this.d, hyhVar);
                if (Q()) {
                    if (hyhVar.u != null) {
                        hxr hxrVar3 = hyhVar.a;
                        float fC = hxrVar3 != null ? hxrVar3.c(this) : 0.0f;
                        hxr hxrVar4 = hyhVar.b;
                        f = fC;
                        fD = hxrVar4 != null ? hxrVar4.d(this) : 0.0f;
                    } else {
                        fD = 0.0f;
                    }
                    hxf hxfVarB = b();
                    float fC2 = hxrVar != null ? hxrVar.c(this) : hxfVarB.c;
                    float fD2 = hxrVar2 != null ? hxrVar2.d(this) : hxfVarB.d;
                    hzn hznVar = this.d;
                    hznVar.f = new hxf(f, fD, fC2, fD2);
                    if (!hznVar.a.o.booleanValue()) {
                        hxf hxfVar2 = this.d.f;
                        K(hxfVar2.a, hxfVar2.b, hxfVar2.c, hxfVar2.d);
                    }
                    t(hyhVar, this.d.f);
                    if (hxfVar != null) {
                        this.a.concat(U(this.d.f, hxfVar, hxeVar));
                        this.d.g = hyhVar.w;
                    } else {
                        this.a.translate(f, fD);
                    }
                    boolean zR = R();
                    P();
                    H(hyhVar, true);
                    if (zR) {
                        Z();
                    }
                    N(hyhVar);
                }
            }
        }
    }

    public final void g(hzn hznVar, hyg hygVar) {
        if (Y(hygVar, 4096L)) {
            hznVar.a.k = hygVar.k;
        }
        if (Y(hygVar, 2048L)) {
            hznVar.a.j = hygVar.j;
        }
        if (Y(hygVar, 1L)) {
            hznVar.a.b = hygVar.b;
            hznVar.b = hygVar.b != null;
        }
        if (Y(hygVar, 4L)) {
            hznVar.a.c = hygVar.c;
        }
        if (Y(hygVar, 6149L)) {
            aa(hznVar, true, hznVar.a.b);
        }
        if (Y(hygVar, 2L)) {
            hznVar.a.C = hygVar.C;
        }
        if (Y(hygVar, 8L)) {
            hznVar.a.d = hygVar.d;
            hznVar.c = hygVar.d != null;
        }
        if (Y(hygVar, 16L)) {
            hznVar.a.e = hygVar.e;
        }
        if (Y(hygVar, 6168L)) {
            aa(hznVar, false, hznVar.a.d);
        }
        if (Y(hygVar, 34359738368L)) {
            hznVar.a.K = hygVar.K;
        }
        if (Y(hygVar, 32L)) {
            hyg hygVar2 = hznVar.a;
            hygVar2.f = hygVar.f;
            hznVar.e.setStrokeWidth(hygVar2.f.a(this));
        }
        Typeface typefaceV = null;
        if (Y(hygVar, 64L)) {
            hznVar.a.D = hygVar.D;
            int i = hygVar.D;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                hznVar.e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 1) {
                hznVar.e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 2) {
                hznVar.e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Y(hygVar, 128L)) {
            hznVar.a.E = hygVar.E;
            int i3 = hygVar.E;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                hznVar.e.setStrokeJoin(Paint.Join.MITER);
            } else if (i4 == 1) {
                hznVar.e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i4 == 2) {
                hznVar.e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Y(hygVar, 256L)) {
            hznVar.a.g = hygVar.g;
            hznVar.e.setStrokeMiter(hygVar.g.floatValue());
        }
        if (Y(hygVar, 512L)) {
            hznVar.a.h = hygVar.h;
        }
        if (Y(hygVar, 1024L)) {
            hznVar.a.i = hygVar.i;
        }
        if (Y(hygVar, 1536L)) {
            hxr[] hxrVarArr = hznVar.a.h;
            if (hxrVarArr == null) {
                hznVar.e.setPathEffect(null);
            } else {
                int length = hxrVarArr.length;
                int i5 = (length & 1) == 0 ? length : length + length;
                float[] fArr = new float[i5];
                float f = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    float fA = hznVar.a.h[i6 % length].a(this);
                    fArr[i6] = fA;
                    f += fA;
                }
                if (f == 0.0f) {
                    hznVar.e.setPathEffect(null);
                } else {
                    float fA2 = hznVar.a.i.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f) + f;
                    }
                    hznVar.e.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (Y(hygVar, 16384L)) {
            float fA3 = a();
            hznVar.a.m = hygVar.m;
            hznVar.d.setTextSize(hygVar.m.b(this, fA3));
            hznVar.e.setTextSize(hygVar.m.b(this, fA3));
        }
        if (Y(hygVar, 8192L)) {
            hznVar.a.l = hygVar.l;
        }
        if (Y(hygVar, 32768L)) {
            if (hygVar.n.intValue() == -1 && hznVar.a.n.intValue() > 100) {
                hznVar.a.n = Integer.valueOf(r0.n.intValue() - 100);
            } else if (hygVar.n.intValue() != 1 || hznVar.a.n.intValue() >= 900) {
                hznVar.a.n = hygVar.n;
            } else {
                hyg hygVar3 = hznVar.a;
                hygVar3.n = Integer.valueOf(hygVar3.n.intValue() + 100);
            }
        }
        if (Y(hygVar, 65536L)) {
            hznVar.a.F = hygVar.F;
        }
        if (Y(hygVar, 106496L)) {
            List<String> list = hznVar.a.l;
            if (list != null && this.c != null) {
                for (String str : list) {
                    hyg hygVar4 = hznVar.a;
                    typefaceV = V(str, hygVar4.n, hygVar4.F);
                    if (typefaceV != null) {
                        break;
                    }
                }
            }
            if (typefaceV == null) {
                hyg hygVar5 = hznVar.a;
                typefaceV = V("sans-serif", hygVar5.n, hygVar5.F);
            }
            hznVar.d.setTypeface(typefaceV);
            hznVar.e.setTypeface(typefaceV);
        }
        if (Y(hygVar, 131072L)) {
            hznVar.a.G = hygVar.G;
            hznVar.d.setStrikeThruText(hygVar.G == 4);
            hznVar.d.setUnderlineText(hygVar.G == 2);
            hznVar.e.setStrikeThruText(hygVar.G == 4);
            hznVar.e.setUnderlineText(hygVar.G == 2);
        }
        if (Y(hygVar, 68719476736L)) {
            hznVar.a.H = hygVar.H;
        }
        if (Y(hygVar, 262144L)) {
            hznVar.a.I = hygVar.I;
        }
        if (Y(hygVar, 524288L)) {
            hznVar.a.o = hygVar.o;
        }
        if (Y(hygVar, 2097152L)) {
            hznVar.a.p = hygVar.p;
        }
        if (Y(hygVar, 4194304L)) {
            hznVar.a.q = hygVar.q;
        }
        if (Y(hygVar, 8388608L)) {
            hznVar.a.r = hygVar.r;
        }
        if (Y(hygVar, 16777216L)) {
            hznVar.a.s = hygVar.s;
        }
        if (Y(hygVar, 33554432L)) {
            hznVar.a.t = hygVar.t;
        }
        if (Y(hygVar, 1048576L)) {
            hznVar.a.L = hygVar.L;
        }
        if (Y(hygVar, 268435456L)) {
            hznVar.a.w = hygVar.w;
        }
        if (Y(hygVar, 536870912L)) {
            hznVar.a.J = hygVar.J;
        }
        if (Y(hygVar, 1073741824L)) {
            hznVar.a.x = hygVar.x;
        }
        if (Y(hygVar, 67108864L)) {
            hznVar.a.u = hygVar.u;
        }
        if (Y(hygVar, 134217728L)) {
            hznVar.a.v = hygVar.v;
        }
        if (Y(hygVar, 8589934592L)) {
            hznVar.a.A = hygVar.A;
        }
        if (Y(hygVar, 17179869184L)) {
            hznVar.a.B = hygVar.B;
        }
    }

    public final boolean i() {
        Boolean bool = this.d.a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
