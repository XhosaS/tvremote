package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vg extends vj {
    public static final Executor a = new vf();
    private static volatile vg c;
    public final vj b;
    private final vj d;

    private vg() {
        vi viVar = new vi();
        this.d = viVar;
        this.b = viVar;
    }

    public static vg a() {
        if (c == null) {
            synchronized (vg.class) {
                if (c == null) {
                    c = new vg();
                }
            }
        }
        return c;
    }

    @Override // defpackage.vj
    public final boolean b() {
        throw null;
    }
}
