package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lwy {
    public static final lxa a;

    static {
        Uri uri = lwz.a;
        a = lxb.a();
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        return a.a(contentResolver, str, str2);
    }

    public static boolean b(ContentResolver contentResolver, String str, boolean z) throws lxd {
        Object obj;
        Boolean bool;
        lxa lxaVar = a;
        lxe lxeVar = (lxe) lxaVar;
        lxeVar.f(contentResolver);
        synchronized (lxaVar) {
            ((lxe) lxaVar).d(contentResolver);
            obj = ((lxe) lxaVar).e;
            bool = (Boolean) ((lxe) lxaVar).b(((lxe) lxaVar).b, str, Boolean.valueOf(z));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        String strA = lxeVar.a(contentResolver, str, null);
        if (strA != null && !strA.isEmpty()) {
            if (lwz.c.matcher(strA).matches()) {
                z = true;
                bool = true;
            } else if (lwz.d.matcher(strA).matches()) {
                z = false;
                bool = false;
            } else {
                Log.w("Gservices", a.n(strA, str, "attempt to read Gservices key ", " (value \"", "\") as boolean"));
            }
        }
        synchronized (lxaVar) {
            ((lxe) lxaVar).e(obj, ((lxe) lxaVar).b, str, bool);
        }
        return z;
    }

    public static long c(ContentResolver contentResolver) {
        Object obj;
        long j;
        Long lValueOf;
        lxa lxaVar = a;
        lxe lxeVar = (lxe) lxaVar;
        lxeVar.f(contentResolver);
        synchronized (lxaVar) {
            ((lxe) lxaVar).d(contentResolver);
            obj = ((lxe) lxaVar).e;
            j = 0;
            lValueOf = (Long) ((lxe) lxaVar).b(((lxe) lxaVar).d, "android_id", 0L);
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        String strA = lxeVar.a(contentResolver, "android_id", null);
        if (strA != null) {
            try {
                long j2 = Long.parseLong(strA);
                lValueOf = Long.valueOf(j2);
                j = j2;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (lxaVar) {
            ((lxe) lxaVar).e(obj, ((lxe) lxaVar).d, "android_id", lValueOf);
        }
        return j;
    }
}
