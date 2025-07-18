package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gi {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private jo e;
    private jo f;
    private jo g;
    private jo h;
    private jo i;
    private jo j;
    private final gp k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public gi(TextView textView) {
        this.d = textView;
        this.k = new gp(textView);
    }

    public static void f(TextView textView, Typeface typeface, int i) {
        String str = null;
        if (Build.VERSION.SDK_INT >= 26) {
            mh mhVar = gg.a;
            String fontVariationSettings = textView.getFontVariationSettings();
            if (!TextUtils.isEmpty(fontVariationSettings)) {
                gg.b(textView, null);
            }
            str = fontVariationSettings;
        }
        textView.setTypeface(typeface, i);
        if (Build.VERSION.SDK_INT < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        gg.b(textView, str);
    }

    static final void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (Build.VERSION.SDK_INT >= 30) {
            qr.d(editorInfo, text);
            return;
        }
        qk.s(text);
        if (Build.VERSION.SDK_INT >= 30) {
            qr.d(editorInfo, text);
            return;
        }
        int i = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelEnd : editorInfo.initialSelStart;
        int i2 = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelStart : editorInfo.initialSelEnd;
        int length = text.length();
        if (i < 0 || i2 > length) {
            sv.a(editorInfo, null, 0, 0);
            return;
        }
        int i3 = editorInfo.inputType & 4095;
        if (i3 == 129 || i3 == 225 || i3 == 18) {
            sv.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            sv.a(editorInfo, text, i, i2);
            return;
        }
        int i4 = i2 - i;
        int length2 = text.length() - i2;
        int i5 = i4 > 1024 ? 0 : i4;
        int i6 = 2048 - i5;
        int iMin = Math.min(length2, i6 - Math.min(i, (int) (i6 * 0.8d)));
        int iMin2 = Math.min(i, i6 - iMin);
        int i7 = i - iMin2;
        if (sv.b(text, i7, 0)) {
            i7++;
            iMin2--;
        }
        if (sv.b(text, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        int i8 = iMin2 + i5;
        sv.a(editorInfo, i5 != i4 ? TextUtils.concat(text.subSequence(i7, i7 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i7, iMin + i8 + i7), iMin2, i8);
    }

    private static jo s(Context context, fm fmVar, int i) {
        ColorStateList colorStateListA = fmVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        jo joVar = new jo();
        joVar.d = true;
        joVar.a = colorStateListA;
        return joVar;
    }

    private final void t(Drawable drawable, jo joVar) {
        if (drawable == null || joVar == null) {
            return;
        }
        jd.g(drawable, joVar, this.d.getDrawableState());
    }

    private final void u(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.l == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        if (this.m == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        gg.b(this.d, this.m);
    }

    private final boolean v(Context context, aps apsVar) throws Resources.NotFoundException {
        String strL;
        int i;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = cu.a;
        this.a = apsVar.d(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int iD = apsVar.d(11, -1);
            this.l = iD;
            if (iD != -1) {
                this.a &= 2;
            }
        }
        if (Build.VERSION.SDK_INT >= 26 && apsVar.o(13)) {
            this.m = apsVar.l(13);
        }
        if (!apsVar.o(10) && !apsVar.o(12)) {
            if (!apsVar.o(1)) {
                if (Build.VERSION.SDK_INT < 28 || (i = this.l) == -1 || (typeface = this.b) == null) {
                    return false;
                }
                this.b = Typeface.create(typeface, i, (2 & this.a) != 0);
                return true;
            }
            this.c = false;
            int iD2 = apsVar.d(1, 1);
            if (iD2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (iD2 != 2) {
                    if (iD2 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        Typeface typefaceA = null;
        this.b = null;
        int i2 = true == apsVar.o(12) ? 12 : 10;
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            no noVar = new no(this, i3, i4, new WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = ((TypedArray) apsVar.a).getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (apsVar.c == null) {
                        apsVar.c = new TypedValue();
                    }
                    Object obj = apsVar.b;
                    Object obj2 = apsVar.c;
                    ThreadLocal threadLocal = nq.a;
                    if (!((Context) obj).isRestricted()) {
                        Resources resources = ((Context) obj).getResources();
                        resources.getValue(resourceId, (TypedValue) obj2, true);
                        typefaceA = nq.a((Context) obj, resources, (TypedValue) obj2, resourceId, i5, noVar);
                    }
                }
                if (typefaceA != null) {
                    if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                        this.b = typefaceA;
                    } else {
                        this.b = Typeface.create(Typeface.create(typefaceA, 0), this.l, (this.a & 2) != 0);
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (strL = apsVar.l(i2)) != null) {
            if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                this.b = Typeface.create(strL, this.a);
            } else {
                this.b = Typeface.create(Typeface.create(strL, 0), this.l, (2 & this.a) != 0);
            }
        }
        return true;
    }

    final int a() {
        return this.k.a();
    }

    final int b() {
        return this.k.b();
    }

    final int c() {
        return this.k.c();
    }

    final int d() {
        return this.k.a;
    }

    final void e() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            t(compoundDrawables[0], this.e);
            t(compoundDrawables[1], this.f);
            t(compoundDrawables[2], this.g);
            t(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        t(compoundDrawablesRelative[0], this.i);
        t(compoundDrawablesRelative[2], this.j);
    }

    final void g() {
        this.k.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void h(android.util.AttributeSet r26, int r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi.h(android.util.AttributeSet, int):void");
    }

    final void i(Context context, int i) throws Resources.NotFoundException {
        aps apsVarP = aps.p(context, i, cu.v);
        if (apsVarP.o(14)) {
            j(apsVarP.n(14, false));
        }
        if (apsVarP.o(0) && apsVarP.c(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean zV = v(context, apsVarP);
        apsVarP.m();
        u(zV);
    }

    final void j(boolean z) {
        this.d.setAllCaps(z);
    }

    final void k(int i, int i2, int i3, int i4) {
        gp gpVar = this.k;
        if (gpVar.k()) {
            DisplayMetrics displayMetrics = gpVar.i.getResources().getDisplayMetrics();
            gpVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (gpVar.i()) {
                gpVar.e();
            }
        }
    }

    final void l(int[] iArr, int i) {
        gp gpVar = this.k;
        if (gpVar.k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = gpVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                gpVar.f = gp.l(iArrCopyOf);
                if (!gpVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
            } else {
                gpVar.g = false;
            }
            if (gpVar.i()) {
                gpVar.e();
            }
        }
    }

    final void m(int i) {
        gp gpVar = this.k;
        if (gpVar.k()) {
            if (i == 0) {
                gpVar.a = 0;
                gpVar.d = -1.0f;
                gpVar.e = -1.0f;
                gpVar.c = -1.0f;
                gpVar.f = new int[0];
                gpVar.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(b.e(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = gpVar.i.getResources().getDisplayMetrics();
            gpVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (gpVar.i()) {
                gpVar.e();
            }
        }
    }

    final void n(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (kc.c || o()) {
            return;
        }
        this.k.f(i, f);
    }

    final boolean o() {
        return this.k.h();
    }

    final int[] p() {
        return this.k.f;
    }

    final void q() {
        if (kc.c) {
            return;
        }
        g();
    }
}
