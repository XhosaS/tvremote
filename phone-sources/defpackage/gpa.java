package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpa extends gqb {
    private final List a = new CopyOnWriteArrayList();

    @Override // defpackage.gqb
    public final gpm a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                gpm gpmVarA = ((gqb) it.next()).a(context, str, workerParameters);
                if (gpmVarA != null) {
                    return gpmVarA;
                }
            } catch (Throwable th) {
                gpn.b();
                Log.e(gpb.a, "Unable to instantiate a ListenableWorker (" + str + ')', th);
                throw th;
            }
        }
        return null;
    }

    public final void b(gqb gqbVar) {
        gqbVar.getClass();
        this.a.add(gqbVar);
    }
}
