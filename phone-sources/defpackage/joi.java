package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joi extends scf {
    public scg a;
    public sck b;
    public wls c;
    public sco d = sco.a;
    public wlx e;
    public boolean f;
    private final yfo g;

    public joi(yfo yfoVar) {
        this.g = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.generic_sharing_content_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        joi joiVar = (joi) scfVar;
        long j = true != yks.e(this.c, joiVar.c) ? 1L : 0L;
        if (!yks.e(this.d, joiVar.d)) {
            j |= 2;
        }
        if (!yks.e(this.e, joiVar.e)) {
            j |= 4;
        }
        if (!yks.e(null, null)) {
            j |= 8;
        }
        return !yks.e(Boolean.valueOf(this.f), Boolean.valueOf(joiVar.f)) ? j | 16 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.g.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.genericsharingcontent.GenericSharingContentViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        long j2;
        int i;
        int i2;
        joh johVar = (joh) scaVar;
        int i3 = 8;
        if (j == 0 || (j & 1) != 0) {
            jwq.j(johVar, this.c, R.id.title, 8);
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                johVar.w(R.id.subtitle, this.d.a(johVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.genericsharingcontent.GenericSharingContentViewBindable"));
            }
        }
        if (j == 0 || (j & 4) != 0) {
            j2 = 0;
            i = 0;
            i2 = 2;
            johVar.d.t(johVar, this.e, R.id.primary_image, -1, 8, false, false, false);
        } else {
            j2 = 0;
            i2 = 2;
            i = 0;
        }
        TextView textView = null;
        if (j == 0 || (j & 8) != j2) {
            try {
                johVar.r(R.id.generic_sharing_content_component, null);
            } catch (scr unused2) {
                Object[] objArr = new Object[i2];
                objArr[i] = "generic_sharing_content_component";
                objArr[1] = "com.google.android.apps.googletv.app.presentation.components.genericsharingcontent.GenericSharingContentViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr));
            }
        }
        if (j == 0 || (j & 16) != j2) {
            boolean z = this.f;
            View view = johVar.a;
            if (view == null) {
                yks.c("imageBoundingCard");
                view = null;
            }
            if (z) {
                i3 = i;
            } else {
                TextView textView2 = johVar.b;
                if (textView2 == null) {
                    yks.c("titleView");
                    textView2 = null;
                }
                textView2.setPadding(i, i, i, i);
                TextView textView3 = johVar.c;
                if (textView3 == null) {
                    yks.c("subTitleView");
                } else {
                    textView = textView3;
                }
                textView.setPadding(i, i, i, i);
            }
            view.setVisibility(i3);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d, this.e, null, Boolean.valueOf(this.f));
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

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("GenericSharingContentViewModel{title=%s, subtitle=%s, image=%s, clickListener=%s, imageBoundingCardVisibility=%s}", this.c, this.d, this.e, null, Boolean.valueOf(this.f));
    }
}
