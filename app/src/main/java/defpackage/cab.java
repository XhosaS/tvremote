package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cab {
    static final /* synthetic */ cab a = new cab();

    private cab() {
    }

    public final cac a() {
        return Build.VERSION.SDK_INT >= 34 ? cae.b : Build.VERSION.SDK_INT >= 30 ? cad.b : caf.b;
    }
}
