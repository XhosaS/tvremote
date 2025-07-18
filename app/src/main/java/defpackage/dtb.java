package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dtb extends dxg implements dwg {
    private final AtomicInteger d;

    public dtb(int i) {
        super(i);
        this.d = new AtomicInteger(0);
    }

    @Override // defpackage.elw
    public final Object a(Context context, elz elzVar) {
        Object objA;
        synchronized (this) {
            objA = this.b.a();
            this.c = Math.max(0, this.c - 1);
        }
        if (objA != null) {
            return objA;
        }
        this.d.incrementAndGet();
        return elzVar.w(context);
    }
}
