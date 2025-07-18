package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EdgeEffect;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qs {
    public static pl a(View view, pl plVar) {
        ContentInfo contentInfoD = plVar.a.d();
        contentInfoD.getClass();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoD);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoD ? plVar : new pl(new pi(contentInfoPerformReceiveContent));
    }

    public static String[] b(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static float c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return tk.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return tk.b(edgeEffect, f, f2);
        }
        tj.a(edgeEffect, f, f2);
        return f;
    }

    public static EdgeEffect e(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? tk.c(context, attributeSet) : new EdgeEffect(context);
    }

    public static final xx f(xz xzVar, cuv cuvVar) {
        try {
            try {
                return xzVar.c();
            } catch (AbstractMethodError unused) {
                return xzVar.b();
            }
        } catch (AbstractMethodError unused2) {
            return xzVar.a();
        }
    }

    public static void g(RuntimeException runtimeException, aod aodVar, String str) {
        acm acmVar = aodVar.a;
        if (acmVar != acm.STARTUP && acmVar != acm.TELEDOCTOR) {
            throw runtimeException;
        }
        try {
            Log.e("ExceptionUtil", b.g(str, "RuntimeException while safely performing function: "), runtimeException);
        } catch (RuntimeException unused) {
        }
    }

    public static cja h(Callable callable) {
        cjb cjbVar = new cjb(callable);
        new Thread(cjbVar).start();
        return cjbVar;
    }

    public static final boolean i(Context context) {
        Uri uri = anu.a;
        int i = context.getApplicationInfo().uid;
        return i != -1 && context.checkUriPermission(anu.a, 0, i, 1) == 0;
    }

    public static ami j(Object obj) {
        amn amnVar = new amn();
        amnVar.l(obj);
        return amnVar;
    }
}
