package defpackage;

import android.content.Context;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oth implements otg {
    public final otf a;
    public final String b = "AGSA_OPA";
    public final String c;

    private oth(otf otfVar, String str) {
        this.a = otfVar;
        this.c = str;
    }

    public static otg b(mcw mcwVar, Context context, ScheduledExecutorService scheduledExecutorService, yqt yqtVar, boolean z) {
        otf otfVar = new otf(scheduledExecutorService, new uqn(context, "STREAMZ_GELLER_LIBRARY"));
        String str = "UNKNOWN_VERSION";
        if (yqtVar.g()) {
            if (z) {
                str = "OUTDATED_VERSION";
            } else {
                List listG = yrl.b(new ypz('.')).g((String) yqtVar.c());
                if (listG.size() >= 2) {
                    str = ((String) listG.get(0)) + "." + ((String) listG.get(1));
                }
            }
        }
        return new oth(otfVar, str);
    }

    static /* synthetic */ Long c() {
        return Long.valueOf(Instant.now().toEpochMilli());
    }

    public final long a(acgi acgiVar) {
        aceu aceuVar = acgiVar.c;
        if (aceuVar == null) {
            aceuVar = aceu.a;
        }
        return TimeUnit.MILLISECONDS.toSeconds(c().longValue() - TimeUnit.MICROSECONDS.toMillis(aceuVar.c));
    }
}
