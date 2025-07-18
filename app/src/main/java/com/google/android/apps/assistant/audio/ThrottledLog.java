package com.google.android.apps.assistant.audio;

/* compiled from: PG */
/* loaded from: classes.dex */
class ThrottledLog {
    private final int initialUnthrottledLogs;
    private long lastTimeLoggedNsec;
    private final LogFunction logFct;
    private final long resetTimeNsec;
    private final long throttlePeriodNsec;
    private long totalLogCalls = 0;
    private long unthrottledCount;

    /* compiled from: PG */
    public interface LogFunction {
        void accept(String str, String str2);
    }

    public ThrottledLog(LogFunction logFunction, int i, long j, long j2) {
        this.logFct = logFunction;
        this.initialUnthrottledLogs = i;
        this.throttlePeriodNsec = j * 1000000;
        this.resetTimeNsec = j2 * 1000000;
        reset(System.nanoTime());
    }

    private void reset(long j) {
        this.unthrottledCount = 0L;
        this.lastTimeLoggedNsec = j;
    }

    public void log(String str, String str2) {
        this.totalLogCalls++;
        long jNanoTime = System.nanoTime();
        long j = jNanoTime - this.lastTimeLoggedNsec;
        if (j > this.resetTimeNsec) {
            reset(jNanoTime);
        }
        long j2 = this.unthrottledCount;
        if (j2 < this.initialUnthrottledLogs) {
            this.unthrottledCount = j2 + 1;
        } else if (j <= this.throttlePeriodNsec) {
            return;
        }
        this.logFct.accept(str, "[" + this.totalLogCalls + "] " + str2);
        this.lastTimeLoggedNsec = jNanoTime;
    }
}
