package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uvi extends uvf {
    final /* synthetic */ uvc a;
    final /* synthetic */ uvl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvi(uvo[] uvoVarArr, uvc uvcVar, uvl uvlVar) {
        super(uvoVarArr);
        this.a = uvcVar;
        this.b = uvlVar;
    }

    @Override // defpackage.uvf, defpackage.uvo
    public final djg h(int i, int i2, Bitmap.Config config) {
        uvl uvlVar = this.b;
        int i3 = uvlVar.b * i;
        uvc uvcVar = this.a;
        float f = uvcVar.l;
        int iRound = Math.round(uvcVar.a(i3 / f));
        int iRound2 = Math.round(uvcVar.a((uvlVar.d * i) / f));
        int iMin = Math.min(iRound, iRound2);
        float f2 = uvlVar.c * i2;
        float f3 = uvcVar.m;
        return new uvh(this, uvcVar, new Rect(iMin, Math.round(f2 / f3), Math.max(iRound, iRound2), Math.round((uvlVar.e * i2) / f3)), i, i2, config);
    }
}
