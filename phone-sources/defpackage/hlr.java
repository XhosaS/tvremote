package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hlr implements hlu {
    private final String a;
    private final AssetManager b;
    private Object c;

    public hlr(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // defpackage.hlu
    public final void d() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            e(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void e(Object obj);

    @Override // defpackage.hlu
    public final void f(hjw hjwVar, hlt hltVar) {
        try {
            Object objB = b(this.b, this.a);
            this.c = objB;
            hltVar.b(objB);
        } catch (IOException e) {
            hltVar.e(e);
        }
    }

    @Override // defpackage.hlu
    public final int g() {
        return 1;
    }

    @Override // defpackage.hlu
    public final void dL() {
    }
}
