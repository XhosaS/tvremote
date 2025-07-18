package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfh extends nez {
    private final Context a;
    private final IntentFilter c = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public nfh(Context context) {
        this.a = context.getApplicationContext();
    }

    private final void A() {
        Intent intentRegisterReceiver = this.a.registerReceiver(null, this.c);
        if (intentRegisterReceiver == null) {
            return;
        }
        float intExtra = intentRegisterReceiver.getIntExtra("level", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
        int i = (intExtra3 == 2 || intExtra3 == 5) ? 1 : 0;
        float f = intExtra / intExtra2;
        nfa nfaVar = this.b;
        StringBuilder sbE = nfaVar.e(SystemClock.elapsedRealtime());
        sbE.append(String.format(Locale.US, "%.3f", Float.valueOf(f)));
        sbE.append(":");
        sbE.append(i);
        nfaVar.f("bat", sbE.toString());
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g("bat");
        A();
    }

    @Override // defpackage.nez
    public final void h(long j, boolean z) {
        A();
    }

    @Override // defpackage.nez
    protected final void i() {
        A();
    }
}
