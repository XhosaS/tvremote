package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.GuidedActionItemContainer;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayb extends qv implements awq {
    public final boolean A;
    Animator B;
    final View.AccessibilityDelegate C;
    axh s;
    public final TextView t;
    public final TextView u;
    final View v;
    final ImageView w;
    final ImageView x;
    final ImageView y;
    int z;

    public ayb(View view, boolean z) {
        super(view);
        this.z = 0;
        axz axzVar = new axz(this);
        this.C = axzVar;
        view.findViewById(R.id.guidedactions_item_content);
        this.t = (TextView) view.findViewById(R.id.guidedactions_item_title);
        this.v = view.findViewById(R.id.guidedactions_activator_item);
        this.u = (TextView) view.findViewById(R.id.guidedactions_item_description);
        this.w = (ImageView) view.findViewById(R.id.guidedactions_item_icon);
        this.x = (ImageView) view.findViewById(R.id.guidedactions_item_checkmark);
        this.y = (ImageView) view.findViewById(R.id.guidedactions_item_chevron);
        this.A = z;
        view.setAccessibilityDelegate(axzVar);
    }

    public final EditText A() {
        TextView textView = this.t;
        if (textView instanceof EditText) {
            return (EditText) textView;
        }
        return null;
    }

    final void B(boolean z) throws Resources.NotFoundException {
        Animator animator = this.B;
        if (animator != null) {
            animator.cancel();
            this.B = null;
        }
        int i = true != z ? R.attr.guidedActionUnpressedAnimation : R.attr.guidedActionPressedAnimation;
        View view = this.a;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, typedValue.resourceId);
            this.B = animatorLoadAnimator;
            animatorLoadAnimator.setTarget(view);
            this.B.addListener(new aya(this));
            this.B.start();
        }
    }

    final void C(boolean z) {
        this.v.setActivated(z);
        View view = this.a;
        if (view instanceof GuidedActionItemContainer) {
            ((GuidedActionItemContainer) view).a = !z;
        }
    }

    @Override // defpackage.awq
    public final Object dy(Class cls) {
        if (cls == ayj.class) {
            return ayc.a;
        }
        return null;
    }

    public final EditText z() {
        TextView textView = this.u;
        if (textView instanceof EditText) {
            return (EditText) textView;
        }
        return null;
    }
}
