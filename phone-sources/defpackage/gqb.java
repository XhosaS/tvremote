package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gqb {
    public abstract gpm a(Context context, String str, WorkerParameters workerParameters);

    public final gpm c(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        gpm gpmVarA = a(context, str, workerParameters);
        if (gpmVarA == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(gpm.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    gpmVarA = (gpm) objNewInstance;
                } catch (Throwable th) {
                    gpn.b();
                    Log.e(gqc.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                gpn.b();
                Log.e(gqc.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!gpmVarA.g) {
            return gpmVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
