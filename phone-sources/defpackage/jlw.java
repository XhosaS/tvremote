package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlw extends sbx {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/presentation/components/entity/title/TitlePresenter");
    public static final AtomicBoolean b = new AtomicBoolean(false);
    private final dhq A;
    public final jaf c;
    public final mjl d;
    public final itk e;
    public final xlc f;
    public final kja g;
    public ExoPlayer h;
    public out i;
    public TextureView j;
    public ImageView k;
    public final Handler l;
    public final long m;
    public final long n;
    public long o;
    public boolean p;
    public String q;
    public final ovq r;
    public final iyz s;
    public final gag t;
    private final xke u;
    private final xhg v;
    private final lfn w;
    private final iea x;
    private final ihg y;
    private final yow z;

    public jlw(dhq dhqVar, jaf jafVar, mjl mjlVar, jan janVar, itk itkVar, gag gagVar, xlc xlcVar, xke xkeVar, ovq ovqVar, xhg xhgVar, lfn lfnVar, iea ieaVar, ihg ihgVar, kja kjaVar, iyz iyzVar, yow yowVar) {
        jafVar.getClass();
        mjlVar.getClass();
        janVar.getClass();
        itkVar.getClass();
        gagVar.getClass();
        ovqVar.getClass();
        lfnVar.getClass();
        kjaVar.getClass();
        iyzVar.getClass();
        this.A = dhqVar;
        this.c = jafVar;
        this.d = mjlVar;
        this.e = itkVar;
        this.t = gagVar;
        this.f = xlcVar;
        this.u = xkeVar;
        this.r = ovqVar;
        this.v = xhgVar;
        this.w = lfnVar;
        this.x = ieaVar;
        this.y = ihgVar;
        this.g = kjaVar;
        this.s = iyzVar;
        this.z = yowVar;
        this.l = new Handler(Looper.getMainLooper());
        ryv ryvVar = xhh.a;
        this.m = ((Long) ryvVar.c(4, "AppRefreshFeature__trailer_autoplay_delay_ms", 3000L).et(((xhh) xhgVar).b)).longValue();
        this.n = ((Long) ryvVar.c(5, "AppRefreshFeature__trailer_autoplay_duration_ms", 15000L).et(((xhh) xhgVar).b)).longValue();
    }

    public static final void h(View view, float f) {
        view.getClass();
        view.animate().setStartDelay(0L).setDuration(500L).setInterpolator(new LinearInterpolator()).alpha(f);
        view.setVisibility(0);
    }

    public static final void i(View view) {
        view.getClass();
        view.animate().setStartDelay(0L).setDuration(500L).setInterpolator(new LinearInterpolator()).alpha(0.0f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jma jmaVar = new jma(this.A.a);
        jmaVar.a = new jeu(this, (jlu) obj, 20);
        jmaVar.b = new jfu(this, 4);
        return jmaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
    @Override // defpackage.sbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void c(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlw.c(java.lang.Object, java.lang.Object):void");
    }

    public final ImageView d() {
        ImageView imageView = this.k;
        if (imageView != null) {
            return imageView;
        }
        yks.c("thumbnailView");
        return null;
    }

    public final void e() {
        if (b.compareAndSet(false, true)) {
            this.r.d();
            ((tug) a.b().h(tvo.a, "[GTVM-Kinetoscope]").j("com/google/android/apps/googletv/app/presentation/components/entity/title/TitlePresenter", "maybeReleaseTrailerAutoplayController$java_com_google_android_apps_googletv_app_presentation_components_entity_title_title", 146, "TitlePresenter.kt")).s("TrailerAutoplayController Released");
        }
    }

    public final void f(View view, jlu jluVar) {
        igz.a("trailer playback feature", this.u.f(), new isg(view, jluVar, 12), new isg(view, jluVar, 13), new iwg(16), new iwg(17));
    }

    public final void g(TextureView textureView) {
        ExoPlayer exoPlayer = this.h;
        if (exoPlayer != null) {
            ovq ovqVar = this.r;
            Context context = textureView.getContext();
            context.getClass();
            String str = ((ksn) ((ldy) this.x).a().g()).a;
            String strBo = this.w.bo();
            strBo.getClass();
            ovqVar.e(context, exoPlayer, str, strBo);
        }
    }
}
