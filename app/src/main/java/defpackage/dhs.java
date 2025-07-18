package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhs implements dhf {
    private final Context a;

    public dhs(Context context) {
        this.a = context;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dhu(this.a, dhnVar.a(Integer.class, AssetFileDescriptor.class));
    }
}
