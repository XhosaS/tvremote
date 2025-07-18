package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbg extends ConstraintLayout {
    private static final rbf q = new rbf(new int[][]{new int[]{R.id.og_bento_privacy_policy_button, R.id.og_bento_separator1, R.id.og_bento_tos_button}}, new int[]{R.id.og_bento_separator2, R.id.og_bento_custom_button});
    private static final rbf r = new rbf(new int[][]{new int[]{R.id.og_bento_privacy_policy_button}, new int[]{R.id.og_bento_separator1}, new int[]{R.id.og_bento_tos_button}}, new int[]{R.id.og_bento_separator2, R.id.og_bento_custom_button});
    private static final rbf s = new rbf(new int[][]{new int[]{R.id.og_bento_privacy_policy_button, R.id.og_bento_separator1, R.id.og_bento_tos_button, R.id.og_bento_separator2, R.id.og_bento_custom_button}}, new int[0]);
    private static final rbf t = new rbf(new int[][]{new int[]{R.id.og_bento_privacy_policy_button}, new int[]{R.id.og_bento_separator1}, new int[]{R.id.og_bento_tos_button}, new int[]{R.id.og_bento_separator2}, new int[]{R.id.og_bento_custom_button}}, new int[0]);
    private static final rbf u = new rbf(new int[][]{new int[]{R.id.og_bento_privacy_policy_button, R.id.og_bento_separator1, R.id.og_bento_tos_button}, new int[]{R.id.og_bento_custom_button}}, new int[]{R.id.og_bento_separator2});
    private static final rbf v = new rbf(new int[][]{new int[]{R.id.og_bento_privacy_policy_button}, new int[]{R.id.og_bento_tos_button, R.id.og_bento_separator2, R.id.og_bento_custom_button}}, new int[]{R.id.og_bento_separator1});
    public final MaterialButton j;
    public final MaterialButton k;
    public final MaterialButton l;
    public Integer m;
    public vox n;
    public final ImmutableList o;
    public ImmutableList p;

    public rbg(Context context) {
        super(context, null);
        ImmutableList immutableListOf = ImmutableList.of(q, r);
        immutableListOf.getClass();
        this.o = immutableListOf;
        ImmutableList.of(s, u, v, t).getClass();
        this.p = immutableListOf;
        LayoutInflater.from(context).inflate(R.layout.og_bento_policy_footer, this);
        View viewFindViewById = findViewById(R.id.og_bento_privacy_policy_button);
        viewFindViewById.getClass();
        this.j = (MaterialButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.og_bento_tos_button);
        viewFindViewById2.getClass();
        this.k = (MaterialButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.og_bento_separator1);
        viewFindViewById3.getClass();
        View viewFindViewById4 = findViewById(R.id.og_bento_separator2);
        viewFindViewById4.getClass();
        View viewFindViewById5 = findViewById(R.id.og_bento_custom_button);
        viewFindViewById5.getClass();
        this.l = (MaterialButton) viewFindViewById5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Throwable {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        Integer num = this.m;
        if (num != null && measuredWidth == num.intValue()) {
            return;
        }
        UnmodifiableIterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            rbf rbfVar = (rbf) it.next();
            int[][] iArr = rbfVar.a;
            int[] iArr2 = rbfVar.b;
            rrx.af(this, iArr);
            for (int[] iArr3 : iArr) {
                for (int i3 : iArr3) {
                    findViewById(i3).setVisibility(0);
                }
                int length = iArr3.length;
                View viewFindViewById = findViewById(iArr3[length >> 1]);
                viewFindViewById.getClass();
                rrx.ag(viewFindViewById, 1);
                if (length > 1) {
                    View viewFindViewById2 = findViewById(yfm.aJ(iArr3));
                    iArr3.getClass();
                    View viewFindViewById3 = findViewById(iArr3[yfm.aK(iArr3)]);
                    viewFindViewById2.getClass();
                    rrx.ag(viewFindViewById2, 8388613);
                    viewFindViewById3.getClass();
                    rrx.ag(viewFindViewById3, 8388611);
                }
            }
            for (int i4 : iArr2) {
                findViewById(i4).setVisibility(8);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            if (getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                break;
            }
        }
        super.onMeasure(i, i2);
        this.m = Integer.valueOf(getMeasuredWidth());
    }
}
