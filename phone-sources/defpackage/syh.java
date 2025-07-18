package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.appcompat.R;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syh {
    public final ColorStateList a;
    public final String b;
    public String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public ColorStateList k;
    public float l;
    public Typeface m;
    private final int n;
    private boolean o = false;
    private boolean p = false;

    public syh(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.TextAppearance);
        this.l = typedArrayObtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f);
        this.k = sin.h(context, typedArrayObtainStyledAttributes, 3);
        sin.h(context, typedArrayObtainStyledAttributes, 4);
        sin.h(context, typedArrayObtainStyledAttributes, 5);
        this.d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iG = sin.g(typedArrayObtainStyledAttributes, 12, 10);
        this.n = typedArrayObtainStyledAttributes.getResourceId(iG, 0);
        this.b = typedArrayObtainStyledAttributes.getString(iG);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = sin.h(context, typedArrayObtainStyledAttributes, 6);
        this.f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, sye.a);
        this.i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = typedArrayObtainStyledAttributes2.getString(sin.g(typedArrayObtainStyledAttributes2, 3, 1));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void g() {
        Typeface typeface;
        String str;
        if (this.m == null && (str = this.b) != null) {
            this.m = Typeface.create(str, this.d);
        }
        if (this.m == null) {
            int i = this.e;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i != 3) {
                    this.m = Typeface.DEFAULT;
                    this.m = Typeface.create(this.m, this.d);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.m = typeface;
            this.m = Typeface.create(this.m, this.d);
        }
    }

    private final boolean h(Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Context context2;
        Typeface typefaceB;
        String string;
        Typeface typefaceCreate;
        if (this.o) {
            return true;
        }
        int i = this.n;
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = cso.a;
        Typeface typefaceCreate2 = null;
        if (context.isRestricted()) {
            context2 = context;
            typefaceB = null;
        } else {
            context2 = context;
            typefaceB = cso.b(context2, i, new TypedValue(), 0, null, false, true);
        }
        if (typefaceB == null) {
            if (!this.p) {
                this.p = true;
                Resources resources = context2.getResources();
                if (i == 0 || !resources.getResourceTypeName(i).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), crb.b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                    }
                }
            }
            if (typefaceCreate2 == null) {
                return false;
            }
            typefaceB = typefaceCreate2;
        }
        this.m = typefaceB;
        this.o = true;
        return true;
    }

    public final Typeface a() {
        g();
        return this.m;
    }

    public final void b(Context context, syi syiVar) {
        if (!h(context)) {
            g();
        }
        int i = this.n;
        if (i == 0) {
            this.o = true;
            i = 0;
        }
        int i2 = i;
        if (this.o) {
            syiVar.b(this.m, true);
            return;
        }
        try {
            syf syfVar = new syf(this, syiVar);
            ThreadLocal threadLocal = cso.a;
            if (context.isRestricted()) {
                syfVar.callbackFailAsync(-4, null);
            } else {
                cso.b(context, i2, new TypedValue(), 0, syfVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.o = true;
            syiVar.a(1);
        } catch (Exception unused2) {
            this.o = true;
            syiVar.a(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, syi syiVar) {
        d(context, textPaint, syiVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.k.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(Context context, TextPaint textPaint, syi syiVar) {
        Typeface typeface;
        if (h(context) && this.o && (typeface = this.m) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new syg(this, context, textPaint, syiVar));
        }
    }

    public final void e(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceD = sin.d(context.getResources().getConfiguration(), typeface);
        if (typefaceD != null) {
            typeface = typefaceD;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText(1 == (i & 1));
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
