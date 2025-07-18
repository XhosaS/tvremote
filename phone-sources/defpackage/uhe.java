package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uhe implements tsl {
    private final /* synthetic */ int a;

    public /* synthetic */ uhe(int i) {
        this.a = i;
    }

    @Override // defpackage.tsl
    public final Object apply(Object obj) {
        String strB;
        String strB2;
        String strB3;
        String strB4;
        String strB5;
        String strB6;
        String strB7;
        String strB8;
        String strB9;
        String strB10;
        String strB11;
        switch (this.a) {
            case 0:
                int i = uhh.a;
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            case 1:
                int i2 = uhh.a;
                return Boolean.valueOf(((List) obj).contains(String.class));
            case 2:
                int i3 = uhh.a;
                return Arrays.asList(((Constructor) obj).getParameterTypes());
            case 3:
                return ((xth) obj).name();
            case 4:
                int i4 = uun.b;
                Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (Exception) obj);
                return null;
            case 5:
                Context context = (Context) obj;
                String str = xcv.a;
                if (str != null) {
                    return str;
                }
                synchronized (xcv.class) {
                    strB = xcv.a;
                    if (strB == null) {
                        strB = rwt.b(context, "com.google.android.libraries.mediahome.providers.video");
                        xcv.a = strB;
                    }
                }
                return strB;
            case 6:
                Context context2 = (Context) obj;
                String str2 = xdj.b;
                if (str2 != null) {
                    return str2;
                }
                synchronized (xdj.class) {
                    strB2 = xdj.b;
                    if (strB2 == null) {
                        strB2 = rwt.b(context2, "com.google.android.libraries.notifications");
                        xdj.b = strB2;
                    }
                }
                return strB2;
            case 7:
                Context context3 = (Context) obj;
                String str3 = xdz.a;
                if (str3 != null) {
                    return str3;
                }
                synchronized (xdz.class) {
                    strB3 = xdz.a;
                    if (strB3 == null) {
                        strB3 = rwt.b(context3, "com.google.android.gms.auth_account_client");
                        xdz.a = strB3;
                    }
                }
                return strB3;
            case 8:
                Context context4 = (Context) obj;
                String str4 = xeg.a;
                if (str4 != null) {
                    return str4;
                }
                synchronized (xeg.class) {
                    strB4 = xeg.a;
                    if (strB4 == null) {
                        strB4 = rwt.b(context4, "com.google.android.gms.clearcut_client");
                        xeg.a = strB4;
                    }
                }
                return strB4;
            case 9:
                Context context5 = (Context) obj;
                String str5 = xen.a;
                if (str5 != null) {
                    return str5;
                }
                synchronized (xen.class) {
                    strB5 = xen.a;
                    if (strB5 == null) {
                        strB5 = rwt.b(context5, "com.google.android.libraries.consentverifier");
                        xen.a = strB5;
                    }
                }
                return strB5;
            case 10:
                Context context6 = (Context) obj;
                String str6 = xes.b;
                if (str6 != null) {
                    return str6;
                }
                synchronized (xes.class) {
                    strB6 = xes.b;
                    if (strB6 == null) {
                        strB6 = rwt.b(context6, "com.google.android.libraries.notifications.platform");
                        xes.b = strB6;
                    }
                }
                return strB6;
            case 11:
                Context context7 = (Context) obj;
                String str7 = xhb.a;
                if (str7 != null) {
                    return str7;
                }
                synchronized (xhb.class) {
                    strB7 = xhb.a;
                    if (strB7 == null) {
                        strB7 = rwt.b(context7, "com.google.android.libraries.mdi.sync");
                        xhb.a = strB7;
                    }
                }
                return strB7;
            case 12:
                Context context8 = (Context) obj;
                String str8 = xhf.a;
                if (str8 != null) {
                    return str8;
                }
                synchronized (xhf.class) {
                    strB8 = xhf.a;
                    if (strB8 == null) {
                        strB8 = rwt.b(context8, "com.google.android.videos");
                        xhf.a = strB8;
                    }
                }
                return strB8;
            case 13:
                Context context9 = (Context) obj;
                String str9 = xnk.a;
                if (str9 != null) {
                    return str9;
                }
                synchronized (xnk.class) {
                    strB9 = xnk.a;
                    if (strB9 == null) {
                        strB9 = rwt.b(context9, "com.google.android.libraries.onegoogle");
                        xnk.a = strB9;
                    }
                }
                return strB9;
            case 14:
                Context context10 = (Context) obj;
                String str10 = xnr.a;
                if (str10 != null) {
                    return str10;
                }
                synchronized (xnr.class) {
                    strB10 = xnr.a;
                    if (strB10 == null) {
                        strB10 = rwt.b(context10, "com.google.android.libraries.social.peoplekit");
                        xnr.a = strB10;
                    }
                }
                return strB10;
            case 15:
                return xnv.a((Context) obj);
            default:
                Context context11 = (Context) obj;
                String str11 = xnz.a;
                if (str11 != null) {
                    return str11;
                }
                synchronized (xnz.class) {
                    strB11 = xnz.a;
                    if (strB11 == null) {
                        strB11 = rwt.b(context11, "com.google.android.libraries.performance.primes");
                        xnz.a = strB11;
                    }
                }
                return strB11;
        }
    }
}
