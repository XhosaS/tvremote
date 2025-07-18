package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgs<T> {
    private T a;
    private WeakReference b;
    private boolean c = false;
    private boolean d = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, android.graphics.Paint, java.lang.Object] */
    public final synchronized Object a() {
        if (!this.c) {
            this.c = true;
            Set set = sgt.a;
            if (sjl.g()) {
                sgt.a.add(this);
                if (sgt.b != -1) {
                    b();
                }
            } else {
                sjl.e(new rtr(this, 20, null));
            }
        }
        T t = this.a;
        if (t != null) {
            return t;
        }
        WeakReference weakReference = this.b;
        Object obj = weakReference == null ? (T) null : weakReference.get();
        if (obj == 0) {
            sgs sgsVar = snq.a;
            obj = (T) new Paint();
            obj.setAntiAlias(true);
            obj.setTextAlign(Paint.Align.CENTER);
            obj.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
            if (this.d) {
                this.a = obj;
                this.b = null;
            } else {
                this.b = new WeakReference(obj);
            }
        }
        return obj;
    }

    public final synchronized void b() {
        if (!this.d) {
            this.d = true;
            if (this.a == null) {
                WeakReference weakReference = this.b;
                T t = weakReference == null ? null : (T) weakReference.get();
                if (t != null) {
                    this.a = t;
                } else {
                    this.b = null;
                }
            }
        }
    }
}
