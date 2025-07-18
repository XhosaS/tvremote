package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiy extends ixi {
    public final int d;
    public final int e;
    public final irn f;

    /* JADX WARN: Illegal instructions before constructor call */
    public jiy(irn irnVar, wkx wkxVar) {
        vvd vvdVar = wuq.f;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.f = irnVar;
        this.d = R.string.user_feedback_thumbup_toast;
        this.e = R.string.undo_dismissal;
    }

    public final void i(boolean z) {
        wll wllVar = ((wuq) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        irn irnVar = this.f;
        wllVar.getClass();
        irnVar.t(wllVar, z);
    }

    public final boolean j() {
        wkk wkkVar = ((wuq) this.b).e;
        if (wkkVar == null) {
            wkkVar = wkk.a;
        }
        return wkkVar.b == 2;
    }

    public final boolean k() {
        wll wllVar = ((wuq) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        irn irnVar = this.f;
        wllVar.getClass();
        return irnVar.r(wllVar);
    }
}
