package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.katniss.R;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixi extends exc {
    public static final /* synthetic */ int g = 0;
    private static final Duration h;
    public ixc e;
    public TextView f;
    private ConstraintLayout i;
    private ImageView j;
    private View k;
    private AnimatorSet l;
    private final ewm m;
    private final ewo n;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(6L);
        durationOfSeconds.getClass();
        h = durationOfSeconds;
    }

    public ixi(ewo ewoVar) {
        ewoVar.getClass();
        this.n = ewoVar;
        this.m = new ewm() { // from class: ixe
            @Override // defpackage.ewm
            public final void a() {
                this.a.G();
            }
        };
    }

    @Override // defpackage.ewp
    protected final void B() {
        this.b.setContentView(R.layout.amati_suggested_queries);
        this.f = (TextView) this.b.findViewById(R.id.suggested_query_text);
        this.i = (ConstraintLayout) this.b.findViewById(R.id.suggested_queries_main);
        this.j = (ImageView) this.b.findViewById(R.id.suggested_query_logo_view);
        this.k = this.b.findViewById(R.id.suggested_query_background_view);
    }

    public final Animator E(boolean z) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this, R.animator.suggested_queries_exit);
        animatorLoadAnimator.setTarget(z ? this.i : this.f);
        animatorLoadAnimator.setStartDelay(h.toMillis());
        animatorLoadAnimator.getClass();
        return animatorLoadAnimator;
    }

    public final AnimatorSet F(String str, boolean z) throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this, R.animator.suggested_queries_text_enter);
        animatorLoadAnimator.getClass();
        AnimatorSet animatorSet = (AnimatorSet) animatorLoadAnimator;
        animatorSet.setTarget(this.f);
        animatorSet.addListener(new ixf(str, this));
        if (!z) {
            animatorSet.setStartDelay(50L);
            return animatorSet;
        }
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this, R.animator.suggested_queries_background_enter);
        animatorLoadAnimator2.setTarget(this.k);
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(this, R.animator.suggested_queries_logo_enter);
        animatorLoadAnimator3.setTarget(this.j);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorLoadAnimator2, animatorLoadAnimator3, animatorSet);
        return animatorSet2;
    }

    public final void G() {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.l = null;
    }

    @Override // defpackage.ewp
    protected final void h() {
        ArrayList<String> stringArrayListExtra = this.d.getStringArrayListExtra("queries");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            eD();
            ixc ixcVar = this.e;
            if (ixcVar != null) {
                ixcVar.j();
                return;
            }
            return;
        }
        String str = stringArrayListExtra.get(0);
        str.getClass();
        List<Animator> listE = agqq.e(F(str, true));
        int size = stringArrayListExtra.size();
        for (int i = 1; i < size; i++) {
            listE.add(E(false));
            String str2 = stringArrayListExtra.get(i);
            str2.getClass();
            listE.add(F(str2, false));
        }
        listE.add(E(true));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(listE);
        animatorSet.addListener(new ixh(new agwe(), this));
        animatorSet.start();
        this.l = animatorSet;
    }

    @Override // defpackage.ewp
    public final void n() {
        this.n.a(this, this.m);
    }

    @Override // defpackage.ewp
    public final void o() {
        G();
        this.n.b(this);
    }
}
