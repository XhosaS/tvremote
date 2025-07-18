package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class no {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ gi d;

    public no() {
        throw null;
    }

    public static Handler c() {
        return new Handler(Looper.getMainLooper());
    }

    public static final void d() {
        c().post(new om(1));
    }

    public final void a(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        gi giVar = this.d;
        WeakReference weakReference = this.c;
        if (giVar.c) {
            giVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new bee(textView, typeface, giVar.a, 1));
                } else {
                    gi.f(textView, typeface, giVar.a);
                }
            }
        }
    }

    public final void b(Typeface typeface) {
        c().post(new bb(this, typeface, 11));
    }

    public no(gi giVar, int i, int i2, WeakReference weakReference) {
        this.d = giVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }
}
