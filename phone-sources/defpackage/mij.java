package defpackage;

import android.app.ActivityManager;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mij extends xcf {
    private static final tui b = tui.l("com/google/android/apps/play/movies/mobile/presenter/activity/PlayMoviesAppCompatActivity");
    public lfn a;

    protected void j() {
        boolean zCH = this.a.cH();
        int i = R.style.Theme_GoogleTv_Dark;
        if (!zCH && !this.a.cL()) {
            i = R.style.MoviesTheme;
        }
        setTheme(i);
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ((tug) ((tug) b.g()).j("com/google/android/apps/play/movies/mobile/presenter/activity/PlayMoviesAppCompatActivity", "onCreate", 29, "PlayMoviesAppCompatActivity.java")).D("[Playback] PlayMoviesAppCompatActivity.onCreate: savedInstanceStateIsPresent=%b, savedInstanceState=%s", bundle != null, bundle);
        super.onCreate(bundle);
        jwq.R(this);
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        }
        j();
        boolean zCH = this.a.cH();
        int i = R.mipmap.ic_launcher_gtv;
        if (!zCH && !this.a.cL()) {
            i = R.mipmap.ic_launcher_videos;
        }
        setTaskDescription(new ActivityManager.TaskDescription(getString(R.string.application_name), BitmapFactory.decodeResource(getResources(), i), jwq.C(this, android.R.attr.colorPrimary)));
    }
}
