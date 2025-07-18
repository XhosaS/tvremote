package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public class djc implements daq {
    private final ddz a;
    private final daq b;

    public djc(ddz ddzVar, daq daqVar) {
        this.a = ddzVar;
        this.b = daqVar;
    }

    @Override // defpackage.czt
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, dan danVar) {
        return ((djd) this.b).a(new djf(((BitmapDrawable) ((ddp) obj).c()).getBitmap(), this.a), file, danVar);
    }

    @Override // defpackage.daq
    public final int b() {
        return 2;
    }
}
