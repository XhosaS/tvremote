package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.play.movies.mobile.service.remote.NotificationTransportListenerService;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mjs extends mkf {
    public final Context a;
    public NotificationTransportListenerService b;
    private boolean d;
    private int e;

    protected mjs(mkc mkcVar, Context context) {
        super(mkcVar);
        this.e = 0;
        this.a = context;
    }

    private final void h() {
        mkc mkcVar = this.c;
        boolean z = (mkcVar.b() == null || mkcVar.a() == null || mkcVar.a().b == 0 || TextUtils.isEmpty(mkcVar.h())) ? false : true;
        if (this.d == z) {
            return;
        }
        if (z) {
            krd.e("Remote notification show() called");
            if (this.d) {
                return;
            }
            Context context = this.a;
            ksk.k(context, new Intent(context, (Class<?>) NotificationTransportListenerService.class));
            this.d = true;
            return;
        }
        krd.e("Remote notification hide() called");
        if (this.d) {
            this.d = false;
            Context context2 = this.a;
            context2.stopService(new Intent(context2, (Class<?>) NotificationTransportListenerService.class));
        }
    }

    @Override // defpackage.mkf
    public final void a() {
        h();
        mjy mjyVarA = this.c.a();
        NotificationTransportListenerService notificationTransportListenerService = this.b;
        if (notificationTransportListenerService == null || mjyVarA == null) {
            this.e = 0;
            return;
        }
        int i = mjyVarA.b;
        if (i != this.e) {
            this.e = i;
            g(notificationTransportListenerService);
        }
    }

    @Override // defpackage.mkf
    public final void b() {
        NotificationTransportListenerService notificationTransportListenerService = this.b;
        if (notificationTransportListenerService != null) {
            g(notificationTransportListenerService);
        }
    }

    public final String c() {
        mkc mkcVar = this.c;
        String strH = mkcVar.h();
        mjy mjyVarA = mkcVar.a();
        krf.b();
        mjw mjwVar = mkcVar.d;
        if (mjwVar != null && mjwVar.c != 0) {
            return mkcVar.f();
        }
        if (mjyVarA == null) {
            return "";
        }
        Context context = this.a;
        int i = mjyVarA.b;
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? mjyVarA.e : context.getString(R.string.remote_notification_finished, strH) : context.getString(R.string.remote_notification_paused, strH) : context.getString(R.string.remote_notification_playing, strH) : context.getString(R.string.remote_notification_loading, strH);
    }

    @Override // defpackage.mkf
    public final void d() {
        NotificationTransportListenerService notificationTransportListenerService = this.b;
        if (notificationTransportListenerService != null) {
            g(notificationTransportListenerService);
        }
    }

    @Override // defpackage.mkf
    public final void e() {
        NotificationTransportListenerService notificationTransportListenerService = this.b;
        if (notificationTransportListenerService != null) {
            g(notificationTransportListenerService);
        }
    }

    @Override // defpackage.mkf
    public final void f() {
        h();
        NotificationTransportListenerService notificationTransportListenerService = this.b;
        if (notificationTransportListenerService != null) {
            g(notificationTransportListenerService);
        }
    }

    protected abstract void g(NotificationTransportListenerService notificationTransportListenerService);
}
