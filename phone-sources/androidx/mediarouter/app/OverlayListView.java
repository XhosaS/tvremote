package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class OverlayListView extends ListView {
    private final List a;

    /* compiled from: PG */
    public class OverlayObject {
        private final BitmapDrawable a;
        private final Rect c;
        private Interpolator d;
        private long e;
        private final Rect f;
        private int g;
        private long j;
        private boolean k;
        private boolean l;
        private OnAnimationEndListener m;
        private float b = 1.0f;
        private float h = 1.0f;
        private float i = 1.0f;

        /* compiled from: PG */
        public interface OnAnimationEndListener {
            void onAnimationEnd();
        }

        public OverlayObject(BitmapDrawable bitmapDrawable, Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            Rect rect2 = new Rect(rect);
            this.c = rect2;
            if (bitmapDrawable != null) {
                bitmapDrawable.setAlpha((int) (this.b * 255.0f));
                bitmapDrawable.setBounds(rect2);
            }
        }

        public BitmapDrawable getBitmapDrawable() {
            return this.a;
        }

        public boolean isAnimationStarted() {
            return this.k;
        }

        public OverlayObject setAlphaAnimation(float f, float f2) {
            this.h = f;
            this.i = f2;
            return this;
        }

        public OverlayObject setAnimationEndListener(OnAnimationEndListener onAnimationEndListener) {
            this.m = onAnimationEndListener;
            return this;
        }

        public OverlayObject setDuration(long j) {
            this.e = j;
            return this;
        }

        public OverlayObject setInterpolator(Interpolator interpolator) {
            this.d = interpolator;
            return this;
        }

        public OverlayObject setTranslateYAnimation(int i) {
            this.g = i;
            return this;
        }

        public void startAnimation(long j) {
            this.j = j;
            this.k = true;
        }

        public void stopAnimation() {
            this.k = true;
            this.l = true;
            OnAnimationEndListener onAnimationEndListener = this.m;
            if (onAnimationEndListener != null) {
                onAnimationEndListener.onAnimationEnd();
            }
        }

        public boolean update(long j) {
            if (this.l) {
                return false;
            }
            float fMax = true == this.k ? Math.max(0.0f, Math.min(1.0f, (j - this.j) / this.e)) : 0.0f;
            Interpolator interpolator = this.d;
            float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
            float f = this.g;
            Rect rect = this.c;
            Rect rect2 = this.f;
            int i = (int) (f * interpolation);
            rect.top = rect2.top + i;
            rect.bottom = rect2.bottom + i;
            float f2 = this.h;
            float f3 = f2 + ((this.i - f2) * interpolation);
            this.b = f3;
            BitmapDrawable bitmapDrawable = this.a;
            if (bitmapDrawable != null) {
                bitmapDrawable.setAlpha((int) (f3 * 255.0f));
                bitmapDrawable.setBounds(rect);
            }
            if (this.k && fMax >= 1.0f) {
                this.l = true;
                OnAnimationEndListener onAnimationEndListener = this.m;
                if (onAnimationEndListener != null) {
                    onAnimationEndListener.onAnimationEnd();
                }
            }
            return !this.l;
        }
    }

    public OverlayListView(Context context) {
        super(context);
        this.a = new ArrayList();
    }

    public void addOverlayObject(OverlayObject overlayObject) {
        this.a.add(overlayObject);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List list = this.a;
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OverlayObject overlayObject = (OverlayObject) it.next();
                BitmapDrawable bitmapDrawable = overlayObject.getBitmapDrawable();
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                if (!overlayObject.update(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }

    public void startAnimationAll() {
        for (OverlayObject overlayObject : this.a) {
            if (!overlayObject.isAnimationStarted()) {
                overlayObject.startAnimation(getDrawingTime());
            }
        }
    }

    public void stopAnimationAll() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((OverlayObject) it.next()).stopAnimation();
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ArrayList();
    }
}
