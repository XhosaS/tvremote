package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class mn extends acm {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ ms d;

    public mn(ms msVar, int i, int i2, WeakReference weakReference) {
        this.d = msVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.acm
    public final void a(Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        ms msVar = this.d;
        WeakReference weakReference = this.c;
        if (msVar.c) {
            msVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new mo(textView, typeface, msVar.a));
                } else {
                    ms.b(textView, typeface, msVar.a);
                }
            }
        }
    }
}
