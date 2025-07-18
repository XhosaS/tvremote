package defpackage;

import android.content.Context;
import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvp implements uje {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/user/migrations/HomeGraphDataMigration");
    public final Context b;
    private final ahbt c;

    public fvp(Context context, ahbt ahbtVar) {
        context.getClass();
        ahbtVar.getClass();
        this.b = context;
        this.c = ahbtVar;
    }

    @Override // defpackage.uje
    public final zyd a() {
        return ahkr.c(this.c, 0, new fvm(this, null), 3);
    }

    @Override // defpackage.uje
    public final /* bridge */ /* synthetic */ zyd b(MessageLite messageLite) {
        return ahkr.c(this.c, 0, new fvn((fxg) messageLite, this, null), 3);
    }

    @Override // defpackage.uje
    public final zyd c() {
        return ahkr.c(this.c, 0, new fvo(this, null), 3);
    }
}
