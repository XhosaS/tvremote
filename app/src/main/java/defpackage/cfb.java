package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfb extends boy {
    public cfb() {
        super(22, 23);
    }

    @Override // defpackage.boy
    public final void b(bsk bskVar) throws Exception {
        bri.a(bskVar, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
