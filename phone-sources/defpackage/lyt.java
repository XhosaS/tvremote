package defpackage;

import android.database.Cursor;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lyt implements Runnable {
    private static final String[] a = {"config_account", "config_proto"};
    private final Map b;
    private final lyz c;

    public lyt(lyz lyzVar, Map map) {
        this.c = lyzVar;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cursor cursorQuery = this.c.b().query("user_configuration", a, null, null, null, null, null);
        try {
            krd.f("User config found");
            while (cursorQuery.moveToNext()) {
                krd.f("Loading user config");
                byte[] blob = cursorQuery.getBlob(1);
                if (blob != null) {
                    try {
                        Map map = this.b;
                        String string = cursorQuery.getString(0);
                        vuc vucVarP = vuc.p(lcs.a, blob, 0, blob.length, vtp.a());
                        vuc.B(vucVarP);
                        map.put(string, (lcs) vucVarP);
                    } catch (vuq e) {
                        krd.d("Failed to load configuration", e);
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }
}
