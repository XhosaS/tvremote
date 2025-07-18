package defpackage;

import android.accounts.Account;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oms {
    public static oir a(yqi yqiVar, String str) {
        oir oirVar = (oir) yqiVar.apply(str);
        if (oirVar != null) {
            return oirVar;
        }
        throw new IllegalArgumentException("GellerConfig is null");
    }

    public static String b(yqt yqtVar) {
        return yqtVar.g() ? ((Account) yqtVar.c()).name : "";
    }

    public static boolean c(String str, acgd acgdVar, Geller geller) {
        if (GellerDatabase.b.contains(acgdVar.name())) {
            return true;
        }
        Map mapB = geller.e.b(str).b();
        yqt yqtVarI = mapB.containsKey(acgdVar.name()) ? yqt.i((acge) mapB.get(acgdVar.name())) : ypv.a;
        if (yqtVarI.g()) {
            return ((acge) yqtVarI.c()).equals(acge.CUSTOM_STORAGE_TYPE_GDD);
        }
        return false;
    }
}
