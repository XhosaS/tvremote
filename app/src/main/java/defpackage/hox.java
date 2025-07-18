package defpackage;

import android.view.View;
import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hox extends azw implements uuf {
    public final azt a;
    public final HorizontalGridView b;
    ayq c;
    public float d;
    public boolean e;

    public hox(View view, azt aztVar, HorizontalGridView horizontalGridView) {
        super(view);
        this.d = 1.0f;
        this.a = aztVar;
        this.b = horizontalGridView;
    }

    @Override // defpackage.uuf
    public final /* synthetic */ void d(float f) {
        this.d = f;
        HorizontalGridView horizontalGridView = this.b;
        int childCount = horizontalGridView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((hpz) ((ayo) horizontalGridView.l(horizontalGridView.getChildAt(i))).t).d(uuk.a.a(f));
        }
    }

    public final void e(boolean z) {
        this.e = z;
        HorizontalGridView horizontalGridView = this.b;
        int childCount = horizontalGridView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ayo ayoVar = (ayo) horizontalGridView.j(horizontalGridView.d(horizontalGridView.getChildAt(i)));
            hpz hpzVar = (hpz) (ayoVar == null ? null : ayoVar.t);
            if (hpzVar != null) {
                hpzVar.e(this.m && z);
            }
        }
    }
}
