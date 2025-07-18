package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gro extends ggi {
    public gro() {
        super(22, 23);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
