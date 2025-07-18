package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.apps.googletv.app.presentation.pages.device.DeviceNotificationActivity;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hiq implements go {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hiq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bdy, java.lang.Object] */
    @Override // defpackage.go
    public final void a(Object obj) {
        Bundle extras;
        int i = -1;
        switch (this.b) {
            case 0:
                gn gnVar = (gn) obj;
                Intent intent = gnVar.b;
                int iB = hiy.b(intent, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.a;
                if (resultReceiver != null) {
                    resultReceiver.send(iB, intent != null ? intent.getExtras() : null);
                }
                int i2 = gnVar.a;
                if (i2 == -1) {
                    if (iB != 0) {
                    }
                    proxyBillingActivityV2.finish();
                    break;
                } else {
                    i = i2;
                }
                hiy.e("ProxyBillingActivityV2", a.ce(iB, i, "Alternative billing only dialog finished with resultCode ", " and billing's responseCode: "));
                proxyBillingActivityV2.finish();
            case 1:
                ((yjv) this.a.a()).a(obj);
                break;
            case 2:
                gn gnVar2 = (gn) obj;
                Intent intent2 = gnVar2.b;
                int iB2 = hiy.b(intent2, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV22 = (ProxyBillingActivityV2) this.a;
                ResultReceiver resultReceiver2 = proxyBillingActivityV22.b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(iB2, intent2 != null ? intent2.getExtras() : null);
                }
                int i3 = gnVar2.a;
                if (i3 == -1) {
                    if (iB2 != 0) {
                    }
                    proxyBillingActivityV22.finish();
                    break;
                } else {
                    i = i3;
                }
                hiy.e("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(i), Integer.valueOf(iB2)));
                proxyBillingActivityV22.finish();
            case 3:
                gn gnVar3 = (gn) obj;
                Intent intent3 = gnVar3.b;
                extras = intent3 != null ? intent3.getExtras() : null;
                int i4 = gnVar3.a;
                if (i4 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    Integer numValueOf = Integer.valueOf(i4);
                    hiy.e("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", numValueOf));
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", numValueOf));
                }
                Object obj2 = this.a;
                int iB3 = hiy.b(intent3, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV23 = (ProxyBillingActivityV2) obj2;
                ResultReceiver resultReceiver3 = proxyBillingActivityV23.c;
                if (resultReceiver3 != null) {
                    resultReceiver3.send(iB3, extras);
                } else {
                    hiy.e("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (iB3 != 0) {
                    hiy.e("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(iB3)));
                }
                proxyBillingActivityV23.finish();
                break;
            case 4:
                gn gnVar4 = (gn) obj;
                Intent intent4 = gnVar4.b;
                extras = intent4 != null ? intent4.getExtras() : null;
                int i5 = gnVar4.a;
                if (i5 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    Integer numValueOf2 = Integer.valueOf(i5);
                    hiy.e("ProxyBillingActivityV2", String.format("External app link flow finished with resultCode: %s", numValueOf2));
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External app link flow finished with error resultCode: %s", numValueOf2));
                }
                Object obj3 = this.a;
                int iB4 = hiy.b(intent4, "ProxyBillingActivityV2");
                ProxyBillingActivityV2 proxyBillingActivityV24 = (ProxyBillingActivityV2) obj3;
                ResultReceiver resultReceiver4 = proxyBillingActivityV24.d;
                if (resultReceiver4 != null) {
                    resultReceiver4.send(iB4, extras);
                } else {
                    hiy.e("ProxyBillingActivityV2", "External app link flow result receiver is null");
                }
                if (iB4 != 0) {
                    hiy.e("ProxyBillingActivityV2", String.format("External app link flow finished with billing responseCode: %s", Integer.valueOf(iB4)));
                }
                proxyBillingActivityV24.finish();
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    jbr.ai(((bv) this.a).requireView());
                    break;
                }
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                if (!bool2.booleanValue()) {
                    jbr.ai(((bv) this.a).requireView());
                    break;
                }
                break;
            case 7:
                DeviceNotificationActivity.$r8$lambda$2TCTiUqIjkqxU7Zs3lZzE1Tdee4((DeviceNotificationActivity) this.a, (Map) obj);
                break;
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                if (bool3.booleanValue()) {
                    ((kfz) this.a).a();
                    break;
                }
                break;
            default:
                ((gn) obj).getClass();
                Object obj4 = this.a;
                ((qxr) obj4).j.s(new pqi(obj4, 20));
                break;
        }
    }
}
