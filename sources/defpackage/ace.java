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
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ace extends abw {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public acc b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public ace() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new acc();
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
        acc accVar = this.b;
        Bitmap bitmap = accVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != accVar.f.getHeight()) {
            accVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            accVar.k = true;
        }
        if (this.c) {
            acc accVar2 = this.b;
            if (accVar2.k || accVar2.g != accVar2.c || accVar2.h != accVar2.d || accVar2.j != accVar2.e || accVar2.i != accVar2.b.getRootAlpha()) {
                this.b.a(iMin, iMin2);
                acc accVar3 = this.b;
                accVar3.g = accVar3.c;
                accVar3.h = accVar3.d;
                accVar3.i = accVar3.b.getRootAlpha();
                accVar3.j = accVar3.e;
                accVar3.k = false;
            }
        } else {
            this.b.a(iMin, iMin2);
        }
        acc accVar4 = this.b;
        if (accVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (accVar4.l == null) {
                accVar4.l = new Paint();
                accVar4.l.setFilterBitmap(true);
            }
            accVar4.l.setAlpha(accVar4.b.getRootAlpha());
            accVar4.l.setColorFilter(colorFilter);
            paint = accVar4.l;
        }
        canvas.drawBitmap(accVar4.f, (Rect) null, rect, paint);
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
            return new acd(drawable.getConstantState());
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
        acc accVar = this.b;
        if (accVar == null) {
            return false;
        }
        if (accVar.b()) {
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
            this.b = new acc(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.abw, android.graphics.drawable.Drawable
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
        acc accVar = this.b;
        ColorStateList colorStateList = accVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = accVar.d) != null) {
            this.d = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (accVar.b()) {
            boolean zO = accVar.b.d.o(iArr);
            accVar.k |= zO;
            if (zO) {
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
        acc accVar = this.b;
        if (accVar.c != colorStateList) {
            accVar.c = colorStateList;
            this.d = b(colorStateList, accVar.d);
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
        acc accVar = this.b;
        if (accVar.d != mode) {
            accVar.d = mode;
            this.d = b(accVar.c, mode);
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
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        acc accVar = this.b;
        accVar.b = new acb();
        TypedArray typedArrayS = mo.S(resources, theme, attributeSet, abo.a);
        acc accVar2 = this.b;
        acb acbVar = accVar2.b;
        accVar2.d = ii.V(mo.R(typedArrayS, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        boolean z2 = false;
        int i2 = 2;
        if (mo.T(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayS.getValue(1, typedValue);
            if (typedValue.type != 2) {
                if (typedValue.type >= 28 && typedValue.type <= 31) {
                    colorStateListA = ColorStateList.valueOf(typedValue.data);
                } else {
                    Resources resources2 = typedArrayS.getResources();
                    int resourceId = typedArrayS.getResourceId(1, 0);
                    int i3 = nk.a;
                    try {
                        colorStateListA = nk.a(resources2, resources2.getXml(resourceId), theme);
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
            accVar2.c = colorStateListA;
        }
        boolean z3 = accVar2.e;
        if (mo.T(xmlPullParser, "autoMirrored")) {
            z3 = typedArrayS.getBoolean(5, z3);
        }
        accVar2.e = z3;
        acbVar.g = mo.Q(typedArrayS, xmlPullParser, "viewportWidth", 7, acbVar.g);
        float fQ = mo.Q(typedArrayS, xmlPullParser, "viewportHeight", 8, acbVar.h);
        acbVar.h = fQ;
        if (acbVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayS.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fQ > 0.0f) {
            int i4 = 3;
            acbVar.e = typedArrayS.getDimension(3, acbVar.e);
            float dimension = typedArrayS.getDimension(2, acbVar.f);
            acbVar.f = dimension;
            if (acbVar.e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(typedArrayS.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension > 0.0f) {
                acbVar.setAlpha(mo.Q(typedArrayS, xmlPullParser, "alpha", 4, acbVar.getAlpha()));
                String string = typedArrayS.getString(0);
                if (string != null) {
                    acbVar.j = string;
                    acbVar.l.put(string, acbVar);
                }
                typedArrayS.recycle();
                accVar.a = getChangingConfigurations();
                accVar.k = true;
                acc accVar3 = this.b;
                acb acbVar2 = accVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(acbVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i4); i5 = 1) {
                    if (eventType == i2) {
                        String name = xmlPullParser.getName();
                        abz abzVar = (abz) arrayDeque.peek();
                        if (abzVar == null) {
                            i = depth;
                            z = z2;
                        } else if ("path".equals(name)) {
                            aby abyVar = new aby();
                            TypedArray typedArrayS2 = mo.S(resources, theme, attributeSet, abo.c);
                            abyVar.a = null;
                            if (mo.T(xmlPullParser, "pathData")) {
                                String string2 = typedArrayS2.getString(0);
                                if (string2 != null) {
                                    abyVar.p = string2;
                                }
                                String string3 = typedArrayS2.getString(2);
                                if (string3 != null) {
                                    abyVar.o = mo.N(string3);
                                }
                                abyVar.n = mo.V(typedArrayS2, xmlPullParser, theme, "fillColor", 1);
                                i = depth;
                                abyVar.f = mo.Q(typedArrayS2, xmlPullParser, "fillAlpha", 12, abyVar.f);
                                int iR = mo.R(typedArrayS2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = abyVar.j;
                                if (iR == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (iR == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (iR == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                abyVar.j = cap;
                                int iR2 = mo.R(typedArrayS2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = abyVar.k;
                                if (iR2 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (iR2 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (iR2 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                abyVar.k = join;
                                abyVar.l = mo.Q(typedArrayS2, xmlPullParser, "strokeMiterLimit", 10, abyVar.l);
                                abyVar.m = mo.V(typedArrayS2, xmlPullParser, theme, "strokeColor", 3);
                                abyVar.e = mo.Q(typedArrayS2, xmlPullParser, "strokeAlpha", 11, abyVar.e);
                                abyVar.b = mo.Q(typedArrayS2, xmlPullParser, "strokeWidth", 4, abyVar.b);
                                abyVar.h = mo.Q(typedArrayS2, xmlPullParser, "trimPathEnd", 6, abyVar.h);
                                abyVar.i = mo.Q(typedArrayS2, xmlPullParser, "trimPathOffset", 7, abyVar.i);
                                abyVar.g = mo.Q(typedArrayS2, xmlPullParser, "trimPathStart", 5, abyVar.g);
                                abyVar.q = mo.R(typedArrayS2, xmlPullParser, "fillType", 13, abyVar.q);
                            } else {
                                i = depth;
                            }
                            typedArrayS2.recycle();
                            abzVar.b.add(abyVar);
                            if (abyVar.getPathName() != null) {
                                acbVar2.l.put(abyVar.getPathName(), abyVar);
                            }
                            int i6 = accVar3.a;
                            i4 = 3;
                            z = false;
                            z4 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                abx abxVar = new abx();
                                if (mo.T(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayS3 = mo.S(resources, theme, attributeSet, abo.d);
                                    String string4 = typedArrayS3.getString(0);
                                    if (string4 != null) {
                                        abxVar.p = string4;
                                    }
                                    String string5 = typedArrayS3.getString(1);
                                    if (string5 != null) {
                                        abxVar.o = mo.N(string5);
                                    }
                                    abxVar.q = mo.R(typedArrayS3, xmlPullParser, "fillType", 2, 0);
                                    typedArrayS3.recycle();
                                }
                                abzVar.b.add(abxVar);
                                if (abxVar.getPathName() != null) {
                                    acbVar2.l.put(abxVar.getPathName(), abxVar);
                                }
                                int i7 = accVar3.a;
                                i4 = 3;
                                z = false;
                            } else if ("group".equals(name)) {
                                abz abzVar2 = new abz();
                                TypedArray typedArrayS4 = mo.S(resources, theme, attributeSet, abo.b);
                                abzVar2.n = null;
                                abzVar2.e = mo.Q(typedArrayS4, xmlPullParser, "rotation", 5, abzVar2.e);
                                abzVar2.f = typedArrayS4.getFloat(1, abzVar2.f);
                                abzVar2.g = typedArrayS4.getFloat(2, abzVar2.g);
                                abzVar2.h = mo.Q(typedArrayS4, xmlPullParser, "scaleX", 3, abzVar2.h);
                                abzVar2.i = mo.Q(typedArrayS4, xmlPullParser, "scaleY", 4, abzVar2.i);
                                abzVar2.j = mo.Q(typedArrayS4, xmlPullParser, "translateX", 6, abzVar2.j);
                                abzVar2.k = mo.Q(typedArrayS4, xmlPullParser, "translateY", 7, abzVar2.k);
                                z = false;
                                String string6 = typedArrayS4.getString(0);
                                if (string6 != null) {
                                    abzVar2.o = string6;
                                }
                                abzVar2.x();
                                typedArrayS4.recycle();
                                abzVar.b.add(abzVar2);
                                arrayDeque.push(abzVar2);
                                if (abzVar2.getGroupName() != null) {
                                    acbVar2.l.put(abzVar2.getGroupName(), abzVar2);
                                }
                                int i8 = accVar3.a;
                                i4 = 3;
                            } else {
                                z = false;
                            }
                        }
                        i4 = 3;
                    } else {
                        i = depth;
                        z = z2;
                        if (eventType == i4 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    z2 = z;
                    depth = i;
                    i2 = 2;
                }
                if (!z4) {
                    this.d = b(accVar.c, accVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(String.valueOf(typedArrayS.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        throw new XmlPullParserException(String.valueOf(typedArrayS.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
    }

    public ace(acc accVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = accVar;
        this.d = b(accVar.c, accVar.d);
    }
}
