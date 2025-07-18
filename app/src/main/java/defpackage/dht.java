package defpackage;

import android.content.Context;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dht implements dhf {
    private final Context a;

    public dht(Context context) {
        this.a = context;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dhu(this.a, dhnVar.a(Integer.class, InputStream.class));
    }
}
