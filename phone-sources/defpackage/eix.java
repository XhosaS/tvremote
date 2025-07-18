package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eix implements fbu, fck, ejz {
    private fbu a;
    private fck b;
    private fbu c;
    private fck d;

    @Override // defpackage.fck
    public final void a(long j, float[] fArr) {
        fck fckVar = this.d;
        if (fckVar != null) {
            fckVar.a(j, fArr);
        }
        fck fckVar2 = this.b;
        if (fckVar2 != null) {
            fckVar2.a(j, fArr);
        }
    }

    @Override // defpackage.fck
    public final void b() {
        fck fckVar = this.d;
        if (fckVar != null) {
            fckVar.b();
        }
        fck fckVar2 = this.b;
        if (fckVar2 != null) {
            fckVar2.b();
        }
    }

    @Override // defpackage.fbu
    public final void c(long j, long j2, dze dzeVar, MediaFormat mediaFormat) {
        long j3;
        long j4;
        dze dzeVar2;
        MediaFormat mediaFormat2;
        fbu fbuVar = this.c;
        if (fbuVar != null) {
            fbuVar.c(j, j2, dzeVar, mediaFormat);
            mediaFormat2 = mediaFormat;
            dzeVar2 = dzeVar;
            j4 = j2;
            j3 = j;
        } else {
            j3 = j;
            j4 = j2;
            dzeVar2 = dzeVar;
            mediaFormat2 = mediaFormat;
        }
        fbu fbuVar2 = this.a;
        if (fbuVar2 != null) {
            fbuVar2.c(j3, j4, dzeVar2, mediaFormat2);
        }
    }

    @Override // defpackage.ejz
    public final void s(int i, Object obj) {
        if (i == 7) {
            this.a = (fbu) obj;
            return;
        }
        if (i == 8) {
            this.b = (fck) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        fcs fcsVar = (fcs) obj;
        if (fcsVar == null) {
            this.c = null;
            this.d = null;
        } else {
            fcq fcqVar = fcsVar.c;
            this.c = fcqVar;
            this.d = fcqVar;
        }
    }
}
