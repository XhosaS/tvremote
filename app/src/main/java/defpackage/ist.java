package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ist implements ism {
    private final Context a;
    private final boolean b;
    private final String c;

    public ist(Context context) {
        context.getClass();
        this.a = context;
        context.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.tv.FIND_MY_REMOTE"), 0).getClass();
        this.b = !r3.isEmpty();
        this.c = "action.devices.traits.Locator";
    }

    @Override // defpackage.ism
    public final Object a(agsw agswVar) {
        return agrj.d(new agpi("isRingable", new abax((Object) true)), new agpi("isSilenceable", new abax((Object) true)), new agpi("reportsLocation", new abax((Object) false)));
    }

    @Override // defpackage.ism
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ism
    public final boolean c() {
        return this.b;
    }
}
