package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Looper;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.videos.R;
import java.util.List;
import java.util.concurrent.Executor;
import org.xml.sax.Attributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mjo {
    public mjo() {
    }

    public static void c(View view, lis lisVar, Object obj, lio lioVar, boolean z) {
        if (z) {
            lio lioVarB = lioVar.b();
            liq liqVarC = lioVar.c();
            if (lioVarB != null && liqVarC != null) {
                lioVarB.d(liqVarC);
            }
        }
        view.setOnClickListener(new kaj((Object) lisVar, obj, (Object) lioVar, 2, (byte[]) null));
    }

    public static mft d(int i) {
        return ksk.b >= 26 ? new mfu(i) : new mft() { // from class: mfs
            @Override // defpackage.mft
            public final void a() {
            }
        };
    }

    public static mfb e(idy idyVar, ieh iehVar, Executor executor) {
        mfc mfcVar = new mfc(idyVar);
        executor.execute(new gqz(krh.a(Looper.myLooper(), mfcVar), iehVar, 6));
        return mfcVar;
    }

    public static void f(idy idyVar, ieh iehVar, Executor executor, Executor executor2) {
        executor.execute(new gqz((idy) new krn(executor2, new mfc(idyVar), 1, null), iehVar, 6));
    }

    public static lck h(List list, int i) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        lck lckVar = (lck) list.get(0);
        int iAbs = Math.abs(i - lckVar.d);
        for (int i2 = 1; i2 < list.size(); i2++) {
            lck lckVar2 = (lck) list.get(i2);
            int iAbs2 = Math.abs(i - lckVar2.d);
            if (iAbs2 < iAbs || (iAbs2 == iAbs && lckVar2.d > lckVar.d)) {
                lckVar = lckVar2;
                iAbs = iAbs2;
            }
        }
        return lckVar;
    }

    public static boolean i(int i, int i2, int i3) {
        if (i2 <= 0) {
            return false;
        }
        return i3 > 0 ? i >= (i3 + (-1)) * 1000 : i2 - i < 2000;
    }

    public static mwb j(View view, String str) {
        return jwq.X(view.getContext()) ? new mwd(view, str) : new mwe(view, str);
    }

    public static View k(mvh mvhVar, sfh sfhVar) {
        sfhVar.d(mvhVar);
        View viewA = sfhVar.a();
        viewA.setImportantForAccessibility(2);
        return viewA;
    }

    public static void l(CharSequence charSequence, sfh sfhVar) {
        sfv sfvVar = new sfv();
        sfvVar.a = charSequence;
        sfhVar.c(sfvVar);
    }

    public static void m(CharSequence charSequence, sfh sfhVar) {
        sfx sfxVar = new sfx();
        sfxVar.b(charSequence);
        sfhVar.e(sfxVar);
        sfhVar.e(new sfk());
    }

    public static void n(int i, sfh sfhVar) {
        sfx sfxVar = new sfx();
        sfxVar.a = null;
        sfxVar.b = i;
        sfhVar.e(sfxVar);
        sfhVar.e(new sfk());
    }

    public static int o(Context context, float f) {
        Resources resources = context.getResources();
        float fraction = resources.getFraction(R.fraction.row_cards_per_screen, 1, 1);
        int dimensionPixelSize = resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(R.dimen.play_collection_edge_padding);
        float f2 = fraction - ((int) fraction);
        return (int) (((dimensionPixelSize + ((f2 + f2) * 0.0f)) / fraction) - (f + f));
    }

    public static int p(Context context, float f) {
        return o(context.getApplicationContext(), f);
    }

    public static int q(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.play_search_toolbar_height);
    }

    public static void r(View view, boolean z) {
        if (u(view)) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets.hasStableInsets()) {
                DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                view.setPadding(displayCutout.getSafeInsetLeft() > 0 ? displayCutout.getSafeInsetLeft() : rootWindowInsets.getSystemWindowInsetLeft() + displayCutout.getSafeInsetLeft(), 0, displayCutout.getSafeInsetRight() > 0 ? displayCutout.getSafeInsetRight() : rootWindowInsets.getSystemWindowInsetRight() + displayCutout.getSafeInsetRight(), 0);
                return;
            }
            return;
        }
        if (!z || view == null || view.getRootWindowInsets() == null) {
            return;
        }
        WindowInsets rootWindowInsets2 = view.getRootWindowInsets();
        view.setPadding(rootWindowInsets2.getSystemWindowInsetLeft(), 0, rootWindowInsets2.getSystemWindowInsetRight(), 0);
    }

    public static void s(View view) {
        if (u(view)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(0, view.getRootWindowInsets().getDisplayCutout().getSafeInsetTop(), 0, 0);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void t(Menu menu, int i, boolean z) {
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(z);
            menuItemFindItem.setEnabled(z);
        }
    }

    public static boolean u(View view) {
        return (Build.VERSION.SDK_INT < 28 || view == null || view.getRootWindowInsets() == null || view.getRootWindowInsets().getDisplayCutout() == null) ? false : true;
    }

    public static String v(kzo kzoVar) {
        int iJ;
        if (kzoVar.A()) {
            iJ = kzoVar.j();
        } else {
            int iJ2 = kzoVar.M;
            if (iJ2 == 0) {
                iJ2 = kzoVar.j();
                kzoVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return Integer.toString(iJ);
    }

    public static String w(kwx kwxVar) {
        return Integer.toString(kwxVar.hashCode());
    }

    public static void x(mrb mrbVar, lod lodVar, View view) {
        kff.r(view, mvn.class, "audio_cc_dialog", new ldk(mrbVar.e, lodVar, mrbVar.g, 6));
    }

    public static void y(View view, Context context, Runnable runnable, ieg iegVar, mcy mcyVar, san sanVar, nsf nsfVar) {
        kff.p(view, nav.class, new mmn(sanVar, context, 6));
        kff.p(view, nbc.class, new mmn(sanVar, runnable, 7, null));
        kff.p(view, naw.class, new mmz(sanVar, mcyVar, iegVar, context.getResources(), context, nsfVar, view, 3));
    }

    public mjo(char[] cArr) {
    }

    public mjo(short[] sArr) {
        new mvy();
    }

    public void b(mer merVar, Attributes attributes) {
    }

    public void a(mer merVar, Attributes attributes, String str) {
    }
}
