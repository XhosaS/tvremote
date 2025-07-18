package defpackage;

import androidx.work.WorkerParameters;
import java.io.File;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inj implements kmj {
    private final iyz a;

    public inj(iyz iyzVar) {
        iyzVar.getClass();
        this.a = iyzVar;
    }

    @Override // defpackage.kmj
    public final Object a(WorkerParameters workerParameters, yih yihVar) {
        rul rulVarB = rmr.a().b();
        try {
            try {
                iyz iyzVar = this.a;
                File[] fileArrListFiles = iyzVar.b.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.getClass();
                        if (file.lastModified() < Calendar.getInstance().getTimeInMillis() - ((Long) xjx.c.et(((xjx) iyzVar.a).d)).longValue()) {
                            file.delete();
                        }
                    }
                }
                rmr.a().g(rulVarB, rmp.c(lim.IMAGE_CLEANUP));
                return new gpl();
            } catch (Exception e) {
                krd.c("Encountered error " + e.getLocalizedMessage() + " during image cleanup");
                gpj gpjVar = new gpj();
                rmr.a().g(rulVarB, rmp.c(lim.IMAGE_CLEANUP));
                return gpjVar;
            }
        } catch (Throwable th) {
            rmr.a().g(rulVarB, rmp.c(lim.IMAGE_CLEANUP));
            throw th;
        }
    }
}
