package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.google.android.apps.tvsearch.platform.account.state.ReauthSettingsActivity;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxm {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/account/state/ReauthSettingsActivityPeer");
    public static final Duration b;
    public final ReauthSettingsActivity c;
    public final Context d;
    public final gph e;
    public final jrs f;
    public final agow g;
    public final idl h;
    public final ghr i;
    public boolean j;
    public Account k;
    public Account l;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(10L);
        durationOfMinutes.getClass();
        b = durationOfMinutes;
    }

    public gxm(ReauthSettingsActivity reauthSettingsActivity, Context context, gph gphVar, jrs jrsVar, agow agowVar, idl idlVar, ghr ghrVar) {
        context.getClass();
        agowVar.getClass();
        idlVar.getClass();
        ghrVar.getClass();
        this.c = reauthSettingsActivity;
        this.d = context;
        this.e = gphVar;
        this.f = jrsVar;
        this.g = agowVar;
        this.h = idlVar;
        this.i = ghrVar;
    }

    public final Account a() {
        return Build.VERSION.SDK_INT >= 33 ? (Account) this.c.getIntent().getParcelableExtra("reauthAccount", Account.class) : (Account) this.c.getIntent().getParcelableExtra("reauthAccount");
    }

    public final boolean b(boolean z) {
        return ((Boolean) this.g.a()).booleanValue() && z;
    }
}
