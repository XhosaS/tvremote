package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgm {
    private static final Map a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("Disconnected", lbh.HDCP_DISCONNECTED);
        map.put("Unprotected", lbh.HDCP_NONE);
        map.put("HDCP-1.x", lbh.HDCP_V1);
        map.put("HDCP-2.0", lbh.HDCP_V2);
        map.put("HDCP-2.1", lbh.HDCP_V2_1);
        map.put("HDCP-2.2", lbh.HDCP_V2_2);
        map.put("HDCP-2.3", lbh.HDCP_V2_3);
    }

    public static synchronized lbh a() {
        lbh lbhVar;
        lbhVar = lbh.HDCP_NONE;
        try {
            epr eprVarO = kdw.o();
            lbh lbhVar2 = (lbh) a.get(eprVarO.getPropertyString("hdcpLevel"));
            if (lbhVar2 != null) {
                lbhVar = lbhVar2;
            }
            eprVarO.release();
            krd.b(a.ct(lbhVar, "Framework hdcp level is "));
        } catch (Throwable th) {
            krd.d("Unable to determine hdcp level", th);
        }
        return lbhVar;
    }

    public static synchronized boolean b() {
        String strValueOf = String.valueOf(a());
        lbh lbhVarA = a();
        lbh lbhVar = lbh.HDCP_V2;
        int iCompareTo = lbhVarA.compareTo(lbhVar);
        StringBuilder sb = new StringBuilder("Current HDCP level :");
        sb.append(strValueOf);
        sb.append(" Comparison : ");
        sb.append(iCompareTo >= 0);
        krd.b(sb.toString());
        if (ksk.r() || (Build.MANUFACTURER.equals("Google") && Build.DEVICE.equals("boreal"))) {
            if (a().compareTo(lbhVar) < 0) {
                return false;
            }
        }
        return true;
    }
}
