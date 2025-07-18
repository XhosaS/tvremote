package defpackage;

import android.net.Uri;
import androidx.slice.Slice;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cxj {
    private final cxi a;
    public final cxk b;

    public cxj(Uri uri) {
        this.b = new cxk(uri);
        cxi cxiVarC = c();
        this.a = cxiVarC;
        b(cxiVarC);
    }

    public cxl a() {
        throw null;
    }

    public abstract void b(cxi cxiVar);

    protected cxi c() {
        throw null;
    }

    @Deprecated
    public final Slice d() {
        return new Slice(a().a());
    }
}
