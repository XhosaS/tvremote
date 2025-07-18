package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqf extends gez {
    @Override // defpackage.gez
    public final void a(ghk ghkVar) {
        ghkVar.c();
        try {
            ghkVar.f("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - grf.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ghkVar.g();
        } finally {
            ghkVar.e();
        }
    }
}
