package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cex extends boy {
    public cex() {
        super(17, 18);
    }

    @Override // defpackage.boy
    public final void b(bsk bskVar) throws Exception {
        bri.a(bskVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        bri.a(bskVar, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
