package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class teb {
    public final View a;
    public float b = 0.0f;

    public teb(View view) {
        this.a = view;
    }

    public final void a(float f, int i, int i2) {
        this.a.animate().z(f).setDuration(i).setStartDelay(i2);
    }

    public final void b(float f) {
        View view = this.a;
        if (view == null) {
            this.b = f;
        } else {
            view.setTranslationY(f);
        }
    }
}
