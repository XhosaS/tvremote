package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dmk implements dmo {
    private final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    @Override // defpackage.dmo
    public final ddp a(ddp ddpVar, dan danVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) ddpVar.c()).compress(this.a, 100, byteArrayOutputStream);
        ddpVar.e();
        return new dlj(byteArrayOutputStream.toByteArray());
    }
}
