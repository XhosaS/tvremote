package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qls implements qlo {
    public static final String[] a;
    public final Context b;
    public final zyg c;

    static {
        int i = lwx.a;
        a = new String[]{"service_googleone"};
    }

    public qls(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = zyn.a(executorService);
    }

    @Override // defpackage.qlo
    public final zyd a() {
        return zxn.k(wyo.i(new Callable() { // from class: qlr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str = jwk.a;
                return Arrays.asList(jwq.g(this.a.b));
            }
        }), this.c);
    }
}
