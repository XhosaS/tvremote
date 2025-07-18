package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqd extends rqb {
    private final int a;
    private final ExecutorService b;
    private final yqt c;

    public rqd(int i, ExecutorService executorService, yqt yqtVar) {
        this.a = i;
        this.b = executorService;
        this.c = yqtVar;
    }

    @Override // defpackage.rqb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.rqb
    public final yqt c() {
        return this.c;
    }

    @Override // defpackage.rqb
    public final ExecutorService d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqb) {
            rqb rqbVar = (rqb) obj;
            if (this.a == rqbVar.a() && this.b.equals(rqbVar.d()) && this.c.equals(rqbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        yqt yqtVar = this.c;
        return "AppFlowLoggerConfiguration{maxEventsInMemory=" + this.a + ", loggingExecutorService=" + this.b.toString() + ", backgroundExecutorService=" + String.valueOf(yqtVar) + "}";
    }
}
