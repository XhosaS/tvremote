package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnb implements dnc {
    final Set a = Collections.newSetFromMap(new WeakHashMap());
    volatile boolean b;

    @Override // defpackage.dnc
    public final void a(Activity activity) {
        if (!this.b && this.a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new dna(this, decorView));
        }
    }
}
