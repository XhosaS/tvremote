package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pc extends oz implements pa {
    public static Method a;
    public pa b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public pc(Context context, int i) {
        super(context, null, i);
    }

    @Override // defpackage.pa
    public final void a(jj jjVar, MenuItem menuItem) {
        pa paVar = this.b;
        if (paVar != null) {
            jb jbVar = (jb) paVar;
            jd jdVar = jbVar.a;
            Handler handler = jdVar.a;
            handler.removeCallbacksAndMessages(null);
            List list = jdVar.b;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (jjVar == ((jc) list.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            handler.postAtTime(new ja(jbVar, i2 < list.size() ? (jc) list.get(i2) : null, menuItem, jjVar), jjVar, SystemClock.uptimeMillis() + 200);
        }
    }

    @Override // defpackage.pa
    public final void b(jj jjVar) {
        pa paVar = this.b;
        if (paVar != null) {
            ((jb) paVar).a.a.removeCallbacksAndMessages(jjVar);
        }
    }

    @Override // defpackage.oz
    public final nu p(Context context, boolean z) {
        pb pbVar = new pb(context, z);
        pbVar.e = this;
        return pbVar;
    }
}
