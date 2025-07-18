package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elk {
    public static final elk a = new elk("");
    public final String b = "";
    private final Object c;
    private final nxb d;

    public elk(String str) {
        this.d = Build.VERSION.SDK_INT >= 31 ? new nxb(null, null, null, null) : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        nxb nxbVar;
        nxbVar = this.d;
        nxbVar.getClass();
        return elk$$ExternalSyntheticApiModelOutline0.m345m(nxbVar.a);
    }

    public final synchronized void b(LogSessionId logSessionId) {
        nxb nxbVar = this.d;
        nxbVar.getClass();
        Object obj = nxbVar.a;
        a.ab(elk$$ExternalSyntheticApiModelOutline0.m345m(obj).equals(LogSessionId.LOG_SESSION_ID_NONE));
        nxbVar.a = logSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elk)) {
            return false;
        }
        elk elkVar = (elk) obj;
        return Objects.equals(this.b, elkVar.b) && Objects.equals(this.d, elkVar.d) && Objects.equals(this.c, elkVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.d, this.c);
    }
}
