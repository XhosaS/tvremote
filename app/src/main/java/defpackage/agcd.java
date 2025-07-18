package defpackage;

import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agcd {
    public final Logger a;
    public final Level b;

    public agcd(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        level.getClass();
        this.b = level;
        logger.getClass();
        this.a = logger;
    }

    private static String h(ahwx ahwxVar) {
        long j = ahwxVar.b;
        return j <= 64 ? ahwxVar.k().c() : ahwxVar.l((int) Math.min(j, 64L)).c().concat("...");
    }

    public final boolean a() {
        return this.a.isLoggable(this.b);
    }

    final void b(int i, int i2, ahwx ahwxVar, int i3, boolean z) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logData", agcb.a(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + h(ahwxVar));
        }
    }

    final void c(int i, int i2, agdg agdgVar, ahxb ahxbVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String strA = agcb.a(i);
            String strValueOf = String.valueOf(agdgVar);
            int iB = ahxbVar.b();
            ahwx ahwxVar = new ahwx();
            ahxbVar.k(ahwxVar, ahxbVar.b());
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strA + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + strValueOf + " length=" + iB + " bytes=" + h(ahwxVar));
        }
    }

    final void d(int i, long j) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", agcb.a(i) + " PING: ack=false bytes=" + j);
        }
    }

    final void e(int i, int i2, agdg agdgVar) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", agcb.a(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + String.valueOf(agdgVar));
        }
    }

    final void f(int i, agdu agduVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String strA = agcb.a(i);
            EnumMap enumMap = new EnumMap(agcc.class);
            for (agcc agccVar : agcc.values()) {
                int i2 = agccVar.g;
                if (agduVar.b(i2)) {
                    enumMap.put((EnumMap) agccVar, (agcc) Integer.valueOf(agduVar.b[i2]));
                }
            }
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strA + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    final void g(int i, int i2, long j) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", agcb.a(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }
}
