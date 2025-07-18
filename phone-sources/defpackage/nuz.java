package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nuz implements ono {
    private final /* synthetic */ int a;

    public /* synthetic */ nuz(int i) {
        this.a = i;
    }

    @Override // defpackage.ono
    public final Object a(onz onzVar) throws IOException {
        int i = this.a;
        if (i == 0) {
            Executor executor = nvc.a;
            Intent intent = (Intent) ((Bundle) onzVar.e()).getParcelable("notification_data");
            if (intent != null) {
                return new num(intent);
            }
            return null;
        }
        if (i == 1) {
            Executor executor2 = nvc.a;
            if (onzVar.i()) {
                return (Bundle) onzVar.e();
            }
            throw new IOException("SERVICE_NOT_AVAILABLE", onzVar.d());
        }
        if (i == 2) {
            Bundle bundle = (Bundle) onzVar.f(IOException.class);
            if (bundle == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            Log.w("FirebaseInstanceId", "Unexpected response: ".concat(bundle.toString()), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        if (i == 3) {
            return ((ulp) onzVar.e()).a;
        }
        if (i == 4) {
            return -1;
        }
        if (i == 5) {
            return 403;
        }
        Bundle bundle2 = (Bundle) onzVar.f(IOException.class);
        if (bundle2 == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string4 = bundle2.getString("registration_id");
        if (string4 != null) {
            return string4;
        }
        String string5 = bundle2.getString("unregistered");
        if (string5 != null) {
            return string5;
        }
        String string6 = bundle2.getString("error");
        if ("RST".equals(string6)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string6 != null) {
            throw new IOException(string6);
        }
        Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle2.toString()), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
