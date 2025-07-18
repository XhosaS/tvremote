package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lky extends lkx implements lkc {
    private final Activity a;

    public lky(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.lkx, defpackage.lkr
    public final void onPlayerStateChanged(int i, llt lltVar, int i2) {
        if (i == 5) {
            this.a.finish();
        }
    }

    @Override // defpackage.lkc
    public final void b() {
    }

    @Override // defpackage.lkc
    public final void c() {
    }

    @Override // defpackage.lkc
    public final void e() {
    }

    @Override // defpackage.lkc
    public final void f() {
    }

    @Override // defpackage.lkc
    public final void g() {
    }

    @Override // defpackage.lob
    public final void onControlsHidden() {
    }

    @Override // defpackage.lob
    public final void onControlsShown() {
    }

    @Override // defpackage.loc
    public final void r() {
    }

    @Override // defpackage.lkc
    public final void a(ViewGroup viewGroup) {
    }

    @Override // defpackage.loc
    public final void s(int i) {
    }

    @Override // defpackage.loc
    public final void t(int i, int i2, boolean z) {
    }
}
