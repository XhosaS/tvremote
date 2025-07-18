package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxw extends kes implements jxk {
    private static final keh a = new keh();
    private static final kdy l;
    private static final kei m;

    static {
        jxt jxtVar = new jxt();
        l = jxtVar;
        m = new kei("GoogleAuth.API", jxtVar);
    }

    public jxw(Context context) {
        super(context, null, m, kee.a, ker.a);
    }

    @Override // defpackage.jxk
    public final lvf a(final GetAccountsRequest getAccountsRequest) {
        kib kibVar = new kib();
        kibVar.c = new Feature[]{jwf.g};
        kibVar.a = new khv() { // from class: jxr
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                jxu jxuVar = new jxu(this.a, (lvj) obj2);
                jxq jxqVar = (jxq) ((jxn) obj).v();
                Parcel parcelA = jxqVar.a();
                erv.c(parcelA, jxuVar);
                erv.b(parcelA, getAccountsRequest);
                jxqVar.J(1, parcelA);
            }
        };
        kibVar.d = 1676;
        return super.g(0, kibVar.a());
    }

    @Override // defpackage.jxk
    public final lvf b(final GetTokenRequest getTokenRequest) {
        kib kibVar = new kib();
        kibVar.c = new Feature[]{new Feature("google_auth_api", 1L)};
        kibVar.a = new khv() { // from class: jxs
            @Override // defpackage.khv
            public final void a(Object obj, Object obj2) {
                jxv jxvVar = new jxv(this.a, (lvj) obj2);
                jxq jxqVar = (jxq) ((jxn) obj).v();
                Parcel parcelA = jxqVar.a();
                erv.c(parcelA, jxvVar);
                erv.b(parcelA, getTokenRequest);
                jxqVar.J(2, parcelA);
            }
        };
        kibVar.d = 1680;
        return super.g(0, kibVar.a());
    }

    public final void c(Status status, Object obj, lvj lvjVar) {
        if (status.c()) {
            lvjVar.a.p(obj);
            return;
        }
        switch (status.f) {
            case 8:
            case 49500:
            case 49508:
            case 49528:
            case 49531:
                lvjVar.a.o(new IOException(status.a()));
                break;
            default:
                PendingIntent pendingIntent = status.h;
                lvjVar.a.o(pendingIntent == null ? new jwj(status.a()) : UserRecoverableAuthException.b(status.a(), new Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms").setData(Uri.parse("intent://com.google.android.gms.auth.uiflows.common/".concat(String.valueOf(String.valueOf(UUID.randomUUID()))))).putExtra("target", pendingIntent)));
                break;
        }
    }
}
