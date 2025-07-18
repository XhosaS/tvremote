package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdm extends scf {
    public sco a = sco.a;
    public ImmutableList b;
    public kdv c;
    public wfo d;

    @Override // defpackage.scf
    public final int a() {
        return R.layout.provider_selection_bottomsheet_view_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        kdm kdmVar = (kdm) scfVar;
        long j = true != yks.e(this.a, kdmVar.a) ? 1L : 0L;
        if (!yks.e(this.b, kdmVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, kdmVar.c)) {
            j |= 4;
        }
        return !yks.e(this.d, kdmVar.d) ? j | 8 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new kdl();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        wfo wfoVar;
        kdl kdlVar = (kdl) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                kdlVar.w(R.id.title_text, this.a.a(kdlVar.o()), 8);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title_text", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                kdlVar.v(R.id.recycler_view, this.b, 0);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "recycler_view", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                kdlVar.u(R.id.header, this.c);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "header", "com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuViewBindable"));
            }
        }
        if ((j == 0 || (j & 8) != 0) && (wfoVar = this.d) != null) {
            Drawable drawable = kdlVar.o().getDrawable(R.drawable.provider_selection_bg);
            TextView textView = null;
            if (drawable != null) {
                drawable.setColorFilter(wfoVar.o(), PorterDuff.Mode.SRC_IN);
                View view = kdlVar.a;
                if (view == null) {
                    yks.c("providerSelectionMenuLayout");
                    view = null;
                }
                LinearLayout linearLayout = view instanceof LinearLayout ? (LinearLayout) view : null;
                if (linearLayout != null) {
                    linearLayout.setBackground(drawable);
                }
            }
            TextView textView2 = kdlVar.b;
            if (textView2 == null) {
                yks.c("titleText");
            } else {
                textView = textView2;
            }
            textView.setTextColor(wfoVar.g());
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ProviderSelectionMenuViewModel{titleText=%s, providerItems=%s, header=%s, applyDynamicScheme=%s}", this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
