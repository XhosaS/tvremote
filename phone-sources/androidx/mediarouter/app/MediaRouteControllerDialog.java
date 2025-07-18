package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.OverlayListView;
import com.google.android.videos.R;
import defpackage.csq;
import defpackage.dt;
import defpackage.du;
import defpackage.ee;
import defpackage.et;
import defpackage.eu;
import defpackage.ey;
import defpackage.fur;
import defpackage.fus;
import defpackage.fux;
import defpackage.fuy;
import defpackage.gag;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteControllerDialog extends AlertDialog {
    public static final /* synthetic */ int W = 0;
    static final int a = (int) TimeUnit.SECONDS.toMillis(30);
    Map A;
    MediaControllerCallback B;
    ey C;
    dt D;
    FetchArtTask E;
    Bitmap F;
    Uri G;
    boolean H;
    Bitmap I;
    int J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    int P;
    public int Q;
    public int R;
    public Interpolator S;
    final AccessibilityManager T;
    Runnable U;
    eu V;
    private final MediaRouterCallback X;
    private boolean Y;
    private boolean Z;
    private int aa;
    private Button ab;
    private Button ac;
    private ImageButton ad;
    private ImageButton ae;
    private MediaRouteExpandCollapseButton af;
    private FrameLayout ag;
    private TextView ah;
    private TextView ai;
    private TextView aj;
    private boolean ak;
    private View al;
    private Interpolator am;
    private Interpolator an;
    final fuy b;
    final fux c;
    Context d;
    public View e;
    public FrameLayout f;
    public LinearLayout g;
    FrameLayout h;
    public ImageView i;
    final boolean j;
    public LinearLayout k;
    public RelativeLayout l;
    LinearLayout m;
    OverlayListView n;
    VolumeGroupAdapter o;
    public List p;
    Set q;
    public Set r;
    Set s;
    SeekBar t;
    VolumeChangeListener u;
    fux v;
    public int w;
    public int x;
    public int y;
    public final int z;

    /* compiled from: PG */
    final class ClickListener implements View.OnClickListener {
        public ClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ey eyVar;
            int id = view.getId();
            if (id == 16908313 || id == 16908314) {
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                if (mediaRouteControllerDialog.c.t()) {
                    fuy.q(id == 16908313 ? 2 : 1);
                }
                mediaRouteControllerDialog.dismiss();
                return;
            }
            if (id != R.id.mr_control_playback_ctrl) {
                if (id == R.id.mr_close) {
                    MediaRouteControllerDialog.this.dismiss();
                    return;
                }
                return;
            }
            MediaRouteControllerDialog mediaRouteControllerDialog2 = MediaRouteControllerDialog.this;
            if (mediaRouteControllerDialog2.V == null || (eyVar = mediaRouteControllerDialog2.C) == null) {
                return;
            }
            int i = 0;
            int i2 = eyVar.a != 3 ? 0 : 1;
            if (i2 != 0 && mediaRouteControllerDialog2.r()) {
                mediaRouteControllerDialog2.V.m().a();
                i = R.string.mr_controller_pause;
            } else if (i2 != 0 && mediaRouteControllerDialog2.t()) {
                mediaRouteControllerDialog2.V.m().c();
                i = R.string.mr_controller_stop;
            } else if (i2 == 0 && mediaRouteControllerDialog2.s()) {
                mediaRouteControllerDialog2.V.m().b();
                i = R.string.mr_controller_play;
            }
            AccessibilityManager accessibilityManager = mediaRouteControllerDialog2.T;
            if (accessibilityManager == null || !accessibilityManager.isEnabled() || i == 0) {
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.setPackageName(mediaRouteControllerDialog2.d.getPackageName());
            accessibilityEventObtain.setClassName(getClass().getName());
            accessibilityEventObtain.getText().add(mediaRouteControllerDialog2.d.getString(i));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
    }

    /* compiled from: PG */
    class FetchArtTask extends AsyncTask<Void, Void, Bitmap> {
        private final Bitmap b;
        private final Uri c;
        private int d;
        private long e;

        public FetchArtTask() {
            dt dtVar = MediaRouteControllerDialog.this.D;
            Bitmap bitmap = dtVar == null ? null : dtVar.c;
            if (MediaRouteControllerDialog.p(bitmap)) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.b = bitmap;
            dt dtVar2 = MediaRouteControllerDialog.this.D;
            this.c = dtVar2 != null ? dtVar2.d : null;
        }

        private final InputStream a(Uri uri) throws IOException {
            InputStream inputStreamOpenInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStreamOpenInputStream = MediaRouteControllerDialog.this.d.getContentResolver().openInputStream(uri);
            } else {
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                int i = MediaRouteControllerDialog.a;
                uRLConnectionOpenConnection.setConnectTimeout(i);
                uRLConnectionOpenConnection.setReadTimeout(i);
                inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
            }
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStreamOpenInputStream);
        }

        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0091: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:146), block:B:34:0x0091 */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected final /* bridge */ /* synthetic */ android.graphics.Bitmap doInBackground(java.lang.Void[] r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.FetchArtTask.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public Bitmap getIconBitmap() {
            return this.b;
        }

        public Uri getIconUri() {
            return this.c;
        }

        @Override // android.os.AsyncTask
        protected final /* bridge */ /* synthetic */ void onPostExecute(Bitmap bitmap) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            Bitmap bitmap2 = bitmap;
            mediaRouteControllerDialog.E = null;
            Bitmap bitmap3 = mediaRouteControllerDialog.F;
            Bitmap bitmap4 = this.b;
            if (Objects.equals(bitmap3, bitmap4) && Objects.equals(mediaRouteControllerDialog.G, this.c)) {
                return;
            }
            mediaRouteControllerDialog.F = bitmap4;
            mediaRouteControllerDialog.I = bitmap2;
            mediaRouteControllerDialog.G = this.c;
            mediaRouteControllerDialog.J = this.d;
            mediaRouteControllerDialog.H = true;
            mediaRouteControllerDialog.j(SystemClock.uptimeMillis() - this.e > 120);
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            this.e = SystemClock.uptimeMillis();
            MediaRouteControllerDialog.this.f();
        }
    }

    /* compiled from: PG */
    final class MediaControllerCallback extends ee {
        public MediaControllerCallback() {
        }

        @Override // defpackage.ee
        public void onMetadataChanged(du duVar) {
            dt dtVarB = duVar == null ? null : duVar.b();
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            mediaRouteControllerDialog.D = dtVarB;
            mediaRouteControllerDialog.k();
            mediaRouteControllerDialog.j(false);
        }

        @Override // defpackage.ee
        public void onPlaybackStateChanged(ey eyVar) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            mediaRouteControllerDialog.C = eyVar;
            mediaRouteControllerDialog.j(false);
        }

        @Override // defpackage.ee
        public void onSessionDestroyed() {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            eu euVar = mediaRouteControllerDialog.V;
            if (euVar != null) {
                euVar.p(mediaRouteControllerDialog.B);
                mediaRouteControllerDialog.V = null;
            }
        }
    }

    /* compiled from: PG */
    final class MediaRouterCallback extends fus {
        public MediaRouterCallback() {
        }

        @Override // defpackage.fus
        public void onRouteChanged(fuy fuyVar, fux fuxVar) {
            MediaRouteControllerDialog.this.j(true);
        }

        @Override // defpackage.fus
        public void onRouteUnselected(fuy fuyVar, fux fuxVar) {
            MediaRouteControllerDialog.this.j(false);
        }

        @Override // defpackage.fus
        public void onRouteVolumeChanged(fuy fuyVar, fux fuxVar) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            SeekBar seekBar = (SeekBar) mediaRouteControllerDialog.A.get(fuxVar);
            int i = fuxVar.n;
            if (seekBar == null || mediaRouteControllerDialog.v == fuxVar) {
                return;
            }
            seekBar.setProgress(i);
        }
    }

    /* compiled from: PG */
    class VolumeChangeListener implements SeekBar.OnSeekBarChangeListener {
        private final Runnable b = new Runnable() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.VolumeChangeListener.1
            @Override // java.lang.Runnable
            public void run() {
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                if (mediaRouteControllerDialog.v != null) {
                    mediaRouteControllerDialog.v = null;
                    if (mediaRouteControllerDialog.K) {
                        mediaRouteControllerDialog.j(mediaRouteControllerDialog.L);
                    }
                }
            }
        };

        public VolumeChangeListener() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                fux fuxVar = (fux) seekBar.getTag();
                int i2 = MediaRouteControllerDialog.W;
                fuxVar.l(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
            if (mediaRouteControllerDialog.v != null) {
                mediaRouteControllerDialog.t.removeCallbacks(this.b);
            }
            mediaRouteControllerDialog.v = (fux) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaRouteControllerDialog.this.t.postDelayed(this.b, 500L);
        }
    }

    /* compiled from: PG */
    class VolumeGroupAdapter extends ArrayAdapter<fux> {
        final float a;

        public VolumeGroupAdapter(Context context, List<fux> list) {
            super(context, 0, list);
            this.a = MediaRouterThemeHelper.a(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                MediaRouteControllerDialog.i((LinearLayout) view.findViewById(R.id.volume_item_container), mediaRouteControllerDialog.x);
                View viewFindViewById = view.findViewById(R.id.mr_volume_item_icon);
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                layoutParams.width = mediaRouteControllerDialog.w;
                layoutParams.height = mediaRouteControllerDialog.w;
                viewFindViewById.setLayoutParams(layoutParams);
            }
            fux item = getItem(i);
            if (item != null) {
                boolean z = item.h;
                TextView textView = (TextView) view.findViewById(R.id.mr_name);
                textView.setEnabled(z);
                textView.setText(item.e);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
                Context context = viewGroup.getContext();
                MediaRouteControllerDialog mediaRouteControllerDialog2 = MediaRouteControllerDialog.this;
                MediaRouterThemeHelper.o(context, mediaRouteVolumeSlider, mediaRouteControllerDialog2.n);
                mediaRouteVolumeSlider.setTag(item);
                mediaRouteControllerDialog2.A.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.setHideThumb(!z);
                mediaRouteVolumeSlider.setEnabled(z);
                if (z) {
                    if (mediaRouteControllerDialog2.u(item)) {
                        mediaRouteVolumeSlider.setMax(item.o);
                        mediaRouteVolumeSlider.setProgress(item.n);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(mediaRouteControllerDialog2.u);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z ? 255 : (int) (this.a * 255.0f));
                ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(true == mediaRouteControllerDialog2.s.contains(item) ? 4 : 0);
                Set set = mediaRouteControllerDialog2.q;
                if (set != null && set.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return false;
        }
    }

    public MediaRouteControllerDialog(Context context) {
        this(context, 0);
    }

    public static int b(View view) {
        return view.getLayoutParams().height;
    }

    static void i(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    static boolean p(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    private final void v(et etVar) {
        eu euVar = this.V;
        if (euVar != null) {
            euVar.p(this.B);
            this.V = null;
        }
        if (etVar != null && this.Z) {
            eu euVar2 = new eu(this.d, etVar);
            this.V = euVar2;
            euVar2.o(this.B);
            du duVarL = this.V.l();
            this.D = duVarL != null ? duVarL.b() : null;
            this.C = this.V.n();
            k();
            j(false);
        }
    }

    final int a(int i, int i2) {
        return i >= i2 ? (int) (((this.aa * i2) / i) + 0.5f) : (int) (((this.aa * 9.0f) / 16.0f) + 0.5f);
    }

    public final int c(boolean z) {
        if (!z && this.m.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = this.k.getPaddingTop() + this.k.getPaddingBottom();
        if (z) {
            paddingTop += this.l.getMeasuredHeight();
        }
        if (this.m.getVisibility() == 0) {
            paddingTop += this.m.getMeasuredHeight();
        }
        return (z && this.m.getVisibility() == 0) ? paddingTop + this.al.getMeasuredHeight() : paddingTop;
    }

    public final void d(final View view, final int i) {
        final int iB = b(view);
        Animation animation = new Animation() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.7
            @Override // android.view.animation.Animation
            protected final void applyTransformation(float f, Transformation transformation) {
                MediaRouteControllerDialog.i(view, iB - ((int) ((r0 - i) * f)));
            }
        };
        animation.setDuration(this.P);
        animation.setInterpolator(this.S);
        view.startAnimation(animation);
    }

    final void e(boolean z) {
        Set set;
        int firstVisiblePosition = this.n.getFirstVisiblePosition();
        for (int i = 0; i < this.n.getChildCount(); i++) {
            View childAt = this.n.getChildAt(i);
            fux item = this.o.getItem(firstVisiblePosition + i);
            if (!z || (set = this.q) == null || !set.contains(item)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.n.stopAnimationAll();
        if (z) {
            return;
        }
        g(false);
    }

    final void f() {
        this.H = false;
        this.I = null;
        this.J = 0;
    }

    final void g(boolean z) {
        this.q = null;
        this.r = null;
        this.N = false;
        if (this.O) {
            this.O = false;
            m(z);
        }
        this.n.setEnabled(true);
    }

    public View getMediaControlView() {
        return this.e;
    }

    public et getMediaSession() {
        eu euVar = this.V;
        if (euVar == null) {
            return null;
        }
        return (et) euVar.c;
    }

    public fux getRoute() {
        return this.c;
    }

    final void h() {
        this.S = this.M ? this.am : this.an;
    }

    public boolean isVolumeControlEnabled() {
        return this.ak;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void j(boolean r10) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteControllerDialog.j(boolean):void");
    }

    final void k() {
        if (this.e == null) {
            dt dtVar = this.D;
            Bitmap bitmap = dtVar == null ? null : dtVar.c;
            Uri uri = dtVar != null ? dtVar.d : null;
            FetchArtTask fetchArtTask = this.E;
            Bitmap iconBitmap = fetchArtTask == null ? this.F : fetchArtTask.getIconBitmap();
            Uri iconUri = fetchArtTask == null ? this.G : fetchArtTask.getIconUri();
            if (iconBitmap == bitmap) {
                if (iconBitmap != null) {
                    return;
                }
                if (iconUri != null && iconUri.equals(uri)) {
                    return;
                }
                if (iconUri == null && uri == null) {
                    return;
                }
            }
            if (!q() || this.j) {
                FetchArtTask fetchArtTask2 = this.E;
                if (fetchArtTask2 != null) {
                    fetchArtTask2.cancel(true);
                }
                FetchArtTask fetchArtTask3 = new FetchArtTask();
                this.E = fetchArtTask3;
                fetchArtTask3.execute(new Void[0]);
            }
        }
    }

    final void l() throws Resources.NotFoundException {
        int dialogWidth = MediaRouteDialogHelper.getDialogWidth(this.d);
        getWindow().setLayout(dialogWidth, -2);
        View decorView = getWindow().getDecorView();
        this.aa = (dialogWidth - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.d.getResources();
        this.w = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.x = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.y = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.F = null;
        this.G = null;
        k();
        j(false);
    }

    final void m(final boolean z) {
        this.h.requestLayout();
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int iA;
                Bitmap bitmap;
                final MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                mediaRouteControllerDialog.h.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (mediaRouteControllerDialog.N) {
                    mediaRouteControllerDialog.O = true;
                    return;
                }
                boolean z2 = z;
                int iB = MediaRouteControllerDialog.b(mediaRouteControllerDialog.k);
                MediaRouteControllerDialog.i(mediaRouteControllerDialog.k, -1);
                mediaRouteControllerDialog.n(mediaRouteControllerDialog.o());
                View decorView = mediaRouteControllerDialog.getWindow().getDecorView();
                decorView.measure(View.MeasureSpec.makeMeasureSpec(mediaRouteControllerDialog.getWindow().getAttributes().width, 1073741824), 0);
                MediaRouteControllerDialog.i(mediaRouteControllerDialog.k, iB);
                if (mediaRouteControllerDialog.e == null && (mediaRouteControllerDialog.i.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) mediaRouteControllerDialog.i.getDrawable()).getBitmap()) != null) {
                    iA = mediaRouteControllerDialog.a(bitmap.getWidth(), bitmap.getHeight());
                    mediaRouteControllerDialog.i.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
                } else {
                    iA = 0;
                }
                int iC = mediaRouteControllerDialog.c(mediaRouteControllerDialog.o());
                int size = mediaRouteControllerDialog.p.size();
                int size2 = mediaRouteControllerDialog.q() ? mediaRouteControllerDialog.x * mediaRouteControllerDialog.c.k().size() : 0;
                if (size > 0) {
                    size2 += mediaRouteControllerDialog.z;
                }
                int iMin = Math.min(size2, mediaRouteControllerDialog.y);
                if (true != mediaRouteControllerDialog.M) {
                    iMin = 0;
                }
                int iMax = Math.max(iA, iMin) + iC;
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                int iHeight = rect.height() - (mediaRouteControllerDialog.g.getMeasuredHeight() - mediaRouteControllerDialog.h.getMeasuredHeight());
                if (mediaRouteControllerDialog.e != null || iA <= 0 || iMax > iHeight) {
                    if (MediaRouteControllerDialog.b(mediaRouteControllerDialog.n) + mediaRouteControllerDialog.k.getMeasuredHeight() >= mediaRouteControllerDialog.h.getMeasuredHeight()) {
                        mediaRouteControllerDialog.i.setVisibility(8);
                    }
                    iMax = iMin + iC;
                    iA = 0;
                } else {
                    mediaRouteControllerDialog.i.setVisibility(0);
                    MediaRouteControllerDialog.i(mediaRouteControllerDialog.i, iA);
                }
                if (!mediaRouteControllerDialog.o() || iMax > iHeight) {
                    mediaRouteControllerDialog.l.setVisibility(8);
                } else {
                    mediaRouteControllerDialog.l.setVisibility(0);
                }
                mediaRouteControllerDialog.n(mediaRouteControllerDialog.l.getVisibility() == 0);
                int iC2 = mediaRouteControllerDialog.c(mediaRouteControllerDialog.l.getVisibility() == 0);
                int iMax2 = Math.max(iA, iMin) + iC2;
                if (iMax2 > iHeight) {
                    iMin -= iMax2 - iHeight;
                } else {
                    iHeight = iMax2;
                }
                mediaRouteControllerDialog.k.clearAnimation();
                mediaRouteControllerDialog.n.clearAnimation();
                mediaRouteControllerDialog.h.clearAnimation();
                if (z2) {
                    mediaRouteControllerDialog.d(mediaRouteControllerDialog.k, iC2);
                    mediaRouteControllerDialog.d(mediaRouteControllerDialog.n, iMin);
                    mediaRouteControllerDialog.d(mediaRouteControllerDialog.h, iHeight);
                } else {
                    MediaRouteControllerDialog.i(mediaRouteControllerDialog.k, iC2);
                    MediaRouteControllerDialog.i(mediaRouteControllerDialog.n, iMin);
                    MediaRouteControllerDialog.i(mediaRouteControllerDialog.h, iHeight);
                }
                MediaRouteControllerDialog.i(mediaRouteControllerDialog.f, rect.height());
                List listK = mediaRouteControllerDialog.c.k();
                if (listK.isEmpty()) {
                    mediaRouteControllerDialog.p.clear();
                    mediaRouteControllerDialog.o.notifyDataSetChanged();
                    return;
                }
                if (MediaRouteDialogHelper.listUnorderedEquals(mediaRouteControllerDialog.p, listK)) {
                    mediaRouteControllerDialog.o.notifyDataSetChanged();
                    return;
                }
                final HashMap itemBoundMap = z2 ? MediaRouteDialogHelper.getItemBoundMap(mediaRouteControllerDialog.n, mediaRouteControllerDialog.o) : null;
                final HashMap itemBitmapMap = z2 ? MediaRouteDialogHelper.getItemBitmapMap(mediaRouteControllerDialog.d, mediaRouteControllerDialog.n, mediaRouteControllerDialog.o) : null;
                mediaRouteControllerDialog.q = MediaRouteDialogHelper.getItemsAdded(mediaRouteControllerDialog.p, listK);
                mediaRouteControllerDialog.r = MediaRouteDialogHelper.getItemsRemoved(mediaRouteControllerDialog.p, listK);
                mediaRouteControllerDialog.p.addAll(0, mediaRouteControllerDialog.q);
                mediaRouteControllerDialog.p.removeAll(mediaRouteControllerDialog.r);
                mediaRouteControllerDialog.o.notifyDataSetChanged();
                if (!z2 || !mediaRouteControllerDialog.M || mediaRouteControllerDialog.q.size() + mediaRouteControllerDialog.r.size() <= 0) {
                    mediaRouteControllerDialog.q = null;
                    mediaRouteControllerDialog.r = null;
                } else {
                    mediaRouteControllerDialog.n.setEnabled(false);
                    mediaRouteControllerDialog.n.requestLayout();
                    mediaRouteControllerDialog.N = true;
                    mediaRouteControllerDialog.n.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.8
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
                            Map map;
                            Map map2;
                            OverlayListView.OverlayObject overlayObject;
                            fux fuxVar;
                            final MediaRouteControllerDialog mediaRouteControllerDialog2 = MediaRouteControllerDialog.this;
                            mediaRouteControllerDialog2.n.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                            Set set = mediaRouteControllerDialog2.q;
                            if (set == null || mediaRouteControllerDialog2.r == null) {
                                return;
                            }
                            int size3 = set.size() - mediaRouteControllerDialog2.r.size();
                            Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.9
                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationStart(Animation animation) {
                                    MediaRouteControllerDialog mediaRouteControllerDialog3 = MediaRouteControllerDialog.this;
                                    mediaRouteControllerDialog3.n.startAnimationAll();
                                    mediaRouteControllerDialog3.n.postDelayed(mediaRouteControllerDialog3.U, mediaRouteControllerDialog3.P);
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationEnd(Animation animation) {
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationRepeat(Animation animation) {
                                }
                            };
                            int firstVisiblePosition = mediaRouteControllerDialog2.n.getFirstVisiblePosition();
                            int i = 0;
                            boolean z3 = false;
                            while (true) {
                                map = itemBitmapMap;
                                map2 = itemBoundMap;
                                if (i >= mediaRouteControllerDialog2.n.getChildCount()) {
                                    break;
                                }
                                View childAt = mediaRouteControllerDialog2.n.getChildAt(i);
                                fux item = mediaRouteControllerDialog2.o.getItem(firstVisiblePosition + i);
                                Rect rect2 = (Rect) map2.get(item);
                                int top = childAt.getTop();
                                int i2 = rect2 != null ? rect2.top : (mediaRouteControllerDialog2.x * size3) + top;
                                AnimationSet animationSet = new AnimationSet(true);
                                Set set2 = mediaRouteControllerDialog2.q;
                                if (set2 == null || !set2.contains(item)) {
                                    fuxVar = item;
                                } else {
                                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                                    fuxVar = item;
                                    alphaAnimation.setDuration(mediaRouteControllerDialog2.Q);
                                    animationSet.addAnimation(alphaAnimation);
                                    i2 = top;
                                }
                                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i2 - top, 0.0f);
                                translateAnimation.setDuration(mediaRouteControllerDialog2.P);
                                animationSet.addAnimation(translateAnimation);
                                animationSet.setFillAfter(true);
                                animationSet.setFillEnabled(true);
                                animationSet.setInterpolator(mediaRouteControllerDialog2.S);
                                if (!z3) {
                                    animationSet.setAnimationListener(animationListener);
                                }
                                childAt.clearAnimation();
                                childAt.startAnimation(animationSet);
                                fux fuxVar2 = fuxVar;
                                map2.remove(fuxVar2);
                                map.remove(fuxVar2);
                                i++;
                                z3 = true;
                            }
                            for (Map.Entry entry : map.entrySet()) {
                                final fux fuxVar3 = (fux) entry.getKey();
                                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                                Rect rect3 = (Rect) map2.get(fuxVar3);
                                if (mediaRouteControllerDialog2.r.contains(fuxVar3)) {
                                    overlayObject = new OverlayListView.OverlayObject(bitmapDrawable, rect3);
                                    overlayObject.setAlphaAnimation(1.0f, 0.0f);
                                    overlayObject.setDuration(mediaRouteControllerDialog2.R);
                                    overlayObject.setInterpolator(mediaRouteControllerDialog2.S);
                                } else {
                                    int i3 = mediaRouteControllerDialog2.x * size3;
                                    OverlayListView.OverlayObject overlayObject2 = new OverlayListView.OverlayObject(bitmapDrawable, rect3);
                                    overlayObject2.setTranslateYAnimation(i3);
                                    overlayObject2.setDuration(mediaRouteControllerDialog2.P);
                                    overlayObject2.setInterpolator(mediaRouteControllerDialog2.S);
                                    overlayObject2.setAnimationEndListener(new OverlayListView.OverlayObject.OnAnimationEndListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.10
                                        @Override // androidx.mediarouter.app.OverlayListView.OverlayObject.OnAnimationEndListener
                                        public void onAnimationEnd() {
                                            MediaRouteControllerDialog mediaRouteControllerDialog3 = MediaRouteControllerDialog.this;
                                            mediaRouteControllerDialog3.s.remove(fuxVar3);
                                            mediaRouteControllerDialog3.o.notifyDataSetChanged();
                                        }
                                    });
                                    mediaRouteControllerDialog2.s.add(fuxVar3);
                                    overlayObject = overlayObject2;
                                }
                                mediaRouteControllerDialog2.n.addOverlayObject(overlayObject);
                            }
                        }
                    });
                }
            }
        });
    }

    public final void n(boolean z) {
        int i = 0;
        this.al.setVisibility((this.m.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.k;
        if (this.m.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public final boolean o() {
        if (this.e == null) {
            return (this.D == null && this.C == null) ? false : true;
        }
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z = true;
        this.b.d(fur.a, this.X, 2);
        v(fuy.k());
    }

    @Override // android.support.v7.app.AlertDialog, android.support.v7.app.AppCompatDialog, defpackage.fm, android.app.Dialog
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        ClickListener clickListener = new ClickListener();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.f = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteControllerDialog.this.dismiss();
            }
        });
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.g = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        Context context = this.d;
        int iE = MediaRouterThemeHelper.e(context, 0, R.attr.colorPrimary);
        if (csq.a(iE, MediaRouterThemeHelper.e(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            iE = MediaRouterThemeHelper.e(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.ab = button;
        button.setText(R.string.mr_controller_disconnect);
        this.ab.setTextColor(iE);
        this.ab.setOnClickListener(clickListener);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.ac = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.ac.setTextColor(iE);
        this.ac.setOnClickListener(clickListener);
        this.aj = (TextView) findViewById(R.id.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_close);
        this.ae = imageButton;
        imageButton.setOnClickListener(clickListener);
        this.ag = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.h = (FrameLayout) findViewById(R.id.mr_default_control);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) throws PendingIntent.CanceledException {
                PendingIntent sessionActivity;
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                eu euVar = mediaRouteControllerDialog.V;
                if (euVar == null || (sessionActivity = ((MediaController) ((gag) euVar.b).c).getSessionActivity()) == null) {
                    return;
                }
                try {
                    sessionActivity.send();
                    mediaRouteControllerDialog.dismiss();
                } catch (PendingIntent.CanceledException unused) {
                    java.util.Objects.toString(sessionActivity);
                    Log.e("MediaRouteCtrlDialog", sessionActivity.toString().concat(" was not sent, it had been canceled."));
                }
            }
        };
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.i = imageView;
        imageView.setOnClickListener(onClickListener);
        findViewById(R.id.mr_control_title_container).setOnClickListener(onClickListener);
        this.k = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.al = findViewById(R.id.mr_control_divider);
        this.l = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.ah = (TextView) findViewById(R.id.mr_control_title);
        this.ai = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.ad = imageButton2;
        imageButton2.setOnClickListener(clickListener);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.m = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.t = seekBar;
        fux fuxVar = this.c;
        seekBar.setTag(fuxVar);
        VolumeChangeListener volumeChangeListener = new VolumeChangeListener();
        this.u = volumeChangeListener;
        this.t.setOnSeekBarChangeListener(volumeChangeListener);
        this.n = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.p = new ArrayList();
        VolumeGroupAdapter volumeGroupAdapter = new VolumeGroupAdapter(this.n.getContext(), this.p);
        this.o = volumeGroupAdapter;
        this.n.setAdapter((ListAdapter) volumeGroupAdapter);
        this.s = new HashSet();
        Context context2 = this.d;
        LinearLayout linearLayout3 = this.k;
        OverlayListView overlayListView = this.n;
        boolean zQ = q();
        int iE2 = MediaRouterThemeHelper.e(context2, 0, R.attr.colorPrimary);
        int iE3 = MediaRouterThemeHelper.e(context2, 0, R.attr.colorPrimaryDark);
        if (zQ && MediaRouterThemeHelper.c(context2, 0) == -570425344) {
            iE3 = iE2;
            iE2 = -1;
        }
        linearLayout3.setBackgroundColor(iE2);
        overlayListView.setBackgroundColor(iE3);
        linearLayout3.setTag(Integer.valueOf(iE2));
        overlayListView.setTag(Integer.valueOf(iE3));
        MediaRouterThemeHelper.o(this.d, (MediaRouteVolumeSlider) this.t, this.k);
        HashMap map = new HashMap();
        this.A = map;
        map.put(fuxVar, this.t);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.af = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new View.OnClickListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                boolean z = mediaRouteControllerDialog.M;
                mediaRouteControllerDialog.M = !z;
                if (!z) {
                    mediaRouteControllerDialog.n.setVisibility(0);
                }
                mediaRouteControllerDialog.h();
                mediaRouteControllerDialog.m(true);
            }
        });
        h();
        this.P = this.d.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.Q = this.d.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.R = this.d.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        View viewOnCreateMediaControlView = onCreateMediaControlView(bundle);
        this.e = viewOnCreateMediaControlView;
        if (viewOnCreateMediaControlView != null) {
            this.ag.addView(viewOnCreateMediaControlView);
            this.ag.setVisibility(0);
        }
        this.Y = true;
        l();
    }

    public View onCreateMediaControlView(Bundle bundle) {
        return null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.b.f(this.X);
        v(null);
        this.Z = false;
        super.onDetachedFromWindow();
    }

    @Override // android.support.v7.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.j || !this.M) {
            this.c.m(i == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // android.support.v7.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final boolean q() {
        fux fuxVar = this.c;
        return fuxVar.r() && fuxVar.k().size() > 1;
    }

    final boolean r() {
        return (this.C.e & 514) != 0;
    }

    final boolean s() {
        return (this.C.e & 516) != 0;
    }

    public void setVolumeControlEnabled(boolean z) {
        if (this.ak != z) {
            this.ak = z;
            if (this.Y) {
                j(false);
            }
        }
    }

    final boolean t() {
        return (this.C.e & 1) != 0;
    }

    final boolean u(fux fuxVar) {
        return this.ak && fuxVar.f() == 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaRouteControllerDialog(Context context, int i) {
        Context contextG = MediaRouterThemeHelper.g(context, i, true);
        super(contextG, MediaRouterThemeHelper.b(contextG));
        this.ak = true;
        this.U = new Runnable() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.1
            @Override // java.lang.Runnable
            public void run() {
                final MediaRouteControllerDialog mediaRouteControllerDialog = MediaRouteControllerDialog.this;
                mediaRouteControllerDialog.e(true);
                mediaRouteControllerDialog.n.requestLayout();
                mediaRouteControllerDialog.n.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.11
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        final MediaRouteControllerDialog mediaRouteControllerDialog2 = MediaRouteControllerDialog.this;
                        mediaRouteControllerDialog2.n.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        Set set = mediaRouteControllerDialog2.q;
                        if (set == null || set.size() == 0) {
                            mediaRouteControllerDialog2.g(true);
                            return;
                        }
                        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: androidx.mediarouter.app.MediaRouteControllerDialog.12
                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationEnd(Animation animation) {
                                MediaRouteControllerDialog.this.g(true);
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationStart(Animation animation) {
                            }
                        };
                        int firstVisiblePosition = mediaRouteControllerDialog2.n.getFirstVisiblePosition();
                        boolean z = false;
                        for (int i2 = 0; i2 < mediaRouteControllerDialog2.n.getChildCount(); i2++) {
                            View childAt = mediaRouteControllerDialog2.n.getChildAt(i2);
                            if (mediaRouteControllerDialog2.q.contains(mediaRouteControllerDialog2.o.getItem(firstVisiblePosition + i2))) {
                                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                                alphaAnimation.setDuration(mediaRouteControllerDialog2.Q);
                                alphaAnimation.setFillEnabled(true);
                                alphaAnimation.setFillAfter(true);
                                if (!z) {
                                    alphaAnimation.setAnimationListener(animationListener);
                                }
                                childAt.clearAnimation();
                                childAt.startAnimation(alphaAnimation);
                                z = true;
                            }
                        }
                    }
                });
            }
        };
        this.d = getContext();
        this.B = new MediaControllerCallback();
        this.b = fuy.b(this.d);
        this.j = fuy.g();
        this.X = new MediaRouterCallback();
        this.c = fuy.n();
        v(fuy.k());
        this.z = this.d.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.T = (AccessibilityManager) this.d.getSystemService("accessibility");
        this.am = AnimationUtils.loadInterpolator(contextG, R.interpolator.mr_linear_out_slow_in);
        this.an = AnimationUtils.loadInterpolator(contextG, R.interpolator.mr_fast_out_slow_in);
    }
}
