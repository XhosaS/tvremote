package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwd {
    static final Pattern a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    static final Pattern b = Pattern.compile("^(TikTokWorker#|tiktok_).*");
    public static final /* synthetic */ int c = 0;

    static yzq a(Set set) {
        wg wgVar = new wg(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("TikTokWorker#")) {
                wgVar.add(str.substring(13));
            }
        }
        return yzq.o(wgVar);
    }

    public static String b(WorkerParameters workerParameters) {
        return (String) zag.f(a(workerParameters.c));
    }

    static void c(vts vtsVar) {
        yzq yzqVar = ((vtc) vtsVar).i;
        zdl it = yzqVar.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (a.matcher(str).matches()) {
                throw new vuo(a.e(str, "Tag ", " is reserved by AccountWorkManager."));
            }
        }
        zdl it2 = yzqVar.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (b.matcher(str2).matches()) {
                throw new vuo(a.e(str2, "Tag ", " is reserved by TikTokWorkManager."));
            }
        }
    }
}
