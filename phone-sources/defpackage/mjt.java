package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.play.movies.mobile.service.remote.NotificationTransportListenerService;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mjt extends mjs {
    private final eu d;
    private final lfn e;

    public mjt(mkc mkcVar, Context context, eu euVar, lfn lfnVar) {
        super(mkcVar, context);
        this.d = euVar;
        this.e = lfnVar;
    }

    @Override // defpackage.mjs
    public final void g(NotificationTransportListenerService notificationTransportListenerService) {
        krf.b();
        krf.b();
        mkc mkcVar = this.c;
        Bitmap bitmapCopy = mkcVar.e.m() ? ((Bitmap) mkcVar.e.g()).copy(((Bitmap) mkcVar.e.g()).getConfig(), false) : null;
        mkc mkcVar2 = this.c;
        String str = mkcVar2.b() != null ? mkcVar2.b().b : "";
        Context context = this.a;
        String strC = c();
        PendingIntent pendingIntentA = notificationTransportListenerService.a(4);
        PendingIntent pendingIntentA2 = notificationTransportListenerService.a(3);
        lga lgaVarB = lga.b(context, kyt.TEMPORARY, "Transport controls", this.e.cH());
        lgaVarB.k();
        lgaVarB.j(context, bitmapCopy);
        lgaVarB.h(str);
        lgaVarB.g(strC);
        lgaVarB.l();
        crm crmVar = (crm) lgaVarB.c;
        crmVar.y = 1;
        lgaVarB.f(pendingIntentA);
        lgaVarB.i(pendingIntentA2);
        crmVar.x = context.getColor(R.color.remote_notification_background);
        dyl dylVar = new dyl();
        dylVar.d = this.d.b();
        mjy mjyVarA = mkcVar.a();
        if (mkcVar.f() == null && mjyVarA != null) {
            int i = mjyVarA.b;
            if (i == 2 || i == 3) {
                lgaVarB.d(2131231836, context.getString(R.string.accessibility_seek_30s), notificationTransportListenerService.a(5));
                dylVar.c = new int[]{0, 1};
            } else {
                dylVar.c = new int[]{0};
            }
            int i2 = mjyVarA.b;
            if (i2 == 2) {
                lgaVarB.d(2131231838, context.getString(R.string.accessibility_pause), notificationTransportListenerService.a(1));
            } else if (i2 == 3) {
                lgaVarB.d(2131231839, context.getString(R.string.accessibility_play), notificationTransportListenerService.a(0));
            }
        }
        lgaVarB.d(2131231837, context.getString(R.string.remote_notification_disconnect), notificationTransportListenerService.a(2));
        crmVar.p(dylVar);
        lgaVarB.a = true;
        crl.e(notificationTransportListenerService, R.id.remote_notification, lgaVarB.a(), 16);
    }
}
