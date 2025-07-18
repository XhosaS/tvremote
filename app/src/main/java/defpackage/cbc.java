package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cbc extends ccz {
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.ccz
    public final cbv a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                cbv cbvVarA = ((ccz) it.next()).a(context, str, workerParameters);
                if (cbvVarA != null) {
                    return cbvVarA;
                }
            } catch (Throwable th) {
                cbx.c();
                Log.e(cbd.a, "Unable to instantiate a ListenableWorker (" + str + ')', th);
                throw th;
            }
        }
        return null;
    }
}
