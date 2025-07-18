package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suv {
    public float b;
    public WeakReference d;
    public syh e;
    private float g;
    public final TextPaint a = new TextPaint(1);
    private final syi f = new sut(this);
    public boolean c = true;

    public suv(suu suuVar) {
        this.d = new WeakReference(null);
        this.d = new WeakReference(suuVar);
    }

    public final float a(String str) {
        if (!this.c) {
            return this.g;
        }
        b(str);
        return this.g;
    }

    public final void b(String str) {
        this.g = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.b = str != null ? Math.abs(this.a.getFontMetrics().ascent) : 0.0f;
        this.c = false;
    }

    public final void c(syh syhVar, Context context) {
        if (this.e != syhVar) {
            this.e = syhVar;
            if (syhVar != null) {
                TextPaint textPaint = this.a;
                syi syiVar = this.f;
                syhVar.d(context, textPaint, syiVar);
                suu suuVar = (suu) this.d.get();
                if (suuVar != null) {
                    textPaint.drawableState = suuVar.getState();
                }
                syhVar.c(context, textPaint, syiVar);
                this.c = true;
            }
            suu suuVar2 = (suu) this.d.get();
            if (suuVar2 != null) {
                suuVar2.g();
                suuVar2.onStateChange(suuVar2.getState());
            }
        }
    }

    public final void d(Context context) {
        this.e.c(context, this.a, this.f);
    }

    public final void f() {
        this.c = true;
    }

    public final void g() {
        this.c = true;
    }
}
