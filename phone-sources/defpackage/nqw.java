package defpackage;

import android.os.RemoteException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqw {
    private static final nsf a = new nsf("MediaSessionUtils");

    public static int a(npk npkVar, long j) {
        if (j == 10000) {
            return npkVar.m;
        }
        return j != 30000 ? npkVar.l : npkVar.n;
    }

    public static int b(npk npkVar, long j) {
        if (j == 10000) {
            return npkVar.A;
        }
        return j != 30000 ? npkVar.z : npkVar.B;
    }

    public static int c(npk npkVar, long j) {
        if (j == 10000) {
            return npkVar.p;
        }
        return j != 30000 ? npkVar.o : npkVar.q;
    }

    public static int d(npk npkVar, long j) {
        if (j == 10000) {
            return npkVar.D;
        }
        return j != 30000 ? npkVar.C : npkVar.E;
    }

    public static List e(npb npbVar) {
        try {
            return npbVar.a();
        } catch (RemoteException e) {
            a.c(e, "Unable to call %s on %s.", "getNotificationActions", "npb");
            return null;
        }
    }

    public static int[] f(npb npbVar) {
        try {
            return npbVar.b();
        } catch (RemoteException e) {
            a.c(e, "Unable to call %s on %s.", "getCompactViewActionIndices", "npb");
            return null;
        }
    }
}
