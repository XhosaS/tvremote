package defpackage;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Trace;
import android.view.Window;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.videos.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class sss {
    public sss() {
    }

    static void c(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static int d(Context context) {
        return new sst(context).a(sip.d(context, R.attr.colorSurface, 0), context.getResources().getDimension(R.dimen.m3_sys_elevation_level2));
    }

    public static void e(Window window, boolean z) {
        new cxe(window, window.getDecorView()).i(z);
    }

    public static void f(tqt tqtVar) {
        String strC = tqtVar.c();
        WeakHashMap weakHashMap = tqg.a;
        if (strC.length() > 127) {
            strC = strC.substring(0, 127);
        }
        Trace.beginSection(strC);
    }

    public static void g(tqt tqtVar) {
        if (i(tqtVar) || tqtVar.a() == null) {
            Trace.beginSection(tqtVar.d());
            f(tqtVar);
        } else {
            g(tqtVar.a());
            f(tqtVar);
        }
    }

    public static void h(tqt tqtVar) {
        if (i(tqtVar) || tqtVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            h(tqtVar.a());
        }
    }

    public static boolean i(tqt tqtVar) {
        return tqtVar.e() != Thread.currentThread();
    }

    public static tql j(String str) {
        return szg.o(str, tqn.a, false);
    }

    public sss(byte[] bArr) {
    }

    public void a() {
    }

    public void b(FloatingActionButton floatingActionButton) {
    }
}
