package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlm implements dap {
    private final dln a;

    public dlm(dln dlnVar) {
        this.a = dlnVar;
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) {
        return this.a.a(ImageDecoder.createSource(dpw.a((InputStream) obj)), i, i2, danVar);
    }

    @Override // defpackage.dap
    public final /* synthetic */ boolean b(Object obj, dan danVar) {
        dln dlnVar = this.a;
        ddx ddxVar = dlnVar.b;
        return dlnVar.b(dai.d(dlnVar.a, (InputStream) obj, ddxVar));
    }
}
