package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfa extends scf implements scl {
    public scg a;
    public sck b;
    public wls c;
    public View.OnClickListener d;
    public wlx e;
    public int f;
    public wkv g;
    public wkv h;
    private final yfo i;
    private int j = 0;
    private final Set k = new HashSet();

    public jfa(yfo yfoVar) {
        this.i = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.browse_card_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.j;
    }

    @Override // defpackage.scl
    public final int c() {
        return 1;
    }

    @Override // defpackage.scl
    public final int d() {
        return 5;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jfa jfaVar = (jfa) scfVar;
        long j = true != yks.e(this.c, jfaVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jfaVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jfaVar.e)) {
            j |= 4;
        }
        if (!a.r(this.f, jfaVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jfaVar.g)) {
            j |= 16;
        }
        return !yks.e(this.h, jfaVar.h) ? j | 32 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.i.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.browsecard.BrowseCardViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        int i;
        wkv wkvVar;
        wkv wkvVar2;
        jez jezVar = (jez) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jezVar, this.c, R.id.browse_card_title, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                jezVar.r(R.id.browse_card_component, this.d);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "browse_card_component", "com.google.android.apps.googletv.app.presentation.components.browsecard.BrowseCardViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            jezVar.d.t(jezVar, this.e, R.id.browse_card_icon, -1, -1, false, false, false);
        }
        CardView cardView = null;
        if ((j == 0 || (8 & j) != 0) && (i = this.f) != 0) {
            jezVar.a().setImageDrawable(jezVar.q().getResources().getDrawable(i, null));
        }
        if ((j == 0 || (16 & j) != 0) && (wkvVar = this.g) != null) {
            int iIntValue = wkvVar.b == 2 ? ((Integer) wkvVar.c).intValue() : 0;
            Drawable drawable = jezVar.a().getDrawable();
            if (drawable != null) {
                drawable.setTint(iIntValue);
            }
            jezVar.a().setColorFilter(iIntValue);
            TextView textView = jezVar.c;
            if (textView == null) {
                yks.c("titleView");
                textView = null;
            }
            textView.setTextColor(iIntValue);
        }
        if ((j == 0 || (32 & j) != 0) && (wkvVar2 = this.h) != null) {
            int iIntValue2 = wkvVar2.b == 2 ? ((Integer) wkvVar2.c).intValue() : 0;
            CardView cardView2 = jezVar.b;
            if (cardView2 == null) {
                yks.c("cardView");
            } else {
                cardView = cardView2;
            }
            cardView.c(iIntValue2);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, Integer.valueOf(this.f), this.g, this.h);
    }

    @Override // defpackage.scf
    public final void i(View view) {
        scg scgVar = this.a;
        if (scgVar != null) {
            scgVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final void j(View view) {
        sck sckVar = this.b;
        if (sckVar != null) {
            sckVar.a(this, view);
        }
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.j = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return true;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return false;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.k.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.k.remove(sddVar);
    }

    public final String toString() {
        return String.format("BrowseCardViewModel{title=%s, clickListener=%s, icon=%s, iconDrawable=%s, foregroundColor=%s, backgroundColor=%s}", this.c, this.d, this.e, Integer.valueOf(this.f), this.g, this.h);
    }
}
