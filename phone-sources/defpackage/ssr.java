package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssr {
    private static unc a;

    static void a(Outline outline, Path path) {
        outline.setConvexPath(path);
    }

    public static ColorStateList b(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !sf$$ExternalSyntheticApiModelOutline0.m515m((Object) drawable)) {
            return null;
        }
        return sf$$ExternalSyntheticApiModelOutline0.m((Object) drawable).getColorStateList();
    }

    public static PorterDuffColorFilter c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static Drawable d(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i != -1 && i2 == -1) {
            i2 = -1;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static AttributeSet e(Context context, int i, CharSequence charSequence) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), charSequence)) {
                        return Xml.asAttributeSet(xml);
                    }
                    throw new XmlPullParserException(a.cg((String) charSequence, "Must have a <", "> start tag"));
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x".concat(String.valueOf(Integer.toHexString(i))));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    public static void f(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            sss.c(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a(outline, path);
        }
    }

    public static void g(Drawable drawable, int i) {
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    public static int[] h(int[] iArr) {
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = 16842912;
                return iArrCopyOf;
            }
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
            i++;
        }
    }

    public static Drawable i(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static final double j(int i, double d, Map map) {
        Integer numValueOf = Integer.valueOf(i);
        if (map.get(numValueOf) == null) {
            map.put(numValueOf, Double.valueOf(ssd.a(d, 200.0d, i).b));
        }
        return ((Double) map.get(numValueOf)).doubleValue();
    }

    public static int k(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    public static int l(wfx wfxVar, int[] iArr) {
        int i = wfxVar.b;
        int i2 = wfxVar.d;
        int i3 = wfxVar.f;
        int i4 = iArr[k(i, i2, i3)];
        int i5 = wfxVar.e;
        int i6 = i4 - iArr[k(i, i2, i5)];
        int i7 = wfxVar.c;
        int i8 = (i6 - iArr[k(i, i7, i3)]) + iArr[k(i, i7, i5)];
        int i9 = wfxVar.a;
        return (((i8 - iArr[k(i9, i2, i3)]) + iArr[k(i9, i2, i5)]) + iArr[k(i9, i7, i3)]) - iArr[k(i9, i7, i5)];
    }

    static int m(wfx wfxVar, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i - 1;
        if (i4 == 0) {
            int i5 = wfxVar.a;
            int i6 = wfxVar.d;
            int i7 = wfxVar.f;
            int i8 = -iArr[k(i5, i6, i7)];
            int i9 = wfxVar.e;
            int i10 = i8 + iArr[k(i5, i6, i9)];
            int i11 = wfxVar.c;
            i2 = i10 + iArr[k(i5, i11, i7)];
            i3 = iArr[k(i5, i11, i9)];
        } else if (i4 != 1) {
            int i12 = wfxVar.b;
            int i13 = wfxVar.d;
            int i14 = wfxVar.e;
            int i15 = -iArr[k(i12, i13, i14)];
            int i16 = wfxVar.c;
            int i17 = i15 + iArr[k(i12, i16, i14)];
            int i18 = wfxVar.a;
            i2 = i17 + iArr[k(i18, i13, i14)];
            i3 = iArr[k(i18, i16, i14)];
        } else {
            int i19 = wfxVar.b;
            int i20 = wfxVar.c;
            int i21 = wfxVar.f;
            int i22 = -iArr[k(i19, i20, i21)];
            int i23 = wfxVar.e;
            int i24 = i22 + iArr[k(i19, i20, i23)];
            int i25 = wfxVar.a;
            i2 = i24 + iArr[k(i25, i20, i21)];
            i3 = iArr[k(i25, i20, i23)];
        }
        return i2 - i3;
    }

    static int n(wfx wfxVar, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i - 1;
        if (i5 == 0) {
            int i6 = wfxVar.d;
            int i7 = wfxVar.f;
            int i8 = iArr[k(i2, i6, i7)];
            int i9 = wfxVar.e;
            int i10 = i8 - iArr[k(i2, i6, i9)];
            int i11 = wfxVar.c;
            i3 = i10 - iArr[k(i2, i11, i7)];
            i4 = iArr[k(i2, i11, i9)];
        } else if (i5 != 1) {
            int i12 = wfxVar.b;
            int i13 = wfxVar.d;
            int i14 = iArr[k(i12, i13, i2)];
            int i15 = wfxVar.c;
            int i16 = i14 - iArr[k(i12, i15, i2)];
            int i17 = wfxVar.a;
            i3 = i16 - iArr[k(i17, i13, i2)];
            i4 = iArr[k(i17, i15, i2)];
        } else {
            int i18 = wfxVar.b;
            int i19 = wfxVar.f;
            int i20 = iArr[k(i18, i2, i19)];
            int i21 = wfxVar.e;
            int i22 = i20 - iArr[k(i18, i2, i21)];
            int i23 = wfxVar.a;
            i3 = i22 - iArr[k(i23, i2, i19)];
            i4 = iArr[k(i23, i2, i21)];
        }
        return i3 + i4;
    }

    public static final wfy o(wfx wfxVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        wfx wfxVar2 = wfxVar;
        int i8 = i;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int iM = m(wfxVar2, i8, iArr6);
        int iM2 = m(wfxVar2, i8, iArr3);
        int iM3 = m(wfxVar2, i8, iArr4);
        int iM4 = m(wfxVar2, i8, iArr5);
        double d = 0.0d;
        int i9 = -1;
        int i10 = i2;
        while (i10 < i3) {
            int iN = n(wfxVar2, i8, i10, iArr6) + iM;
            int iN2 = iM2 + n(wfxVar2, i8, i10, iArr3);
            int iN3 = iM3 + n(wfxVar2, i8, i10, iArr4);
            int iN4 = iM4 + n(wfxVar2, i8, i10, iArr5);
            if (iN4 != 0) {
                int i11 = iN * iN;
                int i12 = iN2 * iN2;
                int i13 = iN3 * iN3;
                int i14 = i4 - iN;
                int i15 = i5 - iN2;
                int i16 = i6 - iN3;
                int i17 = i7 - iN4;
                if (i17 != 0) {
                    double d2 = (((i11 + i12) + i13) / iN4) + ((((i14 * i14) + (i15 * i15)) + (i16 * i16)) / i17);
                    if (d2 > d) {
                        d = d2;
                        i9 = i10;
                    }
                }
            }
            i10++;
            wfxVar2 = wfxVar;
            i8 = i;
            iArr5 = iArr;
            iArr6 = iArr2;
        }
        return new wfy(i9, d);
    }

    public static final double p(wfx wfxVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double[] dArr) {
        int iL = l(wfxVar, iArr2);
        int iL2 = l(wfxVar, iArr3);
        int iL3 = l(wfxVar, iArr4);
        int i = wfxVar.b;
        int i2 = wfxVar.d;
        int i3 = wfxVar.f;
        double d = dArr[k(i, i2, i3)];
        int i4 = wfxVar.e;
        double d2 = d - dArr[k(i, i2, i4)];
        int i5 = wfxVar.c;
        double d3 = (d2 - dArr[k(i, i5, i3)]) + dArr[k(i, i5, i4)];
        int i6 = wfxVar.a;
        return ((((d3 - dArr[k(i6, i2, i3)]) + dArr[k(i6, i2, i4)]) + dArr[k(i6, i5, i3)]) - dArr[k(i6, i5, i4)]) - ((((iL * iL) + (iL2 * iL2)) + (iL3 * iL3)) / l(wfxVar, iArr));
    }

    public static String q(String str) {
        return "update.precondition.failures:".concat(str);
    }

    public static synchronized unc r(Context context) {
        if (a == null) {
            a = new unc(new ulp((Object) sio.e(context), (byte[]) null));
        }
        return a;
    }

    public static ImageView.ScaleType s(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void t(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(y(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void u(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(y(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void v(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void w(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        z(checkableImageButton);
    }

    public static void x(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener(null);
        z(checkableImageButton);
    }

    private static int[] y(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    private static void z(CheckableImageButton checkableImageButton) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(zHasOnClickListeners);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.c = zHasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        checkableImageButton.setImportantForAccessibility(true != zHasOnClickListeners ? 2 : 1);
    }
}
