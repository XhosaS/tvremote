package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfd extends scf {
    public sco a;
    public sco b;
    public wlx c;
    public wlx d;
    public boolean e;
    public Boolean f;
    public boolean g;
    public View.OnClickListener h;
    public CharSequence i;
    public boolean j;
    private final yfo k;
    private boolean l;

    public jfd(yfo yfoVar) {
        sco scoVar = sco.a;
        this.a = scoVar;
        this.b = scoVar;
        this.k = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.channel_header_layout;
    }

    public final void b(boolean z) {
        if (yks.e(Boolean.valueOf(this.l), Boolean.valueOf(z))) {
            return;
        }
        this.l = z;
        G(4);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jfd jfdVar = (jfd) scfVar;
        long j = true != yks.e(this.a, jfdVar.a) ? 1L : 0L;
        if (!yks.e(this.b, jfdVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, jfdVar.c)) {
            j |= 4;
        }
        if (!yks.e(this.d, jfdVar.d)) {
            j |= 8;
        }
        if (!yks.e(Boolean.valueOf(this.l), Boolean.valueOf(jfdVar.l))) {
            j |= 16;
        }
        if (!yks.e(Boolean.valueOf(this.e), Boolean.valueOf(jfdVar.e))) {
            j |= 32;
        }
        if (!yks.e(this.f, jfdVar.f)) {
            j |= 64;
        }
        if (!yks.e(Boolean.valueOf(this.g), Boolean.valueOf(jfdVar.g))) {
            j |= 128;
        }
        if (!yks.e(false, false)) {
            j |= 256;
        }
        if (!yks.e(this.h, jfdVar.h)) {
            j |= 512;
        }
        if (!yks.e(null, null)) {
            j |= 1024;
        }
        if (!yks.e(this.i, jfdVar.i)) {
            j |= 2048;
        }
        return !yks.e(Boolean.valueOf(this.j), Boolean.valueOf(jfdVar.j)) ? j | 4096 : j;
    }

    @Override // defpackage.scf
    protected final /* bridge */ /* synthetic */ sca f() {
        return (sca) this.k.b();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable";
    }

    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        long j2;
        ?? r2;
        int i;
        int i2;
        jfc jfcVar = (jfc) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                jfcVar.w(R.id.channel_header_title, this.a.a(jfcVar.o()), 8);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "channel_header_title", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                jfcVar.w(R.id.channel_header_subtitle, this.b.a(jfcVar.o()), 8);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "channel_header_subtitle", "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable"));
            }
        }
        if (j == 0 || (j & 4) != 0) {
            j2 = 0;
            r2 = 1;
            i = 8;
            i2 = 0;
            jfcVar.h.t(jfcVar, this.c, R.id.channel_header_icon, -1, 8, true, false, false);
        } else {
            j2 = 0;
            i = 8;
            r2 = 1;
            i2 = 0;
        }
        if (j == 0 || (j & 8) != j2) {
            jfcVar.i.t(jfcVar, this.d, R.id.tvm_logo_image, -1, 8, false, false, false);
        }
        LinearLayout linearLayout = null;
        if (j == 0 || (j & 16) != j2) {
            boolean z = this.l;
            ImageView imageView = jfcVar.e;
            if (imageView == null) {
                yks.c("channelHeaderArrowImage");
                imageView = null;
            }
            imageView.setVisibility(r2 != z ? i : i2);
        }
        if (j == 0 || (j & 32) != j2) {
            jfcVar.a().setVisibility(r2 != this.e ? i : i2);
        }
        if ((j == 0 || (j & 64) != j2) && yks.e(this.f, Boolean.valueOf((boolean) r2))) {
            View viewA = jfcVar.a();
            MaterialButton materialButton = viewA instanceof MaterialButton ? (MaterialButton) viewA : null;
            if (materialButton != null) {
                materialButton.setBackgroundColor(jfc.a);
                materialButton.n(ColorStateList.valueOf(jfc.b));
            }
        }
        if ((j == 0 || (j & 128) != j2) && this.g) {
            View view = jfcVar.g;
            if (view == null) {
                yks.c("minHeightController");
                view = null;
            }
            view.setMinimumHeight(i2);
        }
        if (j == 0 || (j & 256) != j2) {
            ImageView imageView2 = jfcVar.c;
            if (imageView2 == null) {
                yks.c("channelHeaderRefreshImage");
                imageView2 = null;
            }
            imageView2.setVisibility(i);
        }
        if (j == 0 || (j & 512) != j2) {
            try {
                jfcVar.r(R.id.channel_header_view, this.h);
            } catch (scr unused3) {
                Object[] objArr = new Object[2];
                objArr[i2] = "channel_header_view";
                objArr[r2] = "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr));
            }
        }
        if (j == 0 || (j & 1024) != j2) {
            try {
                jfcVar.r(R.id.channel_refresh_img, null);
            } catch (scr unused4) {
                Object[] objArr2 = new Object[2];
                objArr2[i2] = "channel_refresh_img";
                objArr2[r2] = "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr2));
            }
        }
        if (j == 0 || (j & 2048) != j2) {
            try {
                jfcVar.s(R.id.channel_header_view, this.i);
            } catch (scr unused5) {
                Object[] objArr3 = new Object[2];
                objArr3[i2] = "channel_header_view";
                objArr3[r2] = "com.google.android.apps.googletv.app.presentation.components.channel.ChannelHeaderViewBindable";
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", objArr3));
            }
        }
        if ((j == 0 || (j & 4096) != j2) && this.j) {
            LinearLayout linearLayout2 = jfcVar.d;
            if (linearLayout2 == null) {
                yks.c("channelHeaderInfo");
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.setPadding(linearLayout.getPaddingLeft(), jfcVar.o().getResources().getDimensionPixelSize(R.dimen.channel_header_info_top_padding), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Boolean.valueOf(this.l), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), false, this.h, null, this.i, Boolean.valueOf(this.j));
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ChannelHeaderViewModel{title=%s, subtitle=%s, icon=%s, logoImage=%s, showArrowImage=%s, showArrowImageBc25=%s, enhancedClusterArrowImageBc25=%s, hideMinHeightController=%s, showRefreshImage=%s, onClickListener=%s, refreshOnClickListener=%s, contentDescription=%s, topPaddingToChannelHeaderInfo=%s}", this.a, this.b, this.c, this.d, Boolean.valueOf(this.l), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), false, this.h, null, this.i, Boolean.valueOf(this.j));
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
