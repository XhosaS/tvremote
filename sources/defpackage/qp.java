package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qp {
    public qp() {
    }

    static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    static void b(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    static void c(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    static void d(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    static boolean e(View view) {
        return view.isAccessibilityHeading();
    }

    static boolean f(View view) {
        return view.isScreenReaderFocusable();
    }

    public static boolean i(ViewGroup viewGroup, View view) {
        while (view != null) {
            if (view == viewGroup) {
                return true;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    public static void j(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void k(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void l(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void m(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void n(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void o(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void p(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void q(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static String r(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void s(String str, Object obj, List list) {
        list.add(str + "=" + String.valueOf(obj));
    }

    public static afy t(Status status) {
        return status.f != null ? new agh(status) : new afy(status);
    }

    public static void u(Status status, adx adxVar) {
        v(status, null, adxVar);
    }

    public static void v(Status status, Object obj, adx adxVar) {
        if (status.a()) {
            adxVar.f(obj);
        } else {
            adxVar.e(t(status));
        }
    }

    public qp(byte[] bArr) {
    }

    public void g(boolean z) {
    }

    public void h(boolean z) {
    }
}
