package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzz implements bzy {
    public static final bzz a = new bzz();

    private bzz() {
    }

    @Override // defpackage.bzy
    public final float a(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
