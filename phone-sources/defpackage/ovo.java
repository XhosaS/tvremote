package defpackage;

import android.content.pm.PackageManager;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ovo implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ovo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjk
    public final Object a() {
        switch (this.b) {
            case 0:
                ExoPlayer exoPlayer = ((ovq) this.a).a;
                if (exoPlayer != null) {
                    exoPlayer.W();
                }
                return ygi.a;
            case 1:
                return BootstrapWatchActivity.$r8$lambda$sR6KNn8M4QFqb3GaMZXqhZOtwfs((BootstrapWatchActivity) this.a);
            case 2:
                boolean z = false;
                try {
                    if (crp.b(((qij) this.a).b.getPackageManager().getPackageInfo("com.android.chrome", 0)) >= 705100000) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((tvk) ((tvk) qij.a.g()).i(e)).s("Chrome is not installed");
                } catch (Exception e2) {
                    ((tvk) ((tvk) qij.a.g()).i(e2)).v("getPackageInfo(%s) failed", "com.android.chrome");
                }
                return Boolean.valueOf(z);
            case 3:
                ((rdi) this.a).c();
                return ygi.a;
            case 4:
                this.a.t(null);
                return ygi.a;
            case 5:
                return this.a;
            case 6:
                return zcb.b(this.a);
            default:
                return this.a;
        }
    }
}
