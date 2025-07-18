package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavy {
    public final Status a;
    public final int b;

    private aavy(int i, Status status) {
        this.b = i;
        this.a = status;
    }

    static aavy a(int i, Status status) {
        if (i != 4) {
            i = 5;
        }
        yqw.L(true);
        status.getClass();
        return new aavy(i, status);
    }

    static aavy b(int i) {
        yqw.L(true);
        return new aavy(i, null);
    }
}
