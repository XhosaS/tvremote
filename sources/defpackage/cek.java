package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cek extends ceb {
    private static final boolean a = cej.a();
    private static final boolean b;
    private static final cea c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new cei();
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
            return cej.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.ceb
    protected cdd e(String str) {
        AtomicReference atomicReference = cen.d;
        if (atomicReference.get() != null) {
            return ((ceg) atomicReference.get()).a(str);
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
        cen cenVar = new cen(str);
        cem.a.offer(cenVar);
        if (atomicReference.get() == null) {
            return cenVar;
        }
        cen.d();
        return cenVar;
    }

    @Override // defpackage.ceb
    protected cea h() {
        return c;
    }

    @Override // defpackage.ceb
    protected ces j() {
        return ceo.a;
    }

    @Override // defpackage.ceb
    protected String m() {
        return "platform: Android";
    }
}
