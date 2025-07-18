package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjl implements rjk {
    public static final String[] a;
    public final Context b;
    public final uhs c;

    static {
        int i = opb.a;
        a = new String[]{"service_googleone"};
    }

    public rjl(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = sfy.v(executorService);
    }

    @Override // defpackage.rjk
    public final uhp a() {
        return szg.k(new rjs(this, 1), this.c);
    }

    @Override // defpackage.rjk
    public final uhp b() {
        return szg.k(new eet(this, 19), this.c);
    }
}
