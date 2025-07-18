package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grn extends ggi {
    public grn() {
        super(20, 21);
    }

    @Override // defpackage.ggi
    public final void b(gic gicVar) {
        gez.t(gicVar, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
