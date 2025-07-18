package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vub {
    public static cot a(Context context) {
        try {
            cfq cfqVarJ = cfq.j(context);
            if (cfqVarJ.k == null) {
                synchronized (cfq.b) {
                    if (cfqVarJ.k == null) {
                        try {
                            cfqVarJ.k = (cot) Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, cfq.class).newInstance(cfqVarJ.c, cfqVarJ);
                        } catch (Throwable th) {
                            cbx.c().b(cfq.a, "Unable to initialize multi-process support", th);
                        }
                        if (cfqVarJ.k == null) {
                            String str = cfqVarJ.d.g;
                            if (!TextUtils.isEmpty(null)) {
                                throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                            }
                        }
                    }
                }
            }
            cot cotVar = cfqVarJ.k;
            if (cotVar != null) {
                return cotVar;
            }
            throw new IllegalStateException("Unable to initialize RemoteWorkManager");
        } catch (IllegalStateException e) {
            throw new IllegalStateException("RemoteWorkManager instantiation failed. You might be missing a dependency on\n\"//third_party/java/androidx/work:multiprocess\",", e);
        }
    }
}
