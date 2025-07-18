package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import com.google.android.apps.play.movies.mobile.usecase.watch.bingewatch.BingeWatchCard;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msi extends lkx implements lkc, loc, iej {
    public final lio a;
    public int b;
    protected ViewGroup c;
    protected boolean d;
    protected BingeWatchCard e;
    private final Activity f;
    private final SharedPreferences g;
    private final mem h;
    private final int i;
    private final int j;
    private final ieh k;
    private final iea l;
    private final iea m;
    private final ids n;
    private final idb o;
    private final LayoutInflater p;
    private final msx q;
    private kuo r;
    private kuo s;
    private int t;
    private boolean u;
    private int v;
    private int w;
    private final lin x;

    public msi(SharedPreferences sharedPreferences, mem memVar, lxj lxjVar, iea ieaVar, Activity activity, ksy ksyVar, int i, int i2, lin linVar, idb idbVar, msx msxVar, LayoutInflater layoutInflater) {
        this.f = activity;
        this.g = sharedPreferences;
        this.h = memVar;
        this.i = i;
        this.j = i2;
        this.k = ieaVar;
        this.x = linVar;
        this.o = idbVar;
        this.p = layoutInflater;
        this.q = msxVar;
        this.a = new lif(liq.f(154, ksyVar), linVar);
        iea ieaVarF = lxjVar.f(ksyVar);
        this.l = ieaVarF;
        iea ieaVarG = lxjVar.g(ksyVar);
        this.m = ieaVarG;
        this.n = hjt.d(ieaVarF, ieaVarG, ieaVar);
    }

    private final void i() {
        if (this.b == 3) {
            this.e.c(false);
        }
    }

    private final void j() {
        if (this.r == null) {
            this.b = 1;
        } else {
            k();
        }
    }

    private final void k() {
        BingeWatchCard bingeWatchCard = this.e;
        bingeWatchCard.setVisibility(4);
        bingeWatchCard.d = ((View) bingeWatchCard.getParent()).willNotDraw();
        BingeWatchCard bingeWatchCard2 = this.e;
        hke hkeVarE = hjr.c(bingeWatchCard2.getContext()).e(this.r.q);
        if (hvc.s == null) {
            hvc hvcVar = (hvc) new hvc().m();
            hvcVar.L();
            hvc.s = hvcVar;
        }
        hkeVarE.h(hvc.s).k(bingeWatchCard2.b);
        this.b = 2;
    }

    private final boolean l() {
        if (this.h.d()) {
            return true;
        }
        return this.r != null && ((kuk) this.k.a()).a(this.r.c).g();
    }

    @Override // defpackage.lkc
    public final void a(ViewGroup viewGroup) {
        BingeWatchCard bingeWatchCard = this.e;
        if (bingeWatchCard != null) {
            bingeWatchCard.g = null;
        }
        BingeWatchCard bingeWatchCard2 = (BingeWatchCard) this.p.inflate(R.layout.binge_watch_card, viewGroup, false);
        viewGroup.addView(bingeWatchCard2);
        this.c = viewGroup;
        this.d = viewGroup.getClipChildren();
        viewGroup.setClipToPadding(false);
        this.e = bingeWatchCard2;
        bingeWatchCard2.c = true;
        bingeWatchCard2.setPadding(0, 0, 0, 0);
        this.e.g = this;
    }

    @Override // defpackage.lkc
    public final void b() {
        this.n.ea(this);
    }

    @Override // defpackage.lkc
    public final void c() {
        this.n.ee(this);
    }

    @Override // defpackage.iej
    public final void dM() {
        kuo kuoVar = (kuo) ((ieg) this.l.a()).c;
        this.r = kuoVar;
        if (kuoVar != null && this.s != null && this.b == 1) {
            k();
        }
        this.s = (kuo) ((ieg) this.m.a()).c;
    }

    @Override // defpackage.lkc
    public final void e() {
        kuo kuoVar = this.r;
        if (kuoVar == null) {
            krd.c("Can't start next episode because it is null");
        } else {
            Activity activity = this.f;
            activity.startActivity(BootstrapWatchActivity.createEpisodeIntentFromBeginning(activity, kuoVar, "binge", null));
        }
    }

    @Override // defpackage.lkc
    public final void f() {
        kuo kuoVar = this.s;
        if (kuoVar == null) {
            krd.c("Can't start previous episode because it is null");
        } else {
            Activity activity = this.f;
            activity.startActivity(BootstrapWatchActivity.createEpisodeIntentFromBeginning(activity, kuoVar, "binge", null));
        }
    }

    @Override // defpackage.lkc
    public final void g() throws Resources.NotFoundException {
        this.c.setClipChildren(this.d);
        BingeWatchCard bingeWatchCard = this.e;
        if (bingeWatchCard != null) {
            boolean zIsFinishing = this.f.isFinishing();
            bingeWatchCard.animate().cancel();
            bingeWatchCard.b("", "");
            bingeWatchCard.a(-1);
            if (!zIsFinishing) {
                bingeWatchCard.setVisibility(8);
            }
        }
        if (this.b != 5) {
            this.b = 0;
        }
    }

    public final void h() {
        ImageView imageView = this.e.b;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
        imageView.draw(new Canvas(bitmapCreateBitmap));
        ActivityOptions activityOptionsMakeThumbnailScaleUpAnimation = ActivityOptions.makeThumbnailScaleUpAnimation(imageView, bitmapCreateBitmap, 0, 0);
        Activity activity = this.f;
        activity.finish();
        activity.startActivity(BootstrapWatchActivity.createEpisodeIntentFromBeginning(activity, this.r, kgu.C("binge", "episode"), null), activityOptionsMakeThumbnailScaleUpAnimation.toBundle());
    }

    @Override // defpackage.lob
    public final void onControlsHidden() {
        this.u = false;
    }

    @Override // defpackage.lob
    public final void onControlsShown() {
        i();
        this.u = true;
    }

    @Override // defpackage.lkx, defpackage.lkr
    public final void onPlayerProgress(int i, int i2, int i3) throws Resources.NotFoundException {
        int i4;
        int i5;
        if (this.e == null || (i4 = this.v) == 0) {
            return;
        }
        if (this.t == 0) {
            this.t = Math.min(this.w + this.j, i4 - 1000);
        }
        int i6 = this.w;
        if (i6 <= 0) {
            this.b = 5;
        }
        if (i3 < 0 || i3 > i6 || (i5 = this.b) == 5) {
            return;
        }
        if (i5 == 0 && i >= i6 - 2000) {
            j();
            return;
        }
        int i7 = this.v;
        if (krh.isBingeWatchingEnabledInPreferences(this.g) && !((mrm) this.o).h && this.b == 2 && i >= this.w && !this.u && !this.q.b() && l()) {
            int i8 = (i7 - 1000) - this.w;
            int i9 = this.i;
            if (i8 >= i9 && i <= i7 - i9) {
                if (i > this.t - i9) {
                    this.t = i9 + i;
                }
                this.c.setClipChildren(false);
                BingeWatchCard bingeWatchCard = this.e;
                kuo kuoVar = this.r;
                bingeWatchCard.b(kuoVar.n, kuoVar.e);
                this.e.a(Math.max((this.t - i) / 1000, 0));
                this.e.c(true);
                this.x.d(((lif) this.a).b);
            }
        }
        if (this.b == 3) {
            this.e.a(Math.max((this.t - i) / 1000, 0));
            if (i >= this.t) {
                i();
                h();
                nqq.j(155, this.a);
            }
        }
    }

    @Override // defpackage.lkx, defpackage.lkr
    public final void onPlayerStateChanged(int i, llt lltVar, int i2) {
        if (!((mrm) this.o).h && i == 5) {
            if (krh.isBingeWatchingEnabledInPreferences(this.g)) {
                int i3 = this.b;
                if (i3 == 3) {
                    h();
                    nqq.j(155, this.a);
                    return;
                } else if (i3 == 2 && l()) {
                    h();
                    return;
                }
            }
            this.f.finish();
        }
    }

    @Override // defpackage.lkx, defpackage.lkr
    public final void onVideoInfo(String str, int i, int i2, kuw kuwVar, ieg<lvd> iegVar, int i3) {
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.loc
    public final void r() {
        if (this.b == 4) {
            this.e.c(true);
        }
    }

    @Override // defpackage.loc
    public final void s(int i) {
        i();
    }

    @Override // defpackage.loc
    public final void t(int i, int i2, boolean z) throws Resources.NotFoundException {
        if (this.b == 5 || !z) {
            return;
        }
        if (i2 < this.w) {
            g();
        }
        if (i2 >= this.w - 2000) {
            j();
        }
    }
}
