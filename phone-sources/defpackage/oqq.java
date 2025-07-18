package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqq {
    public boolean a = false;
    public boolean b = false;

    public final void a(Context context) {
        if (this.b) {
            oqs.a(context);
            oqs.b();
        } else if (this.a) {
            oqs.b();
        }
    }

    public final boolean b() {
        return this.a || this.b;
    }
}
