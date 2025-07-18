package defpackage;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qct {
    public static final qct a = new qct();
    private static final tvn b = tvn.n("GnpSdk");

    private qct() {
    }

    public static final int a(StatusBarNotification statusBarNotification) {
        String str;
        Integer numU;
        statusBarNotification.getClass();
        Integer numValueOf = Integer.valueOf(statusBarNotification.getNotification().extras.getInt("chime.account_name_hash"));
        Integer numValueOf2 = null;
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        String tag = statusBarNotification.getTag();
        if (tag != null && (str = (String) ylh.aa(tag, new String[]{"::"}).get(0)) != null && (numU = ylh.u(str)) != null) {
            int iIntValue = numU.intValue();
            if (iIntValue == -91843507) {
                iIntValue = -1;
            }
            numValueOf2 = Integer.valueOf(iIntValue);
        }
        if (numValueOf2 == null) {
            return 0;
        }
        return numValueOf2.intValue();
    }

    public static final int b(String str, String str2, int i) {
        str.getClass();
        return (str + ":e:" + i + ":a:" + str2).hashCode();
    }

    public static final qcs c(pxg pxgVar, qis qisVar) {
        String strF;
        pxgVar.getClass();
        qisVar.getClass();
        if (ocv.bi(qisVar).length() > 0) {
            strF = ocv.bi(qisVar) + "::" + UUID.randomUUID();
        } else {
            strF = f(pxgVar, qisVar.a);
        }
        return new qcs(0, strF);
    }

    public static final String d(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        Bundle bundle = statusBarNotification.getNotification().extras;
        bundle.getClass();
        return l(bundle, "chime.slot_key");
    }

    public static final String e(pxg pxgVar, String str) {
        str.getClass();
        String strD = pxgVar.d();
        if (strD == null) {
            strD = "Anonymous";
        }
        return strD.hashCode() + "::SUMMARY::" + str;
    }

    public static final String f(pxg pxgVar, String str) {
        String strD = pxgVar.d();
        if (strD == null) {
            strD = "Anonymous";
        }
        return strD.hashCode() + "::" + str;
    }

    public static final String g(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        Bundle bundle = statusBarNotification.getNotification().extras;
        bundle.getClass();
        String strL = l(bundle, "chime.thread_id");
        if (strL != null) {
            return strL;
        }
        String tag = statusBarNotification.getTag();
        if (tag == null) {
            return null;
        }
        return (String) yfm.V(ylh.aa(tag, new String[]{"::"}), 1);
    }

    public static final int h(pxg pxgVar) {
        String strD = pxgVar.d();
        if (strD != null) {
            return strD.hashCode();
        }
        return -1;
    }

    public static final qcs i(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        return new qcs(statusBarNotification.getId(), statusBarNotification.getTag());
    }

    public static final boolean j(StatusBarNotification statusBarNotification, pxg pxgVar) {
        statusBarNotification.getClass();
        return a(statusBarNotification) == h(pxgVar);
    }

    public static final boolean k(StatusBarNotification statusBarNotification, pxg pxgVar, String str) {
        statusBarNotification.getClass();
        pxgVar.getClass();
        return yks.e(g(statusBarNotification), str) && j(statusBarNotification, pxgVar);
    }

    private static final String l(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            ((tvk) ((tvk) b.g()).i(e)).s("Failed to get String from Bundle");
            return null;
        }
    }
}
