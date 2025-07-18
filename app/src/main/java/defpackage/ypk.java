package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ypk extends yox {
    public static final Duration b = Duration.ofMinutes(3);
    public static final Duration c = Duration.ofMinutes(3).plusSeconds(45);
    public static final yyr d = zcl.a;
    private static final long serialVersionUID = 4556936364828217687L;
    private final Duration a;
    final Object e;
    public volatile ypg f;
    transient ypi g;
    private final Duration h;

    protected ypk() {
        throw null;
    }

    private final int c() {
        ypg ypgVar = this.f;
        if (ypgVar == null) {
            return 3;
        }
        Long l = ypgVar.a.b;
        Date date = l == null ? null : new Date(l.longValue());
        if (date == null) {
            return 1;
        }
        long time = date.getTime() - System.currentTimeMillis();
        Duration duration = this.a;
        Duration durationOfMillis = Duration.ofMillis(time);
        if (durationOfMillis.compareTo(duration) <= 0) {
            return 3;
        }
        return durationOfMillis.compareTo(this.h) <= 0 ? 2 : 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.g = null;
    }

    public yoz a() {
        throw new IllegalStateException("OAuth2Credentials instance does not support refreshing the access token. An instance with a new access token should be used, or a derived type that supports refreshing.");
    }

    @Override // defpackage.yox
    public void b(Executor executor, afkf afkfVar) {
        ypd ypdVar;
        zyd zydVarH;
        zyd zydVarH2;
        if (c() == 1) {
            zydVarH2 = zxn.h(this.f);
        } else {
            Object obj = this.e;
            synchronized (obj) {
                if (c() != 1) {
                    synchronized (obj) {
                        ypi ypiVar = this.g;
                        if (ypiVar != null) {
                            ypdVar = new ypd(ypiVar, false);
                        } else {
                            zye zyeVar = new zye(new ypc(this));
                            this.g = new ypi(zyeVar, new ypj(this, zyeVar));
                            ypdVar = new ypd(this.g, true);
                        }
                    }
                } else {
                    ypdVar = null;
                }
            }
            if (ypdVar != null && ypdVar.b) {
                executor.execute(ypdVar.a);
            }
            synchronized (this.e) {
                zydVarH = c() != 3 ? zxn.h(this.f) : ypdVar != null ? ypdVar.a : zxn.g(new IllegalStateException("Credentials expired, but there is no task to refresh"));
            }
            zydVarH2 = zydVarH;
        }
        zxn.p(zydVarH2, new ypf(afkfVar), zwk.a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ypk) {
            return Objects.equals(this.f, ((ypk) obj).f);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f);
    }

    public String toString() {
        Map map;
        yoz yozVar;
        ypg ypgVar = this.f;
        if (ypgVar != null) {
            map = ypgVar.b;
            yozVar = ypgVar.a;
        } else {
            map = null;
            yozVar = null;
        }
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("requestMetadata", map);
        yqqVarB.b("temporaryAccess", yozVar);
        return yqqVarB.toString();
    }

    public ypk(yoz yozVar, Duration duration, Duration duration2) {
        this.e = new byte[0];
        this.f = null;
        if (yozVar != null) {
            this.f = ypg.a(yozVar, d);
        }
        duration.getClass();
        this.h = duration;
        yqw.B(!duration.isNegative(), "refreshMargin can't be negative");
        duration2.getClass();
        this.a = duration2;
        yqw.B(!duration2.isNegative(), "expirationMargin can't be negative");
    }
}
