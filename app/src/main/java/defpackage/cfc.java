package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfc extends boy {
    public cfc() {
        super(23, 24);
    }

    @Override // defpackage.boy
    public final void b(bsk bskVar) throws Exception {
        bri.a(bskVar, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
    }
}
