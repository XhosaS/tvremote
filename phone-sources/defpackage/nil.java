package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nil extends nwq implements nib {
    private static final npj a;
    private static final jzs b;
    private static final ocv c;

    static {
        npj npjVar = new npj(null);
        a = npjVar;
        nih nihVar = new nih();
        c = nihVar;
        b = new jzs("GoogleAuth.API", (ocv) nihVar, npjVar);
    }

    public nil(Context context) {
        super(context, b, nwi.q, nwp.a);
    }

    public static final void b(Status status, Object obj, kwy kwyVar) {
        if (status.b()) {
            kwyVar.u(obj);
            return;
        }
        switch (status.f) {
            case 8:
            case 49500:
            case 49508:
            case 49528:
            case 49531:
                kwyVar.t(new IOException(status.a()));
                break;
            default:
                PendingIntent pendingIntent = status.h;
                kwyVar.t(pendingIntent == null ? new nhc(status.a()) : UserRecoverableAuthException.a(status.a(), new Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms").setData(Uri.parse("intent://com.google.android.gms.auth.uiflows.common/".concat(String.valueOf(String.valueOf(UUID.randomUUID()))))).putExtra("target", pendingIntent)));
                break;
        }
    }

    @Override // defpackage.nib
    public final onz a(nhu nhuVar) {
        oaf oafVar = new oaf();
        oafVar.b = new nvg[]{nhb.a};
        oafVar.a = new nig(nhuVar, 1);
        oafVar.c = 1676;
        return r(oafVar.a());
    }
}
