package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gon implements gom {
    private final /* synthetic */ int c;
    public static final gon b = new gon(1);
    public static final gon a = new gon(0);

    private gon(int i) {
        this.c = i;
    }

    @Override // defpackage.gom
    public final float a(Context context) {
        return this.c != 0 ? ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity() : context.getResources().getDisplayMetrics().density;
    }
}
