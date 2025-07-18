package defpackage;

import android.media.VolumeProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyi extends VolumeProvider {
    final /* synthetic */ dyk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyi(dyk dykVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = dykVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.a.b(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.a.c(i);
    }
}
