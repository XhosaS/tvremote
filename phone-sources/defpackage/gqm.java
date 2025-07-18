package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqm extends ggi {
    public static final gqm c = new gqm();

    private gqm() {
        super(3, 4);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
