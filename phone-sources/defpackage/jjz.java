package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjz extends scf implements scl {
    public Object a;
    public Object b;
    public Object c;
    private int d;
    private final Set e;
    private final /* synthetic */ int f;

    public jjz(int i, byte[] bArr) {
        this.f = i;
        this.d = 0;
        this.e = new HashSet();
    }

    @Override // defpackage.scf
    public final int a() {
        int i = this.f;
        return i != 0 ? i != 1 ? R.layout.quote_card_view_layout : R.layout.moreinfo_view_layout : R.layout.provider_selection_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        int i = this.f;
        return i != 0 ? i != 1 ? this.d : this.d : this.d;
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
        int i = this.f;
        return i != 0 ? i != 1 ? !yks.e(this.b, ((jjz) scfVar).b) ? 1L : 0L : !yks.e(this.b, ((jjz) scfVar).b) ? 1L : 0L : !yks.e(this.c, ((jjz) scfVar).c) ? 1L : 0L;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        int i = this.f;
        return i != 0 ? i != 1 ? new jke() : new jjk() : new jjy();
    }

    @Override // defpackage.scf
    public final String g() {
        int i = this.f;
        return i != 0 ? i != 1 ? "com.google.android.apps.googletv.app.presentation.components.entity.quotecard.QuoteCardViewBindable" : "com.google.android.apps.googletv.app.presentation.components.entity.moreinfo.MoreInfoViewBindable" : "com.google.android.apps.googletv.app.presentation.components.entity.providerselection.ProviderSelectionViewBindable";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        int i = this.f;
        if (i == 0) {
            jjy jjyVar = (jjy) scaVar;
            if (j == 0 || (j & 1) != 0) {
                try {
                    jjyVar.r(R.id.provider_selection_component, this.c);
                    return;
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_selection_component", "com.google.android.apps.googletv.app.presentation.components.entity.providerselection.ProviderSelectionViewBindable"));
                }
            }
            return;
        }
        if (i != 1) {
            jke jkeVar = (jke) scaVar;
            if (j == 0 || (j & 1) != 0) {
                try {
                    jkeVar.w(R.id.description_text, ((sco) this.b).a(jkeVar.o()), 8);
                    return;
                } catch (scr unused2) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "description_text", "com.google.android.apps.googletv.app.presentation.components.entity.quotecard.QuoteCardViewBindable"));
                }
            }
            return;
        }
        jjk jjkVar = (jjk) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                jjkVar.v(R.id.moreinfo_items, this.b, 0);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "moreinfo_items", "com.google.android.apps.googletv.app.presentation.components.entity.moreinfo.MoreInfoViewBindable"));
            }
        }
    }

    public final int hashCode() {
        int i = this.f;
        return i != 0 ? i != 1 ? Objects.hash(this.b) : Objects.hash(this.b) : Objects.hash(this.c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, scg] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, scg] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, scg] */
    @Override // defpackage.scf
    public final void i(View view) {
        int i = this.f;
        if (i == 0) {
            ?? r0 = this.a;
            if (r0 != 0) {
                r0.a(this, view);
                return;
            }
            return;
        }
        if (i != 1) {
            ?? r02 = this.c;
            if (r02 != 0) {
                r02.a(this, view);
                return;
            }
            return;
        }
        ?? r03 = this.c;
        if (r03 != 0) {
            r03.a(this, view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, sck] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sck] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, sck] */
    @Override // defpackage.scf
    public final void j(View view) {
        int i = this.f;
        if (i == 0) {
            ?? r0 = this.b;
            if (r0 != 0) {
                r0.a(this, view);
                return;
            }
            return;
        }
        if (i != 1) {
            ?? r02 = this.a;
            if (r02 != 0) {
                r02.a(this, view);
                return;
            }
            return;
        }
        ?? r03 = this.a;
        if (r03 != 0) {
            r03.a(this, view);
        }
    }

    @Override // defpackage.scl
    public final void k(int i) {
        if (this.f != 0) {
            this.d = i;
        } else {
            this.d = i;
        }
    }

    @Override // defpackage.scl
    public final boolean l() {
        return this.f == 1;
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
        int i = this.f;
        return i != 0 ? i != 1 ? a.z() : a.z() : a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        int i = this.f;
        if (i == 0) {
            this.e.add(sddVar);
        } else if (i != 1) {
            this.e.add(sddVar);
        } else {
            this.e.add(sddVar);
        }
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        int i = this.f;
        if (i == 0) {
            this.e.remove(sddVar);
        } else if (i != 1) {
            this.e.remove(sddVar);
        } else {
            this.e.remove(sddVar);
        }
    }

    public final String toString() {
        int i = this.f;
        return i != 0 ? i != 1 ? String.format("QuoteCardViewModel{descriptionText=%s}", this.b) : String.format("MoreInfoViewModel{moreInfoItems=%s}", this.b) : String.format("ProviderSelectionViewModel{providerSelectionClickListener=%s}", this.c);
    }

    public jjz(int i) {
        this.f = i;
        this.d = 0;
        this.e = new HashSet();
    }

    public jjz(int i, char[] cArr) {
        this.f = i;
        this.b = sco.a;
        this.d = 0;
        this.e = new HashSet();
    }
}
