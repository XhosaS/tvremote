package defpackage;

import com.google.apps.tiktok.account.api.controller.ValidationResult;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vgs implements zvi {
    public final List a;
    public final int b;
    public final Executor c;
    public int d = -1;
    private final zvi e = wyo.c(this);

    public vgs(List list, Executor executor) {
        this.a = list;
        this.b = list.size();
        this.c = executor;
    }

    @Override // defpackage.zvi
    public final zyd a(Object obj) {
        return vga.d((ValidationResult) obj) ? zxn.h(obj) : b();
    }

    public final zyd b() {
        int i = this.d + 1;
        this.d = i;
        return i < this.b ? zuz.h((zyd) this.a.get(i), this.e, this.c) : zxy.a;
    }
}
