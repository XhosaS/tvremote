package defpackage;

import android.graphics.Bitmap;
import android.graphics.Picture;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbz extends agtu implements agvb {
    final /* synthetic */ File a;
    final /* synthetic */ String b;
    final /* synthetic */ Picture c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbz(File file, String str, Picture picture, agsw agswVar) {
        super(2, agswVar);
        this.a = file;
        this.b = str;
        this.c = picture;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hbz) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.a, this.b.concat(".png")));
        try {
            Boolean boolValueOf = Boolean.valueOf(Bitmap.createBitmap(this.c).copy(Bitmap.Config.ARGB_8888, false).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream));
            aguc.a(fileOutputStream, null);
            return boolValueOf;
        } finally {
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new hbz(this.a, this.b, this.c, agswVar);
    }
}
