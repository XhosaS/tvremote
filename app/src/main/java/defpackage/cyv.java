package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyv {
    public static void a(Context context, cyg cygVar, cyt cytVar, List list, dnv dnvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dnx dnxVar = (dnx) it.next();
            try {
                dnxVar.c(context, cygVar, cytVar);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(dnxVar.getClass().getName())), e);
            }
        }
        if (dnvVar != null) {
            dnvVar.c(context, cygVar, cytVar);
        }
    }
}
