package defpackage;

import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udr implements uds {
    private static final String a = "uds";

    @Override // defpackage.uds
    public final void a(udp udpVar) throws Resources.NotFoundException, IOException {
        try {
            ltn.a(udpVar.b);
        } catch (kdr e) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e);
            kcx.a.e(udpVar.b, e.a);
            int i = udpVar.c;
            throw new IOException("Blocked unpatched use of SSL stack.", e);
        } catch (kds e2) {
            kcx.a.e(udpVar.b, e2.a);
            int i2 = udpVar.c;
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e2);
        }
    }
}
