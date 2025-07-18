package defpackage;

import android.os.Binder;
import android.os.Trace;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class awn {
    public awn() {
    }

    public static Object e(bal balVar) {
        try {
            return balVar.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return balVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public static void f(bxk bxkVar) {
        String strC = bxkVar.c();
        WeakHashMap weakHashMap = bwv.a;
        if (strC.length() > 127) {
            strC = strC.substring(0, 127);
        }
        Trace.beginSection(strC);
    }

    public static void g(bxk bxkVar) {
        if (k(bxkVar) || bxkVar.a() == null) {
            Trace.beginSection(bxkVar.d());
            f(bxkVar);
        } else {
            g(bxkVar.a());
            f(bxkVar);
        }
    }

    public static void h(bxk bxkVar) {
        if (k(bxkVar) || bxkVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            h(bxkVar.a());
        }
    }

    public static boolean k(bxk bxkVar) {
        return bxkVar.e() != Thread.currentThread();
    }

    public static bxb l(String str) {
        return awo.f(str, bxd.a, false);
    }

    public awn(byte[] bArr) {
    }

    public /* synthetic */ awn(char[] cArr) {
    }
}
