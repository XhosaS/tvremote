package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqp extends ggi {
    public static final gqp c = new gqp();

    private gqp() {
        super(7, 8);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
