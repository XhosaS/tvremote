package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqc extends rqa {
    public int a;
    public ExecutorService b;
    public yqt c = ypv.a;
    public byte d;

    @Override // defpackage.rqa
    public final rqb a() {
        ExecutorService executorService;
        if (this.d == 1 && (executorService = this.b) != null) {
            return new rqd(this.a, executorService, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" maxEventsInMemory");
        }
        if (this.b == null) {
            sb.append(" loggingExecutorService");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
