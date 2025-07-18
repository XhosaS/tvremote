package defpackage;

import android.content.Intent;
import android.os.UserHandle;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkj extends SocketAddress {
    private static final long serialVersionUID = 0;
    public final Intent a;
    private final UserHandle b;

    public afkj(Intent intent) {
        boolean z = true;
        if (intent.getComponent() == null && intent.getPackage() == null) {
            z = false;
        }
        yqw.B(z, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.a = intent;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afkj) {
            afkj afkjVar = (afkj) obj;
            if (this.a.filterEquals(afkjVar.a)) {
                UserHandle userHandle = afkjVar.b;
                if (yqs.a(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent.getPackage() != null) {
            intent = intent.cloneFilter().setPackage(null);
        }
        return intent.filterHashCode();
    }

    public final String toString() {
        return "AndroidComponentAddress[" + this.a + "]";
    }
}
