package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omn extends omm {
    private final SharedPreferences a;

    public omn(omi omiVar, String str, SharedPreferences sharedPreferences) {
        super(omiVar, str);
        this.a = sharedPreferences;
    }

    @Override // defpackage.omm
    protected final String c() {
        return this.a.getString("__phenotype_snapshot_token", null);
    }

    @Override // defpackage.omm
    protected final boolean g(olu oluVar) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (!oluVar.f) {
            editorEdit.clear();
        }
        boolean z = false;
        for (olt oltVar : oluVar.d) {
            if (oltVar != null) {
                for (String str : oltVar.c) {
                    editorEdit.remove(str);
                }
                for (oma omaVar : oltVar.b) {
                    int i = omaVar.g;
                    if (i == 1) {
                        editorEdit.putLong(omaVar.a, omaVar.b());
                    } else if (i == 2) {
                        editorEdit.putBoolean(omaVar.a, omaVar.e());
                    } else if (i == 3) {
                        editorEdit.putFloat(omaVar.a, (float) omaVar.a());
                    } else if (i == 4) {
                        editorEdit.putString(omaVar.a, omaVar.c());
                    } else if (i == 5) {
                        editorEdit.putString(omaVar.a, Base64.encodeToString(omaVar.f(), 3));
                    }
                }
            }
        }
        editorEdit.putString("__phenotype_server_token", oluVar.c);
        editorEdit.putLong("__phenotype_configuration_version", oluVar.g);
        editorEdit.putString("__phenotype_snapshot_token", oluVar.a);
        if (editorEdit.commit()) {
            z = true;
        } else {
            Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        }
        Map map = rxc.a;
        synchronized (rxc.class) {
            Iterator it = rxc.a.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
        return z;
    }
}
