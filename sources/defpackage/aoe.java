package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoe {
    public boolean a = false;
    public boolean b = false;

    public final void a(Context context) {
        if (this.b) {
            aog.a(context);
            aog.b();
        } else if (this.a) {
            aog.b();
        }
    }

    public final boolean b() {
        return this.a || this.b;
    }
}
