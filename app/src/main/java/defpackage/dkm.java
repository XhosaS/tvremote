package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkm implements dap {
    private final dje a = new dje();

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) {
        return this.a.c(ImageDecoder.createSource(dpw.a((InputStream) obj)), i, i2, danVar);
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ boolean b(Object obj, dan danVar) {
        return true;
    }
}
