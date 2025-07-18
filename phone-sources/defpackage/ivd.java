package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.videos.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivd extends sbx {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/device/presentation/companionbar/CompanionBarPresenter");
    private static final Duration h;
    private static final Interpolator i;
    private static final LayoutTransition j;
    public final Context b;
    public final itk c;
    public final jaf d;
    public final nxb e;
    public final gag f;
    public final jbr g;
    private final xmy k;
    private final ihg l;
    private final kw m;
    private final kw n;
    private final kw o;
    private final kw p;

    static {
        Duration durationOfMillis = Duration.ofMillis(500L);
        durationOfMillis.getClass();
        h = durationOfMillis;
        PathInterpolator pathInterpolator = new PathInterpolator(crn.c("M 0,0 C 0.05, 0, 0.133333, 0.06, 0.166666, 0.4 C 0.208333, 0.82, 0.25, 1, 1, 1"));
        i = pathInterpolator;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(0, durationOfMillis.toMillis());
        layoutTransition.setDuration(1, durationOfMillis.toMillis());
        layoutTransition.setInterpolator(0, pathInterpolator);
        layoutTransition.setInterpolator(1, pathInterpolator);
        j = layoutTransition;
    }

    public ivd(Context context, kw kwVar, itk itkVar, gag gagVar, kw kwVar2, kw kwVar3, kw kwVar4, jaf jafVar, lfn lfnVar, xmy xmyVar, jan janVar, ihg ihgVar) {
        itkVar.getClass();
        gagVar.getClass();
        jafVar.getClass();
        lfnVar.getClass();
        janVar.getClass();
        this.b = context;
        this.o = kwVar;
        this.c = itkVar;
        this.f = gagVar;
        this.p = kwVar2;
        this.m = kwVar3;
        this.n = kwVar4;
        this.d = jafVar;
        this.k = xmyVar;
        this.l = ihgVar;
        this.e = new nxb();
        this.g = new jbr();
    }

    public static final int g(tlv tlvVar) {
        int iOrdinal = tlvVar.ordinal();
        if (iOrdinal != 0) {
            return iOrdinal != 1 ? 3 : 2;
        }
        return 1;
    }

    private final ive h() {
        iwu iwuVar;
        iwr iwrVar;
        ith ithVarE = this.c.e();
        iwa iwaVarF = (ithVarE == null || (iwuVar = ((iua) ithVarE).j) == null || (iwrVar = iwuVar.e) == null) ? null : iwrVar.f();
        tlu tluVar = iwaVarF != null ? iwaVarF.a : null;
        tol tolVar = iwaVarF != null ? iwaVarF.b : null;
        if (tluVar != null) {
            return new ive(tluVar, tolVar, this.f);
        }
        return null;
    }

    private final boolean i() {
        Context context = this.b;
        if (jwq.X(context)) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("virtual_remote", 0);
        if (sharedPreferences.contains("prefer_trackpad")) {
            return sharedPreferences.getBoolean("prefer_trackpad", false);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ivh ivhVar = new ivh(this.o.a);
        ivhVar.a = new scg() { // from class: iuu
            @Override // defpackage.scg
            public final void a(Object obj2, View view) {
                view.getClass();
                jad jadVarE = jbr.E(159131, (ivh) obj2);
                yfw yfwVar = new yfw(Integer.valueOf(R.id.assistant_button), jbr.E(135040, null));
                this.a.d.a(view, jadVarE, yfm.h(new yfw(Integer.valueOf(R.id.companion_bar_disconnect), jbr.E(166454, null)), new yfw(Integer.valueOf(R.id.companion_bar_remote), jbr.E(159138, null)), new yfw(Integer.valueOf(R.id.back_event), jbr.E(135041, null)), new yfw(Integer.valueOf(R.id.home_event), jbr.E(135045, null)), yfwVar, new yfw(Integer.valueOf(R.id.mute_event), jbr.E(135048, null)), new yfw(Integer.valueOf(R.id.lower_volume_event), jbr.E(135053, null)), new yfw(Integer.valueOf(R.id.increase_volume_event), jbr.E(135054, null)), new yfw(Integer.valueOf(R.id.keyboard_button), jbr.E(135046, null)), new yfw(Integer.valueOf(R.id.power_button), jbr.E(135051, null)), new yfw(Integer.valueOf(R.id.trackpad_view), jbr.E(135741, null)), new yfw(Integer.valueOf(R.id.dpad_view), jbr.E(135742, null)), new yfw(Integer.valueOf(R.id.forward), jbr.E(159513, null)), new yfw(Integer.valueOf(R.id.replay), jbr.E(159515, null)), new yfw(Integer.valueOf(R.id.remote_play_button), jbr.E(159512, null)), new yfw(Integer.valueOf(R.id.companion_bar_play_button), jbr.E(159512, null)), new yfw(Integer.valueOf(R.id.media_rewind_button), jbr.E(159515, null)), new yfw(Integer.valueOf(R.id.media_play_button), jbr.E(159512, null)), new yfw(Integer.valueOf(R.id.media_forward_button), jbr.E(159513, null)), new yfw(Integer.valueOf(R.id.media_mute_button), jbr.E(159514, null)), new yfw(Integer.valueOf(R.id.media_decrease_volume_button), jbr.E(159516, null)), new yfw(Integer.valueOf(R.id.media_increase_volume_button), jbr.E(1595117, null)), new yfw(Integer.valueOf(R.id.fmr_mode), jbr.E(193647, null)), new yfw(Integer.valueOf(R.id.overflow_menu), jbr.E(193646, null))));
            }
        };
        ivhVar.b = new jfu(this, 1);
        iun iunVar = new iun();
        iunVar.s(true);
        if (!yks.e(ivhVar.c, iunVar)) {
            ivhVar.c = iunVar;
            ivhVar.G(0);
        }
        ivq ivqVar = new ivq();
        if (!yks.e(ivhVar.d, ivqVar)) {
            ivhVar.d = ivqVar;
            ivhVar.G(1);
        }
        ivl ivlVar = new ivl(this.n.a);
        if (!yks.e(ivhVar.e, ivlVar)) {
            ivhVar.e = ivlVar;
            ivhVar.G(2);
        }
        return ivhVar;
    }

    public final void b(PopupMenu popupMenu) {
        Drawable icon;
        Drawable icon2;
        boolean zI = i();
        Menu menu = popupMenu.getMenu();
        MenuItem menuItemFindItem = menu.findItem(R.id.swipe_pad_mode);
        if (menuItemFindItem != null && (icon2 = menuItemFindItem.getIcon()) != null) {
            icon2.setAlpha(true != zI ? 0 : 255);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.dpad_mode);
        if (menuItemFindItem2 == null || (icon = menuItemFindItem2.getIcon()) == null) {
            return;
        }
        icon.setAlpha(true != zI ? 255 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0a08 A[PHI: r12
  0x0a08: PHI (r12v42 ivf) = (r12v39 ivf), (r12v43 ivf) binds: [B:401:0x0a06, B:411:0x0a20] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0b07  */
    /* JADX WARN: Type inference failed for: r14v19, types: [idr, ids, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ids, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30, types: [ivq, scf] */
    /* JADX WARN: Type inference failed for: r4v31, types: [ivl, scf] */
    /* JADX WARN: Type inference failed for: r4v41, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v73, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v115 */
    /* JADX WARN: Type inference failed for: r9v116 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v73, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v89, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.sbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void c(java.lang.Object r32, java.lang.Object r33) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivd.c(java.lang.Object, java.lang.Object):void");
    }

    public final void d(boolean z) {
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("virtual_remote", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean("prefer_trackpad", z);
        editorEdit.apply();
    }

    public final boolean e(ith ithVar) {
        if (ithVar == null || !ithVar.n()) {
            return false;
        }
        return ((Boolean) xmz.a.et(((xmz) this.k).b)).booleanValue();
    }

    public final void f(int i2, int i3) {
        iwu iwuVar;
        ith ithVarE = this.c.e();
        if (ithVarE == null || (iwuVar = ((iua) ithVarE).j) == null) {
            return;
        }
        iwuVar.h(i2, i3);
    }
}
