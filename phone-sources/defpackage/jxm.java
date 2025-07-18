package defpackage;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jxm extends jxs implements jeh, pim {
    public static final jxl Companion = new jxl();
    private static final boolean w;
    private final yft A;
    private int B;
    public iea a;
    public ieh b;
    public iys c;
    public kmo d;
    public boolean e;
    public woi f;
    public String g;
    public int h;
    public boolean i;
    public boolean j;
    public MaterialToolbar k;
    public final idr l;
    public kwy m;
    private final idr x;
    private final yft y;
    private jxq z;

    /* renamed from: $r8$lambda$4yqMpbDdan-sJgZth8LA6TFV_u8, reason: not valid java name */
    public static /* synthetic */ cyh m440$r8$lambda$4yqMpbDdansJgZth8LA6TFV_u8(jxm jxmVar, View view, cyh cyhVar) {
        int i = cyhVar.f(128).e;
        int i2 = cyhVar.f(519).e;
        int paddingBottom = i + i2;
        jxmVar.h = paddingBottom;
        if (i <= 0 && i2 <= 0) {
            paddingBottom = view.getPaddingBottom();
        }
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), paddingBottom);
        return cyhVar;
    }

    public static /* synthetic */ cyh $r8$lambda$UUdttzYCVOqfgp4QEhvTq8v7boE(jxm jxmVar, View view, cyh cyhVar) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (cyhVar.b() > 0) {
            paddingLeft = cyhVar.b();
        }
        if (cyhVar.c() > 0) {
            paddingRight = cyhVar.c();
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, view.getPaddingBottom());
        return cyhVar;
    }

    public static /* synthetic */ cyh $r8$lambda$bIE_oFduKtkoUrs57zFmuooJEiE(jxm jxmVar, View view, cyh cyhVar) {
        int i = cyhVar.f(519).c;
        ihz.P(view, i);
        if (!w) {
            ihz.Q(view, -i);
        }
        return cyhVar;
    }

    public static /* synthetic */ RecyclerView.RecycledViewPool $r8$lambda$swMqOljlQwRUXgvJY7TvpKtb5RU() {
        return new RecyclerView.RecycledViewPool();
    }

    public static /* synthetic */ cyh $r8$lambda$x7GxonvvrxcdHcBLj5LE9DHI9Yc(jxm jxmVar, View view, cyh cyhVar) {
        ihz.Q(view, -cyhVar.f(519).c);
        return cyhVar;
    }

    static {
        w = Build.VERSION.SDK_INT >= 30;
    }

    public jxm() {
        woi woiVar = woi.a;
        woiVar.getClass();
        this.f = woiVar;
        this.g = "";
        this.i = true;
        this.j = true;
        this.x = new idz(true);
        this.l = new idz(false);
        int i = ylg.a;
        this.y = new jej(new ykl(jxk.class), new bck(this, 3), this);
        this.B = 3;
        this.A = new yga(new gel(15));
    }

    private final ColorDrawable a() {
        return new ColorDrawable(sip.d(this, R.attr.statusBarColor, -16777216));
    }

    private final jxk b() {
        return (jxk) this.y.a();
    }

    @Override // defpackage.pim
    public final /* synthetic */ uhp d(String str) {
        return rdd.ae(str);
    }

    @Override // defpackage.pim
    public final rzg dU(pil pilVar) {
        int i = pilVar.a;
        if (i != 0 && i - 1 == 5) {
            return new rzg(true, this.B, 1);
        }
        if (b().a) {
            return new rzg(false, 1, 2);
        }
        b().a = true;
        return new rzg(true, this.B, 1);
    }

    public RecyclerView.RecycledViewPool g() {
        return h();
    }

    public final RecyclerView.RecycledViewPool h() {
        return (RecyclerView.RecycledViewPool) this.A.a();
    }

    public abstract RecyclerView i();

    public abstract View j();

    public abstract View k();

    public abstract FrameLayout l();

    public final iea m() {
        iea ieaVar = this.a;
        if (ieaVar != null) {
            return ieaVar;
        }
        yks.c("accountRepository");
        return null;
    }

    public final iys n() {
        iys iysVar = this.c;
        if (iysVar != null) {
            return iysVar;
        }
        yks.c("growthKitManager");
        return null;
    }

    public abstract AppBarLayout o();

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!y().cJ()) {
            if (v().e()) {
                setTheme(com.google.android.videos.R.style.Theme_GoogleTvGM3ExpressiveDark);
                return;
            } else {
                setTheme(com.google.android.videos.R.style.Theme_GoogleTv_Dark);
                return;
            }
        }
        getDelegate().setLocalNightMode(1);
        if (v().e()) {
            setTheme(com.google.android.videos.R.style.Theme_GoogleTvGM3ExpressiveLight);
        } else {
            setTheme(com.google.android.videos.R.style.Theme_GoogleTv_Light);
        }
        new cxe(getWindow(), getWindow().getDecorView()).i(true);
        this.B = 2;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(com.google.android.videos.R.menu.base_page_menu_material, menu);
        if (t() || !this.i) {
            menu.removeItem(com.google.android.videos.R.id.base_menu_share);
        }
        kmo kmoVar = this.d;
        if (kmoVar == null) {
            yks.c("sherlogFeedbackManager");
            kmoVar = null;
        }
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.getClass();
        kmoVar.c(menu, menuInflater);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            if (getSupportFragmentManager().a() != 0) {
                return true;
            }
            overridePendingTransition(com.google.android.videos.R.anim.exit_details_parent_activity_transition, com.google.android.videos.R.anim.exit_details_details_activity_transition);
            return true;
        }
        if (itemId == com.google.android.videos.R.id.base_menu_search) {
            D().h(this);
            return true;
        }
        if (itemId == com.google.android.videos.R.id.base_menu_help_and_feedback) {
            s();
            return true;
        }
        if (itemId != com.google.android.videos.R.id.base_menu_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (t()) {
            return false;
        }
        u().a(this, this.f);
        return true;
    }

    @Override // defpackage.by, android.app.Activity
    protected void onPause() {
        super.onPause();
        n().b();
    }

    @Override // defpackage.jxs, defpackage.by, android.app.Activity
    protected void onResume() {
        super.onResume();
        n().a(this);
    }

    public final void p(woi woiVar) {
        woiVar.getClass();
        this.f = woiVar;
    }

    public final void q() {
        if (w) {
            j().setFitsSystemWindows(false);
            o().setFitsSystemWindows(true);
            l().setFitsSystemWindows(true);
            cwn.c(getWindow(), false);
            if (Build.VERSION.SDK_INT >= 28) {
                getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            }
            getWindow().setNavigationBarColor(0);
            if (i() != null) {
                RecyclerView recyclerViewI = i();
                recyclerViewI.getClass();
                czn cznVar = new czn(this, 5);
                int[] iArr = cww.a;
                cwm.l(recyclerViewI, cznVar);
            }
            if (getResources().getConfiguration().orientation != 1) {
                View decorView = getWindow().getDecorView();
                czn cznVar2 = new czn(this, 6);
                int[] iArr2 = cww.a;
                cwm.l(decorView, cznVar2);
            }
        } else {
            View viewK = k();
            czn cznVar3 = new czn(this, 7);
            int[] iArr3 = cww.a;
            cwm.l(viewK, cznVar3);
        }
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.setStatusBarColor(0);
        FrameLayout frameLayoutL = l();
        czn cznVar4 = new czn(this, 8);
        int[] iArr4 = cww.a;
        cwm.l(frameLayoutL, cznVar4);
        l().setBackground(new TransitionDrawable(new ColorDrawable[]{new ColorDrawable(0), a()}));
        l().setElevation(1000.0f);
    }

    public final void r() {
        ActionBar supportActionBar;
        if (this.k == null) {
            MaterialToolbar materialToolbar = new MaterialToolbar(this);
            materialToolbar.setId(com.google.android.videos.R.id.gtv_toolbar);
            this.k = materialToolbar;
            o().addView(this.k);
        }
        MaterialToolbar materialToolbar2 = this.k;
        materialToolbar2.getClass();
        if (materialToolbar2.getLayoutParams() instanceof soc) {
            MaterialToolbar materialToolbar3 = this.k;
            materialToolbar3.getClass();
            ViewGroup.LayoutParams layoutParams = materialToolbar3.getLayoutParams();
            layoutParams.getClass();
            soc socVar = (soc) layoutParams;
            socVar.a = 5;
            MaterialToolbar materialToolbar4 = this.k;
            materialToolbar4.getClass();
            materialToolbar4.setLayoutParams(socVar);
        }
        o().setBackground(new TransitionDrawable(new ColorDrawable[]{new ColorDrawable(0), a()}));
        o().bringToFront();
        AppBarLayout appBarLayoutO = o();
        idr idrVar = this.l;
        idr idrVar2 = this.x;
        MaterialToolbar materialToolbar5 = this.k;
        materialToolbar5.getClass();
        this.z = new jxq(appBarLayoutO, idrVar, idrVar2, materialToolbar5, this.e, this.g);
        RecyclerView recyclerViewI = i();
        if (recyclerViewI != null) {
            jxq jxqVar = this.z;
            jxqVar.getClass();
            recyclerViewI.addOnScrollListener(jxqVar);
        }
        MaterialToolbar materialToolbar6 = this.k;
        materialToolbar6.getClass();
        materialToolbar6.setTitle((this.g.length() <= 0 || this.e) ? "" : this.g);
        o().h(new jxn(l(), idrVar2));
        setSupportActionBar(this.k);
        if (!this.j || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setHomeAsUpIndicator(com.google.android.videos.R.drawable.ic_arrow_back_24dp);
    }

    public abstract void s();

    public final boolean t() {
        if (yks.e(this.f, woi.a)) {
            return true;
        }
        String str = this.f.c;
        str.getClass();
        return str.length() == 0;
    }

    public final kwy u() {
        kwy kwyVar = this.m;
        if (kwyVar != null) {
            return kwyVar;
        }
        yks.c("sharingManager");
        return null;
    }

    @Override // defpackage.pim
    public final by dR() {
        return this;
    }
}
