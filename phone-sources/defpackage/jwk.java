package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwk implements hvb {
    final /* synthetic */ wlx a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ ylf c;
    final /* synthetic */ kuw d;

    public jwk(wlx wlxVar, kuw kuwVar, ImageView imageView, ylf ylfVar) {
        this.a = wlxVar;
        this.d = kuwVar;
        this.b = imageView;
        this.c = ylfVar;
    }

    @Override // defpackage.hvb
    public final void i(hnr hnrVar, hvm hvmVar) {
        hvmVar.getClass();
        wlx wlxVar = this.a;
        if (wlxVar != null) {
            kuw kuwVar = this.d;
            ImageView imageView = this.b;
            ylf ylfVar = this.c;
            File fileA = ((iyz) kuwVar.b).a(wlxVar);
            hvc hvcVar = (hvc) ylfVar.a;
            imageView.getClass();
            hvcVar.getClass();
            new Handler(Looper.getMainLooper()).post(new bd((Object) fileA, (Object) imageView, (Object) hvcVar, 20, (short[]) null));
        }
    }

    @Override // defpackage.hvb
    public final /* bridge */ /* synthetic */ void j(Object obj, Object obj2, int i) {
        obj2.getClass();
        if (i == 0) {
            throw null;
        }
    }
}
