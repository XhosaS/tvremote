package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbq {
    static final dbs a = new dbs();
    static final dbt b = new dbt();

    static dbs a(czc czcVar) {
        return czcVar.c <= 0 ? a : new dbs(czcVar);
    }

    static dbt b(czc czcVar) {
        return czcVar.c <= 0 ? b : new dbt(czcVar);
    }
}
