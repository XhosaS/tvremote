package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.PrintWriter;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxy {
    public int b;
    public final Context c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = false;
    public dxs h;

    public dxy(Context context) {
        this.c = context.getApplicationContext();
    }

    public static final String j(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    @Deprecated
    public void e(String str, PrintWriter printWriter) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public void g(Object obj) {
        dxs dxsVar = this.h;
        if (dxsVar != null) {
            if (dxr.b(2)) {
                Objects.toString(dxsVar);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                dxsVar.k(obj);
            } else {
                dxsVar.h(obj);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    protected void c() {
    }

    public void h() {
    }

    public void i() {
    }
}
