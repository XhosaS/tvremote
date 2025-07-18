package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bws extends bwj {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public bwq b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public bws() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new bwq();
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (rect.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        bwq bwqVar = this.b;
        Bitmap bitmap = bwqVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != bwqVar.f.getHeight()) {
            bwqVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            bwqVar.k = true;
        }
        if (this.c) {
            bwq bwqVar2 = this.b;
            if (bwqVar2.k || bwqVar2.g != bwqVar2.c || bwqVar2.h != bwqVar2.d || bwqVar2.j != bwqVar2.e || bwqVar2.i != bwqVar2.b.getRootAlpha()) {
                this.b.a(iMin, iMin2);
                bwq bwqVar3 = this.b;
                bwqVar3.g = bwqVar3.c;
                bwqVar3.h = bwqVar3.d;
                bwqVar3.i = bwqVar3.b.getRootAlpha();
                bwqVar3.j = bwqVar3.e;
                bwqVar3.k = false;
            }
        } else {
            this.b.a(iMin, iMin2);
        }
        bwq bwqVar4 = this.b;
        if (bwqVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (bwqVar4.l == null) {
                bwqVar4.l = new Paint();
                bwqVar4.l.setFilterBitmap(true);
            }
            bwqVar4.l.setAlpha(bwqVar4.b.getRootAlpha());
            bwqVar4.l.setColorFilter(colorFilter);
            paint = bwqVar4.l;
        }
        canvas.drawBitmap(bwqVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new bwr(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        bwq bwqVar = this.b;
        if (bwqVar == null) {
            return false;
        }
        if (bwqVar.b.a()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new bwq(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.bwj, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        bwq bwqVar = this.b;
        ColorStateList colorStateList = bwqVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = bwqVar.d) != null) {
            this.d = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (bwqVar.b.a()) {
            boolean zC = bwqVar.b.d.c(iArr);
            bwqVar.k |= zC;
            if (zC) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        bwq bwqVar = this.b;
        if (bwqVar.c != colorStateList) {
            bwqVar.c = colorStateList;
            this.d = b(colorStateList, bwqVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        bwq bwqVar = this.b;
        if (bwqVar.d != mode) {
            bwqVar.d = mode;
            this.d = b(bwqVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListA;
        int i;
        boolean z;
        int i2;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        bwq bwqVar = this.b;
        bwqVar.b = new bwp();
        TypedArray typedArrayD = acp.d(resources, theme, attributeSet, bwb.a);
        bwq bwqVar2 = this.b;
        bwp bwpVar = bwqVar2.b;
        int iC = acp.c(typedArrayD, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (iC == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iC == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (iC != 9) {
            switch (iC) {
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        bwqVar2.d = mode;
        boolean z2 = false;
        if (acp.g(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayD.getValue(1, typedValue);
            if (typedValue.type != 2) {
                if (typedValue.type >= 28 && typedValue.type <= 31) {
                    colorStateListA = ColorStateList.valueOf(typedValue.data);
                } else {
                    Resources resources2 = typedArrayD.getResources();
                    int resourceId = typedArrayD.getResourceId(1, 0);
                    int i4 = abz.a;
                    try {
                        colorStateListA = abz.a(resources2, resources2.getXml(resourceId), theme);
                    } catch (Exception e) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    }
                }
            } else {
                typedValue.toString();
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
            }
        } else {
            colorStateListA = null;
        }
        if (colorStateListA != null) {
            bwqVar2.c = colorStateListA;
        }
        boolean z3 = bwqVar2.e;
        if (acp.g(xmlPullParser, "autoMirrored")) {
            z3 = typedArrayD.getBoolean(5, z3);
        }
        bwqVar2.e = z3;
        bwpVar.g = acp.a(typedArrayD, xmlPullParser, "viewportWidth", 7, bwpVar.g);
        float fA = acp.a(typedArrayD, xmlPullParser, "viewportHeight", 8, bwpVar.h);
        bwpVar.h = fA;
        if (bwpVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayD.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fA > 0.0f) {
            bwpVar.e = typedArrayD.getDimension(3, bwpVar.e);
            float dimension = typedArrayD.getDimension(2, bwpVar.f);
            bwpVar.f = dimension;
            if (bwpVar.e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(typedArrayD.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension > 0.0f) {
                bwpVar.setAlpha(acp.a(typedArrayD, xmlPullParser, "alpha", 4, bwpVar.getAlpha()));
                String string = typedArrayD.getString(0);
                if (string != null) {
                    bwpVar.j = string;
                    bwpVar.l.put(string, bwpVar);
                }
                typedArrayD.recycle();
                bwqVar.a = getChangingConfigurations();
                bwqVar.k = true;
                bwq bwqVar3 = this.b;
                bwp bwpVar2 = bwqVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(bwpVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i3); i5 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        bwm bwmVar = (bwm) arrayDeque.peek();
                        if (bwmVar == null) {
                            i = depth;
                            z = z2;
                        } else if ("path".equals(name)) {
                            bwl bwlVar = new bwl();
                            TypedArray typedArrayD2 = acp.d(resources, theme, attributeSet, bwb.c);
                            bwlVar.a = null;
                            if (acp.g(xmlPullParser, "pathData")) {
                                String string2 = typedArrayD2.getString(0);
                                if (string2 != null) {
                                    bwlVar.n = string2;
                                }
                                String string3 = typedArrayD2.getString(2);
                                if (string3 != null) {
                                    bwlVar.m = acv.b(string3);
                                }
                                bwlVar.d = acp.k(typedArrayD2, xmlPullParser, theme, "fillColor", 1);
                                i = depth;
                                bwlVar.f = acp.a(typedArrayD2, xmlPullParser, "fillAlpha", 12, bwlVar.f);
                                int iC2 = acp.c(typedArrayD2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = bwlVar.j;
                                if (iC2 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (iC2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (iC2 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                bwlVar.j = cap;
                                int iC3 = acp.c(typedArrayD2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = bwlVar.k;
                                if (iC3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (iC3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (iC3 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                bwlVar.k = join;
                                bwlVar.l = acp.a(typedArrayD2, xmlPullParser, "strokeMiterLimit", 10, bwlVar.l);
                                bwlVar.b = acp.k(typedArrayD2, xmlPullParser, theme, "strokeColor", 3);
                                bwlVar.e = acp.a(typedArrayD2, xmlPullParser, "strokeAlpha", 11, bwlVar.e);
                                bwlVar.c = acp.a(typedArrayD2, xmlPullParser, "strokeWidth", 4, bwlVar.c);
                                bwlVar.h = acp.a(typedArrayD2, xmlPullParser, "trimPathEnd", 6, bwlVar.h);
                                bwlVar.i = acp.a(typedArrayD2, xmlPullParser, "trimPathOffset", 7, bwlVar.i);
                                bwlVar.g = acp.a(typedArrayD2, xmlPullParser, "trimPathStart", 5, bwlVar.g);
                                bwlVar.o = acp.c(typedArrayD2, xmlPullParser, "fillType", 13, bwlVar.o);
                            } else {
                                i = depth;
                            }
                            typedArrayD2.recycle();
                            bwmVar.b.add(bwlVar);
                            if (bwlVar.getPathName() != null) {
                                bwpVar2.l.put(bwlVar.getPathName(), bwlVar);
                            }
                            int i6 = bwqVar3.a;
                            i2 = 3;
                            z = false;
                            z4 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                bwk bwkVar = new bwk();
                                if (acp.g(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayD3 = acp.d(resources, theme, attributeSet, bwb.d);
                                    String string4 = typedArrayD3.getString(0);
                                    if (string4 != null) {
                                        bwkVar.n = string4;
                                    }
                                    String string5 = typedArrayD3.getString(1);
                                    if (string5 != null) {
                                        bwkVar.m = acv.b(string5);
                                    }
                                    bwkVar.o = acp.c(typedArrayD3, xmlPullParser, "fillType", 2, 0);
                                    typedArrayD3.recycle();
                                }
                                bwmVar.b.add(bwkVar);
                                if (bwkVar.getPathName() != null) {
                                    bwpVar2.l.put(bwkVar.getPathName(), bwkVar);
                                }
                                int i7 = bwqVar3.a;
                                i2 = 3;
                                z = false;
                            } else if ("group".equals(name)) {
                                bwm bwmVar2 = new bwm();
                                TypedArray typedArrayD4 = acp.d(resources, theme, attributeSet, bwb.b);
                                bwmVar2.l = null;
                                bwmVar2.c = acp.a(typedArrayD4, xmlPullParser, "rotation", 5, bwmVar2.c);
                                bwmVar2.d = typedArrayD4.getFloat(1, bwmVar2.d);
                                bwmVar2.e = typedArrayD4.getFloat(2, bwmVar2.e);
                                bwmVar2.f = acp.a(typedArrayD4, xmlPullParser, "scaleX", 3, bwmVar2.f);
                                bwmVar2.g = acp.a(typedArrayD4, xmlPullParser, "scaleY", 4, bwmVar2.g);
                                bwmVar2.h = acp.a(typedArrayD4, xmlPullParser, "translateX", 6, bwmVar2.h);
                                bwmVar2.i = acp.a(typedArrayD4, xmlPullParser, "translateY", 7, bwmVar2.i);
                                z = false;
                                String string6 = typedArrayD4.getString(0);
                                if (string6 != null) {
                                    bwmVar2.m = string6;
                                }
                                bwmVar2.a();
                                typedArrayD4.recycle();
                                bwmVar.b.add(bwmVar2);
                                arrayDeque.push(bwmVar2);
                                if (bwmVar2.getGroupName() != null) {
                                    bwpVar2.l.put(bwmVar2.getGroupName(), bwmVar2);
                                }
                                int i8 = bwqVar3.a;
                                i2 = 3;
                            } else {
                                z = false;
                            }
                        }
                        i2 = 3;
                    } else {
                        i = depth;
                        z = z2;
                        i2 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i3 = i2;
                    z2 = z;
                    depth = i;
                }
                if (!z4) {
                    this.d = b(bwqVar.c, bwqVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(String.valueOf(typedArrayD.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        throw new XmlPullParserException(String.valueOf(typedArrayD.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
    }

    public bws(bwq bwqVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = bwqVar;
        this.d = b(bwqVar.c, bwqVar.d);
    }
}
