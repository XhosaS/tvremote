package defpackage;

import android.content.IntentFilter;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cf extends ce {
    final /* synthetic */ cj a;
    public final bzt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(cj cjVar, bzt bztVar) {
        super(cjVar);
        this.a = cjVar;
        this.b = bztVar;
    }

    @Override // defpackage.ce
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.ce
    public final void b() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.a.L();
    }
}
