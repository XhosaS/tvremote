package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class liv extends hvf {
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ tbk d;

    public liv(tbk tbkVar, String str, int i) {
        this.b = str;
        this.c = i;
        this.d = tbkVar;
    }

    @Override // defpackage.hvm
    public final /* bridge */ /* synthetic */ void b(Object obj, hvv hvvVar) {
        this.d.a((Bitmap) obj, this.b, this.c);
    }
}
