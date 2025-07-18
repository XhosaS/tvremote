package defpackage;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dll implements dap {
    private final dln a;

    public dll(dln dlnVar) {
        this.a = dlnVar;
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) {
        return this.a.a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, danVar);
    }

    @Override // defpackage.dap
    public final /* synthetic */ boolean b(Object obj, dan danVar) {
        dln dlnVar = this.a;
        return dlnVar.b(dai.c(dlnVar.a, (ByteBuffer) obj));
    }
}
