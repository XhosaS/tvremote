package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bkq {
    protected abstract bmu a();

    public final void b(bsk bskVar) throws Exception {
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bri.a(bskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + a().b + "')");
    }
}
