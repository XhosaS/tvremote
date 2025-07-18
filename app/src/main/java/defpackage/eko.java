package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eko extends Drawable implements TextContent, Drawable.Callback, dyh {
    private static final Point[] p = {new Point(0, 0), new Point(0, -12), new Point(-12, -12), new Point(-12, 0), new Point(-12, 12), new Point(0, 12), new Point(12, 12), new Point(12, 0), new Point(12, -12), new Point(0, -24), new Point(-24, -24), new Point(-24, 0), new Point(-24, 24), new Point(0, 24), new Point(24, 24), new Point(24, 0), new Point(24, -24)};
    public Layout a;
    public float c;
    public boolean d;
    public boolean e;
    public CharSequence f;
    public ColorStateList g;
    public int h;
    public int i;
    public ImageSpan[] j;
    public ekn k;
    public boolean l;
    public Handler m;
    public String n;
    public mxq o;
    private int q;
    private int r;
    private Path s;
    private boolean t;
    private Paint u;
    private ekm v;

    private final int c(int i, int i2) {
        float paragraphRight;
        float lineLeft;
        int lineForVertical = this.a.getLineForVertical(i2);
        if (this.a.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
            lineLeft = this.a.getLineLeft(lineForVertical);
            paragraphRight = this.a.getLineRight(lineForVertical);
        } else {
            boolean z = this.a.getParagraphDirection(lineForVertical) == -1;
            float width = z ? this.a.getWidth() - this.a.getLineMax(lineForVertical) : this.a.getParagraphLeft(lineForVertical);
            paragraphRight = z ? this.a.getParagraphRight(lineForVertical) : this.a.getLineMax(lineForVertical);
            lineLeft = width;
        }
        float f = i;
        if (f >= lineLeft && f <= paragraphRight) {
            try {
                return this.a.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    private final ClickableSpan d(int i, int i2) {
        ClickableSpan[] clickableSpanArr;
        int iC = c(i, i2);
        if (iC >= 0 && (clickableSpanArr = (ClickableSpan[]) ((Spanned) this.f).getSpans(iC, iC, ClickableSpan.class)) != null && clickableSpanArr.length > 0) {
            return clickableSpanArr[0];
        }
        return null;
    }

    private final void g() {
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacks(this.v);
            this.v = null;
        }
        this.l = false;
    }

    private static boolean h(Rect rect, MotionEvent motionEvent) {
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private final boolean i(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = true;
        } else if (actionMasked == 0) {
            actionMasked = 0;
            z = true;
        } else {
            z = false;
        }
        return (this.e && h(getBounds(), motionEvent) && z) || actionMasked == 3;
    }

    private final boolean j(MotionEvent motionEvent) {
        return (!this.e || this.m == null || motionEvent.getAction() == 0) ? false : true;
    }

    public final void a(int i, int i2) {
        if (Color.alpha(this.i) != 0) {
            if (this.q == i && this.r == i2) {
                return;
            }
            this.q = i;
            this.r = i2;
            Paint paint = this.u;
            if (paint == null) {
                Paint paint2 = new Paint();
                this.u = paint2;
                paint2.setColor(this.i);
            } else {
                paint.setColor(this.i);
            }
            this.t = true;
            invalidateSelf();
        }
    }

    public final void b() {
        mxp[] mxpVarArr;
        this.a = null;
        this.c = 0.0f;
        this.f = null;
        this.e = false;
        this.i = 0;
        this.k = null;
        this.g = null;
        this.h = 0;
        mxq mxqVar = this.o;
        if (mxqVar != null && (mxpVarArr = mxqVar.a) != null) {
            for (mxp mxpVar : mxpVarArr) {
                mxpVar.b();
            }
            mxqVar.a = null;
        }
        this.o = null;
        ImageSpan[] imageSpanArr = this.j;
        if (imageSpanArr != null) {
            for (int i = 0; i < imageSpanArr.length; i++) {
                Drawable drawable = this.j[i].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            this.j = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a == null) {
            return;
        }
        int iSave = canvas.save();
        Rect bounds = getBounds();
        if (this.d) {
            canvas.clipRect(bounds);
        }
        canvas.translate(bounds.left, bounds.top + this.c);
        mxq mxqVar = this.o;
        if (mxqVar != null) {
            mxqVar.d();
            this.o.a(canvas);
        }
        try {
            Layout layout = this.a;
            Path path = null;
            if (this.q != this.r && Color.alpha(this.i) != 0) {
                if (this.t) {
                    if (this.s == null) {
                        this.s = new Path();
                    }
                    this.a.getSelectionPath(this.q, this.r, this.s);
                    this.t = false;
                }
                path = this.s;
            }
            layout.draw(canvas, path, this.u, 0);
            mxq mxqVar2 = this.o;
            if (mxqVar2 != null) {
                mxqVar2.c();
                this.o.d();
            }
            canvas.restoreToCount(iSave);
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(" [");
            sb.append(this.n);
            sb.append("] ");
            CharSequence charSequence = this.f;
            if (charSequence instanceof SpannableStringBuilder) {
                Object[] spans = ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), Object.class);
                sb.append("spans: ");
                for (Object obj : spans) {
                    sb.append(obj.getClass().getSimpleName());
                    sb.append(", ");
                }
            }
            sb.append("ellipsizedWidth: ");
            sb.append(this.a.getEllipsizedWidth());
            sb.append(", lineCount: ");
            sb.append(this.a.getLineCount());
            throw new IndexOutOfBoundsException(String.valueOf(message).concat(sb.toString()));
        }
    }

    @Override // defpackage.dyh
    public final boolean e(MotionEvent motionEvent, View view) {
        ClickableSpan clickableSpanD;
        mxp[] mxpVarArr;
        if (i(motionEvent) || j(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 3) {
                a(0, 0);
                g();
            } else {
                if (actionMasked == 2) {
                    if (!this.l && this.v != null) {
                        Rect bounds = getBounds();
                        if (!h(bounds, motionEvent)) {
                            g();
                        } else if (this.v.a != d(((int) motionEvent.getX()) - bounds.left, ((int) motionEvent.getY()) - bounds.top)) {
                            g();
                        }
                    }
                    actionMasked = 2;
                }
                boolean z = this.l;
                if (actionMasked == 1) {
                    g();
                    actionMasked = 1;
                }
                Rect bounds2 = getBounds();
                if (h(bounds2, motionEvent)) {
                    int x = ((int) motionEvent.getX()) - bounds2.left;
                    int y = ((int) motionEvent.getY()) - bounds2.top;
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 0) {
                        Point[] pointArr = p;
                        int length = pointArr.length;
                        int i = 0;
                        ClickableSpan clickableSpan = null;
                        while (true) {
                            if (i >= 17) {
                                clickableSpanD = clickableSpan;
                                break;
                            }
                            Point point = pointArr[i];
                            mxq mxqVar = this.o;
                            if (mxqVar != null && (mxpVarArr = mxqVar.a) != null) {
                                for (mxp mxpVar : mxpVarArr) {
                                }
                            }
                            ClickableSpan clickableSpanD2 = d(point.x + x, point.y + y);
                            if (clickableSpanD2 != null) {
                                clickableSpanD = clickableSpanD2;
                                break;
                            }
                            int iC = c(point.x + x, point.y + y);
                            if (((elc[]) ((Spanned) this.f).getSpans(iC, iC, elc.class)).length > 0) {
                                clickableSpanD = null;
                                break;
                            }
                            i++;
                            clickableSpan = clickableSpanD2;
                        }
                    } else {
                        clickableSpanD = d(x, y);
                    }
                    if (clickableSpanD != null) {
                        if (actionMasked == 1) {
                            a(0, 0);
                            if (!z) {
                                boolean z2 = ebc.a;
                                clickableSpanD.onClick(view);
                            }
                        } else if (actionMasked == 0) {
                            if (clickableSpanD instanceof ehg) {
                                ekm ekmVar = new ekm(this, (ehg) clickableSpanD, view);
                                this.v = ekmVar;
                                this.m.postDelayed(ekmVar, ViewConfiguration.getLongPressTimeout());
                            }
                            Spanned spanned = (Spanned) this.f;
                            a(spanned.getSpanStart(clickableSpanD), spanned.getSpanEnd(clickableSpanD));
                        }
                        return true;
                    }
                    a(0, 0);
                }
            }
        }
        return false;
    }

    @Override // defpackage.dyh
    public final boolean f(MotionEvent motionEvent) {
        return i(motionEvent) || j(motionEvent);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // com.facebook.litho.TextContent
    public final List getTextItems() {
        CharSequence charSequence = this.f;
        return charSequence != null ? Collections.singletonList(charSequence) : Collections.EMPTY_LIST;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.g != null;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Layout layout;
        if (this.g != null && (layout = this.a) != null) {
            int color = layout.getPaint().getColor();
            int colorForState = this.g.getColorForState(iArr, this.h);
            if (colorForState != color) {
                this.a.getPaint().setColor(colorForState);
                invalidateSelf();
            }
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
