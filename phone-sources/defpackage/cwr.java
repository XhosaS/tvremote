package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwr {
    static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    static void c(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static final dbd e(List list, yow yowVar, yjk yjkVar) {
        return new ddc(new ddc(cwo.c(new dcd(ddg.a, new ddd(yjkVar, 0)), null, list, yowVar)));
    }

    public static final dol f(dot dotVar, byte[] bArr) {
        if (dotVar.b() == 0) {
            return new doj(bArr);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public static final void g(long j, dro droVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1266032519);
        if (i3 == 0) {
            i2 = (true != baoVarD.E(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(droVar) : baoVarD.H(droVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Long lValueOf = Long.valueOf(j);
            baoVarD.v(1181515614, lValueOf);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = dnt.a;
                basVar.ae(objT);
            }
            yjk yjkVar = (yjk) ((ymj) objT);
            int i4 = (i2 & 896) | 6;
            baoVarD.y(-683746039);
            baoVarD.y(-548224868);
            if (!(basVar.a instanceof dio)) {
                zy.n();
            }
            baoVarD.w();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, lValueOf, new diw(11));
            beb.a(baoVarD, droVar, new diw(12));
            yjzVar.a(baoVarD, Integer.valueOf((((i4 & 896) | 6) >> 6) & 14));
            baoVarD.o();
            basVar.aa();
            basVar.aa();
            basVar.aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(j, droVar, yjzVar, i, 5);
        }
    }

    public static final void h(djh djhVar, yjv yjvVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(1060451148);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(djhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = dns.a;
                basVar.ae(objT);
            }
            yjk yjkVar = (yjk) ((ymj) objT);
            dro droVar = new dro(0, 1);
            ArrayList arrayList = new ArrayList();
            yjvVar.a(new pku(arrayList));
            bhq bhqVar = new bhq(-1119459778, true, new awh(arrayList, droVar, 6, null));
            baoVarD.y(-683746039);
            baoVarD.y(-548224868);
            if (!(basVar.a instanceof dio)) {
                zy.n();
            }
            baoVarD.w();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, djhVar, new diw(13));
            beb.a(baoVarD, new drm(0), new diw(14));
            bhqVar.a(baoVarD, 0);
            baoVarD.o();
            basVar.aa();
            basVar.aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new bho(djhVar, yjvVar, i, i3);
        }
    }
}
