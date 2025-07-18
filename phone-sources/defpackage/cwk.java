package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RemoteViews;
import com.google.android.play.search.PlaySearchToolbar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cwk {
    static WindowInsets c(View view, WindowInsets windowInsets) {
        int i = cwz.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    static WindowInsets d(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void e(View view) {
        view.requestApplyInsets();
    }

    public static boolean f(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof cti) {
            ((cti) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void h(MenuItem menuItem, cur curVar) {
        if (menuItem instanceof cti) {
            ((cti) menuItem).setSupportActionProvider(curVar);
        } else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
    }

    @Deprecated
    public static void i(MenuItem menuItem, PlaySearchToolbar playSearchToolbar) {
        menuItem.setOnActionExpandListener(new cvj(playSearchToolbar));
    }

    public static djh j(djh djhVar) {
        return djhVar.a(new dks(new dug(16.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0234 A[Catch: all -> 0x0334, TryCatch #0 {all -> 0x0334, blocks: (B:89:0x017e, B:124:0x0230, B:126:0x0234, B:128:0x023a, B:129:0x0243, B:94:0x018b, B:96:0x0198, B:97:0x01a8, B:103:0x01b7, B:104:0x01bd, B:108:0x01c9, B:110:0x01d6, B:111:0x01e6, B:115:0x01f2, B:123:0x022c, B:130:0x0248, B:131:0x024e, B:132:0x024f, B:134:0x0254, B:135:0x0259, B:136:0x025a, B:137:0x026c, B:143:0x0275, B:145:0x027c, B:147:0x028d, B:149:0x029f, B:151:0x02a3, B:155:0x02b4, B:156:0x02b9, B:158:0x02bd, B:159:0x02ca, B:161:0x02ce, B:162:0x02df, B:164:0x02e3, B:166:0x02e7), top: B:247:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0243 A[Catch: all -> 0x0334, TryCatch #0 {all -> 0x0334, blocks: (B:89:0x017e, B:124:0x0230, B:126:0x0234, B:128:0x023a, B:129:0x0243, B:94:0x018b, B:96:0x0198, B:97:0x01a8, B:103:0x01b7, B:104:0x01bd, B:108:0x01c9, B:110:0x01d6, B:111:0x01e6, B:115:0x01f2, B:123:0x022c, B:130:0x0248, B:131:0x024e, B:132:0x024f, B:134:0x0254, B:135:0x0259, B:136:0x025a, B:137:0x026c, B:143:0x0275, B:145:0x027c, B:147:0x028d, B:149:0x029f, B:151:0x02a3, B:155:0x02b4, B:156:0x02b9, B:158:0x02bd, B:159:0x02ca, B:161:0x02ce, B:162:0x02df, B:164:0x02e3, B:166:0x02e7), top: B:247:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0309 A[Catch: all -> 0x030d, TryCatch #2 {all -> 0x030d, blocks: (B:169:0x02f7, B:171:0x02fb, B:173:0x0301, B:174:0x0309, B:168:0x02f3, B:177:0x030f, B:178:0x0315, B:179:0x0316, B:181:0x031b, B:182:0x0320, B:183:0x0321, B:184:0x0333), top: B:250:0x027a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(final defpackage.dmw r25, final android.widget.RemoteViews r26, defpackage.djh r27, final defpackage.dma r28) {
        /*
            Method dump skipped, instructions count: 1201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwk.k(dmw, android.widget.RemoteViews, djh, dma):void");
    }

    public static void l(Context context, RemoteViews remoteViews, dry dryVar, int i) {
        int i2 = Build.VERSION.SDK_INT;
        czu czuVar = dryVar.a;
        if (i2 < 31) {
            List listS = yfm.s(duk.a, dui.a, duh.a);
            dmf.d(czuVar, context);
            if (!listS.contains(czuVar)) {
                throw new IllegalArgumentException(a.cj(czuVar, "Using a height of ", " requires a complex layout before API 31"));
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 || !yfm.s(duk.a, duh.a).contains(czuVar)) {
            if (czuVar instanceof duk) {
                remoteViews.setViewLayoutHeight(i, -2.0f, 0);
                return;
            }
            if (czuVar instanceof duh) {
                remoteViews.setViewLayoutHeight(i, 0.0f, 0);
                return;
            }
            if (czuVar instanceof dug) {
                remoteViews.setViewLayoutHeight(i, ((dug) czuVar).a, 1);
            } else {
                if (czuVar instanceof duj) {
                    throw null;
                }
                if (!yks.e(czuVar, dui.a)) {
                    throw new yfu();
                }
                remoteViews.setViewLayoutHeight(i, -1.0f, 0);
            }
        }
    }

    public static void m(Context context, RemoteViews remoteViews, dsf dsfVar, int i) {
        int i2 = Build.VERSION.SDK_INT;
        czu czuVar = dsfVar.a;
        if (i2 < 31) {
            List listS = yfm.s(duk.a, dui.a, duh.a);
            dmf.d(czuVar, context);
            if (!listS.contains(czuVar)) {
                throw new IllegalArgumentException(a.cj(czuVar, "Using a width of ", " requires a complex layout before API 31"));
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 || !yfm.s(duk.a, duh.a).contains(czuVar)) {
            if (czuVar instanceof duk) {
                remoteViews.setViewLayoutWidth(i, -2.0f, 0);
                return;
            }
            if (czuVar instanceof duh) {
                remoteViews.setViewLayoutWidth(i, 0.0f, 0);
                return;
            }
            if (czuVar instanceof dug) {
                remoteViews.setViewLayoutWidth(i, ((dug) czuVar).a, 1);
            } else {
                if (czuVar instanceof duj) {
                    throw null;
                }
                if (!yks.e(czuVar, dui.a)) {
                    throw new yfu();
                }
                remoteViews.setViewLayoutWidth(i, -1.0f, 0);
            }
        }
    }

    public static AppWidgetManager n(Context context) {
        Object systemService = context.getSystemService("appwidget");
        systemService.getClass();
        return (AppWidgetManager) systemService;
    }

    public static String o(int i) {
        return a.cf(i, "appWidget-");
    }

    public static String p(djz djzVar) {
        return o(djzVar.a);
    }

    public static void q(Throwable th) {
        Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
    }

    public static boolean r(djz djzVar) {
        return djzVar.a < -1;
    }

    public static boolean s(djz djzVar) {
        return !r(djzVar);
    }

    public static djh t(djh djhVar, boolean z) {
        return djhVar.a(new dlb(z));
    }

    private static int u(dug dugVar, Context context) {
        return cwp.s(dugVar.a, context.getResources().getDisplayMetrics());
    }

    private static int v(Context context) {
        context.getResources();
        throw null;
    }

    private static boolean w(czu czuVar) {
        boolean z = true;
        if (!(czuVar instanceof dug)) {
            if (czuVar instanceof duj) {
                return true;
            }
            z = false;
            if (!yks.e(czuVar, duh.a) && !yks.e(czuVar, dui.a) && !yks.e(czuVar, duk.a)) {
                if (czuVar == null) {
                    return false;
                }
                throw new yfu();
            }
        }
        return z;
    }

    public void a() {
    }

    public void b() {
    }
}
