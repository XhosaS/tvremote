package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ccz {
    public abstract cbv a(Context context, String str, WorkerParameters workerParameters);

    public final cbv b(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        cbv cbvVarA = a(context, str, workerParameters);
        if (cbvVarA == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(cbv.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    cbvVarA = (cbv) objNewInstance;
                } catch (Throwable th) {
                    String strConcat = "Could not instantiate ".concat(str);
                    cbx.c();
                    Log.e(cda.a, strConcat, th);
                    throw th;
                }
            } catch (Throwable th2) {
                String strConcat2 = "Invalid class: ".concat(str);
                cbx.c();
                Log.e(cda.a, strConcat2, th2);
                throw th2;
            }
        }
        if (!cbvVarA.d) {
            return cbvVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
