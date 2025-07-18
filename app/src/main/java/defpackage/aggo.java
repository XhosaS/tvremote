package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aggo extends aggm {
    private final PrintWriter a;

    public aggo(PrintWriter printWriter) {
        this.a = printWriter;
    }

    @Override // defpackage.aggm
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
