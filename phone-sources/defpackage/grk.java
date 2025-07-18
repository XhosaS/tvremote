package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grk extends ggi {
    public grk() {
        super(17, 18);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        gez.t(gicVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
