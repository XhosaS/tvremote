package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvf {
    public final uot a;

    public hvf(uov uovVar) {
        upz upzVar = new upz();
        yqw.M(upzVar.a.f().isEmpty(), "dropAllVersionsBefore() must be the first UpgradeStep. The newVersionNumber parameter must be the number of removed addSchemaVersion() steps plus one.");
        yqw.M(!upzVar.b.g(), "Only one call to dropAllVersionsBefore() may be made. It must be the first call to a SQLSchema.Builder.");
        yqw.M(true, "newVersionNumber must be greater than zero in order for it to drop any previous database version. The newVersionNumber parameter must be the number of removed addSchemaVersion() steps plus one.");
        upzVar.b = yqt.i(new uqb());
        upzVar.b("\n      CREATE TABLE recent_search (\n      search_id INTEGER PRIMARY KEY AUTOINCREMENT,\n      search_term TEXT,\n      assistant_visual_element INTEGER,\n      image_primary_entity_mid TEXT,\n      timestamp_ms TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,\n      event_id TEXT,\n      account_name TEXT)\n      ");
        upzVar.b("\n      CREATE TRIGGER table_size_trigger_recent_search\n      AFTER INSERT ON recent_search\n      BEGIN DELETE FROM recent_search\n        WHERE search_id NOT IN\n        (SELECT search_id\n        FROM recent_search\n        ORDER BY timestamp_ms DESC LIMIT 10);\n      END\n      ");
        this.a = uovVar.a("search.db", upzVar.a());
    }
}
