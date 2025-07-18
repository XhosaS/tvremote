package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmk extends ixi {
    public final int d;
    public final isr e;

    /* JADX WARN: Illegal instructions before constructor call */
    public jmk(isr isrVar, wkx wkxVar) {
        vvd vvdVar = wvf.f;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.e = isrVar;
        this.d = R.string.user_feedback_marked_as_watched;
    }

    public final boolean i() {
        wkk wkkVar = ((wvf) this.b).e;
        if (wkkVar == null) {
            wkkVar = wkk.a;
        }
        return wkkVar.b == 2;
    }

    public final boolean j() {
        wll wllVar = ((wvf) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        isr isrVar = this.e;
        wllVar.getClass();
        return isrVar.q(wllVar);
    }
}
