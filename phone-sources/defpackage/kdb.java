package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.videos.R;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdb extends scf implements scl {
    public sco a;
    public sco b;
    public CompoundButton.OnCheckedChangeListener c;
    public boolean d;
    public boolean e;
    public final Set f;
    private int g;

    public kdb() {
        sco scoVar = sco.a;
        this.a = scoVar;
        this.b = scoVar;
        this.e = true;
        this.g = 0;
        this.f = new HashSet();
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.notification_preference_item_layout;
    }

    @Override // defpackage.scl
    public final int b() {
        return this.g;
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
        kdb kdbVar = (kdb) scfVar;
        long j = true != yks.e(this.a, kdbVar.a) ? 1L : 0L;
        if (!yks.e(this.b, kdbVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, kdbVar.c)) {
            j |= 4;
        }
        return !yks.e(Boolean.valueOf(this.d), Boolean.valueOf(kdbVar.d)) ? j | 8 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new kda();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferenceViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        kda kdaVar = (kda) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                kdaVar.w(R.id.notification_title, this.a.a(kdaVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "notification_title", "com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferenceViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                kdaVar.w(R.id.notification_subtitle, this.b.a(kdaVar.o()), -1);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "notification_subtitle", "com.google.android.apps.googletv.app.presentation.pages.preferences.NotificationPreferenceViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.c;
            onCheckedChangeListener.getClass();
            kdaVar.a().setOnCheckedChangeListener(onCheckedChangeListener);
        }
        if (j == 0 || (j & 8) != 0) {
            kdaVar.a().setChecked(this.d);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Boolean.valueOf(this.d));
    }

    @Override // defpackage.scl
    public final void k(int i) {
        this.g = i;
    }

    @Override // defpackage.scl
    public final boolean l() {
        return false;
    }

    @Override // defpackage.scl
    public final boolean m() {
        return this.e;
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
        this.f.add(sddVar);
    }

    @Override // defpackage.scl
    public final void q(sdd sddVar) {
        this.f.remove(sddVar);
    }

    public final String toString() {
        return String.format("NotificationPreferenceViewModel{notificationTitle=%s, notificationSubtitle=%s, checkChangedListener=%s, checkboxEnabled=%s}", this.a, this.b, this.c, Boolean.valueOf(this.d));
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
