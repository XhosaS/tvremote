package defpackage;

import com.google.android.apps.googletv.app.account.AccountBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mgv implements xbx {
    private final /* synthetic */ int a;

    public mgv(int i) {
        this.a = i;
    }

    @Override // defpackage.xbx
    public final /* synthetic */ xby a(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((jxk) obj).getClass();
            return new mgw(0);
        }
        if (i == 1) {
            ((AccountBroadcastReceiver) obj).getClass();
            return new mgw(1);
        }
        if (i == 2) {
            ((jyb) obj).getClass();
            return new mgw(2);
        }
        if (i != 3) {
            ((kiq) obj).getClass();
            return new mgw(4);
        }
        ((jbo) obj).getClass();
        return new mgw(3);
    }
}
