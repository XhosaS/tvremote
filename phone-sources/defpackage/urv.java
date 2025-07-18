package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urv {
    public Context a;
    public osk b;
    private final String c;
    private int d = -1;
    private final int e;
    private final int f;

    public urv(int i, int i2, String str) {
        this.e = i;
        this.f = i2;
        this.c = str;
    }

    public static urv c() {
        sij.o(true, "Must provide non-empty subdirectory for resource pool");
        return new urv(2, 2, "persistent_resource_pool_v182486883" + File.separator + "GrpcClientResourcePool");
    }

    public final urx a() {
        this.a.getClass();
        int i = this.e;
        if (i - 1 == 0) {
            return new urm(i, this.d);
        }
        Context context = this.a;
        return new urq(context, new uru(this.f, context, this.c), i, this.d);
    }

    public final void b(int i) {
        sij.o(i > 0, "Max size must be greater than zero");
        this.d = i;
    }
}
