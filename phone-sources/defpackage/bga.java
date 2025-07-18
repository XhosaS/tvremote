package defpackage;

import android.support.v7.appcompat.R;
import android.util.LongSparseArray;
import android.view.DragEvent;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.DrawWithCacheElement;
import androidx.compose.ui.draw.DrawWithContentElement;
import androidx.compose.ui.draw.PainterElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bga {
    public static final boolean A(bln blnVar, long j) {
        if (!blnVar.q.A) {
            return false;
        }
        bzq bzqVarN = fh.I(blnVar).n();
        if (!bzqVarN.s()) {
            return false;
        }
        long jQ = bty.q(bzqVarN);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ & 4294967295L));
        long j2 = blnVar.d;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= f) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2) {
                return true;
            }
        }
        return false;
    }

    public static final void B(blj bljVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        dhk dhkVar;
        Object obj;
        ces cesVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM61m = ajo$$ExternalSyntheticApiModelOutline1.m61m(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM61m != null && (value = viewTranslationResponseM61m.getValue("android:text")) != null && (text = value.getText()) != null && (dhkVar = (dhk) bljVar.a().a((int) jKeyAt)) != null && (obj = dhkVar.b) != null && (cesVar = (ces) ccf.t(((cff) obj).c, cfb.k)) != null) {
            }
        }
    }

    public static final long C(kw kwVar) {
        DragEvent dragEvent = (DragEvent) kwVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final void D(blo bloVar, kw kwVar) {
        bloVar.c(kwVar);
        bloVar.cc(kwVar);
    }

    private static final void E(int i, int i2) {
        throw new IndexOutOfBoundsException(a.cn(i2, i, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void F(int i) {
        throw new IndexOutOfBoundsException(a.cd(i, "fromIndex (", ") is less than 0."));
    }

    private static final void G(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void H(int i, int i2) {
        throw new IllegalArgumentException(a.cn(i2, i, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            E(i, size);
        }
    }

    public static final void b(List list, int i, int i2) {
        if (i > i2) {
            H(i, i2);
        }
        if (i < 0) {
            F(i);
        }
        if (i2 > list.size()) {
            G(i2, list.size());
        }
    }

    public static final int c(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final int d(int i) {
        return (i - 1) & (-32);
    }

    public static final Object[] e(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final void f(bao baoVar, yjz yjzVar) {
        ylh.d(yjzVar, 2);
        yjzVar.a(baoVar, 1);
    }

    public static final int g(int i, int i2) {
        return i << ((i2 * 3) + 1);
    }

    public static final int h(int i) {
        return g(2, i);
    }

    public static final int i(int i) {
        return g(1, i);
    }

    public static final boolean j(bcr bcrVar, bcr bcrVar2) {
        return bcrVar == null || !bcrVar.l() || yks.e(bcrVar, bcrVar2) || yks.e(bcrVar.c, bcrVar2.c);
    }

    public static final bhq k(int i, Object obj, bao baoVar) {
        Object objG = baoVar.g();
        if (objG == ban.a) {
            objG = new bhq(i, true, obj);
            baoVar.A(objG);
        }
        bhq bhqVar = (bhq) objG;
        if (!yks.e(bhqVar.b, obj)) {
            Object obj2 = bhqVar.b;
            bhqVar.b = obj;
            if (obj2 != null && bhqVar.a) {
                bcr bcrVar = bhqVar.d;
                if (bcrVar != null) {
                    bcrVar.a();
                    bhqVar.d = null;
                }
                List list = bhqVar.c;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((bcr) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return bhqVar;
    }

    public static final bib l(bao baoVar) {
        baoVar.x(1967007797);
        Object[] objArr = new Object[0];
        bii biiVar = bid.a;
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (objT == ban.a) {
            objT = new awl(5);
            basVar.ae(objT);
        }
        bid bidVar = (bid) m(objArr, biiVar, (yjk) objT, baoVar, 384);
        bidVar.c = (bie) baoVar.f(big.a);
        basVar.aa();
        return bidVar;
    }

    public static final Object m(Object[] objArr, bii biiVar, yjk yjkVar, bao baoVar, int i) {
        return o(Arrays.copyOf(objArr, objArr.length), biiVar, yjkVar, baoVar, (i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384 | ((i << 3) & 7168), 0);
    }

    public static final String n(Object obj) {
        Objects.toString(obj);
        return obj.toString().concat(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
    }

    @yfp
    public static final Object o(Object[] objArr, bii biiVar, yjk yjkVar, bao baoVar, int i, int i2) {
        Object[] objArr2;
        Object obj;
        Object objA;
        if ((i2 & 2) != 0) {
            biiVar = bik.a;
        }
        bii biiVar2 = biiVar;
        String string = Long.toString(zy.p(baoVar), 36);
        string.getClass();
        biiVar2.getClass();
        bie bieVar = (bie) baoVar.f(big.a);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        Object obj2 = ban.a;
        if (objT == obj2) {
            Object objA2 = (bieVar == null || (objA = bieVar.a(string)) == null) ? null : biiVar2.a(objA);
            if (objA2 == null) {
                objA2 = yjkVar.a();
            }
            objArr2 = objArr;
            bia biaVar = new bia(biiVar2, bieVar, string, objA2, objArr2);
            basVar.ae(biaVar);
            objT = biaVar;
        } else {
            objArr2 = objArr;
        }
        bia biaVar2 = (bia) objT;
        Object objA3 = Arrays.equals(objArr2, biaVar2.e) ? biaVar2.d : null;
        if (objA3 == null) {
            objA3 = yjkVar.a();
        }
        boolean zH = baoVar.H(biaVar2);
        boolean z = true;
        if ((((i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 || !baoVar.H(biiVar2)) && (i & 48) != 32) {
            z = false;
        }
        boolean zH2 = zH | z | baoVar.H(bieVar) | baoVar.F(string) | baoVar.H(objA3) | baoVar.H(objArr2);
        Object objT2 = basVar.T();
        if (zH2 || objT2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objA3;
            jak jakVar = new jak(biaVar2, biiVar2, bieVar, string, obj, objArr3, 1);
            basVar.ae(jakVar);
            objT2 = jakVar;
        } else {
            obj = objA3;
        }
        bbn.g((yjk) objT2, baoVar);
        return obj;
    }

    public static final Object p(Object[] objArr, yjk yjkVar, bao baoVar) {
        return o(Arrays.copyOf(objArr, 0), bik.a, yjkVar, baoVar, 3456, 0);
    }

    public static /* synthetic */ bkp q(bkp bkpVar, float f, bol bolVar, int i) {
        boolean z;
        if ((i & 2) != 0) {
            bolVar = boh.a;
        }
        bol bolVar2 = bolVar;
        boolean z2 = false;
        if ((i & 4) != 0 && Float.compare(f, 0.0f) > 0) {
            z2 = true;
        }
        long j = bnw.a;
        if (Float.compare(f, 0.0f) > 0) {
            z = z2;
        } else {
            if (!z2) {
                return bkpVar;
            }
            z = true;
        }
        return bkpVar.a(new ShadowGraphicsLayerElement(f, bolVar2, z, j, j));
    }

    public static /* synthetic */ bkp r(bkp bkpVar, bqh bqhVar, bkd bkdVar, buo buoVar, float f, bnr bnrVar, int i) {
        if ((i & 4) != 0) {
            bkdVar = bkb.e;
        }
        bkd bkdVar2 = bkdVar;
        if ((i & 8) != 0) {
            buoVar = bun.c;
        }
        buo buoVar2 = buoVar;
        boolean z = (i & 2) != 0;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return bkpVar.a(new PainterElement(bqhVar, z, bkdVar2, buoVar2, f, bnrVar));
    }

    public static final bkp s(bkp bkpVar, yjv yjvVar) {
        return bkpVar.a(new DrawBehindElement(yjvVar));
    }

    public static final bkp t(bkp bkpVar, yjv yjvVar) {
        return bkpVar.a(new DrawWithCacheElement(yjvVar));
    }

    public static final bkp u(bkp bkpVar, yjv yjvVar) {
        return bkpVar.a(new DrawWithContentElement(yjvVar));
    }

    public static final blq v(yjv yjvVar) {
        return new blq(new blr(), yjvVar);
    }

    public static final bkp w(bkp bkpVar, bol bolVar) {
        return bny.f(bkpVar, 0.0f, bolVar, true, 0, 518143);
    }

    public static final bkp x(bkp bkpVar) {
        return bny.f(bkpVar, 0.0f, null, true, 0, 520191);
    }

    public static final bkp y(bkp bkpVar, float f) {
        return f == 1.0f ? bkpVar : bny.f(bkpVar, f, null, true, 0, 520187);
    }

    public static final void z(cak cakVar, yjv yjvVar) {
        if (yjvVar.a(cakVar) != caj.a) {
            return;
        }
        cbp.J(cakVar, yjvVar);
    }
}
