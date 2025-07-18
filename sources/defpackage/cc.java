package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cc extends ce {
    public final PowerManager a;
    final /* synthetic */ cj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(cj cjVar, Context context) {
        super(cjVar);
        this.b = cjVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.ce
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.ce
    public final void b() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.b.L();
    }
}
