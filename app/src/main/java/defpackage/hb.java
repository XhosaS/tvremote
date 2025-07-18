package defpackage;

import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
class hb extends ha {
    public final hm a;
    final /* synthetic */ hf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(hf hfVar, hm hmVar) {
        super(hfVar);
        this.b = hfVar;
        this.a = hmVar;
    }

    @Override // defpackage.ha
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.ha
    public final void b() {
        this.b.J(true, true);
    }
}
