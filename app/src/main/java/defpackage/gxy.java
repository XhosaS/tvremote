package defpackage;

import android.content.Context;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gxy implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ gxy(Context context) {
        this.a = context;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a.getFilesDir();
    }
}
