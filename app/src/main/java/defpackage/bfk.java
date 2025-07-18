package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfk {
    public int c;
    public final Context d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public bfd i;

    public bfk(Context context) {
        this.d = context.getApplicationContext();
    }

    public void c() {
        throw null;
    }

    public final String d(Object obj) {
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

    public void e(Object obj) {
        bfd bfdVar = this.i;
        if (bfdVar != null) {
            if (bfh.b(2)) {
                Objects.toString(bfdVar);
                Log.v("LoaderManager", "onLoadComplete: ".concat(bfdVar.toString()));
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                bfdVar.g(obj);
                return;
            }
            if (bfh.b(4)) {
                Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            bfdVar.h(obj);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public void f() {
    }
}
