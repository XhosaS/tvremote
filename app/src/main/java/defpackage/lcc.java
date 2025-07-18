package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class lcc implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ lcl b;

    public lcc(lcl lclVar, AppMetadata appMetadata) {
        this.a = appMetadata;
        this.b = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        lih lihVar = this.b.a;
        lihVar.t();
        if (lihVar.t != null) {
            lihVar.u = new ArrayList();
            lihVar.u.addAll(lihVar.t);
        }
        AppMetadata appMetadata = this.a;
        kug kugVar = lihVar.c;
        lihVar.ai(kugVar);
        String str = appMetadata.a;
        kkk.k(str);
        kkk.h(str);
        kugVar.g();
        kugVar.ag();
        try {
            SQLiteDatabase sQLiteDatabaseE = kugVar.e();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseE.delete("apps", "app_id=?", strArr) + sQLiteDatabaseE.delete("events", "app_id=?", strArr) + sQLiteDatabaseE.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseE.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseE.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseE.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseE.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseE.delete("queue", "app_id=?", strArr) + sQLiteDatabaseE.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseE.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseE.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseE.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseE.delete("upload_queue", "app_id=?", strArr);
            aetv.a.eV();
            lbk lbkVar = kugVar.y;
            if (lbkVar.d.t(null, kzg.bi)) {
                iDelete += sQLiteDatabaseE.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.k.c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            lbk lbkVar2 = kugVar.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.c("Error resetting analytics data. appId, error", lab.b(str), e);
        }
        if (appMetadata.h) {
            lihVar.K(appMetadata);
        }
    }
}
