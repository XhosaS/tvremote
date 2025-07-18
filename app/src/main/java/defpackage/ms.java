package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ms {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private rt e;
    private rt f;
    private rt g;
    private rt h;
    private rt i;
    private rt j;
    private final mx k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public ms(TextView textView) {
        this.d = textView;
        this.k = new mx(textView);
    }

    public static void b(TextView textView, Typeface typeface, int i) {
        wt wtVar = mq.a;
        String fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            mq.b(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        mq.b(textView, fontVariationSettings);
    }

    private static rt f(Context context, ll llVar, int i) {
        ColorStateList colorStateListA = llVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        rt rtVar = new rt();
        rtVar.d = true;
        rtVar.a = colorStateListA;
        return rtVar;
    }

    private final void g(Drawable drawable, rt rtVar) {
        if (drawable == null || rtVar == null) {
            return;
        }
        ra.h(drawable, rtVar, this.d.getDrawableState());
    }

    private final void h(boolean z) {
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
        String str = this.m;
        if (str != null) {
            mq.b(this.d, str);
        }
    }

    private final boolean i(Context context, rv rvVar) {
        String string;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = hs.a;
        TypedArray typedArray = rvVar.b;
        this.a = typedArray.getInt(2, this.a);
        int i = typedArray.getInt(11, -1);
        this.l = i;
        if (i != -1) {
            this.a &= 2;
        }
        if (typedArray.hasValue(13)) {
            this.m = typedArray.getString(13);
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (!typedArray.hasValue(1)) {
                int i2 = this.l;
                if (i2 == -1 || (typeface = this.b) == null) {
                    return false;
                }
                this.b = Typeface.create(typeface, i2, (this.a & 2) != 0);
                return true;
            }
            this.c = false;
            int i3 = typedArray.getInt(1, 1);
            if (i3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        Typeface typefaceD = null;
        this.b = null;
        int i4 = true == typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.l;
        int i6 = this.a;
        if (!context.isRestricted()) {
            mn mnVar = new mn(this, i5, i6, new WeakReference(this.d));
            try {
                int i7 = this.a;
                int resourceId = typedArray.getResourceId(i4, 0);
                if (resourceId != 0) {
                    if (rvVar.c == null) {
                        rvVar.c = new TypedValue();
                    }
                    Context context2 = rvVar.a;
                    TypedValue typedValue = rvVar.c;
                    WeakHashMap weakHashMap = aco.a;
                    if (!context2.isRestricted()) {
                        typefaceD = aco.d(context2, resourceId, typedValue, i7, mnVar, true);
                    }
                }
                if (typefaceD != null) {
                    if (this.l != -1) {
                        this.b = Typeface.create(Typeface.create(typefaceD, 0), this.l, (this.a & 2) != 0);
                    } else {
                        this.b = typefaceD;
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (string = rvVar.b.getString(i4)) != null) {
            if (this.l != -1) {
                this.b = Typeface.create(Typeface.create(string, 0), this.l, (this.a & 2) != 0);
            } else {
                this.b = Typeface.create(string, this.a);
            }
        }
        return true;
    }

    public final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            g(compoundDrawables[0], this.e);
            g(compoundDrawables[1], this.f);
            g(compoundDrawables[2], this.g);
            g(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        g(compoundDrawablesRelative[0], this.i);
        g(compoundDrawablesRelative[2], this.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms.c(android.util.AttributeSet, int):void");
    }

    public final void d(Context context, int i) {
        rv rvVarD = rv.d(context, i, hs.w);
        TypedArray typedArray = rvVarD.b;
        if (typedArray.hasValue(14)) {
            this.d.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean zI = i(context, rvVarD);
        typedArray.recycle();
        h(zI);
    }

    public final void e(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        text.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelEnd : editorInfo.initialSelStart;
        int i2 = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelStart : editorInfo.initialSelEnd;
        int length = text.length();
        if (i < 0 || i2 > length) {
            ake.a(editorInfo, null, 0, 0);
            return;
        }
        int i3 = editorInfo.inputType & 4095;
        if (i3 == 129 || i3 == 225 || i3 == 18) {
            ake.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            ake.a(editorInfo, text, i, i2);
            return;
        }
        int i4 = i2 - i;
        int length2 = text.length() - i2;
        int i5 = i4 > 1024 ? 0 : i4;
        int i6 = 2048 - i5;
        int iMin = Math.min(length2, i6 - Math.min(i, (int) (i6 * 0.8d)));
        int iMin2 = Math.min(i, i6 - iMin);
        int i7 = i - iMin2;
        if (ake.b(text, i7, 0)) {
            i7++;
            iMin2--;
        }
        if (ake.b(text, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        int i8 = iMin2 + i5;
        ake.a(editorInfo, i5 != i4 ? TextUtils.concat(text.subSequence(i7, i7 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i7, iMin + i8 + i7), iMin2, i8);
    }
}
