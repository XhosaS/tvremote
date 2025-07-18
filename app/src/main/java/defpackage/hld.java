package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hld {
    protected final LayoutInflater a;
    public final hle b;
    public int c = -2;
    public boolean d = false;

    public hld(LayoutInflater layoutInflater) {
        this.a = layoutInflater;
        hle hleVar = new hle(layoutInflater.getContext());
        this.b = hleVar;
        hleVar.setDescendantFocusability(262144);
        hleVar.setId(R.id.fragment_view_wrapper);
        hleVar.setLayoutParams(new FrameLayout.LayoutParams(-1, this.c));
    }

    public final hle a() {
        View view;
        if (this.d && (view = this.b.d) != null) {
            view.getLayoutParams().height = this.c;
        }
        return this.b;
    }

    public final void b(int i) {
        c(this.a.inflate(i, (ViewGroup) this.b, false));
    }

    public final void c(View view) {
        if (view.getLayoutParams() == null) {
            this.d = true;
            this.b.addView(view, new FrameLayout.LayoutParams(-1, this.c));
        } else {
            this.d = view.getLayoutParams().height == -2;
            this.b.addView(view);
        }
        this.b.d = view;
    }

    public final void d(boolean z) {
        this.c = true != z ? -2 : -1;
        this.b.getLayoutParams().height = this.c;
    }
}
