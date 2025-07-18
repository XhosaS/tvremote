package defpackage;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txd extends twu {
    private static final boolean a = txc.a();
    private static final boolean b;
    private static final twt c;

    static {
        boolean z = true;
        if (Build.FINGERPRINT != null && !"robolectric".equals(Build.FINGERPRINT)) {
            z = false;
        }
        b = z;
        c = new txb();
    }

    static Class<?> p() {
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
            return txc.class.getName().equals(q());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.twu
    protected tvw e(String str) {
        AtomicReference atomicReference = txg.d;
        if (atomicReference.get() != null) {
            return ((twz) atomicReference.get()).a(str);
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
        txg txgVar = new txg(str);
        txf.a.offer(txgVar);
        if (atomicReference.get() == null) {
            return txgVar;
        }
        txg.e();
        return txgVar;
    }

    @Override // defpackage.twu
    protected twt h() {
        return c;
    }

    @Override // defpackage.twu
    protected txu j() {
        return txh.a;
    }

    @Override // defpackage.twu
    protected String m() {
        return "platform: Android";
    }
}
