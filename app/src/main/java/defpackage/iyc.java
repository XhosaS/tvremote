package defpackage;

import com.google.android.apps.tvsearch.suggestions.starters.FallbackSuggestionDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iyc extends bmu {
    final /* synthetic */ FallbackSuggestionDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyc(FallbackSuggestionDatabase_Impl fallbackSuggestionDatabase_Impl) {
        super(2, "5d2a56e543c5a2878a6091a719bd5462", "11e1a1b574abbe302d8fd6f847a716ce");
        this.d = fallbackSuggestionDatabase_Impl;
    }

    @Override // defpackage.bmu
    public final bmt a(bsk bskVar) throws Exception {
        HashMap map = new HashMap(3);
        map.put("display_text", new bqc("display_text", "TEXT", true, 1, null, 1));
        map.put("foreground_app", new bqc("foreground_app", "TEXT", true, 2, null, 1));
        map.put("server_log", new bqc("server_log", "TEXT", true, 0, null, 1));
        bqf bqfVar = new bqf("fallback_suggestion_table", map, new HashSet(0), new HashSet(0));
        bqf bqfVarA = bqa.a(bskVar, "fallback_suggestion_table");
        if (bqi.f(bqfVar, bqfVarA)) {
            return new bmt(true, null);
        }
        return new bmt(false, "fallback_suggestion_table(com.google.android.apps.tvsearch.suggestions.starters.FallbackSuggestion).\n Expected:\n" + bqi.b(bqfVar) + "\n Found:\n" + bqi.b(bqfVarA));
    }

    @Override // defpackage.bmu
    public final void b(bsk bskVar) throws Exception {
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS `fallback_suggestion_table` (`display_text` TEXT NOT NULL, `foreground_app` TEXT NOT NULL, `server_log` TEXT NOT NULL, PRIMARY KEY(`display_text`, `foreground_app`))");
        bri.a(bskVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bri.a(bskVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5d2a56e543c5a2878a6091a719bd5462')");
    }

    @Override // defpackage.bmu
    public final void c(bsk bskVar) throws Exception {
        bri.a(bskVar, "DROP TABLE IF EXISTS `fallback_suggestion_table`");
    }

    @Override // defpackage.bmu
    public final void d(bsk bskVar) throws Exception {
        this.d.u(bskVar);
    }

    @Override // defpackage.bmu
    public final void e(bsk bskVar) throws Exception {
        bpb.a(bskVar);
    }

    @Override // defpackage.bmu
    public final void f() {
    }

    @Override // defpackage.bmu
    public final void g() {
    }
}
