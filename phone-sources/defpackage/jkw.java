package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkw extends scf implements scl {
    public scg a;
    public sck b;
    public wlx c;
    public sco d;
    public sco e;
    public wls f;
    public wls g;
    public View.OnClickListener h;
    public boolean i;
    public final Set j;
    private final yfo k;
    private int l;

    public jkw(yfo yfoVar) {
        sco scoVar = sco.a;
        this.d = scoVar;
        this.e = scoVar;
        this.i = true;
        this.l = 0;
        this.j = new HashSet();
        this.k = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.season_item_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.l;
    }

    @Override // defpackage.scl
    public final int c() {
        return -1;
    }

    @Override // defpackage.scl
    public final int d() {
        return -1;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jkw jkwVar = (jkw) scfVar;
        long j = true != yks.e(this.c, jkwVar.c) ? 1L : 0L;
        if (!yks.e(this.d, jkwVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, jkwVar.e)) {
            j |= 4;
        }
        if (!yks.e(this.f, jkwVar.f)) {
            j |= 8;
        }
        if (!yks.e(this.g, jkwVar.g)) {
            j |= 16;
        }
        return !yks.e(this.h, jkwVar.h) ? j | 32 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.k.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.seasonitem.SeasonItemViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jkv jkvVar = (jkv) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jkvVar.a.t(jkvVar, this.c, R.id.thumbnail_image, R.drawable.gtv_tvm_card_default_background, -1, false, false, false);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                jkvVar.w(R.id.thumbnail_placeholder_text, this.d.a(jkvVar.o()), 8);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail_placeholder_text", "com.google.android.apps.googletv.app.presentation.components.entity.seasonitem.SeasonItemViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                jkvVar.w(R.id.title, this.e.a(jkvVar.o()), -1);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.entity.seasonitem.SeasonItemViewBindable"));
            }
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jkvVar, this.f, R.id.subtitle, 8);
        }
        if (j == 0 || (16 & j) != 0) {
            jwq.j(jkvVar, this.g, R.id.cta_text, -1);
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                jkvVar.r(R.id.cta, this.h);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "cta", "com.google.android.apps.googletv.app.presentation.components.entity.seasonitem.SeasonItemViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h);
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
        this.l = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return this.i;
    }

    @Override // defpackage.scl
    public final boolean n() {
        return true;
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        this.j.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.j.remove(sddVar);
    }

    public final String toString() {
        return String.format("SeasonItemViewModel{screenshot=%s, thumbnailPlaceHolderText=%s, title=%s, subtitle=%s, ctaText=%s, ctaClickListener=%s}", this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
