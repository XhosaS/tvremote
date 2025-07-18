package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frc {
    public static final String a;
    public static final String b;
    public final frb c;

    static {
        dzz.b("media3.session");
        a = edt.Z(0);
        b = edt.Z(1);
    }

    public frc(int i, String str, fnl fnlVar, Bundle bundle, MediaSession.Token token) {
        this.c = new frd(i, str, fnlVar, bundle, token);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof frc) {
            return this.c.equals(((frc) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c.toString();
    }
}
