package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdk implements View.OnLayoutChangeListener, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int c = 0;
    public int a;
    public ImageView b;
    private final hkg d;
    private final String e;

    public sdk() {
        throw null;
    }

    public final void a(ImageView imageView) {
        if (imageView != null) {
            this.b = imageView;
            imageView.setTag(R.id.play__image_binder, this);
            this.b.addOnLayoutChangeListener(this);
            this.b.addOnAttachStateChangeListener(this);
            b(1);
            return;
        }
        if (this.a > 0) {
            b(0);
            this.b.removeOnLayoutChangeListener(this);
            this.b.removeOnAttachStateChangeListener(this);
            this.b.setTag(R.id.play__image_binder, null);
            this.b = null;
        }
    }

    public final void b(int i) {
        int i2 = this.a;
        if (i > i2) {
            while (true) {
                int i3 = this.a;
                if (i <= i3) {
                    return;
                }
                int i4 = i3 + 1;
                this.a = i4;
                if (i4 == 1) {
                    c(0);
                } else if (i4 != 2) {
                    c(2);
                } else {
                    c(1);
                }
            }
        } else {
            if (i >= i2) {
                if (i == i2 && i2 == 3) {
                    c(2);
                    return;
                }
                return;
            }
            while (true) {
                int i5 = this.a;
                if (i >= i5) {
                    return;
                }
                int i6 = i5 - 1;
                this.a = i6;
                if (i6 == 0) {
                    c(4);
                } else if (i6 == 1) {
                    c(3);
                }
            }
        }
    }

    protected final void c(int i) {
        if (i == 2) {
            hkg hkgVar = this.d;
            hkgVar.g(this.e).k(this.b);
        } else if (i == 3) {
            hkg hkgVar2 = this.d;
            ImageView imageView = this.b;
            hkgVar2.i(imageView);
            imageView.setImageDrawable(null);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        b(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        b(2);
        int[] iArr = cww.a;
        if (view.isLaidOut() || (view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0)) {
            b(3);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b(1);
    }

    public sdk(Context context, String str) {
        this.d = hjr.c(context);
        this.e = str;
    }
}
