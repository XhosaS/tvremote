package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhb extends zgr {
    private static final boolean a = zha.a();
    private static final boolean b;
    private static final zgq c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new zgz();
    }

    static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zha.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.zgr
    protected zft e(String str) {
        AtomicReference atomicReference = zhg.d;
        if (atomicReference.get() != null) {
            return ((zgx) atomicReference.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        zhg zhgVar = new zhg(str);
        zhe.a.offer(zhgVar);
        if (atomicReference.get() == null) {
            return zhgVar;
        }
        zhg.e();
        return zhgVar;
    }

    @Override // defpackage.zgr
    protected zgq h() {
        return c;
    }

    @Override // defpackage.zgr
    protected zhw j() {
        return zhh.a;
    }

    @Override // defpackage.zgr
    protected String m() {
        return "platform: Android";
    }
}
