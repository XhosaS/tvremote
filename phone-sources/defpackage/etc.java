package defpackage;

import android.media.MediaCodecList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etc {
    public final int a;
    public Object b;

    public etc(bhc bhcVar, int i) {
        this.b = bhcVar;
        this.a = i;
    }

    public final void a() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    public etc(boolean z, boolean z2, boolean z3) {
        int i = 1;
        if (!z && !z2 && !z3) {
            i = 0;
        }
        this.a = i;
    }
}
