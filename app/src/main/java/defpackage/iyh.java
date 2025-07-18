package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iyh {
    public static final Duration a = Duration.ofDays(1);
    public final ztw b;
    public final Object c = new Object();
    Instant d = Instant.EPOCH;
    public final Map e = new HashMap();
    public final Map f = new HashMap();
    public String g = "";
    public final Map h = new HashMap();
    public abvo i;
    public heg j;

    public iyh(ztw ztwVar) {
        this.b = ztwVar;
    }

    public final boolean a(String str) {
        boolean z;
        synchronized (this.c) {
            Instant instant = this.d;
            ztw ztwVar = this.b;
            if (instant.isBefore(ztwVar.a())) {
                this.e.clear();
                this.f.clear();
                this.h.clear();
            }
            Instant instant2 = (Instant) this.e.get(str);
            z = true;
            if (instant2 != null && !instant2.isBefore(ztwVar.a())) {
                z = false;
            }
        }
        return z;
    }

    public final heg b() {
        heg hegVar;
        synchronized (this.c) {
            hegVar = this.j;
        }
        return hegVar;
    }

    public final void c(heg hegVar, String str) {
        synchronized (this.c) {
            this.j = hegVar;
            this.g = str;
        }
    }
}
