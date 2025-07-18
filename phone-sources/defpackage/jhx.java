package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhx extends ixi {
    public final int d;
    public final int e;
    public final irn f;

    /* JADX WARN: Illegal instructions before constructor call */
    public jhx(irn irnVar, wkx wkxVar) {
        vvd vvdVar = wuo.f;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.f = irnVar;
        this.d = R.string.user_feedback_thumbdown_toast;
        this.e = R.string.undo_dismissal;
    }

    public final void i(boolean z) {
        wll wllVar = ((wuo) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        irn irnVar = this.f;
        wllVar.getClass();
        irnVar.s(wllVar, z);
    }

    public final boolean j() {
        wkk wkkVar = ((wuo) this.b).e;
        if (wkkVar == null) {
            wkkVar = wkk.a;
        }
        return wkkVar.b == 2;
    }

    public final boolean k() {
        wll wllVar = ((wuo) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        irn irnVar = this.f;
        wllVar.getClass();
        return irnVar.q(wllVar);
    }
}
