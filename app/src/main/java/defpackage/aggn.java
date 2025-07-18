package defpackage;

import java.io.PrintStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aggn extends aggm {
    private final PrintStream a;

    public aggn(PrintStream printStream) {
        this.a = printStream;
    }

    @Override // defpackage.aggm
    public final void a(Object obj) {
        this.a.println(obj);
    }
}
