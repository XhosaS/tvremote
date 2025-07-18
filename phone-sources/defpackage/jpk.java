package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpk extends scf implements scl {
    public Object a;
    public Object b;
    public vuc c;
    public Object d;
    private final yfo e;
    private int f;
    private final Set g;
    private final /* synthetic */ int h;

    public jpk(yfo yfoVar, int i, byte[] bArr) {
        this.h = i;
        this.a = sco.a;
        this.f = 0;
        this.g = new HashSet();
        this.e = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        int i = this.h;
        return i != 0 ? i != 1 ? R.layout.info_message_view_layout : R.layout.title_layout_view : R.layout.greeting_view_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        int i = this.h;
        return i != 0 ? i != 1 ? this.f : this.f : this.f;
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
        long j;
        int i = this.h;
        if (i == 0) {
            jpk jpkVar = (jpk) scfVar;
            j = true == yks.e(this.c, jpkVar.c) ? 0L : 1L;
            return !yks.e(this.d, jpkVar.d) ? 2 | j : j;
        }
        if (i != 1) {
            jpk jpkVar2 = (jpk) scfVar;
            j = true == yks.e(this.c, jpkVar2.c) ? 0L : 1L;
            return !yks.e(this.a, jpkVar2.a) ? 2 | j : j;
        }
        jpk jpkVar3 = (jpk) scfVar;
        j = true == yks.e(this.c, jpkVar3.c) ? 0L : 1L;
        if (!yks.e(this.a, jpkVar3.a)) {
            j |= 2;
        }
        if (!yks.e(this.b, jpkVar3.b)) {
            j |= 4;
        }
        return !yks.e(this.d, jpkVar3.d) ? 8 | j : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        int i = this.h;
        return i != 0 ? i != 1 ? new jpw() : (sca) this.e.b() : new jpj();
    }

    @Override // defpackage.scf
    public final String g() {
        int i = this.h;
        return i != 0 ? i != 1 ? "com.google.android.apps.googletv.app.presentation.components.infomessage.InfoMessageViewBindable" : "com.google.android.apps.googletv.app.presentation.components.entitymenu.title.EntityMenuTitleViewBindable" : "com.google.android.apps.googletv.app.presentation.components.highlights.greeting.GreetingViewBindable";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        int i = this.h;
        if (i == 0) {
            jpj jpjVar = (jpj) scaVar;
            if (j == 0 || (j & 1) != 0) {
                jwq.j(jpjVar, (wls) this.c, R.id.title, 8);
            }
            if (j == 0 || (j & 2) != 0) {
                jwq.j(jpjVar, (wls) this.d, R.id.subtitle, 8);
                return;
            }
            return;
        }
        if (i != 1) {
            jpw jpwVar = (jpw) scaVar;
            if (j == 0 || (j & 1) != 0) {
                jwq.j(jpwVar, (wls) this.c, R.id.info_message_text, -1);
            }
            if (j == 0 || (j & 2) != 0) {
                try {
                    jpwVar.r(R.id.info_message_component, this.a);
                    return;
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "info_message_component", "com.google.android.apps.googletv.app.presentation.components.infomessage.InfoMessageViewBindable"));
                }
            }
            return;
        }
        jnn jnnVar = (jnn) scaVar;
        if (j == 0 || (j & 1) != 0) {
            jnnVar.a.t(jnnVar, (wlx) this.c, R.id.poster, -1, -1, false, false, false);
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                jnnVar.w(R.id.title, ((sco) this.a).a(jnnVar.o()), -1);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.entitymenu.title.EntityMenuTitleViewBindable"));
            }
        }
        if (j == 0 || (j & 4) != 0) {
            jwq.af(jnnVar, (wla) this.b);
        }
        if (j == 0 || (j & 8) != 0) {
            jwq.j(jnnVar, (wls) this.d, R.id.subtitle, 8);
        }
    }

    public final int hashCode() {
        int i = this.h;
        return i != 0 ? i != 1 ? Objects.hash(this.c, this.a) : Objects.hash(this.c, this.a, this.b, this.d) : Objects.hash(this.c, this.d);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, scg] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, scg] */
    @Override // defpackage.scf
    public final void i(View view) {
        ?? r0;
        int i = this.h;
        if (i != 0) {
            if (i == 1 || (r0 = this.b) == 0) {
                return;
            }
            r0.a(this, view);
            return;
        }
        ?? r02 = this.a;
        if (r02 != 0) {
            r02.a(this, view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, sck] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sck] */
    @Override // defpackage.scf
    public final void j(View view) {
        ?? r0;
        int i = this.h;
        if (i != 0) {
            if (i == 1 || (r0 = this.d) == 0) {
                return;
            }
            r0.a(this, view);
            return;
        }
        ?? r02 = this.b;
        if (r02 != 0) {
            r02.a(this, view);
        }
    }

    @Override // defpackage.scl
    public final void k(int i) {
        if (this.h != 0) {
            this.f = i;
        } else {
            this.f = i;
        }
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
        int i = this.h;
        return i != 0 ? i != 1 ? a.z() : a.z() : a.z();
    }

    @Override // defpackage.scl
    public final void p(sdd sddVar) {
        int i = this.h;
        if (i == 0) {
            this.g.add(sddVar);
        } else if (i != 1) {
            this.g.add(sddVar);
        } else {
            this.g.add(sddVar);
        }
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        int i = this.h;
        if (i == 0) {
            this.g.remove(sddVar);
        } else if (i != 1) {
            this.g.remove(sddVar);
        } else {
            this.g.remove(sddVar);
        }
    }

    public final String toString() {
        int i = this.h;
        return i != 0 ? i != 1 ? String.format("InfoMessageViewModel{text=%s, onClickListener=%s}", this.c, this.a) : String.format("EntityMenuTitleViewModel{poster=%s, title=%s, contentRating=%s, statText=%s}", this.c, this.a, this.b, this.d) : String.format("GreetingViewModel{title=%s, subtitle=%s}", this.c, this.d);
    }

    public jpk(yfo yfoVar, int i) {
        this.h = i;
        this.f = 0;
        this.g = new HashSet();
        this.e = yfoVar;
    }

    public jpk(yfo yfoVar, int i, char[] cArr) {
        this.h = i;
        this.f = 0;
        this.g = new HashSet();
        this.e = yfoVar;
    }
}
