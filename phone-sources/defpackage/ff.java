package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ff implements gm {
    public final /* synthetic */ fl a;
    private final /* synthetic */ int b;

    public /* synthetic */ ff(fl flVar, int i) {
        this.b = i;
        this.a = flVar;
    }

    @Override // defpackage.gm
    public final void onContextAvailable(Context context) {
        if (this.b != 0) {
            ((by) this.a).m83lambda$init$3$androidsupportv4appFragmentActivity(context);
        } else {
            fl._init_$lambda$7(this.a, context);
        }
    }
}
