package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.time.Instant;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qeg {
    public static long a(pia piaVar) {
        if (piaVar.l == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(piaVar.l);
    }

    public static Uri b(Uri uri, phu phuVar) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (phuVar.p.isEmpty()) {
            String str = phuVar.d;
            builderBuildUpon.appendPath(str.substring(str.lastIndexOf("/") + 1));
        } else {
            for (String str2 : phuVar.p.split("/", -1)) {
                if (!str2.isEmpty()) {
                    builderBuildUpon.appendPath(str2);
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static Uri c(Context context, yqt yqtVar, pia piaVar) {
        String str = !piaVar.v.isEmpty() ? piaVar.v : piaVar.e;
        int iA = phy.a(piaVar.j);
        if (iA == 0) {
            iA = 1;
        }
        return qdx.b(context, yqtVar).buildUpon().appendPath(qdx.f(iA)).build().buildUpon().appendPath(str).build();
    }

    public static pia d(pia piaVar, long j) {
        phw phwVar = piaVar.d;
        if (phwVar == null) {
            phwVar = phw.a;
        }
        phv phvVar = new phv();
        phvVar.B(phwVar);
        if ((phvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            phvVar.y();
        }
        phw phwVar2 = (phw) phvVar.b;
        phwVar2.b |= 1;
        phwVar2.c = j;
        phw phwVar3 = (phw) phvVar.v();
        phz phzVar = new phz();
        phzVar.B(piaVar);
        if ((phzVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            phzVar.y();
        }
        pia piaVar2 = (pia) phzVar.b;
        phwVar3.getClass();
        piaVar2.d = phwVar3;
        piaVar2.c |= 1;
        return (pia) phzVar.v();
    }

    public static String e(phu phuVar) {
        return g(phuVar) ? phuVar.i : phuVar.g;
    }

    public static void f(Context context, yqt yqtVar, pia piaVar, ueg uegVar) {
        Uri uriC = c(context, yqtVar, piaVar);
        if (uegVar.h(uriC)) {
            uhj uhjVar = new uhj();
            uhjVar.a = true;
        }
    }

    public static boolean g(phu phuVar) {
        if ((phuVar.b & 32) == 0) {
            return false;
        }
        adwd adwdVar = phuVar.h;
        if (adwdVar == null) {
            adwdVar = adwd.a;
        }
        Iterator it = adwdVar.c.iterator();
        while (it.hasNext()) {
            if (((adwb) it.next()).b == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String str, yzq yzqVar) {
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(58);
        yqw.R(iIndexOf >= 0, "Invalid url: %s", str);
        String strSubstring = str.substring(0, iIndexOf);
        zdl it = yzqVar.iterator();
        while (it.hasNext()) {
            if (ypx.d(strSubstring, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(phu phuVar) {
        return h(phuVar.d, new zdd("inlinefile"));
    }

    public static boolean j(pia piaVar) {
        if (!piaVar.n) {
            return false;
        }
        Iterator it = piaVar.o.iterator();
        while (it.hasNext()) {
            int iA = phq.a(((phu) it.next()).m);
            if (iA != 0 && iA == 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(phu phuVar) {
        return h(phuVar.d, yzq.q("file", "asset"));
    }

    public static boolean l(long j) {
        return j <= Instant.now().toEpochMilli();
    }
}
