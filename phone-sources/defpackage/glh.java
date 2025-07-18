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
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glh extends gkz {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public glf b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public glh() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new glf();
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static glh b(Resources resources, int i, Resources.Theme theme) {
        glh glhVar = new glh();
        ThreadLocal threadLocal = cso.a;
        glhVar.e = resources.getDrawable(i, theme);
        return glhVar;
    }

    public static glh c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        glh glhVar = new glh();
        glhVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return glhVar;
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

    final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
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
        int iMin = Math.min(RecyclerView.ItemAnimator.FLAG_MOVED, (int) (rect.width() * fAbs));
        int iMin2 = Math.min(RecyclerView.ItemAnimator.FLAG_MOVED, (int) (rect.height() * fAbs2));
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
        glf glfVar = this.b;
        Bitmap bitmap = glfVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != glfVar.f.getHeight()) {
            glfVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            glfVar.k = true;
        }
        if (this.c) {
            glf glfVar2 = this.b;
            if (glfVar2.k || glfVar2.g != glfVar2.c || glfVar2.h != glfVar2.d || glfVar2.j != glfVar2.e || glfVar2.i != glfVar2.b.getRootAlpha()) {
                this.b.a(iMin, iMin2);
                glf glfVar3 = this.b;
                glfVar3.g = glfVar3.c;
                glfVar3.h = glfVar3.d;
                glfVar3.i = glfVar3.b.getRootAlpha();
                glfVar3.j = glfVar3.e;
                glfVar3.k = false;
            }
        } else {
            this.b.a(iMin, iMin2);
        }
        glf glfVar4 = this.b;
        if (glfVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (glfVar4.l == null) {
                glfVar4.l = new Paint();
                glfVar4.l.setFilterBitmap(true);
            }
            glfVar4.l.setAlpha(glfVar4.b.getRootAlpha());
            glfVar4.l.setColorFilter(colorFilter);
            paint = glfVar4.l;
        }
        canvas.drawBitmap(glfVar4.f, (Rect) null, rect, paint);
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
            return new glg(drawable.getConstantState());
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
        glf glfVar = this.b;
        if (glfVar == null) {
            return false;
        }
        if (glfVar.b()) {
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
            this.b = new glf(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.gkz, android.graphics.drawable.Drawable
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
        glf glfVar = this.b;
        ColorStateList colorStateList = glfVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = glfVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (glfVar.b()) {
            boolean zC = glfVar.b.d.c(iArr);
            glfVar.k |= zC;
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
        glf glfVar = this.b;
        if (glfVar.c != colorStateList) {
            glfVar.c = colorStateList;
            this.d = d(colorStateList, glfVar.d);
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
        glf glfVar = this.b;
        if (glfVar.d != mode) {
            glfVar.d = mode;
            this.d = d(glfVar.c, mode);
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
        boolean z;
        int i;
        int i2;
        int i3;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        glf glfVar = this.b;
        glfVar.b = new gle();
        TypedArray typedArrayL = crn.l(resources, theme, attributeSet, gks.a);
        glf glfVar2 = this.b;
        gle gleVar = glfVar2.b;
        glfVar2.d = a.ae(crn.j(typedArrayL, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListU = crn.u(typedArrayL, xmlPullParser, theme);
        if (colorStateListU != null) {
            glfVar2.c = colorStateListU;
        }
        glfVar2.e = crn.s(typedArrayL, xmlPullParser, glfVar2.e);
        gleVar.g = crn.h(typedArrayL, xmlPullParser, "viewportWidth", 7, gleVar.g);
        float fH = crn.h(typedArrayL, xmlPullParser, "viewportHeight", 8, gleVar.h);
        gleVar.h = fH;
        if (gleVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayL.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fH > 0.0f) {
            int i4 = 3;
            gleVar.e = typedArrayL.getDimension(3, gleVar.e);
            int i5 = 2;
            float dimension = typedArrayL.getDimension(2, gleVar.f);
            gleVar.f = dimension;
            if (gleVar.e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(typedArrayL.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension > 0.0f) {
                gleVar.setAlpha(crn.h(typedArrayL, xmlPullParser, "alpha", 4, gleVar.getAlpha()));
                boolean z2 = false;
                String string = typedArrayL.getString(0);
                if (string != null) {
                    gleVar.j = string;
                    gleVar.l.put(string, gleVar);
                }
                typedArrayL.recycle();
                glfVar.a = getChangingConfigurations();
                glfVar.k = true;
                glf glfVar3 = this.b;
                gle gleVar2 = glfVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(gleVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i6 = 1; eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i4); i6 = 1) {
                    if (eventType == i5) {
                        String name = xmlPullParser.getName();
                        glc glcVar = (glc) arrayDeque.peek();
                        if (glcVar != null) {
                            if ("path".equals(name)) {
                                glb glbVar = new glb();
                                TypedArray typedArrayL2 = crn.l(resources, theme, attributeSet, gks.c);
                                glbVar.a = null;
                                if (crn.p(xmlPullParser, "pathData")) {
                                    String string2 = typedArrayL2.getString(0);
                                    if (string2 != null) {
                                        glbVar.n = string2;
                                    }
                                    String string3 = typedArrayL2.getString(2);
                                    if (string3 != null) {
                                        glbVar.m = crn.e(string3);
                                    }
                                    glbVar.l = crn.A(typedArrayL2, xmlPullParser, theme, "fillColor", 1);
                                    i2 = depth;
                                    glbVar.d = crn.h(typedArrayL2, xmlPullParser, "fillAlpha", 12, glbVar.d);
                                    int iJ = crn.j(typedArrayL2, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = glbVar.h;
                                    if (iJ == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (iJ == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (iJ == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    glbVar.h = cap;
                                    int iJ2 = crn.j(typedArrayL2, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = glbVar.i;
                                    if (iJ2 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (iJ2 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (iJ2 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    glbVar.i = join;
                                    glbVar.j = crn.h(typedArrayL2, xmlPullParser, "strokeMiterLimit", 10, glbVar.j);
                                    glbVar.k = crn.A(typedArrayL2, xmlPullParser, theme, "strokeColor", 3);
                                    glbVar.c = crn.h(typedArrayL2, xmlPullParser, "strokeAlpha", 11, glbVar.c);
                                    glbVar.b = crn.h(typedArrayL2, xmlPullParser, "strokeWidth", 4, glbVar.b);
                                    glbVar.f = crn.h(typedArrayL2, xmlPullParser, "trimPathEnd", 6, glbVar.f);
                                    glbVar.g = crn.h(typedArrayL2, xmlPullParser, "trimPathOffset", 7, glbVar.g);
                                    glbVar.e = crn.h(typedArrayL2, xmlPullParser, "trimPathStart", 5, glbVar.e);
                                    glbVar.o = crn.j(typedArrayL2, xmlPullParser, "fillType", 13, glbVar.o);
                                } else {
                                    i2 = depth;
                                }
                                typedArrayL2.recycle();
                                glcVar.b.add(glbVar);
                                if (glbVar.getPathName() != null) {
                                    gleVar2.l.put(glbVar.getPathName(), glbVar);
                                }
                                int i7 = glfVar3.a;
                                z = false;
                                i = 3;
                                z3 = false;
                            } else {
                                i2 = depth;
                                if ("clip-path".equals(name)) {
                                    gla glaVar = new gla();
                                    if (crn.p(xmlPullParser, "pathData")) {
                                        TypedArray typedArrayL3 = crn.l(resources, theme, attributeSet, gks.d);
                                        String string4 = typedArrayL3.getString(0);
                                        if (string4 != null) {
                                            glaVar.n = string4;
                                        }
                                        String string5 = typedArrayL3.getString(1);
                                        if (string5 != null) {
                                            glaVar.m = crn.e(string5);
                                        }
                                        glaVar.o = crn.j(typedArrayL3, xmlPullParser, "fillType", 2, 0);
                                        typedArrayL3.recycle();
                                    }
                                    glcVar.b.add(glaVar);
                                    if (glaVar.getPathName() != null) {
                                        gleVar2.l.put(glaVar.getPathName(), glaVar);
                                    }
                                    int i8 = glfVar3.a;
                                    z = false;
                                    i = 3;
                                } else if ("group".equals(name)) {
                                    glc glcVar2 = new glc();
                                    TypedArray typedArrayL4 = crn.l(resources, theme, attributeSet, gks.b);
                                    glcVar2.l = null;
                                    glcVar2.c = crn.h(typedArrayL4, xmlPullParser, "rotation", 5, glcVar2.c);
                                    glcVar2.d = typedArrayL4.getFloat(1, glcVar2.d);
                                    glcVar2.e = typedArrayL4.getFloat(2, glcVar2.e);
                                    glcVar2.f = crn.h(typedArrayL4, xmlPullParser, "scaleX", 3, glcVar2.f);
                                    glcVar2.g = crn.h(typedArrayL4, xmlPullParser, "scaleY", 4, glcVar2.g);
                                    glcVar2.h = crn.h(typedArrayL4, xmlPullParser, "translateX", 6, glcVar2.h);
                                    glcVar2.i = crn.h(typedArrayL4, xmlPullParser, "translateY", 7, glcVar2.i);
                                    z = false;
                                    String string6 = typedArrayL4.getString(0);
                                    if (string6 != null) {
                                        glcVar2.m = string6;
                                    }
                                    glcVar2.a();
                                    typedArrayL4.recycle();
                                    glcVar.b.add(glcVar2);
                                    arrayDeque.push(glcVar2);
                                    if (glcVar2.getGroupName() != null) {
                                        gleVar2.l.put(glcVar2.getGroupName(), glcVar2);
                                    }
                                    int i9 = glfVar3.a;
                                    i = 3;
                                } else {
                                    z = false;
                                }
                            }
                            i3 = 2;
                        } else {
                            z = z2;
                            i2 = depth;
                        }
                        i = 3;
                        i3 = 2;
                    } else {
                        z = z2;
                        i = i4;
                        i2 = depth;
                        i3 = i5;
                        if (eventType == i && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i;
                    i5 = i3;
                    depth = i2;
                    z2 = z;
                }
                if (!z3) {
                    this.d = d(glfVar.c, glfVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(String.valueOf(typedArrayL.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        throw new XmlPullParserException(String.valueOf(typedArrayL.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
    }

    public glh(glf glfVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = glfVar;
        this.d = d(glfVar.c, glfVar.d);
    }
}
