package defpackage;

import androidx.media3.exoplayer.drm.ExoMediaDrm;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eoq implements epi {
    final /* synthetic */ eou a;

    public eoq(eou eouVar) {
        this.a = eouVar;
    }

    @Override // defpackage.epi
    public final void ef(ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        eor eorVar = this.a.j;
        eorVar.getClass();
        eorVar.obtainMessage(i, bArr).sendToTarget();
    }
}
