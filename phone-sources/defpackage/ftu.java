package defpackage;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftu {
    public final eu a;
    public dyk b;
    public final /* synthetic */ ftw c;

    public ftu(ftw ftwVar, eu euVar) {
        this.c = ftwVar;
        this.a = euVar;
    }

    final void a() {
        int i = this.c.l.d;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((en) this.a.c).a.setPlaybackToLocal(builder.build());
        this.b = null;
    }
}
