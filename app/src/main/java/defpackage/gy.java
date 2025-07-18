package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
class gy extends ha {
    public final PowerManager a;
    final /* synthetic */ hf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(hf hfVar, Context context) {
        super(hfVar);
        this.b = hfVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.ha
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.ha
    public final void b() {
        this.b.J(true, true);
    }
}
