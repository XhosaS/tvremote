package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayd extends axh {
    long l;
    final long m = Long.MIN_VALUE;
    final long n = Long.MAX_VALUE;

    @Override // defpackage.axh
    public final void a(Bundle bundle, String str) {
        this.l = bundle.getLong(str, this.l);
    }

    @Override // defpackage.axh
    public final void b(Bundle bundle, String str) {
        bundle.putLong(str, this.l);
    }
}
