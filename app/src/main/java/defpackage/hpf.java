package defpackage;

import android.animation.ArgbEvaluator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.tvsearch.results.motion.ScalingAnimator;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpf extends azk implements View.OnFocusChangeListener, hlu, hoz {
    public final hmb a;
    public final boolean b;
    final ConstraintLayout c;
    final ImageDownloadView d;
    ProgressBar e;
    final TextView f;
    public final TextView h;
    final View i;
    TextView j;
    View k;
    boolean l;
    hmg m;
    hmf n;
    hkk o;
    final ScalingAnimator p;
    private final hpe q;

    public hpf(View view, hmb hmbVar, boolean z, hpe hpeVar) {
        super(view);
        this.a = hmbVar;
        this.b = z;
        this.q = hpeVar;
        long j = hpeVar.d;
        ScalingAnimator scalingAnimator = new ScalingAnimator(this, j, j, new AccelerateDecelerateInterpolator());
        this.p = scalingAnimator;
        this.c = (ConstraintLayout) view.findViewById(R.id.image_container);
        ImageDownloadView imageDownloadView = (ImageDownloadView) view.findViewById(R.id.row_item_image);
        this.d = imageDownloadView;
        this.f = (TextView) view.findViewById(R.id.title);
        this.h = (TextView) view.findViewById(R.id.description);
        this.i = view.findViewById(R.id.description_layout);
        view.setOnFocusChangeListener(this);
        imageDownloadView.setOutlineProvider(hpeVar.b);
        imageDownloadView.setClipToOutline(true);
        scalingAnimator.e();
    }

    @Override // defpackage.hlu
    public final void a(float f) {
        hpe hpeVar = this.q;
        View view = this.g;
        float f2 = ((hpeVar.c - 1.0f) * f) + 1.0f;
        view.setScaleX(f2);
        view.setScaleY(f2);
        this.c.setElevation(f + f + 1.0f);
        ArgbEvaluator argbEvaluator = hpeVar.a;
        Integer numValueOf = Integer.valueOf(hpeVar.f);
        this.f.setTextColor(((Integer) argbEvaluator.evaluate(f, numValueOf, Integer.valueOf(hpeVar.e))).intValue());
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextColor(((Integer) argbEvaluator.evaluate(f, Integer.valueOf(hpeVar.g), numValueOf)).intValue());
        }
    }

    public final void c(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        hkk hkkVar = this.o;
        if (hkkVar != null) {
            hkkVar.d = z;
        }
        if (z) {
            this.p.c();
        } else {
            this.p.b();
        }
        View view2 = this.k;
        if (view2 != null) {
            if (this.l && z) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
            }
        }
    }
}
